def solution(m_s, n1, n2):
    my_lst = list(m_s)
    temp = my_lst[n1]
    my_lst[n1] = my_lst[n2]
    my_lst[n2] = temp
    return ''.join(my_lst)
