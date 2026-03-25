package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class NsdServiceInfo {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NsdServiceInfo$ActionBar) A[MD:(o.NsdServiceInfo$ActionBar):void (m)] call: o.NsdServiceInfo.<init>(o.NsdServiceInfo$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NsdServiceInfo(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    public NsdServiceInfo(ActionBar actionBar) {
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NsdServiceInfo.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "DeleteEntityRecognizerResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(NsdServiceInfo.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NsdServiceInfo.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class ActionBar {
        public final ActionBar KWHzl() {
            return this;
        }

        public final NsdServiceInfo OLrzqt() {
            return new NsdServiceInfo(this, null);
        }
    }
}
