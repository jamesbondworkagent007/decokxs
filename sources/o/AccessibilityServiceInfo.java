package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class AccessibilityServiceInfo {
    public static final Activity EZpvd = new Activity(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AccessibilityServiceInfo$Application) A[MD:(o.AccessibilityServiceInfo$Application):void (m)] call: o.AccessibilityServiceInfo.<init>(o.AccessibilityServiceInfo$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AccessibilityServiceInfo(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    public AccessibilityServiceInfo(Application application) {
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AccessibilityServiceInfo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "AdminSetUserSettingsResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(AccessibilityServiceInfo.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AccessibilityServiceInfo.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class Application {
        public final Application OLrzqt() {
            return this;
        }

        public final AccessibilityServiceInfo AEQbTJ() {
            return new AccessibilityServiceInfo(this, null);
        }
    }
}
