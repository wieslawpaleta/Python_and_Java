package com.example.demo; // Declare the package name grouping related application classes together (Zadeklaruj nazwę pakietu grupującego klasy aplikacji razem)

import org.springframework.web.bind.annotation.GetMapping;  // Importar la anotación GetMapping para responder a peticiones HTTP GET (Importuj adnotację GetMapping, aby odpowiadać na żądania HTTP GET)
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;  // Importar RequestMapping para definir la ruta base de este controlador (Importuj RequestMapping, aby zdefiniować ścieżkę bazową tego kontrolera)
import org.springframework.web.bind.annotation.RestController;  // Importar RestController para indicar que este controlador devuelve datos (JSON/texto) directamente (Importuj RestController, aby wskazać, że ten kontroler zwraca dane JSON/tekst bezpośrednio)
import java.util.List;  // Importar List para poder devolver la lista de precios de criptomonedas (Importuj List, aby móc zwrócić listę cen kryptowalut)


@RestController  // Indicar a Spring Boot que esta clase es un controlador web REST (Wskaż Spring Bootowi, że ta klasa jest kontrolerem webowym REST)
@RequestMapping("/api/crypto")  // Establecer el prefijo de ruta común '/api/crypto' para todos los endpoints de esta clase (Ustaw wspólny prefiks ścieżki '/api/crypto' dla wszystkich punktów końcowych w tej klasie)
public class CryptoController {  // Declarar la clase pública CryptoController (Zadeklaruj publiczną klasę CryptoController)

    private final CryptoService cryptoService;  // Declarar una referencia privada y constante hacia nuestro servicio CryptoService (Zadeklaruj prywatną i stałą referencję do naszego serwisu CryptoService)

    public CryptoController(CryptoService cryptoService) {  // Crear un constructor para que Spring Boot inyecte automáticamente el servicio (Inyección de Dependencias) (Utwórz konstruktor, aby Spring Boot automatycznie wstrzyknął serwis - Wstrzykiwanie Zależności)
        this.cryptoService = cryptoService;  // Guardar el servicio inyectado en el atributo interno de este controlador (Zapisz wstrzyknięty serwis w wewnętrznym atrybucie tego kontrolera)
    }  // Cerrar el constructor (Zamknij konstruktor)

    @GetMapping("/status")  // Mapear peticiones GET a '/api/crypto/status' para comprobar que el servidor funciona (Zmapuj żądania GET na '/api/crypto/status', aby sprawdzić, czy serwer działa)
    public String getStatus() {  // Definir el método getStatus que devuelve un texto simple (Zdefiniuj metodę getStatus, która zwraca prosty tekst)
        return "Crypto Tracker Java Backend is running successfully!";  // Devolver el mensaje de confirmación en texto plano (Zwróć komunikat potwierdzenia w czystym tekście)
    }  // Cerrar el método getStatus (Zamknij metodę getStatus)

    @GetMapping("/prices")  // Mapear peticiones GET a '/api/crypto/prices' para obtener todos los precios guardados (Zmapuj żądania GET na '/api/crypto/prices', aby pobrać wszystkie zapisane ceny)
    public List<CryptoPrice> getPrices() {  // Definir el método getPrices que devuelve una lista de objetos CryptoPrice (Spring la convertirá a JSON) (Zdefiniuj metodę getPrices, która zwraca listę obiektów CryptoPrice - Spring zamieni ją na JSON)
        return cryptoService.getAllPricesFromCsv();  // Llamar al método del servicio para leer el CSV y devolver el resultado directamente (Wywołaj metodę serwisu, aby odczytać CSV i zwrócić wynik bezpośrednio)
    }  // Cerrar el método getPrices (Zamknij metodę getPrices)

    @GetMapping("/stats/{symbol}")  // Mapear peticiones GET hacia '/api/crypto/stats/{symbol}' para devolver las estadísticas de esa moneda (Zmapuj żądania GET na '/api/crypto/stats/{symbol}', aby zwrócić statystyki tej waluty)
    public CryptoStats getStatsBySymbol(@PathVariable String symbol) {  // Capturar el símbolo desde la URL y pasarlo al método (Przechwyć symbol z adresu URL i przekaż go do metody)
        return cryptoService.getStatsBySymbol(symbol);  // Llamar al servicio para calcular las estadísticas y devolverlas en formato JSON (Wywołaj serwis, aby obliczyć statystyki i zwrócić je w formacie JSON)}
}  // Cerrar el cuerpo de la clase CryptoController (Zamknij ciało klasy CryptoController)
}