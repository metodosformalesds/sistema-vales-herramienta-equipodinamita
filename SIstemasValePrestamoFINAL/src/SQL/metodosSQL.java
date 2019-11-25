package SQL;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import ElementosSistema.Herramientas;
import ElementosSistema.Maquinarias;
import ElementosSistema.ValeHerramienta;
import ElementosSistema.ValeMaquinaria;
import java.util.ArrayList;

public class metodosSQL {

    //Atributos de la clase
    private static Connection conexion;
    private static PreparedStatement sentencia;
    private static ResultSet resultado;

    //Metodos de la clase
//************************************METODOS HERRAMIENTAS************************************************************
    //Metodo para realizar las altas de herramientas.
    public void GuardarDatosHerramienta(int numInventario, String nombre, String caracteristicas, int cantidad) {

        try {
            conexion = conexionBD.Conectar();
            String consulta = "INSERT INTO herramientas (numInventario, nombre, caracteristicas, cantidad) VALUES (?,?,?,?)";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setInt(1, numInventario);
            sentencia.setString(2, nombre);
            sentencia.setString(3, caracteristicas);
            sentencia.setInt(4, cantidad);
            int i = sentencia.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Datos Guardados");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar datos");
            }

            conexion.close();

        } catch (SQLException | HeadlessException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }

    //Metodo que busca si la herramienta ya está dada de alta según el num. de inventario.
    public static String BuscarNumInv(String numInv) {
        String mensaje = null;

        try {
            conexion = conexionBD.Conectar();
            String consulta = "SELECT numInventario FROM herramientas WHERE numInventario = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, numInv);
            resultado = sentencia.executeQuery();

            if (resultado.next()) {
                mensaje = "Num Inv Existe";
            } else {
                mensaje = "Num Inv No Existe";
            }

            conexion.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return mensaje;
    }

    //Metodo que modifica los datos de un registro.
    public void ModificarDatos(int numInventario, String nombre,
            String caracteristicas, int cantidad) {

        try {
            conexion = conexionBD.Conectar();
            String consulta = "UPDATE herramientas SET nombre = ?, caracteristicas = ?, cantidad = ? WHERE numInventario = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, nombre);
            sentencia.setString(2, caracteristicas);
            sentencia.setInt(3, cantidad);
            sentencia.setInt(4, numInventario);

            int i = sentencia.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Datos modificados");
            } else {
                JOptionPane.showMessageDialog(null, "Datos no se pudieron modificar");
            }

            conexion.close();

        } catch (SQLException | HeadlessException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public Herramientas RecolectarDatos(String numInventario) {

        Herramientas herramienta = new Herramientas();

        try {
            conexion = conexionBD.Conectar();
            String sqlBusquedaEliminar = "SELECT * FROM herramientas WHERE numInventario = ?";
            sentencia = conexion.prepareStatement(sqlBusquedaEliminar);
            sentencia.setString(1, numInventario);
            resultado = sentencia.executeQuery();

            if (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String car = resultado.getString("caracteristicas");
                int cantidad = Integer.parseInt(resultado.getString("cantidad"));

                /*System.out.println("Nombre " + nombre);
                 System.out.println("Cantidad " + cantidad);
                 System.out.println("Car "+ car);*/
                herramienta.setNombre(nombre);
                herramienta.setCantidad(cantidad);
                herramienta.setCaracteristicas(car);

            } else {

            }

            conexion.close();
            return herramienta;

        } catch (SQLException e) {
            System.out.println("Error" + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return herramienta;
    }

    public void EliminarHerramienta(int numInventario) {

        try {
            conexion = conexionBD.Conectar();
            String consulta = "DELETE FROM herramientas WHERE numInventario = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setInt(1, numInventario);
            int resultadoFilaAfectada = sentencia.executeUpdate();

            if (resultadoFilaAfectada > 0) {
                JOptionPane.showMessageDialog(null, "Herramienta eliminada.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la herramienta.");
            }
            conexion.close();

        } catch (SQLException | HeadlessException e) {
            System.out.println("Error" + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

//************************************METODOS MAQUINARIA************************************************************
    //Metodo para realizar las altas de maquinaria.
    public void GuardarDatosMaquinaria(int numSerie, String nombre, int numMaquina) {

        try {
            conexion = conexionBD.Conectar();
            String consulta = "INSERT INTO maquinaria (numSerie, nombre, numMaquina) VALUES (?,?,? )";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setInt(1, numSerie);
            sentencia.setString(2, nombre);
            sentencia.setInt(3, numMaquina);
            int i = sentencia.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Datos Guardados");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar datos");
            }

            conexion.close();

        } catch (SQLException | HeadlessException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }

    //Metodo que busca si la herramienta ya está dada de alta según el num. de serie.
    public static String BuscarNumSerie(String numSerie) {
        String mensaje = null;

        try {
            conexion = conexionBD.Conectar();
            String consulta = "SELECT numSerie FROM maquinaria WHERE numSerie = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, numSerie);
            resultado = sentencia.executeQuery();

            if (resultado.next()) {
                mensaje = "Num Serie Existe";
            } else {
                mensaje = "Num Serie No Existe";
            }

            conexion.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return mensaje;
    }

    //Metodo que modifica los datos de un registro.
    public void ModificarDatosMaquinaria(int numSerie, String nombre,
            int numMaquina) {

        try {
            conexion = conexionBD.Conectar();
            String consulta = "UPDATE maquinaria SET nombre = ?, numMaquina = ? WHERE numSerie = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, nombre);
            sentencia.setInt(2, numMaquina);
            sentencia.setInt(3, numSerie);

            int i = sentencia.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Datos modificados");
            } else {
                JOptionPane.showMessageDialog(null, "Datos no se pudieron modificar");
            }

            conexion.close();

        } catch (SQLException | HeadlessException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Maquinarias RecolectarDatosMaquinaria(String numSerie) {

        Maquinarias maquinaria = new Maquinarias();

        try {
            conexion = conexionBD.Conectar();
            String sqlBusquedaEliminar = "SELECT * FROM maquinaria WHERE numSerie = ?";
            sentencia = conexion.prepareStatement(sqlBusquedaEliminar);
            sentencia.setString(1, numSerie);
            resultado = sentencia.executeQuery();

            if (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String numMaq = resultado.getString("numMaquina");

                /*System.out.println("Nombre " + nombre);
                 System.out.println("Cantidad " + cantidad);
                 System.out.println("Car "+ car);*/
                maquinaria.setNombre(nombre);
                maquinaria.setNumMaquina(Integer.parseInt(numMaq));

            } else {

            }

            conexion.close();
            return maquinaria;

        } catch (SQLException e) {
            System.out.println("Error" + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return maquinaria;
    }

    public void EliminarMaquinaria(int numSerie) {

        try {
            conexion = conexionBD.Conectar();
            String consulta = "DELETE FROM maquinaria WHERE numSerie = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setInt(1, numSerie);
            int resultadoFilaAfectada = sentencia.executeUpdate();

            if (resultadoFilaAfectada > 0) {
                JOptionPane.showMessageDialog(null, "Herramienta eliminada.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la herramienta.");
            }
            conexion.close();

        } catch (SQLException | HeadlessException e) {
            System.out.println("Error" + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
//************************************METODOS VALE HERRAMIENTS************************************************************   
    
    public void AltaValeH(int folio, String horaEntrada, String horaSalida, String fecha,
            String docente, String clase, String practica, int idHerramienta, 
            String lab, String observaciones, int matriculaEntrega, 
            int matriculaRecibe, String estatus, String nombreSolicitante, int matriculaSolicitante){
        
        try {
            conexion = conexionBD.Conectar();
            String consulta = "INSERT INTO valeherramienta (Folio, HoraEntrada, "
                    + "HoraSalida, Fecha, NombreDocente, Clase, NomPrac, "
                    + "idHerramienta, NumLab, Observaciones, MatriculaEntrega, "
                    + "MatriculaRecibe, Estatus, NombreSolicitante, MatriculaSolicitante) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setInt(1, folio);
            sentencia.setString(2, horaEntrada);
            sentencia.setString(3, horaSalida);
            sentencia.setString(4, fecha);
            sentencia.setString(5, docente);
            sentencia.setString(6, clase);
            sentencia.setString(7, practica);
            sentencia.setInt(8, idHerramienta);
            sentencia.setString(9, lab);
            sentencia.setString(10, observaciones);
            sentencia.setInt(11, matriculaEntrega);
            sentencia.setInt(12, matriculaRecibe);
            sentencia.setString(13, estatus);
            sentencia.setString(14, nombreSolicitante);
            sentencia.setInt(15, matriculaSolicitante);
            
            
            int i = sentencia.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Datos Guardados");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar datos");
            }

            conexion.close();

        } catch (SQLException | HeadlessException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
    
    //Metodo que busca si el vale de herramienta ya está dada de alta según el num. de folio.
    public static String BuscarNumFolioH(String numFolio) {
        String mensaje = null;

        try {
            conexion = conexionBD.Conectar();
            String consulta = "SELECT Folio FROM valeherramienta WHERE Folio = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, numFolio);
            resultado = sentencia.executeQuery();

            if (resultado.next()) {
                mensaje = "Num Folio Existe";
            } else {
                mensaje = "Num Folio No Existe";
            }

            conexion.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return mensaje;
    }

    //Se recolectan los datos de un registro segun el num de folio y se guarda en un objeto.
    public ValeHerramienta RecolectarDatosValeH(String folio){
        
        ValeHerramienta valeHerramienta = new ValeHerramienta();
        
        try {
            conexion = conexionBD.Conectar();
            String consulta = "SELECT * FROM valeherramienta WHERE Folio = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, folio);
            resultado = sentencia.executeQuery();
            
            if(resultado.next()){
                //System.out.println("entrada: " + resultado.getString("horaEntrada"));
                
                String horaEntrada = resultado.getString("HoraEntrada");
                String horaSalida = resultado.getString("HoraSalida");
                String fecha = resultado.getString("Fecha") ;
                String nombreDocente = resultado.getString("NombreDocente");
                String clase = resultado.getString("Clase");
                String nomPrac = resultado.getString("NomPrac");
                int idHerramienta = Integer.parseInt(resultado.getString("idHerramienta"));
                String numLab = resultado.getString("NumLab");
                String obs = resultado.getString("Observaciones");
                int matEntrega = Integer.parseInt(resultado.getString("MatriculaEntrega"));
                int matRecibe = Integer.parseInt(resultado.getString("MatriculaRecibe"));
                String estatus = resultado.getString("Estatus");
                String nombreSolicitante = resultado.getString("NombreSolicitante");
                int matSolicitante = Integer.parseInt(resultado.getString("MatriculaSolicitante"));
                
                valeHerramienta.LlenarVale(horaEntrada, horaSalida, fecha, nombreDocente,
                clase, nomPrac, idHerramienta, numLab, obs, matEntrega, matRecibe, estatus, nombreSolicitante, matSolicitante);
                
                System.out.println("entrada:" + valeHerramienta.getHoraEntrada());
            }
            
            conexion.close();
            return valeHerramienta;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valeHerramienta;
    }
    
    public void EliminarValeH(int folio) {

        try {
            conexion = conexionBD.Conectar();
            String consulta = "DELETE FROM valeherramienta WHERE Folio = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setInt(1, folio);
            int resultadoFilaAfectada = sentencia.executeUpdate();
            
            
            if (resultadoFilaAfectada > 0) {
                JOptionPane.showMessageDialog(null, "Vale eliminado.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el vale.");
            }
            conexion.close();

        } catch (SQLException | HeadlessException e) {
            System.out.println("Error" + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    public ArrayList<String> RecopilarNumInv(String folio){
        ArrayList<String> listaNumInv = new ArrayList<>();
        
        try {
            conexion = conexionBD.Conectar();
            String consulta = "SELECT idHerramienta FROM valeherramienta WHERE Folio = ? AND Estatus = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, folio);
            sentencia.setString(2, "Activo");
            resultado = sentencia.executeQuery();
            
            while(resultado.next()){
                listaNumInv.add(resultado.getString("idHerramienta"));
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return listaNumInv;
    }
    
    
    
    
    public ArrayList<Herramientas> RecopilarHerramienta(ArrayList<String> lista){
        
        ArrayList<Herramientas> listaHerramientas = new ArrayList<>();
        Herramientas herramienta = new Herramientas();
        
        
        
        try {
            conexion = conexionBD.Conectar();
            String consulta = "SELECT * FROM herramientas WHERE numInventario = ?";
            sentencia = conexion.prepareStatement(consulta);
            
            for (String lista1 : lista) {
                sentencia.setString(1, lista1);
                resultado = sentencia.executeQuery();
                if(resultado.next()){
                    Herramientas herramienta2 = new Herramientas();
                    herramienta2.setNumInventario(Integer.parseInt(resultado.getString("numInventario")));
                    herramienta2.setNombre(resultado.getString("nombre"));
                    herramienta2.setCaracteristicas(resultado.getString("caracteristicas"));
                    herramienta2.setCantidad(Integer.parseInt(resultado.getString("cantidad")));
                    listaHerramientas.add(herramienta2);
                }
            }  
                
            conexion.close();
        } catch (SQLException | NumberFormatException e) {
            System.out.println("Error" + e);
        }finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return listaHerramientas;
    }
    
    //Metodo que modifica los datos de un registro.
    public void ModificarDatosvaleH(String folio, ValeHerramienta vale) {
 
        try {
            conexion = conexionBD.Conectar();
            String consulta = "UPDATE valeherramienta SET NombreDocente = ?, Clase = ?, NomPrac = ?, NumLab = ?, Observaciones = ?, MatriculaEntrega = ?, MatriculaRecibe = ?,  NombreSolicitante = ?, MatriculaSolicitante = ? WHERE Folio = ?";
            sentencia = conexion.prepareStatement(consulta);
            
            sentencia.setString(1, vale.getDocente());
            sentencia.setString(2, vale.getClase());
            sentencia.setString(3, vale.getPractica());
            sentencia.setString(4, vale.getLab());
            sentencia.setString(5, vale.getObservaciones());
            sentencia.setInt(6, vale.getMatEntrega());
            sentencia.setInt(7, vale.getMatRecibe() );
            sentencia.setString(8, vale.getNombreSolicitante());
            sentencia.setInt(9, vale.getMatriculaSolicitante());
            sentencia.setString(10, folio);
            
            int i = sentencia.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Datos modificados");
            } else {
                JOptionPane.showMessageDialog(null, "Datos no se pudieron modificar");
            }

            conexion.close();

        } catch (SQLException | HeadlessException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public void CambiarEstadoVale(String folio, ArrayList<String> lista){
        try {
            conexion = conexionBD.Conectar();
            String consulta = "UPDATE valeherramienta SET Estatus = ? WHERE Folio = ? AND idHerramienta = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, "Finalizado");
            sentencia.setString(2, folio);
            
            for (String lista1 : lista) {
                sentencia.setString(3, lista1);
                int j = sentencia.executeUpdate();
                if (j > 0) {
                    JOptionPane.showMessageDialog(null, "Datos modificados");
                } else {
                    JOptionPane.showMessageDialog(null, "Datos no se pudieron modificar");
                }
            }
            conexion.close();
            
        } catch (SQLException | HeadlessException e) {
            System.out.println("Error" + e);
        }finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void CerrarVale(String folio ,String horaSalida, int matRecibe){
        try {
            conexion = conexionBD.Conectar();
            String consulta = "UPDATE valeherramienta SET HoraSalida = ?, MatriculaRecibe = ? WHERE Folio = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, horaSalida);
            sentencia.setInt(2, matRecibe);
            sentencia.setString(3, folio);
            
            int j = sentencia.executeUpdate();
                
                if (j > 0) {
                    JOptionPane.showMessageDialog(null, "Datos modificados");
                } else {
                    JOptionPane.showMessageDialog(null, "Datos no se pudieron modificar");
                }
            conexion.close();
        } catch (SQLException | HeadlessException e) {
            System.out.println("Error" + e);
        }finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public ArrayList<ValeHerramienta> BuscarValesActivosH(){
        
        ArrayList<ValeHerramienta> listaH = new ArrayList<>();
        try {
            conexion = conexionBD.Conectar();
            String consulta = "SELECT Folio, HoraEntrada, Fecha, Observaciones, MatriculaEntrega, NombreSolicitante, MatriculaSolicitante FROM valeherramienta WHERE Estatus = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, "Activo");
            resultado = sentencia.executeQuery();
            
            while(resultado.next()){
                ValeHerramienta valeH = new ValeHerramienta();
                valeH.setFolio(Integer.parseInt(resultado.getString(1)));
                valeH.setHoraEntrada(resultado.getString(2));
                valeH.setFecha(resultado.getString(3));
                valeH.setObservaciones(resultado.getString(4));
                valeH.setMatEntrega(Integer.parseInt(resultado.getString(5)));
                valeH.setNombreSolicitante(resultado.getString(6));
                valeH.setMatriculaSolicitante(Integer.parseInt(resultado.getString(7)));
                listaH.add(valeH);
            }
            
            conexion.close();
        } catch (SQLException | NumberFormatException e) {
            System.out.println("Error" + e);
        }finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listaH;
    }
    
    public ArrayList<ValeHerramienta> BuscarValesFinalizadosH(){
        
        ArrayList<ValeHerramienta> listaH = new ArrayList<>();
        try {
            conexion = conexionBD.Conectar();
            String consulta = "SELECT Folio, HoraEntrada, Fecha, Observaciones, MatriculaEntrega, NombreSolicitante, MatriculaSolicitante FROM valeherramienta WHERE Estatus = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, "Finalizado");
            resultado = sentencia.executeQuery();
            
            while(resultado.next()){
                ValeHerramienta valeH = new ValeHerramienta();
                valeH.setFolio(Integer.parseInt(resultado.getString(1)));
                valeH.setHoraEntrada(resultado.getString(2));
                valeH.setFecha(resultado.getString(3));
                valeH.setObservaciones(resultado.getString(4));
                valeH.setMatEntrega(Integer.parseInt(resultado.getString(5)));
                valeH.setNombreSolicitante(resultado.getString(6));
                valeH.setMatriculaSolicitante(Integer.parseInt(resultado.getString(7)));
                listaH.add(valeH);
            }
            
            conexion.close();
        } catch (SQLException | NumberFormatException e) {
            System.out.println("Error" + e);
        }finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listaH;
    }
//************************************METODOS VALE MAQUINARIA************************************************************   
    
    //Metodo que da de alta el vale de maquinaria.
    public void AltaValeM(int folio, String horaEntrada, String horaSalida, String fecha,
            String docente, String condicionInicial, String nombreSolicitante, int matriculaSolicitante, int matriculaEntrega, int idSerie, String estatus){
        
        try {
            conexion = conexionBD.Conectar();
            String consulta = "INSERT INTO valemaquinaria (Folio, HoraEntrada, "
                    + "HoraSalida, Fecha, NombreDocente, condicionInicial, NombreSolicitante, MatriculaSolicitante, MatriculaEntrega, idSerie, Estatus) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            
            sentencia = conexion.prepareStatement(consulta);
            
            sentencia.setInt(1, folio);
            sentencia.setString(2, horaEntrada);
            sentencia.setString(3, horaSalida);
            sentencia.setString(4, fecha);
            sentencia.setString(5, docente);
            sentencia.setString(6, condicionInicial);
            sentencia.setString(7, nombreSolicitante);
            sentencia.setInt(8, matriculaSolicitante);
            sentencia.setInt(9, matriculaEntrega);
            sentencia.setInt(10, idSerie);
            sentencia.setString(11, estatus);
            
            
            int i = sentencia.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Datos Guardados");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar datos");
            }

            conexion.close();

        } catch (SQLException | HeadlessException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
    
    //Metodo que busca si el vale de herramienta ya está dada de alta según el num. de folio.
    public static String BuscarNumFolioM(String numFolio) {
        String mensaje = null;

        try {
            conexion = conexionBD.Conectar();
            String consulta = "SELECT Folio FROM valemaquinaria WHERE Folio = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, numFolio);
            resultado = sentencia.executeQuery();

            if (resultado.next()) {
                mensaje = "Num Folio Existe";
            } else {
                mensaje = "Num Folio No Existe";
            }

            conexion.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return mensaje;
    }
    
    //Se recolectan los datos de un registro segun el num de folio y se guarda en un objeto.
    public ValeMaquinaria RecolectarDatosValeM(String folio){
        
        ValeMaquinaria valeMaquinaria = new ValeMaquinaria();
        
        try {
            conexion = conexionBD.Conectar();
            String consulta = "SELECT * FROM valemaquinaria WHERE Folio = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, folio);
            resultado = sentencia.executeQuery();
            
            if(resultado.next()){
               
                String horaEntrada = resultado.getString("HoraEntrada");
                String horaSalida = resultado.getString("HoraSalida");
                String fecha = resultado.getString("Fecha");
                String nombreDocente = resultado.getString("NombreDocente");
                String nombreSolicitante = resultado.getString("NombreSolicitante");
                int matSolicitante = Integer.parseInt(resultado.getString("MatriculaSolicitante")); 
                int matEntrega = Integer.parseInt(resultado.getString("MatriculaEntrega"));
                int matRecibe = Integer.parseInt(resultado.getString("MatriculaRecibe"));
                String estatus = resultado.getString("Estatus");
                String condicionInicial = resultado.getString("condicionInicial");
                String condicionFinal = resultado.getString("condicionFinal");
                int idMaquinaria = Integer.parseInt(resultado.getString("idSerie"));
                        
                valeMaquinaria.LlenarVale(horaEntrada, horaSalida, fecha, nombreDocente, 
                        nombreSolicitante, matSolicitante, matEntrega, matRecibe, 
                        estatus, condicionInicial, condicionFinal, idMaquinaria);
                        
                        
            }
            
            conexion.close();
            return valeMaquinaria;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valeMaquinaria;
    }
    
    //Este metodo elimina un registro de la tabla.
    public void EliminarValeM(int folio) {

        try {
            conexion = conexionBD.Conectar();
            String consulta = "DELETE FROM valemaquinaria WHERE Folio = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setInt(1, folio);
            int resultadoFilaAfectada = sentencia.executeUpdate();
            
            
            if (resultadoFilaAfectada > 0) {
                JOptionPane.showMessageDialog(null, "Vale eliminado.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el vale.");
            }
            conexion.close();

        } catch (SQLException | HeadlessException e) {
            System.out.println("Error" + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    public Maquinarias RecopilarMaquinaria(String numSerie){
        Maquinarias maquinaria = new Maquinarias(); 
        try {
            conexion = conexionBD.Conectar();
            String consulta = "SELECT * FROM maquinaria WHERE numSerie = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, numSerie);
            resultado = sentencia.executeQuery();
            if(resultado.next()){       
                    maquinaria.setNumSerie(Integer.parseInt(resultado.getString("numSerie")));
                    maquinaria.setNombre(resultado.getString("Nombre"));
                    maquinaria.setNumMaquina(Integer.parseInt(resultado.getString("numMaquina")));
            }
                
            conexion.close();
        } catch (SQLException | NumberFormatException e) {
            System.out.println("Error" + e);
        }finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return maquinaria;
    }
    
    //Metodo que modifica los datos de un registro.
    public void ModificarDatosvaleM(String folio, ValeMaquinaria vale) {
 
        try {
            conexion = conexionBD.Conectar();
            String consulta = "UPDATE valemaquinaria SET NombreDocente = ?, condicionInicial = ?, NombreSolicitante = ?, MatriculaSolicitante = ?,  MatriculaEntrega = ?, MatriculaRecibe = ?, idSerie = ? WHERE Folio = ?";
            sentencia = conexion.prepareStatement(consulta);
            
            sentencia.setString(1, vale.getDocente());
            sentencia.setString(2, vale.getCondicionInicial());
            sentencia.setString(3, vale.getNombreSolicitante());
            sentencia.setInt(4, vale.getMatriculaSolicitante());
            sentencia.setInt(5, vale.getMatEntrega());
            sentencia.setInt(6, vale.getMatRecibe());
            sentencia.setInt(7, vale.getIdMaquinaria());
            sentencia.setString(8, folio);
         
            
            int i = sentencia.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Datos modificados");
            } else {
                JOptionPane.showMessageDialog(null, "Datos no se pudieron modificar");
            }

            conexion.close();

        } catch (SQLException | HeadlessException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public void CambiarEstadoValeM(String folio, ArrayList<String> lista){
        try {
            conexion = conexionBD.Conectar();
            String consulta = "UPDATE valeherramienta SET Estatus = ? WHERE Folio = ? AND idHerramienta = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, "Finalizado");
            sentencia.setString(2, folio);
            
            for (String lista1 : lista) {
                sentencia.setString(3, lista1);
                int j = sentencia.executeUpdate();
                if (j > 0) {
                    JOptionPane.showMessageDialog(null, "Datos modificados");
                } else {
                    JOptionPane.showMessageDialog(null, "Datos no se pudieron modificar");
                }
            }
            conexion.close();
            
        } catch (SQLException | HeadlessException e) {
            System.out.println("Error" + e);
        }finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void CerrarValeM(String folio ,String horaSalida, int matRecibe){
        try {
            conexion = conexionBD.Conectar();
            String consulta = "UPDATE valeherramienta SET HoraSalida = ?, MatriculaRecibe = ? WHERE Folio = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, horaSalida);
            sentencia.setInt(2, matRecibe);
            sentencia.setString(3, folio);
            
            int j = sentencia.executeUpdate();
                
                if (j > 0) {
                    JOptionPane.showMessageDialog(null, "Datos modificados");
                } else {
                    JOptionPane.showMessageDialog(null, "Datos no se pudieron modificar");
                }
            conexion.close();
        } catch (SQLException | HeadlessException e) {
            System.out.println("Error" + e);
        }finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public ArrayList<ValeMaquinaria> BuscarValesActivosM(){
        
        ArrayList<ValeMaquinaria> listaM = new ArrayList<>();
        try {
            conexion = conexionBD.Conectar();
            String consulta = "SELECT Folio, HoraEntrada, Fecha, condicionInicial, NombreSolicitante, MatriculaSolicitante, MatriculaEntrega FROM valemaquinaria WHERE Estatus = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, "Activo");
            resultado = sentencia.executeQuery();
            
            while(resultado.next()){
                ValeMaquinaria valeM = new ValeMaquinaria();
                valeM.setFolio(Integer.parseInt(resultado.getString(1)));
                valeM.setHoraEntrada(resultado.getString(2));
                valeM.setFecha(resultado.getString(3));
                valeM.setCondicionInicial(resultado.getString(4));
                valeM.setNombreSolicitante(resultado.getString(5));
                valeM.setMatriculaSolicitante(Integer.parseInt(resultado.getString(6)));
                valeM.setMatEntrega(Integer.parseInt(resultado.getString(7)));
                System.out.println("nombre:" + valeM.getNombreSolicitante());
                listaM.add(valeM);
            }
            
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listaM;
    }
    
   public ArrayList<ValeMaquinaria> BuscarValesFinalizadosM(){
        
        ArrayList<ValeMaquinaria> listaM = new ArrayList<>();
        try {
            conexion = conexionBD.Conectar();
            String consulta = "SELECT Folio, HoraEntrada, Fecha, condicionInicial, NombreSolicitante, MatriculaSolicitante, MatriculaEntrega FROM valemaquinaria WHERE Estatus = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, "Finalizado");
            resultado = sentencia.executeQuery();
            
            while(resultado.next()){
                ValeMaquinaria valeM = new ValeMaquinaria();
                valeM.setFolio(Integer.parseInt(resultado.getString(1)));
                valeM.setHoraEntrada(resultado.getString(2));
                valeM.setFecha(resultado.getString(3));
                valeM.setCondicionInicial(resultado.getString(4));
                valeM.setNombreSolicitante(resultado.getString(5));
                valeM.setMatriculaSolicitante(Integer.parseInt(resultado.getString(6)));
                valeM.setMatEntrega(Integer.parseInt(resultado.getString(7)));
                System.out.println("nombre:" + valeM.getNombreSolicitante());
                listaM.add(valeM);
            }
            
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listaM;
    }
   
   public void CerrarValeM(String folio ,String horaSalida, String condicionFinal, int matRecibe){
        try {
            conexion = conexionBD.Conectar();
            String consulta = "UPDATE valemaquinaria SET HoraSalida = ?, condicionFinal = ?, MatriculaRecibe = ?, Estatus = ? WHERE Folio = ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, horaSalida);
            sentencia.setString(2, condicionFinal);
            sentencia.setInt(3, matRecibe);
            sentencia.setString(4, "Finalizado");
            sentencia.setString(5, folio);
            
            int j = sentencia.executeUpdate();
                
                if (j > 0) {
                    JOptionPane.showMessageDialog(null, "Datos modificados");
                } else {
                    JOptionPane.showMessageDialog(null, "Datos no se pudieron modificar");
                }
            conexion.close();
        } catch (SQLException | HeadlessException e) {
            System.out.println("Error" + e);
        }finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodosSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
