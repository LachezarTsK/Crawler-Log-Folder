
class Solution {
    fun minOperations(logs: Array<String>): Int {

        var minOperationsToReturnToMainFolder = 0
        for (log in logs) {
            val isChildFolder = log[0] != '.'
            val isParentFolder = log[1] == '.'

            if (isChildFolder) {
                ++minOperationsToReturnToMainFolder
            } else if (minOperationsToReturnToMainFolder > 0 && isParentFolder) {
                --minOperationsToReturnToMainFolder
            }
        }
        return minOperationsToReturnToMainFolder
    }
}
