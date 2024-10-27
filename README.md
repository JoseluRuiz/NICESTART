![login](https://github.com/user-attachments/assets/31929424-26d9-438a-97c3-bf795f7e80da)


Esta imagen muestra la pestaña "Login".
Está conformado por dos cuadros de texto editables, tres botones, un logo, una imagen de fondo, una barra inferior y un gradiente.

Los textos editables son "EditText" introducidos dentro de un "Fieldset" a su vez ajustados entre dos "GuideLines".

Los 3 botones tienen funciones distintas: 
El primer botón es para el inicio de sesión, tendrías que introducir tus datos para poder iniciar sesión. A su vez ese boton te llevaría a la pestaña de "Main" la cual contiene una barra en la parte superior de la pantalla y en este caso solo se ve la pantalla blanca debido a que no hay contenido.

![main](https://github.com/user-attachments/assets/8080d549-e6ce-4071-8744-6180498e6a49)

El segundo botón es para el resgistro, al presionarlo te llevará a la pestaña de "SignUp", en esta pestaña se aprecia una estructura parecida a la de "Login" con el logo, dos botones, una imagen de fondo, un gradiente, una barra inferior y una barra superior que contiene una flecha, con la flecha puedes retornar hacia atrás y situarte en la pestaña "Login".

Las funcionalidades son practicamente las mismas, el primer botón sirve para inciar sesión por lo tanto, te conducirá a la pestaña de "Main" y el segundo boton de Cancelar es otra manera de redirigirte a la pestaña de "Login".

![signup](https://github.com/user-attachments/assets/06c019b5-fe51-4488-a5f4-e978c131ebb2)

El tercer botón es simplemente una adición extra para poder ejecutar un MERGE sobre la rama Master, si lo presionas te conducirá a una pestaña alternativa llamada "Terms".

![terms](https://github.com/user-attachments/assets/6d82fbff-abf6-4f1a-9cda-1f3a31be1579)




En cuanto al contenido de los XML, tiene visible los diferentes objetos usados en cada pantalla.

Los XML de Login "activity_login.xml" y SignUp"activity_signup.xml" constan de:

Un view general donde se eligen altura y anchura, orientación y los contraints para el ajuste.
Dos ImageViews una para el logo y otro para la imagen de fondo. Se eligen las dimensiones, la transparencia y los constraints. En este caso la imagen de fondo posee una peculiaridad, a diferencia del logo, se referencia a la imagen desde el "Login.java" mediante las librerías GLIDE.
Dos EditTexts dentro de un FieldSet cada uno. Se eligen las dimensiones y las constraints para mantenerlos entre los GuideLines.
Dos botones. Se eligen dimensiones, constraints y colores, añadiendo funcionalidades particulares como la función "onclick" y el estilo. La función "onclick" sirve para que cuando lo presiones te ejecute cierta función y realice cierta acción (se puede ver en "styles.xml"). Y el style es para establecer las carecterísticas del botón.
Dos GuideLines para mantener en una posición fija los botones y los fieldsets.

Los java De "Login.java" y "SignUp.java" constan de:
"Desde aquí se puede mostrar la imagen del fondo."
La declaración de el ImageView.
El uso de la librería GLIDE con la cual podemos referirnos a la imagen y hacer que se muestre en pantalla, excluyendo el "src" en el XML.
Los métodos para hacer la transición entre pestañas, usando Intent.

En el AndroidManifest se delcaran las actividades con la clase referida, en caso de querer retornar a cierta pestaña, hay que hacer uso del "parentActivityName".
En el Themes.xml se declaran las barras de acción, que vienen a ser las barras superiores que aparecen en algunas pestañas.
En el gradle se introducen las librerías.









