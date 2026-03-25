package o;

import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.core.util.SPUtils;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dyF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15112dyF {
    public static Function0<Unit> EZpvd;
    public static DappTabData KWHzl;
    public static final C15112dyF AEQbTJ = new C15112dyF();
    public static java.util.List<DappTabData> gEmmrt = new java.util.ArrayList();
    public static int OLrzqt = C48787ucK.AEQbTJ.AEQbTJ("dappConfig.dappHistoryMaxCount", 50);
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> AYXKKw() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function0<Unit> function0) {
        EZpvd = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappTabData OLrzqt() {
        return KWHzl;
    }

    private C15112dyF() {
    }

    public final void KWHzl(DappTabData dappTabData) {
        KWHzl = dappTabData;
        Function0<Unit> function0 = EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void AEQbTJ(@NotNull DappTabData dappTabData) {
        Intrinsics.checkNotNullParameter(dappTabData, "");
        if (gEmmrt.isEmpty()) {
            java.util.List<DappTabData> listEZpvd = EZpvd();
            if (listEZpvd == null) {
                listEZpvd = new java.util.ArrayList<>();
            }
            gEmmrt = listEZpvd;
        }
        if (gEmmrt.size() == OLrzqt) {
            gEmmrt.remove(r0.size() - 1);
        }
        gEmmrt.add(0, dappTabData);
        gEmmrt();
    }

    public final java.util.List<DappTabData> djBIcL() {
        if (!gEmmrt.isEmpty()) {
            return gEmmrt;
        }
        java.util.List<DappTabData> listEZpvd = EZpvd();
        if (listEZpvd == null) {
            listEZpvd = new java.util.ArrayList<>();
        }
        gEmmrt = listEZpvd;
        return listEZpvd;
    }

    public final void copydefault(int i) {
        if (i < 0 || i > gEmmrt.size() - 1) {
            return;
        }
        dDN ddn = dDN.copydefault;
        if (Intrinsics.EZpvd(ddn.AhwBna().getFirstKey(), gEmmrt.get(i))) {
            ddn.AhwBna().resetFirstKey();
        }
        ddn.AhwBna().remove(gEmmrt.get(i));
        C13241dEa mWebView = gEmmrt.get(i).getMWebView();
        if (mWebView != null) {
            mWebView.KWHzl();
        }
        gEmmrt.get(i).setMWebView(null);
        OLrzqt(gEmmrt.get(i));
        gEmmrt.remove(i);
        gEmmrt();
    }

    public final void gEmmrt() {
        try {
            SPUtils.put("SP_DAPP_TAB_KEY", gEmmrt, "dapp_tab");
        } catch (java.lang.Exception unused) {
        }
    }

    public final void OLrzqt(DappTabData dappTabData) {
        java.lang.String strDjBIcL = dDN.copydefault.djBIcL();
        java.lang.String mThumbImageFileName = dappTabData.getMThumbImageFileName();
        if (mThumbImageFileName == null) {
            mThumbImageFileName = "";
        }
        java.io.File file = new java.io.File(strDjBIcL, mThumbImageFileName);
        if (file.exists() && file.isFile()) {
            file.delete();
        }
    }

    public final java.util.List<DappTabData> EZpvd() {
        java.util.ArrayList arrayList = SPUtils.getArrayList("SP_DAPP_TAB_KEY", DappTabData.class);
        if (arrayList != null) {
            SPUtils.put("SP_DAPP_TAB_KEY", "");
            return arrayList;
        }
        return SPUtils.getArrayList("SP_DAPP_TAB_KEY", DappTabData.class, "dapp_tab");
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        if (!C59449zhJ.endsWith$default(str, "/", false, 2, null)) {
            return str;
        }
        java.lang.String strSubstring = str.substring(0, str.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final void KWHzl(int i) {
        if (i < 0 || i > gEmmrt.size() - 1) {
            return;
        }
        java.util.List<DappTabData> list = gEmmrt;
        list.add(0, list.remove(i));
        gEmmrt();
    }

    public final void AEQbTJ() {
        java.io.File[] fileArrListFiles;
        for (DappTabData dappTabData : gEmmrt) {
            C13241dEa mWebView = dappTabData.getMWebView();
            if (mWebView != null) {
                mWebView.KWHzl();
            }
            dappTabData.setMWebView(null);
        }
        java.io.File file = new java.io.File(dDN.copydefault.djBIcL());
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (java.io.File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
        gEmmrt.clear();
        dDN.copydefault.AhwBna().clear();
        gEmmrt();
    }

    public final void copydefault() {
        for (DappTabData dappTabData : gEmmrt) {
            dappTabData.setMThumbImage(null);
            dappTabData.setMIcon(null);
        }
        java.util.Iterator<Map.Entry<DappTabData, java.lang.Integer>> it = dDN.copydefault.AhwBna().entrySet().iterator();
        while (it.hasNext()) {
            DappTabData key = it.next().getKey();
            key.setMThumbImage(null);
            key.setMIcon(null);
        }
    }

    public final int EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = 0;
        for (java.lang.Object obj : gEmmrt) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C15112dyF c15112dyF = AEQbTJ;
            java.lang.String mUrl = ((DappTabData) obj).getMUrl();
            if (mUrl == null) {
                mUrl = "";
            }
            if (Intrinsics.EZpvd((java.lang.Object) c15112dyF.OLrzqt(mUrl), (java.lang.Object) c15112dyF.OLrzqt(str))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int KWHzl() {
        int i = 0;
        for (java.lang.Object obj : gEmmrt) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (Intrinsics.EZpvd((DappTabData) obj, KWHzl)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
