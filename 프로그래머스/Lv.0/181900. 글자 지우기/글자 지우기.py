def solution(my_string, indices):
    return ''.join([v for (i,v) in enumerate(my_string) if i not in indices])