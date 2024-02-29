import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AajtakSubject implements Aajtak {

    private Map<String, List<AajtakChannels>> channelsMap = new HashMap<>();
    @Override
    public void registerChannel(AajtakChannels channel) {
        String type = channel.getType();
        channelsMap.putIfAbsent(type, new ArrayList<>());
        channelsMap.get(type).add(channel);
    }

    @Override
    public void removeChannel(AajtakChannels chennel) {
        String type = chennel.getType();
        List<AajtakChannels> observers = channelsMap.get(type);
        if (observers != null) {
            observers.remove(chennel);
            if (observers.isEmpty()) {
                channelsMap.remove(type);
            }
        }
    }

    @Override
    public void notifyChannel(String news, String type) {
        List<AajtakChannels> observers = channelsMap.get(type.toLowerCase());
        if (observers != null) {
            for (AajtakChannels observer : observers) {
                observer.update(news);
            }
        }
    }
}
