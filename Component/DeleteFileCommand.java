package Component;
//ConcreteCommand per l'eliminazione di un file

class DeleteFileCommand implements Command {
    private FileManager fileManager;
    private String fileName;

    public DeleteFileCommand(FileManager fileManager, String fileName) {
        this.fileManager = fileManager;
        this.fileName = fileName;
    }

    public void execute() {
        fileManager.deleteFile(fileName);
    }
}