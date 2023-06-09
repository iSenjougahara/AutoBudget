/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 *
 * @author Gabriel
 */
public class Pecas {
    private long rowId;
    private String nomePeca;
    private double preco;
    @ManyToOne
    @JoinColumn(name = "rowId", referencedColumnName = "rowId")
    private ModeloCarro modeloCarro;
    
}
