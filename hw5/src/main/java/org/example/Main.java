package org.example;

import java.util.Scanner;


/**
 * Главный класс программы, реализующий пользовательский интерфейс и взаимодействие с редактором 3D графики.
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Точка входа в программу.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Editor3D editor3D = new Editor3D();
        boolean f = true;
        while (f) {
            System.out.println("*** МОЙ 3D РЕДАКТОР ***");
            System.out.println("=======================");
            System.out.println("1. Открыть проект");
            System.out.println("2. Сохранить проект");
            System.out.println("3. Отобразить параметры проекта");
            System.out.println("4. Отобразить все модели проекта");
            System.out.println("5. Отобразить все текстуры проекта");
            System.out.println("6. Выполнить рендер всех моделей");
            System.out.println("7. Выполнить рендер модели");
            System.out.println("8. Добавитьsasd 3D модель");
            System.out.println("9. Удалить 3D модель");
            System.out.println("10. Добавить текстуру");
            System.out.println("11. Удалить текстуру");
            System.out.println("0. ЗАВЕРШЕНИЕ РАБОТЫ ПРИЛОЖЕНИЯ");
            System.out.print("Пожалуйста, выберите пункт меню: ");
            if (scanner.hasNextInt()) {
                int no = scanner.nextInt();
                scanner.nextLine();
                try {
                    switch (no) {
                        case 0:
                            System.out.println("Завершение работы приложения");
                            f = false;
                            break;
                        case 1:
                            System.out.print("Укажите наименование файла проекта: ");
                            String fileName = scanner.nextLine();
                            editor3D.openProject(fileName);
                            System.out.println("Проект успешно открыт.");
                            break;
                        case 3:
                            editor3D.showProjectSettings();
                            break;
                        case 4:
                            editor3D.printAllModels();
                            break;
                        case 5:
                            editor3D.printAllTextures();
                            break;
                        case 6:
                            editor3D.renderAll();
                            break;
                        case 7:
                            System.out.print("Укажите номер модели: ");
                            if (scanner.hasNextInt()) {
                                int modelNo = scanner.nextInt();
                                scanner.nextLine();
                                editor3D.renderModel(modelNo);
                            } else {
                                System.out.println("Номер модели указан некорректно.");
                            }
                            break;
                        case 8:
                            System.out.print("Укажите имя новой модели: ");
                            String modelName = scanner.nextLine();
                            editor3D.addModel(new Model3D(modelName));
                            break;
                        case 9:
                            System.out.print("Укажите номер модели для удаления: ");
                            if (scanner.hasNextInt()) {
                                int modelNo = scanner.nextInt();
                                scanner.nextLine();
                                editor3D.removeModel(modelNo);
                            } else {
                                System.out.println("Номер модели указан некорректно.");
                            }
                            break;
                        case 10:
                            System.out.print("Укажите имя новой текстуры: ");
                            String textureName = scanner.nextLine();
                            editor3D.addTexture(new Texture(textureName));
                            break;
                        case 11:
                            System.out.print("Укажите номер текстуры для удаления: ");
                            if (scanner.hasNextInt()) {
                                int textureNo = scanner.nextInt();
                                scanner.nextLine();
                                editor3D.removeTexture(textureNo);
                            } else {
                                System.out.println("Номер текстуры указан некорректно.");
                            }
                            break;
                        default:
                            System.out.println("Укажите корректный пункт меню.");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Укажите корректный пункт меню.");
                scanner.nextLine();
            }
        }
    }
}

