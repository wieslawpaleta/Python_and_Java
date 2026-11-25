package com.example.demo;  // Declarar el paquete al que pertenece esta clase; asegúrate de que coincida con tus otros archivos (Zadeklaruj pakiet, do którego należy ta klasa; upewnij się, że zgadza się z Twoimi innymi plikami)

public class CryptoStats {  // Declarar una clase pública llamada CryptoStats para representar el resumen estadístico de una moneda (Zadeklaruj publiczną klasę o nazwie CryptoStats reprezentującą podsumowanie statystyczne waluty)

    private String symbol;       // Declarar atributo privado de texto para guardar el símbolo de la criptomoneda (Zadeklaruj prywatny atrybut tekstowy do przechowywania symbolu kryptowaluty)
    private long count;          // Declarar atributo privado numérico entero largo para guardar cuántos registros se analizaron (Zadeklaruj prywatny atrybut liczby całkowitej typu long do przechowywania liczby przeanalizowanych wpisów)
    private double minPrice;     // Declarar atributo privado decimal para guardar el precio más bajo encontrado (Zadeklaruj prywatny atrybut zmiennoprzecinkowy do przechowywania najniższej znalezionej ceny)
    private double maxPrice;     // Declarar atributo privado decimal para guardar el precio más alto encontrado (Zadeklaruj prywatny atrybut zmiennoprzecinkowy do przechowywania najwyższej znalezionej ceny)
    private double averagePrice; // Declarar atributo privado decimal para guardar el precio promedio calculado (Zadeklaruj prywatny atrybut zmiennoprzecinkowy do przechowywania obliczonej średniej ceny)

    public CryptoStats(String symbol, long count, double minPrice, double maxPrice, double averagePrice) {  // Definir constructor con todos los parámetros para inicializar las estadísticas de una vez (Zdefiniuj konstruktor ze wszystkimi parametrami, aby zainicjować statystyki za jednym razem)
        this.symbol = symbol;              // Asignar el símbolo recibido al atributo interno symbol (Przypisz otrzymany symbol do wewnętrznego atrybutu symbol)
        this.count = count;                // Asignar la cantidad recibida al atributo interno count (Przypisz otrzymaną liczbę do wewnętrznego atrybutu count)
        this.minPrice = minPrice;          // Asignar el precio mínimo recibido al atributo interno minPrice (Przypisz otrzymaną cenę minimalną do wewnętrznego atrybutu minPrice)
        this.maxPrice = maxPrice;          // Asignar el precio máximo recibido al atributo interno maxPrice (Przypisz otrzymaną cenę maksymalną do wewnętrznego atrybutu maxPrice)
        this.averagePrice = averagePrice;  // Asignar el promedio recibido al atributo interno averagePrice (Przypisz otrzymaną średnią do wewnętrznego atrybutu averagePrice)
    }  // Cerrar el cuerpo del constructor (Zamknij ciało konstruktora)

    public String getSymbol() {  // Definir método getter público para leer el símbolo (Zdefiniuj publiczną metodę getter do odczytu symbolu)
        return symbol;  // Devolver el texto del símbolo (Zwróć tekst symbolu)
    }  // Cerrar getSymbol (Zamknij getSymbol)

    public long getCount() {  // Definir método getter público para leer la cantidad de registros (Zdefiniuj publiczną metodę getter do odczytu liczby wpisów)
        return count;  // Devolver el número de registros (Zwróć liczbę wpisów)
    }  // Cerrar getCount (Zamknij getCount)

    public double getMinPrice() {  // Definir método getter público para leer el precio mínimo (Zdefiniuj publiczną metodę getter do odczytu ceny minimalnej)
        return minPrice;  // Devolver el precio mínimo (Zwróć cenę minimalną)
    }  // Cerrar getMinPrice (Zamknij getMinPrice)

    public double getMaxPrice() {  // Definir método getter público para leer el precio máximo (Zdefiniuj publiczną metodę getter do odczytu ceny maksymalnej)
        return maxPrice;  // Devolver el precio máximo (Zwróć cenę maksymalną)
    }  // Cerrar getMaxPrice (Zamknij getMaxPrice)

    public double getAveragePrice() {  // Definir método getter público para leer el precio promedio (Zdefiniuj publiczną metodę getter do odczytu średniej ceny)
        return averagePrice;  // Devolver el precio promedio (Zwróć średnią cenę)
    }  // Cerrar getAveragePrice (Zamknij getAveragePrice)

}  // Cerrar el cuerpo de la clase CryptoStats (Zamknij ciało klasy CryptoStats)