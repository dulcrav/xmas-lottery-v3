package pl.marcin.zubrzycki.xmaslotteryv3.domain.user;

import java.util.List;
import java.util.Optional;

public interface UserGateway {
    Optional<User> findByUsername(String username);

    Optional<User> findById(Long id);

    Boolean existsByUsername(String username);

    List<User> findAllUsers();
}
