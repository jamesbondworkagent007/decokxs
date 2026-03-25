package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AoA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C3551AoA {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AhwBna;
    public java.util.Map<java.lang.String, java.lang.String> EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.AoA */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3551AoA copy$default(C3551AoA c3551AoA, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c3551AoA.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c3551AoA.AhwBna;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = c3551AoA.KWHzl;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = c3551AoA.AEQbTJ;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = c3551AoA.OLrzqt;
        }
        java.lang.String str9 = str5;
        if ((i & 32) != 0) {
            map = c3551AoA.EZpvd;
        }
        return c3551AoA.OLrzqt(str, str6, str7, str8, str9, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3551AoA OLrzqt(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C3551AoA(str, str2, str3, str4, str5, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3551AoA)) {
            return false;
        }
        C3551AoA c3551AoA = (C3551AoA) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c3551AoA.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c3551AoA.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c3551AoA.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c3551AoA.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c3551AoA.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c3551AoA.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        java.lang.String str = this.AhwBna;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.AEQbTJ;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.OLrzqt;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        java.util.Map<java.lang.String, java.lang.String> map = this.EZpvd;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GrafanaEventData(act=" + this.copydefault + ", source=" + this.AhwBna + ", path=" + this.KWHzl + ", code=" + this.AEQbTJ + ", msg=" + this.OLrzqt + ", attrs=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AhwBna;
    }

    public C3551AoA(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.AhwBna = str2;
        this.KWHzl = str3;
        this.AEQbTJ = str4;
        this.OLrzqt = str5;
        this.EZpvd = map;
    }
}
