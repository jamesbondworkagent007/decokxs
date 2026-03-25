package o;

import com.okinc.business.defi.api.model.tx.SignAuthType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kPe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC28108kPe {
    public final C28109kPf EZpvd;
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 o.kPf), (r3v0 java.util.Map) A[MD:(java.lang.String, o.kPf, java.util.Map<java.lang.String, java.lang.String>):void (m)] call: o.kPe.<init>(java.lang.String, o.kPf, java.util.Map):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC28108kPe(java.lang.String str, C28109kPf c28109kPf, java.util.Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c28109kPf, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Map<java.lang.String, java.lang.String> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C28109kPf copydefault() {
        return this.EZpvd;
    }

    public AbstractC28108kPe(java.lang.String str, C28109kPf c28109kPf, java.util.Map<java.lang.String, java.lang.String> map) {
        this.OLrzqt = str;
        this.EZpvd = c28109kPf;
        this.KWHzl = map;
    }

    /* JADX INFO: renamed from: o.kPe$TaskDescription */
    public static final class TaskDescription extends AbstractC28108kPe {
        public final C28109kPf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, C28109kPf c28109kPf, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c28109kPf = taskDescription.copydefault;
            }
            return taskDescription.AEQbTJ(c28109kPf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull C28109kPf c28109kPf) {
            Intrinsics.checkNotNullParameter(c28109kPf, "");
            return new TaskDescription(c28109kPf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC28108kPe
        public C28109kPf copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.copydefault, ((TaskDescription) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OrderStart(commonParams=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C28109kPf c28109kPf) {
            super("DEXSwap_Trade_Swap_Click", c28109kPf, C56424yEw.gEmmrt(C56390yDp.OLrzqt("timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis())), C56390yDp.OLrzqt("process", "26001")), null);
            Intrinsics.checkNotNullParameter(c28109kPf, "");
            this.copydefault = c28109kPf;
        }
    }

    /* JADX INFO: renamed from: o.kPe$FragmentManager */
    public static final class FragmentManager extends AbstractC28108kPe {
        public final C28109kPf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, C28109kPf c28109kPf, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c28109kPf = fragmentManager.copydefault;
            }
            return fragmentManager.OLrzqt(c28109kPf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager OLrzqt(@NotNull C28109kPf c28109kPf) {
            Intrinsics.checkNotNullParameter(c28109kPf, "");
            return new FragmentManager(c28109kPf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC28108kPe
        public C28109kPf copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FragmentManager) && Intrinsics.EZpvd(this.copydefault, ((FragmentManager) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Precheck(commonParams=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentManager(@NotNull C28109kPf c28109kPf) {
            super("DEXSwap_Trade_PrecheckBefore_Click", c28109kPf, C56424yEw.gEmmrt(C56390yDp.OLrzqt("timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis())), C56390yDp.OLrzqt("process", "26002")), null);
            Intrinsics.checkNotNullParameter(c28109kPf, "");
            this.copydefault = c28109kPf;
        }
    }

    /* JADX INFO: renamed from: o.kPe$ActionBar */
    public static final class ActionBar extends AbstractC28108kPe {
        public final C28109kPf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, C28109kPf c28109kPf, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c28109kPf = actionBar.copydefault;
            }
            return actionBar.EZpvd(c28109kPf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull C28109kPf c28109kPf) {
            Intrinsics.checkNotNullParameter(c28109kPf, "");
            return new ActionBar(c28109kPf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC28108kPe
        public C28109kPf copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.copydefault, ((ActionBar) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PostCheck(commonParams=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C28109kPf c28109kPf) {
            super("DEXSwap_Trade_PrecheckAfter_Click", c28109kPf, C56424yEw.gEmmrt(C56390yDp.OLrzqt("timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis())), C56390yDp.OLrzqt("process", "26003")), null);
            Intrinsics.checkNotNullParameter(c28109kPf, "");
            this.copydefault = c28109kPf;
        }
    }

    /* JADX INFO: renamed from: o.kPe$StateListAnimator */
    public static final class StateListAnimator extends AbstractC28108kPe {
        public final SignAuthType AEQbTJ;
        public final C28109kPf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, C28109kPf c28109kPf, SignAuthType signAuthType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c28109kPf = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                signAuthType = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.AEQbTJ(c28109kPf, signAuthType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull C28109kPf c28109kPf, SignAuthType signAuthType) {
            Intrinsics.checkNotNullParameter(c28109kPf, "");
            return new StateListAnimator(c28109kPf, signAuthType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignAuthType KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC28108kPe
        public C28109kPf copydefault() {
            return this.copydefault;
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
            return Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && this.AEQbTJ == stateListAnimator.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            SignAuthType signAuthType = this.AEQbTJ;
            return (iHashCode * 31) + (signAuthType == null ? 0 : signAuthType.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "BroadcastOrder(commonParams=" + this.copydefault + ", signAuthType=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C28109kPf c28109kPf, SignAuthType signAuthType) {
            super("DEXSwap_Trade_Sign_Click", c28109kPf, C56424yEw.gEmmrt(C56390yDp.OLrzqt("timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis())), C56390yDp.OLrzqt("process", "26005")), null);
            Intrinsics.checkNotNullParameter(c28109kPf, "");
            this.copydefault = c28109kPf;
            this.AEQbTJ = signAuthType;
        }
    }

    /* JADX INFO: renamed from: o.kPe$Activity */
    public static final class Activity extends AbstractC28108kPe {
        public final java.lang.String AEQbTJ;
        public final C28109kPf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, C28109kPf c28109kPf, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c28109kPf = activity.copydefault;
            }
            if ((i & 2) != 0) {
                str = activity.AEQbTJ;
            }
            return activity.AEQbTJ(c28109kPf, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull C28109kPf c28109kPf, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(c28109kPf, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(c28109kPf, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC28108kPe
        public C28109kPf copydefault() {
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
            return Intrinsics.EZpvd(this.copydefault, activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "BroadcastSuccess(commonParams=" + this.copydefault + ", txHash=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C28109kPf c28109kPf, @NotNull java.lang.String str) {
            super("DEXSwap_Trade_TxSubmit_View", c28109kPf, C56424yEw.gEmmrt(C56390yDp.OLrzqt("timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis())), C56390yDp.OLrzqt("process", "26006")), null);
            Intrinsics.checkNotNullParameter(c28109kPf, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = c28109kPf;
            this.AEQbTJ = str;
        }
    }

    /* JADX INFO: renamed from: o.kPe$Application */
    public static final class Application extends AbstractC28108kPe {
        public final C28109kPf AEQbTJ;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, C28109kPf c28109kPf, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c28109kPf = application.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str = application.copydefault;
            }
            return application.KWHzl(c28109kPf, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull C28109kPf c28109kPf, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(c28109kPf, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(c28109kPf, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC28108kPe
        public C28109kPf copydefault() {
            return this.AEQbTJ;
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
            return Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OrderComplete(commonParams=" + this.AEQbTJ + ", txHash=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C28109kPf c28109kPf, @NotNull java.lang.String str) {
            super("DEXSwap_Trade_Speed_View", c28109kPf, C56424yEw.gEmmrt(C56390yDp.OLrzqt("tx_hash", str), C56390yDp.OLrzqt("timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis())), C56390yDp.OLrzqt("process", "26007")), null);
            Intrinsics.checkNotNullParameter(c28109kPf, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = c28109kPf;
            this.copydefault = str;
        }
    }
}
