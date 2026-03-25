package o;

import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iyU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25530iyU {

    /* JADX INFO: renamed from: o.iyU$ActionBar */
    public static final class ActionBar implements InterfaceC25530iyU {
        public final InvestmentKind AEQbTJ;
        public final int KWHzl;
        public final android.os.Bundle OLrzqt;
        public final InvestTradeManager.TransactionResultExtraData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, android.os.Bundle bundle, int i, InvestTradeManager.TransactionResultExtraData transactionResultExtraData, InvestmentKind investmentKind, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                bundle = actionBar.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                i = actionBar.KWHzl;
            }
            if ((i2 & 4) != 0) {
                transactionResultExtraData = actionBar.copydefault;
            }
            if ((i2 & 8) != 0) {
                investmentKind = actionBar.AEQbTJ;
            }
            return actionBar.KWHzl(bundle, i, transactionResultExtraData, investmentKind);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestmentKind AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTradeManager.TransactionResultExtraData KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull android.os.Bundle bundle, int i, @NotNull InvestTradeManager.TransactionResultExtraData transactionResultExtraData, @NotNull InvestmentKind investmentKind) {
            Intrinsics.checkNotNullParameter(bundle, "");
            Intrinsics.checkNotNullParameter(transactionResultExtraData, "");
            Intrinsics.checkNotNullParameter(investmentKind, "");
            return new ActionBar(bundle, i, transactionResultExtraData, investmentKind);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.os.Bundle copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt) && this.KWHzl == actionBar.KWHzl && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && this.AEQbTJ == actionBar.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.OLrzqt.hashCode() * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowTransactionResult(result=" + this.OLrzqt + ", code=" + this.KWHzl + ", extraData=" + this.copydefault + ", kind=" + this.AEQbTJ + ")";
        }

        public ActionBar(@NotNull android.os.Bundle bundle, int i, @NotNull InvestTradeManager.TransactionResultExtraData transactionResultExtraData, @NotNull InvestmentKind investmentKind) {
            Intrinsics.checkNotNullParameter(bundle, "");
            Intrinsics.checkNotNullParameter(transactionResultExtraData, "");
            Intrinsics.checkNotNullParameter(investmentKind, "");
            this.OLrzqt = bundle;
            this.KWHzl = i;
            this.copydefault = transactionResultExtraData;
            this.AEQbTJ = investmentKind;
        }
    }

    /* JADX INFO: renamed from: o.iyU$Application */
    public static final class Application implements InterfaceC25530iyU {
        public final java.lang.Throwable AEQbTJ;
        public final java.lang.String EZpvd;
        public final int KWHzl;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.Throwable th, java.lang.String str, boolean z, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                th = application.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                str = application.EZpvd;
            }
            if ((i2 & 4) != 0) {
                z = application.OLrzqt;
            }
            if ((i2 & 8) != 0) {
                i = application.KWHzl;
            }
            return application.EZpvd(th, str, z, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(@NotNull java.lang.Throwable th, @NotNull java.lang.String str, boolean z, int i) {
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(th, str, z, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Throwable KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && this.OLrzqt == application.OLrzqt && this.KWHzl == application.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowError(error=" + this.AEQbTJ + ", message=" + this.EZpvd + ", isSilentFailed=" + this.OLrzqt + ", code=" + this.KWHzl + ")";
        }

        public Application(@NotNull java.lang.Throwable th, @NotNull java.lang.String str, boolean z, int i) {
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = th;
            this.EZpvd = str;
            this.OLrzqt = z;
            this.KWHzl = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r2v0 java.lang.Throwable)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(java.lang.Throwable, java.lang.String, boolean, int):void (m)] (LINE:15) call: o.iyU.Application.<init>(java.lang.Throwable, java.lang.String, boolean, int):void type: THIS */
        public /* synthetic */ Application(java.lang.Throwable th, java.lang.String str, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0 : i);
        }
    }

    /* JADX INFO: renamed from: o.iyU$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC25530iyU {
        public final android.os.Bundle AEQbTJ;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, android.os.Bundle bundle, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                bundle = stateListAnimator.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                i = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.OLrzqt(bundle, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(android.os.Bundle bundle, int i) {
            return new StateListAnimator(bundle, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && this.OLrzqt == stateListAnimator.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            android.os.Bundle bundle = this.AEQbTJ;
            return ((bundle == null ? 0 : bundle.hashCode()) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TransactionCancelled(result=" + this.AEQbTJ + ", code=" + this.OLrzqt + ")";
        }

        public StateListAnimator(android.os.Bundle bundle, int i) {
            this.AEQbTJ = bundle;
            this.OLrzqt = i;
        }
    }

    /* JADX INFO: renamed from: o.iyU$TaskDescription */
    public static final class TaskDescription implements InterfaceC25530iyU {
        public static final TaskDescription copydefault = new TaskDescription();

        private TaskDescription() {
        }
    }
}
