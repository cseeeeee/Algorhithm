while True:
  name, age, w = input().split()
  name, age, w = str(name), int(age), int(w)
  if (name == '#') & (age==0) & (w==0):
    break
  if age > 17 or w >=80:
    print(f'{name} Senior')
  else:
    print(f'{name} Junior')