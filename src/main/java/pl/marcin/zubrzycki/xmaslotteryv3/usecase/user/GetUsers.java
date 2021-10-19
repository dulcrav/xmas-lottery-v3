package pl.marcin.zubrzycki.xmaslotteryv3.usecase.user;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.User;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.UserGateway;

import java.util.List;

@Service
public class GetUsers {
    private final UserGateway userGateway;

    public GetUsers(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public List<User> execute() {
        return userGateway.findAllUsers();
    }
}
