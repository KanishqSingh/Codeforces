n = int(input())

for i in range(n):

    word = input()

    num = len(word) - 2
    print(word[0] + str(num) + word[-1])