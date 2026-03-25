package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sum, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45690sum extends AbstractC57329ygP {
    public static final Activity Companion = new Activity(null);
    public static final InterfaceC56387yDm<java.util.Set<java.lang.String>> OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.sul
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45690sum.EZpvd();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57329ygP
    public java.lang.String getSupportJSObjectUri() {
        return "window";
    }

    /* JADX INFO: renamed from: o.sum$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sum.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.util.Set<java.lang.String> copydefault() {
            return (java.util.Set) C45690sum.OLrzqt.getValue();
        }
    }

    public static final java.util.Set EZpvd() {
        return yEE.AhwBna("registerWebViewCloseIntercept", "app/showArticleSearch");
    }

    @Override // o.AbstractC57329ygP
    public java.util.Set<java.lang.String> getSupportJSMethods() {
        return Companion.copydefault();
    }

    @Override // o.AbstractC57329ygP
    public void performJSMethod(@NotNull com.okinc.jsbridge.Message message, @NotNull InterfaceC57336ygW interfaceC57336ygW) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        java.lang.Object objAEQbTJ = interfaceC57336ygW.AEQbTJ();
        if (objAEQbTJ instanceof InterfaceC45195slH) {
            if (Intrinsics.EZpvd((java.lang.Object) message.method, (java.lang.Object) "registerWebViewCloseIntercept")) {
                pUU.EZpvd("OKSupportJSBridgeWindowHandler", "message: " + message);
                pUU.EZpvd("OKSupportJSBridgeWindowHandler", "callback: " + interfaceC57336ygW);
                ((InterfaceC45195slH) objAEQbTJ).copydefault(message, interfaceC57336ygW);
                return;
            }
            return;
        }
        if ((objAEQbTJ instanceof InterfaceC45845szK) && Intrinsics.EZpvd((java.lang.Object) message.method, (java.lang.Object) "app/showArticleSearch")) {
            pUU.EZpvd("OKSupportJSBridgeWindowHandler", "message: " + message);
            pUU.EZpvd("OKSupportJSBridgeWindowHandler", "callback: " + interfaceC57336ygW);
            ((InterfaceC45845szK) objAEQbTJ).copydefault(message, interfaceC57336ygW);
        }
    }
}
