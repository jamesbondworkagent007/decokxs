package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.suk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45688suk extends AbstractC57329ygP {
    public static final ActionBar Companion = new ActionBar(null);
    public static final InterfaceC56387yDm<java.util.Set<java.lang.String>> copydefault = C56392yDr.copydefault(new Function0() { // from class: o.suj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45688suk.KWHzl();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57329ygP
    public java.lang.String getSupportJSObjectUri() {
        return "request";
    }

    /* JADX INFO: renamed from: o.suk$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.suk.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.util.Set<java.lang.String> KWHzl() {
            return (java.util.Set) C45688suk.copydefault.getValue();
        }
    }

    public static final java.util.Set KWHzl() {
        return yEE.AhwBna("app/requestCameraPermission", "app/requestMicrophonePermission", "app/requestPhotoLibraryPermission", "app/openAppDeviceSettings", "app/getAppWebMode", "app/getSupportSessionId", "app/clearSupportSessionId");
    }

    @Override // o.AbstractC57329ygP
    public java.util.Set<java.lang.String> getSupportJSMethods() {
        return Companion.KWHzl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [51=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.AbstractC57329ygP
    public void performJSMethod(@NotNull com.okinc.jsbridge.Message message, @NotNull InterfaceC57336ygW interfaceC57336ygW) {
        java.lang.String str;
        android.app.Activity activityKWHzl;
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        pUU.EZpvd("OKSupportJSBridgeRequestHandler", "message: " + message);
        pUU.EZpvd("OKSupportJSBridgeRequestHandler", "callback: " + interfaceC57336ygW);
        java.lang.String str2 = message.method;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -2104574402:
                    if (str2.equals("app/getAppWebMode")) {
                        interfaceC57336ygW.OLrzqt(message, C43292rmY.OLrzqt.AhwBna());
                    }
                    break;
                case -259197375:
                    if (str2.equals("app/clearSupportSessionId")) {
                        C45359soM.copydefault.KWHzl();
                        interfaceC57336ygW.OLrzqt(message, "cleared");
                    }
                    break;
                case 700586442:
                    if (str2.equals("app/getSupportSessionId")) {
                        interfaceC57336ygW.OLrzqt(message, C45359soM.getEventSessionId$default(C45359soM.copydefault, false, 1, null));
                    }
                    break;
                case 1766012546:
                    if (str2.equals("app/openAppDeviceSettings") && (activityKWHzl = C45357soK.KWHzl.KWHzl()) != null) {
                        C33625mzw.OLrzqt().KWHzl(activityKWHzl);
                    }
                    break;
            }
        }
        java.lang.Object objAEQbTJ = interfaceC57336ygW.AEQbTJ();
        InterfaceC45195slH interfaceC45195slH = objAEQbTJ instanceof InterfaceC45195slH ? (InterfaceC45195slH) objAEQbTJ : null;
        if (interfaceC45195slH == null || (str = message.method) == null) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -1301260907) {
            if (str.equals("app/requestCameraPermission")) {
                interfaceC45195slH.KWHzl(message, interfaceC57336ygW);
            }
        } else if (iHashCode == 187452121) {
            if (str.equals("app/requestPhotoLibraryPermission")) {
                interfaceC45195slH.EZpvd(message, interfaceC57336ygW);
            }
        } else if (iHashCode == 1463017690 && str.equals("app/requestMicrophonePermission")) {
            interfaceC45195slH.AEQbTJ(message, interfaceC57336ygW);
        }
    }
}
