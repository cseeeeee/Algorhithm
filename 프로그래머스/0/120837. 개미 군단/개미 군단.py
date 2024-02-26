def solution(hp):
    cnt=0
    if hp//4>0:
        cnt+=1
    elif hp//2>0:
        cnt+=1
    elif hp//1>0:
        cnt+=1
    return cnt
        