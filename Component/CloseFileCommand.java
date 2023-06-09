package Component;
// ConcreteCommand per la chiusura di un file

class CloseFileCommand implements Command {
    private FileManager fileManager;
    private String fileName;

    public CloseFileCommand(FileManager fileManager, String fileName) {
        this.fileManager = fileManager;
        this.fileName = fileName;
    }

    public void execute() {
        fileManager.closeFile(fileName);
    }
}