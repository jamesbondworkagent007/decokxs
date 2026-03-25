package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PutField {
    public final java.lang.String OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PutField copy$default(PutField putField, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = putField.copydefault;
        }
        if ((i2 & 2) != 0) {
            str = putField.OLrzqt;
        }
        return putField.copydefault(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PutField copydefault(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PutField(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PutField)) {
            return false;
        }
        PutField putField = (PutField) obj;
        return this.copydefault == putField.copydefault && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) putField.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.copydefault) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FileLine(lineNumber=" + this.copydefault + ", content=" + this.OLrzqt + ')';
    }

    public PutField(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = i;
        this.OLrzqt = str;
    }
}
