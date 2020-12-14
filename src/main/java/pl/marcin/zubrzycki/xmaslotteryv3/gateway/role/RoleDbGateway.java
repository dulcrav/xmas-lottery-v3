package pl.marcin.zubrzycki.xmaslotteryv3.gateway.role;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.role.Role;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.role.RoleEnum;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.role.RoleGateway;

import java.util.Collection;
import java.util.Optional;

@Service
public class RoleDbGateway implements RoleGateway {
    private final RoleRepository repository;

    public RoleDbGateway(RoleRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Role> findByName(RoleEnum name) {
        return repository.findByName(name);
    }

    @Override
    public Collection<Role> findAll() {
        return repository.findAll();
    }
}
