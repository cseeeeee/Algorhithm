def solution(myString):
    return ''.join(['l' if ord('l')>ord(v) else v for v in myString])