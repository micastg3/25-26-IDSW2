class Interlocutor {
    private String nombre;
    private Metodo_de_comunicacion[] mc;
   
    public Interlocutor(String nombre, Metodo_de_comunicacion[] mc) {
        this.nombre = nombre;
        this.mc=mc;
    }
}


class Mensaje {
    private String contenido;
    private Contexto contexto;
    public Mensaje(String contenido, Contexto contexto){
        this.contenido=contenido;
        this.contexto=contexto;
    }
    public void(Metodo_de_comunicacion mc){
           System.out.println("Este mensaje se transmite mediante" + mc.getNombre);
    }
}


class Metodo_de_comunicacion{
    private String nombre;
   
    public Metodo_de_comunicacion(String nombre){
        this.nombre=nombre;
    }
    public getNombre(){
        return.nombre;
    }
}


class Contexto{
    private nombre;
    public Contexto(String nombre){
        this.nombre=nombre;
    }
}
