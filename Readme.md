# Недостатки кода задач 2 и 3

## Задача 2
Сильные стороны кода: предусмотрено деление на 0, и есть соответствующее исключение.
Проблема этого кода в том, что непонятно, что такое intArray[8]. До блока try необходимо было создать массив,
скорее всего, int[] array = new int[], а потом обратиться к его восьмому элементу, если таковой есть.
Но если массив содержал бы меньше 8 элементов, то предусмотреть arrayOutOfBoundsException.

## Задача 3

Сильные стороны кода: предусмотрена обработка исключения IndexOutOfBoundsException.
Недостатки: \
1).В методе printSum предусмотрена обработка исключения, которое с ним никак не связано, здесь должно было быть
исключение NullPointerException. И то, лучше оформить классически с помощью блока try-catch.\
2).А из void main я бы убрала NullPointerException, чтобы не повторяться.\
3).Другой недостаток в том, что Throwable представлен первым, а должен был быть последним. Надо подумать, так уж нужен Throwable в коде.\
4).Ну и в принципе, из строчки void main throws Exception я бы убрала throws Exception, т.к. они и без того обработаны в коде.\
5).Как дополнение я бы обработала деление на ноль (ArithmeticException), т.к. такая ситуация может возникнуть, если написать int b = 0.