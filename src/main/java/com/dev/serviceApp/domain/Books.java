package com.dev.serviceApp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "books")
public class Books {
    @Id
    private String isbn;
    private String name;


//    private Long author_id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "'author_id'") //, referencedColumnName = "id"
    private Authors author; // Assuming you want to use the Authors entity as a reference
}

