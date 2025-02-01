package com.wnyuri.lensflow.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_movement_sheet")
public class MovementSheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movement_sheet")
    private long id;

    @Column(name = "creation_date")
    private LocalDate date;

    @OneToMany(mappedBy = "movementSheet", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Movement> movements;

    public MovementSheet() {}

    public MovementSheet(LocalDate date, List<Movement> movements) {
        this.date = date;
        this.movements = movements;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Movement> getMovements() {
        return movements;
    }

    public void setMovements(List<Movement> movements) {
        this.movements = movements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof MovementSheet)) return false;
        MovementSheet that = (MovementSheet) o;
        return id != 0 && id == that.id;
    }

    @Override
    public int hashCode() {
        return (id != 0) ? Long.hashCode(id) : System.identityHashCode(this);
    }


}
