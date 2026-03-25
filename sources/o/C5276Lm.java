package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Lm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5276Lm {
    public final java.util.Map<java.lang.String, java.lang.Object> AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.util.Map<java.lang.String, java.lang.Object> KWHzl;
    public java.util.Map<java.lang.String, ? extends java.lang.Object> OLrzqt;
    public final java.util.Map<java.lang.String, java.lang.Object> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.Lm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C5276Lm copy$default(C5276Lm c5276Lm, java.lang.String str, java.util.Map map, java.util.Map map2, java.util.Map map3, java.util.Map map4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c5276Lm.EZpvd;
        }
        if ((i & 2) != 0) {
            map = c5276Lm.copydefault;
        }
        java.util.Map map5 = map;
        if ((i & 4) != 0) {
            map2 = c5276Lm.AEQbTJ;
        }
        java.util.Map map6 = map2;
        if ((i & 8) != 0) {
            map3 = c5276Lm.KWHzl;
        }
        java.util.Map map7 = map3;
        if ((i & 16) != 0) {
            map4 = c5276Lm.OLrzqt;
        }
        return c5276Lm.AEQbTJ(str, map5, map6, map7, map4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.Object> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5276Lm AEQbTJ(@NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.Map<java.lang.String, ? extends java.lang.Object> map2, java.util.Map<java.lang.String, ? extends java.lang.Object> map3, java.util.Map<java.lang.String, ? extends java.lang.Object> map4) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C5276Lm(str, map, map2, map3, map4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.Object> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.Object> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.Object> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5276Lm)) {
            return false;
        }
        C5276Lm c5276Lm = (C5276Lm) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c5276Lm.EZpvd) && Intrinsics.EZpvd(this.copydefault, c5276Lm.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c5276Lm.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c5276Lm.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c5276Lm.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        java.util.Map<java.lang.String, java.lang.Object> map = this.copydefault;
        int iHashCode2 = map == null ? 0 : map.hashCode();
        java.util.Map<java.lang.String, java.lang.Object> map2 = this.AEQbTJ;
        int iHashCode3 = map2 == null ? 0 : map2.hashCode();
        java.util.Map<java.lang.String, java.lang.Object> map3 = this.KWHzl;
        int iHashCode4 = map3 == null ? 0 : map3.hashCode();
        java.util.Map<java.lang.String, ? extends java.lang.Object> map4 = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (map4 != null ? map4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Event(eventType=" + this.EZpvd + ", eventProperties=" + this.copydefault + ", userProperties=" + this.AEQbTJ + ", groups=" + this.KWHzl + ", groupProperties=" + this.OLrzqt + ')';
    }

    public C5276Lm(@NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.Map<java.lang.String, ? extends java.lang.Object> map2, java.util.Map<java.lang.String, ? extends java.lang.Object> map3, java.util.Map<java.lang.String, ? extends java.lang.Object> map4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.copydefault = map;
        this.AEQbTJ = map2;
        this.KWHzl = map3;
        this.OLrzqt = map4;
    }
}
