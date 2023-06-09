package Component;
// ConcreteCommand per l'apertura di un file

class OpenFileCommand implements Command {
    private FileManager fileManager;
    private String fileName;

    public OpenFileCommand(FileManager fileManager, String fileName) {
        this.fileManager = fileManager;
        this.fileName = fileName;
    }

    public void execute() {
        fileManager.openFile(fileName);
    }
}

