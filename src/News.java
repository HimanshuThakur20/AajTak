public class News {
    Main.Type type;
   String news;

    public News(String news, Main.Type type) {
        this.type = type;
        this.news = news;
    }
    public Main.Type getType() {
        return type;
    }

    public String getNews() {
        return news;
    }

}
