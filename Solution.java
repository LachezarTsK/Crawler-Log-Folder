
public class Solution {

    public int minOperations(String[] logs) {

        int minOperationsToReturnToMainFolder = 0;
        for (String log : logs) {
            boolean isChildFolder = log.charAt(0) != '.';
            boolean isParentFolder = log.charAt(1) == '.';

            if (isChildFolder) {
                ++minOperationsToReturnToMainFolder;
            } else if (minOperationsToReturnToMainFolder > 0 && isParentFolder) {
                --minOperationsToReturnToMainFolder;
            }
        }
        return minOperationsToReturnToMainFolder;
    }
}
