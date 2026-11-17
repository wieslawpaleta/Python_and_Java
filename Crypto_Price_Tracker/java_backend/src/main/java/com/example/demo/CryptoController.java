package com.example.demo; // Declare the package name grouping related application classes together (Zadeklaruj nazwę pakietu grupującego klasy aplikacji razem)

import org.springframework.web.bind.annotation.GetMapping;  // Import the annotation used to map HTTP GET requests to Java methods (Importuj adnotację używaną do mapowania żądań HTTP GET na metody w Javie)
import org.springframework.web.bind.annotation.RequestMapping;  // Import the annotation used to define a common base URL path for the controller (Importuj adnotację używaną do definiowania wspólnej bazowej ścieżki URL dla kontrolera)
import org.springframework.web.bind.annotation.RestController;  // Import the annotation telling Spring that this class is a web REST controller returning data directly (Importuj adnotację mówiącą Springowi, że ta klasa jest kontrolerem webowym REST zwracającym dane bezpośrednio)

@RestController  // Mark this Java class as a REST controller component managed by Spring container (Oznacz tę klasę Javy jako komponent kontrolera REST zarządzany przez kontener Springa)
@RequestMapping("/api/crypto")  // Set the base URL path prefix so all endpoints in this class start with '/api/crypto' (Ustaw bazowy prefiks ścieżki URL, aby wszystkie punkty końcowe w tej klasie zaczynały się od '/api/crypto')
public class CryptoController {  // Declare a public Java class named CryptoController representing our web endpoint handler (Zadeklaruj publiczną klasę Javy o nazwie CryptoController reprezentującą nasz handler punktów końcowych sieciowych)

    @GetMapping("/status")  // Map HTTP GET requests sent to the exact URL '/api/crypto/status' to the method below (Zmapuj żądania HTTP GET wysłane na dokładnie ten adres URL '/api/crypto/status' do poniższej metody)
    public String getStatus() {  // Define a public method named getStatus that returns a text String object (Zdefiniuj metodę publiczną o nazwie getStatus, która zwraca tekstowy obiekt String)
        return "Crypto Tracker Java Backend is running successfully!";  // Return a welcome confirmation text string back to the HTTP web client (Zwróć powitalny tekst potwierdzenia z powrotem do klienta internetowego HTTP)
    }  

}  