package o;

import com.google.common.base.Ascii;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.rxutils.SubHelper;
import com.okinc.web.WebActivity;
import com.okinc.web.bean.WebShareInfo;
import o.C57330ygQ;

/* JADX INFO: renamed from: o.yhe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57397yhe extends AbstractC57334ygU implements InterfaceC35960oKb {
    public static Gson AEQbTJ = new Gson();

    public C57397yhe(android.content.Context context, C57330ygQ.StateListAnimator stateListAnimator) {
        super(context, stateListAnimator);
    }

    @Override // o.AbstractC57334ygU
    public void copydefault() {
        super.copydefault();
        SubHelper.AEQbTJ(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    @Override // o.InterfaceC35960oKb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void EZpvd(oJZ ojz, com.okinc.jsbridge.Message message) {
        byte b;
        WebShareInfo webShareInfo;
        if (this.EZpvd == null) {
        }
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        InterfaceC43218rlD interfaceC43218rlDAEQbTJ = C43251rlk.AEQbTJ("request", message.method);
        if (interfaceC43218rlDAEQbTJ != null) {
            interfaceC43218rlDAEQbTJ.handle(new C57333ygT(message, this));
            return;
        }
        java.lang.String str = message.method;
        str.hashCode();
        boolean asBoolean = false;
        switch (str.hashCode()) {
            case -2048262383:
                b = !str.equals("clearCookie") ? (byte) -1 : (byte) 0;
                break;
            case -1808499524:
                if (str.equals("shareImage")) {
                    b = 1;
                    break;
                }
                break;
            case -1107875993:
                if (str.equals("getDeviceID")) {
                    b = 2;
                    break;
                }
                break;
            case -673424232:
                if (str.equals("getTmpToken")) {
                    b = 3;
                    break;
                }
                break;
            case 3059573:
                if (str.equals("copy")) {
                    b = 4;
                    break;
                }
                break;
            case 109400031:
                if (str.equals("share")) {
                    b = 5;
                    break;
                }
                break;
            case 351643446:
                if (str.equals("getSpecialToken")) {
                    b = 6;
                    break;
                }
                break;
            case 804366095:
                if (str.equals("getClientInfo")) {
                    b = 7;
                    break;
                }
                break;
            case 1003160217:
                if (str.equals("getWeexConfig")) {
                    b = 8;
                    break;
                }
                break;
            case 1739687432:
                if (str.equals("nativeShare")) {
                    b = 9;
                    break;
                }
                break;
            case 1898416427:
                if (str.equals("shareImageBase64")) {
                    b = 10;
                    break;
                }
                break;
            case 1985941072:
                if (str.equals("setting")) {
                    b = Ascii.VT;
                    break;
                }
                break;
        }
        switch (b) {
            case 0:
                if (activityAEQbTJ instanceof WebActivity) {
                    ((WebActivity) activityAEQbTJ).DbNXlk();
                    OLrzqt(message, "");
                }
                break;
            case 1:
            case 5:
            case 9:
            case 10:
                C57318ygE.AEQbTJ(activityAEQbTJ, message, this);
                break;
            case 2:
                OLrzqt(message);
                break;
            case 3:
                if (activityAEQbTJ instanceof WebActivity) {
                    EZpvd(message, ((WebActivity) activityAEQbTJ).gGvvIC);
                }
                break;
            case 4:
                KWHzl(message);
                break;
            case 6:
                if (activityAEQbTJ instanceof WebActivity) {
                    KWHzl(message, ((WebActivity) activityAEQbTJ).finit);
                }
                break;
            case 7:
                OLrzqt(message, KWHzl());
                break;
            case 8:
                break;
            case 11:
                if (activityAEQbTJ instanceof WebActivity) {
                    JsonObject jsonObject = (JsonObject) AEQbTJ.fromJson(message.data, JsonObject.class);
                    try {
                        jsonObject.get("showRefreshHeader").getAsBoolean();
                        break;
                    } catch (java.lang.Exception unused) {
                    }
                    try {
                        asBoolean = jsonObject.get("showShareButton").getAsBoolean();
                        break;
                    } catch (java.lang.Exception unused2) {
                    }
                    try {
                        webShareInfo = (WebShareInfo) AEQbTJ.fromJson(jsonObject.get("shareData"), WebShareInfo.class);
                    } catch (java.lang.Exception unused3) {
                        webShareInfo = null;
                    }
                    ((WebActivity) activityAEQbTJ).copydefault(asBoolean, webShareInfo);
                }
                break;
            default:
                C33134mqi.KWHzl("no handler can handle method:" + message.method);
                copydefault(message, "function undefined");
                break;
        }
    }

    public final void KWHzl(com.okinc.jsbridge.Message message) {
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) AEQbTJ().getSystemService("clipboard");
        java.lang.String str = message.data;
        android.content.ClipData clipDataNewPlainText = android.content.ClipData.newPlainText(str, str);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
            OLrzqt(message, "");
        }
    }

    public final void EZpvd(com.okinc.jsbridge.Message message, java.lang.String str) {
        if (str == null) {
            str = "";
        }
        OLrzqt(message, str);
    }

    public final void KWHzl(com.okinc.jsbridge.Message message, java.lang.String str) {
        if (str == null) {
            str = "";
        }
        OLrzqt(message, str);
    }

    public final void OLrzqt(com.okinc.jsbridge.Message message) {
        java.lang.String strCopydefault = xVW.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        OLrzqt(message, strCopydefault);
    }

    public final java.lang.String KWHzl() {
        C6900aYB c6900aYBEZpvd = C6901aYC.copydefault.EZpvd();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("_app_list");
        java.lang.String strOLrzqt = C6946aYv.OLrzqt(c6900aYBEZpvd, hashSet);
        int iLastIndexOf = strOLrzqt.lastIndexOf("\r\n");
        return iLastIndexOf >= 0 ? strOLrzqt.substring(0, iLastIndexOf) : strOLrzqt;
    }
}
