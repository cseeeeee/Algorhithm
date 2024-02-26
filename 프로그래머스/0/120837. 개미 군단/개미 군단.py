def solution(hp):
    cnt=0
    #장군개미
    cnt += hp //5
    hp %= 5
    #병정개미
    cnt += hp//3
    hp %= 3
    #일개미
    cnt += hp
    return cnt