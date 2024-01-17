def solution(rsp):
    res=''
    for i in [x for x in rsp]:
        if i=='2':
            res+='0'
        if i=='0':
            res+='5'
        if i=='5':
            res+='2'
    return res