package com.codeshadowing.api.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;

@Entity
@Table(name = "temp_execution_log")
@Getter
@Setter
@ToString
public class TempExecutionLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "code_id")
    private Code code;

    @ManyToOne
    @JoinColumn(name = "tried_user_id")
    private TriedUser triedUser;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

    @Column(name = "current_page")
    private Integer currentPage;

    @Column(name = "sum_wpm")
    private Integer sumWpm;

    @Column(name = "max_wpm")
    private Integer maxWpm;

    @Column(name = "min_wpm")
    private Integer minWpm;

    @Column(name = "current_accuracy")
    private Float currentAccuracy;

    @Column(name = "avg_accuracy")
    private Float avgAccuracy;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}
