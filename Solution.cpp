
#include <vector>
using namespace std;

class Solution {

public:
    int minOperations(const vector<string>& logs) const {

        int minOperationsToReturnToMainFolder = 0;
        for (const auto& log : logs) {
            bool isChildFolder = log[0] != '.';
            bool isParentFolder = log[1] == '.';

            if (isChildFolder) {
                ++minOperationsToReturnToMainFolder;
            }
            else if (minOperationsToReturnToMainFolder > 0 && isParentFolder) {
                --minOperationsToReturnToMainFolder;
            }
        }
        return minOperationsToReturnToMainFolder;
    }
};
