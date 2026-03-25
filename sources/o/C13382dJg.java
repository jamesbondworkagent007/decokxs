package o;

import com.google.gson.Gson;
import com.okinc.business.defi.api.bean.UTXONFTListResp;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import o.C13181dBv;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: renamed from: o.dJg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13382dJg implements C13181dBv.TaskDescription {
    public final WeakReference<C13241dEa> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ(long j, boolean z) {
        return (j != 70000061 || z) ? (j != 70000038 || z) ? (j != 70000047 || z) ? "window.bitcoin" : "window.bitcoinSignet" : "window.bitcoinTestnet" : "window.fractalBitcoin";
    }

    public C13382dJg(@NotNull WeakReference<C13241dEa> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.AEQbTJ = weakReference;
    }

    @Override // o.C13181dBv.TaskDescription
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String strAEQbTJ = AEQbTJ(j, z);
        C13241dEa c13241dEa = this.AEQbTJ.get();
        if (c13241dEa != null) {
            c13241dEa.setMAction(str3);
            c13241dEa.setWeb3JsIdSign(str);
            c13241dEa.setDappType(7);
            c13241dEa.evaluateJavascript(strAEQbTJ + ".sendError(" + c13241dEa.dNCPSb() + ",\"" + str2 + "\")", null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [54=9] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.C13181dBv.TaskDescription
    public void EZpvd(@NotNull java.lang.String str, @NotNull android.os.Bundle bundle, @NotNull java.lang.String str2, long j, boolean z) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strAEQbTJ = AEQbTJ(j, z);
        C13241dEa c13241dEa = this.AEQbTJ.get();
        if (c13241dEa != null) {
            c13241dEa.setMAction(str2);
            c13241dEa.setWeb3JsIdSign(str);
            c13241dEa.setDappType(7);
            switch (str2.hashCode()) {
                case -976921794:
                    if (!str2.equals("pushTx")) {
                        return;
                    }
                    break;
                case -366175114:
                    if (str2.equals("sendBitcoin")) {
                        java.lang.String string2 = bundle.getString("tx_hash");
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) string2)) {
                            c13241dEa.evaluateJavascript(strAEQbTJ + ".sendResponse(" + c13241dEa.dNCPSb() + ",\"" + string2 + "\")", null);
                            return;
                        }
                        return;
                    }
                    return;
                case -79086710:
                    if (!str2.equals("signMessage")) {
                        return;
                    }
                    break;
                case 3526536:
                    if (str2.equals("send")) {
                        java.lang.String string3 = bundle.getString("tx_hash");
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) string3)) {
                            c13241dEa.evaluateJavascript(strAEQbTJ + ".sendResponse(" + c13241dEa.dNCPSb() + "," + new Gson().toJson(C56424yEw.djBIcL(C56390yDp.OLrzqt("txhash", string3))) + ")", null);
                            return;
                        }
                        return;
                    }
                    return;
                case 311218418:
                    if (str2.equals("signPsbt") && (string = bundle.getString("data")) != null) {
                        c13241dEa.evaluateJavascript(strAEQbTJ + ".sendResponse(" + c13241dEa.dNCPSb() + ",\"" + string + "\")", null);
                        return;
                    }
                    return;
                case 451875733:
                    if (str2.equals("requestAccounts")) {
                        java.lang.String string4 = bundle.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
                        InterfaceC9738bbJ interfaceC9738bbJValues = c13241dEa.values();
                        if (interfaceC9738bbJValues == null || string4 == null) {
                            return;
                        }
                        java.util.Map<java.lang.String, java.lang.String> mapAEQbTJ = dDW.copydefault.AEQbTJ(interfaceC9738bbJValues, string4, j);
                        if (!mapAEQbTJ.isEmpty()) {
                            c13241dEa.evaluateJavascript(strAEQbTJ + ".sendResponse(" + c13241dEa.dNCPSb() + ",JSON.stringify(" + new Gson().toJson(mapAEQbTJ) + "))", null);
                            return;
                        }
                        return;
                    }
                    return;
                case 697674406:
                    if (str2.equals("getBalance")) {
                        long j2 = bundle.getLong("confirmed");
                        long j3 = bundle.getLong("unconfirmed");
                        long j4 = bundle.getLong("total");
                        c13241dEa.evaluateJavascript(strAEQbTJ + ".sendResponse(" + c13241dEa.dNCPSb() + "," + new Gson().toJson(C56424yEw.djBIcL(C56390yDp.OLrzqt("confirmed", java.lang.Long.valueOf(j2)), C56390yDp.OLrzqt("unconfirmed", java.lang.Long.valueOf(j3)), C56390yDp.OLrzqt("total", java.lang.Long.valueOf(j4)))) + ")", null);
                        return;
                    }
                    return;
                case 1057836481:
                    if (str2.equals("signPsbts")) {
                        java.lang.String string5 = bundle.getString("data");
                        c13241dEa.evaluateJavascript(strAEQbTJ + ".sendResponse(" + c13241dEa.dNCPSb() + "," + string5 + ")", null);
                        return;
                    }
                    return;
                case 1357910545:
                    if (str2.equals("getInscriptions")) {
                        UTXONFTListResp uTXONFTListResp = (UTXONFTListResp) bundle.getParcelable("data");
                        c13241dEa.evaluateJavascript(strAEQbTJ + ".sendResponse(" + c13241dEa.dNCPSb() + "," + new Gson().toJson(uTXONFTListResp) + ")", null);
                        return;
                    }
                    return;
                case 1936609072:
                    if (str2.equals("sendInscription") && new JSONArray(bundle.getString("tx_hash")).length() > 0) {
                        java.lang.String strGEmmrt = C33129mqd.gEmmrt(new JSONArray(bundle.getString("tx_hash")).get(0));
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt)) {
                            c13241dEa.evaluateJavascript(strAEQbTJ + ".sendResponse(" + c13241dEa.dNCPSb() + ",\"" + strGEmmrt + "\")", null);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
            java.lang.String string6 = bundle.getString("data");
            if (string6 != null) {
                c13241dEa.evaluateJavascript(strAEQbTJ + ".sendResponse(" + c13241dEa.dNCPSb() + ",\"" + string6 + "\")", null);
            }
        }
    }

    @Override // o.C13181dBv.TaskDescription
    public void KWHzl(@NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        C13241dEa c13241dEa = this.AEQbTJ.get();
        if (c13241dEa != null) {
            c13241dEa.setDappType(7);
            c13241dEa.setCurrentWallet(interfaceC9738bbJ);
            c13241dEa.setAddress(str);
            dES des = c13241dEa.aKErDB().get();
            if (des != null) {
                des.AEQbTJ(java.lang.Long.valueOf(j), str, interfaceC9738bbJ, false);
            }
        }
    }
}
