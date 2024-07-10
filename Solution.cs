
using System;

public class Solution
{
    public int MinOperations(string[] logs)
    {
        int minOperationsToReturnToMainFolder = 0;
        foreach (var log in logs)
        {
            bool isChildFolder = log[0] != '.';
            bool isParentFolder = log[1] == '.';

            if (isChildFolder)
            {
                ++minOperationsToReturnToMainFolder;
            }
            else if (minOperationsToReturnToMainFolder > 0 && isParentFolder)
            {
                --minOperationsToReturnToMainFolder;
            }
        }
        return minOperationsToReturnToMainFolder;
    }
}
