package o;

import com.okinc.planet.biz_home.feed_tab.FeedPage;
import com.okinc.planet.biz_home.root.PlanetSubPage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tyB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47861tyB {
    public final boolean AEQbTJ;
    public final boolean AYXKKw;
    public final int EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final java.util.List<PlanetSubPage> copydefault;
    public final boolean gEmmrt;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47861tyB() {
        this(null, 0, false, false, false, false, 0, 0, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47861tyB EZpvd(@NotNull java.util.List<? extends PlanetSubPage> list, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, @androidx.annotation.StringRes int i3) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C47861tyB(list, i, z, z2, z3, z4, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PlanetSubPage> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47861tyB)) {
            return false;
        }
        C47861tyB c47861tyB = (C47861tyB) obj;
        return Intrinsics.EZpvd(this.copydefault, c47861tyB.copydefault) && this.EZpvd == c47861tyB.EZpvd && this.AEQbTJ == c47861tyB.AEQbTJ && this.valueOf == c47861tyB.valueOf && this.gEmmrt == c47861tyB.gEmmrt && this.AYXKKw == c47861tyB.AYXKKw && this.KWHzl == c47861tyB.KWHzl && this.OLrzqt == c47861tyB.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.copydefault.hashCode() * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PlanetRootUiState(availableTabs=" + this.copydefault + ", currentPosition=" + this.EZpvd + ", isChatTabAdded=" + this.AEQbTJ + ", isFeedTabAdded=" + this.valueOf + ", shouldShowAddButton=" + this.gEmmrt + ", needsUpdateTab=" + this.AYXKKw + ", chatUnreadCount=" + this.KWHzl + ", feedTabTitleRes=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.planet.biz_home.root.PlanetSubPage> */
    /* JADX WARN: Multi-variable type inference failed */
    public C47861tyB(@NotNull java.util.List<? extends PlanetSubPage> list, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, @androidx.annotation.StringRes int i3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        this.EZpvd = i;
        this.AEQbTJ = z;
        this.valueOf = z2;
        this.gEmmrt = z3;
        this.AYXKKw = z4;
        this.KWHzl = i2;
        this.OLrzqt = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0050: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:415)) : (r10v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0030: ARITH (r18v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r16v0 int) : (0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0037: ARITH (r18v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003d: INVOKE 
  (wrap:com.okinc.planet.biz_home.feed_tab.FeedPage:0x003b: SGET  A[WRAPPED] (LINE:422) com.okinc.planet.biz_home.feed_tab.FeedPage.FOR_YOU com.okinc.planet.biz_home.feed_tab.FeedPage)
 VIRTUAL call: com.okinc.planet.biz_home.feed_tab.FeedPage.getTitleResId():int A[MD:():int (m), WRAPPED] (LINE:422)) : (r17v0 int))
 A[MD:(java.util.List<? extends com.okinc.planet.biz_home.root.PlanetSubPage>, int, boolean, boolean, boolean, boolean, int, int):void (m)] (LINE:414) call: o.tyB.<init>(java.util.List, int, boolean, boolean, boolean, boolean, int, int):void type: THIS */
    public /* synthetic */ C47861tyB(java.util.List list, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? yDY.AhwBna() : list, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? false : z, (i4 & 8) != 0 ? false : z2, (i4 & 16) != 0 ? false : z3, (i4 & 32) != 0 ? false : z4, (i4 & 64) == 0 ? i2 : 0, (i4 & 128) != 0 ? FeedPage.FOR_YOU.getTitleResId() : i3);
    }
}
