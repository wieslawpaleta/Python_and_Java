package com.example.demo;  // Declarar el paquete al que pertenece esta clase (Zadeklaruj pakiet, do którego należy ta klasa)

import org.springframework.stereotype.Service;  // Importar la anotación Service para indicar a Spring que esta clase contiene lógica de negocio (Importuj adnotację Service, aby wskazać Springowi, że ta klasa zawiera logikę biznesową)
import java.io.BufferedReader;  // Importar BufferedReader para leer archivos de texto de manera eficiente línea por línea (Importuj BufferedReader, aby wydajnie czytać pliki tekstowe linia po linii)
import java.io.FileReader;  // Importar FileReader para abrir y leer el contenido de un archivo desde el disco duro (Importuj FileReader, aby otworzyć i odczytać zawartość pliku z dysku twardego)
import java.io.IOException;  // Importar IOException para capturar errores si el archivo no existe o no se puede leer (Importuj IOException, aby przechwycić błędy, jeśli plik nie istnieje lub nie można go odczytać)
import java.util.ArrayList;  // Importar ArrayList para crear una lista dinámica donde guardaremos los precios (Importuj ArrayList, aby utworzyć dynamiczną listę, w której zapiszemy ceny)
import java.util.List;  // Importar la interfaz List para definir el tipo de colección que devolverá el método (Importuj interfejs List, aby zdefiniować typ kolekcji zwracanej przez metodę)

@Service // Marcar esta clase como un servicio gestionado automaticamente por Spring Boot (Oznacz tę klasę jako serwis zarządzany automatycznie )
public class CryptoService {
    
}
