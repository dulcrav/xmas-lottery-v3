package pl.marcin.zubrzycki.xmaslotteryv3.gateway.user;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);
}
