package o;

import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.amplifyframework.core.model.ModelIdentifier;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.AptosSignType;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.SignType;
import com.okinc.business.defi.api.constant.ChainRegisterStatus;
import com.okinc.business.defi.dapp.net.OKCheckLeveldappInfo;
import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.business.defi.dapp.webview.WebAppInterface$getCallsStatus$1;
import com.okinc.business.defi.dapp.webview.WebAppInterface$getCapabilityes$1;
import com.okinc.business.defi.dapp.webview.WebAppInterface$requestWallets$1$2$1;
import com.okinc.business.defi.dapp.webview.okxconnect.Address;
import com.okinc.business.defi.dapp.webview.okxconnect.Namespace;
import com.okinc.business.defi.dapp.webview.okxconnect.RequestWalletsParams;
import com.okinc.business.defi.dapp.webview.okxconnect.RequestWalletsResponse;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.core.arch.reactivex.ResponseFailedException;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.DappSupportCheck;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import io.reactivex.BackpressureStrategy;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.InterfaceC9737bbI;
import o.InterfaceC9738bbJ;
import o.dLX;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class dGQ {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public WeakReference<FragmentActivity> AEQbTJ;
    public InterfaceC9738bbJ AYXKKw;
    public java.lang.Long AhwBna;
    public Function0<java.lang.Boolean> AkhnZx;
    public InterfaceC9738bbJ AuCTel;
    public java.lang.Long DbNXlk;
    public NewCallbackBean EZpvd;
    public StateListAnimator KWHzl;
    public final java.lang.String copydefault;
    public PlatformItem djBIcL;
    public WeakReference<dES> fIwbmz;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public Activity isConnected;
    public int valueOf;
    public boolean values;

    public interface Activity {
        void AEQbTJ(android.os.Bundle bundle, long j);

        void KWHzl(android.os.Bundle bundle);

        void KWHzl(android.os.Bundle bundle, long j);

        void OLrzqt(android.os.Bundle bundle, long j);

        void copydefault(android.os.Bundle bundle, long j);

        void copydefault(@NotNull java.lang.Object obj, RequestWalletsResponse requestWalletsResponse);
    }

    public interface StateListAnimator {
        void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

        void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Long l);

        void copydefault(long j, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(PlatformItem platformItem) {
        this.djBIcL = platformItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.Long l) {
        this.DbNXlk = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.Long l) {
        this.AhwBna = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull WeakReference<FragmentActivity> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.AEQbTJ = weakReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull WeakReference<dES> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.fIwbmz = weakReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(InterfaceC9738bbJ interfaceC9738bbJ) {
        this.AuCTel = interfaceC9738bbJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
        this.AYXKKw = interfaceC9738bbJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC9738bbJ valueOf() {
        return this.AYXKKw;
    }

    public dGQ(@NotNull WeakReference<FragmentActivity> weakReference, StateListAnimator stateListAnimator, Activity activity, Function0<java.lang.Boolean> function0, int i, @NotNull WeakReference<dES> weakReference2) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        Intrinsics.checkNotNullParameter(weakReference2, "");
        this.AEQbTJ = weakReference;
        this.KWHzl = stateListAnimator;
        this.isConnected = activity;
        this.AkhnZx = function0;
        this.valueOf = i;
        this.fIwbmz = weakReference2;
        this.copydefault = dGQ.class.getName();
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.dHg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return dGQ.AEQbTJ();
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.dHf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return dGQ.OLrzqt();
            }
        });
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dGQ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final C15059dxF gEmmrt() {
        return (C15059dxF) this.gEmmrt.getValue();
    }

    public static final C15059dxF AEQbTJ() {
        return new C15059dxF();
    }

    public final java.util.HashMap<java.lang.String, java.util.ArrayList<InterfaceC58217yxC>> AkhnZx() {
        return (java.util.HashMap) this.fetchVPNInfo.getValue();
    }

    public static final java.util.HashMap OLrzqt() {
        return new java.util.HashMap();
    }

    public final PlatformItem AhwBna() {
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

    public final boolean KWHzl() {
        C13241dEa mWebView;
        dGQ dgqRcXXUw;
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null) {
            return false;
        }
        int i = this.valueOf;
        if (i == 0) {
            dgqRcXXUw = mWebView.RcXXUw();
        } else if (i == 3) {
            dgqRcXXUw = mWebView.gEmmrt();
        } else if (i == 5) {
            dgqRcXXUw = mWebView.AhwBna();
        } else {
            dgqRcXXUw = i != 6 ? null : mWebView.QVAiDq();
        }
        return Intrinsics.EZpvd(this, dgqRcXXUw);
    }

    @android.webkit.JavascriptInterface
    public final void postMessage(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        FragmentActivity fragmentActivity = this.AEQbTJ.get();
        if (fragmentActivity != null) {
            fragmentActivity.runOnUiThread(new java.lang.Runnable() { // from class: o.dIB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    dGQ.OLrzqt(this.KWHzl, str);
                }
            });
        }
    }

    public static final void OLrzqt(final dGQ dgq, final java.lang.String str) {
        try {
            dDN ddn = dDN.copydefault;
            DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
            ddn.AEQbTJ(dappTabDataOLrzqt != null ? dappTabDataOLrzqt.getMWebView() : null, new Function1() { // from class: o.dHO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dGQ.EZpvd(this.KWHzl, str, (java.lang.String) obj);
                }
            });
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("dappwebview", "appinterface", e);
        }
    }

    public static final Unit EZpvd(final dGQ dgq, final java.lang.String str, final java.lang.String str2) {
        final FragmentActivity fragmentActivity = dgq.AEQbTJ.get();
        if (fragmentActivity != null) {
            fragmentActivity.runOnUiThread(new java.lang.Runnable() { // from class: o.dHn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    dGQ.AEQbTJ(this.KWHzl, fragmentActivity, str2, str);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(final dGQ dgq, FragmentActivity fragmentActivity, java.lang.String str, final java.lang.String str2) {
        try {
            if (dgq.KWHzl()) {
                C14923duc.checkUrl$default(C14923duc.EZpvd, fragmentActivity, str, null, null, null, null, null, null, null, null, new yHO() { // from class: o.dHl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.yHO
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return dGQ.copydefault(this.KWHzl, str2, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), (OKCheckLeveldappInfo) obj3);
                    }
                }, PointerIconCompat.TYPE_GRAB, null);
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("dappwebview", "appinterface", e);
        }
    }

    public static final Unit copydefault(dGQ dgq, java.lang.String str, boolean z, boolean z2, OKCheckLeveldappInfo oKCheckLeveldappInfo) throws JSONException {
        dgq.OLrzqt(str);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v31, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v34, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v36, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v38, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v40, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v48, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v68, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v80, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v86, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v37, types: [T, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v29, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v34, types: [T, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.String] */
    public final void OLrzqt(@NotNull java.lang.String str) throws JSONException {
        C13241dEa mWebView;
        java.lang.String url;
        java.lang.String strDbNXlk;
        C13241dEa mWebView2;
        C13241dEa mWebView3;
        JsonObject body;
        JsonObject asJsonObject;
        JsonElement jsonElement;
        C13241dEa mWebView4;
        C13241dEa mWebView5;
        WeakReference<dES> weakReferenceAKErDB;
        dES des;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        C33495mxY.KWHzl(this.copydefault, str);
        final JSONObject jSONObject = new JSONObject(str);
        final java.lang.Object obj = jSONObject.get("id");
        if (C33129mqd.valueOf(obj) == 0) {
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new JSONObject();
        if (jSONObject.has("object")) {
            if (jSONObject.get("object") instanceof JSONObject) {
                java.lang.Object obj2 = jSONObject.get("object");
                Intrinsics.copydefault(obj2, "");
                objectRef.element = (JSONObject) obj2;
            } else if (jSONObject.get("object") instanceof java.lang.String) {
                java.lang.Object obj3 = jSONObject.get("object");
                Intrinsics.copydefault(obj3, "");
                objectRef.element = new JSONObject((java.lang.String) obj3);
            }
        }
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = "";
        if (this.valueOf == 6) {
            objectRef2.element = ((JSONObject) objectRef.element).toString();
        } else if (((JSONObject) objectRef.element).has("data")) {
            objectRef2.element = ((JSONObject) objectRef.element).getString("data");
        }
        java.lang.Object obj4 = jSONObject.get("name");
        if (Intrinsics.EZpvd(obj4, (java.lang.Object) "requestAccounts")) {
            Intrinsics.copydefault(obj);
            OLrzqt(obj, (JSONObject) objectRef.element);
            return;
        }
        if (Intrinsics.EZpvd(obj4, (java.lang.Object) "disconnect")) {
            C15112dyF c15112dyF = C15112dyF.AEQbTJ;
            DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt != null) {
                dappTabDataOLrzqt.setOkxConnect(false);
                Unit unit = Unit.INSTANCE;
            }
            DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt2 != null && (mWebView5 = dappTabDataOLrzqt2.getMWebView()) != null && (weakReferenceAKErDB = mWebView5.aKErDB()) != null && (des = weakReferenceAKErDB.get()) != null) {
                des.zuBGHE();
                Unit unit2 = Unit.INSTANCE;
            }
            DappTabData dappTabDataOLrzqt3 = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt3 == null || (mWebView4 = dappTabDataOLrzqt3.getMWebView()) == null) {
                return;
            }
            mWebView4.evaluateJavascript("window.okxwallet.sendResponse(" + obj + ")", null);
            Unit unit3 = Unit.INSTANCE;
            return;
        }
        if (Intrinsics.EZpvd(obj4, (java.lang.Object) "connectWallets")) {
            Intrinsics.copydefault(obj);
            gEmmrt(obj, (JSONObject) objectRef.element);
            return;
        }
        if (Intrinsics.EZpvd(obj4, (java.lang.Object) DappSignArgs.SIGN_PERSONALMESSAGE)) {
            EZpvd(DappSignArgs.SIGN_PERSONALMESSAGE, new Function0() { // from class: o.dHV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return dGQ.values(this.OLrzqt, obj, objectRef2);
                }
            });
            return;
        }
        if (Intrinsics.EZpvd(obj4, (java.lang.Object) "signMessage")) {
            if (this.valueOf != 3) {
                EZpvd("signMessage", new Function0() { // from class: o.dIi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return dGQ.djBIcL(this.EZpvd, obj, objectRef);
                    }
                });
                Unit unit4 = Unit.INSTANCE;
                return;
            }
            InterfaceC9738bbJ interfaceC9738bbJ = this.AuCTel;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (interfaceC9738bbJ != null ? interfaceC9738bbJ.OLrzqt(637L) : null))) {
                FragmentActivity fragmentActivity = this.AEQbTJ.get();
                if (fragmentActivity != null) {
                    C14923duc c14923duc = C14923duc.EZpvd;
                    java.lang.Long l = this.AhwBna;
                    c14923duc.EZpvd(fragmentActivity, l != null ? l.longValue() : 637L, 637L, new Function0() { // from class: o.dIj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return dGQ.gEmmrt(this.AEQbTJ, obj, objectRef);
                        }
                    }, new Function0() { // from class: o.dIh
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return dGQ.OLrzqt(this.OLrzqt, obj);
                        }
                    });
                    Unit unit5 = Unit.INSTANCE;
                    return;
                }
                return;
            }
            FragmentActivity fragmentActivity2 = this.AEQbTJ.get();
            C55326xho.toast$default(fragmentActivity2 != null ? fragmentActivity2.getString(dLX.Dialog.DaRZkR) : null, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        if (Intrinsics.EZpvd(obj4, (java.lang.Object) DappSignArgs.SIGN_TYPEDMESSAGE)) {
            EZpvd(DappSignArgs.SIGN_TYPEDMESSAGE, new Function0() { // from class: o.dIk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return dGQ.AYXKKw(this.EZpvd, obj, objectRef);
                }
            });
            return;
        }
        if (Intrinsics.EZpvd(obj4, (java.lang.Object) "sendTransaction")) {
            int i = this.valueOf;
            if (i == 3) {
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(obj);
                java.lang.String json = new Gson().toJson(objectRef.element);
                Intrinsics.checkNotNullExpressionValue(json, "");
                AEQbTJ(strGEmmrt, json, "sendTransaction_contract_interaction");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("tx", ((JSONObject) objectRef.element).optString("tx"));
                Activity activity = this.isConnected;
                if (activity != null) {
                    java.lang.Long l2 = this.AhwBna;
                    activity.KWHzl(bundle, l2 != null ? l2.longValue() : 637L);
                    Unit unit6 = Unit.INSTANCE;
                    return;
                }
                return;
            }
            if (i != 5) {
                EZpvd("sendTransaction", new Function0() { // from class: o.dIs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return dGQ.copydefault(this.copydefault, obj, objectRef2, objectRef);
                    }
                });
                Unit unit7 = Unit.INSTANCE;
                return;
            }
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(obj);
            java.lang.String json2 = new Gson().toJson(objectRef.element);
            Intrinsics.checkNotNullExpressionValue(json2, "");
            AEQbTJ(strGEmmrt2, json2, "sendTransaction_contract_interaction");
            final android.os.Bundle bundle2 = new android.os.Bundle();
            NewCallbackBean newCallbackBean = this.EZpvd;
            if (newCallbackBean != null && (body = newCallbackBean.getBody()) != null && (asJsonObject = body.getAsJsonObject("walletTxData")) != null && (jsonElement = asJsonObject.get("txHash")) != null) {
                asString = jsonElement.getAsString();
            }
            bundle2.putString("txHash", asString);
            if (this.AYXKKw != null && this.EZpvd != null) {
                InterfaceC9848bdN interfaceC9848bdN = (InterfaceC9848bdN) C43248rlh.KWHzl.AEQbTJ(InterfaceC9848bdN.class);
                InterfaceC9738bbJ interfaceC9738bbJ2 = this.AYXKKw;
                Intrinsics.copydefault(interfaceC9738bbJ2);
                NewCallbackBean newCallbackBean2 = this.EZpvd;
                Intrinsics.copydefault(newCallbackBean2);
                AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ = interfaceC9848bdN.AEQbTJ(interfaceC9738bbJ2, newCallbackBean2);
                final Function1 function1 = new Function1() { // from class: o.dIn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj5) {
                        return dGQ.copydefault(this.EZpvd, bundle2, (ResponseData) obj5);
                    }
                };
                InterfaceC58227yxM<? super ResponseData<java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dIo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj5) {
                        dGQ.QbewEr(function1, obj5);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.dIl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj5) {
                        return dGQ.KWHzl(this.AEQbTJ, bundle2, (java.lang.Throwable) obj5);
                    }
                };
                abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dIm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj5) {
                        dGQ.RJOkX(function12, obj5);
                    }
                });
            }
            Unit unit8 = Unit.INSTANCE;
            return;
        }
        if (Intrinsics.EZpvd(obj4, (java.lang.Object) "signAndSubmitTransaction") || Intrinsics.EZpvd(obj4, (java.lang.Object) "signTransaction")) {
            int i2 = this.valueOf;
            if (i2 != 3) {
                if (i2 == 5) {
                    Intrinsics.copydefault(obj);
                    valueOf(obj, (JSONObject) objectRef.element);
                    return;
                }
                return;
            }
            FragmentActivity fragmentActivity3 = this.AEQbTJ.get();
            if (fragmentActivity3 != null) {
                C14923duc c14923duc2 = C14923duc.EZpvd;
                java.lang.Long l3 = this.AhwBna;
                c14923duc2.EZpvd(fragmentActivity3, l3 != null ? l3.longValue() : 637L, 637L, new Function0() { // from class: o.dHW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return dGQ.EZpvd(this.EZpvd, obj, objectRef, jSONObject);
                    }
                }, new Function0() { // from class: o.dHZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return dGQ.valueOf(this.OLrzqt, obj, objectRef);
                    }
                });
                Unit unit9 = Unit.INSTANCE;
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd(obj4, (java.lang.Object) "ecRecover")) {
            return;
        }
        if (Intrinsics.EZpvd(obj4, (java.lang.Object) "watchAsset")) {
            FragmentActivity fragmentActivity4 = this.AEQbTJ.get();
            if (fragmentActivity4 != null) {
                C14923duc c14923duc3 = C14923duc.EZpvd;
                if (!c14923duc3.zsXlph()) {
                    kotlin.Pair<java.lang.String, java.lang.String> pairAuCTel = c14923duc3.AuCTel();
                    androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity4.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    C14923duc.showConnectWalletDialog$default(c14923duc3, pairAuCTel, supportFragmentManager, null, null, 12, null);
                    DappTabData dappTabDataOLrzqt4 = C15112dyF.AEQbTJ.OLrzqt();
                    if (dappTabDataOLrzqt4 == null || (mWebView3 = dappTabDataOLrzqt4.getMWebView()) == null) {
                        return;
                    }
                    mWebView3.evaluateJavascript("window.okxwallet.sendResponse(" + obj + ", false)", null);
                    Unit unit10 = Unit.INSTANCE;
                    return;
                }
                Unit unit11 = Unit.INSTANCE;
            }
            if (this.AhwBna == null) {
                this.AhwBna = 1L;
            }
            InterfaceC9738bbJ interfaceC9738bbJ3 = this.AuCTel;
            if (interfaceC9738bbJ3 == null) {
                AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().KWHzl();
                final Function1 function13 = new Function1() { // from class: o.dHX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj5) {
                        return dGQ.copydefault(this.EZpvd, obj, objectRef, (InterfaceC9738bbJ) obj5);
                    }
                };
                InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.dIb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj5) {
                        dGQ.QUSxYX(function13, obj5);
                    }
                };
                final Function1 function14 = new Function1() { // from class: o.dIc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj5) {
                        return dGQ.djBIcL((java.lang.Throwable) obj5);
                    }
                };
                Intrinsics.copydefault(abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.dIe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj5) {
                        dGQ.QfsBiF(function14, obj5);
                    }
                }));
                return;
            }
            Intrinsics.copydefault(interfaceC9738bbJ3);
            Intrinsics.copydefault(obj);
            copydefault(interfaceC9738bbJ3, obj, objectRef.element);
            Unit unit12 = Unit.INSTANCE;
            return;
        }
        try {
            if (Intrinsics.EZpvd(obj4, (java.lang.Object) "switchEthereumChain")) {
                java.lang.Object objOpt = ((JSONObject) objectRef.element).opt("chainId");
                if (objOpt != null) {
                    java.lang.String strSubstring = ((java.lang.String) objOpt).substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    long j = java.lang.Long.parseLong(strSubstring, 16);
                    Intrinsics.copydefault(obj);
                    copydefault(j, obj);
                    return;
                }
                return;
            }
            if (Intrinsics.EZpvd(obj4, (java.lang.Object) "addEthereumChain")) {
                java.lang.Object objOpt2 = ((JSONObject) objectRef.element).opt("chainId");
                if (objOpt2 != null) {
                    final Ref.LongRef longRef = new Ref.LongRef();
                    longRef.element = -1L;
                    java.lang.String strSubstring2 = ((java.lang.String) objOpt2).substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    longRef.element = java.lang.Long.parseLong(strSubstring2, 16);
                    java.lang.String strSubstring3 = ((java.lang.String) objOpt2).substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                    longRef.element = java.lang.Long.parseLong(strSubstring3, 16);
                    InterfaceC9731bbC interfaceC9731bbCOLrzqt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().OLrzqt(longRef.element, true);
                    java.lang.Long lValueOf = interfaceC9731bbCOLrzqt != null ? java.lang.Long.valueOf(interfaceC9731bbCOLrzqt.fetchVPNInfo()) : null;
                    long j2 = longRef.element;
                    if (j2 == 1666600000 || j2 == 2020) {
                        lValueOf = java.lang.Long.valueOf(j2);
                    }
                    pUU.KWHzl("logtag", "convert chainId:" + longRef.element + " to generalChainId:" + lValueOf);
                    if (lValueOf != null) {
                        long jLongValue = lValueOf.longValue();
                        Intrinsics.copydefault(obj);
                        KWHzl(jLongValue, obj);
                        return;
                    }
                    FragmentActivity fragmentActivity5 = this.AEQbTJ.get();
                    if (fragmentActivity5 != null) {
                        C14923duc c14923duc4 = C14923duc.EZpvd;
                        if (!c14923duc4.zsXlph()) {
                            kotlin.Pair<java.lang.String, java.lang.String> pairAuCTel2 = c14923duc4.AuCTel();
                            androidx.fragment.app.FragmentManager supportFragmentManager2 = fragmentActivity5.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                            C14923duc.showConnectWalletDialog$default(c14923duc4, pairAuCTel2, supportFragmentManager2, null, null, 12, null);
                            DappTabData dappTabDataOLrzqt5 = C15112dyF.AEQbTJ.OLrzqt();
                            if (dappTabDataOLrzqt5 == null || (mWebView2 = dappTabDataOLrzqt5.getMWebView()) == null) {
                                return;
                            }
                            FragmentActivity fragmentActivity6 = this.AEQbTJ.get();
                            Intrinsics.copydefault(fragmentActivity6);
                            mWebView2.evaluateJavascript("window.okxwallet.sendError(" + obj + ",\"" + fragmentActivity6.getString(dLX.Dialog.AxsJAY) + "\", 4001)", null);
                            Unit unit13 = Unit.INSTANCE;
                            return;
                        }
                        Unit unit14 = Unit.INSTANCE;
                    }
                    xWE xwe = (xWE) C43248rlh.KWHzl.AEQbTJ(xWE.class);
                    FragmentActivity fragmentActivity7 = this.AEQbTJ.get();
                    Intrinsics.copydefault(fragmentActivity7);
                    FragmentActivity fragmentActivity8 = fragmentActivity7;
                    InterfaceC9738bbJ interfaceC9738bbJ4 = this.AuCTel;
                    xwe.KWHzl(fragmentActivity8, new DappInteractionArgs((interfaceC9738bbJ4 == null || (strDbNXlk = interfaceC9738bbJ4.DbNXlk()) == null) ? "" : strDbNXlk, null, null, AhwBna(), null, null, "dapp", 2, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -202, null), ((JSONObject) objectRef.element).toString(), new Function1() { // from class: o.dIa
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj5) {
                            return dGQ.OLrzqt(longRef, this, obj, (android.os.Bundle) obj5);
                        }
                    });
                    return;
                }
                return;
            }
            if (Intrinsics.EZpvd(obj4, (java.lang.Object) "sendRpcRequest")) {
                Intrinsics.copydefault(obj);
                sendRpcRequest$default(this, obj, (JSONObject) objectRef.element, null, 4, null);
                return;
            }
            if (Intrinsics.EZpvd(obj4, (java.lang.Object) "requestRpc")) {
                if (this.valueOf == 6) {
                    Intrinsics.copydefault(obj);
                    sendRpcRequest$default(this, obj, (JSONObject) objectRef.element, null, 4, null);
                    return;
                }
                return;
            }
            if (Intrinsics.EZpvd(obj4, (java.lang.Object) "sendTranslateRequest")) {
                Intrinsics.copydefault(obj);
                isConnected(obj, (JSONObject) objectRef.element);
                return;
            }
            if (Intrinsics.EZpvd(obj4, (java.lang.Object) "signDirect")) {
                Intrinsics.copydefault(obj);
                java.lang.String string = ((JSONObject) objectRef.element).toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                AEQbTJ(obj, string, true, "signDirect");
                return;
            }
            if (Intrinsics.EZpvd(obj4, (java.lang.Object) "translateState")) {
                if (((JSONObject) objectRef.element).optInt("state") == 0) {
                    DappTabData dappTabDataOLrzqt6 = C15112dyF.AEQbTJ.OLrzqt();
                    if (dappTabDataOLrzqt6 != null) {
                        dappTabDataOLrzqt6.setTranslated(true);
                        Unit unit15 = Unit.INSTANCE;
                    }
                    dES des2 = this.fIwbmz.get();
                    if (des2 != null) {
                        des2.dismissLoading();
                        Unit unit16 = Unit.INSTANCE;
                        return;
                    }
                    return;
                }
                dES des3 = this.fIwbmz.get();
                if (des3 != null) {
                    des3.dismissLoading();
                    Unit unit17 = Unit.INSTANCE;
                }
                C15112dyF c15112dyF2 = C15112dyF.AEQbTJ;
                DappTabData dappTabDataOLrzqt7 = c15112dyF2.OLrzqt();
                if (dappTabDataOLrzqt7 != null) {
                    dappTabDataOLrzqt7.setTranslated(false);
                    Unit unit18 = Unit.INSTANCE;
                }
                C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(dLX.Dialog.ejfBZ), 0, 1, (java.lang.Object) null);
                C14742drG c14742drG = C14742drG.KWHzl;
                DappTabData dappTabDataOLrzqt8 = c15112dyF2.OLrzqt();
                if (dappTabDataOLrzqt8 != null && (mWebView = dappTabDataOLrzqt8.getMWebView()) != null && (url = mWebView.getUrl()) != null) {
                    str2 = url;
                }
                c14742drG.EZpvd(EopTrackEvent.KEY_RESULT_FAILED, str2);
                Unit unit19 = Unit.INSTANCE;
                return;
            }
            if (Intrinsics.EZpvd(obj4, (java.lang.Object) "kaia_signTransaction") || Intrinsics.EZpvd(obj4, (java.lang.Object) "klay_signTransaction")) {
                checkJsChain$default(this, null, new Function0() { // from class: o.dId
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return dGQ.OLrzqt(this.OLrzqt, obj, objectRef, jSONObject);
                    }
                }, 1, null);
                return;
            }
            if (Intrinsics.EZpvd(obj4, (java.lang.Object) "walletSendCalls")) {
                checkJsChain$default(this, null, new Function0() { // from class: o.dIg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return dGQ.DbNXlk(this.OLrzqt, obj, objectRef);
                    }
                }, 1, null);
                return;
            }
            if (Intrinsics.EZpvd(obj4, (java.lang.Object) "walletGetCallsStatus")) {
                Intrinsics.copydefault(obj);
                AEQbTJ(obj, (JSONObject) objectRef.element);
            } else if (Intrinsics.EZpvd(obj4, (java.lang.Object) "walletGetCapabilities")) {
                Intrinsics.copydefault(obj);
                KWHzl(obj, (JSONObject) objectRef.element);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit values(dGQ dgq, java.lang.Object obj, Ref.ObjectRef objectRef) {
        Intrinsics.copydefault(obj);
        dgq.KWHzl(obj, (java.lang.String) objectRef.element);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit gEmmrt(dGQ dgq, java.lang.Object obj, Ref.ObjectRef objectRef) throws JSONException {
        Intrinsics.copydefault(obj);
        dgq.AhwBna(obj, (JSONObject) objectRef.element);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(dGQ dgq, java.lang.Object obj) {
        dgq.AEQbTJ(C33129mqd.gEmmrt(obj), "", "signMessage");
        Activity activity = dgq.isConnected;
        if (activity != null) {
            activity.KWHzl(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(dGQ dgq, java.lang.Object obj, Ref.ObjectRef objectRef) throws JSONException {
        Intrinsics.copydefault(obj);
        dgq.AhwBna(obj, (JSONObject) objectRef.element);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AYXKKw(dGQ dgq, java.lang.Object obj, Ref.ObjectRef objectRef) {
        Intrinsics.copydefault(obj);
        dgq.DbNXlk(obj, (JSONObject) objectRef.element);
        return Unit.INSTANCE;
    }

    public static final void QbewEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(dGQ dgq, android.os.Bundle bundle, ResponseData responseData) {
        Activity activity = dgq.isConnected;
        if (activity != null) {
            java.lang.Long l = dgq.AhwBna;
            activity.KWHzl(bundle, l != null ? l.longValue() : 706L);
        }
        return Unit.INSTANCE;
    }

    public static final void RJOkX(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(dGQ dgq, android.os.Bundle bundle, java.lang.Throwable th) {
        Activity activity = dgq.isConnected;
        if (activity != null) {
            java.lang.Long l = dgq.AhwBna;
            activity.KWHzl(bundle, l != null ? l.longValue() : 706L);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(dGQ dgq, java.lang.Object obj, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        Intrinsics.copydefault(obj);
        dgq.EZpvd(obj, (java.lang.String) objectRef.element, (JSONObject) objectRef2.element);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(dGQ dgq, java.lang.Object obj, Ref.ObjectRef objectRef, JSONObject jSONObject) {
        Intrinsics.copydefault(obj);
        dgq.EZpvd(obj, (JSONObject) objectRef.element, jSONObject.get("name").toString());
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(dGQ dgq, java.lang.Object obj, Ref.ObjectRef objectRef) {
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(obj);
        java.lang.String json = new Gson().toJson(objectRef.element);
        Intrinsics.checkNotNullExpressionValue(json, "");
        dgq.AEQbTJ(strGEmmrt, json, "sendTransaction_contract_interaction");
        Activity activity = dgq.isConnected;
        if (activity != null) {
            activity.KWHzl(null);
        }
        return Unit.INSTANCE;
    }

    public static final void QUSxYX(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(dGQ dgq, java.lang.Object obj, Ref.ObjectRef objectRef, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.copydefault(interfaceC9738bbJ);
        Intrinsics.copydefault(obj);
        dgq.copydefault(interfaceC9738bbJ, obj, objectRef.element);
        return Unit.INSTANCE;
    }

    public static final void QfsBiF(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final Ref.LongRef longRef, final dGQ dgq, final java.lang.Object obj, android.os.Bundle bundle) {
        C13241dEa mWebView;
        pUU.KWHzl("logtag", "added addCustomEvmChain: callback ");
        java.lang.Boolean boolValueOf = bundle != null ? java.lang.Boolean.valueOf(bundle.getBoolean("addCustomNetwork")) : null;
        if (boolValueOf != null && Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.TRUE)) {
            pUU.KWHzl("logtag", "added chainId:" + longRef.element);
            InterfaceC9741bbM interfaceC9741bbMGEmmrt = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt();
            InterfaceC9738bbJ interfaceC9738bbJ = dgq.AYXKKw;
            Intrinsics.copydefault(interfaceC9738bbJ);
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtEZpvd = interfaceC9741bbMGEmmrt.EZpvd(interfaceC9738bbJ.DbNXlk());
            final Function1 function1 = new Function1() { // from class: o.dIG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return dGQ.KWHzl(this.OLrzqt, longRef, obj, (InterfaceC9738bbJ) obj2);
                }
            };
            InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dIE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    dGQ.QVAiDq(function1, obj2);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dIN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return dGQ.gEmmrt((java.lang.Throwable) obj2);
                }
            };
            abstractC58260yxtEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dIJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    dGQ.aKErDB(function12, obj2);
                }
            });
        } else {
            DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
            if (dappTabDataOLrzqt != null && (mWebView = dappTabDataOLrzqt.getMWebView()) != null) {
                FragmentActivity fragmentActivity = dgq.AEQbTJ.get();
                Intrinsics.copydefault(fragmentActivity);
                mWebView.evaluateJavascript("window.okxwallet.sendError(" + obj + ",\"" + fragmentActivity.getString(dLX.Dialog.AxsJAY) + "\", 4001)", null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void QVAiDq(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(dGQ dgq, Ref.LongRef longRef, java.lang.Object obj, InterfaceC9738bbJ interfaceC9738bbJ) {
        dgq.AYXKKw = interfaceC9738bbJ;
        if (interfaceC9738bbJ != null) {
            long j = longRef.element;
            Intrinsics.copydefault(obj);
            dgq.copydefault(j, obj);
        }
        return Unit.INSTANCE;
    }

    public static final void aKErDB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(dGQ dgq, java.lang.Object obj, Ref.ObjectRef objectRef, JSONObject jSONObject) throws JSONException {
        Intrinsics.copydefault(obj);
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(objectRef.element);
        java.lang.Object obj2 = jSONObject.get("name");
        Intrinsics.copydefault(obj2, "");
        dgq.AEQbTJ(obj, strGEmmrt, true, (java.lang.String) obj2);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(dGQ dgq, java.lang.Object obj, Ref.ObjectRef objectRef) {
        Intrinsics.copydefault(obj);
        operatorConstractInteraction$default(dgq, obj, C33129mqd.gEmmrt(objectRef.element), false, "walletSendCalls", 4, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull final java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        xWE xwe = (xWE) C43248rlh.KWHzl.AEQbTJ(xWE.class);
        FragmentActivity fragmentActivity = this.AEQbTJ.get();
        Intrinsics.copydefault(fragmentActivity);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        java.lang.String strDbNXlk = interfaceC9738bbJ.DbNXlk();
        xwe.copydefault(fragmentActivity2, new DappInteractionArgs(strDbNXlk == null ? "" : strDbNXlk, null, C33129mqd.gEmmrt(this.AhwBna), AhwBna(), null, null, "dapp", 2, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -206, null), obj2.toString(), new Function1() { // from class: o.dHS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return dGQ.OLrzqt(obj, (android.os.Bundle) obj3);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.Object obj, android.os.Bundle bundle) {
        C13241dEa mWebView;
        java.lang.Boolean boolValueOf = bundle != null ? java.lang.Boolean.valueOf(bundle.getBoolean("addCustomNetwork")) : null;
        if (boolValueOf != null) {
            pUU.KWHzl("logtag", "add watchEvmAsset:" + boolValueOf);
        }
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt != null && (mWebView = dappTabDataOLrzqt.getMWebView()) != null) {
            mWebView.evaluateJavascript("window.okxwallet.sendResponse(" + obj + ", " + boolValueOf + ")", null);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(final long j, @NotNull final java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        FragmentActivity fragmentActivity = this.AEQbTJ.get();
        if (fragmentActivity != null) {
            fragmentActivity.runOnUiThread(new java.lang.Runnable() { // from class: o.dIu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    dGQ.AEQbTJ(j, this, obj);
                }
            });
        }
    }

    public static final void AEQbTJ(long j, dGQ dgq, java.lang.Object obj) throws JSONException {
        InterfaceC9731bbC interfaceC9731bbCOLrzqt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().OLrzqt(j, true);
        java.lang.Long lValueOf = interfaceC9731bbCOLrzqt != null ? java.lang.Long.valueOf(interfaceC9731bbCOLrzqt.fetchVPNInfo()) : null;
        if (j == 1666600000 || j == 2020) {
            lValueOf = java.lang.Long.valueOf(j);
        }
        pUU.KWHzl("logtag", "convert chainId:" + j + " to generalChainId:" + lValueOf);
        if (lValueOf == null) {
            lValueOf = -1L;
        }
        dgq.KWHzl(lValueOf.longValue(), obj);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, o.yxC] */
    public final void isConnected(final java.lang.Object obj, JSONObject jSONObject) {
        java.lang.String mUrl;
        java.lang.String strOptString;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(TtmlNode.TAG_METADATA);
        final java.lang.String str = (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("site")) == null) ? "" : strOptString;
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "")) {
            C15112dyF c15112dyF = C15112dyF.AEQbTJ;
            DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
            if (!Intrinsics.EZpvd((java.lang.Object) (dappTabDataOLrzqt != null ? dappTabDataOLrzqt.getMUrl() : null), (java.lang.Object) "")) {
                C14923duc c14923duc = C14923duc.EZpvd;
                java.lang.String strKWHzl = c14923duc.KWHzl(str);
                DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
                if (dappTabDataOLrzqt2 == null || (mUrl = dappTabDataOLrzqt2.getMUrl()) == null) {
                    mUrl = "";
                }
                if (!Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) c14923duc.KWHzl(mUrl))) {
                    java.util.ArrayList<InterfaceC58217yxC> arrayList = AkhnZx().get(str);
                    if (arrayList != null) {
                        java.util.Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC58217yxC) it.next()).dispose();
                        }
                    }
                    java.util.ArrayList<InterfaceC58217yxC> arrayList2 = AkhnZx().get(str);
                    if (arrayList2 != null) {
                        arrayList2.clear();
                        return;
                    }
                    return;
                }
            }
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("content");
        final int iHashCode = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.hashCode() : 0;
        C14923duc c14923duc2 = C14923duc.EZpvd;
        if (c14923duc2.hDKMBd().get(java.lang.Integer.valueOf(iHashCode)) != null) {
            copydefault(obj, c14923duc2.hDKMBd().get(java.lang.Integer.valueOf(iHashCode)), "");
            return;
        }
        FragmentActivity fragmentActivity = this.AEQbTJ.get();
        if (fragmentActivity != null) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            C15059dxF c15059dxFGEmmrt = gEmmrt();
            java.lang.String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            final java.lang.String str2 = str;
            objectRef.element = C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(C43423rox.unwrapResponseData$default(c15059dxFGEmmrt.KWHzl(string), (Function1) null, 1, (java.lang.Object) null), fragmentActivity), new Function1() { // from class: o.dHk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return dGQ.OLrzqt(this.copydefault, obj, str, objectRef, (java.lang.Throwable) obj2);
                }
            }, (Function0) null, new Function1() { // from class: o.dHh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return dGQ.KWHzl(this.copydefault, iHashCode, obj, str2, objectRef, (kotlinx.serialization.json.JsonObject) obj2);
                }
            }, 2, (java.lang.Object) null);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                java.util.ArrayList arrayList3 = AkhnZx().get(str);
                if (arrayList3 == null) {
                    arrayList3 = new java.util.ArrayList();
                    AkhnZx().put(str, arrayList3);
                }
                arrayList3.add(objectRef.element);
            }
        }
    }

    public static final Unit KWHzl(dGQ dgq, int i, java.lang.Object obj, java.lang.String str, Ref.ObjectRef objectRef, kotlinx.serialization.json.JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        dES des = dgq.fIwbmz.get();
        if (des != null) {
            des.dismissLoading();
        }
        C14923duc.EZpvd.hDKMBd().put(java.lang.Integer.valueOf(i), jsonObject);
        dgq.copydefault(obj, jsonObject, "");
        java.util.ArrayList<InterfaceC58217yxC> arrayList = dgq.AkhnZx().get(str);
        if (arrayList != null) {
            C56532yIw.EZpvd(arrayList).remove(objectRef.element);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(dGQ dgq, java.lang.Object obj, java.lang.String str, Ref.ObjectRef objectRef, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        dES des = dgq.fIwbmz.get();
        if (des != null) {
            des.dismissLoading();
        }
        dgq.copydefault(obj, (kotlinx.serialization.json.JsonObject) null, java.lang.String.valueOf(C43422row.AEQbTJ(th)));
        java.util.ArrayList<InterfaceC58217yxC> arrayList = dgq.AkhnZx().get(str);
        if (arrayList != null) {
            C56532yIw.EZpvd(arrayList).remove(objectRef.element);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(java.lang.Object obj, kotlinx.serialization.json.JsonObject jsonObject, java.lang.String str) {
        C13241dEa mWebView;
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null) {
            return;
        }
        mWebView.evaluateJavascript("window.okexchain.sendTranslateResponse(" + obj + ", " + jsonObject + ",`" + str + "`)", null);
    }

    public static /* synthetic */ void sendRpcRequest$default(dGQ dgq, java.lang.Object obj, JSONObject jSONObject, java.lang.String str, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            str = null;
        }
        dgq.copydefault(obj, jSONObject, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(final java.lang.Object obj, final JSONObject jSONObject, java.lang.String str) {
        C13241dEa mWebView;
        T t;
        C13241dEa mWebView2;
        java.util.HashMap<java.lang.Long, java.lang.String> mapQOLQEE;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
        if (dappTabDataOLrzqt == null || (mWebView2 = dappTabDataOLrzqt.getMWebView()) == null || (mapQOLQEE = mWebView2.QOLQEE()) == null) {
            DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
            java.lang.String strZsXlph = (dappTabDataOLrzqt2 == null || (mWebView = dappTabDataOLrzqt2.getMWebView()) == null) ? null : mWebView.zsXlph();
            Intrinsics.copydefault((java.lang.Object) strZsXlph);
            t = strZsXlph;
        } else {
            java.lang.String str2 = mapQOLQEE.get(this.AhwBna);
            t = str2;
            if (str2 == null) {
            }
        }
        objectRef.element = t;
        if (str != 0) {
            objectRef.element = str;
        }
        C15059dxF c15059dxFGEmmrt = gEmmrt();
        java.lang.String str3 = (java.lang.String) objectRef.element;
        java.lang.String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        C33024moe.subscribeOnIO$default(c15059dxFGEmmrt.OLrzqt(str3, string), new Function1() { // from class: o.dHz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return dGQ.AEQbTJ(this.copydefault, obj, objectRef, (java.lang.Throwable) obj2);
            }
        }, (Function0) null, new Function1() { // from class: o.dHF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return dGQ.KWHzl(this.AEQbTJ, obj, (kotlinx.serialization.json.JsonObject) obj2);
            }
        }, 2, (java.lang.Object) null);
        FragmentActivity fragmentActivity = this.AEQbTJ.get();
        if (fragmentActivity != null) {
            fragmentActivity.runOnUiThread(new java.lang.Runnable() { // from class: o.dHD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    dGQ.AEQbTJ(jSONObject, this);
                }
            });
        }
    }

    public static final Unit KWHzl(dGQ dgq, java.lang.Object obj, kotlinx.serialization.json.JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        dgq.KWHzl(obj, jsonObject.toString(), false);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(dGQ dgq, java.lang.Object obj, Ref.ObjectRef objectRef, java.lang.Throwable th) {
        JsonElement jsonElement;
        Intrinsics.checkNotNullParameter(th, "");
        dgq.KWHzl(obj, java.lang.String.valueOf(C43422row.AEQbTJ(th)), true);
        java.lang.Object obj2 = objectRef.element;
        JsonObject jsonObjectAEQbTJ = C43422row.AEQbTJ(th);
        java.lang.String asString = (jsonObjectAEQbTJ == null || (jsonElement = jsonObjectAEQbTJ.get("code")) == null) ? null : jsonElement.getAsString();
        pUU.copydefault("dappwebview", "rpc request failed:" + obj2 + " code:" + asString + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(JSONObject jSONObject, dGQ dgq) {
        java.lang.String url;
        C13241dEa mWebView;
        C14742drG c14742drG = C14742drG.KWHzl;
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null || (url = mWebView.getUrl()) == null) {
            url = "";
        }
        java.lang.String strOptString = jSONObject.optString(FirebaseAnalytics.Param.METHOD);
        Intrinsics.checkNotNullExpressionValue(strOptString, "");
        java.lang.Long l = dgq.AhwBna;
        c14742drG.EZpvd(url, strOptString, java.lang.String.valueOf(l != null ? l.longValue() : 1L));
    }

    public final void KWHzl(java.lang.Object obj, java.lang.String str, boolean z) {
        java.lang.String strFJNWhG;
        C13241dEa mWebView;
        java.lang.String str2 = this.valueOf == 6 ? "window.starknet" : "window.okxwallet";
        if (z) {
            strFJNWhG = C59442zhC.fJNWhG("\n                        if (" + str2 + ") {\n                            " + str2 + ".sendRpcResponse(" + obj + ", \"\", `" + str + "`)\n                        }\n                    ");
        } else {
            strFJNWhG = C59442zhC.fJNWhG("\n                        if (" + str2 + ") {\n                            " + str2 + ".sendRpcResponse(" + obj + ", `" + str + "`)\n                        }\n                    ");
        }
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null) {
            return;
        }
        mWebView.evaluateJavascript(strFJNWhG, null);
    }

    public final void EZpvd(java.lang.Object obj, java.lang.String str, JSONObject jSONObject) {
        if (this.values) {
            C55326xho.toast$default(dLX.Dialog.gwTjWJ, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) EIP1271Verifier.hexPrefix)) {
            copydefault(obj, str, jSONObject);
            return;
        }
        if (C59449zhJ.startsWith$default(str, EIP1271Verifier.hexPrefix, false, 2, null)) {
            str = str.substring(2);
            Intrinsics.checkNotNullExpressionValue(str, "");
        }
        if (C59449zhJ.startsWith$default(str, "095ea7b3", false, 2, null)) {
            copydefault(obj, jSONObject);
        } else {
            operatorConstractInteraction$default(this, obj, C33129mqd.gEmmrt(jSONObject), false, "sendTransaction", 4, null);
        }
    }

    public final void valueOf(final java.lang.Object obj, final JSONObject jSONObject) {
        final FragmentActivity fragmentActivity = this.AEQbTJ.get();
        if (fragmentActivity != null) {
            java.lang.String strOptString = jSONObject.optString("chainId");
            InterfaceC9848bdN interfaceC9848bdN = (InterfaceC9848bdN) C43248rlh.KWHzl.AEQbTJ(InterfaceC9848bdN.class);
            Intrinsics.copydefault((java.lang.Object) strOptString);
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(interfaceC9848bdN.OLrzqt(strOptString), fragmentActivity);
            final Function1 function1 = new Function1() { // from class: o.dHL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return dGQ.AEQbTJ(fragmentActivity, this, obj, jSONObject, (java.lang.Long) obj2);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dHM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    dGQ.gGvvIC(function1, obj2);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dHR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return dGQ.AEQbTJ(this.copydefault, obj, jSONObject, (java.lang.Throwable) obj2);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dHU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    dGQ.giSNqX(function12, obj2);
                }
            });
        }
    }

    public static final void gGvvIC(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(FragmentActivity fragmentActivity, dGQ dgq, java.lang.Object obj, JSONObject jSONObject, java.lang.Long l) throws JSONException {
        if (l != null && l.longValue() == -1) {
            C55326xho.toast$default(fragmentActivity.getString(dLX.Dialog.ODWQjV), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
        dgq.AhwBna = l;
        dgq.djBIcL(obj, jSONObject);
        return Unit.INSTANCE;
    }

    public static final void giSNqX(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(dGQ dgq, java.lang.Object obj, JSONObject jSONObject, java.lang.Throwable th) throws JSONException {
        dgq.djBIcL(obj, jSONObject);
        return Unit.INSTANCE;
    }

    public final void djBIcL(java.lang.Object obj, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("sign_doc")) {
            java.lang.Object obj2 = jSONObject.get("sign_doc");
            Intrinsics.copydefault(obj2, "");
            JSONObject jSONObject2 = (JSONObject) obj2;
            if (jSONObject.has("signOptions")) {
                jSONObject2.put("signOptions", jSONObject.get("signOptions"));
            }
            java.lang.String string = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            pUU.EZpvd(this.copydefault, string);
            AEQbTJ(obj, string, true, "signTransaction");
        }
    }

    public final void EZpvd(final java.lang.Object obj, final JSONObject jSONObject, final java.lang.String str) {
        AptosSignType aptosSignType;
        try {
            final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            final boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "signTransaction");
            if (jSONObjectOptJSONObject != null) {
                java.lang.String strOptString = jSONObject.optString("dataType");
                if (Intrinsics.EZpvd((java.lang.Object) strOptString, (java.lang.Object) "script_payload")) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) jSONObjectOptJSONObject.optString("code"))) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        InterfaceC9738bbJ interfaceC9738bbJ = this.AuCTel;
                        linkedHashMap.put("from", interfaceC9738bbJ != null ? interfaceC9738bbJ.EZpvd(637L) : null);
                        linkedHashMap.put("payload", jSONObjectOptJSONObject.toString());
                        linkedHashMap.put("signType", AptosSignType.SIGN_SCRIPT);
                        linkedHashMap.put("gas", C48787ucK.AEQbTJ.copydefault("dappConfig.aptosGasLimit", "50000"));
                        java.lang.String json = new Gson().toJson(linkedHashMap);
                        Intrinsics.checkNotNullExpressionValue(json, "");
                        AEQbTJ(obj, json, zEZpvd, str);
                        return;
                    }
                    return;
                }
                if (Intrinsics.EZpvd((java.lang.Object) strOptString, (java.lang.Object) "raw_transaction")) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    InterfaceC9738bbJ interfaceC9738bbJ2 = this.AuCTel;
                    linkedHashMap2.put("from", interfaceC9738bbJ2 != null ? interfaceC9738bbJ2.EZpvd(637L) : null);
                    linkedHashMap2.put("payload", jSONObjectOptJSONObject.optString("transaction"));
                    linkedHashMap2.put("maxGasAmount", jSONObjectOptJSONObject.optString("maxGasAmount"));
                    linkedHashMap2.put("gasUnitPrice", jSONObjectOptJSONObject.optString("gasUnitPrice"));
                    if (jSONObjectOptJSONObject.optBoolean("isSimpleTransaction")) {
                        aptosSignType = AptosSignType.SIGN_RAW_SIMPLE;
                    } else {
                        aptosSignType = AptosSignType.SIGN_RAW_MULTI_AGENT;
                    }
                    linkedHashMap2.put("signType", aptosSignType);
                    java.lang.String strOptString2 = jSONObjectOptJSONObject.optString("aptosPayload");
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) strOptString2)) {
                        linkedHashMap2.put("aptosPayload", strOptString2);
                    }
                    java.lang.String strOptString3 = jSONObjectOptJSONObject.optString("secondarySignerAddresses");
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) strOptString3)) {
                        linkedHashMap2.put("secondarySignerAddresses", strOptString3);
                    }
                    pUU.copydefault(this.copydefault, "raw_transaction " + new Gson().toJson(linkedHashMap2));
                    java.lang.String json2 = new Gson().toJson(linkedHashMap2);
                    Intrinsics.checkNotNullExpressionValue(json2, "");
                    AEQbTJ(obj, json2, zEZpvd, str);
                    return;
                }
                java.lang.String strOptString4 = jSONObjectOptJSONObject.optString("function");
                if (C33129mqd.OLrzqt((java.lang.CharSequence) strOptString4)) {
                    Intrinsics.copydefault((java.lang.Object) strOptString4);
                    java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) strOptString4, new java.lang.String[]{"::"}, false, 0, 6, (java.lang.Object) null);
                    if (listSplit$default.size() > 1) {
                        java.lang.String str2 = (java.lang.String) listSplit$default.get(0);
                        final java.lang.String str3 = (java.lang.String) listSplit$default.get(1);
                        FragmentActivity fragmentActivity = this.AEQbTJ.get();
                        if (fragmentActivity != null) {
                            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(gEmmrt().EZpvd(str2, java.lang.String.valueOf(this.AhwBna)), fragmentActivity);
                            final Function1 function1 = new Function1() { // from class: o.dIp
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return dGQ.AEQbTJ(str3, this, jSONObject, jSONObjectOptJSONObject, obj, zEZpvd, str, (ResponseData) obj2);
                                }
                            };
                            abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.dIq
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58227yxM
                                public final void accept(java.lang.Object obj2) {
                                    dGQ.fvQaOB(function1, obj2);
                                }
                            });
                        }
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static final void fvQaOB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.String str, dGQ dgq, JSONObject jSONObject, JSONObject jSONObject2, java.lang.Object obj, boolean z, java.lang.String str2, ResponseData responseData) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArray = new JSONArray((java.lang.String) responseData.getData());
        int length = jSONArray.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("abi")) == null || !Intrinsics.EZpvd((java.lang.Object) jSONObjectOptJSONObject.optString("name"), (java.lang.Object) str)) {
                i++;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                InterfaceC9738bbJ interfaceC9738bbJ = dgq.AuCTel;
                linkedHashMap.put("from", interfaceC9738bbJ != null ? interfaceC9738bbJ.EZpvd(637L) : null);
                if (jSONObject.has("isRawType")) {
                    linkedHashMap.put("isRawType", java.lang.Boolean.valueOf(jSONObject.optBoolean("isRawType")));
                }
                linkedHashMap.put("payload", jSONObject2.toString());
                linkedHashMap.put("gas", C48787ucK.AEQbTJ.copydefault("dappConfig.aptosGasLimit", "50000"));
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("abi", jSONObjectOptJSONObject);
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(jSONObject3);
                linkedHashMap.put("abi", jSONArray2.toString());
                linkedHashMap.put("signType", AptosSignType.SIGN_PAYLOAD);
                java.lang.String json = new Gson().toJson(linkedHashMap);
                Intrinsics.checkNotNullExpressionValue(json, "");
                dgq.AEQbTJ(obj, json, z, str2);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void operatorConstractInteraction$default(dGQ dgq, java.lang.Object obj, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str2 = "";
        }
        dgq.AEQbTJ(obj, str, z, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(java.lang.Object obj, java.lang.String str, boolean z, final java.lang.String str2) {
        java.lang.String str3;
        java.lang.String strDbNXlk;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(obj);
        java.lang.String json = new Gson().toJson(str);
        Intrinsics.checkNotNullExpressionValue(json, "");
        AEQbTJ(strGEmmrt, json, "sendTransaction_contract_interaction");
        pUU.copydefault("WebAppInterface", "operatorConstractInteraction  " + C33129mqd.gEmmrt(str));
        FragmentActivity fragmentActivity = this.AEQbTJ.get();
        if (fragmentActivity != null) {
            InterfaceC9738bbJ interfaceC9738bbJ = this.AuCTel;
            if (interfaceC9738bbJ != null) {
                java.lang.Long l = this.AhwBna;
                Intrinsics.copydefault(l);
                java.lang.String strEZpvd = interfaceC9738bbJ.EZpvd(l.longValue());
                str3 = strEZpvd == null ? "" : strEZpvd;
            }
            java.lang.Long l2 = this.AhwBna;
            Intrinsics.copydefault(l2);
            KWHzl(l2.longValue(), str3, this.AuCTel, false);
            java.lang.String str4 = str2 == null ? "sendTransaction_contract_interaction" : str2;
            InterfaceC9738bbJ interfaceC9738bbJ2 = this.AuCTel;
            java.lang.String str5 = (interfaceC9738bbJ2 == null || (strDbNXlk = interfaceC9738bbJ2.DbNXlk()) == null) ? "" : strDbNXlk;
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(this.AhwBna);
            PlatformItem platformItemAhwBna = AhwBna();
            java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(str);
            java.lang.String strAYXKKw = AYXKKw();
            java.lang.String strDjBIcL = djBIcL();
            Gson gson = new Gson();
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            PlatformItem platformItemAhwBna2 = AhwBna();
            pairArr[0] = C56390yDp.OLrzqt("dappUrl", platformItemAhwBna2 != null ? platformItemAhwBna2.getUrl() : null);
            pairArr[1] = C56390yDp.OLrzqt("signDataJson", C33129mqd.gEmmrt(str));
            dFN.startContractInteractionWithReport$default(str4, fragmentActivity, new DappInteractionArgs(str5, null, strGEmmrt2, platformItemAhwBna, strGEmmrt3, null, "dapp", 2, null, null, null, null, false, false, null, z, strDjBIcL, strAYXKKw, null, null, null, null, null, null, null, null, 6, gson.toJson(C56424yEw.gEmmrt(pairArr)), null, null, null, null, -201850366, null), new Function1() { // from class: o.dHd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return dGQ.OLrzqt(this.EZpvd, str2, (android.os.Bundle) obj2);
                }
            }, z ? new Function1() { // from class: o.dHi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return dGQ.KWHzl(this.EZpvd, (NewCallbackBean) obj2);
                }
            } : null, null, 32, null);
        }
    }

    public static final Unit OLrzqt(dGQ dgq, java.lang.String str, android.os.Bundle bundle) {
        Activity activity;
        if ((bundle == null || bundle.getInt("result") == 0) && (activity = dgq.isConnected) != null) {
            activity.KWHzl(null);
        }
        if ((Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "kaia_signTransaction") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "klay_signTransaction") || Intrinsics.EZpvd((java.lang.Object) "signTransaction", (java.lang.Object) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "signAndSubmitTransaction") || Intrinsics.EZpvd((java.lang.Object) "walletSendCalls", (java.lang.Object) str)) && bundle != null) {
            bundle.putString(FirebaseAnalytics.Param.METHOD, str);
        }
        Activity activity2 = dgq.isConnected;
        if (activity2 != null) {
            java.lang.Long l = dgq.AhwBna;
            activity2.KWHzl(bundle, l != null ? l.longValue() : 1L);
        }
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX KWHzl(dGQ dgq, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        if (5 == dgq.valueOf) {
            dgq.EZpvd = newCallbackBean;
            java.lang.String strOptString = new JSONObject(newCallbackBean.getBody().toString()).optString("signRawData");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("data", strOptString);
            Activity activity = dgq.isConnected;
            if (activity != null) {
                java.lang.Long l = dgq.AhwBna;
                activity.KWHzl(bundle, l != null ? l.longValue() : 706L);
            }
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, "", null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public final void copydefault(java.lang.Object obj, JSONObject jSONObject) {
        java.lang.String strDbNXlk;
        java.lang.String strEZpvd;
        java.lang.Long l = this.AhwBna;
        final long jLongValue = l != null ? l.longValue() : 1L;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(obj);
        java.lang.String json = new Gson().toJson(jSONObject);
        Intrinsics.checkNotNullExpressionValue(json, "");
        AEQbTJ(strGEmmrt, json, "sendtransaction_approve");
        FragmentActivity fragmentActivity = this.AEQbTJ.get();
        if (fragmentActivity != null) {
            InterfaceC9738bbJ interfaceC9738bbJ = this.AuCTel;
            KWHzl(jLongValue, (interfaceC9738bbJ == null || (strEZpvd = interfaceC9738bbJ.EZpvd(jLongValue)) == null) ? "" : strEZpvd, this.AuCTel, false);
            InterfaceC9738bbJ interfaceC9738bbJ2 = this.AuCTel;
            java.lang.String str = (interfaceC9738bbJ2 == null || (strDbNXlk = interfaceC9738bbJ2.DbNXlk()) == null) ? "" : strDbNXlk;
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(java.lang.Long.valueOf(jLongValue));
            PlatformItem platformItemAhwBna = AhwBna();
            java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(jSONObject);
            java.lang.String strAYXKKw = AYXKKw();
            java.lang.String strDjBIcL = djBIcL();
            Gson gson = new Gson();
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            PlatformItem platformItemAhwBna2 = AhwBna();
            pairArr[0] = C56390yDp.OLrzqt("dappUrl", platformItemAhwBna2 != null ? platformItemAhwBna2.getUrl() : null);
            pairArr[1] = C56390yDp.OLrzqt("signDataJson", C33129mqd.gEmmrt(jSONObject));
            dFN.KWHzl("sendtransaction_approve", fragmentActivity, new DappInteractionArgs(str, null, strGEmmrt2, platformItemAhwBna, strGEmmrt3, null, "dapp", 2, null, null, null, null, false, false, null, false, strDjBIcL, strAYXKKw, null, null, null, null, null, null, null, null, 6, gson.toJson(C56424yEw.gEmmrt(pairArr)), null, null, null, null, -201850366, null), new Function1() { // from class: o.dIr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return dGQ.valueOf(this.OLrzqt, jLongValue, (android.os.Bundle) obj2);
                }
            }, null);
        }
    }

    public static final Unit valueOf(dGQ dgq, long j, android.os.Bundle bundle) {
        if (bundle == null || bundle.getInt("result") == 0) {
            Activity activity = dgq.isConnected;
            if (activity != null) {
                activity.KWHzl(null);
            }
        } else {
            Activity activity2 = dgq.isConnected;
            if (activity2 != null) {
                activity2.copydefault(bundle, j);
            }
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String djBIcL() {
        java.lang.Long l = this.AhwBna;
        if (l == null || l.longValue() != 1) {
            return C48787ucK.AEQbTJ.copydefault("gasPriceConfig.dappOther", "");
        }
        return C48787ucK.AEQbTJ.copydefault("gasPriceConfig.dapp", "");
    }

    public final java.lang.String AYXKKw() {
        java.lang.Long l = this.AhwBna;
        if (l == null || l.longValue() != 1) {
            return C48787ucK.AEQbTJ.copydefault("gasLimitConfig.dappOther", "");
        }
        return C48787ucK.AEQbTJ.copydefault("gasLimitConfig.dapp", "");
    }

    public final void copydefault(java.lang.Object obj, java.lang.String str, JSONObject jSONObject) {
        java.lang.String strDbNXlk;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(obj);
        java.lang.String json = new Gson().toJson(jSONObject);
        Intrinsics.checkNotNullExpressionValue(json, "");
        AEQbTJ(strGEmmrt, json, "sendTransaction_send");
        java.lang.Long l = this.AhwBna;
        final long jLongValue = l != null ? l.longValue() : 1L;
        FragmentActivity fragmentActivity = this.AEQbTJ.get();
        if (fragmentActivity != null) {
            InterfaceC9738bbJ interfaceC9738bbJ = this.AuCTel;
            java.lang.String str2 = (interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) ? "" : strDbNXlk;
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(java.lang.Long.valueOf(jLongValue));
            PlatformItem platformItemAhwBna = AhwBna();
            java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(jSONObject);
            java.lang.String strAYXKKw = AYXKKw();
            java.lang.String strDjBIcL = djBIcL();
            Gson gson = new Gson();
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            PlatformItem platformItemAhwBna2 = AhwBna();
            pairArr[0] = C56390yDp.OLrzqt("dappUrl", platformItemAhwBna2 != null ? platformItemAhwBna2.getUrl() : null);
            pairArr[1] = C56390yDp.OLrzqt("signDataJson", C33129mqd.gEmmrt(jSONObject));
            dFN.startTransferDappWithReport$default("sendTransaction_send", fragmentActivity, new DappInteractionArgs(str2, null, strGEmmrt2, platformItemAhwBna, strGEmmrt3, null, "dapp", 2, null, null, null, null, false, false, null, false, strDjBIcL, strAYXKKw, null, null, null, null, null, null, null, null, 6, gson.toJson(C56424yEw.gEmmrt(pairArr)), null, null, null, null, -201850366, null), new Function1() { // from class: o.dHq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return dGQ.gEmmrt(this.OLrzqt, jLongValue, (android.os.Bundle) obj2);
                }
            }, null, null, 32, null);
        }
    }

    public static final Unit gEmmrt(dGQ dgq, long j, android.os.Bundle bundle) {
        if (bundle == null || bundle.getInt("result") == 0) {
            Activity activity = dgq.isConnected;
            if (activity != null) {
                activity.KWHzl(null);
            }
        } else {
            Activity activity2 = dgq.isConnected;
            if (activity2 != null) {
                activity2.OLrzqt(bundle, j);
            }
        }
        return Unit.INSTANCE;
    }

    public final void DbNXlk(java.lang.Object obj, JSONObject jSONObject) {
        java.lang.String strDbNXlk;
        java.lang.String strEZpvd;
        if (this.values) {
            C55326xho.toast$default(dLX.Dialog.gwTjWJ, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        if (AEQbTJ(obj, DappSignArgs.SIGN_TYPEDMESSAGE)) {
            java.lang.Long l = this.AhwBna;
            final long jLongValue = l != null ? l.longValue() : 1L;
            java.lang.String string = jSONObject.has("version") ? jSONObject.getString("version") : "V4";
            AEQbTJ(C33129mqd.gEmmrt(obj), "", DappSignArgs.SIGN_TYPEDMESSAGE);
            FragmentActivity fragmentActivity = this.AEQbTJ.get();
            if (fragmentActivity != null) {
                InterfaceC9738bbJ interfaceC9738bbJ = this.AuCTel;
                KWHzl(jLongValue, (interfaceC9738bbJ == null || (strEZpvd = interfaceC9738bbJ.EZpvd(jLongValue)) == null) ? "" : strEZpvd, this.AuCTel, false);
                InterfaceC9738bbJ interfaceC9738bbJ2 = this.AuCTel;
                java.lang.String str = (interfaceC9738bbJ2 == null || (strDbNXlk = interfaceC9738bbJ2.DbNXlk()) == null) ? "" : strDbNXlk;
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(jLongValue));
                PlatformItem platformItemAhwBna = AhwBna();
                java.lang.String strOptString = jSONObject.optString("data");
                Intrinsics.checkNotNullExpressionValue(strOptString, "");
                dFN.startSignDappWithReport$default(DappSignArgs.SIGN_TYPEDMESSAGE, fragmentActivity, new DappSignArgs(str, strGEmmrt, platformItemAhwBna, strOptString, null, false, 2, "dapp", null, null, false, false, DappSignArgs.SIGN_TYPEDMESSAGE, SignType.TYPED_MESSAGE, null, jSONObject.optString("raw"), null, null, false, null, string, null, 3100432, null), new Function1() { // from class: o.dHc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return dGQ.AYXKKw(this.EZpvd, jLongValue, (android.os.Bundle) obj2);
                    }
                }, null, 16, null);
            }
        }
    }

    public static final Unit AYXKKw(dGQ dgq, long j, android.os.Bundle bundle) {
        if (bundle == null || bundle.getInt("result") == 0) {
            Activity activity = dgq.isConnected;
            if (activity != null) {
                activity.KWHzl(null);
            }
        } else {
            Activity activity2 = dgq.isConnected;
            if (activity2 != null) {
                activity2.AEQbTJ(bundle, j);
            }
        }
        return Unit.INSTANCE;
    }

    public final void gEmmrt(final java.lang.Object obj, JSONObject jSONObject) throws JSONException {
        final java.lang.Object obj2 = jSONObject.get("needPop");
        final RequestWalletsParams requestWalletsParams = (RequestWalletsParams) C33490mxT.EZpvd(jSONObject.get("connectRequest").toString(), RequestWalletsParams.class);
        if (requestWalletsParams == null) {
            return;
        }
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().KWHzl();
        final Function1 function1 = new Function1() { // from class: o.dIC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return dGQ.EZpvd(requestWalletsParams, obj2, this, obj, (InterfaceC9738bbJ) obj3);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dID
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj3) {
                dGQ.UeEOUB(function1, obj3);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dIA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return dGQ.KWHzl(this.EZpvd, obj, (java.lang.Throwable) obj3);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dIF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj3) {
                dGQ.djSkpj(function12, obj3);
            }
        });
    }

    public static final void UeEOUB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final RequestWalletsParams requestWalletsParams, java.lang.Object obj, final dGQ dgq, final java.lang.Object obj2, InterfaceC9738bbJ interfaceC9738bbJ) throws JSONException {
        boolean z;
        java.util.List<java.lang.String> okxConnectRequiredGeneralChainIds;
        java.util.List<java.lang.String> okxConnectRequiredGeneralChainIds2;
        InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.copydefault(InterfaceC9854bdT.class);
        java.util.List<Namespace> requiredNamespaces = requestWalletsParams.getRequiredNamespaces();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = requiredNamespaces.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList, ((Namespace) it.next()).getChains());
        }
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList.iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            java.lang.String str = (java.lang.String) BuildersKt__BuildersKt.runBlocking$default(null, new WebAppInterface$requestWallets$1$2$1(interfaceC9854bdT, (java.lang.String) it2.next(), null), 1, null);
            if (str != null) {
                arrayList2.add(str);
            }
        }
        for (java.lang.String str2 : arrayList2) {
            DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
            if (dappTabDataOLrzqt != null && (okxConnectRequiredGeneralChainIds2 = dappTabDataOLrzqt.getOkxConnectRequiredGeneralChainIds()) != null) {
                okxConnectRequiredGeneralChainIds2.add(str2);
            }
        }
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
        if (dappTabDataOLrzqt2 != null) {
            dappTabDataOLrzqt2.setOkxConnect(true);
        }
        DappTabData dappTabDataOLrzqt3 = c15112dyF.OLrzqt();
        if (dappTabDataOLrzqt3 == null || (okxConnectRequiredGeneralChainIds = dappTabDataOLrzqt3.getOkxConnectRequiredGeneralChainIds()) == null) {
            z = false;
            break;
        }
        if (!okxConnectRequiredGeneralChainIds.isEmpty()) {
            java.util.Iterator<T> it3 = okxConnectRequiredGeneralChainIds.iterator();
            while (it3.hasNext()) {
                if (!C15196dzk.KWHzl.KWHzl(interfaceC9738bbJ.DbNXlk(), java.lang.Long.valueOf(C33129mqd.valueOf((java.lang.String) it3.next())))) {
                    z = false;
                    break;
                }
            }
        }
        final Function1 function1 = new Function1() { // from class: o.dGR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return dGQ.EZpvd(requestWalletsParams, dgq, obj2, (InterfaceC9738bbJ) obj3);
            }
        };
        if (z) {
            function1.invoke(interfaceC9738bbJ);
        } else if (Intrinsics.EZpvd(obj, java.lang.Boolean.TRUE)) {
            dES des = dgq.fIwbmz.get();
            if (des != null) {
                des.AEQbTJ(null, new Function2() { // from class: o.dGP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                        return dGQ.EZpvd(function1, (InterfaceC9738bbJ) obj3, (java.lang.Long) obj4);
                    }
                });
            }
        } else {
            dgq.AEQbTJ(obj2, MTAnalysisConstants.MainWhat.INIT, "User reject");
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(RequestWalletsParams requestWalletsParams, dGQ dgq, java.lang.Object obj, InterfaceC9738bbJ interfaceC9738bbJ) throws JSONException {
        java.util.List<Address> address;
        RequestWalletsResponse requestWalletsResponseCopydefault = (interfaceC9738bbJ == null || requestWalletsParams == null) ? null : dJL.OLrzqt.copydefault(interfaceC9738bbJ, requestWalletsParams);
        if (requestWalletsResponseCopydefault == null || ((address = requestWalletsResponseCopydefault.getAddress()) != null && address.isEmpty())) {
            dgq.AEQbTJ(obj, MTAnalysisConstants.MainWhat.INIT, "User reject");
        } else {
            Activity activity = dgq.isConnected;
            if (activity != null) {
                activity.copydefault(obj, requestWalletsResponseCopydefault);
            }
            dES des = dgq.fIwbmz.get();
            if (des != null) {
                des.AuCTelauCTel();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function1 function1, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        function1.invoke(interfaceC9738bbJ);
        return Unit.INSTANCE;
    }

    public static final void djSkpj(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(dGQ dgq, java.lang.Object obj, java.lang.Throwable th) throws JSONException {
        dgq.AEQbTJ(obj, MTAnalysisConstants.MainWhat.INIT, "User reject");
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ(java.lang.Object obj, java.lang.String str) {
        PlatformItem platformItemAhwBna;
        InterfaceC9738bbJ interfaceC9738bbJ = this.AuCTel;
        if (interfaceC9738bbJ == null || !interfaceC9738bbJ.getFieldNames() || (platformItemAhwBna = AhwBna()) == null || platformItemAhwBna.getId() == C33129mqd.valueOf(C15157dyy.EZpvd.AEQbTJ()) || !Intrinsics.EZpvd((java.lang.Object) platformItemAhwBna.getCategory(), (java.lang.Object) "3")) {
            return true;
        }
        FragmentActivity fragmentActivity = this.AEQbTJ.get();
        if (fragmentActivity != null) {
            dDW.copydefault.KWHzl(fragmentActivity, this.AhwBna);
        }
        java.lang.Long l = this.AhwBna;
        if (l == null) {
            return false;
        }
        KWHzl(C33129mqd.gEmmrt(obj), "", str, java.lang.Long.valueOf(l.longValue()));
        return false;
    }

    public final void AhwBna(final java.lang.Object obj, final JSONObject jSONObject) throws JSONException {
        if (this.valueOf == 5) {
            final FragmentActivity fragmentActivity = this.AEQbTJ.get();
            if (fragmentActivity != null) {
                java.lang.String strOptString = jSONObject.optString("chainId");
                InterfaceC9848bdN interfaceC9848bdN = (InterfaceC9848bdN) C43248rlh.KWHzl.AEQbTJ(InterfaceC9848bdN.class);
                Intrinsics.copydefault((java.lang.Object) strOptString);
                AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(interfaceC9848bdN.OLrzqt(strOptString), fragmentActivity);
                final Function1 function1 = new Function1() { // from class: o.dIM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return dGQ.OLrzqt(fragmentActivity, this, obj, jSONObject, (java.lang.Long) obj2);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dGN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj2) {
                        dGQ.dxcTrN(function1, obj2);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.dGV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return dGQ.EZpvd(this.EZpvd, obj, jSONObject, (java.lang.Throwable) obj2);
                    }
                };
                abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dGU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj2) {
                        dGQ.finit(function12, obj2);
                    }
                });
                return;
            }
            return;
        }
        AYXKKw(obj, jSONObject);
    }

    public static final void dxcTrN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(FragmentActivity fragmentActivity, dGQ dgq, java.lang.Object obj, JSONObject jSONObject, java.lang.Long l) throws JSONException {
        if (l != null && l.longValue() == -1) {
            C55326xho.toast$default(fragmentActivity.getString(dLX.Dialog.ODWQjV), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
        dgq.AhwBna = l;
        dgq.AYXKKw(obj, jSONObject);
        return Unit.INSTANCE;
    }

    public static final void finit(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(dGQ dgq, java.lang.Object obj, JSONObject jSONObject, java.lang.Throwable th) throws JSONException {
        dgq.AYXKKw(obj, jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AYXKKw(java.lang.Object obj, JSONObject jSONObject) throws JSONException {
        java.lang.String str;
        java.lang.String string;
        java.lang.String strDbNXlk;
        java.lang.String strEZpvd;
        if (this.values) {
            C55326xho.toast$default(dLX.Dialog.gwTjWJ, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        if (this.valueOf == 6) {
            string = jSONObject.toString();
        } else if (jSONObject.has("data")) {
            string = jSONObject.getString("data");
        } else {
            str = "";
            if (AEQbTJ(obj, "signMessage")) {
                return;
            }
            AEQbTJ(C33129mqd.gEmmrt(obj), "", "signMessage");
            java.lang.Long l = this.AhwBna;
            final long jLongValue = l != null ? l.longValue() : 1L;
            FragmentActivity fragmentActivity = this.AEQbTJ.get();
            if (fragmentActivity != null) {
                InterfaceC9738bbJ interfaceC9738bbJ = this.AuCTel;
                KWHzl(jLongValue, (interfaceC9738bbJ == null || (strEZpvd = interfaceC9738bbJ.EZpvd(jLongValue)) == null) ? "" : strEZpvd, this.AuCTel, false);
                InterfaceC9738bbJ interfaceC9738bbJ2 = this.AuCTel;
                java.lang.String str2 = (interfaceC9738bbJ2 == null || (strDbNXlk = interfaceC9738bbJ2.DbNXlk()) == null) ? "" : strDbNXlk;
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(jLongValue));
                PlatformItem platformItemAhwBna = AhwBna();
                int i = this.valueOf;
                dFN.startSignDappWithReport$default("signMessage", fragmentActivity, new DappSignArgs(str2, strGEmmrt, platformItemAhwBna, str, i == 3, 2, "dapp", null, false, false, i == 0 ? "eth_sign" : null, null, null, null, null, false, null, 129920, null), new Function1() { // from class: o.dIK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return dGQ.djBIcL(this.copydefault, jLongValue, (android.os.Bundle) obj2);
                    }
                }, null, 16, null);
                return;
            }
            return;
        }
        str = string;
        if (AEQbTJ(obj, "signMessage")) {
        }
    }

    public static final Unit djBIcL(dGQ dgq, long j, android.os.Bundle bundle) {
        if (bundle == null || bundle.getInt("result") == 0) {
            Activity activity = dgq.isConnected;
            if (activity != null) {
                activity.KWHzl(null);
            }
        } else {
            Activity activity2 = dgq.isConnected;
            if (activity2 != null) {
                activity2.AEQbTJ(bundle, j);
            }
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.Object obj, java.lang.String str) {
        java.lang.String strDbNXlk;
        java.lang.String strEZpvd;
        if (this.values) {
            C55326xho.toast$default(dLX.Dialog.gwTjWJ, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        if (AEQbTJ(obj, DappSignArgs.SIGN_PERSONALMESSAGE)) {
            java.lang.Long l = this.AhwBna;
            final long jLongValue = l != null ? l.longValue() : 1L;
            AEQbTJ(C33129mqd.gEmmrt(obj), "", DappSignArgs.SIGN_PERSONALMESSAGE);
            FragmentActivity fragmentActivity = this.AEQbTJ.get();
            if (fragmentActivity != null) {
                InterfaceC9738bbJ interfaceC9738bbJ = this.AuCTel;
                KWHzl(jLongValue, (interfaceC9738bbJ == null || (strEZpvd = interfaceC9738bbJ.EZpvd(jLongValue)) == null) ? "" : strEZpvd, this.AuCTel, false);
                InterfaceC9738bbJ interfaceC9738bbJ2 = this.AuCTel;
                dFN.startSignDappWithReport$default(DappSignArgs.SIGN_PERSONALMESSAGE, fragmentActivity, new DappSignArgs((interfaceC9738bbJ2 == null || (strDbNXlk = interfaceC9738bbJ2.DbNXlk()) == null) ? "" : strDbNXlk, C33129mqd.gEmmrt(java.lang.Long.valueOf(jLongValue)), AhwBna(), str, true, 2, "dapp", null, false, false, DappSignArgs.SIGN_PERSONALMESSAGE, null, null, null, null, false, null, 129920, null), new Function1() { // from class: o.dHH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return dGQ.AhwBna(this.copydefault, jLongValue, (android.os.Bundle) obj2);
                    }
                }, null, 16, null);
            }
        }
    }

    public static final Unit AhwBna(dGQ dgq, long j, android.os.Bundle bundle) {
        if (bundle == null || bundle.getInt("result") == 0) {
            Activity activity = dgq.isConnected;
            if (activity != null) {
                activity.KWHzl(null);
            }
        } else {
            Activity activity2 = dgq.isConnected;
            if (activity2 != null) {
                activity2.AEQbTJ(bundle, j);
            }
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.Object obj, JSONObject jSONObject) {
        LifecycleCoroutineScope lifecycleScope;
        java.lang.String strOptString = jSONObject.optString("id");
        pUU.KWHzl(this.copydefault, "getCallStatus. => statusId : " + strOptString);
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        C13241dEa mWebView = dappTabDataOLrzqt != null ? dappTabDataOLrzqt.getMWebView() : null;
        FragmentActivity fragmentActivity = this.AEQbTJ.get();
        if (fragmentActivity == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentActivity)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new WebAppInterface$getCallsStatus$1(this, strOptString, obj, mWebView, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(java.lang.Object obj, JSONObject jSONObject) {
        java.lang.String address;
        LifecycleCoroutineScope lifecycleScope;
        InterfaceC9780bbz interfaceC9780bbzAddressFromRealChainId$default;
        java.lang.String strOptString = jSONObject.optString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("chains");
        kotlin.ranges.IntRange intRangeAhwBna = C56548yJl.AhwBna(0, jSONArrayOptJSONArray.length());
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(intRangeAhwBna, 10));
        java.util.Iterator<java.lang.Integer> it = intRangeAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArrayOptJSONArray.getString(((AbstractC56415yEn) it).nextInt()));
        }
        pUU.KWHzl(this.copydefault, "getCallStatus => address: " + strOptString + ", chains: " + C33129mqd.gEmmrt(arrayList));
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.firstOrNull(((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().copydefault());
        java.lang.Long l = this.AhwBna;
        if (l != null) {
            address = (interfaceC9738bbJ == null || (interfaceC9780bbzAddressFromRealChainId$default = InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(interfaceC9738bbJ, l.longValue(), null, 2, null)) == null) ? null : interfaceC9780bbzAddressFromRealChainId$default.getAddress();
        }
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) address, (java.lang.Object) strOptString);
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        C13241dEa mWebView = dappTabDataOLrzqt != null ? dappTabDataOLrzqt.getMWebView() : null;
        if (zEZpvd) {
            FragmentActivity fragmentActivity = this.AEQbTJ.get();
            if (fragmentActivity == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentActivity)) == null) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new WebAppInterface$getCapabilityes$1(interfaceC9738bbJ, arrayList, obj, mWebView, null), 3, null);
            return;
        }
        if (mWebView != null) {
            mWebView.evaluateJavascript("window.okxwallet.sendError(" + obj + ")", null);
        }
    }

    public final void OLrzqt(java.lang.Object obj, JSONObject jSONObject) {
        EZpvd(obj, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(final java.lang.Object obj, JSONObject jSONObject) {
        long jLongValue;
        if (this.AhwBna == null) {
            long j = this.DbNXlk;
            if (j == null) {
                j = 1L;
            }
            this.AhwBna = j;
        }
        int i = this.valueOf;
        if (i == 3) {
            C43248rlh c43248rlh = C43248rlh.KWHzl;
            InterfaceC9737bbI interfaceC9737bbICopydefault = ((InterfaceC9852bdR) c43248rlh.AEQbTJ(InterfaceC9852bdR.class)).copydefault();
            java.lang.Long l = this.AhwBna;
            InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(interfaceC9737bbICopydefault, l != null ? l.longValue() : 1L, false, 2, null);
            if (chainMetaWithRealChainId$default != null && !chainMetaWithRealChainId$default.fIwbmz()) {
                InterfaceC9731bbC interfaceC9731bbCOLrzqt = ((InterfaceC9852bdR) c43248rlh.AEQbTJ(InterfaceC9852bdR.class)).copydefault().OLrzqt();
                this.AhwBna = interfaceC9731bbCOLrzqt != null ? java.lang.Long.valueOf(interfaceC9731bbCOLrzqt.fetchVPNInfo()) : null;
            }
        } else if (i == 6) {
            InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault().EZpvd(9004L, true);
            this.AhwBna = interfaceC9731bbCEZpvd != null ? java.lang.Long.valueOf(interfaceC9731bbCEZpvd.fetchVPNInfo()) : null;
        } else if (i == 5) {
            final FragmentActivity fragmentActivity = this.AEQbTJ.get();
            if (fragmentActivity != null) {
                final java.lang.String strOptString = jSONObject.optString("chainId");
                InterfaceC9848bdN interfaceC9848bdN = (InterfaceC9848bdN) C43248rlh.KWHzl.AEQbTJ(InterfaceC9848bdN.class);
                Intrinsics.copydefault((java.lang.Object) strOptString);
                AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(interfaceC9848bdN.OLrzqt(strOptString), fragmentActivity);
                final Function1 function1 = new Function1() { // from class: o.dIx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return dGQ.AEQbTJ(fragmentActivity, this, obj, (java.lang.Long) obj2);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dIw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj2) {
                        dGQ.dNCPSb(function1, obj2);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.dIv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return dGQ.OLrzqt(strOptString, this, obj, (java.lang.Throwable) obj2);
                    }
                };
                abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dIy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj2) {
                        dGQ.RcXXUw(function12, obj2);
                    }
                });
                return;
            }
            return;
        }
        java.lang.Long l2 = this.AhwBna;
        if (l2 != null) {
            InterfaceC9731bbC interfaceC9731bbCEZpvd2 = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault().EZpvd(l2.longValue(), true);
            java.lang.Long lValueOf = interfaceC9731bbCEZpvd2 != null ? java.lang.Long.valueOf(interfaceC9731bbCEZpvd2.AhwBna()) : null;
            jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
        }
        AEQbTJ(obj, this.AhwBna, jLongValue);
    }

    public static final void dNCPSb(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(FragmentActivity fragmentActivity, dGQ dgq, java.lang.Object obj, java.lang.Long l) {
        long jLongValue;
        if (l != null && l.longValue() == -1) {
            C55326xho.toast$default(fragmentActivity.getString(dLX.Dialog.ODWQjV), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            dgq.OLrzqt(java.lang.String.valueOf(obj), "", "", (java.lang.Long) (-1L));
            return Unit.INSTANCE;
        }
        dgq.AhwBna = l;
        if (l != null) {
            InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault().EZpvd(l.longValue(), true);
            java.lang.Long lValueOf = interfaceC9731bbCEZpvd != null ? java.lang.Long.valueOf(interfaceC9731bbCEZpvd.AhwBna()) : null;
            jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
        }
        dgq.AEQbTJ(obj, l, jLongValue);
        return Unit.INSTANCE;
    }

    public static final void RcXXUw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(java.lang.String str, dGQ dgq, java.lang.Object obj, java.lang.Throwable th) {
        java.lang.Long lValueOf;
        long jLongValue;
        if (Intrinsics.EZpvd((java.lang.Object) "osmosis-1", (java.lang.Object) str)) {
            lValueOf = 706L;
        } else {
            InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault().EZpvd(706L, true);
            lValueOf = interfaceC9731bbCEZpvd != null ? java.lang.Long.valueOf(interfaceC9731bbCEZpvd.fetchVPNInfo()) : null;
        }
        dgq.AhwBna = lValueOf;
        if (lValueOf != null) {
            InterfaceC9731bbC interfaceC9731bbCEZpvd2 = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault().EZpvd(lValueOf.longValue(), true);
            java.lang.Long lValueOf2 = interfaceC9731bbCEZpvd2 != null ? java.lang.Long.valueOf(interfaceC9731bbCEZpvd2.AhwBna()) : null;
            jLongValue = lValueOf2 != null ? lValueOf2.longValue() : 0L;
        }
        dgq.AEQbTJ(obj, lValueOf, jLongValue);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getWalletByNetWork$default(dGQ dgq, java.lang.Object obj, java.lang.Long l, long j, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            j = 0;
        }
        dgq.AEQbTJ(obj, l, j);
    }

    public final void AEQbTJ(final java.lang.Object obj, final java.lang.Long l, long j) {
        if (!C14923duc.EZpvd.zsXlph()) {
            copydefault(obj, new Function0() { // from class: o.dGX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return dGQ.EZpvd(l, this, obj);
                }
            });
        } else {
            copydefault(obj, l, j);
        }
    }

    public static final Unit EZpvd(java.lang.Long l, final dGQ dgq, final java.lang.Object obj) {
        if (l != null) {
            long jLongValue = l.longValue();
            dES des = dgq.fIwbmz.get();
            if (des != null) {
                des.AEQbTJ(java.lang.Long.valueOf(jLongValue), new Function2() { // from class: o.dHw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return dGQ.EZpvd(this.AEQbTJ, obj, (InterfaceC9738bbJ) obj2, (java.lang.Long) obj3);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(dGQ dgq, java.lang.Object obj, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        if (interfaceC9738bbJ == null) {
            dgq.OLrzqt(java.lang.String.valueOf(obj), "", "", l);
        } else {
            dgq.OLrzqt(java.lang.String.valueOf(obj), interfaceC9738bbJ, l);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getWalletByNetWorkInner$default(dGQ dgq, java.lang.Object obj, java.lang.Long l, long j, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            j = 0;
        }
        dgq.copydefault(obj, l, j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.okinc.business.defi.api.constant.ChainRegisterStatus] */
    public final void copydefault(final java.lang.Object obj, final java.lang.Long l, final long j) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = ChainRegisterStatus.REGISTERED;
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(1);
        final Function1 function1 = new Function1() { // from class: o.dHN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return dGQ.EZpvd(this.KWHzl, (java.lang.Integer) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.dIt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return dGQ.QOLQEE(function1, obj2);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dIz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return dGQ.KWHzl(objectRef, l, (InterfaceC9738bbJ) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.dGO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return dGQ.gHZMYf(function12, obj2);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.dGW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return dGQ.KWHzl(objectRef2, objectRef, l, this, obj, j, (ChainRegisterStatus) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.dGT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return dGQ.DTwDnp(function13, obj2);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.dGY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return dGQ.AEQbTJ(l, (java.util.List) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtOLrzqt3.copydefault(new InterfaceC58229yxO() { // from class: o.dGZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return dGQ.OcIXYQ(function14, obj2);
            }
        });
        final Function1 function15 = new Function1() { // from class: o.dHb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return dGQ.copydefault(this.KWHzl, l, obj, (java.lang.Boolean) obj2);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dHa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                dGQ.ORxRYg(function15, obj2);
            }
        };
        final Function1 function16 = new Function1() { // from class: o.dHY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return dGQ.AEQbTJ((java.lang.Throwable) obj2);
            }
        };
        abstractC58260yxtCopydefault2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dIf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                dGQ.QKVWgx(function16, obj2);
            }
        });
    }

    public static final InterfaceC58261yxu QOLQEE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(dGQ dgq, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        InterfaceC9738bbJ interfaceC9738bbJ = dgq.AYXKKw;
        if (interfaceC9738bbJ != null) {
            AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(interfaceC9738bbJ);
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            return abstractC58260yxtCopydefault;
        }
        return ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().KWHzl();
    }

    public static final InterfaceC58261yxu gHZMYf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.bbJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu KWHzl(Ref.ObjectRef objectRef, java.lang.Long l, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        objectRef.element = interfaceC9738bbJ;
        if (l != null && l.longValue() == 9004) {
            if (C14923duc.EZpvd.AEQbTJ(interfaceC9738bbJ, l)) {
                InterfaceC9844bdJ interfaceC9844bdJ = (InterfaceC9844bdJ) C43248rlh.KWHzl.AEQbTJ(InterfaceC9844bdJ.class);
                Intrinsics.copydefault(l);
                return interfaceC9844bdJ.AEQbTJ(l.longValue(), interfaceC9738bbJ.EZpvd(l.longValue())).valueOf();
            }
            return AbstractC58260yxt.copydefault(ChainRegisterStatus.REGISTERED);
        }
        return AbstractC58260yxt.copydefault(ChainRegisterStatus.REGISTERED);
    }

    public static final InterfaceC58261yxu DTwDnp(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: com.okinc.business.defi.api.constant.ChainRegisterStatus */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu KWHzl(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, java.lang.Long l, dGQ dgq, java.lang.Object obj, long j, ChainRegisterStatus chainRegisterStatus) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(chainRegisterStatus, "");
        objectRef.element = chainRegisterStatus;
        T t = objectRef2.element;
        if (t != 0) {
            C14923duc c14923duc = C14923duc.EZpvd;
            Intrinsics.copydefault(t);
            if (c14923duc.AEQbTJ((InterfaceC9738bbJ) t, l)) {
                T t2 = objectRef2.element;
                Intrinsics.copydefault(t2);
                if (((InterfaceC9738bbJ) t2).zLjUOn() && chainRegisterStatus == ChainRegisterStatus.REGISTERED) {
                    T t3 = objectRef2.element;
                    Intrinsics.copydefault(t3);
                    if (!((InterfaceC9738bbJ) t3).ORxRYg()) {
                        T t4 = objectRef2.element;
                        Intrinsics.copydefault(t4);
                        if (!((InterfaceC9738bbJ) t4).getFieldNames()) {
                            InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) objectRef2.element;
                            dgq.AYXKKw = interfaceC9738bbJ;
                            dgq.AuCTel = interfaceC9738bbJ;
                            dgq.OLrzqt(java.lang.String.valueOf(obj), (InterfaceC9738bbJ) objectRef2.element, l);
                            throw new java.lang.Exception(TtmlNode.END);
                        }
                    }
                    T t5 = objectRef2.element;
                    Intrinsics.copydefault(t5);
                    dgq.KWHzl((InterfaceC9738bbJ) t5, obj, j);
                    throw new java.lang.Exception(TtmlNode.END);
                }
            }
        }
        return ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().gEmmrt();
    }

    public static final java.lang.Boolean OcIXYQ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final void ORxRYg(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final dGQ dgq, final java.lang.Long l, final java.lang.Object obj, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            dES des = dgq.fIwbmz.get();
            if (des != null) {
                des.AEQbTJ(l, new Function2() { // from class: o.dII
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return dGQ.OLrzqt(this.AEQbTJ, obj, (InterfaceC9738bbJ) obj2, (java.lang.Long) obj3);
                    }
                });
            }
        } else {
            FragmentActivity fragmentActivity = dgq.AEQbTJ.get();
            if (fragmentActivity != null) {
                C14923duc c14923duc = C14923duc.EZpvd;
                kotlin.Pair<java.lang.String, java.lang.String> pairUzCIH = c14923duc.uzCIH(l);
                androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                C14923duc.showConnectWalletDialog$default(c14923duc, pairUzCIH, supportFragmentManager, new Function0() { // from class: o.dIH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return dGQ.AEQbTJ(this.AEQbTJ, l);
                    }
                }, null, 8, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(dGQ dgq, java.lang.Object obj, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        if (interfaceC9738bbJ != null) {
            dgq.AYXKKw = interfaceC9738bbJ;
            dgq.AuCTel = interfaceC9738bbJ;
            dgq.OLrzqt(java.lang.String.valueOf(obj), dgq.AuCTel, l);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(dGQ dgq, java.lang.Long l) {
        dES des = dgq.fIwbmz.get();
        if (des != null) {
            des.AEQbTJ(l, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void QKVWgx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void KWHzl(final InterfaceC9738bbJ interfaceC9738bbJ, final java.lang.Object obj, long j) {
        DappTabData dappTabDataOLrzqt;
        java.lang.String mUrl;
        final FragmentActivity fragmentActivity = this.AEQbTJ.get();
        if (fragmentActivity == null || (dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt()) == null || (mUrl = dappTabDataOLrzqt.getMUrl()) == null) {
            return;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(mUrl);
        final Function1 function1 = new Function1() { // from class: o.dHp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return dGQ.KWHzl((java.lang.String) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.dHo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return dGQ.wlaJM(function1, obj2);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dHs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return dGQ.OLrzqt(interfaceC9738bbJ, fragmentActivity, (DappSupportCheck) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.KWHzl(new InterfaceC58229yxO() { // from class: o.dHu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return dGQ.AxsJAY(function12, obj2);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.dHv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return dGQ.OLrzqt(interfaceC9738bbJ, this, (DappSupportCheck) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl4 = abstractC58185ywXKWHzl3.KWHzl(new InterfaceC58229yxO() { // from class: o.dHr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return dGQ.AwvSrB(function13, obj2);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.dHt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return dGQ.OLrzqt(this.AEQbTJ, interfaceC9738bbJ, obj, (java.lang.Boolean) obj2);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dHx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                dGQ.zuBGHE(function14, obj2);
            }
        };
        final Function1 function15 = new Function1() { // from class: o.dHA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return dGQ.OLrzqt(this.KWHzl, obj, (java.lang.Throwable) obj2);
            }
        };
        abstractC58185ywXKWHzl4.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dHy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                dGQ.sSMYrx(function15, obj2);
            }
        });
    }

    public static final InterfaceC60096zvd wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return ((MpcWalletService) C43248rlh.KWHzl.AEQbTJ(MpcWalletService.class)).j_(str);
    }

    public static final InterfaceC60096zvd AxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(final InterfaceC9738bbJ interfaceC9738bbJ, final FragmentActivity fragmentActivity, final DappSupportCheck dappSupportCheck) throws ResponseFailedException {
        Intrinsics.checkNotNullParameter(dappSupportCheck, "");
        if (interfaceC9738bbJ.ORxRYg() || interfaceC9738bbJ.wlaJM()) {
            if (dappSupportCheck.getMpcResult()) {
                return AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.dHE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58187ywZ
                    public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                        dGQ.EZpvd(interfaceC9738bbJ, fragmentActivity, dappSupportCheck, interfaceC58184ywW);
                    }
                }, BackpressureStrategy.DROP);
            }
            throw new ResponseFailedException(999, C33070mpX.AYXKKw(dLX.Dialog.giSNqX), null, null, 12, null);
        }
        return AbstractC58185ywX.KWHzl(dappSupportCheck);
    }

    public static final void EZpvd(InterfaceC9738bbJ interfaceC9738bbJ, FragmentActivity fragmentActivity, final DappSupportCheck dappSupportCheck, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        ((MpcWalletService) C43248rlh.KWHzl.AEQbTJ(MpcWalletService.class)).copydefault(interfaceC9738bbJ, fragmentActivity, new Function1() { // from class: o.dHP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dGQ.EZpvd(interfaceC58184ywW, dappSupportCheck, (MpcWalletService.MpcWalletAbleStatus) obj);
            }
        });
    }

    public static final Unit EZpvd(InterfaceC58184ywW interfaceC58184ywW, DappSupportCheck dappSupportCheck, MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus) {
        Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
        if (mpcWalletAbleStatus == MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNormal) {
            interfaceC58184ywW.onNext(dappSupportCheck);
            interfaceC58184ywW.onComplete();
        } else {
            interfaceC58184ywW.onError(new ResponseFailedException(999, "", null, null, 12, null));
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd AwvSrB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(InterfaceC9738bbJ interfaceC9738bbJ, dGQ dgq, DappSupportCheck dappSupportCheck) throws ResponseFailedException {
        Intrinsics.checkNotNullParameter(dappSupportCheck, "");
        if (interfaceC9738bbJ.getFieldNames()) {
            dDW ddw = dDW.copydefault;
            PlatformItem platformItemAhwBna = dgq.AhwBna();
            if (ddw.OLrzqt(C33129mqd.gEmmrt(platformItemAhwBna != null ? java.lang.Long.valueOf(platformItemAhwBna.getId()) : null)) != null) {
                throw new ResponseFailedException(999, "", null, null, 12, null);
            }
            if (dappSupportCheck.getAaResult()) {
                return AbstractC58185ywX.KWHzl(java.lang.Boolean.TRUE);
            }
            throw new ResponseFailedException(999, C33070mpX.AYXKKw(dLX.Dialog.gasjUx), null, null, 12, null);
        }
        return AbstractC58185ywX.KWHzl(java.lang.Boolean.TRUE);
    }

    public static final void zuBGHE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(dGQ dgq, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Object obj, java.lang.Boolean bool) {
        dgq.AYXKKw = interfaceC9738bbJ;
        dgq.AuCTel = interfaceC9738bbJ;
        java.lang.Long l = dgq.AhwBna;
        if (l != null) {
            dgq.OLrzqt(java.lang.String.valueOf(obj), interfaceC9738bbJ, java.lang.Long.valueOf(l.longValue()));
        }
        return Unit.INSTANCE;
    }

    public static final void sSMYrx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public static final Unit OLrzqt(final dGQ dgq, final java.lang.Object obj, java.lang.Throwable th) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = C33070mpX.AYXKKw(dLX.Dialog.gGvvIC);
        if (th instanceof ResponseFailedException) {
            ResponseFailedException responseFailedException = (ResponseFailedException) th;
            if (responseFailedException.getCode() == 999) {
                java.lang.String message = responseFailedException.getMessage();
                T t = message;
                if (message == null) {
                    t = "";
                }
                objectRef.element = t;
            }
        }
        dgq.EZpvd(new Function2() { // from class: o.dGS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return dGQ.copydefault(this.KWHzl, obj, objectRef, (InterfaceC9738bbJ) obj2, (java.lang.Long) obj3);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(dGQ dgq, java.lang.Object obj, Ref.ObjectRef objectRef, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        if (interfaceC9738bbJ == null) {
            dgq.OLrzqt(java.lang.String.valueOf(obj), (java.lang.String) objectRef.element, "", dgq.AhwBna);
        } else {
            dgq.AhwBna = l;
            dgq.AYXKKw = interfaceC9738bbJ;
            dgq.AuCTel = interfaceC9738bbJ;
            if (l != null) {
                dgq.OLrzqt(java.lang.String.valueOf(obj), interfaceC9738bbJ, java.lang.Long.valueOf(l.longValue()));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dGQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showWalletList$default(dGQ dgq, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function2 = null;
        }
        dgq.EZpvd((Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, Unit>) function2);
    }

    public final void EZpvd(final Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, Unit> function2) {
        AbstractC58260yxt<java.util.List<InterfaceC9738bbJ>> abstractC58260yxtGEmmrt = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().gEmmrt();
        final Function1 function1 = new Function1() { // from class: o.dHB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dGQ.AEQbTJ(this.EZpvd, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtGEmmrt.copydefault(new InterfaceC58229yxO() { // from class: o.dHC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dGQ.fFgQHt(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dHJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dGQ.OLrzqt(this.AEQbTJ, function2, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dHI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dGQ.fZBcTu(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.dHK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dGQ.AYXKKw((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dHG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dGQ.dvKsVJ(function13, obj);
            }
        });
    }

    public static final java.lang.Boolean fFgQHt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final void fZBcTu(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(final dGQ dgq, final Function2 function2, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            dES des = dgq.fIwbmz.get();
            if (des != null) {
                des.AEQbTJ(dgq.AhwBna, function2);
            }
        } else {
            FragmentActivity fragmentActivity = dgq.AEQbTJ.get();
            if (fragmentActivity != null) {
                C14923duc c14923duc = C14923duc.EZpvd;
                kotlin.Pair<java.lang.String, java.lang.String> pairUzCIH = c14923duc.uzCIH(dgq.AhwBna);
                androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                C14923duc.showConnectWalletDialog$default(c14923duc, pairUzCIH, supportFragmentManager, new Function0() { // from class: o.dHe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return dGQ.KWHzl(this.AEQbTJ, function2);
                    }
                }, null, 8, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(dGQ dgq, Function2 function2) {
        dES des = dgq.fIwbmz.get();
        if (des != null) {
            des.AEQbTJ(dgq.AhwBna, function2);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void dvKsVJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void copydefault(final java.lang.Object obj, final Function0<Unit> function0) {
        final FragmentActivity fragmentActivity;
        Function0<java.lang.Boolean> function02 = this.AkhnZx;
        if ((function02 == null || function02.invoke().booleanValue()) && (fragmentActivity = this.AEQbTJ.get()) != null) {
            C14923duc c14923duc = C14923duc.EZpvd;
            kotlin.Pair<java.lang.String, java.lang.String> pairAuCTel = c14923duc.AuCTel();
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c14923duc.copydefault(pairAuCTel, supportFragmentManager, new Function0() { // from class: o.dHQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return dGQ.AEQbTJ(fragmentActivity, function0);
                }
            }, new Function0() { // from class: o.dHT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return dGQ.copydefault(this.OLrzqt, obj);
                }
            });
        }
    }

    public static final Unit AEQbTJ(FragmentActivity fragmentActivity, Function0 function0) {
        if (!fragmentActivity.isDestroyed()) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(dGQ dgq, java.lang.Object obj) {
        dgq.OLrzqt(java.lang.String.valueOf(obj), "", "", dgq.AhwBna);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        java.lang.String strEZpvd;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt != null) {
            dappTabDataOLrzqt.setConnectedByWalletConnect(false);
        }
        if (l != null) {
            long jLongValue = l.longValue();
            java.lang.String strEZpvd2 = interfaceC9738bbJ != null ? interfaceC9738bbJ.EZpvd(jLongValue) : null;
            if (strEZpvd2 == null) {
                strEZpvd2 = "";
            }
            if (jLongValue == 1666600000 || jLongValue == 2020) {
                if (interfaceC9738bbJ != null && (strEZpvd = interfaceC9738bbJ.EZpvd(1L)) != null) {
                    str2 = strEZpvd;
                }
                strEZpvd2 = str2;
            }
            if (this.valueOf == 5) {
                strEZpvd2 = l.toString();
            }
            KWHzl(l.longValue(), strEZpvd2, interfaceC9738bbJ, false);
            AEQbTJ(str, strEZpvd2, "requestAccounts");
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        KWHzl(str, str2, str3, l);
    }

    public static /* synthetic */ void notifySendError$default(dGQ dgq, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        dgq.KWHzl(str, str2, str3, l);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l) {
        StateListAnimator stateListAnimator = this.KWHzl;
        if (stateListAnimator != null) {
            stateListAnimator.AEQbTJ(str, str2, str3, l);
        }
    }

    public static /* synthetic */ void notifySendResult$default(dGQ dgq, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        dgq.AEQbTJ(str, str2, str3);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        StateListAnimator stateListAnimator = this.KWHzl;
        if (stateListAnimator != null) {
            stateListAnimator.AEQbTJ(str, str2, str3);
        }
    }

    public final void KWHzl(long j, java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, boolean z) {
        StateListAnimator stateListAnimator = this.KWHzl;
        if (stateListAnimator != null) {
            stateListAnimator.copydefault(j, str, interfaceC9738bbJ, z);
        }
    }

    public final void AEQbTJ(java.lang.Object obj, int i, java.lang.String str) throws JSONException {
        C13241dEa mWebView;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", i);
        jSONObject.put("message", str);
        java.lang.String strFJNWhG = C59442zhC.fJNWhG("\n                      window.okxwallet.sendError(" + obj + ", `" + jSONObject + "`)\n                        ");
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null) {
            return;
        }
        mWebView.evaluateJavascript(strFJNWhG, null);
    }

    public final void KWHzl(final long j, @NotNull final java.lang.Object obj) throws JSONException {
        final C13241dEa mWebView;
        java.lang.Object next;
        DappTabData dappTabDataUzCIH;
        Intrinsics.checkNotNullParameter(obj, "");
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null) {
            return;
        }
        if (j == -1) {
            java.lang.String string = mWebView.getContext().getString(dLX.Dialog.ODWQjV);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AEQbTJ(obj, 4902, string);
            return;
        }
        java.util.Iterator<T> it = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().KWHzl(true).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC9731bbC) next).fetchVPNInfo() == j) {
                    break;
                }
            }
        }
        if (next != null) {
            java.lang.Long lQKVWgx = mWebView.QKVWgx();
            if (lQKVWgx == null || lQKVWgx.longValue() != j) {
                C14923duc c14923duc = C14923duc.EZpvd;
                android.content.Context context = mWebView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c14923duc.OLrzqt(context, j);
            }
            mWebView.setSelectedChain(java.lang.Long.valueOf(j));
            dES des = mWebView.aKErDB().get();
            if (des == null || (dappTabDataUzCIH = des.uzCIH()) == null) {
                return;
            }
            dappTabDataUzCIH.setCurrentChain(j, new Function2() { // from class: o.dHj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return dGQ.KWHzl(mWebView, this, j, obj, (java.lang.String) obj2, ((java.lang.Long) obj3).longValue());
                }
            });
            return;
        }
        java.lang.String string2 = mWebView.getContext().getString(dLX.Dialog.ODWQjV);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        AEQbTJ(obj, 4902, string2);
    }

    public static final Unit KWHzl(C13241dEa c13241dEa, dGQ dgq, long j, java.lang.Object obj, java.lang.String str, long j2) {
        java.lang.String strEZpvd;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        c13241dEa.setCurrentWallet(dgq.AYXKKw);
        InterfaceC9738bbJ interfaceC9738bbJ = dgq.AYXKKw;
        java.lang.String strEZpvd2 = interfaceC9738bbJ != null ? interfaceC9738bbJ.EZpvd(j) : null;
        if (strEZpvd2 == null) {
            strEZpvd2 = "";
        }
        c13241dEa.setAddress(strEZpvd2);
        dGQ dgqRcXXUw = c13241dEa.RcXXUw();
        if (dgqRcXXUw != null) {
            dgqRcXXUw.AhwBna = java.lang.Long.valueOf(j);
        }
        if (j == 1666600000 || j == 2020) {
            InterfaceC9738bbJ interfaceC9738bbJ2 = dgq.AuCTel;
            if (interfaceC9738bbJ2 != null && (strEZpvd = interfaceC9738bbJ2.EZpvd(1L)) != null) {
                str2 = strEZpvd;
            }
            c13241dEa.setAddress(str2);
        }
        c13241dEa.setEvmAddress(c13241dEa.AEQbTJ());
        c13241dEa.gEmmrt(C33129mqd.gEmmrt(c13241dEa.AEQbTJ()));
        dES des = c13241dEa.aKErDB().get();
        if (des != null) {
            des.AEQbTJ(java.lang.Long.valueOf(j), C33129mqd.gEmmrt(c13241dEa.AEQbTJ()), dgq.AYXKKw, false);
        }
        c13241dEa.evaluateJavascript("window.okxwallet.sendResponse(" + obj + ", null)", null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void checkJsChain$default(dGQ dgq, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        dgq.EZpvd(str, (Function0<Unit>) function0);
    }

    public final void EZpvd(final java.lang.String str, final Function0<Unit> function0) {
        C13241dEa mWebView;
        if (this.valueOf == 0 && C15114dyH.AEQbTJ()) {
            DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
            if (dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null) {
                return;
            }
            mWebView.evaluateJavascript("window.okxwallet.eth_chainId()", new android.webkit.ValueCallback() { // from class: o.dHm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    dGQ.OLrzqt(this.AEQbTJ, function0, str, (java.lang.String) obj);
                }
            });
            return;
        }
        function0.invoke();
    }

    public static final void OLrzqt(final dGQ dgq, Function0 function0, final java.lang.String str, final java.lang.String str2) {
        java.lang.String strSubstring;
        C13241dEa mWebView;
        try {
            Result.Application application = Result.Companion;
            Intrinsics.copydefault((java.lang.Object) str2);
            Unit unit = null;
            if (C59449zhJ.startsWith$default(str2, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, false, 2, null) && C59449zhJ.endsWith$default(str2, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, false, 2, null)) {
                strSubstring = str2.substring(1, str2.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            } else {
                strSubstring = str2;
            }
            final Ref.LongRef longRef = new Ref.LongRef();
            Intrinsics.copydefault((java.lang.Object) strSubstring);
            java.lang.String strSubstring2 = strSubstring.substring(2);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            longRef.element = java.lang.Long.parseLong(strSubstring2, 16);
            InterfaceC9731bbC interfaceC9731bbCOLrzqt = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault().OLrzqt(longRef.element, true);
            if (Intrinsics.EZpvd(interfaceC9731bbCOLrzqt != null ? java.lang.Long.valueOf(interfaceC9731bbCOLrzqt.fetchVPNInfo()) : null, dgq.AhwBna)) {
                function0.invoke();
                unit = Unit.INSTANCE;
            } else {
                C55326xho.toast$default(C33070mpX.AYXKKw(dLX.Dialog.UlJrfe), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
                if (dappTabDataOLrzqt != null && (mWebView = dappTabDataOLrzqt.getMWebView()) != null) {
                    mWebView.evaluateJavascript("window.okxwallet.okxVersion", new android.webkit.ValueCallback() { // from class: o.dIL
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(java.lang.Object obj) {
                            dGQ.OLrzqt(this.copydefault, str2, longRef, str, (java.lang.String) obj);
                        }
                    });
                    unit = Unit.INSTANCE;
                }
            }
            Result.m7377constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final void OLrzqt(dGQ dgq, java.lang.String str, Ref.LongRef longRef, java.lang.String str2, java.lang.String str3) {
        C13241dEa mWebView;
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
        if (dappTabDataOLrzqt != null && (mWebView = dappTabDataOLrzqt.getMWebView()) != null) {
            mWebView.reload();
        }
        DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
        java.lang.String strEZpvd = null;
        java.lang.String mUrl = dappTabDataOLrzqt2 != null ? dappTabDataOLrzqt2.getMUrl() : null;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(dgq.AhwBna);
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(java.lang.Long.valueOf(longRef.element));
        InterfaceC9738bbJ interfaceC9738bbJ = dgq.AYXKKw;
        if (interfaceC9738bbJ != null) {
            java.lang.Long l = dgq.AhwBna;
            strEZpvd = interfaceC9738bbJ.EZpvd(l != null ? l.longValue() : 1L);
        }
        C15151dys.KWHzl(mUrl, "checkJSChain", strGEmmrt, str, strGEmmrt2, strEZpvd, str2, str3);
    }

    public static final java.lang.Boolean AEQbTJ(java.lang.Long l, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
            if (!C14923duc.EZpvd.EZpvd(interfaceC9738bbJ, l)) {
                if (interfaceC9738bbJ.fetchVPNInfo(l != null ? l.longValue() : 0L)) {
                }
            }
            arrayList.add(obj);
        }
        return java.lang.Boolean.valueOf(C33129mqd.KWHzl((java.util.Collection) arrayList));
    }

    public static final java.lang.Boolean AEQbTJ(dGQ dgq, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (C14923duc.EZpvd.EZpvd((InterfaceC9738bbJ) obj, dgq.AhwBna)) {
                arrayList.add(obj);
            }
        }
        return java.lang.Boolean.valueOf(C33129mqd.KWHzl((java.util.Collection) arrayList));
    }
}
