def solution(str1, str2):
    temp = ""
    for i in range(0, len(str1)+len(str2)):
        if i % 2 == 0:
            #str1에 접근
            index_of_string = i // 2
            temp += str1[index_of_string] 
        else:
            #str2에 접근
            index_of_string=i//2
            temp += str2[index_of_string] 
    return temp
            
