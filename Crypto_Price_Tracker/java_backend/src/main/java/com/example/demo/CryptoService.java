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
        String filePath = "C:/Users/użytkownik/Downloads/Program/Python_and_Java/Python_and_Java/Crypto_Price_Tracker/crypto_prices.csv";  // Guardar en una variable de texto la ruta relativa donde Python guardó el archivo CSV (Zapisz w zmiennej tekstowej ścieżkę względną, gdzie Python zapisał plik CSV)

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {  // Abrir el archivo con FileReader dentro de un BufferedReader usando try-with-resources para que se cierre solo al terminar (Otwórz plik za pomocą FileReader wewnątrz BufferedReader używając try-with-resources, aby zamknął się sam po zakończeniu)
            String line;  // Declarar una variable de texto temporal para almacenar cada línea del archivo mientras se lee (Zadeklaruj tymczasową zmienną tekstową do przechowywania każdej linii pliku podczas odczytu)
            
            while ((line = br.readLine()) != null) {  // Iniciar un bucle que lee una línea nueva en cada vuelta mientras no llegue al final del archivo (null) (Rozpocznij pętlę, która czyta nową linię w każdym obrocie, dopóki nie dotrze do końca pliku - null)
                if (line.trim().isEmpty()) {  // Comprobar si la línea está completamente vacía o solo tiene espacios en blanco (Sprawdź, czy linia jest całkowicie pusta lub zawiera tylko białe znaki)
                    continue;  // Saltar esta vuelta del bucle y pasar directamente a la siguiente línea del archivo (Pomiń ten obrót pętli i przejdź bezpośrednio do następnej linii pliku)
                }  // Cerrar el bloque condicional if (Zamknij blok warunkowy if)

                String[] parts = line.split(",");  // Dividir la línea de texto usando la coma como separador y guardar los trozos en un arreglo de textos (Podziel linię tekstu używając przecinka jako separatora i zapisz kawałki w tablicy tekstów)
                
                if (parts.length == 3) {  // Verificar que la línea tenga exactamente 3 columnas: fecha, símbolo y precio (Sprawdź, czy linia ma dokładnie 3 kolumny: datę, symbol i cenę)
                    String timestamp = parts[0].trim();  // Extraer el primer elemento (posición 0), quitar espacios sobrantes y guardarlo como timestamp (Wyciągnij pierwszy element - pozycja 0, usuń zbędne spacje i zapisz jako timestamp)
                    String symbol = parts[1].trim();  // Extraer el segundo elemento (posición 1), quitar espacios sobrantes y guardarlo como symbol (Wyciągnij drugi element - pozycja 1, usuń zbędne spacje i zapisz jako symbol)
                    double price = Double.parseDouble(parts[2].trim());  // Extraer el tercer elemento (posición 2) y convertirlo de texto a número decimal double (Wyciągnij trzeci element - pozycja 2 i skonwertuj go z tekstu na liczbę dziesiętną double)

                    CryptoPrice cryptoPrice = new CryptoPrice(timestamp, symbol, price);  // Crear un nuevo objeto CryptoPrice usando el constructor con los 3 datos extraídos (Utwórz nowy obiekt CryptoPrice używając konstruktora z 3 wyciągniętymi danymi)
                    priceList.add(cryptoPrice);  // Añadir el objeto recién creado a nuestra lista general priceList (Dodaj nowo utworzony obiekt do naszej ogólnej listy priceList)
                }  // Cerrar el bloque de verificación de longitud (Zamknij blok weryfikacji długości)
            }  // Cerrar el bucle while cuando ya no queden más líneas por leer (Zamknij pętlę while, gdy nie ma już więcej linii do przeczytania)
            
        } catch (IOException e) {  // Capturar cualquier error de entrada/salida, por ejemplo si no se encuentra el archivo CSV (Przechwyć dowolny błąd wejścia/wyjścia, na przykład jeśli plik CSV nie zostanie znaleziony)
            System.err.println("Error al leer el archivo CSV: " + e.getMessage());  // Imprimir el mensaje de error en la consola de errores del sistema (Wypisz komunikat o błędzie w konsoli błędów systemu)
        }  // Cerrar el bloque catch (Zamknij blok catch)

        return priceList;  // Devolver la lista completa con todos los objetos CryptoPrice leídos del archivo (Zwróć kompletną listę ze wszystkimi obiektami CryptoPrice odczytanymi z pliku)
    }  // Cerrar el cuerpo del método getAllPricesFromCsv (Zamknij ciało metody getAllPricesFromCsv)

}  // Cerrar el cuerpo de la clase CryptoService (Zamknij ciało klasy CryptoService)