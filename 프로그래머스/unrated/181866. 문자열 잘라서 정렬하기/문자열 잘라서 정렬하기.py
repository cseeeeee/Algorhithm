def solution(myString):
    r_dict=[i for i in myString.split('x') if i!='']
    return sorted(r_dict)
    # r_dict=myString.split('x')
    # for i in r_dict:
        # if i=='':
            # r_dict.remove(i)
    # return sorted(r_dict)