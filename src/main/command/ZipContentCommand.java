import java.util.List;

public class ZipContentCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Просмотр содержимого архива.");

        ZipFileManager zipFileManager = getZipFileManager();

        ConsoleHelper.writeMessage("Содержимое архива:");
        zipFileManager.getFilesList()
                .forEach(fileProperties ->
                        ConsoleHelper.writeMessage(fileProperties.toString()));

        ConsoleHelper.writeMessage("Содержимое архива прочитано.");
    }
}