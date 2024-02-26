def solution(num, k):
    temp=[]
    num_string=str(num)
    for i in range(len(num_string)):
        temp.append(int(num_string[i]))
    for i in range(len(temp)):
        if temp[i] == k:
            return i+1
    return -1