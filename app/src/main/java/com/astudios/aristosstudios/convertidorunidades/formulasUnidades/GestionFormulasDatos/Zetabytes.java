package com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos;

import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.datos;

/**
 * Created by Aristos Studios on 1/2/2016.
 */
public class Zetabytes {
    public datos formulas_datos=new datos();
    public double zetabytes(String unidad1, String unidad2, double num_ingresado, String[] unidades_datos){
        double num=0;
        //DATOS
        String Bits=unidades_datos[0];
        String Bytes=unidades_datos[1];
        String Kilobits=unidades_datos[2];
        String Kibibits=unidades_datos[3];
        String Kilobytes=unidades_datos[4];
        String Kibibytes=unidades_datos[5];
        String Megabits=unidades_datos[6];
        String Mebibits=unidades_datos[7];
        String Megabytes=unidades_datos[8];
        String Mebibytes=unidades_datos[9];
        String Gigabits=unidades_datos[10];
        String Gibibits=unidades_datos[11];
        String Gigabytes=unidades_datos[12];
        String Gibibytes=unidades_datos[13];
        String Terabits=unidades_datos[14];
        String Tebibits=unidades_datos[15];
        String Terabytes=unidades_datos[16];
        String Tebibytes=unidades_datos[17];
        String Petabits=unidades_datos[18];
        String Pebibits=unidades_datos[19];
        String Petabytes=unidades_datos[20];
        String Pebibytes=unidades_datos[21];
        String Hexabits=unidades_datos[22];
        String Exbibits=unidades_datos[23];
        String Hexabytes=unidades_datos[24];
        String Hexbibytes=unidades_datos[25];
        String Zetabits=unidades_datos[26];
        String Zebibits=unidades_datos[27];
        String Zetabytes=unidades_datos[28];
        String Zebibytes=unidades_datos[29];
        String Yottabit=unidades_datos[30];
        String Yobibits=unidades_datos[31];
        String Yottabyte=unidades_datos[32];
        String Yobibytes=unidades_datos[33];

        if(unidad1.contains(Zetabytes)&& unidad2.contains(Bits)){num=formulas_datos.Zetabytes_Bits(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Bytes)){num=formulas_datos.Zetabytes_Bytes(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Kilobits)){num=formulas_datos.Zetabytes_Kilobits(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Kibibits)){num=formulas_datos.Zetabytes_Kibibits(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Kilobytes)){num=formulas_datos.Zetabytes_Kilobytes(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Kibibytes)){num=formulas_datos.Zetabytes_Kibibytes(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Megabits)){num=formulas_datos.Zetabytes_Megabits(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Mebibits)){num=formulas_datos.Zetabytes_Mebibits(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Megabytes)){num=formulas_datos.Zetabytes_Megabytes(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Mebibytes)){num=formulas_datos.Zetabytes_Mebibytes(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Gigabits)){num=formulas_datos.Zetabytes_Gigabits(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Gibibits)){num=formulas_datos.Zetabytes_Gibibits(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Gigabytes)){num=formulas_datos.Zetabytes_Gigabytes(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Gibibytes)){num=formulas_datos.Zetabytes_Gibibytes(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Terabits)){num=formulas_datos.Zetabytes_Terabits(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Tebibits)){num=formulas_datos.Zetabytes_Tebibits(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Terabytes)){num=formulas_datos.Zetabytes_Terabytes(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Tebibytes)){num=formulas_datos.Zetabytes_Tebibytes(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Petabits)){num=formulas_datos.Zetabytes_Petabits(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Pebibits)){num=formulas_datos.Zetabytes_Pebibits(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Petabytes)){num=formulas_datos.Zetabytes_Petabytes(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Pebibytes)){num=formulas_datos.Zetabytes_Pebibytes(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Hexabits)){num=formulas_datos.Zetabytes_Hexabits(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Exbibits)){num=formulas_datos.Zetabytes_Exbibits(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Hexabytes)){num=formulas_datos.Zetabytes_Hexabytes(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Hexbibytes)){num=formulas_datos.Zetabytes_Hexbibytes(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Zetabits)){num=formulas_datos.Zetabytes_Zetabits(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Zebibits)){num=formulas_datos.Zetabytes_Zebibits(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Zetabytes)){num=num_ingresado;}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Zebibytes)){num=formulas_datos.Zetabytes_Zebibytes(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Yottabit)){num=formulas_datos.Zetabytes_Yottabit(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Yobibits)){num=formulas_datos.Zetabytes_Yobibits(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Yottabyte)){num=formulas_datos.Zetabytes_Yottabyte(num_ingresado);}
        if(unidad1.contains(Zetabytes)&& unidad2.contains(Yobibytes)){num=formulas_datos.Zetabytes_Yobibytes(num_ingresado);}
    return num;
    }
}
