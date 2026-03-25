package o;

import com.google.gson.Gson;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import o.C13284dFq;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class dJC implements C13284dFq.ActionBar {
    public final WeakReference<C13241dEa> copydefault;

    public dJC(@NotNull WeakReference<C13241dEa> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.copydefault = weakReference;
    }

    @Override // o.C13284dFq.ActionBar
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C13241dEa c13241dEa = this.copydefault.get();
        if (c13241dEa != null) {
            c13241dEa.setMAction(str3);
            c13241dEa.setWeb3JsIdSign(str);
            c13241dEa.setDappType(4);
            C13284dFq c13284dFqQfsBiF = c13241dEa.QfsBiF();
            java.lang.String strAhwBna = c13284dFqQfsBiF != null ? c13284dFqQfsBiF.AhwBna() : null;
            c13241dEa.evaluateJavascript(strAhwBna + ".sendError(\"" + c13241dEa.dNCPSb() + "\",\"" + str2 + "\",-4005)", null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [33=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.C13284dFq.ActionBar
    public void EZpvd(@NotNull java.lang.String str, android.os.Bundle bundle, @NotNull java.lang.String str2) {
        java.lang.String str3;
        java.lang.String string;
        java.lang.String string2;
        str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C13241dEa c13241dEa = this.copydefault.get();
        if (c13241dEa != null) {
            c13241dEa.setMAction(str2);
            c13241dEa.setWeb3JsIdSign(str);
            c13241dEa.setDappType(4);
            switch (str2.hashCode()) {
                case -498490966:
                    if (str2.equals("signAndExecuteTransactionBlock")) {
                        java.util.HashMap map = new java.util.HashMap();
                        java.lang.String string3 = bundle != null ? bundle.getString("tx_hash") : null;
                        JSONObject jSONObject = new JSONObject(bundle != null ? bundle.getString("tx_sign") : null);
                        java.lang.String string4 = jSONObject.has("tx_bytes") ? jSONObject.getString("tx_bytes") : "";
                        map.put("confirmedLocalExecution", "false");
                        map.put("digest", string3 != null ? string3 : "");
                        map.put("txBytes", string4);
                        java.lang.String json = new Gson().toJson(map);
                        C13284dFq c13284dFqQfsBiF = c13241dEa.QfsBiF();
                        java.lang.String strAhwBna = c13284dFqQfsBiF != null ? c13284dFqQfsBiF.AhwBna() : null;
                        c13241dEa.evaluateJavascript(strAhwBna + ".sendResponse(\"" + c13241dEa.dNCPSb() + "\",'" + json + "')", null);
                        return;
                    }
                    return;
                case -79086710:
                    if (!str2.equals("signMessage")) {
                        return;
                    }
                    break;
                case 314844204:
                    if (str2.equals("signTransactionBlock")) {
                        java.util.HashMap map2 = new java.util.HashMap();
                        java.lang.String string5 = bundle != null ? bundle.getString("tx_bytes") : null;
                        java.lang.String string6 = bundle != null ? bundle.getString("signature") : null;
                        if (string6 == null) {
                            string6 = "";
                        }
                        map2.put("signature", string6);
                        map2.put("transactionBlockBytes", string5 != null ? string5 : "");
                        java.lang.String json2 = new Gson().toJson(map2);
                        C13284dFq c13284dFqQfsBiF2 = c13241dEa.QfsBiF();
                        java.lang.String strAhwBna2 = c13284dFqQfsBiF2 != null ? c13284dFqQfsBiF2.AhwBna() : null;
                        c13241dEa.evaluateJavascript(strAhwBna2 + ".sendResponse(\"" + c13241dEa.dNCPSb() + "\",'" + json2 + "')", null);
                        return;
                    }
                    return;
                case 951351530:
                    if (str2.equals("connect")) {
                        java.lang.String strGEmmrt = C33129mqd.gEmmrt(bundle != null ? bundle.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) : null);
                        java.util.HashMap map3 = new java.util.HashMap();
                        map3.put(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, C33129mqd.gEmmrt(c13241dEa.AEQbTJ()));
                        java.lang.String json3 = new Gson().toJson(map3);
                        C13284dFq c13284dFqQfsBiF3 = c13241dEa.QfsBiF();
                        java.lang.String strAhwBna3 = c13284dFqQfsBiF3 != null ? c13284dFqQfsBiF3.AhwBna() : null;
                        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(strGEmmrt);
                        InterfaceC9738bbJ interfaceC9738bbJValues = c13241dEa.values();
                        c13241dEa.AEQbTJ(strAhwBna3, strGEmmrt2, interfaceC9738bbJValues != null ? interfaceC9738bbJValues.OLrzqt(784L) : null);
                        C13284dFq c13284dFqQfsBiF4 = c13241dEa.QfsBiF();
                        java.lang.String strAhwBna4 = c13284dFqQfsBiF4 != null ? c13284dFqQfsBiF4.AhwBna() : null;
                        c13241dEa.evaluateJavascript(strAhwBna4 + ".sendResponse(\"" + c13241dEa.dNCPSb() + "\",'" + json3 + "')", null);
                        return;
                    }
                    return;
                case 1684402730:
                    if (!str2.equals(DappSignArgs.SIGN_PERSONALMESSAGE)) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            java.util.HashMap map4 = new java.util.HashMap();
            if (bundle == null || (string = bundle.getString("messageBytes", "")) == null) {
                string = "";
            }
            map4.put("messageBytes", string);
            if (bundle != null && (string2 = bundle.getString("data", "")) != null) {
                str3 = string2;
            }
            map4.put("signature", str3);
            java.lang.String json4 = new Gson().toJson(map4);
            C13284dFq c13284dFqQfsBiF5 = c13241dEa.QfsBiF();
            java.lang.String strAhwBna5 = c13284dFqQfsBiF5 != null ? c13284dFqQfsBiF5.AhwBna() : null;
            c13241dEa.evaluateJavascript(strAhwBna5 + ".sendResponse(\"" + c13241dEa.dNCPSb() + "\",'" + json4 + "')", null);
        }
    }

    @Override // o.C13284dFq.ActionBar
    public void copydefault(long j, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        C13241dEa c13241dEa = this.copydefault.get();
        if (c13241dEa != null) {
            c13241dEa.setDappType(4);
            c13241dEa.setCurrentWallet(interfaceC9738bbJ);
            c13241dEa.setAddress(str);
            dES des = c13241dEa.aKErDB().get();
            if (des != null) {
                des.AEQbTJ(java.lang.Long.valueOf(j), str, interfaceC9738bbJ, z);
            }
        }
    }
}
