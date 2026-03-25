package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Aek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC3057Aek {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Aek.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC3057Aek(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC3057Aek() {
    }

    /* JADX INFO: renamed from: o.Aek$Application */
    /* JADX INFO: loaded from: classes25.dex */
    public static final class Application extends AbstractC3057Aek {
        public static final int $stable = 0;
        public static final Application INSTANCE = new Application();

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Aek$ActionBar */
    /* JADX INFO: loaded from: classes25.dex */
    public static final class ActionBar extends AbstractC3057Aek {
        public static final int $stable = 0;
        public static final ActionBar INSTANCE = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Aek$TaskDescription */
    /* JADX INFO: loaded from: classes25.dex */
    public static final class TaskDescription extends AbstractC3057Aek {
        public static final int $stable = 0;
        public static final TaskDescription INSTANCE = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Aek$Fragment */
    /* JADX INFO: loaded from: classes25.dex */
    public static final class Fragment extends AbstractC3057Aek {
        public static final int $stable = 0;
        public static final Fragment INSTANCE = new Fragment();

        private Fragment() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Aek$PendingIntent */
    /* JADX INFO: loaded from: classes25.dex */
    public static final class PendingIntent extends AbstractC3057Aek {
        public static final int $stable = 0;
        public static final PendingIntent INSTANCE = new PendingIntent();

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Aek$Activity */
    /* JADX INFO: loaded from: classes25.dex */
    public static final class Activity extends AbstractC3057Aek {
        public static final int $stable = 0;
        public static final Activity INSTANCE = new Activity();

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Aek$StateListAnimator */
    /* JADX INFO: loaded from: classes25.dex */
    public static final class StateListAnimator extends AbstractC3057Aek {
        public static final int $stable = 8;
        public final C58484zEb KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, C58484zEb c58484zEb, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c58484zEb = stateListAnimator.KWHzl;
            }
            return stateListAnimator.EZpvd(c58484zEb);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull C58484zEb c58484zEb) {
            Intrinsics.checkNotNullParameter(c58484zEb, "");
            return new StateListAnimator(c58484zEb);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C58484zEb OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.KWHzl, ((StateListAnimator) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Completed(loginRegisterResult=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C58484zEb c58484zEb) {
            super(null);
            Intrinsics.checkNotNullParameter(c58484zEb, "");
            this.KWHzl = c58484zEb;
        }
    }
}
