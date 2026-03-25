package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.wL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C52427wL {
    public final InterfaceC56293yA OLrzqt = C58108yv.AEQbTJ();
    public static final Application KWHzl = new Application(null);
    public static final C57737yo<java.lang.Boolean> AEQbTJ = new C57737yo<>("aws.smithy.kotlin#Retryable");
    public static final C57737yo<java.lang.Boolean> copydefault = new C57737yo<>("aws.smithy.kotlin#ThrottlingError");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56293yA OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.wL$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wL.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C57737yo<java.lang.Boolean> OLrzqt() {
            return C52427wL.AEQbTJ;
        }

        public final C57737yo<java.lang.Boolean> EZpvd() {
            return C52427wL.copydefault;
        }
    }

    public final boolean copydefault() {
        java.lang.Boolean bool = (java.lang.Boolean) this.OLrzqt.OLrzqt(AEQbTJ);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean AEQbTJ() {
        java.lang.Boolean bool = (java.lang.Boolean) this.OLrzqt.OLrzqt(copydefault);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
