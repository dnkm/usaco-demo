str = "---bread----bread---bread---bread---bread"
 #     0123                                36

first = -1

for i in range(len(str)-1, -1, -1):
	if str[i:i+5] == "bread":
		first = i
		break

print(first)
