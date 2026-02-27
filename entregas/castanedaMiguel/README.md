## Diagrama UML


<p align="center">
  <img src="https://www.plantuml.com/plantuml/png/SoWkIImgAStDuVBCAqajoibFBYt9BrBGrLNmJSqhJinAHHNNqmEAb-IdvCUdfCOdv-UMvcKc9oPdvkTXA7FE1mfKbEHpGSrHoDVL9KOl7dN8HY7CTqZDIm6w7m00" alt="Diagrama UML">
</p>

## Descripcción


Una conversación necesita interlocutores, los cuales darán o recibirán mensajes, los cuales pueden ser temporales y olvidarse, además de que algunos mensajes pueden no tener interlocutores. Suponiendo esto, Interlocutores y mensajes son independientes entre sí.


El mensaje se transmite usando un método de comunicación, así que la relación de uso es obvia. Además el interlocutor aprende estos métodos progresivamente, así que debe tenere una agregación con ellos.


Por último, un mensaje puede variar dependiendo del contexto con el que viene, el cual se puede quitar del mensaje o ser cambiado por quienes lo reciben.

Las relaciones de uso se debe a que cuando un interlocutor manda un mensaje decide el método de comunicación y el contexto a usar.