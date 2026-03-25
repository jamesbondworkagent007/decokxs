package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class Keyframe {
    public static final Application OLrzqt = new Application(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Keyframe$ActionBar) A[MD:(o.Keyframe$ActionBar):void (m)] call: o.Keyframe.<init>(o.Keyframe$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Keyframe(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    public Keyframe(ActionBar actionBar) {
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Keyframe.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "ConfirmSignUpResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(Keyframe.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Keyframe.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class ActionBar {
        public final ActionBar KWHzl() {
            return this;
        }

        public final Keyframe AEQbTJ() {
            return new Keyframe(this, null);
        }
    }
}
