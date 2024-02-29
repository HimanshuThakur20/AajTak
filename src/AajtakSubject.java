import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AajtakSubject implements Aajtak {

    private List<AajtakChannels> aajtakChannels = new ArrayList<>();
    @Override
    public void registerChannel(AajtakChannels channel) {
        aajtakChannels.add(channel);
    }

    @Override
    public void removeChannel(AajtakChannels channel) {
        if (aajtakChannels != null) {
            aajtakChannels.remove(channel);
        }
    }

    @Override
    public void notifyChannel(News news) {
        if (aajtakChannels != null) {
            for (AajtakChannels channel : aajtakChannels) {
                if(channel.getType().equals(news.getType()))
                    channel.update(news.getNews());
            }

        }
    }
}
