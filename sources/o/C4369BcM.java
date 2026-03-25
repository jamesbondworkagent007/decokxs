package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.BcM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C4369BcM {
    public static final int $stable = 8;
    public java.util.Map<java.lang.String, java.lang.String> AEQbTJ;
    public java.util.List<java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.BcM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4369BcM copy$default(C4369BcM c4369BcM, java.util.Map map, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = c4369BcM.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list = c4369BcM.copydefault;
        }
        return c4369BcM.OLrzqt(map, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4369BcM OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.String> map, java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(map, "");
        return new C4369BcM(map, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4369BcM)) {
            return false;
        }
        C4369BcM c4369BcM = (C4369BcM) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c4369BcM.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c4369BcM.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        java.util.List<java.lang.String> list = this.copydefault;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WsSubscribeParams(fields=" + this.AEQbTJ + ", excludeKeys=" + this.copydefault + ")";
    }

    public C4369BcM(@NotNull java.util.Map<java.lang.String, java.lang.String> map, java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(map, "");
        this.AEQbTJ = map;
        this.copydefault = list;
    }
}
