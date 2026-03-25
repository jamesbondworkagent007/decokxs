package o;

import com.okinc.okex.center.bean.SelfServiceTools;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModelV2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.skT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC45154skT {
    public final long copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.skT.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC45154skT(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.skT$ActionBar */
    public static final class ActionBar extends AbstractC45154skT {
        public static final ActionBar AEQbTJ = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    private AbstractC45154skT() {
        this.copydefault = java.lang.System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: o.skT$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator extends AbstractC45154skT {
        public final java.util.Map<TransactionType, java.lang.Boolean> AEQbTJ;
        public final java.util.Map<TransactionType, java.util.List<TransactionDisplayModelV2>> KWHzl;
        public final java.util.Map<TransactionType, SelfServiceTools> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.skT$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.Map map, java.util.Map map2, java.util.Map map3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                map2 = stateListAnimator.OLrzqt;
            }
            if ((i & 4) != 0) {
                map3 = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.copydefault(map, map2, map3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<TransactionType, java.util.List<TransactionDisplayModelV2>> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<TransactionType, SelfServiceTools> copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.util.Map<TransactionType, ? extends java.util.List<TransactionDisplayModelV2>> map, @NotNull java.util.Map<TransactionType, SelfServiceTools> map2, @NotNull java.util.Map<TransactionType, java.lang.Boolean> map3) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            Intrinsics.checkNotNullParameter(map3, "");
            return new StateListAnimator(map, map2, map3);
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
            return Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(txnLists=" + this.KWHzl + ", txnTools=" + this.OLrzqt + ", hasMore=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<com.okinc.okex.center.bean.enums.TransactionType, ? extends java.util.List<com.okinc.okex.center.ui.displaymodels.TransactionDisplayModelV2>> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull java.util.Map<TransactionType, ? extends java.util.List<TransactionDisplayModelV2>> map, @NotNull java.util.Map<TransactionType, SelfServiceTools> map2, @NotNull java.util.Map<TransactionType, java.lang.Boolean> map3) {
            super(null);
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            Intrinsics.checkNotNullParameter(map3, "");
            this.KWHzl = map;
            this.OLrzqt = map2;
            this.AEQbTJ = map3;
        }
    }

    /* JADX INFO: renamed from: o.skT$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription extends AbstractC45154skT {
        public final java.util.List<TransactionDisplayModelV2> AEQbTJ;
        public final TransactionType KWHzl;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.skT$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, TransactionType transactionType, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                transactionType = taskDescription.KWHzl;
            }
            if ((i & 2) != 0) {
                list = taskDescription.AEQbTJ;
            }
            if ((i & 4) != 0) {
                z = taskDescription.OLrzqt;
            }
            return taskDescription.AEQbTJ(transactionType, list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<TransactionDisplayModelV2> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull TransactionType transactionType, @NotNull java.util.List<TransactionDisplayModelV2> list, boolean z) {
            Intrinsics.checkNotNullParameter(transactionType, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(transactionType, list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionType OLrzqt() {
            return this.KWHzl;
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
            return this.KWHzl == taskDescription.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ) && this.OLrzqt == taskDescription.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MoreContent(txnType=" + this.KWHzl + ", txnLists=" + this.AEQbTJ + ", hasMore=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull TransactionType transactionType, @NotNull java.util.List<TransactionDisplayModelV2> list, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(transactionType, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = transactionType;
            this.AEQbTJ = list;
            this.OLrzqt = z;
        }
    }

    /* JADX INFO: renamed from: o.skT$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity extends AbstractC45154skT {
        public static final Activity OLrzqt = new Activity();

        private Activity() {
            super(null);
        }
    }
}
