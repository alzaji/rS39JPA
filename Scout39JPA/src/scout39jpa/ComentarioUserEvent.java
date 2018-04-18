/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scout39jpa;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Dani
 */
@Embeddable
public class ComentarioUserEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
