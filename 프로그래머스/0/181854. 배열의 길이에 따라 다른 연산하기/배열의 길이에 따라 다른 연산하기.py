def solution(arr, n):
    m=len(arr)%2
    if m %2 !=0:
        return [v+n if i%2==0 else v for (i,v) in enumerate(arr)]
    else:
        return [v+n if i%2!=0 else v for (i,v) in enumerate(arr)]