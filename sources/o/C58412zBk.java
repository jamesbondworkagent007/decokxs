package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zBk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C58412zBk {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.Boolean KWHzl;
    public java.lang.String OLrzqt;
    public boolean copydefault;
    public java.util.List<C58951zVn> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.zBk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C58412zBk copy$default(C58412zBk c58412zBk, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.util.List list, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c58412zBk.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = c58412zBk.AEQbTJ;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = c58412zBk.EZpvd;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            z = c58412zBk.copydefault;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            list = c58412zBk.valueOf;
        }
        java.util.List list2 = list;
        if ((i & 32) != 0) {
            bool = c58412zBk.KWHzl;
        }
        return c58412zBk.OLrzqt(str, str4, str5, z2, list2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58412zBk OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.util.List<C58951zVn> list, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C58412zBk(str, str2, str3, z, list, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C58951zVn> copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58412zBk)) {
            return false;
        }
        C58412zBk c58412zBk = (C58412zBk) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c58412zBk.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c58412zBk.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c58412zBk.EZpvd) && this.copydefault == c58412zBk.copydefault && Intrinsics.EZpvd(this.valueOf, c58412zBk.valueOf) && Intrinsics.EZpvd(this.KWHzl, c58412zBk.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean gEmmrt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        int iHashCode4 = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode5 = this.valueOf.hashCode();
        java.lang.Boolean bool = this.KWHzl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Item(itemType=" + this.OLrzqt + ", content=" + this.AEQbTJ + ", displayType=" + this.EZpvd + ", mandatory=" + this.copydefault + ", params=" + this.valueOf + ", isChecked=" + this.KWHzl + ")";
    }

    public C58412zBk(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.util.List<C58951zVn> list, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = str;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
        this.copydefault = z;
        this.valueOf = list;
        this.KWHzl = bool;
    }
}
