from functools import reduce
def solution(num_list):
    mul=reduce(lambda x,_: x*_, num_list)
    return 1 if mul<sum(num_list)**2 else 0