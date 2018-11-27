# Вы проектируете сервис, возвращающий XML-документ с информацией о товарах, представленных в магазине.

  Продукты разделены на категории, которые в свою очередь разделены на подкатегории.

  В любой подкатегории может быть любое количество товаров. У товаров есть следующие характеристики:

Производитель.

Модель (две буквы и три цифры).

Дата изготовления (DD-MM-YYYY).

Цвет.

Цена и количество товара на складе, или признак того, что товара нет на складе.

  1. Создать XSD для такого XML-документа и пример XML-документа.

  2. Разобрать связкой StAX + JAXB (вывести в консоль toString)// http://blog.bdoughan.com/2012/08/handle-middle-of-xml-document-with-jaxb.html

  3. Конвертер json <=> xml с помощью O/X mappers - JAXB and Jackson/GSon (TODO: Date formatter and JsonIgnore)

4.* Можно проверить валидность XML

5.* Одну из характеристик оформить атрибутом