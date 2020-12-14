package pl.marcin.zubrzycki.xmaslotteryv3.domain.user;

import java.util.Optional;

public interface UserGateway {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);
}
