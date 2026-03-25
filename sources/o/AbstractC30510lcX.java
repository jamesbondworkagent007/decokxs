package o;

import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lcX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC30510lcX {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lcX.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC30510lcX(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC30510lcX() {
    }

    /* JADX INFO: renamed from: o.lcX$StateListAnimator */
    public static final class StateListAnimator extends AbstractC30510lcX {
        public final boolean EZpvd;
        public final java.util.List<AdvancedAutoSellStrategy> KWHzl;
        public final gLQ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lcX$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.List list, gLQ glq, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                glq = stateListAnimator.OLrzqt;
            }
            if ((i & 4) != 0) {
                z = stateListAnimator.EZpvd;
            }
            return stateListAnimator.copydefault(list, glq, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<AdvancedAutoSellStrategy> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final gLQ copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.util.List<? extends AdvancedAutoSellStrategy> list, @NotNull gLQ glq, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(glq, "");
            return new StateListAnimator(list, glq, z);
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
            return Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && this.EZpvd == stateListAnimator.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Enabled(strategies=" + this.KWHzl + ", smartAccountState=" + this.OLrzqt + ", canUseSmartAccount=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull java.util.List<? extends AdvancedAutoSellStrategy> list, @NotNull gLQ glq, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(glq, "");
            this.KWHzl = list;
            this.OLrzqt = glq;
            this.EZpvd = z;
        }
    }

    /* JADX INFO: renamed from: o.lcX$Activity */
    public static final class Activity extends AbstractC30510lcX {
        public static final Activity EZpvd = new Activity();

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.lcX$TaskDescription */
    public static final class TaskDescription extends AbstractC30510lcX {
        public static final TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }
}
