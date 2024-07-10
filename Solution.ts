
function minOperations(logs: string[]): number {

    let minOperationsToReturnToMainFolder = 0;
    for (let log of logs) {
        const isChildFolder = log.charAt(0) !== '.';
        const isParentFolder = log.charAt(1) === '.';

        if (isChildFolder) {
            ++minOperationsToReturnToMainFolder;
        } else if (minOperationsToReturnToMainFolder > 0 && isParentFolder) {
            --minOperationsToReturnToMainFolder;
        }
    }
    return minOperationsToReturnToMainFolder;
};
