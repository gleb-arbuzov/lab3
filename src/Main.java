public class Main {
    public static void main(String[] args) throws Exception {
        Shorty shorty = new Shorty("Пончик");
        shorty.doAction(Action.DESCRIBE);
        shorty.doAction(Action.GET_SALT);
        shorty.doAction(Action.GET_DRESSED);
        Hill hill = new Hill("Холм");
        shorty.doAction(Action.GO_TO_HILL,hill);
        Bay bay = new Bay("Бухта");   
        shorty.doAction(Action.CAME_TO_BAY,bay);
        LosPoganos losPoganos = new LosPoganos("Лос Поганос");
        shorty.doAction(Action.LOOK_AROUND,losPoganos);     
    }
}
