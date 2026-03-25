package o;

import com.amplifyframework.core.model.ModelIdentifier;
import okio.Utf8;
import org.jdom2.Attribute;
import org.jdom2.Element;
import org.jdom2.Namespace;

/* JADX INFO: renamed from: o.zpE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59868zpE {
    public static final byte[] AEQbTJ;
    public static final int[] EZpvd;
    public static final byte[] OLrzqt;

    public static boolean AYXKKw(char c) {
        return c == ' ' || c == '\n' || c == '\t' || c == '\r';
    }

    public static boolean KWHzl(char c) {
        return 55 == (c >>> '\n');
    }

    public static int OLrzqt(char c, char c2) {
        return ((c - 55296) * 1024) + 65536 + (c2 - Utf8.LOG_SURROGATE_HEADER);
    }

    public static boolean OLrzqt(char c) {
        return 54 == (c >>> '\n');
    }

    public static boolean copydefault(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        if (c < '?' || c > 'Z') {
            return (c >= '\'' && c <= ';') || c == ' ' || c == '!' || c == '=' || c == '#' || c == '$' || c == '_' || c == '%' || c == '\n' || c == '\r' || c == '\t';
        }
        return true;
    }

    static {
        byte[] bArr = new byte[622];
        byte[] bArr2 = new byte[622];
        java.lang.System.arraycopy("\u0000\u0001\u0000\u0001\u0000\u0001A\u0001AIAYA\u0001A\u0001AO\u0001M\u0001O\u0001A\u0001\t\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\t\u0001)\u0001)\u0001\u000f\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001)\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001\u000f\u0001\u000f\u0001\u000f\u0001\t\u000f)\u0001\u0019\u0001)\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f)\u000f)\u0001)\u0001\u0019\u0001)\u0001\u000f\u0001)\u000f)\u0001)\u0001\u000f)\u0001\u0019\u0001)\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001)\u0001)\u0001)\u0001)\u0001)\u0001\u000f\u0001\u000f)\u0001\u0019\u000f\u0001)\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001)\u0001)\u0001)\u0001)\u0001\u000f\u0001\u000f\u0001\u0019)\u000f\u0001)\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001)\u000f)\u0001)\u0001)\u0001\u000f\u0001\u0019\u0001)\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001)\u000f)\u0001)\u0001)\u0001)\u0001\u000f\u0001\u000f\u0001\u0019\u0001)\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001)\u0001)\u0001)\u0001)\u0001\u0019\u0001)\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001)\u0001)\u0001)\u0001)\u0001\u000f\u0001\u0019\u0001)\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001)\u0001)\u0001)\u0001)\u0001\u000f\u0001\u000f\u0001\u0019\u0001)\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001)\u0001)\u0001)\u0001)\u0001\u000f\u0001\u0019\u0001\u000f\u0001\u000f)\u000f)\u0001\u000f\t)\u0001\u0019\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f)\u000f)\u0001)\u000f\u0001\u000f\u0001\t\u0001)\u0001\u0019\u0001)\u0001\u0019\u0001)\u0001)\u0001)\u0001)\u000f\u0001\u000f\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001)\u0001)\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\t\u0001\u000f\u0001\u000f)\u0001\t\u0001\u000f\u0001)\u0001\t\u0001\u000f\u0001\t\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0000\u0001\u0000".getBytes("ISO-8859-1"), 0, bArr2, 0, 622);
        java.lang.System.arraycopy(bArr2, 0, bArr, 0, 622);
        AEQbTJ = bArr;
        int[] iArr = new int[622];
        int[] iArr2 = new int[622];
        java.nio.ByteBuffer.wrap("\u0000\u0000\u0000\t\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0012\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\t\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\n\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u001a\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u001a\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u00008\u0000\u0000\u0000\u0001\u0000\u0000\u0000\b\u0000\u0000\u0000\u0017\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u001f\u0000\u0000\u0000\u0001\u0000\u0000\u0000:\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u000b\u0000\u0000\u0000\u0002\u0000\u0000\u0000\b\u0000\u0000\u0000\u0001\u0000\u0000\u00005\u0000\u0000\u0000\u0001\u0000\u0000\u0000D\u0000\u0000\u0000\t\u0000\u0000\u0000$\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u001e\u0000\u0000\u00008\u0000\u0000\u0000Y\u0000\u0000\u0000\u0012\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u0002\u0000\u0000\u0000.\u0000\u0000\u0000F\u0000\u0000\u0000\u001a\u0000\u0000\u0000\u0002\u0000\u0000\u0000$\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0014\u0000\u0000\u0000\u0001\u0000\u0000\u0000,\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0012\u0000\u0000\u0000\r\u0000\u0000\u0000\f\u0000\u0000\u0000\u0001\u0000\u0000\u0000B\u0000\u0000\u0000\u0001\u0000\u0000\u0000\f\u0000\u0000\u0000\u0001\u0000\u0000\u0000$\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0004\u0000\u0000\u0000\t\u0000\u0000\u00005\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u0002\u0000\u0000\u0000\b\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u00007\u0000\u0000\u0000&\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000&\u0000\u0000\u0000\n\u0000\u0000\u0000\u0011\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0017\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u000b\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0003\u0000\u0000\u0000.\u0000\u0000\u0000\u001a\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0001\u0000\u0000\u0000\n\u0000\u0000\u0000\b\u0000\u0000\u0000\r\u0000\u0000\u0000\n\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0001\u0000\u0000\u0000G\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0002\u0000\u0000\u0000\n\u0000\u0000\u0002\u0007\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u00005\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0000\u0000\n\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\n\u0000\u0000\u0000\u0011\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\b\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0016\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0003\u0000\u0000\u0000\t\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\n\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0016\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u000b\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\n\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0003\u0000\u0000\u0000\f\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0016\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\b\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0012\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000\n\u0000\u0000\u0000\u0011\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\b\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0016\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0003\u0000\u0000\u0000\b\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0004\u0000\u0000\u0000\n\u0000\u0000\u0000\u0012\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0003\u0000\u0000\u0000\b\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0004\u0000\u0000\u0000\t\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u000f\u0000\u0000\u0000\t\u0000\u0000\u0000\u0011\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\b\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0017\u0000\u0000\u0000\u0001\u0000\u0000\u0000\n\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0002\u0000\u0000\u0000\t\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0004\u0000\u0000\u0000\n\u0000\u0000\u0000\u0012\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\b\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0017\u0000\u0000\u0000\u0001\u0000\u0000\u0000\n\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0004\u0000\u0000\u0000\n\u0000\u0000\u0000\u0012\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\b\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0017\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0004\u0000\u0000\u0000\t\u0000\u0000\u0000\u0001\u0000\u0000\u0000\b\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0004\u0000\u0000\u0000\n\u0000\u0000\u0000\u0091\u0000\u0000\u0000.\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0001\u0000\u0000\u0000\b\u0000\u0000\u0000\u0001\u0000\u0000\u0000\n\u0000\u0000\u0000'\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0002\u0000\u0000\u0000\n\u0000\u0000\u0000>\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0006\u0000\u0000\u0000\n\u0000\u0000\u0000\u000b\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0002\u0000\u0000\u0000\b\u0000\u0000\u0000\u0001\u0000\u0000\u0000!\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0014\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0015\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000æ\u0000\u0000\u0000&\u0000\u0000\u0000\n\u0000\u0000\u0000'\u0000\u0000\u0000\t\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000)\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u000b\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000(\u0000\u0000\u0000\u0001\u0000\u0000\u0000\t\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000(\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0000\u0000\b\u0000\u0000\u0000\u0001\u0000\u0000\f\u0006\u0000\u0000\u0000\u009c\u0000\u0000\u0000\u0004\u0000\u0000\u0000Z\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0016\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0002\u0000\u0000\u0000&\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0002\u0000\u0000\u0000\b\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u001f\u0000\u0000\u0000\u0002\u0000\u0000\u00005\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0004\u0000\u0000\u0000\r\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000Ó\u0000\u0000\u0000\r\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0000\u0000D\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000Q\u0000\u0000\u0000\u0003\u0000\u0000\u000e\u0082\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0019\u0000\u0000\u0000\t\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u000b\u0000\u0000\u0000T\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000Z\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0006\u0000\u0000\u0000(\u0000\u0000\u001cÓ\u0000\u0000Q¦\u0000\u0000\fZ\u0000\u0000+¤\u0000\u0000\u0000\\\u0000\u0000\b\u0000\u0000\u0000\u001fþ\u0000\u0000\u0000\u0002".getBytes("ISO-8859-1")).asIntBuffer().get(iArr2, 0, 622);
        java.lang.System.arraycopy(iArr2, 0, iArr, 0, 622);
        EZpvd = iArr;
        OLrzqt = copydefault();
    }

    public static final byte[] copydefault() {
        byte[] bArr = new byte[65536];
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = AEQbTJ;
            if (i >= bArr2.length) {
                return bArr;
            }
            byte b = bArr2[i];
            int i3 = EZpvd[i];
            while (true) {
                i3--;
                if (i3 >= 0) {
                    bArr[i2] = b;
                    i2++;
                }
            }
            i++;
        }
    }

    private C59868zpE() {
    }

    public static final java.lang.String djBIcL(java.lang.String str) {
        if (str == null) {
            return "XML names cannot be null";
        }
        if (str.length() == 0) {
            return "XML names cannot be empty";
        }
        if ((OLrzqt[str.charAt(0)] & 4) == 0) {
            return "XML name '" + str + "' cannot begin with the character \"" + str.charAt(0) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
        }
        for (int length = str.length() - 1; length >= 1; length--) {
            if (((byte) (OLrzqt[str.charAt(length)] & 8)) == 0) {
                return "XML name '" + str + "' cannot contain the character \"" + str.charAt(length) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
            }
        }
        return null;
    }

    public static java.lang.String copydefault(java.lang.String str) {
        return djBIcL(str);
    }

    public static java.lang.String AEQbTJ(java.lang.String str) {
        return "xmlns".equals(str) ? "An Attribute name may not be \"xmlns\"; use the Namespace class to manage namespaces" : djBIcL(str);
    }

    public static java.lang.String EZpvd(java.lang.String str) {
        if (str == null) {
            return "A null is not a legal XML value";
        }
        int length = str.length();
        int i = 0;
        while (i < length) {
            while (OLrzqt[str.charAt(i)] != 0) {
                i++;
                if (i == length) {
                    return null;
                }
            }
            if (!OLrzqt(str.charAt(i))) {
                return java.lang.String.format("0x%04x is not a legal XML character", java.lang.Integer.valueOf(str.charAt(i)));
            }
            int i2 = i + 1;
            if (i2 >= length) {
                return java.lang.String.format("Truncated Surrogate Pair 0x%04x????", java.lang.Integer.valueOf(str.charAt(i)));
            }
            if (KWHzl(str.charAt(i2))) {
                if (!KWHzl(OLrzqt(str.charAt(i), str.charAt(i2)))) {
                    return java.lang.String.format("0x%06x is not a legal XML character", java.lang.Integer.valueOf(OLrzqt(str.charAt(i), str.charAt(i2))));
                }
                i += 2;
            } else {
                return java.lang.String.format("Illegal Surrogate Pair 0x%04x%04x", java.lang.Integer.valueOf(str.charAt(i)), java.lang.Integer.valueOf(str.charAt(i2)));
            }
        }
        return null;
    }

    public static java.lang.String KWHzl(java.lang.String str) {
        java.lang.String strEZpvd = EZpvd(str);
        if (strEZpvd != null) {
            return strEZpvd;
        }
        if (str.indexOf("]]>") != -1) {
            return "CDATA cannot internally contain a CDATA ending delimiter (]]>)";
        }
        return null;
    }

    public static java.lang.String AhwBna(java.lang.String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        if (djBIcL(str) != null) {
            return djBIcL(str);
        }
        if (str.length() < 3) {
            return null;
        }
        if (str.charAt(0) != 'x' && str.charAt(0) != 'X') {
            return null;
        }
        if (str.charAt(1) != 'm' && str.charAt(1) != 'M') {
            return null;
        }
        if (str.charAt(2) == 'l' || str.charAt(2) == 'L') {
            return "Namespace prefixes cannot begin with \"xml\" in any combination of case";
        }
        return null;
    }

    public static java.lang.String AYXKKw(java.lang.String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        char cCharAt = str.charAt(0);
        if (java.lang.Character.isDigit(cCharAt)) {
            return "Namespace URIs cannot begin with a number";
        }
        if (cCharAt == '$') {
            return "Namespace URIs cannot begin with a dollar sign ($)";
        }
        if (cCharAt == '-') {
            return "Namespace URIs cannot begin with a hyphen (-)";
        }
        if (AYXKKw(cCharAt)) {
            return "Namespace URIs cannot begin with white-space";
        }
        return null;
    }

    public static java.lang.String copydefault(Namespace namespace, Namespace namespace2) {
        java.lang.String prefix = namespace.getPrefix();
        java.lang.String uri = namespace.getURI();
        java.lang.String prefix2 = namespace2.getPrefix();
        java.lang.String uri2 = namespace2.getURI();
        if (!prefix.equals(prefix2) || uri.equals(uri2)) {
            return null;
        }
        return "The namespace prefix \"" + prefix + "\" collides";
    }

    public static java.lang.String EZpvd(Attribute attribute, Element element) {
        return EZpvd(attribute, element, -1);
    }

    public static java.lang.String EZpvd(Attribute attribute, Element element, int i) {
        Namespace namespace = attribute.getNamespace();
        if ("".equals(namespace.getPrefix())) {
            return null;
        }
        return OLrzqt(namespace, element, i);
    }

    public static java.lang.String EZpvd(Namespace namespace, Element element) {
        return OLrzqt(namespace, element, -1);
    }

    public static java.lang.String OLrzqt(Namespace namespace, Element element, int i) {
        java.lang.String strCopydefault;
        java.lang.String strOLrzqt;
        java.lang.String strCopydefault2 = copydefault(namespace, element.getNamespace());
        if (strCopydefault2 != null) {
            return strCopydefault2 + " with the element namespace prefix";
        }
        if (element.hasAdditionalNamespaces() && (strOLrzqt = OLrzqt(namespace, element.getAdditionalNamespaces())) != null) {
            return strOLrzqt;
        }
        if (!element.hasAttributes() || (strCopydefault = copydefault(namespace, element.getAttributes(), i)) == null) {
            return null;
        }
        return strCopydefault;
    }

    public static java.lang.String AEQbTJ(Namespace namespace, Attribute attribute) {
        if (attribute.getNamespace().equals(Namespace.NO_NAMESPACE)) {
            return null;
        }
        java.lang.String strCopydefault = copydefault(namespace, attribute.getNamespace());
        if (strCopydefault == null) {
            return strCopydefault;
        }
        return strCopydefault + " with an attribute namespace prefix on the element";
    }

    public static java.lang.String OLrzqt(Namespace namespace, java.util.List<?> list) {
        return copydefault(namespace, list, -1);
    }

    public static java.lang.String copydefault(Namespace namespace, java.util.List<?> list, int i) {
        java.lang.String strAEQbTJ = null;
        if (list == null) {
            return null;
        }
        java.util.Iterator<?> it = list.iterator();
        int i2 = -1;
        while (strAEQbTJ == null && it.hasNext()) {
            java.lang.Object next = it.next();
            i2++;
            if (next instanceof Attribute) {
                if (i2 != i) {
                    strAEQbTJ = AEQbTJ(namespace, (Attribute) next);
                }
            } else if (next instanceof Element) {
                strAEQbTJ = EZpvd(namespace, (Element) next);
            } else if ((next instanceof Namespace) && (strAEQbTJ = copydefault(namespace, (Namespace) next)) != null) {
                strAEQbTJ = strAEQbTJ + " with an additional namespace declared by the element";
            }
        }
        return strAEQbTJ;
    }

    public static java.lang.String gEmmrt(java.lang.String str) {
        java.lang.String strFetchVPNInfo = fetchVPNInfo(str);
        if (strFetchVPNInfo != null) {
            return strFetchVPNInfo;
        }
        if (str.indexOf(":") != -1) {
            return "Processing instruction targets cannot contain colons";
        }
        if (str.equalsIgnoreCase("xml")) {
            return "Processing instructions cannot have a target of \"xml\" in any combination of case. (Note that the \"<?xml ... ?>\" declaration at the beginning of a document is not a processing instruction and should not be added as one; it is written automatically during output, e.g. by XMLOutputter.)";
        }
        return null;
    }

    public static java.lang.String valueOf(java.lang.String str) {
        java.lang.String strEZpvd = EZpvd(str);
        return (strEZpvd != null || str.indexOf("?>") < 0) ? strEZpvd : "Processing instructions cannot contain the string \"?>\"";
    }

    public static java.lang.String OLrzqt(java.lang.String str) {
        java.lang.String strEZpvd = EZpvd(str);
        if (strEZpvd != null) {
            return strEZpvd;
        }
        if (str.indexOf("--") != -1) {
            return "Comments cannot contain double hyphens (--)";
        }
        if (str.endsWith("-")) {
            return "Comment data cannot end with a hyphen.";
        }
        return null;
    }

    public static java.lang.String values(java.lang.String str) {
        if (str == null) {
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!copydefault(cCharAt)) {
                return cCharAt + " is not a legal character in public IDs";
            }
        }
        return null;
    }

    public static java.lang.String AkhnZx(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return (str.indexOf(39) == -1 || str.indexOf(34) == -1) ? EZpvd(str) : "System literals cannot simultaneously contain both single and double quotes.";
    }

    public static java.lang.String fetchVPNInfo(java.lang.String str) {
        if (str == null) {
            return "XML names cannot be null";
        }
        int length = str.length();
        if (length == 0) {
            return "XML names cannot be empty";
        }
        if (!EZpvd(str.charAt(0))) {
            return "XML names cannot begin with the character \"" + str.charAt(0) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
        }
        for (int i = 1; i < length; i++) {
            if (!AEQbTJ(str.charAt(i))) {
                return "XML names cannot contain the character \"" + str.charAt(i) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
            }
        }
        return null;
    }

    public static boolean KWHzl(int i) {
        return i >= 65536 ? i <= 1114111 : ((byte) (OLrzqt[i] & 1)) != 0;
    }

    public static boolean AEQbTJ(char c) {
        return ((byte) (OLrzqt[c] & 8)) != 0 || c == ':';
    }

    public static boolean EZpvd(char c) {
        return ((byte) (OLrzqt[c] & 4)) != 0 || c == ':';
    }
}
