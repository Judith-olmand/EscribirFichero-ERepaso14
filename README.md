# Escritura de Archivos de Texto (Repaso 14)

Programa en Java que implementa la persistencia de datos básica mediante la creación y escritura de archivos externos en el sistema de archivos local.

## 🚀 Funcionalidades
* **Persistencia Externa:** Permite guardar información en un archivo de texto (`.txt`), asegurando que los datos no se pierdan al finalizar la ejecución.
* **Modo Append (Añadir):** Utiliza la configuración de escritura adjunta para agregar nuevos nombres al final del archivo sin borrar el contenido previo.
* **Nombres Personalizados:** Solicita al usuario el nombre del archivo de destino, ofreciendo flexibilidad para organizar diferentes listas de datos.
* **Gestión de Recursos Segura:** Implementa el bloque *try-with-resources* para garantizar que el flujo de escritura se cierre correctamente, incluso si ocurre un error.

## 🛠️ Estructura técnica
El código demuestra el manejo de flujos de salida (Output Streams) de Java:
* **`FileWriter`**: Clase fundamental para escribir flujos de caracteres en archivos.
* **Constructor `FileWriter(archivo, true)`**: El segundo parámetro booleano activa el modo de anexado, evitando la sobrescritura del fichero.
* **Manejo de `IOException`**: Captura errores críticos del sistema, como falta de permisos o rutas inválidas, mejorando la robustez de la aplicación.
* **Secuencias de Escape (`\n`)**: Utilizadas para estructurar el archivo de texto de forma que cada registro ocupe una línea independiente.