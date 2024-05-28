package com.codeshadowing.api.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;

@Entity
@Table(name = "execution_log")
@Getter
@Setter
@ToString
public class ExecutionLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private ExecutionLog parent;

    @ManyToOne
    @JoinColumn(name = "code_id")
    private Code code;

    @ManyToOne
    @JoinColumn(name = "tried_user_id")
    private TriedUser triedUser;

    @Column(name = "tried_user_name")
    private String triedUserName;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

    @Column(name = "trial_count")
    private Integer trialCount;

    @Column(name = "max_wpm")
    private Integer maxWpm;

    @Column(name = "min_wpm")
    private Integer minWpm;

    @Column(name = "avg_wpm")
    private Integer avgWpm;

    @Column(name = "accuracy")
    private Integer accuracy;

    @Column(name = "score")
    private Integer score;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}
