package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SequenceInputStream {
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SequenceInputStream copy$default(SequenceInputStream sequenceInputStream, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = sequenceInputStream.OLrzqt;
        }
        return sequenceInputStream.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SequenceInputStream AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SequenceInputStream(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SequenceInputStream) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((SequenceInputStream) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    public SequenceInputStream(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    public java.lang.String toString() {
        return Reader.uaPair$default("exec-env", this.OLrzqt, null, 4, null);
    }
}
