package mates;

public class Funcion{
    public static int suma(int n)
{
    int acumulado = 0;
    for (int i = 1; i <= n; i++)
    {
        acumulado += i;
    }
    return acumulado;
}

}
