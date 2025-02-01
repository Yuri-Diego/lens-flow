package com.wnyuri.lensflow.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_movement")
public class Movement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movement")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "box_id", nullable = false)
    private Box box;

    @ManyToOne
    @JoinColumn(name = "movement_sheet_id", nullable = false)
    private MovementSheet movementSheet;


    private String client;

    @Column(name = "order_service")
    private String order;

    private boolean completed;
    private LocalDateTime time;

    public Movement() {}

    public Movement(Box box, MovementSheet movementSheet, String client, String order) {
        this.box = box;
        this.movementSheet = movementSheet;
        this.client = client;
        this.order = order;
        this.completed = false;
        this.time = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public MovementSheet getMovementSheet() {
        return movementSheet;
    }

    public void setMovementSheet(MovementSheet movementSheet) {
        this.movementSheet = movementSheet;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Movement)) return false;
        Movement that = (Movement) o;
        return id != null && id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return (id != null) ? id.hashCode() : System.identityHashCode(this);
    }

}
