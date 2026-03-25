package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class SecurityLog {
    public static final ActionBar EZpvd = new ActionBar(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SecurityLog$Application) A[MD:(o.SecurityLog$Application):void (m)] call: o.SecurityLog.<init>(o.SecurityLog$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SecurityLog(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    public SecurityLog(Application application) {
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SecurityLog.ActionBar.<init>():void type: THIS */
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
        return C56524yIo.AEQbTJ(SecurityLog.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SecurityLog.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class Application {
        public final Application KWHzl() {
            return this;
        }

        public final SecurityLog copydefault() {
            return new SecurityLog(this, null);
        }
    }
}
