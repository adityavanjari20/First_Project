import java.util.List;

public class Machine {
    public static int findTool(List<String> tools, int startIndex, String target) {
        int LeftMove = 0, RightMove = 0;

        int targetIndex = tools.indexOf(target);


        if (targetIndex > startIndex) {
            RightMove = targetIndex - startIndex;
            LeftMove = tools.size() - targetIndex + startIndex;


        } else {
            LeftMove = startIndex - targetIndex;
            RightMove = tools.size() - startIndex + targetIndex;


        }
        System.out.println("The tool currently in use is " +
                tools.get(startIndex) + " at index " + startIndex + ".\nThe desired tool is "
                + target + " at index " + targetIndex + ".\nIt can be reached by moving right "
                + RightMove + " steps or left " + LeftMove + " step.");
        return Math.min(RightMove, LeftMove);
    }
}
