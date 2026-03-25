package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.network.MobileType;

/* JADX INFO: renamed from: o.BaJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC4260BaJ {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BaJ.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC4260BaJ(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC4260BaJ() {
    }

    /* JADX INFO: renamed from: o.BaJ$Activity */
    public static final class Activity extends AbstractC4260BaJ {
        public static final int $stable = 0;
        public static final Activity INSTANCE = new Activity();

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.BaJ$Application */
    public static final class Application extends AbstractC4260BaJ {
        public static final int $stable = 0;
        public static final Application INSTANCE = new Application();

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.BaJ$ActionBar */
    public static final class ActionBar extends AbstractC4260BaJ {
        public static final int $stable = 0;
        public final MobileType EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, MobileType mobileType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mobileType = actionBar.EZpvd;
            }
            return actionBar.EZpvd(mobileType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull MobileType mobileType) {
            Intrinsics.checkNotNullParameter(mobileType, "");
            return new ActionBar(mobileType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MobileType OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && this.EZpvd == ((ActionBar) obj).EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Mobile(v1=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull MobileType mobileType) {
            super(null);
            Intrinsics.checkNotNullParameter(mobileType, "");
            this.EZpvd = mobileType;
        }
    }

    /* JADX INFO: renamed from: o.BaJ$StateListAnimator */
    public static final class StateListAnimator extends AbstractC4260BaJ {
        public static final int $stable = 0;
        public static final StateListAnimator INSTANCE = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.BaJ$TaskDescription */
    public static final class TaskDescription extends AbstractC4260BaJ {
        public static final int $stable = 0;
        public static final TaskDescription INSTANCE = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }
}
