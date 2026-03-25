package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core_api.Playbook;
import com.okinc.ok_kyc_core_api.PlaybookParameter;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rAx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C41953rAx implements InterfaceC43234rlT {
    public static final Activity Companion = new Activity(null);

    /* JADX INFO: renamed from: o.rAx$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rAx.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.String value;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        pUU.KWHzl("KYCDeepLinkHandler", "PATH==kyc/redirect");
        C43693ruB.OLrzqt("Url_Vendor_Back");
        C43693ruB.OLrzqt("Url_Vendor_Back_View");
        java.lang.Object obj = map.get("playbook");
        if (obj == null || (value = C33129mqd.gEmmrt(obj)) == null) {
            value = Playbook.OKX_APP_KYC.getValue();
        }
        PlaybookParameter playbookParameter = PlaybookParameter.REFRESHTYPE;
        java.lang.Object obj2 = map.get(playbookParameter.getValue());
        java.lang.String strGEmmrt = obj2 != null ? C33129mqd.gEmmrt(obj2) : null;
        java.util.HashMap<java.lang.String, java.lang.String> map2 = new java.util.HashMap<>();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt)) {
            java.lang.String value2 = playbookParameter.getValue();
            Intrinsics.copydefault((java.lang.Object) strGEmmrt);
            map2.put(value2, strGEmmrt);
        }
        java.util.HashMap map3 = new java.util.HashMap();
        for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            pUU.KWHzl("KYCDeepLinkHandler", ((java.lang.Object) key) + "==" + C33129mqd.gEmmrt(entry.getValue()));
            map3.put(entry.getKey(), C33129mqd.gEmmrt(entry.getValue()));
        }
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        pUU.KWHzl("KYCDeepLinkHandler", "activity==" + activityAEQbTJ);
        if (activityAEQbTJ != null && (activityAEQbTJ instanceof ActivityC42054rEq)) {
            ((ActivityC42054rEq) activityAEQbTJ).finish();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) InterfaceC43709ruR.Companion.AEQbTJ(value, map2).AEQbTJ(map3));
        final Function1 function1 = new Function1() { // from class: o.rAz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return C41953rAx.KWHzl((ResponseData) obj3);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rAy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj3) {
                C41953rAx.OLrzqt(function1, obj3);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.rAC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return C41953rAx.OLrzqt((java.lang.Throwable) obj3);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rAE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj3) {
                C41953rAx.AEQbTJ(function12, obj3);
            }
        });
        C43693ruB.OLrzqt("Url_Vendor_Back_End");
        C43693ruB.OLrzqt("Url_Vendor_BackEnd_View");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(ResponseData responseData) {
        C43693ruB.copydefault("Url_Vendor_Back_Call", C56424yEw.AYXKKw(C56390yDp.OLrzqt("is_success", "yes")));
        C43693ruB.copydefault("Url_Vendor_BackCall_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("is_success", "yes")));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(java.lang.Throwable th) {
        C43693ruB.copydefault("Url_Vendor_Back_Call", C56424yEw.AYXKKw(C56390yDp.OLrzqt("is_success", "no")));
        C43693ruB.copydefault("Url_Vendor_BackCall_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("is_success", "no")));
        return Unit.INSTANCE;
    }
}
