package pl.marcin.zubrzycki.xmaslotteryv3.gateway.user;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.User;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.UserGateway;

import java.util.List;
import java.util.Optional;

@Service
public class UserDbGateway implements UserGateway {
    private final UserRepository repository;

    public UserDbGateway(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Boolean existsByUsername(String username) {
        return repository.existsByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return repository.findAll();
    }
}
