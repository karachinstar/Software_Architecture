package org.example;

import java.util.Collection;

/**
 * Интерфейс Database (БД).
 */
interface Database {

    /**
     * Загружает данные из базы данных.
     */
    void load();

    /**
     * Сохраняет текущее состояние в базе данных.
     */
    void save();

    /**
     * Получает все сущности из базы данных.
     *
     * @return Список всех сущностей.
     */
    Collection<Entity> getAll();

    void addEntity(Entity entity);

    void removeEntity(Entity entity);
}
