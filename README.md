
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

En la carpeta VALUES creamos Themes.xml donde se declaran las barras de acción, que vienen a ser las barras superiores que aparecen en algunas pestañas.

![temaslogin](https://github.com/user-attachments/assets/bf7ca899-ed8a-44a5-bd11-933b84824a56)


https://github.com/user-attachments/assets/8ab40b93-2fbb-48c5-ae40-05f89cb8537d

--Pantalla de carga o activity_splash.xml

Tras implementar unas librerías la pantalla de carga se ve así.
Se ha realizado con la librería SPLASH.

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








