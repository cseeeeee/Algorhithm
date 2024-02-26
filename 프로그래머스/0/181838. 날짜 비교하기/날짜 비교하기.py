def solution(date1, date2):
    year1 = date1[0]; year2 = date2[0]
    month1 = date1[1]; month2 = date2[1]
    day1 = date1[2]; day2 = date2[2]      
    
    if year1 < year2: 
        return 1
    elif year1 > year2:
        return 0
    else: # 같은 년도의 날짜들인 경우!
        if month1 < month2:
            return 1
        elif month1 > month2:
            return 0
        else:#같은 년도의 같은 월의 날짜들인 경우!
            if day1 < day2:
                return 1
            else:
                return 0
            
        
