package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10185bjg {
    public final java.lang.Integer OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C10185bjg copy$default(C10185bjg c10185bjg, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = c10185bjg.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c10185bjg.copydefault;
        }
        return c10185bjg.KWHzl(num, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10185bjg KWHzl(java.lang.Integer num, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C10185bjg(num, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10185bjg)) {
            return false;
        }
        C10185bjg c10185bjg = (C10185bjg) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c10185bjg.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c10185bjg.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Integer num = this.OLrzqt;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TxDetailLoadFailedData(code=" + this.OLrzqt + ", msg=" + this.copydefault + ")";
    }

    public C10185bjg(java.lang.Integer num, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = num;
        this.copydefault = str;
    }
}
