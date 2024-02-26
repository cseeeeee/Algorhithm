def solution(n):
    for i in range(max(n,6), 6*n+1):
        if i%n ==0 and i%6==0:
            return (int(i/6))
            break