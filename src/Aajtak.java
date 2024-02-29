public interface Aajtak {
    void registerChannel(AajtakChannels channel);
    void removeChannel(AajtakChannels chennel);
    void notifyChannel(News news);
}
