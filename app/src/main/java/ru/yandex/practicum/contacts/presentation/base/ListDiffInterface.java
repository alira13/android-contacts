package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {

    boolean theSameAs(T sameClass);

    boolean equals(Object object);
}