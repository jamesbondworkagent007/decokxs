package o;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.wQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C52562wQ extends C52427wL {
    public static final Activity EZpvd = new Activity(null);
    public static final C57737yo<java.lang.String> valueOf = new C57737yo<>("aws.smithy.kotlin#ErrorCode");
    public static final C57737yo<java.lang.String> djBIcL = new C57737yo<>("aws.smithy.kotlin#ErrorMessage");
    public static final C57737yo<ServiceException.ErrorType> AYXKKw = new C57737yo<>("aws.smithy.kotlin#ErrorType");
    public static final C57737yo<InterfaceC52400wK> gEmmrt = new C57737yo<>("aws.smithy.kotlin#ProtocolResponse");
    public static final C57737yo<java.lang.String> AhwBna = new C57737yo<>("aws.smithy.kotlin#RequestId");

    /* JADX INFO: renamed from: o.wQ$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wQ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C57737yo<java.lang.String> AEQbTJ() {
            return C52562wQ.valueOf;
        }

        public final C57737yo<java.lang.String> KWHzl() {
            return C52562wQ.djBIcL;
        }

        public final C57737yo<ServiceException.ErrorType> copydefault() {
            return C52562wQ.AYXKKw;
        }

        public final C57737yo<InterfaceC52400wK> EZpvd() {
            return C52562wQ.gEmmrt;
        }

        public final C57737yo<java.lang.String> OLrzqt() {
            return C52562wQ.AhwBna;
        }
    }

    public final java.lang.String DbNXlk() {
        return (java.lang.String) OLrzqt().OLrzqt(valueOf);
    }

    public final ServiceException.ErrorType values() {
        ServiceException.ErrorType errorType = (ServiceException.ErrorType) OLrzqt().OLrzqt(AYXKKw);
        return errorType == null ? ServiceException.ErrorType.Unknown : errorType;
    }

    public final InterfaceC52400wK fetchVPNInfo() {
        InterfaceC52400wK interfaceC52400wK = (InterfaceC52400wK) OLrzqt().OLrzqt(gEmmrt);
        return interfaceC52400wK == null ? C52508wO.copydefault : interfaceC52400wK;
    }
}
