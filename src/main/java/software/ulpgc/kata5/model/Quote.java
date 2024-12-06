package software.ulpgc.kata5.model;

import java.util.Arrays;

public record Quote(String authorName, String content, Tag[] tags) {

    @Override
    public String toString() {
        return "Quote{" +
                "authorName='" + authorName + '\'' +
                ", content='" + content + '\'' +
                ", tags=" + Arrays.toString(tags) +
                '}';
    }

    public enum Tag{
        AGE,
        ATHLETICS,
        BUSINESS,
        CHANGE,
        CHARACTER,
        COMPETITION,
        CONSERVATIVE,
        COURAGE,
        CREATIVITY,
        EDUCATION,
        ETHICS,
        FAILURE,
        FAITH,
        FAMILY,
        FAMOUS_QUOTES,
        FILM,
        FREEDOM,
        FRIENDSHIP,
        FUTURE,
        GENEROSITY,
        GENIUS,
        GRATITUDE,
        HAPPINESS,
        HEALTH,
        HISTORY,
        HONOR,
        HUMOR,
        HUMOROUS,
        IMAGINATION,
        INSPIRATIONAL,
        KNOWLEDGE,
        LEADERSHIP,
        LIFE,
        LITERATURE,
        LOVE,
        MATHEMATICS,
        MOTIVATIONAL,
        NATURE,
        OPPORTUNITY,
        PAIN,
        PERSEVERANCE,
        PHILOSOPHY,
        POLITICS,
        POWER_QUOTES,
        PROVERB,
        RELIGION,
        SADNESS,
        SCIENCE,
        SELF,
        SELF_HELP,
        SOCIAL_JUSTICE,
        SOCIETY,
        SPIRITUALITY,
        SPORTS,
        STUPIDITY,
        SUCCESS,
        TECHNOLOGY,
        TIME,
        TOLERANCE,
        TRUTH,
        VIRTUE,
        WAR,
        WEAKNESS,
        WELLNESS,
        WISDOM,
        WORK
    }
}
