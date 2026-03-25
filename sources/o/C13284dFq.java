package o;

import androidx.fragment.app.FragmentActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.network.okg.response.ResponseData;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import o.dLX;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.dFq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13284dFq extends dAX {
    public static final Application Companion = new Application(null);
    public static final int gEmmrt = 8;
    public final java.lang.String AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public kotlin.Pair<java.lang.String, java.lang.String> djBIcL;
    public ActionBar valueOf;

    /* JADX INFO: renamed from: o.dFq$ActionBar */
    public interface ActionBar {
        void EZpvd(@NotNull java.lang.String str, android.os.Bundle bundle, @NotNull java.lang.String str2);

        void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

        void copydefault(long j, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, boolean z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13284dFq(@NotNull WeakReference<FragmentActivity> weakReference, ActionBar actionBar, @NotNull WeakReference<dES> weakReference2) {
        super(4, weakReference, weakReference2);
        Intrinsics.checkNotNullParameter(weakReference, "");
        Intrinsics.checkNotNullParameter(weakReference2, "");
        this.valueOf = actionBar;
        this.AYXKKw = C13284dFq.class.getSimpleName();
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.dFw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C13284dFq.AYXKKw();
            }
        });
    }

    public final java.lang.String AhwBna() {
        kotlin.Pair<java.lang.String, java.lang.String> pair = this.djBIcL;
        return "window.okxwallet." + (pair != null ? pair.getSecond() : null);
    }

    public final C15059dxF valueOf() {
        return (C15059dxF) this.AhwBna.getValue();
    }

    public static final C15059dxF AYXKKw() {
        return new C15059dxF();
    }

    /* JADX INFO: renamed from: o.dFq$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dFq.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @android.webkit.JavascriptInterface
    public final void postMessage(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            EZpvd(new Function1() { // from class: o.dFA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13284dFq.AEQbTJ(this.EZpvd, str, (java.lang.String) obj);
                }
            });
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("dappwebview", "SuiWebAppinterface", e);
        }
    }

    public static final Unit AEQbTJ(C13284dFq c13284dFq, java.lang.String str, java.lang.String str2) throws JSONException {
        c13284dFq.OLrzqt(str);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull java.lang.String str) throws JSONException {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(str, "");
        pUU.copydefault(this.AYXKKw, str);
        JSONObject jSONObject2 = new JSONObject(str);
        java.lang.Object obj = jSONObject2.get("id");
        if (C33129mqd.valueOf(obj) == 0) {
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject2.has("object")) {
            if (jSONObject2.get("object") instanceof JSONObject) {
                java.lang.Object obj2 = jSONObject2.get("object");
                Intrinsics.copydefault(obj2, "");
                jSONObject3 = (JSONObject) obj2;
            } else if (jSONObject2.get("object") instanceof java.lang.String) {
                java.lang.Object obj3 = jSONObject2.get("object");
                Intrinsics.copydefault(obj3, "");
                jSONObject = new JSONObject((java.lang.String) obj3);
            }
            jSONObject = jSONObject3;
        } else {
            jSONObject = jSONObject3;
        }
        java.lang.String string = jSONObject.has("data") ? jSONObject.getString("data") : "";
        if (jSONObject2.has("walletName")) {
            java.lang.Object obj4 = jSONObject2.get("walletName");
            Intrinsics.copydefault(obj4, "");
            dDN ddn = dDN.copydefault;
            if (Intrinsics.EZpvd(obj4, (java.lang.Object) ddn.copydefault().getFirst())) {
                this.djBIcL = ddn.copydefault();
            } else {
                this.djBIcL = ddn.EZpvd();
            }
        }
        java.lang.Object obj5 = jSONObject2.get("name");
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "connect")) {
            KWHzl(784L, C56424yEw.AYXKKw(C56390yDp.OLrzqt("id", obj)));
            return;
        }
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "disconnect")) {
            AEQbTJ(784L, "", (InterfaceC9738bbJ) null, false);
            return;
        }
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "signTransactionBlock")) {
            Intrinsics.copydefault(obj);
            AEQbTJ(obj, C33129mqd.gEmmrt(jSONObject), "signTransactionBlock", true);
            return;
        }
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "signAndExecuteTransactionBlock")) {
            Intrinsics.copydefault(obj);
            EZpvd(obj, jSONObject, "signAndExecuteTransactionBlock");
            return;
        }
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) DappSignArgs.SIGN_PERSONALMESSAGE)) {
            Intrinsics.copydefault(obj);
            copydefault(obj, string);
            return;
        }
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "signMessage")) {
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = OLrzqt();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (interfaceC9738bbJOLrzqt != null ? interfaceC9738bbJOLrzqt.OLrzqt(784L) : null))) {
                Intrinsics.copydefault(obj);
                AEQbTJ(obj, jSONObject);
                return;
            } else {
                FragmentActivity fragmentActivity = EZpvd().get();
                C55326xho.toast$default(fragmentActivity != null ? fragmentActivity.getString(dLX.Dialog.DaRZkR) : null, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                return;
            }
        }
        if (Intrinsics.EZpvd(obj5, (java.lang.Object) "requestRpc")) {
            Intrinsics.copydefault(obj);
            sendRpcRequest$default(this, obj, jSONObject, null, 4, null);
        }
    }

    @Override // o.dAX
    public void EZpvd(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l, java.util.HashMap<java.lang.String, java.lang.Object> map) {
        super.EZpvd(interfaceC9738bbJ, l, map);
        java.lang.Object obj = map != null ? map.get("id") : null;
        if (interfaceC9738bbJ != null && l != null && l.longValue() == 784) {
            EZpvd(interfaceC9738bbJ);
            OLrzqt(C33129mqd.gEmmrt(obj), interfaceC9738bbJ, (java.lang.Long) 784L);
        } else {
            ActionBar actionBar = this.valueOf;
            if (actionBar != null) {
                actionBar.OLrzqt(java.lang.String.valueOf(obj), "", "connect");
            }
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt != null) {
            dappTabDataOLrzqt.setConnectedByWalletConnect(false);
        }
        if (l != null) {
            java.lang.String strEZpvd = interfaceC9738bbJ.EZpvd(l.longValue());
            AEQbTJ(l.longValue(), strEZpvd == null ? "" : strEZpvd, interfaceC9738bbJ, false);
            ActionBar actionBar = this.valueOf;
            if (actionBar != null) {
                java.lang.String strValueOf = java.lang.String.valueOf(str);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, interfaceC9738bbJ.EZpvd(784L));
                Unit unit = Unit.INSTANCE;
                actionBar.EZpvd(strValueOf, bundle, "connect");
            }
        }
    }

    public static /* synthetic */ void sendRpcRequest$default(C13284dFq c13284dFq, java.lang.Object obj, JSONObject jSONObject, java.lang.String str, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            str = null;
        }
        c13284dFq.KWHzl(obj, jSONObject, str);
    }

    public final void KWHzl(final java.lang.Object obj, final JSONObject jSONObject, java.lang.String str) {
        java.lang.String strZsXlph;
        C13241dEa mWebView;
        C13241dEa mWebView2;
        java.util.HashMap<java.lang.Long, java.lang.String> mapQOLQEE;
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
        if (dappTabDataOLrzqt == null || (mWebView2 = dappTabDataOLrzqt.getMWebView()) == null || (mapQOLQEE = mWebView2.QOLQEE()) == null || (strZsXlph = mapQOLQEE.get(784L)) == null) {
            DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
            strZsXlph = (dappTabDataOLrzqt2 == null || (mWebView = dappTabDataOLrzqt2.getMWebView()) == null) ? null : mWebView.zsXlph();
            Intrinsics.copydefault((java.lang.Object) strZsXlph);
        }
        if (str == null) {
            str = strZsXlph;
        }
        C15059dxF c15059dxFValueOf = valueOf();
        java.lang.String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        C33024moe.subscribeOnIO$default(c15059dxFValueOf.OLrzqt(str, string), new Function1() { // from class: o.dFy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C13284dFq.copydefault(this.OLrzqt, obj, (java.lang.Throwable) obj2);
            }
        }, (Function0) null, new Function1() { // from class: o.dFz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C13284dFq.AEQbTJ(this.OLrzqt, obj, (JsonObject) obj2);
            }
        }, 2, (java.lang.Object) null);
        FragmentActivity fragmentActivity = EZpvd().get();
        if (fragmentActivity != null) {
            fragmentActivity.runOnUiThread(new java.lang.Runnable() { // from class: o.dFx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C13284dFq.OLrzqt(jSONObject);
                }
            });
        }
    }

    public static final Unit AEQbTJ(C13284dFq c13284dFq, java.lang.Object obj, JsonObject jsonObject) {
        java.lang.String strValueOf = "";
        Intrinsics.checkNotNullParameter(jsonObject, "");
        jsonObject.toString();
        if (jsonObject.get("data") != null) {
            try {
                java.lang.Object obj2 = jsonObject.get("data");
                Intrinsics.copydefault(obj2, "");
                strValueOf = java.lang.String.valueOf(((JsonObject) obj2).get((java.lang.Object) "data"));
            } catch (java.lang.Exception unused) {
            }
        } else {
            strValueOf = jsonObject.toString();
        }
        c13284dFq.KWHzl(obj, strValueOf, false);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C13284dFq c13284dFq, java.lang.Object obj, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c13284dFq.KWHzl(obj, java.lang.String.valueOf(C43422row.AEQbTJ(th)), true);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(JSONObject jSONObject) {
        java.lang.String url;
        C13241dEa mWebView;
        C14742drG c14742drG = C14742drG.KWHzl;
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null || (url = mWebView.getUrl()) == null) {
            url = "";
        }
        java.lang.String strOptString = jSONObject.optString(FirebaseAnalytics.Param.METHOD);
        Intrinsics.checkNotNullExpressionValue(strOptString, "");
        c14742drG.EZpvd(url, strOptString, "784");
    }

    public final void KWHzl(java.lang.Object obj, java.lang.String str, boolean z) {
        java.lang.String strFJNWhG;
        C13241dEa mWebView;
        java.lang.String strAhwBna = AhwBna();
        if (z) {
            strFJNWhG = C59442zhC.fJNWhG("\n                        if (" + strAhwBna + ") {\n                            " + strAhwBna + ".sendRpcResponse(" + obj + ", \"\", " + str + ")\n                        }\n                    ");
        } else {
            strFJNWhG = C59442zhC.fJNWhG("\n                        if (" + strAhwBna + ") {\n                            " + strAhwBna + ".sendRpcResponse(" + obj + ", " + str + ")\n                        }\n                    ");
        }
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null) {
            return;
        }
        mWebView.evaluateJavascript(strFJNWhG, null);
    }

    public static /* synthetic */ void operatorConstractInteraction$default(C13284dFq c13284dFq, java.lang.Object obj, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj2) {
        if ((i & 8) != 0) {
            z = false;
        }
        c13284dFq.AEQbTJ(obj, str, str2, z);
    }

    public final void AEQbTJ(final java.lang.Object obj, java.lang.String str, final java.lang.String str2, final boolean z) {
        java.lang.String strDbNXlk;
        java.lang.String strEZpvd;
        FragmentActivity fragmentActivity = EZpvd().get();
        if (fragmentActivity != null) {
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = OLrzqt();
            AEQbTJ(784L, (interfaceC9738bbJOLrzqt == null || (strEZpvd = interfaceC9738bbJOLrzqt.EZpvd(784L)) == null) ? "" : strEZpvd, OLrzqt(), false);
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt2 = OLrzqt();
            if (interfaceC9738bbJOLrzqt2 == null || (strDbNXlk = interfaceC9738bbJOLrzqt2.DbNXlk()) == null) {
                strDbNXlk = "";
            }
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(784L);
            PlatformItem platformItemAEQbTJ = AEQbTJ();
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(str);
            Gson gson = new Gson();
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            PlatformItem platformItemAEQbTJ2 = AEQbTJ();
            pairArr[0] = C56390yDp.OLrzqt("dappUrl", platformItemAEQbTJ2 != null ? platformItemAEQbTJ2.getUrl() : null);
            pairArr[1] = C56390yDp.OLrzqt("signDataJson", C33129mqd.gEmmrt(str));
            dFN.startContractInteractionWithReport$default(str2, fragmentActivity, new DappInteractionArgs(strDbNXlk, null, strGEmmrt, platformItemAEQbTJ, strGEmmrt2, null, "dapp", 2, null, null, null, null, false, false, null, z, null, null, null, null, null, null, null, null, null, null, 6, gson.toJson(C56424yEw.gEmmrt(pairArr)), null, null, null, null, -201359582, null), new Function1() { // from class: o.dFv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C13284dFq.OLrzqt(z, this, obj, str2, (android.os.Bundle) obj2);
                }
            }, z ? new Function1() { // from class: o.dFB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C13284dFq.EZpvd(this.AEQbTJ, obj, str2, (NewCallbackBean) obj2);
                }
            } : null, null, 32, null);
        }
    }

    public static final Unit OLrzqt(boolean z, C13284dFq c13284dFq, java.lang.Object obj, java.lang.String str, android.os.Bundle bundle) {
        ActionBar actionBar;
        if (!z) {
            if (bundle == null || bundle.getInt("result") == 0) {
                ActionBar actionBar2 = c13284dFq.valueOf;
                if (actionBar2 != null) {
                    actionBar2.OLrzqt(C33129mqd.gEmmrt(obj), "", str);
                }
            } else {
                ActionBar actionBar3 = c13284dFq.valueOf;
                if (actionBar3 != null) {
                    actionBar3.EZpvd(C33129mqd.gEmmrt(obj), bundle, str);
                }
            }
        } else if ((bundle == null || bundle.getInt("result") == 0) && (actionBar = c13284dFq.valueOf) != null) {
            actionBar.OLrzqt(C33129mqd.gEmmrt(obj), "", str);
        }
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX EZpvd(C13284dFq c13284dFq, java.lang.Object obj, java.lang.String str, NewCallbackBean newCallbackBean) throws JSONException {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        JSONObject jSONObject = new JSONObject(new JSONObject(newCallbackBean.getBody().toString()).optString("signedTx"));
        java.lang.String string = jSONObject.getString("tx_bytes");
        java.lang.String string2 = jSONObject.getJSONArray("signatures").get(0).toString();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("tx_bytes", string);
        bundle.putString("signature", string2);
        ActionBar actionBar = c13284dFq.valueOf;
        if (actionBar != null) {
            actionBar.EZpvd(C33129mqd.gEmmrt(obj), bundle, str == null ? "" : str);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, "", null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public final void EZpvd(java.lang.Object obj, JSONObject jSONObject, java.lang.String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = OLrzqt();
        linkedHashMap.put("from", interfaceC9738bbJOLrzqt != null ? interfaceC9738bbJOLrzqt.EZpvd(784L) : null);
        java.lang.String string = jSONObject.has("txBytes") ? jSONObject.getString("txBytes") : "";
        linkedHashMap.put("txSerialize", jSONObject.has("txSerialize") ? jSONObject.getString("txSerialize") : "");
        linkedHashMap.put("txBytes", string);
        java.lang.String json = new Gson().toJson(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(json, "");
        operatorConstractInteraction$default(this, obj, json, str, false, 8, null);
    }

    public final void copydefault(final java.lang.Object obj, java.lang.String str) {
        java.lang.String strDbNXlk;
        java.lang.String strEZpvd;
        FragmentActivity fragmentActivity = EZpvd().get();
        if (fragmentActivity != null) {
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = OLrzqt();
            AEQbTJ(784L, (interfaceC9738bbJOLrzqt == null || (strEZpvd = interfaceC9738bbJOLrzqt.EZpvd(784L)) == null) ? "" : strEZpvd, OLrzqt(), false);
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt2 = OLrzqt();
            dFN.startSignDappWithReport$default(DappSignArgs.SIGN_PERSONALMESSAGE, fragmentActivity, new DappSignArgs((interfaceC9738bbJOLrzqt2 == null || (strDbNXlk = interfaceC9738bbJOLrzqt2.DbNXlk()) == null) ? "" : strDbNXlk, C33129mqd.gEmmrt(784L), AEQbTJ(), str, true, 2, "dapp", null, false, false, DappSignArgs.SIGN_PERSONALMESSAGE, null, null, null, null, false, null, 129920, null), new Function1() { // from class: o.dFC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C13284dFq.KWHzl(this.EZpvd, obj, (android.os.Bundle) obj2);
                }
            }, null, 16, null);
        }
    }

    public static final Unit KWHzl(C13284dFq c13284dFq, java.lang.Object obj, android.os.Bundle bundle) {
        if (bundle == null || bundle.getInt("result") == 0) {
            ActionBar actionBar = c13284dFq.valueOf;
            if (actionBar != null) {
                actionBar.OLrzqt(C33129mqd.gEmmrt(obj), C33070mpX.AYXKKw(dLX.Dialog.AxsJAY), DappSignArgs.SIGN_PERSONALMESSAGE);
            }
        } else {
            ActionBar actionBar2 = c13284dFq.valueOf;
            if (actionBar2 != null) {
                actionBar2.EZpvd(C33129mqd.gEmmrt(obj), bundle, DappSignArgs.SIGN_PERSONALMESSAGE);
            }
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final java.lang.Object obj, final JSONObject jSONObject) {
        java.lang.String strDbNXlk;
        java.lang.String strEZpvd;
        java.lang.String string = jSONObject.has("message") ? jSONObject.getString("message") : "";
        FragmentActivity fragmentActivity = EZpvd().get();
        if (fragmentActivity != null) {
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = OLrzqt();
            AEQbTJ(784L, (interfaceC9738bbJOLrzqt == null || (strEZpvd = interfaceC9738bbJOLrzqt.EZpvd(784L)) == null) ? "" : strEZpvd, OLrzqt(), false);
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt2 = OLrzqt();
            if (interfaceC9738bbJOLrzqt2 == null || (strDbNXlk = interfaceC9738bbJOLrzqt2.DbNXlk()) == null) {
                strDbNXlk = "";
            }
            dFN.startSignDappWithReport$default("signMessage", fragmentActivity, new DappSignArgs(strDbNXlk, C33129mqd.gEmmrt(784L), AEQbTJ(), string, false, 2, "dapp", null, false, false, null, null, null, null, null, false, null, 130944, null), new Function1() { // from class: o.dFD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C13284dFq.OLrzqt(jSONObject, this, obj, (android.os.Bundle) obj2);
                }
            }, null, 16, null);
        }
    }

    public static final Unit OLrzqt(JSONObject jSONObject, C13284dFq c13284dFq, java.lang.Object obj, android.os.Bundle bundle) throws JSONException {
        if (jSONObject.has("messageBytes")) {
            java.lang.String string = jSONObject.getString("messageBytes");
            if (bundle != null) {
                bundle.putString("messageBytes", string);
            }
        }
        if (bundle == null || bundle.getInt("result") == 0) {
            ActionBar actionBar = c13284dFq.valueOf;
            if (actionBar != null) {
                actionBar.OLrzqt(C33129mqd.gEmmrt(obj), C33070mpX.AYXKKw(dLX.Dialog.AxsJAY), "signMessage");
            }
        } else {
            ActionBar actionBar2 = c13284dFq.valueOf;
            if (actionBar2 != null) {
                actionBar2.EZpvd(C33129mqd.gEmmrt(obj), bundle, "signMessage");
            }
        }
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(long j, java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, boolean z) {
        ActionBar actionBar = this.valueOf;
        if (actionBar != null) {
            actionBar.copydefault(j, str, interfaceC9738bbJ, z);
        }
    }
}
