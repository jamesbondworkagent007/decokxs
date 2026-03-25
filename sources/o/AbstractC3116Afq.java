package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.account.CreateSubAccountStep;

/* JADX INFO: renamed from: o.Afq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC3116Afq {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Afq.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC3116Afq(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC3116Afq() {
    }

    /* JADX INFO: renamed from: o.Afq$ActionBar */
    /* JADX INFO: loaded from: classes25.dex */
    public static final class ActionBar extends AbstractC3116Afq {
        public static final int $stable = 0;
        public final AbstractC60238zyv EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, AbstractC60238zyv abstractC60238zyv, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                abstractC60238zyv = actionBar.EZpvd;
            }
            return actionBar.AEQbTJ(abstractC60238zyv);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull AbstractC60238zyv abstractC60238zyv) {
            Intrinsics.checkNotNullParameter(abstractC60238zyv, "");
            return new ActionBar(abstractC60238zyv);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC60238zyv KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.EZpvd, ((ActionBar) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NetworkStatus(state=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull AbstractC60238zyv abstractC60238zyv) {
            super(null);
            Intrinsics.checkNotNullParameter(abstractC60238zyv, "");
            this.EZpvd = abstractC60238zyv;
        }
    }

    /* JADX INFO: renamed from: o.Afq$StateListAnimator */
    /* JADX INFO: loaded from: classes25.dex */
    public static final class StateListAnimator extends AbstractC3116Afq {
        public static final int $stable = 0;
        public final CreateSubAccountStep KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, CreateSubAccountStep createSubAccountStep, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                createSubAccountStep = stateListAnimator.KWHzl;
            }
            return stateListAnimator.copydefault(createSubAccountStep);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CreateSubAccountStep AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull CreateSubAccountStep createSubAccountStep) {
            Intrinsics.checkNotNullParameter(createSubAccountStep, "");
            return new StateListAnimator(createSubAccountStep);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && this.KWHzl == ((StateListAnimator) obj).KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "StepChanged(step=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull CreateSubAccountStep createSubAccountStep) {
            super(null);
            Intrinsics.checkNotNullParameter(createSubAccountStep, "");
            this.KWHzl = createSubAccountStep;
        }
    }
}
