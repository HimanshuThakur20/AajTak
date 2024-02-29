import java.lang.*;
public class AajtakChannelsObserver implements AajtakChannels{
    private String newsFor;
    private String channelType;

    public AajtakChannelsObserver(String newsFor, String channelType) {
        this.newsFor = newsFor;
        this.channelType = channelType.toLowerCase();
    }

    @Override
    public void update(String news) {
        System.out.println(newsFor + " received message: " + news);
    }

    @Override
    public String getType() {
        return channelType;
    }
}
