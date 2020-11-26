package lit.luong.api.entity.trait;

import org.hibernate.annotations.SQLDelete;

@SQLDelete(sql = "UPDATE deleted_at")
public interface SoftDelete {
    final Long deleted_at = null;
}
