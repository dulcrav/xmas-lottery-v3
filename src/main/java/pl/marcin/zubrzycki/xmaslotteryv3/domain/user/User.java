package pl.marcin.zubrzycki.xmaslotteryv3.domain.user;

import pl.marcin.zubrzycki.xmaslotteryv3.domain.role.Role;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    @Size(max = 20)
    private String name;

    @Column(name = "USERNAME")
    @Size(max = 30)
    private String username;

    @Column(name = "PASSWORD")
    @Size(max = 100)
    private String password;

    @ManyToMany
    @JoinTable(name = "USER_ROLE",
               joinColumns = @JoinColumn(name = "USER_ID"),
               inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
    private Set<Role> roles = new HashSet<>();

    public User() {}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
