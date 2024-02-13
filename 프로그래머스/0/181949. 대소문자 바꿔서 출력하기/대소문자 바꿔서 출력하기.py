str = input()
res=''
for s in str:
    if s.isupper():
        res+=s.lower()
    else:
        res+=s.upper()
        
print(res)