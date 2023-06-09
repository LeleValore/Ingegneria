package Component;

class CreateFileCommand implements Command {
    private FileManager fileManager;
    private String fileName;

    public CreateFileCommand(FileManager fileManager, String fileName) {
        this.fileManager = fileManager;
        this.fileName = fileName;
    }

    public void execute() {
        fileManager.createFile(fileName);
    }
}