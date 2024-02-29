public class Main {
    public static void main(String[] args) {
        AajtakSubject subject = new AajtakSubject();

        AajtakChannels channel1 = new AajtakChannelsObserver("Aajtak UP","UP");
        AajtakChannels channel2 = new AajtakChannelsObserver("Aajtak Delhi","Delhi");
        AajtakChannels channel3 = new AajtakChannelsObserver("Aajtak Business","Business");
        AajtakChannels channel4 = new AajtakChannelsObserver("Aajtak UP fir se","UP");

        subject.registerChannel(channel1);
        subject.registerChannel(channel2);
        subject.registerChannel(channel3);
        subject.registerChannel(channel4);



        subject.notifyChannel("News for UP: Mirzapur mai dulhe ki maut","UP");
        subject.notifyChannel("News for Delhi: Ek bihari-gang ne Qutub Minar ko kiya gayab","Delhi");
        subject.notifyChannel("News for Business: Mahindra ne banaya BharatGPT, Mahindra stocks hue 3x","Business");
    }
}