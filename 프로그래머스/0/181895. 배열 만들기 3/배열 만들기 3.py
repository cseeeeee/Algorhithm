def solution(arr, intervals):
    r1, c1= intervals[0]
    r2, c2= intervals[1]            
    return arr[r1:c1+1]+arr[r2:c2+1]