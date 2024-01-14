def solution(my_strings, parts):
    res=''
    for i, v in enumerate(parts):
        res+=my_strings[i][v[0]:v[1]+1]
    return res