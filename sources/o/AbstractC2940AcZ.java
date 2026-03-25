package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AcZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC2940AcZ {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AcZ.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC2940AcZ(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC2940AcZ() {
    }

    /* JADX INFO: renamed from: o.AcZ$ActionBar */
    /* JADX INFO: loaded from: classes25.dex */
    public static final class ActionBar extends AbstractC2940AcZ {
        public static final int $stable = 0;
        public final AbstractC60238zyv KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, AbstractC60238zyv abstractC60238zyv, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                abstractC60238zyv = actionBar.KWHzl;
            }
            return actionBar.EZpvd(abstractC60238zyv);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull AbstractC60238zyv abstractC60238zyv) {
            Intrinsics.checkNotNullParameter(abstractC60238zyv, "");
            return new ActionBar(abstractC60238zyv);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC60238zyv EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.KWHzl, ((ActionBar) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SubmitPasswordStatus(state=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull AbstractC60238zyv abstractC60238zyv) {
            super(null);
            Intrinsics.checkNotNullParameter(abstractC60238zyv, "");
            this.KWHzl = abstractC60238zyv;
        }
    }

    /* JADX INFO: renamed from: o.AcZ$StateListAnimator */
    /* JADX INFO: loaded from: classes25.dex */
    public static final class StateListAnimator extends AbstractC2940AcZ {
        public static final int $stable = 0;
        public static final StateListAnimator INSTANCE = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }
}
