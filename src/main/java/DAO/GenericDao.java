package DAO;

import java.io.Serializable; 

/**
 * 
 * @author Fanta COULIBALY & Louise-Agn�s MACKONGO
 *
 * @param <T>
 * @param <PK>
 */

public interface GenericDao <T, PK extends Serializable> {

    T create(T t);
    T read(PK id);
    T update(T t);
    void delete(T t);
}
