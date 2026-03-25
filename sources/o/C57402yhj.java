package o;

import com.google.gson.reflect.TypeToken;
import com.okinc.rxutils.SubHelper;
import com.okinc.web.WebActivity;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.C57330ygQ;

/* JADX INFO: renamed from: o.yhj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57402yhj extends AbstractC57334ygU implements InterfaceC35960oKb {
    public static /* synthetic */ Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        return null;
    }

    public static /* synthetic */ Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        return null;
    }

    public C57402yhj(android.content.Context context, C57330ygQ.StateListAnimator stateListAnimator) {
        super(context, stateListAnimator);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    @Override // o.InterfaceC35960oKb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void EZpvd(oJZ ojz, com.okinc.jsbridge.Message message) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (this.EZpvd == null) {
        }
        InterfaceC43218rlD interfaceC43218rlDAEQbTJ = C43251rlk.AEQbTJ("window", message.method);
        if (interfaceC43218rlDAEQbTJ != null) {
            interfaceC43218rlDAEQbTJ.handle(new C57333ygT(message, this));
            return;
        }
        java.lang.String str = message.method;
        str.hashCode();
        switch (str) {
            case "getTmpToken":
                if (activityAEQbTJ instanceof WebActivity) {
                    KWHzl(message, ((WebActivity) activityAEQbTJ).gGvvIC);
                    break;
                }
                break;
            case "openBrowser":
                AEQbTJ(message.data);
                break;
            case "nav":
                InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.OLrzqt(InterfaceC43294rma.class);
                if (interfaceC43294rma != null) {
                    interfaceC43294rma.KWHzl(activityAEQbTJ, message.data, Collections.emptyMap(), new Function1() { // from class: o.yhp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C57402yhj.copydefault((AbstractC43238rlX) obj);
                        }
                    });
                    break;
                } else {
                    EZpvd(message.data, message.params);
                    break;
                }
                break;
            case "back":
                copydefault("true".equals(message.data));
                break;
            case "close":
                EZpvd("true".equals(message.data));
                break;
            case "setStatusBarTheme":
                AEQbTJ("light".equals(message.data));
                break;
            case "setNavigationHeader":
                OLrzqt("true".equals(message.data));
                break;
            default:
                copydefault(message, "function undefined");
                break;
        }
    }

    public final void AEQbTJ(boolean z) {
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(this.EZpvd);
        if (activityOLrzqt != null && (activityOLrzqt instanceof WebActivity)) {
            C33575myz.AEQbTJ("checkTitleBarVisibility", "setStatusBarTheme isStatusBarLight" + z);
            ((WebActivity) activityOLrzqt).copydefault(z);
        }
    }

    public final void OLrzqt(boolean z) {
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(this.EZpvd);
        if (activityOLrzqt != null && (activityOLrzqt instanceof WebActivity)) {
            C33575myz.AEQbTJ("checkTitleBarVisibility", "setNavigationHeader " + z);
            ((WebActivity) activityOLrzqt).AEQbTJ(z);
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(str));
            intent.addFlags(268435456);
            AEQbTJ().startActivity(intent);
        } catch (java.lang.Exception unused) {
        }
    }

    public final void EZpvd(boolean z) {
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(this.EZpvd);
        if (activityOLrzqt == null) {
            return;
        }
        if (z) {
            activityOLrzqt.setResult(-1);
        }
        activityOLrzqt.finish();
    }

    public final void copydefault(boolean z) {
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(this.EZpvd);
        if (activityOLrzqt != null && z && (activityOLrzqt instanceof WebActivity)) {
            ((WebActivity) activityOLrzqt).AuCTel();
        }
    }

    public void EZpvd(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.util.Map<java.lang.String, ? extends java.lang.Object> mapKWHzl = KWHzl(str2);
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43248rlh.KWHzl.AEQbTJ(InterfaceC43294rma.class);
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (mapKWHzl == null) {
            mapKWHzl = new java.util.HashMap<>();
        }
        interfaceC43294rma.KWHzl(activityAEQbTJ, str, mapKWHzl, new Function1() { // from class: o.yhm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57402yhj.AEQbTJ((AbstractC43238rlX) obj);
            }
        });
    }

    private void KWHzl(com.okinc.jsbridge.Message message, java.lang.String str) {
        if (str == null) {
            str = "";
        }
        OLrzqt(message, str);
    }

    @Override // o.AbstractC57334ygU
    public void copydefault() {
        super.copydefault();
        SubHelper.AEQbTJ(this);
    }

    public static java.util.Map<java.lang.String, java.lang.Object> KWHzl(java.lang.String str) {
        try {
            return (java.util.Map) C33490mxT.EZpvd(str, new TypeToken<java.util.Map<java.lang.String, java.lang.Object>>() { // from class: o.yhj.2
            }.getType());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
