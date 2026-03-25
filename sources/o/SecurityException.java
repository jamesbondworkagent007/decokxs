package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class SecurityException {
    public static final ActionBar KWHzl = new ActionBar(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SecurityException$Application) A[MD:(o.SecurityException$Application):void (m)] call: o.SecurityException.<init>(o.SecurityException$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SecurityException(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    public SecurityException(Application application) {
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SecurityException.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "UntagResourceResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(SecurityException.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SecurityException.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class Application {
        public final Application EZpvd() {
            return this;
        }

        public final SecurityException AEQbTJ() {
            return new SecurityException(this, null);
        }
    }
}
