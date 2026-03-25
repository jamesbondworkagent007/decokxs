package o;

import com.immomo.mls.fun.lt.SILoading;
import com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gXl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20007gXl {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gXl.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC20007gXl(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.gXl$Application */
    public static final class Application extends AbstractC20007gXl {
        public static final Application OLrzqt = new Application();

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
            return -718713658;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "None";
        }

        private Application() {
            super(null);
        }
    }

    private AbstractC20007gXl() {
    }

    /* JADX INFO: renamed from: o.gXl$Activity */
    public static final class Activity extends AbstractC20007gXl {
        public static final Activity copydefault = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1721413870;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return SILoading.LUA_CLASS_NAME;
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.gXl$TaskDescription */
    public static final class TaskDescription extends AbstractC20007gXl {
        public final StrategyStatus EZpvd;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, StrategyStatus strategyStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.KWHzl;
            }
            if ((i & 2) != 0) {
                strategyStatus = taskDescription.EZpvd;
            }
            return taskDescription.copydefault(str, strategyStatus);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StrategyStatus KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull java.lang.String str, @NotNull StrategyStatus strategyStatus) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(strategyStatus, "");
            return new TaskDescription(str, strategyStatus);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) taskDescription.KWHzl) && this.EZpvd == taskDescription.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(title=" + this.KWHzl + ", status=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str, @NotNull StrategyStatus strategyStatus) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(strategyStatus, "");
            this.KWHzl = str;
            this.EZpvd = strategyStatus;
        }
    }

    /* JADX INFO: renamed from: o.gXl$ActionBar */
    public static final class ActionBar extends AbstractC20007gXl {
        public final boolean AEQbTJ;
        public final gLQ EZpvd;
        public final java.lang.String KWHzl;
        public final StrategyStatus OLrzqt;
        public final Triple<java.lang.String, java.lang.String, java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.gXl$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, Triple triple, boolean z, StrategyStatus strategyStatus, java.lang.String str, gLQ glq, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                triple = actionBar.copydefault;
            }
            if ((i & 2) != 0) {
                z = actionBar.AEQbTJ;
            }
            boolean z2 = z;
            if ((i & 4) != 0) {
                strategyStatus = actionBar.OLrzqt;
            }
            StrategyStatus strategyStatus2 = strategyStatus;
            if ((i & 8) != 0) {
                str = actionBar.KWHzl;
            }
            java.lang.String str2 = str;
            if ((i & 16) != 0) {
                glq = actionBar.EZpvd;
            }
            return actionBar.OLrzqt(triple, z2, strategyStatus2, str2, glq);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final gLQ AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StrategyStatus KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Triple<java.lang.String, java.lang.String, java.lang.String> OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull Triple<java.lang.String, java.lang.String, java.lang.String> triple, boolean z, @NotNull StrategyStatus strategyStatus, java.lang.String str, gLQ glq) {
            Intrinsics.checkNotNullParameter(triple, "");
            Intrinsics.checkNotNullParameter(strategyStatus, "");
            return new ActionBar(triple, z, strategyStatus, str, glq);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && this.AEQbTJ == actionBar.AEQbTJ && this.OLrzqt == actionBar.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            int iHashCode2 = java.lang.Boolean.hashCode(this.AEQbTJ);
            int iHashCode3 = this.OLrzqt.hashCode();
            java.lang.String str = this.KWHzl;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            gLQ glq = this.EZpvd;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (glq != null ? glq.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(idTitleChain=" + this.copydefault + ", isInvalidJwtToken=" + this.AEQbTJ + ", strategyStatus=" + this.OLrzqt + ", beMsg=" + this.KWHzl + ", saError=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r8v0 kotlin.Triple)
  (r9v0 boolean)
  (r10v0 com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:o.gLQ:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null o.gLQ) : (r12v0 o.gLQ))
 A[MD:(kotlin.Triple<java.lang.String, java.lang.String, java.lang.String>, boolean, com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus, java.lang.String, o.gLQ):void (m)] (LINE:290) call: o.gXl.ActionBar.<init>(kotlin.Triple, boolean, com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus, java.lang.String, o.gLQ):void type: THIS */
        public /* synthetic */ ActionBar(Triple triple, boolean z, StrategyStatus strategyStatus, java.lang.String str, gLQ glq, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(triple, z, strategyStatus, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : glq);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull Triple<java.lang.String, java.lang.String, java.lang.String> triple, boolean z, @NotNull StrategyStatus strategyStatus, java.lang.String str, gLQ glq) {
            super(null);
            Intrinsics.checkNotNullParameter(triple, "");
            Intrinsics.checkNotNullParameter(strategyStatus, "");
            this.copydefault = triple;
            this.AEQbTJ = z;
            this.OLrzqt = strategyStatus;
            this.KWHzl = str;
            this.EZpvd = glq;
        }
    }
}
