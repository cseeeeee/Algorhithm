def solution(myString, pat):
    re_myString=myString.replace('A','a').replace('B','A').replace('a','B')
    return 1 if pat in re_myString else 0