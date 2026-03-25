package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.sZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C44584sZ {
    public static final Application AEQbTJ = new Application(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.sZ$Activity) A[MD:(o.sZ$Activity):void (m)] call: o.sZ.<init>(o.sZ$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C44584sZ(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public C44584sZ(Activity activity) {
    }

    /* JADX INFO: renamed from: o.sZ$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sZ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "DeleteTerminologyResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(C44584sZ.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C44584sZ.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: o.sZ$Activity */
    public static final class Activity {
        public final Activity EZpvd() {
            return this;
        }

        public final C44584sZ KWHzl() {
            return new C44584sZ(this, null);
        }
    }
}
