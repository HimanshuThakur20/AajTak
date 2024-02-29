import java.lang.*;
public class AajtakChannelsObserver implements AajtakChannels{
    private String newsFor;
    private Main.Type channelType;

    public AajtakChannelsObserver(String newsFor, Main.Type channelType) {
        this.newsFor = newsFor;
        this.channelType = channelType;
    }

    @Override
    public void update(String news) {
        System.out.println("\n"+newsFor + " received message: \n" + news + "\n");
    }

    @Override
    public Main.Type getType() {
        return channelType;
    }
}
