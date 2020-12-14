package pl.marcin.zubrzycki.xmaslotteryv3.gateway.role;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.role.Role;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.role.RoleEnum;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleEnum name);
}
