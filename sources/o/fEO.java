package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fEO implements fDL<java.lang.Object> {
    public final java.util.List<java.lang.Object> AEQbTJ;
    public final java.lang.CharSequence EZpvd;

    @Override // o.fDL
    public boolean AEQbTJ() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Object> copydefault() {
        return this.AEQbTJ;
    }

    public fEO(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.EZpvd = charSequence;
        this.AEQbTJ = new java.util.ArrayList();
    }

    @Override // o.fDL
    public int OLrzqt() {
        return this.AEQbTJ.size();
    }

    @Override // o.fDL
    public java.lang.Object copydefault(int i) {
        return this.AEQbTJ.get(i);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(fEO.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        fEO feo = (fEO) obj;
        return Intrinsics.EZpvd(this.EZpvd, feo.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, feo.AEQbTJ);
    }

    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
    }
}
