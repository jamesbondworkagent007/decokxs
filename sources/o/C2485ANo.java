package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ANo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C2485ANo {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String OLrzqt;
    public java.util.List<java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ANo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2485ANo copy$default(C2485ANo c2485ANo, java.lang.String str, java.util.List list, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c2485ANo.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list = c2485ANo.copydefault;
        }
        if ((i & 4) != 0) {
            str2 = c2485ANo.OLrzqt;
        }
        return c2485ANo.AEQbTJ(str, list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2485ANo AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C2485ANo(str, list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2485ANo)) {
            return false;
        }
        C2485ANo c2485ANo = (C2485ANo) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c2485ANo.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c2485ANo.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c2485ANo.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ComponentItem(appStoreUrl=" + this.AEQbTJ + ", components=" + this.copydefault + ", pkg=" + this.OLrzqt + ")";
    }

    public C2485ANo(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.copydefault = list;
        this.OLrzqt = str2;
    }
}
