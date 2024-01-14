def solution(arr):
    for i, r in enumerate(arr):
        for j, v in enumerate(r):
            if not arr[i][j] == arr[j][i]:
                return 0
    return 1