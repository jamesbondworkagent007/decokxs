package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iWQ {
    public final int AEQbTJ;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ iWQ copy$default(iWQ iwq, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = iwq.copydefault;
        }
        if ((i2 & 2) != 0) {
            i = iwq.AEQbTJ;
        }
        return iwq.copydefault(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iWQ copydefault(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new iWQ(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iWQ)) {
            return false;
        }
        iWQ iwq = (iWQ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) iwq.copydefault) && this.AEQbTJ == iwq.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FilterItem(filterKey=" + this.copydefault + ", filterType=" + this.AEQbTJ + ")";
    }

    public iWQ(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.AEQbTJ = i;
    }
}
