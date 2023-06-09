package Component;
// Invoker che richiede l'esecuzione del comando

class FileManagerInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        System.out.println("Richiesta di esecuzione del comando.");
        command.execute();
        
    }
}

