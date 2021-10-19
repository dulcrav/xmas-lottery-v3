package pl.marcin.zubrzycki.xmaslotteryv3.usecase.user;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.User;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.UserGateway;

@Service
public class GetUser {
    private final UserGateway userGateway;

    public GetUser(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User byId(Long id) {
        return userGateway.findById(id).orElse(null);
    }

    public User byUsername(String username) {
        return userGateway.findByUsername(username).orElse(null);
    }
}
