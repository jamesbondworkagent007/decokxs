package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.roJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43383roJ {
    public final java.util.List<java.lang.String> AEQbTJ;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.roJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C43383roJ copy$default(C43383roJ c43383roJ, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c43383roJ.copydefault;
        }
        if ((i & 2) != 0) {
            list = c43383roJ.AEQbTJ;
        }
        return c43383roJ.AEQbTJ(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43383roJ AEQbTJ(java.lang.String str, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C43383roJ(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43383roJ)) {
            return false;
        }
        C43383roJ c43383roJ = (C43383roJ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c43383roJ.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c43383roJ.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.copydefault;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DomainDetectionResult(availableDomain=" + this.copydefault + ", failedDomains=" + this.AEQbTJ + ")";
    }

    public C43383roJ(java.lang.String str, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = str;
        this.AEQbTJ = list;
    }
}
