def solution(my_str, n1, n2):
    m_list=list(my_str)
    temp=m_list[n1]
    m_list[n1]=m_list[n2]
    m_list[n2]=temp
    return ''.join(m_list)