def solution(my_string, letter):
    my_list=list(my_string)
    while letter in my_list:
        my_list.remove(letter)
    return ''.join(my_list)