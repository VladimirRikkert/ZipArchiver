public class ExitCommand implements Command {

    @Override
    public void execute()  {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
