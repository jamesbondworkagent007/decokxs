package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.settings.PreferenceCdKey;

/* JADX INFO: renamed from: o.Bof, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC4712Bof {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Bof.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC4712Bof(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC4712Bof() {
    }

    /* JADX INFO: renamed from: o.Bof$TaskDescription */
    /* JADX INFO: loaded from: classes20.dex */
    public static final class TaskDescription extends AbstractC4712Bof {
        public static final int $stable = 0;
        public static final TaskDescription INSTANCE = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Bof$Application */
    /* JADX INFO: loaded from: classes20.dex */
    public static final class Application extends AbstractC4712Bof {
        public static final int $stable = 0;
        public static final Application INSTANCE = new Application();

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Bof$StateListAnimator */
    /* JADX INFO: loaded from: classes20.dex */
    public static final class StateListAnimator extends AbstractC4712Bof {
        public static final int $stable = 0;
        public final PreferenceCdKey AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, PreferenceCdKey preferenceCdKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                preferenceCdKey = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.OLrzqt(preferenceCdKey);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull PreferenceCdKey preferenceCdKey) {
            Intrinsics.checkNotNullParameter(preferenceCdKey, "");
            return new StateListAnimator(preferenceCdKey);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PreferenceCdKey copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && this.AEQbTJ == ((StateListAnimator) obj).AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(message=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull PreferenceCdKey preferenceCdKey) {
            super(null);
            Intrinsics.checkNotNullParameter(preferenceCdKey, "");
            this.AEQbTJ = preferenceCdKey;
        }
    }
}
