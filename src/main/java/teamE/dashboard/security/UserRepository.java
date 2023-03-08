package teamE.dashboard.security;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
//    User findByUsername(String username);
//    Optional<User> findByLoginId(String email);
    Optional<User> findByEmail(String email);


}
