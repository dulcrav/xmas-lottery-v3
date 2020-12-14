package pl.marcin.zubrzycki.xmaslotteryv3.usecase.role;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.role.Role;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.role.RoleEnum;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.role.RoleGateway;

import java.util.Collection;

@Service
public class GetRole {
    private final RoleGateway roleGateway;

    public GetRole(RoleGateway roleGateway) {
        this.roleGateway = roleGateway;
    }

    public Role execute(String name) {
        return roleGateway.findByName(RoleEnum.valueOf(name)).orElse(null);
    }

    public Collection<Role> getAll() {
        return roleGateway.findAll();
    }

}
