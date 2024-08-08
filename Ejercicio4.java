public class Ejercicio4{
    public static void main(String[]args){
        //declaramos una matriz con sus variables
        int [][] matriz ={
        {1,4,5},
        {4,6,8},
        {5,4,7} 
        };

        int sumamayor = 0;

        //realizamos un for para pasar por las filas
        for (int i = 0; i < matriz.length; i++){
            //declaramos variable para guardar el resultado de la suma
            int sumafila = 0;
            //realizamos otro for para pasar por las columnas
            for(int j = 0; j < matriz[i].length; j++){
                //guardamos la suma de la primera fila 
                sumafila += matriz[i][j];
            }
            if(sumafila > sumamayor){
                sumamayor = sumafila;
            }
        }
        System.out.print("La suma mayor es: " + sumamayor);
    }
}