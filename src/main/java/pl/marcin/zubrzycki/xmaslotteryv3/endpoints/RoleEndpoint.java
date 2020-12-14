package pl.marcin.zubrzycki.xmaslotteryv3.endpoints;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.role.Role;
import pl.marcin.zubrzycki.xmaslotteryv3.usecase.role.GetRole;

import java.util.Collection;

@RestController
@RequestMapping("/xmas/api/role")
public class RoleEndpoint {
    private final GetRole getRole;

    public RoleEndpoint(GetRole getRole) {
        this.getRole = getRole;
    }

    @GetMapping
    public ResponseEntity<Role> findRole(@RequestParam String name) {
        Role role = getRole.execute(name);
        return ResponseEntity.ok().body(role);
    }

    @GetMapping("/all")
    public ResponseEntity<Collection<Role>> findAllRoles() {
        Collection<Role> roles = getRole.getAll();
        return ResponseEntity.ok().body(roles);
    }
}
