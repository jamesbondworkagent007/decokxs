package o;

import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aWZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6818aWZ implements RxBus.Application {
    public final java.lang.String AEQbTJ;
    public final java.util.Map<java.lang.String, java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.aWZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C6818aWZ copy$default(C6818aWZ c6818aWZ, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c6818aWZ.AEQbTJ;
        }
        if ((i & 2) != 0) {
            map = c6818aWZ.copydefault;
        }
        return c6818aWZ.copydefault(str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
        return this.copydefault;
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6818aWZ copydefault(@NotNull java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C6818aWZ(str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6818aWZ)) {
            return false;
        }
        C6818aWZ c6818aWZ = (C6818aWZ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c6818aWZ.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c6818aWZ.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        java.util.Map<java.lang.String, java.lang.String> map = this.copydefault;
        return (iHashCode * 31) + (map == null ? 0 : map.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WebLoadEvent(url=" + this.AEQbTJ + ", additionalHttpHeaders=" + this.copydefault + ")";
    }

    public C6818aWZ(@NotNull java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.copydefault = map;
    }
}
