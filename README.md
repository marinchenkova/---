﻿[![Build Status](https://travis-ci.org/marinchenkova/Project.svg?branch=master)](https://travis-ci.org/marinchenkova/Project)
[![codecov](https://codecov.io/gh/marinchenkova/Project/branch/master/graph/badge.svg)](https://codecov.io/gh/marinchenkova/Project)

# Графический редактор на Java + проект Arduino

###Текущее состояние проекта:
- при выборе инструмента изменяется курсор и иконка на панели инструментов
- отображение координат мыши, размера картинки
- Кисть V0.1
- Ластик V0.1
- изменение ширины кисти
- рисование кистью создает отдельные объекты на доске
- ДОБАВЛЕНО: объекты, созданные кистью, можно удалять:


![alt text](images/Versions/8.gif)


##Описание
Приложение для создания и обработки двумерных графических изображений.

Сохранение и загрузка файлов,

Минимальный набор инструментов для рисования:
- кисть,
- ластик,
- заливка,
- палитра цветов,
- простые фигуры: прямые линии, эллипсы, прямоугольники и т.д.

##Дополнительно
  Построитель плоской карты окружения на Arduino, его основные части: 
  - плата Arduino                                    ![alt text](images/README/arduino-uno.png)
  - ультразвуковой дальномер (возвращает расстояние) ![alt text](images/README/hc-sr04.png)
  - шаговый двигатель (возвращает угол поворота оси) ![alt text](images/README/motor.png)
  
Эти два параметра (расстояние и угол поворота оси двигателя) записываются в текстовый файл, который используется графическим редактором для построения плоской карты (вид сверху), например, комнаты.
Вид сверху:
![alt text](images/README/Arduino.gif)

"Ar" - устройство на Arduino.

##В будущем
  - Модернизация устройства на Arduino для реализации трехмерной карты окружения,
  - Добавление возможности работать с 3d графикой в редакторе.
