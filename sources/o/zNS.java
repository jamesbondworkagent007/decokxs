package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes20.dex */
public abstract class zNS {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zNS.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ zNS(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private zNS() {
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class StateListAnimator extends zNS {
        public static final int $stable = 0;
        public final int EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = stateListAnimator.EZpvd;
            }
            return stateListAnimator.EZpvd(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(int i) {
            return new StateListAnimator(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && this.EZpvd == ((StateListAnimator) obj).EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CountDown(remainingSeconds=" + this.EZpvd + ")";
        }

        public StateListAnimator(int i) {
            super(null);
            this.EZpvd = i;
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class ActionBar extends zNS {
        public static final int $stable = 0;
        public static final ActionBar INSTANCE = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }
}
