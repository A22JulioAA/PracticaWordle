//Clase abstracta GameSolver

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public abstract class GameSolver {

    //Atributos de la clase
    public ArrayList<Solution> soluciones;
    public String nombre;

    //Constructores
    public GameSolver(String nombre){
        this.nombre = nombre;
        ArrayList<Solution> soluciones = new ArrayList<Solution>();
    }

    //Métodos get y set
    public String getNombre(){
        return nombre;
    }

    public ArrayList<Solution> getSoluciones(){
        return soluciones;
    }

    //Métodos de clase
    public void addSolucion(Solution s){
        System.out.println(soluciones.add(s));
    }

    public void clearSolucions(){
        soluciones.clear();
    }

    public abstract void solve();

    @Override
    public String toString() {
        Collections.sort(soluciones);
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < soluciones.size(); i++) {

        }
    }
}
