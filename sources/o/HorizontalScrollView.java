package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class HorizontalScrollView {
    public static final Activity AEQbTJ = new Activity(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.HorizontalScrollView$StateListAnimator) A[MD:(o.HorizontalScrollView$StateListAnimator):void (m)] call: o.HorizontalScrollView.<init>(o.HorizontalScrollView$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ HorizontalScrollView(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    public HorizontalScrollView(StateListAnimator stateListAnimator) {
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.HorizontalScrollView.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "DeleteUserResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(HorizontalScrollView.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HorizontalScrollView.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class StateListAnimator {
        public final StateListAnimator OLrzqt() {
            return this;
        }

        public final HorizontalScrollView copydefault() {
            return new HorizontalScrollView(this, null);
        }
    }
}
