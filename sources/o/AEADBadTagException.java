package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class AEADBadTagException {
    public static final ActionBar KWHzl = new ActionBar(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AEADBadTagException$Application) A[MD:(o.AEADBadTagException$Application):void (m)] call: o.AEADBadTagException.<init>(o.AEADBadTagException$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AEADBadTagException(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    public AEADBadTagException(Application application) {
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AEADBadTagException.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "AdminAddUserToGroupResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(AEADBadTagException.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AEADBadTagException.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class Application {
        public final Application OLrzqt() {
            return this;
        }

        public final AEADBadTagException AEQbTJ() {
            return new AEADBadTagException(this, null);
        }
    }
}
