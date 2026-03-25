package o;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.sRg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C44477sRg {
    public static final C44477sRg copydefault = new C44477sRg();

    private C44477sRg() {
    }

    public final void AEQbTJ(java.lang.String str, OKConversation oKConversation, boolean z, boolean z2, boolean z3) {
        java.lang.String strOptString = null;
        if (z2) {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            try {
                Intrinsics.copydefault((java.lang.Object) str);
                JSONObject jSONObject = new JSONObject(str);
                if (z3) {
                    if (jSONObject.has("router")) {
                        strOptString = jSONObject.optString("router");
                    }
                } else if (jSONObject.has("url")) {
                    strOptString = jSONObject.optString("url");
                }
            } catch (JSONException unused) {
            }
            if (strOptString != null) {
                OLrzqt(strOptString);
                return;
            }
            return;
        }
        if (str != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                if (jSONObject2.has("c2cOrderId")) {
                    strOptString = jSONObject2.optString("c2cOrderId");
                }
            } catch (JSONException unused2) {
            }
        }
        java.lang.String strCopydefault = copydefault(strOptString, oKConversation, z);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault)) {
            Intrinsics.copydefault((java.lang.Object) strCopydefault);
            OLrzqt(strCopydefault);
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        android.content.Intent intent = new android.content.Intent(c32979mnm.OLrzqt(), java.lang.Class.forName("com.okinc.okex.deeplink.SchemeActivity"));
        intent.setData(android.net.Uri.parse(str));
        intent.setFlags(268435456);
        c32979mnm.OLrzqt().startActivity(intent);
    }

    public final java.lang.String copydefault(java.lang.String str, OKConversation oKConversation, boolean z) {
        java.lang.String strAEQbTJ = C34704nhP.copydefault.AEQbTJ();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return strAEQbTJ + "://im_notify_chat?c2cOrderID=" + str;
        }
        if (oKConversation == null) {
            return null;
        }
        sDZ sdz = sDZ.AEQbTJ;
        if (sdz.uzCIH() || !z) {
            OKConversation oKConversationCopydefault = sdz.valueOf().copydefault(oKConversation);
            EZpvd(oKConversationCopydefault.getTargetId(), oKConversationCopydefault.getConversationType());
            return strAEQbTJ + "://im_notify_chat?conversation=" + oKConversationCopydefault.getTargetId() + "&conversationType=" + oKConversationCopydefault.getConversationType().getValue();
        }
        return strAEQbTJ + "://im_notify_chat?orderList=0";
    }

    public final void EZpvd(java.lang.String str, OKConversationType oKConversationType) {
        AbstractC58185ywX abstractC58185ywXKWHzl = C33527myD.KWHzl(sST.EZpvd.copydefault(str, oKConversationType));
        final Function1 function1 = new Function1() { // from class: o.sRh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44477sRg.EZpvd((java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.sRj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C44477sRg.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.sRk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44477sRg.EZpvd((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.sRm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C44477sRg.EZpvd(function12, obj);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Boolean bool) {
        sEG segGEmmrt;
        C43296rmc.EZpvd("NotifyJumpHelper", "checkMessageIllegality->onNext:" + bool);
        if (bool.booleanValue() && (segGEmmrt = sDZ.AEQbTJ.gEmmrt()) != null) {
            segGEmmrt.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        C43296rmc.EZpvd("NotifyJumpHelper", "checkMessageIllegality->onError:" + th.getMessage());
        return Unit.INSTANCE;
    }
}
