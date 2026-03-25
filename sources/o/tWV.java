package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tWV {
    public static final int copydefault = 8;
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final android.view.View KWHzl;
    public final java.lang.String OLrzqt;
    public final java.util.Map<java.lang.String, C46511tXa> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.tWV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ tWV copy$default(tWV twv, android.view.View view, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            view = twv.KWHzl;
        }
        if ((i & 2) != 0) {
            str = twv.OLrzqt;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            str2 = twv.AEQbTJ;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = twv.EZpvd;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            map = twv.djBIcL;
        }
        return twv.AEQbTJ(view, str4, str5, str6, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final tWV AEQbTJ(@NotNull android.view.View view, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, C46511tXa> map) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new tWV(view, str, str2, str3, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.View EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, C46511tXa> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tWV)) {
            return false;
        }
        tWV twv = (tWV) obj;
        return Intrinsics.EZpvd(this.KWHzl, twv.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) twv.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) twv.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) twv.EZpvd) && Intrinsics.EZpvd(this.djBIcL, twv.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PlanetPluginDataModel(pluginCardView=" + this.KWHzl + ", pluginDeeplink=" + this.OLrzqt + ", metaData=" + this.AEQbTJ + ", pluginDataTime=" + this.EZpvd + ", publishEventTrackProperties=" + this.djBIcL + ")";
    }

    public tWV(@NotNull android.view.View view, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, C46511tXa> map) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.KWHzl = view;
        this.OLrzqt = str;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
        this.djBIcL = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r7v0 android.view.View)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0004: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:29)) : (r11v0 java.util.Map))
 A[MD:(android.view.View, java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, o.tXa>):void (m)] (LINE:15) call: o.tWV.<init>(android.view.View, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void type: THIS */
    public /* synthetic */ tWV(android.view.View view, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, str, str2, str3, (i & 16) != 0 ? C56424yEw.KWHzl() : map);
    }
}
