# Papeleria
Por supuesto, aquí tienes el proyecto completo de la aplicación de papelería, incluyendo la descripción, las tecnologías utilizadas, los requisitos previos, la instalación, el uso, el diseño único, la estructura del proyecto, cómo contribuir, notas y la licencia:

---

# Papelería App

Este proyecto es una aplicación web de papelería construida con Spring Boot, MongoDB y Thymeleaf. La aplicación permite gestionar productos, inventarios y ventas de una papelería de manera eficiente, ofreciendo una experiencia única tanto para administradores como para clientes.

## Tecnologías Utilizadas

- Java 17
- Spring Boot 2.5
- Spring Data MongoDB
- Thymeleaf
- Maven
- Bootstrap 
- Semantic UI
- Bulma
- AJAX

## Requisitos Previos

Antes de comenzar, asegúrate de tener instalado lo siguiente:

- JDK 17 o superior
- Maven 3.6.3 o superior
- MongoDB 4.4 o superior

## Instalación

1. Clona el repositorio:

    ```bash
    git clone https://github.com/tu-usuario/papeleria-app.git
    cd papeleria-app
    ```

2. Configura MongoDB:

    Asegúrate de que MongoDB esté instalado y ejecutándose. La aplicación usará la base de datos `papeleria_db` por defecto.

3. Configura el archivo de propiedades:

    Modifica el archivo `src/main/resources/application.properties` según sea necesario:

    ```properties
    spring.data.mongodb.uri=mongodb://localhost:27017/papeleria_db
    server.port=8080
    ```

4. Compila y ejecuta la aplicación:

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

    La aplicación estará disponible en [http://localhost:8080](http://localhost:8080).

## Uso

### Funcionalidades para Administradores

#### Gestión de Productos

- **Agregar Producto:** Permite añadir nuevos productos a la base de datos.
- **Listar Productos:** Muestra todos los productos disponibles.
- **Actualizar Producto:** Permite modificar los detalles de un producto existente.
- **Eliminar Producto:** Elimina un producto de la base de datos.

#### Gestión de Inventarios

- **Ver Inventario:** Muestra el inventario actual de productos.
- **Actualizar Inventario:** Permite actualizar las cantidades de productos en el inventario.

#### Gestión de Ventas

- **Registrar Venta:** Permite registrar una nueva venta.
- **Historial de Ventas:** Muestra el historial de todas las ventas realizadas.

### Funcionalidades para Clientes

#### Catálogo de Productos

- **Ver Productos:** Muestra todos los productos disponibles con sus detalles y precios.
- **Buscar Productos:** Permite buscar productos específicos por nombre o categoría.

#### Compras

- **Añadir al Carrito:** Permite a los clientes añadir productos a su carrito de compras.
- **Ver Carrito:** Muestra los productos añadidos al carrito.
- **Realizar Pedido:** Permite a los clientes finalizar su compra y realizar un pedido.

## Diseño Único

La aplicación cuenta con un diseño moderno y atractivo, gracias al uso de Bootstrap 4 y plantillas personalizadas en Thymeleaf, que garantizan una experiencia de usuario intuitiva y agradable tanto para administradores como para clientes.

## Estructura del Proyecto

- `src/main/java/com/tuusuario/papeleria`: Código fuente principal.
- `src/main/resources/templates`: Plantillas Thymeleaf.
- `src/main/resources/static`: Archivos estáticos (CSS, JS, imágenes).
- `src/main/resources/application.properties`: Archivo de configuración.

## Contribuir

Las contribuciones son bienvenidas. Puedes hacerlo siguiendo estos pasos:

1. Haz un fork del proyecto.
2. Crea una rama con tu nueva funcionalidad (`git checkout -b nueva-funcionalidad`).
3. Realiza los cambios necesarios y comete tus cambios (`git commit -am 'Añadir nueva funcionalidad'`).
4. Sube tus cambios a la rama (`git push origin nueva-funcionalidad`).
5. Abre un pull request con tu nueva funcionalidad.

## Notas

- Recuerda seguir las buenas prácticas de codificación y documentación.
- Si encuentras algún problema o bug, por favor abre un issue en el repositorio.

## Licencia

Este proyecto está bajo la licencia MIT.

Evidencias del Funcionomiento.

![image](https://github.com/UTS23/Papeleria/assets/112002842/bf47de45-2776-4120-8450-a26a83542f78)
![image](https://github.com/UTS23/Papeleria/assets/112002842/4805fe1c-ffb0-4304-b80d-cc6dea9bb2a9)
![image](https://github.com/UTS23/Papeleria/assets/112002842/8eb85ecd-0036-4e71-9220-776277649156)
![image](https://github.com/UTS23/Papeleria/assets/112002842/3246e65d-95cd-4203-aa43-9224a8f08aa6)
![image](https://github.com/UTS23/Papeleria/assets/112002842/ad8859aa-9ed8-4209-848c-5d571a8335f7)
![image](https://github.com/UTS23/Papeleria/assets/112002842/4fe5265c-beaa-442c-a97b-613ab3c2ce7f)
![image](https://github.com/UTS23/Papeleria/assets/112002842/3c74e196-3e1f-49d8-bd04-eebf424f1af6)
![image](https://github.com/UTS23/Papeleria/assets/112002842/eec68264-0340-43a2-8361-33cc9ae27f55)
![image](https://github.com/UTS23/Papeleria/assets/112002842/fc8ea004-7e81-4661-b1ac-f06f947cf629)
![image](https://github.com/UTS23/Papeleria/assets/112002842/8f18857b-5c04-4505-aac7-e54633402e80)
![image](https://github.com/UTS23/Papeleria/assets/112002842/acd3a1be-92d4-44a4-a245-c978166c58b2)
![image](https://github.com/UTS23/Papeleria/assets/112002842/235ad6ca-b6dc-47cc-a56a-946840953845)
![image](https://github.com/UTS23/Papeleria/assets/112002842/da93e129-ebba-4b01-8277-c4fa989bb620)
![image](https://github.com/UTS23/Papeleria/assets/112002842/db9ce8e9-0dd7-428f-a6bb-62c080d6ee59)
![image](https://github.com/UTS23/Papeleria/assets/112002842/6473619a-e5b4-4187-b00b-c0ae740e8f90)







