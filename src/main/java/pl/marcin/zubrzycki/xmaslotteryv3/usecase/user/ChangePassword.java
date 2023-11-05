package pl.marcin.zubrzycki.xmaslotteryv3.usecase.user;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.UserGateway;
import pl.marcin.zubrzycki.xmaslotteryv3.endpoints.user.dto.ChangePasswordDto;

@Service
public class ChangePassword {
    private final UserGateway userGateway;

    public ChangePassword(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public void execute(Long id, ChangePasswordDto changePasswordDto) {
        userGateway.changePassword(id, changePasswordDto.getPassword());
    }
}
