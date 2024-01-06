def solution(my_string):
    l=[]
    for n in range(len(my_string)):
        l.append(my_string[-n:])
    return sorted(l)