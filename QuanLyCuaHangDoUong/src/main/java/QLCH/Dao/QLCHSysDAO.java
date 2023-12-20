package QLCH.Dao;


import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
    public abstract class QLCHSysDAO<E, K> {

    abstract public void insert(E entity);

    abstract public void update(E entity);

    abstract public void delete(K id);

    abstract public List<E> selectAll();

    abstract public E SelectbyID(K id);

    abstract protected List<E> selectbySql(String sql, Object... args);
}
