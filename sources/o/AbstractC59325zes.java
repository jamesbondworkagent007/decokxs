package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zes, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59325zes {
    public static final TaskDescription AhwBna = new TaskDescription(null);
    public static final AbstractC59325zes valueOf = new StateListAnimator();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yOL AEQbTJ(@NotNull yOL yol) {
        Intrinsics.checkNotNullParameter(yol, "");
        return yol;
    }

    public boolean AEQbTJ() {
        return false;
    }

    public boolean EZpvd() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC59233zdF copydefault(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull Variance variance) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(variance, "");
        return abstractC59233zdF;
    }

    public abstract InterfaceC59317zek copydefault(@NotNull AbstractC59233zdF abstractC59233zdF);

    public boolean copydefault() {
        return false;
    }

    /* JADX INFO: renamed from: o.zes$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zes.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.zes$StateListAnimator */
    public static final class StateListAnimator extends AbstractC59325zes {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.Void AEQbTJ(AbstractC59233zdF abstractC59233zdF) {
            Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
            return null;
        }

        @Override // o.AbstractC59325zes
        public boolean EZpvd() {
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Empty TypeSubstitution";
        }

        @Override // o.AbstractC59325zes
        public /* synthetic */ InterfaceC59317zek copydefault(AbstractC59233zdF abstractC59233zdF) {
            return (InterfaceC59317zek) AEQbTJ(abstractC59233zdF);
        }
    }

    public final TypeSubstitutor valueOf() {
        TypeSubstitutor typeSubstitutorEZpvd = TypeSubstitutor.EZpvd(this);
        Intrinsics.checkNotNullExpressionValue(typeSubstitutorEZpvd, "");
        return typeSubstitutorEZpvd;
    }

    /* JADX INFO: renamed from: o.zes$Activity */
    public static final class Activity extends AbstractC59325zes {
        @Override // o.AbstractC59325zes
        public boolean AEQbTJ() {
            return false;
        }

        @Override // o.AbstractC59325zes
        public boolean copydefault() {
            return false;
        }

        public Activity() {
        }

        @Override // o.AbstractC59325zes
        public InterfaceC59317zek copydefault(AbstractC59233zdF abstractC59233zdF) {
            Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
            return AbstractC59325zes.this.copydefault(abstractC59233zdF);
        }

        @Override // o.AbstractC59325zes
        public yOL AEQbTJ(yOL yol) {
            Intrinsics.checkNotNullParameter(yol, "");
            return AbstractC59325zes.this.AEQbTJ(yol);
        }

        @Override // o.AbstractC59325zes
        public AbstractC59233zdF copydefault(AbstractC59233zdF abstractC59233zdF, Variance variance) {
            Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
            Intrinsics.checkNotNullParameter(variance, "");
            return AbstractC59325zes.this.copydefault(abstractC59233zdF, variance);
        }

        @Override // o.AbstractC59325zes
        public boolean EZpvd() {
            return AbstractC59325zes.this.EZpvd();
        }
    }

    public final AbstractC59325zes AYXKKw() {
        return new Activity();
    }
}
