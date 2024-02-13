def solution(array):
    r1=max(array)
    for i in range(len(array)):
        if r1 == array[i]:
            r2=i
    return [r1,r2]