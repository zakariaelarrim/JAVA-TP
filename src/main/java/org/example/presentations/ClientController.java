package org.example.presentations;

import org.example.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.example.services.IClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private IClientService service;
    @PostMapping("/add")
    public Client save(@RequestBody Client clt) {
        return service.save(clt);
    }
    @PutMapping("/update")
    public Client modify(@RequestBody Client clt) {

        return service.modify(clt);
    }
    @DeleteMapping("/delete/{idClt}")
    public void remove(@PathVariable long idClt) {

        service.remove(idClt);
    }
    @GetMapping("/getClient/{idClt}")
    public Client getOne(@PathVariable long idClt) {

        return service.getOne(idClt);
    }
    @GetMapping("/getAll")
    public List<Client> getAll() {

        return service.getAll();
    }
    public  List<Client> findByName(String name){
        return (List<Client>) service.findByName(name);
    }
    public ClientController(){
        System.out.println("Client Controller");
    }
}
