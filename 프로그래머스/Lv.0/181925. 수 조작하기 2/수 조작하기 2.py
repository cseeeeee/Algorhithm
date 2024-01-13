def solution(numLog):
    res=''
    n_dict=dict(zip([1,-1,10,-10],['w','s','d','a']))
    for i in range(0, len(numLog)-1):
            res+=n_dict[numLog[i+1]-numLog[i]]
    return res
