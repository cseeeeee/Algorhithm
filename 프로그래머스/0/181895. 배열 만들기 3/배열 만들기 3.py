def solution(arr, intervals):
    res=[]
    for (i,v) in enumerate(intervals):
        if i==0:
            res.append(arr[v[0]:v[1]+1])
        else:
            res.append(arr[v[0]:v[1]+1])
    return res[0]+res[1]