import re
def solution(my_string):
    return sorted(map(int,(re.findall('\d', my_string))))