package o;

import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.laO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC30395laO {

    /* JADX INFO: renamed from: o.laO$TaskDescription */
    public static final class TaskDescription implements InterfaceC30395laO {
        public final ServiceFeeInfo AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, ServiceFeeInfo serviceFeeInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                serviceFeeInfo = taskDescription.AEQbTJ;
            }
            return taskDescription.EZpvd(serviceFeeInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(ServiceFeeInfo serviceFeeInfo) {
            return new TaskDescription(serviceFeeInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceFeeInfo OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.AEQbTJ, ((TaskDescription) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            ServiceFeeInfo serviceFeeInfo = this.AEQbTJ;
            if (serviceFeeInfo == null) {
                return 0;
            }
            return serviceFeeInfo.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ServiceFeeLabel(feeInfo=" + this.AEQbTJ + ")";
        }

        public TaskDescription(ServiceFeeInfo serviceFeeInfo) {
            this.AEQbTJ = serviceFeeInfo;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.ServiceFeeInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ServiceFeeInfo) : (r1v0 com.okinc.business.dexlogic.bean.ServiceFeeInfo))
 A[MD:(com.okinc.business.dexlogic.bean.ServiceFeeInfo):void (m)] (LINE:73) call: o.laO.TaskDescription.<init>(com.okinc.business.dexlogic.bean.ServiceFeeInfo):void type: THIS */
        public /* synthetic */ TaskDescription(ServiceFeeInfo serviceFeeInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : serviceFeeInfo);
        }
    }

    /* JADX INFO: renamed from: o.laO$ActionBar */
    public static final class ActionBar implements InterfaceC30395laO {
        public final C30454lbU AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, C30454lbU c30454lbU, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c30454lbU = actionBar.AEQbTJ;
            }
            return actionBar.KWHzl(c30454lbU);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(C30454lbU c30454lbU) {
            return new ActionBar(c30454lbU);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C30454lbU copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.AEQbTJ, ((ActionBar) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            C30454lbU c30454lbU = this.AEQbTJ;
            if (c30454lbU == null) {
                return 0;
            }
            return c30454lbU.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "EstReceiveLabel(item=" + this.AEQbTJ + ")";
        }

        public ActionBar(C30454lbU c30454lbU) {
            this.AEQbTJ = c30454lbU;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.lbU:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.lbU) : (r1v0 o.lbU))
 A[MD:(o.lbU):void (m)] (LINE:77) call: o.laO.ActionBar.<init>(o.lbU):void type: THIS */
        public /* synthetic */ ActionBar(C30454lbU c30454lbU, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : c30454lbU);
        }
    }

    /* JADX INFO: renamed from: o.laO$Activity */
    public static final class Activity implements InterfaceC30395laO {
        public final C30454lbU KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, C30454lbU c30454lbU, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c30454lbU = activity.KWHzl;
            }
            return activity.OLrzqt(c30454lbU);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C30454lbU EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(C30454lbU c30454lbU) {
            return new Activity(c30454lbU);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.KWHzl, ((Activity) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            C30454lbU c30454lbU = this.KWHzl;
            if (c30454lbU == null) {
                return 0;
            }
            return c30454lbU.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ValueDiffLabel(item=" + this.KWHzl + ")";
        }

        public Activity(C30454lbU c30454lbU) {
            this.KWHzl = c30454lbU;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.lbU:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.lbU) : (r1v0 o.lbU))
 A[MD:(o.lbU):void (m)] (LINE:81) call: o.laO.Activity.<init>(o.lbU):void type: THIS */
        public /* synthetic */ Activity(C30454lbU c30454lbU, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : c30454lbU);
        }
    }

    /* JADX INFO: renamed from: o.laO$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC30395laO {
        public static final StateListAnimator copydefault = new StateListAnimator();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1556307733;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "BoostLabel";
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.laO$Application */
    public static final class Application implements InterfaceC30395laO {
        public static final Application AEQbTJ = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1377717431;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "BoostTagClick";
        }

        private Application() {
        }
    }
}
