import datetime

a = list(map(int, input().split()))  # Example: 9 0 0 18 0 0
b = list(map(int, input().split()))  # Example: 9 0 1 18 0 0
c = list(map(int, input().split()))  # Example: 12 14 52 12 15 30
employee = [a, b, c]

for i in employee:
    time1 = datetime.timedelta(hours=i[0], minutes=i[1], seconds=i[2])  # 출근시간
    time2 = datetime.timedelta(hours=i[3], minutes=i[4], seconds=i[5])  # 퇴근시간
    worktime = time2 - time1  # 근무시간
    
    # Formatting each part to remove leading zeros
    hours, minutes, seconds = str(worktime).split(':')
    print(int(hours), int(minutes), int(seconds))
