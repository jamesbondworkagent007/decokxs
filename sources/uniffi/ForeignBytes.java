package uniffi;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/* JADX INFO: loaded from: classes17.dex */
@Structure.FieldOrder({"len", "data"})
public class ForeignBytes extends Structure {
    public static final int $stable = 8;
    public Pointer data;
    public int len;

    public static final class ByValue extends ForeignBytes implements Structure.ByValue {
        public static final int $stable = 0;
    }
}
