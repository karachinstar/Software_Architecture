package org.example;

import java.util.Collection;

/**
 * Интерфейс Database Access (DAC).
 */
interface DatabaseAccess {

    /**
     * Добавляет сущность в базу данных.
     *
     * @param entity Добавляемая сущность.
     */
    void addEntity(Entity entity);

    /**
     * Удаляет сущность из базы данных.
     *
     * @param entity Удаляемая сущность.
     */
    void removeEntity(Entity entity);

    /**
     * Получает все текстуры из базы данных.
     *
     * @return Список всех текстур.
     */
    Collection<Texture> getAllTextures();

    /**
     * Получает все модели из базы данных.
     *
     * @return Список всех моделей.
     */
    Collection<Model3D> getAllModels();

    /**
     * Добавляет 3D модель в базу данных.
     *
     * @param model Добавляемая 3D модель.
     */
    void addModel(Model3D model);

    /**
     * Удаляет 3D модель из базы данных.
     *
     * @param model Удаляемая 3D модель.
     */
    void removeModel(Model3D model);

    /**
     * Добавляет текстуру в базу данных.
     *
     * @param texture Добавляемая текстура.
     */
    void addTexture(Texture texture);

    /**
     * Удаляет текстуру из базы данных.
     *
     * @param texture Удаляемая текстура.
     */
    void removeTexture(Texture texture);
}
