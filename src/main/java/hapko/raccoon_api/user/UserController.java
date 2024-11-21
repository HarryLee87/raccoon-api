package hapko.raccoon_api.user;

import hapko.raccoon_api.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static hapko.raccoon_api.constants.RaccoonApiConstants.EndPointPath.USERS;

@RestController
@RequestMapping(USERS)
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
