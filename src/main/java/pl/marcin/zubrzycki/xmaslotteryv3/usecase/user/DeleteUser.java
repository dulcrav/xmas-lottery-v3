package pl.marcin.zubrzycki.xmaslotteryv3.usecase.user;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.gateway.user.UserRepository;

@Service
public class DeleteUser {
    private final UserRepository userRepository;

    public DeleteUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(Long id) {
        userRepository.deleteById(id);
    }
}
