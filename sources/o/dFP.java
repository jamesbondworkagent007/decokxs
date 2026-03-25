package o;

import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.FragmentActivity;
import com.amplifyframework.core.model.ModelIdentifier;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.NewSignCallbackBean;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.TronSignMethodVersion;
import com.okinc.business.defi.api.bean.TrxDappSignData;
import com.okinc.business.defi.dapp.net.OKCheckLeveldappInfo;
import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.WalletDappInteractionBizService;
import com.okinc.wallet.api.bean.DappSupportCheck;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.json.JsonObject;
import o.dES;
import o.dLX;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class dFP {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final Activity AEQbTJ;
    public StateListAnimator AYXKKw;
    public JSONObject AhwBna;
    public WeakReference<dES> AkhnZx;
    public InterfaceC9738bbJ DbNXlk;
    public WeakReference<FragmentActivity> EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public InterfaceC9738bbJ copydefault;
    public PlatformItem djBIcL;
    public Function0<java.lang.Boolean> gEmmrt;
    public final InterfaceC56387yDm valueOf;

    public interface Activity {
        void AEQbTJ(long j, @NotNull java.lang.String str);

        void EZpvd(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2);

        void OLrzqt(long j, @NotNull java.lang.String str);

        void OLrzqt(long j, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, boolean z);
    }

    public interface StateListAnimator {
        void AEQbTJ(android.os.Bundle bundle);

        void EZpvd(android.os.Bundle bundle);

        void EZpvd(java.lang.String str);

        void KWHzl(android.os.Bundle bundle);

        void OLrzqt(android.os.Bundle bundle);

        void copydefault(android.os.Bundle bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull WeakReference<FragmentActivity> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.EZpvd = weakReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull WeakReference<dES> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.AkhnZx = weakReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(InterfaceC9738bbJ interfaceC9738bbJ) {
        this.copydefault = interfaceC9738bbJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(PlatformItem platformItem) {
        this.djBIcL = platformItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
        this.DbNXlk = interfaceC9738bbJ;
    }

    public dFP(@NotNull WeakReference<FragmentActivity> weakReference, @NotNull Activity activity, StateListAnimator stateListAnimator, Function0<java.lang.Boolean> function0, @NotNull WeakReference<dES> weakReference2) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(weakReference2, "");
        this.EZpvd = weakReference;
        this.AEQbTJ = activity;
        this.AYXKKw = stateListAnimator;
        this.gEmmrt = function0;
        this.AkhnZx = weakReference2;
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.dFX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return dFP.copydefault();
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.dFU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return dFP.AEQbTJ();
            }
        });
    }

    public final C15059dxF AhwBna() {
        return (C15059dxF) this.valueOf.getValue();
    }

    public static final C15059dxF copydefault() {
        return new C15059dxF();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dFP.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final PlatformItem AYXKKw() {
        java.lang.String url;
        C13241dEa mWebView;
        java.lang.String logo;
        PlatformItem platformItem;
        java.lang.String mTitle;
        java.lang.String mTitle2;
        C13241dEa mWebView2;
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
        if (dappTabDataOLrzqt == null || (mWebView2 = dappTabDataOLrzqt.getMWebView()) == null || (url = mWebView2.fARcdN()) == null) {
            DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
            url = (dappTabDataOLrzqt2 == null || (mWebView = dappTabDataOLrzqt2.getMWebView()) == null) ? null : mWebView.getUrl();
        }
        PlatformItem platformItem2 = this.djBIcL;
        java.lang.String str = "";
        if (platformItem2 == null) {
            java.lang.String strAEQbTJ = C14923duc.EZpvd.AEQbTJ(url);
            java.lang.String str2 = url == null ? "" : url;
            DappTabData dappTabDataOLrzqt3 = c15112dyF.OLrzqt();
            this.djBIcL = new PlatformItem(0L, (dappTabDataOLrzqt3 == null || (mTitle2 = dappTabDataOLrzqt3.getMTitle()) == null) ? "" : mTitle2, strAEQbTJ, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, str2, (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16121, (DefaultConstructorMarker) null);
        } else {
            if (platformItem2 != null) {
                platformItem2.setUrl(url == null ? "" : url);
            }
            PlatformItem platformItem3 = this.djBIcL;
            if (platformItem3 != null) {
                DappTabData dappTabDataOLrzqt4 = c15112dyF.OLrzqt();
                if (dappTabDataOLrzqt4 != null && (mTitle = dappTabDataOLrzqt4.getMTitle()) != null) {
                    str = mTitle;
                }
                platformItem3.setPlatform(str);
            }
            PlatformItem platformItem4 = this.djBIcL;
            if (platformItem4 != null && (logo = platformItem4.getLogo()) != null && logo.length() == 0 && (platformItem = this.djBIcL) != null) {
                platformItem.setLogo(C14923duc.EZpvd.AEQbTJ(url));
            }
        }
        return this.djBIcL;
    }

    public final java.lang.Long EZpvd() {
        return (java.lang.Long) this.KWHzl.getValue();
    }

    public static final java.lang.Long AEQbTJ() {
        InterfaceC9731bbC interfaceC9731bbCGEmmrt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().gEmmrt();
        if (interfaceC9731bbCGEmmrt != null) {
            return java.lang.Long.valueOf(interfaceC9731bbCGEmmrt.fetchVPNInfo());
        }
        return null;
    }

    @android.webkit.JavascriptInterface
    public final void postMessage(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        FragmentActivity fragmentActivity = this.EZpvd.get();
        if (fragmentActivity != null) {
            fragmentActivity.runOnUiThread(new java.lang.Runnable() { // from class: o.dGA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    dFP.AEQbTJ(this.copydefault, str);
                }
            });
        }
    }

    public static final void AEQbTJ(final dFP dfp, final java.lang.String str) {
        try {
            dDN ddn = dDN.copydefault;
            DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
            ddn.AEQbTJ(dappTabDataOLrzqt != null ? dappTabDataOLrzqt.getMWebView() : null, new Function1() { // from class: o.dGz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dFP.AEQbTJ(this.copydefault, str, (java.lang.String) obj);
                }
            });
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("dappwebview", "tronex", e);
        }
    }

    public static final Unit AEQbTJ(final dFP dfp, final java.lang.String str, final java.lang.String str2) {
        final FragmentActivity fragmentActivity = dfp.EZpvd.get();
        if (fragmentActivity != null) {
            fragmentActivity.runOnUiThread(new java.lang.Runnable() { // from class: o.dGu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    dFP.copydefault(fragmentActivity, str2, dfp, str);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(FragmentActivity fragmentActivity, java.lang.String str, final dFP dfp, final java.lang.String str2) {
        try {
            C14923duc.checkUrl$default(C14923duc.EZpvd, fragmentActivity, str, null, null, null, null, null, null, null, null, new yHO() { // from class: o.dGC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return dFP.EZpvd(this.copydefault, str2, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), (OKCheckLeveldappInfo) obj3);
                }
            }, PointerIconCompat.TYPE_GRAB, null);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("dappwebview", "tronex", e);
        }
    }

    public static final Unit EZpvd(dFP dfp, java.lang.String str, boolean z, boolean z2, OKCheckLeveldappInfo oKCheckLeveldappInfo) throws JSONException {
        dfp.EZpvd(str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(java.lang.Object obj, java.lang.Object obj2, java.lang.String str) {
        TronSignMethodVersion tronSignMethodVersion;
        boolean z;
        InterfaceC9738bbJ interfaceC9738bbJ;
        java.lang.String strDbNXlk;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "tron_sign_v2")) {
            tronSignMethodVersion = TronSignMethodVersion.V2;
        } else {
            tronSignMethodVersion = TronSignMethodVersion.V1;
        }
        TronSignMethodVersion tronSignMethodVersion2 = tronSignMethodVersion;
        FragmentActivity fragmentActivity = this.EZpvd.get();
        if (fragmentActivity != null) {
            InterfaceC9738bbJ interfaceC9738bbJ2 = this.DbNXlk;
            if (interfaceC9738bbJ2 != null) {
                Intrinsics.copydefault(obj, "");
                copydefault(((java.lang.Long) obj).longValue(), interfaceC9738bbJ2, EZpvd(), java.lang.Boolean.FALSE);
            }
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            if (obj2 instanceof JSONObject) {
                booleanRef.element = true;
            } else {
                if (!(obj2 instanceof java.lang.String) || !C15113dyG.copydefault((java.lang.String) obj2)) {
                    z = true;
                    interfaceC9738bbJ = this.DbNXlk;
                    if (interfaceC9738bbJ != null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) {
                        strDbNXlk = "";
                    }
                    dFN.copydefault(str, fragmentActivity, new DappSignArgs(strDbNXlk, C33129mqd.gEmmrt(EZpvd()), AYXKKw(), obj2.toString(), true, 2, "dapp", null, false, false, null, null, null, null, tronSignMethodVersion2, z, null, 81664, null), (Function1<? super android.os.Bundle, Unit>) new Function1() { // from class: o.dGj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return dFP.KWHzl(this.copydefault, booleanRef, (android.os.Bundle) obj3);
                        }
                    }, (Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) null);
                }
                booleanRef.element = true;
            }
            z = false;
            interfaceC9738bbJ = this.DbNXlk;
            if (interfaceC9738bbJ != null) {
                strDbNXlk = "";
            }
            dFN.copydefault(str, fragmentActivity, new DappSignArgs(strDbNXlk, C33129mqd.gEmmrt(EZpvd()), AYXKKw(), obj2.toString(), true, 2, "dapp", null, false, false, null, null, null, null, tronSignMethodVersion2, z, null, 81664, null), (Function1<? super android.os.Bundle, Unit>) new Function1() { // from class: o.dGj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return dFP.KWHzl(this.copydefault, booleanRef, (android.os.Bundle) obj3);
                }
            }, (Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) null);
        }
    }

    public static final Unit KWHzl(dFP dfp, Ref.BooleanRef booleanRef, android.os.Bundle bundle) {
        java.util.List<java.lang.String> signature;
        StateListAnimator stateListAnimator;
        if (bundle == null) {
            StateListAnimator stateListAnimator2 = dfp.AYXKKw;
            if (stateListAnimator2 != null) {
                stateListAnimator2.OLrzqt(null);
            }
        } else if (booleanRef.element) {
            StateListAnimator stateListAnimator3 = dfp.AYXKKw;
            if (stateListAnimator3 != null) {
                stateListAnimator3.AEQbTJ(bundle);
            }
        } else {
            java.lang.String string = bundle.getString("data");
            if (string == null) {
                string = "";
            }
            TrxDappSignData trxDappSignData = (TrxDappSignData) new Gson().fromJson(string, TrxDappSignData.class);
            if (trxDappSignData != null && (signature = trxDappSignData.getSignature()) != null && signature.size() == 1 && (stateListAnimator = dfp.AYXKKw) != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                java.util.List<java.lang.String> signature2 = trxDappSignData.getSignature();
                Intrinsics.copydefault(signature2);
                bundle2.putString("data", ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + ((java.lang.Object) signature2.get(0)) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
                stateListAnimator.AEQbTJ(bundle2);
            }
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        java.lang.Object obj = jSONObject.get("id");
        if (C33129mqd.valueOf(obj) == 0) {
            return;
        }
        sendWalletResult$default(this, C33129mqd.valueOf(obj), null, null, 6, null);
        jSONObject.toString();
        java.lang.Object obj2 = jSONObject.get("name");
        if (Intrinsics.EZpvd(obj2, (java.lang.Object) "tron_requestAccounts")) {
            Intrinsics.copydefault(obj);
            AEQbTJ(obj);
            return;
        }
        if (Intrinsics.EZpvd(obj2, (java.lang.Object) "tron_sign")) {
            Intrinsics.copydefault(obj);
            java.lang.Object objOpt = jSONObject.opt("object");
            Intrinsics.checkNotNullExpressionValue(objOpt, "");
            OLrzqt(obj, objOpt, "tron_sign");
            return;
        }
        if (Intrinsics.EZpvd(obj2, (java.lang.Object) "tron_sign_v2")) {
            Intrinsics.copydefault(obj);
            java.lang.Object objOpt2 = jSONObject.opt("object");
            Intrinsics.checkNotNullExpressionValue(objOpt2, "");
            OLrzqt(obj, objOpt2, "tron_sign_v2");
            return;
        }
        if (Intrinsics.EZpvd(obj2, (java.lang.Object) "tron_sign_transaction")) {
            EZpvd(jSONObject, true);
            return;
        }
        if (Intrinsics.EZpvd(obj2, (java.lang.Object) "tron_sendRawTransaction")) {
            copydefault(jSONObject);
            return;
        }
        if (Intrinsics.EZpvd(obj2, (java.lang.Object) "sendRpcRequest")) {
            Intrinsics.copydefault(obj);
            java.lang.String strOptString = jSONObject.optString("url", "");
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            JSONObject jSONObject2 = jSONObject.getJSONObject("object");
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
            AEQbTJ(obj, strOptString, jSONObject2);
        }
    }

    public final void copydefault(@NotNull JSONObject jSONObject) throws JSONException {
        java.lang.String strDbNXlk;
        Intrinsics.checkNotNullParameter(jSONObject, "");
        java.lang.Object obj = jSONObject.get("id");
        this.AhwBna = jSONObject.getJSONObject("object");
        InterfaceC9738bbJ interfaceC9738bbJ = this.DbNXlk;
        if (interfaceC9738bbJ != null) {
            Intrinsics.copydefault(obj, "");
            copydefault(((java.lang.Long) obj).longValue(), interfaceC9738bbJ, EZpvd(), java.lang.Boolean.FALSE);
        }
        InterfaceC9738bbJ interfaceC9738bbJ2 = this.DbNXlk;
        java.lang.String str = (interfaceC9738bbJ2 == null || (strDbNXlk = interfaceC9738bbJ2.DbNXlk()) == null) ? "" : strDbNXlk;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(EZpvd());
        PlatformItem platformItemAYXKKw = AYXKKw();
        java.lang.String strValueOf = java.lang.String.valueOf(this.AhwBna);
        Gson gson = new Gson();
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        PlatformItem platformItemAYXKKw2 = AYXKKw();
        pairArr[0] = C56390yDp.OLrzqt("dappUrl", platformItemAYXKKw2 != null ? platformItemAYXKKw2.getUrl() : null);
        pairArr[1] = C56390yDp.OLrzqt("signDataJson", C33129mqd.gEmmrt(this.AhwBna));
        C33024moe.subscribeOnIO$default(((WalletDappInteractionBizService) C43251rlk.copydefault(WalletDappInteractionBizService.class)).EZpvd(new DappInteractionArgs(str, null, strGEmmrt, platformItemAYXKKw, strValueOf, null, "dapp", 2, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, null, null, 6, gson.toJson(C56424yEw.gEmmrt(pairArr)), null, null, null, null, -201326814, null)), new Function1() { // from class: o.dGG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return dFP.KWHzl((java.lang.Throwable) obj2);
            }
        }, (Function0) null, new Function1() { // from class: o.dGH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return dFP.EZpvd(this.copydefault, (WalletDappInteractionBizService.SubmitResult) obj2);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit EZpvd(dFP dfp, WalletDappInteractionBizService.SubmitResult submitResult) {
        Intrinsics.checkNotNullParameter(submitResult, "");
        StateListAnimator stateListAnimator = dfp.AYXKKw;
        if (stateListAnimator != null) {
            stateListAnimator.EZpvd(submitResult.getTronData());
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull JSONObject jSONObject, boolean z) throws JSONException {
        java.lang.String strDbNXlk;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        java.lang.String string = "";
        Intrinsics.checkNotNullParameter(jSONObject, "");
        java.lang.Object obj = jSONObject.get("id");
        this.AhwBna = jSONObject.getJSONObject("object");
        InterfaceC9738bbJ interfaceC9738bbJ = this.DbNXlk;
        if (interfaceC9738bbJ != null) {
            Intrinsics.copydefault(obj, "");
            copydefault(((java.lang.Long) obj).longValue(), interfaceC9738bbJ, EZpvd(), java.lang.Boolean.FALSE);
        }
        JSONObject jSONObject5 = this.AhwBna;
        JSONObject jSONObject6 = (jSONObject5 == null || (jSONObject2 = jSONObject5.getJSONObject("raw_data")) == null || (jSONArray = jSONObject2.getJSONArray("contract")) == null || (jSONObject3 = jSONArray.getJSONObject(0)) == null || (jSONObject4 = jSONObject3.getJSONObject("parameter")) == null) ? null : jSONObject4.getJSONObject("value");
        InterfaceC9738bbJ interfaceC9738bbJ2 = this.DbNXlk;
        java.lang.String str = (interfaceC9738bbJ2 == null || (strDbNXlk = interfaceC9738bbJ2.DbNXlk()) == null) ? "" : strDbNXlk;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(EZpvd());
        PlatformItem platformItemAYXKKw = AYXKKw();
        java.lang.String strValueOf = java.lang.String.valueOf(this.AhwBna);
        Gson gson = new Gson();
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        PlatformItem platformItemAYXKKw2 = AYXKKw();
        pairArr[0] = C56390yDp.OLrzqt("dappUrl", platformItemAYXKKw2 != null ? platformItemAYXKKw2.getUrl() : null);
        pairArr[1] = C56390yDp.OLrzqt("signDataJson", C33129mqd.gEmmrt(this.AhwBna));
        DappInteractionArgs dappInteractionArgs = new DappInteractionArgs(str, null, strGEmmrt, platformItemAYXKKw, strValueOf, null, "dapp", 2, null, null, null, null, false, false, null, z, null, null, null, null, null, null, null, null, null, null, 6, gson.toJson(C56424yEw.gEmmrt(pairArr)), null, null, null, null, -201359614, null);
        if (jSONObject6 != null && jSONObject6.has("data")) {
            string = jSONObject6 != null ? jSONObject6.getString("data") : null;
        }
        if (string == null || string.length() == 0) {
            FragmentActivity fragmentActivity = this.EZpvd.get();
            if (fragmentActivity != null) {
                dFN.startTransferDappWithReport$default("tron_sign_transaction", fragmentActivity, dappInteractionArgs, new Function1() { // from class: o.dGq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return dFP.AEQbTJ(this.OLrzqt, (android.os.Bundle) obj2);
                    }
                }, new Function1() { // from class: o.dGo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return dFP.OLrzqt((NewCallbackBean) obj2);
                    }
                }, null, 32, null);
                return;
            }
            return;
        }
        if (C59449zhJ.startsWith$default(string, "0x095ea7b3", false, 2, null) || C59449zhJ.startsWith$default(string, "095ea7b3", false, 2, null)) {
            FragmentActivity fragmentActivity2 = this.EZpvd.get();
            if (fragmentActivity2 != null) {
                dFN.KWHzl("tron_sign_transaction", fragmentActivity2, dappInteractionArgs, new Function1() { // from class: o.dGr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return dFP.copydefault(this.EZpvd, (android.os.Bundle) obj2);
                    }
                }, new Function1() { // from class: o.dGt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return dFP.copydefault((NewCallbackBean) obj2);
                    }
                });
                return;
            }
            return;
        }
        FragmentActivity fragmentActivity3 = this.EZpvd.get();
        if (fragmentActivity3 != null) {
            dFN.startContractInteractionWithReport$default("tron_sign_transaction", fragmentActivity3, dappInteractionArgs, new Function1() { // from class: o.dGv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return dFP.AYXKKw(this.copydefault, (android.os.Bundle) obj2);
                }
            }, new Function1() { // from class: o.dGw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return dFP.valueOf((NewCallbackBean) obj2);
                }
            }, null, 32, null);
        }
    }

    public static final Unit AEQbTJ(dFP dfp, android.os.Bundle bundle) {
        if (bundle == null) {
            StateListAnimator stateListAnimator = dfp.AYXKKw;
            if (stateListAnimator != null) {
                stateListAnimator.OLrzqt(null);
            }
        } else {
            StateListAnimator stateListAnimator2 = dfp.AYXKKw;
            if (stateListAnimator2 != null) {
                stateListAnimator2.KWHzl(bundle);
            }
        }
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX OLrzqt(NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, "", null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final Unit copydefault(dFP dfp, android.os.Bundle bundle) {
        if (bundle == null) {
            StateListAnimator stateListAnimator = dfp.AYXKKw;
            if (stateListAnimator != null) {
                stateListAnimator.OLrzqt(null);
            }
        } else {
            StateListAnimator stateListAnimator2 = dfp.AYXKKw;
            if (stateListAnimator2 != null) {
                stateListAnimator2.copydefault(bundle);
            }
        }
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX copydefault(NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, "", null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final Unit AYXKKw(dFP dfp, android.os.Bundle bundle) {
        if (bundle == null || bundle.getInt("result") == 0) {
            StateListAnimator stateListAnimator = dfp.AYXKKw;
            if (stateListAnimator != null) {
                stateListAnimator.OLrzqt(bundle);
            }
        } else {
            StateListAnimator stateListAnimator2 = dfp.AYXKKw;
            if (stateListAnimator2 != null) {
                stateListAnimator2.EZpvd(bundle);
            }
        }
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX valueOf(NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, "", null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static /* synthetic */ void requestAccounts$default(dFP dfp, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = -1L;
        }
        dfp.AEQbTJ(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(@NotNull java.lang.Object obj) {
        java.lang.Long lValueOf;
        Intrinsics.checkNotNullParameter(obj, "");
        java.lang.Long lEZpvd = EZpvd();
        if (lEZpvd != null) {
            InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault().EZpvd(lEZpvd.longValue(), true);
            lValueOf = interfaceC9731bbCEZpvd != null ? java.lang.Long.valueOf(interfaceC9731bbCEZpvd.AhwBna()) : null;
        }
        if (lValueOf != null) {
            KWHzl(((java.lang.Long) obj).longValue(), lValueOf.longValue());
        }
    }

    public static /* synthetic */ void getWalletByNetWork$default(dFP dfp, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        dfp.KWHzl(j, j2);
    }

    public final void KWHzl(final long j, long j2) {
        if (C14923duc.EZpvd.zsXlph()) {
            EZpvd(j, j2);
        } else if (j != -1) {
            KWHzl(new Function0() { // from class: o.dGy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return dFP.EZpvd(this.EZpvd, j);
                }
            });
        }
    }

    public static final Unit EZpvd(final dFP dfp, final long j) {
        dES des = dfp.AkhnZx.get();
        if (des != null) {
            des.AEQbTJ(null, new Function2() { // from class: o.dGx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return dFP.AEQbTJ(this.copydefault, j, (InterfaceC9738bbJ) obj, (java.lang.Long) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(dFP dfp, long j, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        InterfaceC9738bbJ interfaceC9738bbJ2 = dfp.DbNXlk;
        if (interfaceC9738bbJ2 == null) {
            dfp.OLrzqt(j, "");
        } else {
            dfp.copydefault(j, interfaceC9738bbJ2, l, java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getWalletByNetWorkInner$default(dFP dfp, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        dfp.EZpvd(j, j2);
    }

    public final void EZpvd(final long j, final long j2) {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(1);
        final Function1 function1 = new Function1() { // from class: o.dFY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dFP.AEQbTJ(this.KWHzl, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.dFW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dFP.isConnected(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dGc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dFP.KWHzl(this.EZpvd, j, j2, (InterfaceC9738bbJ) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.dGb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dFP.values(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.dGd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dFP.KWHzl(this.AEQbTJ, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtOLrzqt2.copydefault(new InterfaceC58229yxO() { // from class: o.dFZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dFP.DbNXlk(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.dGa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dFP.KWHzl(j, this, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dGe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dFP.fARcdN(function14, obj);
            }
        };
        final Function1 function15 = new Function1() { // from class: o.dGg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dFP.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dGh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dFP.AuCTel(function15, obj);
            }
        });
    }

    public static final InterfaceC58261yxu isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(dFP dfp, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        InterfaceC9738bbJ interfaceC9738bbJ = dfp.copydefault;
        if (interfaceC9738bbJ != null) {
            AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(interfaceC9738bbJ);
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            return abstractC58260yxtCopydefault;
        }
        return ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().KWHzl();
    }

    public static final InterfaceC58261yxu values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(dFP dfp, long j, long j2, InterfaceC9738bbJ interfaceC9738bbJ) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        if (C14923duc.EZpvd.AEQbTJ(interfaceC9738bbJ, dfp.EZpvd()) && interfaceC9738bbJ.zLjUOn()) {
            if (interfaceC9738bbJ.ORxRYg()) {
                dfp.KWHzl(interfaceC9738bbJ, j, j2);
                throw new java.lang.Exception(TtmlNode.END);
            }
            dfp.copydefault = interfaceC9738bbJ;
            dfp.DbNXlk = interfaceC9738bbJ;
            dfp.copydefault(j, interfaceC9738bbJ, dfp.EZpvd(), java.lang.Boolean.TRUE);
            throw new java.lang.Exception(TtmlNode.END);
        }
        dfp.OLrzqt(j, C33070mpX.AYXKKw(dLX.Dialog.QSBOWP));
        return ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().gEmmrt();
    }

    public static final java.lang.Boolean DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(long j, final dFP dfp, java.lang.Boolean bool) {
        if (j != -1) {
            if (bool.booleanValue()) {
                dES des = dfp.AkhnZx.get();
                if (des != null) {
                    dES.StateListAnimator.selectWallet$default(des, null, null, 2, null);
                }
            } else {
                FragmentActivity fragmentActivity = dfp.EZpvd.get();
                if (fragmentActivity != null) {
                    C14923duc c14923duc = C14923duc.EZpvd;
                    kotlin.Pair<java.lang.String, java.lang.String> pairUzCIH = c14923duc.uzCIH(dfp.EZpvd());
                    androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    C14923duc.showConnectWalletDialog$default(c14923duc, pairUzCIH, supportFragmentManager, new Function0() { // from class: o.dGp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return dFP.EZpvd(this.copydefault);
                        }
                    }, null, 8, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(dFP dfp) {
        dES des = dfp.AkhnZx.get();
        if (des != null) {
            dES.StateListAnimator.selectWallet$default(des, null, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void KWHzl(final InterfaceC9738bbJ interfaceC9738bbJ, final long j, long j2) {
        final FragmentActivity fragmentActivity = this.EZpvd.get();
        if (fragmentActivity != null) {
            ((MpcWalletService) C43248rlh.KWHzl.AEQbTJ(MpcWalletService.class)).copydefault(interfaceC9738bbJ, fragmentActivity, new Function1() { // from class: o.dGE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dFP.copydefault(fragmentActivity, this, j, interfaceC9738bbJ, (MpcWalletService.MpcWalletAbleStatus) obj);
                }
            });
        }
    }

    public static final Unit copydefault(FragmentActivity fragmentActivity, final dFP dfp, final long j, final InterfaceC9738bbJ interfaceC9738bbJ, MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus) {
        java.lang.String mUrl;
        Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
        if (mpcWalletAbleStatus == MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNormal) {
            MpcWalletService mpcWalletService = (MpcWalletService) C43248rlh.KWHzl.AEQbTJ(MpcWalletService.class);
            DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
            if (dappTabDataOLrzqt == null || (mUrl = dappTabDataOLrzqt.getMUrl()) == null) {
                mUrl = "";
            }
            AbstractC58185ywX<DappSupportCheck> abstractC58185ywXAhwBna = mpcWalletService.j_(mUrl).AhwBna();
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAhwBna, "");
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAhwBna, fragmentActivity);
            final Function1 function1 = new Function1() { // from class: o.dFT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dFP.AEQbTJ(this.copydefault, j, interfaceC9738bbJ, (DappSupportCheck) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dFV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dFP.AkhnZx(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dGf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dFP.EZpvd(this.copydefault, j, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dGs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dFP.fetchVPNInfo(function12, obj);
                }
            });
        } else {
            dfp.OLrzqt(j, C33070mpX.AYXKKw(dLX.Dialog.QSBOWP));
            dfp.gEmmrt();
        }
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(dFP dfp, long j, InterfaceC9738bbJ interfaceC9738bbJ, DappSupportCheck dappSupportCheck) {
        if (!dappSupportCheck.getMpcResult()) {
            dfp.OLrzqt(j, C33070mpX.AYXKKw(dLX.Dialog.QSBOWP));
            dfp.gEmmrt();
        } else {
            dfp.copydefault = interfaceC9738bbJ;
            dfp.DbNXlk = interfaceC9738bbJ;
            dfp.copydefault(j, interfaceC9738bbJ, dfp.EZpvd(), java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(dFP dfp, long j, java.lang.Throwable th) {
        dfp.OLrzqt(j, C33070mpX.AYXKKw(dLX.Dialog.QSBOWP));
        dfp.gEmmrt();
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        AbstractC58260yxt<java.util.List<InterfaceC9738bbJ>> abstractC58260yxtGEmmrt = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().gEmmrt();
        final Function1 function1 = new Function1() { // from class: o.dGB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dFP.OLrzqt(this.copydefault, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtGEmmrt.copydefault(new InterfaceC58229yxO() { // from class: o.dGF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dFP.fJNWhG(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dGD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dFP.copydefault(this.KWHzl, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dGM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dFP.fIwbmz(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.dGJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dFP.AhwBna((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dGI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dFP.ejfBZ(function13, obj);
            }
        });
    }

    public static final java.lang.Boolean fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final dFP dfp, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            dES des = dfp.AkhnZx.get();
            if (des != null) {
                dES.StateListAnimator.selectWallet$default(des, null, null, 2, null);
            }
        } else {
            FragmentActivity fragmentActivity = dfp.EZpvd.get();
            if (fragmentActivity != null) {
                C14923duc c14923duc = C14923duc.EZpvd;
                kotlin.Pair<java.lang.String, java.lang.String> pairUzCIH = c14923duc.uzCIH(dfp.EZpvd());
                androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                C14923duc.showConnectWalletDialog$default(c14923duc, pairUzCIH, supportFragmentManager, new Function0() { // from class: o.dGk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return dFP.OLrzqt(this.AEQbTJ);
                    }
                }, null, 8, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(dFP dfp) {
        dES des = dfp.AkhnZx.get();
        if (des != null) {
            dES.StateListAnimator.selectWallet$default(des, null, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static /* synthetic */ void refreshWebview$default(dFP dfp, long j, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        dfp.copydefault(j, interfaceC9738bbJ, l, bool);
    }

    public final void copydefault(long j, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l, java.lang.Boolean bool) {
        java.lang.String strEZpvd;
        if (l != null) {
            l.longValue();
            if (interfaceC9738bbJ == null || (strEZpvd = interfaceC9738bbJ.EZpvd(l.longValue())) == null) {
                strEZpvd = "";
            }
            java.lang.String str = strEZpvd;
            if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
                this.AEQbTJ.OLrzqt(j, str);
            }
            if (j != -1) {
                this.AEQbTJ.OLrzqt(l.longValue(), str, interfaceC9738bbJ, false);
            }
        }
    }

    public static /* synthetic */ void sendWalletResult$default(dFP dfp, long j, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        dfp.KWHzl(j, str, str2);
    }

    public final void KWHzl(long j, java.lang.String str, java.lang.String str2) {
        this.AEQbTJ.EZpvd(j, str, str2);
    }

    public final void OLrzqt(long j, java.lang.String str) {
        this.AEQbTJ.AEQbTJ(j, str);
    }

    public final void KWHzl(final Function0<Unit> function0) {
        final FragmentActivity fragmentActivity;
        Function0<java.lang.Boolean> function02 = this.gEmmrt;
        if ((function02 == null || function02.invoke().booleanValue()) && (fragmentActivity = this.EZpvd.get()) != null) {
            C14923duc c14923duc = C14923duc.EZpvd;
            kotlin.Pair<java.lang.String, java.lang.String> pairAuCTel = c14923duc.AuCTel();
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            C14923duc.showConnectWalletDialog$default(c14923duc, pairAuCTel, supportFragmentManager, new Function0() { // from class: o.dGi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return dFP.EZpvd(fragmentActivity, function0);
                }
            }, null, 8, null);
        }
    }

    public static final Unit EZpvd(FragmentActivity fragmentActivity, Function0 function0) {
        if (!fragmentActivity.isDestroyed()) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Type inference failed for: r12v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(final java.lang.Object obj, java.lang.String str, final JSONObject jSONObject) {
        C13241dEa mWebView;
        ?? KWHzl;
        C13241dEa mWebView2;
        java.util.HashMap<java.lang.Long, java.lang.String> mapQOLQEE;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
        if (dappTabDataOLrzqt == null || (mWebView2 = dappTabDataOLrzqt.getMWebView()) == null || (mapQOLQEE = mWebView2.QOLQEE()) == null) {
            DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt2 == null || (mWebView = dappTabDataOLrzqt2.getMWebView()) == null) {
                KWHzl = dBW.Companion.KWHzl();
            } else {
                java.lang.String strZsXlph = mWebView.zsXlph();
                KWHzl = strZsXlph;
                if (strZsXlph == null) {
                }
            }
        } else {
            java.lang.String str2 = mapQOLQEE.get(EZpvd());
            KWHzl = str2;
            if (str2 == null) {
            }
        }
        objectRef.element = KWHzl;
        if (str != null) {
            if (!C59449zhJ.endsWith$default(KWHzl, "/", false, 2, null) && C59449zhJ.startsWith$default(str, "/", false, 2, null)) {
                objectRef.element = objectRef.element + str;
            } else {
                objectRef.element = objectRef.element + "/" + str;
            }
        }
        C15059dxF c15059dxFAhwBna = AhwBna();
        java.lang.String str3 = (java.lang.String) objectRef.element;
        java.lang.String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        C33024moe.subscribeOnIO$default(c15059dxFAhwBna.OLrzqt(str3, string), new Function1() { // from class: o.dGm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return dFP.OLrzqt(this.copydefault, obj, objectRef, (java.lang.Throwable) obj2);
            }
        }, (Function0) null, new Function1() { // from class: o.dGn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return dFP.KWHzl(this.AEQbTJ, obj, (JsonObject) obj2);
            }
        }, 2, (java.lang.Object) null);
        FragmentActivity fragmentActivity = this.EZpvd.get();
        if (fragmentActivity != null) {
            fragmentActivity.runOnUiThread(new java.lang.Runnable() { // from class: o.dGl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    dFP.KWHzl(jSONObject);
                }
            });
        }
    }

    public static final Unit KWHzl(dFP dfp, java.lang.Object obj, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        dfp.OLrzqt(obj, jsonObject.toString(), false);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(dFP dfp, java.lang.Object obj, Ref.ObjectRef objectRef, java.lang.Throwable th) {
        JsonElement jsonElement;
        Intrinsics.checkNotNullParameter(th, "");
        dfp.OLrzqt(obj, java.lang.String.valueOf(C43422row.AEQbTJ(th)), true);
        java.lang.Object obj2 = objectRef.element;
        com.google.gson.JsonObject jsonObjectAEQbTJ = C43422row.AEQbTJ(th);
        java.lang.String asString = (jsonObjectAEQbTJ == null || (jsonElement = jsonObjectAEQbTJ.get("code")) == null) ? null : jsonElement.getAsString();
        pUU.copydefault("dappwebview", "tron rpc request failed:" + obj2 + " code:" + asString + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final void KWHzl(JSONObject jSONObject) {
        java.lang.String url;
        C13241dEa mWebView;
        C14742drG c14742drG = C14742drG.KWHzl;
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null || (url = mWebView.getUrl()) == null) {
            url = "";
        }
        java.lang.String strOptString = jSONObject.optString(FirebaseAnalytics.Param.METHOD);
        Intrinsics.checkNotNullExpressionValue(strOptString, "");
        c14742drG.EZpvd(url, strOptString, "195");
    }

    public final void OLrzqt(java.lang.Object obj, java.lang.String str, boolean z) {
        java.lang.String strFJNWhG;
        C13241dEa mWebView;
        if (z) {
            strFJNWhG = C59442zhC.fJNWhG("\n                        if (window.tronWeb) {\n                            window.tronWeb.sendRpcResponse(" + obj + ", \"\", `" + str + "`)\n                        }\n                    ");
        } else {
            strFJNWhG = C59442zhC.fJNWhG("\n                        if (window.tronWeb) {\n                            window.tronWeb.sendRpcResponse(" + obj + ", `" + str + "`)\n                        }\n                    ");
        }
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null) {
            return;
        }
        mWebView.evaluateJavascript(strFJNWhG, null);
    }

    public static final java.lang.Boolean KWHzl(dFP dfp, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (C14923duc.EZpvd.EZpvd((InterfaceC9738bbJ) obj, dfp.EZpvd())) {
                arrayList.add(obj);
            }
        }
        return java.lang.Boolean.valueOf(C33129mqd.KWHzl((java.util.Collection) arrayList));
    }

    public static final java.lang.Boolean OLrzqt(dFP dfp, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (C14923duc.EZpvd.EZpvd((InterfaceC9738bbJ) obj, dfp.EZpvd())) {
                arrayList.add(obj);
            }
        }
        return java.lang.Boolean.valueOf(C33129mqd.KWHzl((java.util.Collection) arrayList));
    }
}
