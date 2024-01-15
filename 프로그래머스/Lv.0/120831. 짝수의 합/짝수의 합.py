def solution(n):
    r=[e for e in range(0,n+1) if e%2==0]
    return sum(r)