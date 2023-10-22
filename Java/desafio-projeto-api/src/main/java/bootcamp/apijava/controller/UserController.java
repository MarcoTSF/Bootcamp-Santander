package bootcamp.apijava.controller;

import bootcamp.apijava.domain.model.User;
import bootcamp.apijava.service.UserService;
import jakarta.xml.bind.ValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping()
    public ResponseEntity<List<User>> findUsers(){
        return ResponseEntity.ok(userService.getUsers());
    }

    @PostMapping
    public ResponseEntity<User> createdUser(@RequestBody User user){
        User userPost = userService.createUser(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userPost.getId())
                .toUri();
        return ResponseEntity.created(location).body(userPost);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user){
        User userUpdate = userService.updateUser(id, user);

        return ResponseEntity.ok(userUpdate);
    }

}
