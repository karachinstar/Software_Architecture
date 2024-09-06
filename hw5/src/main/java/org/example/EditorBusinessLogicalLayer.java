package org.example;

import java.util.Collection;
import java.util.Random;

/**
 * Класс, реализующий бизнес-логику редактора 3D графики.
 */
class EditorBusinessLogicalLayer implements BusinessLogicalLayer {

    private DatabaseAccess databaseAccess;

    public EditorBusinessLogicalLayer(DatabaseAccess databaseAccess) {
        this.databaseAccess = databaseAccess;
    }

    @Override
    public Collection<Model3D> getAllModels() {
        return databaseAccess.getAllModels();
    }

    @Override
    public Collection<Texture> getAllTextures() {
        return databaseAccess.getAllTextures();
    }

    @Override
    public void renderModel(Model3D model) {
        processRender(model);
    }

    @Override
    public void renderAllModels() {
        for (Model3D model : getAllModels()) {
            processRender(model);
        }
    }

    @Override
    public void addModel(Model3D model) {
        databaseAccess.addModel(model);
    }

    @Override
    public void removeModel(Model3D model) {
        databaseAccess.removeModel(model);
    }

    @Override
    public void addTexture(Texture texture) {
        databaseAccess.addTexture(texture);
    }

    @Override
    public void removeTexture(Texture texture) {
        databaseAccess.removeTexture(texture);
    }

    private Random random = new Random();

    private void processRender(Model3D model) {
        try {
            Thread.sleep(2500 - random.nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
