def insertionSort(li) :
    for i in range(1, len(li)) :
        e = li[i]
        j = i - 1
        while j >= 0 and li[j] > e :
            li[j + 1] = li[j]
            j = j - 1
        
        li[j + 1] = e


li = list(map(int, input().split(" ")))
insertionSort(li)
print(li)