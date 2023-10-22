package bootcamp.apijava.service.impl;

import bootcamp.apijava.domain.model.User;
import bootcamp.apijava.domain.repository.UserRepository;
import bootcamp.apijava.service.UserService;
import jakarta.xml.bind.ValidationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User createUser(User user) {
        if(user.getId() != null && userRepository.existsById(user.getId())){
            throw new IllegalArgumentException("User already exists");
        } else if(userRepository.existsByAccountNumber(user.getAccount().getNumber())){
            throw new IllegalArgumentException("Account number already exists");
        }
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        User user = userRepository.findById(id).orElseThrow(NoSuchElementException::new);
        if(user != null) {
            userRepository.deleteById(id);
        }
    }

    @Override
    public User updateUser(Long id, User user) {
        User userExists = userRepository.findById(id).orElseThrow(NoSuchElementException::new);

        if(userExists != null) {
            userExists.setName(user.getName());
            userExists.setAccount(user.getAccount());

            userRepository.save(userExists);

        }

        return userExists;
    }

}
