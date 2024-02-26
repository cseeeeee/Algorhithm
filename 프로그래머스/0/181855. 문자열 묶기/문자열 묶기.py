def solution(strArr):
    res=[]
    for i in strArr:
        res.append(len(i))
    temp=sorted(res)
    unique_temp=list(set(temp))
    dict={
        
    }
    for length_id in unique_temp: 
        total=0
        for length_value in temp:  
            if length_id == length_value:
                total+=1
        dict[length_id]=total
    max=0
    # for value in dict.values():
    #   if value >= max:
    #     max=value
    # return max
    for key in dict.keys():
        if dict[key] >= max:
            max=dict[key]
    return max
