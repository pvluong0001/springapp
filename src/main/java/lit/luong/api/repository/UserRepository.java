package lit.luong.api.repository;

import lit.luong.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("update #{#entityName} e set e.deleted_at=123213 where e.id=?1")
    @Modifying
    public void softDelete(String id);
}
