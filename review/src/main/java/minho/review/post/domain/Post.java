package minho.review.post.domain;

import lombok.Getter;
import lombok.Setter;
import minho.review.user.domain.User;
import minho.review.common.utils.BaseEntity;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name="post")
@Getter @Setter
public class Post extends BaseEntity {
    @NotNull
    private String title;

    @NotNull
    private String contents;

    @ColumnDefault("1")
    private int viewCount;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name="user_uuid")
    private User user;
}