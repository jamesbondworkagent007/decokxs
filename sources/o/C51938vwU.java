package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vwU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51938vwU {
    public final java.lang.String AEQbTJ;
    public final java.util.List<C51484vnr> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.vwU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C51938vwU copy$default(C51938vwU c51938vwU, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c51938vwU.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list = c51938vwU.EZpvd;
        }
        return c51938vwU.OLrzqt(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C51484vnr> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C51938vwU OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<C51484vnr> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C51938vwU(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51938vwU)) {
            return false;
        }
        C51938vwU c51938vwU = (C51938vwU) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c51938vwU.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c51938vwU.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CategoryParentCard(typeName=" + this.AEQbTJ + ", typeList=" + this.EZpvd + ")";
    }

    public C51938vwU(@NotNull java.lang.String str, @NotNull java.util.List<C51484vnr> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = str;
        this.EZpvd = list;
    }
}
