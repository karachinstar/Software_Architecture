package org.example;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Класс, реализующий доступ к базе данных редактора 3D графики.
 */
class EditorDatabaseAccess implements DatabaseAccess {

    private final Database editorDatabase;

    public EditorDatabaseAccess(Database editorDatabase) {
        this.editorDatabase = editorDatabase;
    }

    @Override
    public Collection<Model3D> getAllModels() {
        Collection<Model3D> models = new ArrayList<>();
        for (Entity entity : editorDatabase.getAll()) {
            if (entity instanceof Model3D) {
                models.add((Model3D) entity);
            }
        }
        return models;
    }

    @Override
    public void addModel(Model3D model) {

    }

    @Override
    public void removeModel(Model3D model) {

    }

    @Override
    public void addTexture(Texture texture) {

    }

    @Override
    public void removeTexture(Texture texture) {

    }

    @Override
    public Collection<Texture> getAllTextures() {
        Collection<Texture> textures = new ArrayList<>();
        for (Entity entity : editorDatabase.getAll()) {
            if (entity instanceof Texture) {
                textures.add((Texture) entity);
            }
        }
        return textures;
    }

    @Override
    public void addEntity(Entity entity) {
        editorDatabase.addEntity(entity);
    }

    @Override
    public void removeEntity(Entity entity) {
        editorDatabase.removeEntity(entity);
    }
}
