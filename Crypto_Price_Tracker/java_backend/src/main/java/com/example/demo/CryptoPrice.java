package com.example.demo; // Declarar el nombre del paquete para agrupar esta clase con el resto del proyecto (Zadeklaruj nazwę pakietu, aby zgrupować tę klasę z resztą projektu)

public class CryptoPrice {  // Declarar una clase pública llamada CryptoPrice que servirá como molde para los datos de cada moneda (Zadeklaruj publiczną klasę o nazwie CryptoPrice, która posłuży jako szablon dla danych każdej waluty)

    private String timestamp;  // Declarar un atributo privado de texto para guardar la fecha y hora exacta del registro (Zadeklaruj prywatny atrybut tekstowy do przechowywania dokładnej daty i godziny wpisu)
    private String symbol;     // Declarar un atributo privado de texto para guardar el símbolo de la criptomoneda como 'BTCUSDT' (Zadeklaruj prywatny atrybut tekstowy do przechowywania symbolu kryptowaluty, np. 'BTCUSDT')
    private double price;      // Declarar un atributo privado numérico decimal para guardar el precio de la moneda (Zadeklaruj prywatny atrybut liczbowy zmiennoprzecinkowy do przechowywania ceny waluty)

    public CryptoPrice() {  // Definir un constructor vacío sin parámetros necesario para que Spring Boot pueda crear objetos automáticamente (Zdefiniuj pusty konstruktor bez parametrów, niezbędny, aby Spring Boot mógł automatycznie tworzyć obiekty)
    }  // Cerrar el cuerpo del constructor vacío (Zamknij ciało pustego konstruktora)

    public CryptoPrice(String timestamp, String symbol, double price) {  // Definir un constructor con parámetros para crear un objeto CryptoPrice con todos sus datos de una sola vez (Zdefiniuj konstruktor z parametrami, aby utworzyć obiekt CryptoPrice ze wszystkimi danymi za jednym razem)
        this.timestamp = timestamp;  // Asignar el valor recibido en el parámetro timestamp al atributo interno de esta clase (Przypisz wartość otrzymaną w parametrze timestamp do wewnętrznego atrybutu tej klasy)
        this.symbol = symbol;        // Asignar el valor recibido en el parámetro symbol al atributo interno de esta clase (Przypisz wartość otrzymaną w parametrze symbol do wewnętrznego atrybutu tej klasy)
        this.price = price;          // Asignar el valor recibido en el parámetro price al atributo interno de esta clase (Przypisz wartość otrzymaną w parametrze price do wewnętrznego atrybutu tej klasy)
    }  // Cerrar el cuerpo del constructor con parámetros (Zamknij ciało konstruktora z parametrami)

    public String getTimestamp() {  // Definir un método getter público para permitir leer el valor privado de timestamp desde fuera de la clase (Zdefiniuj publiczną metodę getter, aby umożliwić odczyt prywatnej wartości timestamp spoza klasy)
        return timestamp;  // Devolver el texto almacenado en el atributo timestamp (Zwróć tekst przechowywany w atrybucie timestamp)
    }  // Cerrar el cuerpo del método getTimestamp (Zamknij ciało metody getTimestamp)

    public void setTimestamp(String timestamp) {  // Definir un método setter público para permitir modificar el valor privado de timestamp (Zdefiniuj publiczną metodę setter, aby umożliwić zmianę prywatnej wartości timestamp)
        this.timestamp = timestamp;  // Guardar el nuevo valor recibido dentro del atributo timestamp de esta clase (Zapisz nową otrzymaną wartość wewnątrz atrybutu timestamp tej klasy)
    }  // Cerrar el cuerpo del método setTimestamp (Zamknij ciało metody setTimestamp)

    public String getSymbol() {  // Definir un método getter público para leer el símbolo de la criptomoneda (Zdefiniuj publiczną metodę getter do odczytu symbolu kryptowaluty)
        return symbol;  // Devolver el texto almacenado en el atributo symbol (Zwróć tekst przechowywany w atrybucie symbol)
    }  // Cerrar el cuerpo del método getSymbol (Zamknij ciało metody getSymbol)

    public void setSymbol(String symbol) {  // Definir un método setter público para modificar el símbolo de la criptomoneda (Zdefiniuj publiczną metodę setter do zmiany symbolu kryptowaluty)
        this.symbol = symbol;  // Guardar el nuevo símbolo recibido dentro del atributo symbol de esta clase (Zapisz nowy otrzymany symbol wewnątrz atrybutu symbol tej klasy)
    }  // Cerrar el cuerpo del método setSymbol (Zamknij ciało metody setSymbol)

    public double getPrice() {  // Definir un método getter público para leer el precio numérico de la criptomoneda (Zdefiniuj publiczną metodę getter do odczytu numerycznej ceny kryptowaluty)
        return price;  // Devolver el número decimal almacenado en el atributo price (Zwróć liczbę dziesiętną przechowywaną w atrybucie price)
    }  // Cerrar el cuerpo del método getPrice (Zamknij ciało metody getPrice)

    public void setPrice(double price) {  // Definir un método setter público para modificar el precio numérico de la criptomoneda (Zdefiniuj publiczną metodę setter do zmiany numerycznej ceny kryptowaluty)
        this.price = price;  // Guardar el nuevo precio recibido dentro del atributo price de esta clase (Zapisz nową otrzymaną cenę wewnątrz atrybutu price tej klasy)
    }  // Cerrar el cuerpo del método setPrice (Zamknij ciało metody setPrice)

}