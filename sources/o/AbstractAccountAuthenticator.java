package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class AbstractAccountAuthenticator {
    public static final Activity AEQbTJ = new Activity(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AbstractAccountAuthenticator$Application) A[MD:(o.AbstractAccountAuthenticator$Application):void (m)] call: o.AbstractAccountAuthenticator.<init>(o.AbstractAccountAuthenticator$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractAccountAuthenticator(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    public AbstractAccountAuthenticator(Application application) {
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AbstractAccountAuthenticator.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "AdminUpdateAuthEventFeedbackResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(AbstractAccountAuthenticator.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AbstractAccountAuthenticator.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class Application {
        public final Application AEQbTJ() {
            return this;
        }

        public final AbstractAccountAuthenticator KWHzl() {
            return new AbstractAccountAuthenticator(this, null);
        }
    }
}
