package seminars.third.tdd;

public class MoodAnalyser {

    public String analyseMood(String message) {
        if (message.contains("хорош")) return "NormalMood";
        if (message.contains("плох")) return "BadMood";
        return "GoodMood";
    }
}