package org.delivery.db.storemenu;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.delivery.db.BaseEntity;
import org.delivery.db.storemenu.enums.StoreMenuStatus;

import java.math.BigDecimal;


@EqualsAndHashCode(callSuper = true)
@SuperBuilder
//위에 2개는 상속으로 인해 필요한 듯
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "store_menu")
public class StoreMenuEntity extends BaseEntity {

    @Column(nullable = false)
    private Long storeId;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, precision=11, scale=4)
    private BigDecimal amount;

    @Column(nullable = false, length = 50)
    @Enumerated(EnumType.STRING)
    private StoreMenuStatus status;

    @Column(nullable = false, length = 200)
    private String thumbnailUrl;

    private int likeCount;
    // 디폴트 값이 0이기 때문에 int 가능
    // null이면 Integer 사용했어야 함

    private int sequence;
}
