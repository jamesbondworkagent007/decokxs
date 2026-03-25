package o;

import com.okinc.business.defi.api.bean.ChartData;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ffT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18281ffT {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ffT.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC18281ffT(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.ffT$ActionBar */
    public static final class ActionBar extends AbstractC18281ffT {
        public static final ActionBar KWHzl = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    private AbstractC18281ffT() {
    }

    /* JADX INFO: renamed from: o.ffT$Activity */
    public static final class Activity extends AbstractC18281ffT {
        public final java.lang.Boolean AEQbTJ;
        public final ChartData AYXKKw;
        public final java.util.List<ChartData> EZpvd;
        public final BigDecimal KWHzl;
        public final java.lang.Boolean OLrzqt;
        public final BigDecimal copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.ffT$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.Boolean bool, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.util.List list, ChartData chartData, java.lang.Boolean bool2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                bigDecimal = activity.KWHzl;
            }
            BigDecimal bigDecimal3 = bigDecimal;
            if ((i & 4) != 0) {
                bigDecimal2 = activity.copydefault;
            }
            BigDecimal bigDecimal4 = bigDecimal2;
            if ((i & 8) != 0) {
                list = activity.EZpvd;
            }
            java.util.List list2 = list;
            if ((i & 16) != 0) {
                chartData = activity.AYXKKw;
            }
            ChartData chartData2 = chartData;
            if ((i & 32) != 0) {
                bool2 = activity.AEQbTJ;
            }
            return activity.AEQbTJ(bool, bigDecimal3, bigDecimal4, list2, chartData2, bool2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ChartData AEQbTJ() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(java.lang.Boolean bool, BigDecimal bigDecimal, BigDecimal bigDecimal2, @NotNull java.util.List<ChartData> list, ChartData chartData, java.lang.Boolean bool2) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Activity(bool, bigDecimal, bigDecimal2, list, chartData, bool2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean AYXKKw() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BigDecimal KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ChartData> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BigDecimal copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd(this.copydefault, activity.copydefault) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd(this.AYXKKw, activity.AYXKKw) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.Boolean bool = this.OLrzqt;
            int iHashCode = bool == null ? 0 : bool.hashCode();
            BigDecimal bigDecimal = this.KWHzl;
            int iHashCode2 = bigDecimal == null ? 0 : bigDecimal.hashCode();
            BigDecimal bigDecimal2 = this.copydefault;
            int iHashCode3 = bigDecimal2 == null ? 0 : bigDecimal2.hashCode();
            int iHashCode4 = this.EZpvd.hashCode();
            ChartData chartData = this.AYXKKw;
            int iHashCode5 = chartData == null ? 0 : chartData.hashCode();
            java.lang.Boolean bool2 = this.AEQbTJ;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "KLineShown(isDefaultTotalRise=" + this.OLrzqt + ", plTotalValue=" + this.KWHzl + ", plTotalValuePercent=" + this.copydefault + ", chartData=" + this.EZpvd + ", totalAssetChartData=" + this.AYXKKw + ", allzeros=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0033: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r6v0 java.lang.Boolean))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r7v0 java.math.BigDecimal))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r8v0 java.math.BigDecimal))
  (wrap:java.util.List:0x001e: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:343)) : (r9v0 java.util.List))
  (wrap:com.okinc.business.defi.api.bean.ChartData:?: TERNARY null = ((wrap:int:0x001f: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.ChartData) : (r10v0 com.okinc.business.defi.api.bean.ChartData))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r11v0 java.lang.Boolean))
 A[MD:(java.lang.Boolean, java.math.BigDecimal, java.math.BigDecimal, java.util.List<com.okinc.business.defi.api.bean.ChartData>, com.okinc.business.defi.api.bean.ChartData, java.lang.Boolean):void (m)] (LINE:339) call: o.ffT.Activity.<init>(java.lang.Boolean, java.math.BigDecimal, java.math.BigDecimal, java.util.List, com.okinc.business.defi.api.bean.ChartData, java.lang.Boolean):void type: THIS */
        public /* synthetic */ Activity(java.lang.Boolean bool, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.util.List list, ChartData chartData, java.lang.Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bigDecimal, (i & 4) != 0 ? null : bigDecimal2, (i & 8) != 0 ? yDY.AhwBna() : list, (i & 16) != 0 ? null : chartData, (i & 32) != 0 ? null : bool2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(java.lang.Boolean bool, BigDecimal bigDecimal, BigDecimal bigDecimal2, @NotNull java.util.List<ChartData> list, ChartData chartData, java.lang.Boolean bool2) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = bool;
            this.KWHzl = bigDecimal;
            this.copydefault = bigDecimal2;
            this.EZpvd = list;
            this.AYXKKw = chartData;
            this.AEQbTJ = bool2;
        }
    }

    /* JADX INFO: renamed from: o.ffT$StateListAnimator */
    public static final class StateListAnimator extends AbstractC18281ffT {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ffT$TaskDescription */
    public static final class TaskDescription extends AbstractC18281ffT {
        public static final TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ffT$Application */
    public static final class Application extends AbstractC18281ffT {
        public static final Application AEQbTJ = new Application();

        private Application() {
            super(null);
        }
    }
}
