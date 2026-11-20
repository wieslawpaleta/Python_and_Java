package com.example.demo;  // Declarar el paquete al que pertenece esta clase (Zadeklaruj pakiet, do którego należy ta klasa)

import org.springframework.stereotype.Service;  // Importar la anotación Service para indicar a Spring que esta clase contiene lógica de negocio (Importuj adnotację Service, aby wskazać Springowi, że ta klasa zawiera logikę biznesową)
import java.io.BufferedReader;  // Importar BufferedReader para leer archivos de texto de manera eficiente línea por línea (Importuj BufferedReader, aby wydajnie czytać pliki tekstowe linia po linii)
import java.io.FileReader;  // Importar FileReader para abrir y leer el contenido de un archivo desde el disco duro (Importuj FileReader, aby otworzyć i odczytać zawartość pliku z dysku twardego)
import java.io.IOException;  // Importar IOException para capturar errores si el archivo no existe o no se puede leer (Importuj IOException, aby przechwycić błędy, jeśli plik nie istnieje lub nie można go odczytać)
import java.util.ArrayList;  // Importar ArrayList para crear una lista dinámica donde guardaremos los precios (Importuj ArrayList, aby utworzyć dynamiczną listę, w której zapiszemy ceny)
import java.util.List;  // Importar la interfaz List para definir el tipo de colección que devolverá el método (Importuj interfejs List, aby zdefiniować typ kolekcji zwracanej przez metodę)

@Service  // Marcar esta clase como un servicio gestionado automáticamente por Spring Boot (Oznacz tę klasę jako serwis zarządzany automatycznie przez Spring Boot)
public class CryptoService {  // Declarar la clase pública CryptoService encargada de procesar los datos (Zadeklaruj publiczną klasę CryptoService odpowiedzialną za przetwarzanie danych)

    public List<CryptoPrice> getAllPricesFromCsv() {  // Definir un método público que devuelve una lista de objetos CryptoPrice (Zdefiniuj publiczną metodę zwracającą listę obiektów CryptoPrice)
        List<CryptoPrice> priceList = new ArrayList<>();  // Crear una lista vacía de tipo ArrayList para ir llenándola con los datos leídos (Utwórz pustą listę typu ArrayList, aby wypełniać ją odczytanymi danymi)
        String filePath = "../python-collector/crypto_prices.csv";  // Guardar en una variable de texto la ruta relativa donde Python guardó el archivo CSV (Zapisz w zmiennej tekstowej ścieżkę względną, gdzie Python zapisał plik CSV)

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {  // Abrir el archivo con FileReader dentro de un BufferedReader usando try-with-resources para que se cierre solo al terminar (Otwórz plik za pomocą FileReader wewnątrz BufferedReader używając try-with-resources, aby zamknął się sam po zakończeniu)
            String line;  // Declarar una variable de texto temporal para almacenar cada línea del archivo mientras se lee (Zadeklaruj tymczasową zmienną tekstową do przechowywania każdej linii pliku podczas odczytu)
            
            while ((line = br.readLine()) != null) {  // Iniciar un bucle que lee una línea nueva en cada vuelta mientras no llegue al final del archivo (null) (Rozpocznij pętlę, która czyta nową linię w każdym obrocie, dopóki nie dotrze do końca pliku - null)
                if ((line = br.readLine()) != null) { //

                }
            }
        }
    }
    
}
