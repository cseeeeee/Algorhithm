def solution(myString):
    res=[x for x in myString.split('x') if x!='']
    return sorted(res)

    # r_dict=[i for i in myString.split('x') if i!='']
    # return sorted(r_dict)