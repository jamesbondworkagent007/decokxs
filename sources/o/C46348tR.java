package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.tR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C46348tR {
    public static final Application KWHzl = new Application(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tR$Activity) A[MD:(o.tR$Activity):void (m)] call: o.tR.<init>(o.tR$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C46348tR(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public C46348tR(Activity activity) {
    }

    /* JADX INFO: renamed from: o.tR$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tR.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "TagResourceResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(C46348tR.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C46348tR.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: o.tR$Activity */
    public static final class Activity {
        public final Activity OLrzqt() {
            return this;
        }

        public final C46348tR AEQbTJ() {
            return new C46348tR(this, null);
        }
    }
}
