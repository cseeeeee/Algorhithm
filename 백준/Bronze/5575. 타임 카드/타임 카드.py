import datetime

a=list(map(int, input().split())) #9 0 0 18 0 0
b=list(map(int, input().split())) #9 0 1 18 0 0
c=list(map(int, input().split())) #12 14 52 12 15 30
employee=[a,b,c]

for i in employee:
  time1 = datetime.timedelta(hours=i[0], minutes=i[1], seconds=i[2])
  time2 = datetime.timedelta(hours=i[3], minutes=i[4], seconds=i[5])
  worktime=time2-time1

  total_seconds = int(worktime.total_seconds())
  # print(total_seconds)
  hours = total_seconds // 3600
  minutes = (total_seconds % 3600) // 60
  seconds = total_seconds % 60
  
  # 콜론 대신 공백을 사용하여 시간 포맷을 만듭니다.
  time_str = f"{hours} {minutes} {seconds}"
  print(time_str)