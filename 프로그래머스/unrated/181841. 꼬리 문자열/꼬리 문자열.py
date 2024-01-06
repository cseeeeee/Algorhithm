def solution(str_list, ex):
    res=[x for x in str_list if ex not in x]
    return ''.join(res) 