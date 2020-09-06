package pl.jdev.opes_commons.db;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@MappedSuperclass
public class DeletableAuditDto extends AuditDto {
    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date deletedAt;
}
