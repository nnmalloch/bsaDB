package util.dbCreation.meritBadges.objects;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Nathanael on 9/22/2016.
 */
public class DefaultSwimming {

    public static void execute(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();

        addNewScout(statement);
        addRequirements(statement);

        statement.executeBatch();
    }

    private static void addNewScout(Statement statement) throws SQLException {
        StringBuilder meritBadge = new StringBuilder("INSERT INTO meritBadge ");
        meritBadge.append("VALUES(1, 'Swimming', '/images/meritBadges/Swimming.jpg', 1, 1)");

        statement.addBatch(meritBadge.toString());
    }

    private static void addRequirements(Statement statement) throws SQLException {
        addRequirement1(statement);
        addRequirement2(statement);
        addRequirement3(statement);
        addRequirement4(statement);
        addRequirement5(statement);
        addRequirement6(statement);
        addRequirement7(statement);
        addRequirement8(statement);
    }

    private static void addRequirement1(Statement statement) throws SQLException {
        StringBuilder requirement = new StringBuilder("INSERT INTO requirement ");
        requirement.append("VALUES(null, ");
        requirement.append("'1'").append(", ");
        requirement.append("'Do the following:\n" +
                "a. Explain to your counselor how Scoutings Safe Swim Defense plan anticipates, helps prevent " +
                "and mitigate, and provides responses to likely hazards you may encounter during swimming activities.\n" +
                "b. Discuss the prevention and treatment of health concerns that could occur while swimming, " +
                "including hypothermia, dehydration, sunburn, heat exhaustion, heatstroke, muscle cramps, " +
                "hyperventilation, spinal injury, stings and bites, and cuts and scrapes.'").append(", ");
        requirement.append("20").append(", ");
        requirement.append("1");
        requirement.append(")");

        statement.addBatch(requirement.toString());
    }

    private static void addRequirement2(Statement statement) throws SQLException {
        StringBuilder requirement = new StringBuilder("INSERT INTO requirement ");
        requirement.append("VALUES(null, ");
        requirement.append("'2'").append(", ");
        requirement.append("'Before doing the following requirements, successfully complete the BSA swimmer test: " +
                "Jump feet first into water over the head in depth. Level off and swim 75 yards in a strong manner" +
                " using one or more of the following strokes: sidestroke, breaststroke, trudgen, or crawl; then swim " +
                "25 yards using an easy, resting backstroke. The 100 yards must be completed in one swim without " +
                "stops and must include at least one sharp turn. After completing the swim, rest by floating.'").append(", ");
        requirement.append("20").append(", ");
        requirement.append("1");
        requirement.append(")");

        statement.addBatch(requirement.toString());
    }

    private static void addRequirement3(Statement statement) throws SQLException {
        StringBuilder requirement = new StringBuilder("INSERT INTO requirement ");
        requirement.append("VALUES(null, ");
        requirement.append("'3'").append(", ");
        requirement.append("'Swim continuously for 150 yards using the following strokes in good form and in a strong " +
                "manner: front crawl or trudgen for 25 yards, back crawl for 25 yards, sidestroke for 25 yards, " +
                "breaststroke for 25 yards, and elementary backstroke for 50 yards.'").append(", ");
        requirement.append("20").append(", ");
        requirement.append("1");
        requirement.append(")");

        statement.addBatch(requirement.toString());
    }

    private static void addRequirement4(Statement statement) throws SQLException {
        StringBuilder requirement = new StringBuilder("INSERT INTO requirement ");
        requirement.append("VALUES(null, ");
        requirement.append("'4'").append(", ");
        requirement.append("'Do the following:\n" +
                "a. Demonstrate water rescue methods by reaching with your arm or leg, by reaching with a suitable " +
                "object, and by throwing lines and objects. Explain why swimming rescues should not be attempted " +
                "when a reaching or throwing rescue is possible, and explain why and how a rescue swimmer should " +
                "avoid contact with the victim.\n" +
                "b. With a helper and a practice victim, show a line rescue both as tender and as rescuer. The " +
                "practice victim should be approximately 30 feet from shore in deep water.'").append(", ");
        requirement.append("20").append(", ");
        requirement.append("1");
        requirement.append(")");

        statement.addBatch(requirement.toString());
    }

    private static void addRequirement5(Statement statement) throws SQLException {
        StringBuilder requirement = new StringBuilder("INSERT INTO requirement ");
        requirement.append("VALUES(null, ");
        requirement.append("'5'").append(", ");
        requirement.append("'Do the following:\n" +
                "a. Float faceup in a resting position for at least one minute.\n" +
                "b. Demonstrate survival floating for at least five minutes.\n" +
                "c. While wearing a properly fitted U.S. Coast Guard approved life jacket, demonstrate the HELP and huddle positions. Explain their purposes.\n" +
                "d. Explain why swimming or survival floating will hasten the onset of hypothermia in cold water.'").append(", ");
        requirement.append("20").append(", ");
        requirement.append("1");
        requirement.append(")");

        statement.addBatch(requirement.toString());
    }

    private static void addRequirement6(Statement statement) throws SQLException {
        StringBuilder requirement = new StringBuilder("INSERT INTO requirement ");
        requirement.append("VALUES(null, ");
        requirement.append("'6'").append(", ");
        requirement.append("'In water over your head, but not to exceed 10 feet, do each of the following:\n" +
                "a. Use the feet first method of surface diving and bring an object up from the bottom.\n" +
                "b. Do a headfirst surface dive (pike or tuck), and bring the object up again.\n" +
                "c. Do a headfirst surface dive to a depth of at least 5 feet and swim underwater for three strokes. " +
                "Come to the surface, take a breath, and repeat the sequence twice.'").append(", ");
        requirement.append("20").append(", ");
        requirement.append("1");
        requirement.append(")");

        statement.addBatch(requirement.toString());
    }

    private static void addRequirement7(Statement statement) throws SQLException {
        StringBuilder requirement = new StringBuilder("INSERT INTO requirement ");
        requirement.append("VALUES(null, ");
        requirement.append("'7'").append(", ");
        requirement.append("'Following the guidelines set in the BSA Safe Swim Defense, in water at least 7 feet deep*, " +
                "show a standing headfirst dive from a dock or pool deck. Show a long shallow dive, also from the dock or pool deck.\n" +
                "*If your state, city, or local community requires a water depth greater than 7 feet, it is important to abide by that mandate.'").append(", ");
        requirement.append("20").append(", ");
        requirement.append("1");
        requirement.append(")");

        statement.addBatch(requirement.toString());
    }

    private static void addRequirement8(Statement statement) throws SQLException {
        StringBuilder requirement = new StringBuilder("INSERT INTO requirement ");
        requirement.append("VALUES(null, ");
        requirement.append("'8'").append(", ");
        requirement.append("'Explain the health benefits of regular aerobic exercise, and discuss why swimming is " +
                "favored as both fitness and therapeutic exercise.'").append(", ");
        requirement.append("20").append(", ");
        requirement.append("1");
        requirement.append(")");

        statement.addBatch(requirement.toString());
    }
}
