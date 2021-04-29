package logger;

public class FileLogger extends Logger{

	@Override
	public void Log() {
		super.Log();
		System.out.println("FileLogger Çalıştı");
	}
}
