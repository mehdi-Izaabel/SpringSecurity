package com.xproce.config;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {


        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String email;
        private String pwd;
        private String role;
    }
}
