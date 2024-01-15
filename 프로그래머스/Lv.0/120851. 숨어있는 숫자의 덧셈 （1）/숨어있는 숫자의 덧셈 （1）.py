import re
def solution(my_string):
    res=re.findall('\d', my_string)
    return sum(map(int,res))