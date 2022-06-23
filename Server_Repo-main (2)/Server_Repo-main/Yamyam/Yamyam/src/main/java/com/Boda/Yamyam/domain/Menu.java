package com.Boda.Yamyam.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter@Setter
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private Long menuId;

    private String menuName;

    private Long price;

    private String cartegory;


    @Column(name = "restaurant_id")
    private Long menuNum;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "menuId")
//    private List<MenuImage> menuImages = new ArrayList<>();
}


