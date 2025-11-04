package exp09filehandling;
import java.io.*;
import java.util.*;

public class FileOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== FILE OPERATIONS MENU =====");
            System.out.println("1. Create a new file");
            System.out.println("2. Rename a file");
            System.out.println("3. Delete a file");
            System.out.println("4. Create a directory");
            System.out.println("5. Find absolute path of a file");
            System.out.println("6. Display all files in a directory");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter file name to create: ");
                    String fileName = sc.nextLine();
                    createFile(fileName);
                    break;

                case 2:
                    System.out.print("Enter existing file name: ");
                    String oldName = sc.nextLine();
                    System.out.print("Enter new file name: ");
                    String newName = sc.nextLine();
                    renameFile(oldName, newName);
                    break;

                case 3:
                    System.out.print("Enter file name to delete: ");
                    String delFile = sc.nextLine();
                    deleteFile(delFile);
                    break;

                case 4:
                    System.out.print("Enter directory name to create: ");
                    String dirName = sc.nextLine();
                    createDirectory(dirName);
                    break;

                case 5:
                    System.out.print("Enter file name to find absolute path: ");
                    String absFile = sc.nextLine();
                    findAbsolutePath(absFile);
                    break;

                case 6:
                    System.out.print("Enter directory path to display files: ");
                    String dirPath = sc.nextLine();
                    displayFiles(dirPath);
                    break;

                case 7:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 7);
        sc.close();
    }

    static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    static void renameFile(String oldName, String newName) {
        File oldFile = new File(oldName);
        File newFile = new File(newName);
        if (oldFile.exists()) {
            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed successfully.");
            } else {
                System.out.println("Failed to rename file.");
            }
        } else {
            System.out.println("File not found.");
        }
    }

    static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete file.");
            }
        } else {
            System.out.println("File not found.");
        }
    }

    static void createDirectory(String dirName) {
        File dir = new File(dirName);
        if (!dir.exists()) {
            if (dir.mkdir()) {
                System.out.println("Directory created successfully.");
            } else {
                System.out.println("Failed to create directory.");
            }
        } else {
            System.out.println("Directory already exists.");
        }
    }

    static void findAbsolutePath(String fileName) {
        File file = new File(fileName);
        System.out.println("Absolute Path: " + file.getAbsolutePath());
    }

    static void displayFiles(String dirPath) {
        File dir = new File(dirPath);
        if (dir.exists() && dir.isDirectory()) {
            String[] files = dir.list();
            if (files != null && files.length > 0) {
                System.out.println("Files in " + dirPath + ":");
                for (String file : files) {
                    System.out.println(file);
                }
            } else {
                System.out.println("No files found in directory.");
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }
}
