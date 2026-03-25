package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33424mwG {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mwG.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC33424mwG(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.mwG$Application */
    public static final class Application extends AbstractC33424mwG {
        public static final Application OLrzqt = new Application();

        private Application() {
            super(null);
        }
    }

    private AbstractC33424mwG() {
    }

    /* JADX INFO: renamed from: o.mwG$ActionBar */
    public static final class ActionBar extends AbstractC33424mwG {
        public static final int KWHzl;
        public final kotlin.Pair<AbstractC33244msm, AbstractC33244msm> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int i = AbstractC33244msm.AEQbTJ;
            KWHzl = i | i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mwG$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, kotlin.Pair pair, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                pair = actionBar.AEQbTJ;
            }
            return actionBar.KWHzl(pair);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final kotlin.Pair<AbstractC33244msm, AbstractC33244msm> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull kotlin.Pair<? extends AbstractC33244msm, ? extends AbstractC33244msm> pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            return new ActionBar(pair);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.AEQbTJ, ((ActionBar) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Segment(data=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.Pair<? extends o.msm, ? extends o.msm> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull kotlin.Pair<? extends AbstractC33244msm, ? extends AbstractC33244msm> pair) {
            super(null);
            Intrinsics.checkNotNullParameter(pair, "");
            this.AEQbTJ = pair;
        }
    }

    /* JADX INFO: renamed from: o.mwG$StateListAnimator */
    public static final class StateListAnimator extends AbstractC33424mwG {
        public static final StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }
}
