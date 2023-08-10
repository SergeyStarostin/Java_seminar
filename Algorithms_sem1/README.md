# Задачи:

## 1) Написать алгоритм поиска простых чисел (делятся только на себя и на 1) в диапазоне от 1 до N. В алгоритме будет использоваться вложенный for, что явно говорит о квадратичной сложности

## 2) Написать алгоритм поиска простых чисел (делятся только на себя и на 1) в диапазоне от 1 до N. В алгоритме будет использоваться вложенный for, что явно говорит о квадратичной сложности

## 3) Необходимо написать алгоритм поиска всех доступных комбинаций (посчитать количество) для 4 кубиков с количеством граней N. Данное решение имеет сложность O(n4), но если количество кубиков сделать переменной, то она трансформируется в O(nk), что будет представлять собой экспоненциальную сложность.

## 4) Пишем алгоритм поиска нужного числа последовательности Фибоначчи. Считаем, что 1 и 2 значения последовательности равны 1. Искать будем по формуле On=On-1+On-2 что предполагает использовать рекурсивного алгоритма.   

                              n       
                           /     \
                          n-1     n-2     -------- 2^1 операций
                         /  \    /   \
                       n-2  n-3 n-3 n-4   -------- 2^2 операций
                      /   \           
                     n-3 n-4              -------- 2^3 операций
                     ........             ........
                    n-n-1  n-n-2          -------- 2^(n-1) операций

## 5) Пишем алгоритм поиска нужного числа последовательности Фибоначчи, но в этот раз откажемся от рекурсии и воспользуемся обычным алгоритмом, что даст нам линейную сложность, т.к. вычисление каждого из чисел последовательности будет происходить ровно 1 раз. 

## 6) Необходимо сравнить скорость работы 2 алгоритмов вычисления чисел Фибоначчи и определить, какой из них работает быстрее.