str1 = str(input());
str2 = str(input());
if len(str1) != len(str2):
    print("no")
    
chr1 = list(str1);
chr2 = list(str2);
chr1.sort()
chr2.sort()
if chr1 == chr2:
    print("yes")
else: 
    print("no")