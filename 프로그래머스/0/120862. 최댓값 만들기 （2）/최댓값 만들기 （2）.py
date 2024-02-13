def solution(n):
    n.sort()
    res=[]
    for i in range(len(n)-1):
        res.append(n[i]*n[i+1])
    return max(res)