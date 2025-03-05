
-- Activity_login.xml--

![login](https://github.com/user-attachments/assets/31929424-26d9-438a-97c3-bf795f7e80da)

Esta imagen muestra la pestaña "Login".
Está conformado por dos cuadros de texto editables insertados en campos de texto.

![etlogin](https://github.com/user-attachments/assets/3fafc350-a3d1-410f-bb96-95067150647d)

(Dos EditTexts dentro de un FieldSet cada uno. Se eligen las dimensiones y las constraints para mantenerlos entre los GuideLines.)

Tres botones con una estructura bastante similar aunque se diferencia en métodos y estilos. Se eligen dimensiones, constraints y colores,


![btlogin](https://github.com/user-attachments/assets/a0e94e23-dd0f-48e7-af71-b56a15d08913)



Los estilos se puede configurar en la carpeta values:

![estiloslogin](https://github.com/user-attachments/assets/bb2c0262-e21b-4492-b29b-21e8d15a0c92)


una imagen de fondo y un logo,

![ivlogin](https://github.com/user-attachments/assets/d9a2fbcb-fd81-4975-b397-51edab09c675)

(Un view general donde se eligen altura y anchura, orientación y los contraints para el ajuste.
Dos ImageViews una para el logo y otro para la imagen de fondo. Se eligen las dimensiones, la transparencia y los constraints. En este caso la imagen de fondo posee una peculiaridad, a diferencia del logo, se referencia a la imagen desde el "Login.java" mediante las librerías GLIDE.)

una barra inferior y un gradiente.

El gradiente se declara dentro de la etiqeuta constraintlayout.widget.ConstraintLayout con el atributo background;

![gradientelogin](https://github.com/user-attachments/assets/fe431643-1b15-482f-9e66-b3aeffb13d75)


Los textos editables son "EditText" introducidos dentro de un "Fieldset" a su vez ajustados entre dos "GuideLines".

![guidelineslogin](https://github.com/user-attachments/assets/3da993ba-d5c2-4e25-9d57-74c69b1de7e4)


Los 3 botones tienen funciones distintas: 
El primer botón es para el inicio de sesión, tendrías que introducir tus datos para poder iniciar sesión. A su vez ese boton te llevaría a la pestaña de "Main" la cual contiene una barra en la parte superior de la pantalla, una imagen de fondo en circular (manejado desde Main.java) y un gradiente.

![main](https://github.com/user-attachments/assets/284991bb-cbde-45aa-9c79-3d63e8239d01)

El segundo botón es para el registro, al presionarlo te llevará a la pestaña de "SignUp". 

--activity_signup.xml--

![signup](https://github.com/user-attachments/assets/06c019b5-fe51-4488-a5f4-e978c131ebb2)

En esta pestaña se aprecia una estructura parecida a la de "activity_login.xml".

La imagen de fondo y el logo,

![ivsignup](https://github.com/user-attachments/assets/39a751a5-9b3a-46b1-aef3-41b2799567d7)

cuadros de texto dentro de campos de texto,

![etsignup](https://github.com/user-attachments/assets/948a8563-9ee5-4def-9a1d-b51a0aba7f11)

dos botones (el primer botón sirve para inciar sesión por lo tanto, volverá a mostrar "activity_main.xml" y el segundo boton de Cancelar es otra manera de redirigirte a  "activity_login.xml"),

![btsignup](https://github.com/user-attachments/assets/5c9c0628-bed3-445a-81af-f7cfc6ecfbf7)

El tercer botón es simplemente una adición extra para poder ejecutar un MERGE sobre la rama Master, si lo presionas te conducirá a una pestaña alternativa llamada "activity_terms.xml".

![terms](https://github.com/user-attachments/assets/6d82fbff-abf6-4f1a-9cda-1f3a31be1579)


--Login.java--

Desde aquí se muestra la imagen que no está declarada con "src" en el ImageView del XML. Es decir, aquí se hace uso de la librería GLIDE.

![glideloginjava](https://github.com/user-attachments/assets/d3b971fd-592a-4e3a-8971-273ba331fa1d)

También incluye unos métodos simples para cambiar de activities, mediante los botones.
Se utiliza la clase Intent para realizar dicho cambio.

![metodosloginjava](https://github.com/user-attachments/assets/2f2cdde6-c598-41fa-af35-dc045dabe433)

--SignUp.java--

Esta actividad contiene un GLIDE para mostrar la imagen y los métodos para las transiciones de pantallas.

![glidemetodossignup](https://github.com/user-attachments/assets/f592bb55-37e9-40f5-bfd8-2489d1fb4a78)


-- AndroidManifest.xml--
En el AndroidManifest se declaran las actividades con la clase referida, en caso de querer retornar a cierta pestaña, hay que hacer uso del "parentActivityName".

![manifest](https://github.com/user-attachments/assets/6a1dee20-efbf-4077-ae89-eba9857d1fa8)

En la carpeta de recursos VALUES creamos Themes.xml donde se declaran las barras de acción, que vienen a ser las barras superiores que aparecen en algunas pestañas.

![temaslogin](https://github.com/user-attachments/assets/bf7ca899-ed8a-44a5-bd11-933b84824a56)


https://github.com/user-attachments/assets/8ab40b93-2fbb-48c5-ae40-05f89cb8537d

--Pantalla de carga o activity_splash.xml--

Tras implementar unas librerías la pantalla de carga se ve así.
Se ha realizado con la librería SPLASH.
Para agregar las animaciones hay que crear una carpeta de recursos de tipo anim.
Dicha carpeta incluirá todas las animaciones que desees.

Se crea la clase Splash.java y su layout correspondiente.

--Splash.java--

Las animaciones implementadas en el logo son las siguientes:

![animacioneslogo](https://github.com/user-attachments/assets/736c0e82-b438-46e2-b8a3-621069d8321b)

Hay una etiqueta SET para poder establecer todos las animaciones al mismo objeto. Contiene la etiqueta ALPHA, sirve para dar un toque intermitencia o un pestañeo, se define por los atributos duration para la duración de la animación, fromAlpha - to Alpha siendo el nivel de transparencia y repeatCount, repeatMode para repetir la secuencia de intermitencia. La etiqueta SCALE es para el tamaño del logo, se define por los atributos duration, fromXScale,fromYScale - toXScale,toYScale para dicho tamaño y pivotX, pivotY  para establecer el puntom de apoyo o eje, en este caso sería un "zoom out" porque el tamaño inicial es mayor que el tamaño final. La etiqueta TRANSLATE sirve para poder transladar un objeto de un sitio a otro, contiene los atributos duration y fromXDelta, fromYDelta que son los puntos de origen y destino del logo, hay que agregar que este translado se conoce como "slidedown" ya que el movimiento va orientado hacia arriba.


![animacionestitulo](https://github.com/user-attachments/assets/5af663dc-cd08-4f7d-aeab-c52fab3606f4)

Hay una etiqueta SET para poder establecer todos las animaciones al mismo objeto. Contiene la etiqueta ROTATE que sirve para rotar un objeto de un punto a otro sobre un eje, contiene los atributos   duration, fromDegrees - toDegrees, ahí se fija de que grado a que grado va a rotar, pivotX,pivotY para establecer el eje en el cual se va a rotar y repeatMode, repeatCount numeros de repeticiones y modo. Acompañado de una etiqueta SCALE que en este caso será un "zoom in".

--activity_splash.xml--
Contiene las imagenes, iconos y textos que aparecerán en la pantalla de carga.

![ivsplash](https://github.com/user-attachments/assets/6c07f364-42bc-420f-a2a9-58b3fcccd021)

Para la tipografía hay que crear la carpeta de recursos de  tipo font.
Dentro de esta carpeta irán las tipografías en forma de xml.

![fuentessplash](https://github.com/user-attachments/assets/d61201d6-5cfa-4078-96d7-c0a672f8e5f9)


También se producen cambios en el AndroidManifest.xml
Se añaden las características del inicio de la aplicación.

![manifestsplash](https://github.com/user-attachments/assets/69770a0f-aead-409d-b7da-27e80b584ed6)



También hemos creado la actividad profile que vendría a ser una pantalla con los datos de usuario.
--activity_profile.xml--

![profile](https://github.com/user-attachments/assets/324c2fde-49f9-4e94-aa0c-7ee15bb9c5a9)

Ha sido realizada con 4 editexts y un logo.

--Profile.java--
En este caso, la clase no contiene nada, en un futuro se agregarán métodos y funcionalidades para hacer un uso de esta clase.


Ahora le vamos a agregar funcionalidades a la barra superior mostrada en el Main.java, se realiza creando una carpeta de recursos de tipo menu.
Dicha carpeta incluirá el tipo de menu y su estructura.
En este caso hemos creado dos tipos de menu: Uno contextual o otro representa menu de la barra superior.

--menu_context.xml--

![menucontext](https://github.com/user-attachments/assets/a94d64da-a273-4b14-a26d-2b14b780e7f8)


Contiene los items que apareceran en la barra superior. ShowAsAction es el atributo que permite elegir como se va a mostrar en pantalla el item, si hay un logo "ifRoom" significa que hay hueco para el logo que representa dicho item, en cambio, si es "never" no se representa con un logo, si no que muestra el título o simplemente 3 puntos.


--menu_aptbar.xml--

![appbar](https://github.com/user-attachments/assets/2c24a220-cd98-446b-bcbf-8790a9870253)



En este caso hay un menu dentro del item, siginifica que al pulsar dicho item aparece el menu que contiene los items con distintas opciones.


Para hacer que funcionen los menus, se configuran desde la clase donde se muestra, en este caso es Main.java


--activity_main.xml--

Se ha añadido un WebView que mostrará imágenes en el fondo de la actividad. Aparte de el uso de la librería SwipeRefreshLayout para poder actualizar la pantalla cada vez que se arrastra hacia abajo, la cual se implementa desde build.gradle.kts.

![refreshywebview](https://github.com/user-attachments/assets/b65d7511-0fe5-4ac5-b7e0-961677ee786b)


--Main.java--

Para conseguir el efecto de arrastrar hacia abajo con SwipeRefreshLayout y que el WebView se actualice hay que hacer lo siguiente:

Se declaran y se establecen métodos:

![metodosswiperefreshwv](https://github.com/user-attachments/assets/0ca530e9-76f4-41a3-b8b6-bf9192405832)

Se crea el método onRefresh() que mostrará un Snackbar, que viene siendo una notificación, que indica que la actualización se ha realizado.

![metodoonrefresh](https://github.com/user-attachments/assets/3dea2ff7-be26-4877-b69c-8bd01edad06d)


![snackbar](https://github.com/user-attachments/assets/cbbe1c3b-d58a-4d40-a9e6-26531651ea1b)


El codigo para configurar la barra de aplicaciones es el siguiente:

![codigoappbar](https://github.com/user-attachments/assets/d3792f12-6640-4468-9af6-3ab00764469b)

En este caso la barra luce así: 

![barrasuperior](https://github.com/user-attachments/assets/7f62e940-12f9-44e2-b8ec-b13ace23bb89)

Está compuesta por el título de la aplicación y dos logos: el primero representa la opción "Copy" y el segundo representa la opción "Settings" está representada mediante los tres puntos. Al pulsarlo aparece este menú:

![appbaropciones](https://github.com/user-attachments/assets/290c989c-2ed8-46c8-8632-fe6a40454c7f)

Al pulsar cualquiera de los dos saldrá un toast o notificación:

![toast](https://github.com/user-attachments/assets/d7c8c7bb-d999-4fb2-a756-81b5ba68ccfb)


Las dos primeras opciones no tienen ningún funcionamiento pero al presionar la última opción saltará una ventana: 


![alerta](https://github.com/user-attachments/assets/eb7b01b4-0e25-4274-a051-39990e9efaf4)


En este caso, solo sale una opción, "Scrolling" al pulsarla te lleva a Profile.java, contiene básicamente un intent.


El codigo para configurar la barra contextual es el siguiente:


![codigocontext](https://github.com/user-attachments/assets/f832a92b-4d02-42fc-bbda-af43d6163670)

Tiene las opciones "Copy" y "Download" que al pulsarlas mostrará un toast.

En pantalla se ve así:

![copydownload](https://github.com/user-attachments/assets/6a6453cb-8d66-4bcf-88b9-6ab17e534d01)


Tras la codificación, la pantalla de Main.java luce así:

![mainwebview](https://github.com/user-attachments/assets/e67e293c-a693-44c2-8c16-aca180431b5b)

-- activity_mainbab.xml --

![cod_mainbab](https://github.com/user-attachments/assets/a6ff27a4-e045-4082-85d8-365c748b0e70)

Esta clase contiene un cordinador con una BottomAppBar (una barra inferior para seleccionar diferentes opciones a elegir), encima de dicha barra se encuentra un FAB (floating action button). Si el diseño del FAB quieres que sea en modo "cuna" se haría con fabAnchorMode y luego ya se cambian las propiedades en relación a la cuna.
La barra contiene el atributo menu. Menu sirve para plasmar la estructura de un menu dentro de una barra y mostrar los iconos. La estructura del menu es la misma a la que hemos realiazado anteriormente.


![appbar](https://github.com/user-attachments/assets/9ef924e9-35cb-431d-9eb4-9efcd7fedf57)


--MainBab.java --

Las clase Java de mainbab contiene lo siguiente: 

![javaappbar](https://github.com/user-attachments/assets/52b52eff-be51-4544-a72d-8306376fca01)

La funcionalidad de este código es sencilla, si pulsas en los botones, te mostrará unas notificaciones sobre lo que has pulsado. El único inconveniente es que no se pueden poner los iconos a la izquierda.

Tras hacer todo, debería quedarte algo así:

![imagendeappbar](https://github.com/user-attachments/assets/c02b89e2-1f01-4763-b19c-d97907c96b01)


-- activity_main_bn.xml --

Esta actividad está compuesta por fragmentos. Es decir, la barra está en una actividad "principal" donde se irán mostrando los diferentes fragmentos, ya sea deslizando de un lado a otro o clicando sobre un icono.

![cod_mainbn](https://github.com/user-attachments/assets/bb67bf6a-b3fe-46a5-9563-a3f4097b8755)


Este código contiene un AppbarLayout (una barra inferior para seleccionar diferentes opciones a elegir), dentro de esta barra está contenido hay TabLayout que permite hacer ese cambio entre fragmentos.
A esta actividad se le suma un ViewPager y un BottomNavigationView, sirven para la estética, control y funcionalidad de la barra.


Dentro de la etiqueta BottomNavigationView, se encuentra el atributo menu. Menu permite mostrar la estructura de un menu ya formado en la carpeta menus.

![bottomnavmenu](https://github.com/user-attachments/assets/de490a62-0e44-4213-8b9e-9748d0e02691)

Este es el contenido que tiene la clase bottom_navigation_view.xml, que como los otros menús, sigue la misma estructura.

-- MainBN.java --

Primero se declaran las variables que se vayan a utilizar.

![declaracionvariablesmainbn](https://github.com/user-attachments/assets/7c989c9e-8158-463e-b1cf-6a9c71f78169)

A continuación, se le da funcionalidad a las distintas opciones del menú, cada vez que cliques a un ícono te salta una notificación y se cambia a su respectivo fragmento.

![opcionesmainbn](https://github.com/user-attachments/assets/becd99c3-738c-4aaf-8d9c-26547fe44dfd)

El viewpager es el que permite la transición entre fragmentos, cabe recalcar que es recomendable crear una carpeta "Fragments" para tener todos los fragmentos apartados de las actividades y los adaptadores de dichos fragmentos en otro paquete a su vez.
Los fragmentos a mostrar en este caso, no tienen ningún contenido, por lo tanto no hace falta modificar nada del código. Lo único que hay que modificar son los adaptadores.


![estructurafragments](https://github.com/user-attachments/assets/f4f90fde-f993-4311-b99a-43bd3bb87557)



![helpviewpager](https://github.com/user-attachments/assets/b967714f-0084-4591-9530-20a2381c455b) 



![sectionpageadapter](https://github.com/user-attachments/assets/4774c112-59df-45af-b05f-411e7175b6e5)

Al final, los fragmentos deberían lucir así: 


![imagenfragment1](https://github.com/user-attachments/assets/ed8be37c-9672-4ebe-8134-b477902f27a2)        ![imagenfragment2](https://github.com/user-attachments/assets/8c5d8022-35ac-4309-b1f8-0f97a96a1040)



También hemos hecho cambios para la adaptabilidad del usuario, los colores cambian al cambiar de idioma y de tema en el telefono.

Para el idioma, vamos a nuestra clase strings.xml, le damos click derecho y seleccionamos la opción Open Translations Editor.
Arriba a la izquierda habrá un más, ahí seleccionas el idioma. 

![translationeditor](https://github.com/user-attachments/assets/e30b6fd1-bad9-46f7-b388-684a041b3114)

Al seleccionar idioma, aparecerá esto en la carpeta values: 

![strings](https://github.com/user-attachments/assets/87592db5-5b5f-4c8b-be33-b002b24adbfe)


Tenemos el string normal: 

![stringnormal](https://github.com/user-attachments/assets/4652f2b8-611e-411c-91c1-6ca69b87c2e5)

Y en la nueva clase string creada en la cual aparece una bandera del país del idioma: 

![stringaleman](https://github.com/user-attachments/assets/b0defba6-7250-4cb4-b9d5-109e07c4ae8d)

El resultado se verá así:


![pantallastringnormal](https://github.com/user-attachments/assets/1a723b7e-d9f5-4b16-904c-58aff64993ce)      ![pantallastringcambiado](https://github.com/user-attachments/assets/f20ddec6-7a85-4d9a-a680-7fcf85f1913e)


En cuanto al modo, se pueden controlar los colores de los elementos del proyecto.
Se crea una archivo colors (night) dentro de la carpeta colors. De esta forma: 

![crearnightmode](https://github.com/user-attachments/assets/4be16484-c8cd-4278-a3ce-d1688b50b26c)


Dentro de ese archivo, se modifican los colores a tu gusto. En mi caso ha quedado así: 


![temaclaro](https://github.com/user-attachments/assets/ebb18afc-814b-4f0f-9b0d-57da5214fff5)    ![temaoscuro](https://github.com/user-attachments/assets/8c8c40bd-3edc-461c-b8e6-0dd9308dae32)




Para finalizar haremos el landscape, es decir orientación horizontal.

Para crearlo accedemos al xml al que se lo queremos aplicar y en la actividad presionamos su nombre y creamos el landscape.

![image](https://github.com/user-attachments/assets/aa21dcef-684b-47e3-99f2-f8080e5795a0)

Se creará una carpeta de esa actividad, una en orientación vertical y otra en orientación horizontal.

El resultado será así: 


![orientacionhorizontal](https://github.com/user-attachments/assets/db18bb0c-0eaa-4970-8c38-bf82cf9226d3)







