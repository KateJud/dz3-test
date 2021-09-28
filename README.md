# dz3-test
Юдина Катя
Тесты к gcd junit 5


написаны тесты к 2ум классам
index.html -- покрытие тестами : https://katejud.github.io/test-coverage/

Проблема в задаче на нахождение НОД:
Переполнение при использовании нижнего порогового значения аргумента -2^31
Например при gcd.gcs(-2^31,-2^31) должно получится 2^31, но ответ -2^31
исправленный код для второй задачи: https://github.com/KateJud/dz3-test/blob/change_gcd_class/src/root/gcd/GCD.java
