package br.com.guilherme.comissiondeal.control;
import br.com.guilherme.comissiondeal.model.User;
import br.com.guilherme.comissiondeal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    private ResponseEntity postUser(@Valid @RequestBody User user){
        userRepository.save(user);
        return ResponseEntity.status(200).build();
    }

    @GetMapping
    private ResponseEntity getUsers(){
        List<User> userList = userRepository.findAll();
        if(userList.isEmpty()){
            return ResponseEntity.status(201).build();
        }else{
            return ResponseEntity.status(200).body(userList);
        }
    }

    @GetMapping("/{id}")
    private ResponseEntity getUser(@PathVariable Long id){
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return ResponseEntity.status(200).body(user);
        }else{
            return ResponseEntity.status(201).build();
        }
    }

}
