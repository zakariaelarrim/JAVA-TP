package cigma.controllers;
import cigma.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ClientController {
    @Autowired
    private RestTemplate restTemplate ;
    @Value("${api.url}")
    public String url;
    @GetMapping(value = {"/", "/clients"})
    public String home(Model model){
        List<Client> clients = restTemplate.getForObject(url+"clients/getAll",List.class);
        model.addAttribute("clients",clients);
        Client client = (Client) model.getAttribute("client");
        if (client == null){
            model.addAttribute("client",new Client());
        }
        return  "index";
    }
    @PostMapping("/addClient")
    public String addClient(Model model,@ModelAttribute("client") Client client){
        restTemplate.postForObject(url+"clients/add", client,Client.class);
       return "redirect:/clients";
    }
    @GetMapping(value = {"/deleteClient/{id}"})
    public String deleteClientById(
            Model model, @PathVariable long id) {
        restTemplate.delete(url+"/clients/delete/"+id);
        return "redirect:/clients";
    }
    @GetMapping(value = {"/show-client/{id}"})
    public String showClient(Model model, @PathVariable long id, RedirectAttributes redirectAttrs) {
        Client client = restTemplate.getForObject(url+"/clients/getClient/"+id, Client.class);
        redirectAttrs.addFlashAttribute ("client",client);
        return "redirect:/clients";
    }
    @GetMapping(value = {"/logout"})
    public String logout(Model model) {
        return "redirect:/clients";
    }
}
