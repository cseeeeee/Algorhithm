def solution(age):
    res=''
    a_lst=[chr(c) for c in range(97,107)]
    for i in str(age):
        res+=a_lst[int(i)]
    return res