package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xSr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54716xSr {
    public final java.lang.String EZpvd;
    public final java.util.List<C54713xSo> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xSr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C54716xSr copy$default(C54716xSr c54716xSr, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c54716xSr.EZpvd;
        }
        if ((i & 2) != 0) {
            list = c54716xSr.KWHzl;
        }
        return c54716xSr.EZpvd(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C54713xSo> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54716xSr EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<C54713xSo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C54716xSr(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54716xSr)) {
            return false;
        }
        C54716xSr c54716xSr = (C54716xSr) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c54716xSr.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c54716xSr.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchGroupResult(bizType=" + this.EZpvd + ", bizInstList=" + this.KWHzl + ")";
    }

    public C54716xSr(@NotNull java.lang.String str, @NotNull java.util.List<C54713xSo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = str;
        this.KWHzl = list;
    }
}
