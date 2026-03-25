package o;

import aws.smithy.kotlin.runtime.retries.policy.RetryErrorType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5091Ej {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Ej.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC5091Ej(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC5091Ej() {
    }

    /* JADX INFO: renamed from: o.Ej$Activity */
    public static final class Activity extends AbstractC5091Ej {
        public static final Activity AEQbTJ = new Activity();

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Ej$Application */
    public static final class Application extends AbstractC5091Ej {
        public static final Application AEQbTJ = new Application();

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Ej$StateListAnimator */
    public static final class StateListAnimator extends AbstractC5091Ej {
        public final RetryErrorType AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, RetryErrorType retryErrorType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                retryErrorType = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.OLrzqt(retryErrorType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RetryErrorType KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull RetryErrorType retryErrorType) {
            Intrinsics.checkNotNullParameter(retryErrorType, "");
            return new StateListAnimator(retryErrorType);
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
            return "RetryError(reason=" + this.AEQbTJ + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull RetryErrorType retryErrorType) {
            super(null);
            Intrinsics.checkNotNullParameter(retryErrorType, "");
            this.AEQbTJ = retryErrorType;
        }
    }
}
