package Component;
// Receiver che contiene la logica di business per le operazioni sui file
class FileManager {
    public void createFile(String fileName) {
        System.out.println("Creazione del file: " + fileName);
        // Logica per la creazione del file
    }

    public void openFile(String fileName) {
        System.out.println("Apertura del file: " + fileName);
        // Logica per l'apertura del file
    }

    public void closeFile(String fileName) {
        System.out.println("Chiusura del file: " + fileName);
        // Logica per la chiusura del file
    }

    public void deleteFile(String fileName) {
        System.out.println("Eliminazione del file: " + fileName);
        // Logica per l'eliminazione del file
    }
}
