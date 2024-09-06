package org.example;

/**
 * Интерфейс UI (User Interface).
 */
interface UILayer {

    /**
     * Открывает проект с указанным именем файла.
     *
     * @param fileName Имя файла проекта.
     */
    void openProject(String fileName);

    /**
     * Отображает параметры проекта.
     */
    void showProjectSettings();

    /**
     * Сохраняет проект.
     */
    void saveProject();

    /**
     * Выводит все модели проекта.
     */
    void printAllModels();

    /**
     * Выводит все текстуры проекта.
     */
    void printAllTextures();

    /**
     * Выполняет рендер всех моделей проекта.
     */
    void renderAll();

    /**
     * Выполняет рендер указанной модели проекта.
     *
     * @param i Номер модели для рендеринга.
     */
    void renderModel(int i);

    /**
     * Добавляет 3D модель в проект.
     *
     * @param model Добавляемая модель.
     */
    void addModel(Model3D model);

    /**
     * Удаляет 3D модель из проекта.
     *
     * @param i Номер модели для удаления.
     */
    void removeModel(int i);

    /**
     * Добавляет текстуру в проект.
     *
     * @param texture Добавляемая текстура.
     */
    void addTexture(Texture texture);

    /**
     * Удаляет текстуру из проекта.
     *
     * @param i Номер текстуры для удаления.
     */
    void removeTexture(int i);
}
