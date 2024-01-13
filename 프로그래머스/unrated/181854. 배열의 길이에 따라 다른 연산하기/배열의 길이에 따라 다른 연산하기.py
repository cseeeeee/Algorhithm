def solution(arr, n):
#     m = len(arr)%2
#     return [v+n if m != i%2 else v for i, v in enumerate(arr)]

    m = len(arr)%2
    ans = []
    for i, v in enumerate(arr):
        if i%2 == m:
            ans.append(v)
        else:
            ans.append(v+n)
    return ans

    
