package o;

import com.immomo.mls.fun.lt.SILoading;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lcS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC30505lcS {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lcS.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC30505lcS(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC30505lcS() {
    }

    /* JADX INFO: renamed from: o.lcS$ActionBar */
    public static final class ActionBar extends AbstractC30505lcS {
        public static final ActionBar AEQbTJ = new ActionBar();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1026148823;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return SILoading.LUA_CLASS_NAME;
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.lcS$TaskDescription */
    public static final class TaskDescription extends AbstractC30505lcS {
        public final java.util.List<AdvancedAutoSellStrategy> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lcS$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = taskDescription.EZpvd;
            }
            return taskDescription.OLrzqt(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<AdvancedAutoSellStrategy> KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull java.util.List<? extends AdvancedAutoSellStrategy> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.EZpvd, ((TaskDescription) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(strategies=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull java.util.List<? extends AdvancedAutoSellStrategy> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
        }
    }

    /* JADX INFO: renamed from: o.lcS$StateListAnimator */
    public static final class StateListAnimator extends AbstractC30505lcS {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.KWHzl;
            }
            return stateListAnimator.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(java.lang.String str) {
            return new StateListAnimator(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((StateListAnimator) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.KWHzl;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(errorMessage=" + this.KWHzl + ")";
        }

        public StateListAnimator(java.lang.String str) {
            super(null);
            this.KWHzl = str;
        }
    }
}
