/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CEPA2;

import java.io.File;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author jordi
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;

// C�digo est�tico. S�lo se ejecuta una vez, como un Singleton
    static {
        try {
// Creamos es SessionFactory desde el fichero hibernate.cfg.xml
            sessionFactory = new Configuration().configure(new File("hibernate.cfg.xml")).buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Error en la inicializaci�n. " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
