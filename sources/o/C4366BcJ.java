package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.BcJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C4366BcJ {
    public static final int $stable = 8;
    public java.lang.String KWHzl;
    public java.util.Map<java.lang.String, java.lang.String> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.BcJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4366BcJ copy$default(C4366BcJ c4366BcJ, java.util.Map map, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = c4366BcJ.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c4366BcJ.KWHzl;
        }
        return c4366BcJ.AEQbTJ(map, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4366BcJ AEQbTJ(java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C4366BcJ(map, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4366BcJ)) {
            return false;
        }
        C4366BcJ c4366BcJ = (C4366BcJ) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c4366BcJ.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c4366BcJ.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.Map<java.lang.String, java.lang.String> map = this.OLrzqt;
        return ((map == null ? 0 : map.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WsIncomingData(source=" + this.OLrzqt + ", payload=" + this.KWHzl + ")";
    }

    public C4366BcJ(java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = map;
        this.KWHzl = str;
    }
}
