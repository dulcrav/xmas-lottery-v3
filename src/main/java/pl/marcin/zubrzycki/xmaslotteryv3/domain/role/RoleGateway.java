package pl.marcin.zubrzycki.xmaslotteryv3.domain.role;

import java.util.Collection;
import java.util.Optional;

public interface RoleGateway {
    Optional<Role> findByName(RoleEnum name);

    Collection<Role> findAll();
}
