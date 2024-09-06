package org.example;

import java.util.Collection;

/**
 * Интерфейс Business Logical Layer (BLL).
 */
interface BusinessLogicalLayer {

    /**
     * Получает все модели проекта.
     *
     * @return Список всех моделей проекта.
     */
    Collection<Model3D> getAllModels();

    /**
     * Получает все текстуры проекта.
     *
     * @return Список всех текстур проекта.
     */
    Collection<Texture> getAllTextures();

    /**
     * Выполняет рендер указанной модели.
     *
     * @param model Модель для рендеринга.
     */
    void renderModel(Model3D model);

    /**
     * Выполняет рендер всех моделей проекта.
     */
    void renderAllModels();

    /**
     * Добавляет 3D модель в проект.
     *
     * @param model Добавляемая модель.
     */
    void addModel(Model3D model);

    /**
     * Удаляет 3D модель из проекта.
     *
     * @param model Удаляемая модель.
     */
    void removeModel(Model3D model);

    /**
     * Добавляет текстуру в проект.
     *
     * @param texture Добавляемая текстура.
     */
    void addTexture(Texture texture);

    /**
     * Удаляет текстуру из проекта.
     *
     * @param texture Удаляемая текстура.
     */
    void removeTexture(Texture texture);
}
