package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.growth.PopupNextAction;

/* JADX INFO: loaded from: classes25.dex */
public final class AOH {
    public static final int $stable = 8;
    public java.util.Map<java.lang.Integer, java.lang.Integer> AEQbTJ;
    public java.util.Map<java.lang.Integer, ? extends PopupNextAction> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.AOH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AOH copy$default(AOH aoh, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = aoh.AEQbTJ;
        }
        if ((i & 2) != 0) {
            map2 = aoh.KWHzl;
        }
        return aoh.OLrzqt(map, map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.Integer, ? extends uniffi.growth.PopupNextAction>, java.util.Map<java.lang.Integer, uniffi.growth.PopupNextAction> */
    public final java.util.Map<java.lang.Integer, PopupNextAction> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.Integer, java.lang.Integer> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AOH OLrzqt(@NotNull java.util.Map<java.lang.Integer, java.lang.Integer> map, @NotNull java.util.Map<java.lang.Integer, ? extends PopupNextAction> map2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        return new AOH(map, map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AOH)) {
            return false;
        }
        AOH aoh = (AOH) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, aoh.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, aoh.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PopupPriorityConfig(priorityMap=" + this.AEQbTJ + ", completionPolicies=" + this.KWHzl + ")";
    }

    public AOH(@NotNull java.util.Map<java.lang.Integer, java.lang.Integer> map, @NotNull java.util.Map<java.lang.Integer, ? extends PopupNextAction> map2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        this.AEQbTJ = map;
        this.KWHzl = map2;
    }
}
