def solution(n):
    res=[n]
    while n!=1:
        n=n//2 if n%2==0 else n*3+1
        res.append(n)
    return res
    


    #if else - for 순서
    # return [x for x in range(0,n+1) if x%2==0 else 3*x+1 if x==1]

