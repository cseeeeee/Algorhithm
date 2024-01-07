def solution(strArr):
    return [x.lower() if y%2==0 else x.upper() for y,x in enumerate(strArr)]