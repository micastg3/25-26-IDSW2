## Diagrama UML


@startuml
Interlocutor -- Mensaje
Mensaje .. Metodo_de_comunicacion
Interlocutor o-- Metodo_de_comunicacion
Mensaje o-- Contexto
@enduml


## Descripcción


Una conversación necesita interlocutores, los cuales darán o recibirán mensajes, los cuales pueden ser temporales y olvidarse, además de que algunos mensajes pueden no tener interlocutores. Suponiendo esto, Interlocutores y mensajes no son dependientes entre sí.


El mensaje se transmite usando un método de comunicación, así que la relación de uso es obvia. Además el interlocutor aprende estos métodos progresivamente, así que debe ser una agregación.


Por último, un mensaje puede variar dependiendo del contexto, el cual se puede quitar del mensaje o ser cambiado por quienes lo reciben (esto podría implicar relación entre Interlocutor y contexto.)
