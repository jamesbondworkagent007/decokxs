package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class LineNumberReader {
    public final byte[] EZpvd;
    public final C5173Hn KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LineNumberReader copy$default(LineNumberReader lineNumberReader, byte[] bArr, C5173Hn c5173Hn, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bArr = lineNumberReader.EZpvd;
        }
        if ((i & 2) != 0) {
            c5173Hn = lineNumberReader.KWHzl;
        }
        return lineNumberReader.KWHzl(bArr, c5173Hn);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LineNumberReader KWHzl(@NotNull byte[] bArr, @NotNull C5173Hn c5173Hn) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        return new LineNumberReader(bArr, c5173Hn);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Token(value=" + java.util.Arrays.toString(this.EZpvd) + ", expires=" + this.KWHzl + ')';
    }

    public LineNumberReader(@NotNull byte[] bArr, @NotNull C5173Hn c5173Hn) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        this.EZpvd = bArr;
        this.KWHzl = c5173Hn;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LineNumberReader.class != obj.getClass()) {
            return false;
        }
        LineNumberReader lineNumberReader = (LineNumberReader) obj;
        return java.util.Arrays.equals(this.EZpvd, lineNumberReader.EZpvd) && Intrinsics.EZpvd(this.KWHzl, lineNumberReader.KWHzl);
    }

    public int hashCode() {
        return (java.util.Arrays.hashCode(this.EZpvd) * 31) + this.KWHzl.hashCode();
    }
}
