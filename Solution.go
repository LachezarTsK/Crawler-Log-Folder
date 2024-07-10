
package main

import "fmt"

func minOperations(logs []string) int {

    minOperationsToReturnToMainFolder := 0
    for _, log := range logs {
        isChildFolder := log[0] != '.'
        isParentFolder := log[1] == '.'

        if isChildFolder {
            minOperationsToReturnToMainFolder++
        } else if minOperationsToReturnToMainFolder > 0 && isParentFolder {
            minOperationsToReturnToMainFolder--
        }
    }
    return minOperationsToReturnToMainFolder
}
