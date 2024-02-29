public class Main {
    enum Type{
        UP,Delhi,Business
    }
    public static void main(String[] args) {
        AajtakSubject subject = new AajtakSubject();

        AajtakChannels channel1 = new AajtakChannelsObserver("Aajtak UP",Type.UP);
        AajtakChannels channel2 = new AajtakChannelsObserver("Aajtak Delhi",Type.Delhi);
        AajtakChannels channel3 = new AajtakChannelsObserver("Aajtak Business",Type.Business);

        News news1 = new News("News for UP: Mirzapur mai dulhe ki maut",Type.UP);
        News news2 = new News("News for Delhi: Ek bihari-gang ne Qutub Minar ko kiya gayab",Type.Delhi);
        News news3 = new News("News for Business: Mahindra ne banaya BharatGPT, Mahindra stocks hue 3x",Type.Business);


        subject.registerChannel(channel1);
        subject.registerChannel(channel2);
        subject.registerChannel(channel3);


        subject.notifyChannel(news1);
        subject.notifyChannel(news2);
        subject.notifyChannel(news3);
    }
}