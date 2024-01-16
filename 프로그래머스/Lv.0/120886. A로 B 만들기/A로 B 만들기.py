def solution(before, after):
    b_lst=sorted(list(before))
    a_lst=sorted(list(after))
    return 1 if a_lst==b_lst else 0
    