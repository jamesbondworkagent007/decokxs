package o;

import androidx.lifecycle.LiveData;
import com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mXh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32311mXh {
    public final java.lang.String AEQbTJ;
    public final ChartDetailFragment.Companion.SubChartTabType KWHzl;
    public final LiveData<java.lang.String> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mXh */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C32311mXh copy$default(C32311mXh c32311mXh, java.lang.String str, ChartDetailFragment.Companion.SubChartTabType subChartTabType, LiveData liveData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c32311mXh.AEQbTJ;
        }
        if ((i & 2) != 0) {
            subChartTabType = c32311mXh.KWHzl;
        }
        if ((i & 4) != 0) {
            liveData = c32311mXh.OLrzqt;
        }
        return c32311mXh.KWHzl(str, subChartTabType, liveData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartDetailFragment.Companion.SubChartTabType AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32311mXh KWHzl(@NotNull java.lang.String str, @NotNull ChartDetailFragment.Companion.SubChartTabType subChartTabType, LiveData<java.lang.String> liveData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(subChartTabType, "");
        return new C32311mXh(str, subChartTabType, liveData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32311mXh)) {
            return false;
        }
        C32311mXh c32311mXh = (C32311mXh) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c32311mXh.AEQbTJ) && this.KWHzl == c32311mXh.KWHzl && Intrinsics.EZpvd(this.OLrzqt, c32311mXh.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        LiveData<java.lang.String> liveData = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (liveData == null ? 0 : liveData.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TabTitle(title=" + this.AEQbTJ + ", subChartType=" + this.KWHzl + ", count=" + this.OLrzqt + ")";
    }

    public C32311mXh(@NotNull java.lang.String str, @NotNull ChartDetailFragment.Companion.SubChartTabType subChartTabType, LiveData<java.lang.String> liveData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(subChartTabType, "");
        this.AEQbTJ = str;
        this.KWHzl = subChartTabType;
        this.OLrzqt = liveData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$Companion$SubChartTabType)
  (wrap:androidx.lifecycle.LiveData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null androidx.lifecycle.LiveData) : (r3v0 androidx.lifecycle.LiveData))
 A[MD:(java.lang.String, com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$Companion$SubChartTabType, androidx.lifecycle.LiveData<java.lang.String>):void (m)] (LINE:538) call: o.mXh.<init>(java.lang.String, com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$Companion$SubChartTabType, androidx.lifecycle.LiveData):void type: THIS */
    public /* synthetic */ C32311mXh(java.lang.String str, ChartDetailFragment.Companion.SubChartTabType subChartTabType, LiveData liveData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, subChartTabType, (i & 4) != 0 ? null : liveData);
    }
}
