package o;

import com.okinc.business.invest_biz.data.bean.DisplayText;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iXp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC24173iXp {

    /* JADX INFO: renamed from: o.iXp$ActionBar */
    public static final class ActionBar implements InterfaceC24173iXp {
        public final C24177iXt OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, C24177iXt c24177iXt, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c24177iXt = actionBar.OLrzqt;
            }
            return actionBar.OLrzqt(c24177iXt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C24177iXt KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull C24177iXt c24177iXt) {
            Intrinsics.checkNotNullParameter(c24177iXt, "");
            return new ActionBar(c24177iXt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.OLrzqt, ((ActionBar) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Normal(config=" + this.OLrzqt + ")";
        }

        public ActionBar(@NotNull C24177iXt c24177iXt) {
            Intrinsics.checkNotNullParameter(c24177iXt, "");
            this.OLrzqt = c24177iXt;
        }
    }

    /* JADX INFO: renamed from: o.iXp$Activity */
    public static final class Activity implements InterfaceC24173iXp {
        public final java.util.List<DisplayText> AEQbTJ;
        public final C24177iXt EZpvd;
        public final int KWHzl;
        public final TransactionStep copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iXp$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, C24177iXt c24177iXt, java.util.List list, TransactionStep transactionStep, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                c24177iXt = activity.EZpvd;
            }
            if ((i2 & 2) != 0) {
                list = activity.AEQbTJ;
            }
            if ((i2 & 4) != 0) {
                transactionStep = activity.copydefault;
            }
            if ((i2 & 8) != 0) {
                i = activity.KWHzl;
            }
            return activity.AEQbTJ(c24177iXt, list, transactionStep, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<DisplayText> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull C24177iXt c24177iXt, @NotNull java.util.List<DisplayText> list, TransactionStep transactionStep, int i) {
            Intrinsics.checkNotNullParameter(c24177iXt, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new Activity(c24177iXt, list, transactionStep, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C24177iXt EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionStep KWHzl() {
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
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, activity.copydefault) && this.KWHzl == activity.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = this.AEQbTJ.hashCode();
            TransactionStep transactionStep = this.copydefault;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (transactionStep == null ? 0 : transactionStep.hashCode())) * 31) + java.lang.Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Confirmation(config=" + this.EZpvd + ", processDescription=" + this.AEQbTJ + ", currentStep=" + this.copydefault + ", currentIndex=" + this.KWHzl + ")";
        }

        public Activity(@NotNull C24177iXt c24177iXt, @NotNull java.util.List<DisplayText> list, TransactionStep transactionStep, int i) {
            Intrinsics.checkNotNullParameter(c24177iXt, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = c24177iXt;
            this.AEQbTJ = list;
            this.copydefault = transactionStep;
            this.KWHzl = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r1v0 o.iXt)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r2v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.response.TransactionStep:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.response.TransactionStep) : (r3v0 com.okinc.business.invest_biz.data.bean.response.TransactionStep))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000d: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r4v0 int))
 A[MD:(o.iXt, java.util.List<com.okinc.business.invest_biz.data.bean.DisplayText>, com.okinc.business.invest_biz.data.bean.response.TransactionStep, int):void (m)] (LINE:12) call: o.iXp.Activity.<init>(o.iXt, java.util.List, com.okinc.business.invest_biz.data.bean.response.TransactionStep, int):void type: THIS */
        public /* synthetic */ Activity(C24177iXt c24177iXt, java.util.List list, TransactionStep transactionStep, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(c24177iXt, (i2 & 2) != 0 ? yDY.AhwBna() : list, (i2 & 4) != 0 ? null : transactionStep, (i2 & 8) != 0 ? -1 : i);
        }
    }
}
