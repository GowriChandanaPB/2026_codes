
# input
# dist = [{"fruit_name":"apple", "sold_weight": 10},
# {"fruit_name":"banana", "sold_weight": 20},
# {"fruit_name":"apple", "sold_weight": 30},
# {"fruit_name":"banana", "sold_weight": 40},
# {"fruit_name":"orange", "sold_weight": 50}]

# output
# dist = {"apple": 40, "banana": 60, "orange": 50}
 
dist = [{"fruit_name":"apple", "sold_weight": 10},
{"fruit_name":"banana", "sold_weight": 20},
{"fruit_name":"apple", "sold_weight": 30},
{"fruit_name":"banana", "sold_weight": 40},
{"fruit_name":"orange", "sold_weight": 50}]
result = {}

for i in dist:
    fruit_name = i["fruit_name"]
    sold_weight = i["sold_weight"]
    if fruit_name in result:
        result[fruit_name] += sold_weight
    else:
        result[fruit_name] = sold_weight
print(result)
