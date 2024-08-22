import org.example.FileReadWrite;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class TestFileReadWrite {

    @Mock
    FileReadWrite fileReadWrite = new FileReadWrite();

    @Test
    public void testFileReadWrite() {
        fileReadWrite.readAndWriteFileContent();
    }
}
