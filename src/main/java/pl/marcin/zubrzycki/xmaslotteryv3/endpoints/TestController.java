package pl.marcin.zubrzycki.xmaslotteryv3.endpoints;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.User;
import pl.marcin.zubrzycki.xmaslotteryv3.usecase.user.GetUsers;

import java.util.List;

@RestController
@RequestMapping("/api/xmas/test")
@CrossOrigin
public class TestController {
    private final GetUsers getUsers;

    public TestController(GetUsers getUsers) {
        this.getUsers = getUsers;
    }

    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public String userAccess() {
        return "User Content.";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public List<User> adminAccess() {
        return getUsers.execute();
    }
}
