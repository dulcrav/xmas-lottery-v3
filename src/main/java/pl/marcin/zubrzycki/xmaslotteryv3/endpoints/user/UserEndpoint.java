package pl.marcin.zubrzycki.xmaslotteryv3.endpoints.user;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pl.marcin.zubrzycki.xmaslotteryv3.endpoints.user.dto.ChangePasswordDto;
import pl.marcin.zubrzycki.xmaslotteryv3.usecase.lottery.ClearLots;
import pl.marcin.zubrzycki.xmaslotteryv3.usecase.user.ChangePassword;
import pl.marcin.zubrzycki.xmaslotteryv3.usecase.user.DeleteUser;
import pl.marcin.zubrzycki.xmaslotteryv3.usecase.wish.DeleteWish;

@RestController
@RequestMapping("/api/xmas/user")
@CrossOrigin
public class UserEndpoint {

    private final DeleteUser deleteUser;
    private final ClearLots clearLots;
    private final DeleteWish deleteWish;
    private final ChangePassword changePassword;

    public UserEndpoint(DeleteUser deleteUser, ClearLots clearLots, DeleteWish deleteWish, ChangePassword changePassword) {
        this.deleteUser = deleteUser;
        this.clearLots = clearLots;
        this.deleteWish = deleteWish;
        this.changePassword = changePassword;
    }

    @DeleteMapping("/delete")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> deleteUser(@RequestParam Long userId) {
        clearLots.execute();
        deleteWish.executeForAll();
        deleteUser.execute(userId);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/changePassword")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> changePassword(@RequestParam Long userId, @RequestBody ChangePasswordDto changePasswordDto) {
        changePassword.execute(userId, changePasswordDto);
        return ResponseEntity.ok().build();
    }
}
