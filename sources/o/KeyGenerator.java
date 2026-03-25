package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class KeyGenerator {
    public static final Activity EZpvd = new Activity(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.KeyGenerator$StateListAnimator) A[MD:(o.KeyGenerator$StateListAnimator):void (m)] call: o.KeyGenerator.<init>(o.KeyGenerator$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ KeyGenerator(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    public KeyGenerator(StateListAnimator stateListAnimator) {
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.KeyGenerator.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "AdminDisableProviderForUserResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(KeyGenerator.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || KeyGenerator.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class StateListAnimator {
        public final StateListAnimator AEQbTJ() {
            return this;
        }

        public final KeyGenerator KWHzl() {
            return new KeyGenerator(this, null);
        }
    }
}
