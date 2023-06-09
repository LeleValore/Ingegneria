package Component;
public class Client {
    public static void main(String[] args) {
        // Creazione del receiver
        FileManager fileManager = new FileManager();

        // Creazione dei comandi con il receiver associato
        Command createCommand = new CreateFileCommand(fileManager, "file.txt");
        Command openCommand = new OpenFileCommand(fileManager, "file.txt");
        Command closeCommand = new CloseFileCommand(fileManager, "file.txt");
        Command deleteCommand = new DeleteFileCommand(fileManager, "file.txt");

        // Creazione dell'invoker e assegnazione dei comandi
        FileManagerInvoker invoker = new FileManagerInvoker();
        invoker.setCommand(createCommand);

        // Esecuzione del comando di creazione del file
        invoker.executeCommand();

        // Modifica del comando assegnato all'invoker
        invoker.setCommand(openCommand);

        // Esecuzione del comando di apertura del file
        invoker.executeCommand();

        // Modifica del comando assegnato all'invoker
        invoker.setCommand(closeCommand);

        // Esecuzione del comando di chiusura del file
        invoker.executeCommand();

        // Modifica del comando assegnato all'invoker
        invoker.setCommand(deleteCommand);

        // Esecuzione del comando di eliminazione del file
        invoker.executeCommand();
    }
}
