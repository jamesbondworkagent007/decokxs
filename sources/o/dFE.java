package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.dapp.net.TonConnectItem;
import com.okinc.business.defi.dapp.net.TonConnectRequest;
import com.okinc.business.defi.dapp.webview.TonWebAppInterface$getTonProfResult$1;
import com.okinc.business.defi.dapp.webview.TonWebAppInterface$getTonProfResult$dappDetail$1;
import com.okinc.business.defi.dapp.webview.TonWebAppInterface$onWalletAndNetSelect$2$1;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import o.dLX;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class dFE extends dAX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int gEmmrt = 8;
    public final java.lang.String AYXKKw;
    public Application AhwBna;
    public final java.util.HashMap<java.lang.String, java.util.Set<java.lang.String>> djBIcL;
    public final C15059dxF valueOf;

    public interface Application {
        void AEQbTJ(@NotNull java.lang.Object obj, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Integer num);

        void copydefault();

        void copydefault(@NotNull java.lang.Object obj, @NotNull android.os.Bundle bundle, @NotNull java.lang.String str);

        void copydefault(@NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dFE(@NotNull WeakReference<FragmentActivity> weakReference, Application application, @NotNull WeakReference<dES> weakReference2) {
        super(9, weakReference, weakReference2);
        Intrinsics.checkNotNullParameter(weakReference, "");
        Intrinsics.checkNotNullParameter(weakReference2, "");
        this.AhwBna = application;
        this.AYXKKw = dFE.class.getSimpleName();
        this.valueOf = new C15059dxF();
        this.djBIcL = new java.util.HashMap<>();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dFE.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @android.webkit.JavascriptInterface
    public final void postMessage(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            EZpvd(new Function1() { // from class: o.dFH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dFE.copydefault(this.KWHzl, str, (java.lang.String) obj);
                }
            });
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("dappwebview", "TonWebAppInterface", e);
        }
    }

    public static final Unit copydefault(final dFE dfe, final java.lang.String str, java.lang.String str2) {
        FragmentActivity fragmentActivity = dfe.EZpvd().get();
        if (fragmentActivity != null) {
            fragmentActivity.runOnUiThread(new java.lang.Runnable() { // from class: o.dFG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    dFE.AEQbTJ(this.copydefault, str);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(dFE dfe, java.lang.String str) throws JSONException {
        if (dfe.KWHzl()) {
            dfe.KWHzl(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, org.json.JSONObject] */
    public final void KWHzl(@NotNull java.lang.String str) throws JSONException {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl(this.AYXKKw, str);
        JSONObject jSONObject = new JSONObject(str);
        final java.lang.Object obj = jSONObject.get("id");
        if (C33129mqd.valueOf(obj) == 0) {
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (jSONObject.has("object")) {
            if (jSONObject.get("object") instanceof JSONObject) {
                java.lang.Object obj2 = jSONObject.get("object");
                Intrinsics.copydefault(obj2, "");
                objectRef.element = (JSONObject) obj2;
            } else if (jSONObject.get("object") instanceof JSONArray) {
                java.lang.Object obj3 = jSONObject.get("object");
                Intrinsics.copydefault(obj3, "");
                objectRef.element = (JSONArray) obj3;
            }
        }
        java.lang.Object obj4 = jSONObject.get("name");
        if (Intrinsics.EZpvd(obj4, (java.lang.Object) "tonConnect_connect")) {
            if (objectRef.element != 0) {
                KWHzl(607L, C56424yEw.AYXKKw(C56390yDp.OLrzqt("id", obj), C56390yDp.OLrzqt("connectRequest", objectRef.element), C56390yDp.OLrzqt(FirebaseAnalytics.Param.METHOD, "tonConnect_connect")));
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd(obj4, (java.lang.Object) "tonConnect_reconnect")) {
            if (objectRef.element != 0) {
                AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().KWHzl();
                final Function1 function1 = new Function1() { // from class: o.dFJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj5) {
                        return dFE.AEQbTJ(this.KWHzl, obj, objectRef, (InterfaceC9738bbJ) obj5);
                    }
                };
                InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dFK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj5) {
                        dFE.ejfBZ(function1, obj5);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.dFM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj5) {
                        return dFE.copydefault((java.lang.Throwable) obj5);
                    }
                };
                abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dFO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj5) {
                        dFE.fJNWhG(function12, obj5);
                    }
                });
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd(obj4, (java.lang.Object) "tonConnect_sendTransaction")) {
            T t = objectRef.element;
            Intrinsics.copydefault(t, "");
            if (OLrzqt((JSONArray) t)) {
                Intrinsics.copydefault(obj);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(MetricsSQLiteCacheKt.METRICS_PARAMS, objectRef.element);
                Unit unit = Unit.INSTANCE;
                AEQbTJ(obj, jSONObject2);
                return;
            }
            Intrinsics.copydefault(obj);
            notifySendError$default(this, obj, "", "tonConnect_sendTransaction", null, 8, null);
            Application application = this.AhwBna;
            if (application != null) {
                application.copydefault();
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd(obj4, (java.lang.Object) "tonConnect_disconnect")) {
            EZpvd((InterfaceC9738bbJ) null);
            Application application2 = this.AhwBna;
            if (application2 != null) {
                Intrinsics.copydefault(obj);
                application2.copydefault(obj, new android.os.Bundle(), "tonConnect_disconnect");
            }
        }
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(dFE dfe, java.lang.Object obj, Ref.ObjectRef objectRef, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.copydefault(interfaceC9738bbJ);
        if (!dfe.AEQbTJ(dfe.copydefault(interfaceC9738bbJ))) {
            Intrinsics.copydefault(obj);
            notifySendError$default(dfe, obj, "", "tonConnect_reconnect", null, 8, null);
            return Unit.INSTANCE;
        }
        dfe.EZpvd(interfaceC9738bbJ, (java.lang.Long) 607L, C56424yEw.AYXKKw(C56390yDp.OLrzqt("id", obj), C56390yDp.OLrzqt("connectRequest", objectRef.element), C56390yDp.OLrzqt(FirebaseAnalytics.Param.METHOD, "tonConnect_reconnect")));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void copydefault(java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, final Function1<? super java.lang.String, Unit> function1, final Function0<Unit> function0) {
        java.lang.String strDbNXlk;
        FragmentActivity fragmentActivity = EZpvd().get();
        if (fragmentActivity != null) {
            dES des = copydefault().get();
            if (des != null) {
                des.dismissLoading();
            }
            if (interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) {
                strDbNXlk = "";
            }
            dFN.startSignDappWithReport$default("", fragmentActivity, new DappSignArgs(strDbNXlk, C33129mqd.gEmmrt(607L), AEQbTJ(), str, false, 2, "dapp", null, false, false, null, null, null, null, null, false, null, 130944, null), new Function1() { // from class: o.dFI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dFE.EZpvd(function0, function1, (android.os.Bundle) obj);
                }
            }, null, 16, null);
        }
    }

    public static final Unit EZpvd(Function0 function0, Function1 function1, android.os.Bundle bundle) {
        if (bundle == null || bundle.getInt("result") == 0) {
            function0.invoke();
        } else {
            java.lang.String string = bundle.getString("data");
            if (string != null) {
                function1.invoke(string);
            }
        }
        return Unit.INSTANCE;
    }

    public final boolean OLrzqt(JSONArray jSONArray) {
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt;
        java.util.List<C9756bbb> listDvKsVJ;
        if (OLrzqt() == null) {
            return false;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                java.lang.String strOptString = jSONObjectOptJSONObject.optString("from");
                Intrinsics.copydefault((java.lang.Object) strOptString);
                if (!(true ^ StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOptString))) {
                    strOptString = null;
                }
                if (strOptString != null && (interfaceC9738bbJOLrzqt = OLrzqt()) != null && (listDvKsVJ = interfaceC9738bbJOLrzqt.dvKsVJ()) != null) {
                    if (!listDvKsVJ.isEmpty()) {
                        java.util.Iterator<T> it = listDvKsVJ.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.EZpvd((java.lang.Object) ((C9756bbb) it.next()).OLrzqt(), (java.lang.Object) strOptString)) {
                                break;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void AEQbTJ(final java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String strDbNXlk;
        FragmentActivity fragmentActivity = EZpvd().get();
        if (fragmentActivity != null) {
            djBIcL();
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = OLrzqt();
            if (interfaceC9738bbJOLrzqt == null || (strDbNXlk = interfaceC9738bbJOLrzqt.DbNXlk()) == null) {
                strDbNXlk = "";
            }
            java.lang.String str = strDbNXlk;
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(607L);
            PlatformItem platformItemAEQbTJ = AEQbTJ();
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(obj2);
            Gson gson = new Gson();
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            PlatformItem platformItemAEQbTJ2 = AEQbTJ();
            pairArr[0] = C56390yDp.OLrzqt("dappUrl", platformItemAEQbTJ2 != null ? platformItemAEQbTJ2.getUrl() : null);
            pairArr[1] = C56390yDp.OLrzqt("signDataJson", C33129mqd.gEmmrt(obj2));
            dFN.startContractInteractionWithReport$default("tonConnect_sendTransaction", fragmentActivity, new DappInteractionArgs(str, null, strGEmmrt, platformItemAEQbTJ, strGEmmrt2, null, "dapp", 2, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, null, null, 6, gson.toJson(C56424yEw.gEmmrt(pairArr)), null, null, null, null, -201359582, null), new Function1() { // from class: o.dFF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return dFE.EZpvd(this.OLrzqt, obj, (android.os.Bundle) obj3);
                }
            }, null, null, 32, null);
        }
    }

    public static final Unit EZpvd(dFE dfe, java.lang.Object obj, android.os.Bundle bundle) {
        if (bundle == null || bundle.getInt("result") == 0) {
            dfe.KWHzl(obj, C33070mpX.AYXKKw(dLX.Dialog.AxsJAY), "tonConnect_sendTransaction", (java.lang.Integer) 300);
        } else {
            Application application = dfe.AhwBna;
            if (application != null) {
                application.copydefault(obj, bundle, "tonConnect_sendTransaction");
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.dAX
    public void EZpvd(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l, java.util.HashMap<java.lang.String, java.lang.Object> map) {
        java.lang.Object obj = map != null ? map.get("id") : null;
        java.lang.String strValueOf = java.lang.String.valueOf(map != null ? map.get(FirebaseAnalytics.Param.METHOD) : null);
        TonConnectRequest tonConnectRequest = (TonConnectRequest) new Gson().fromJson(C33129mqd.gEmmrt((JSONObject) (map != null ? map.get("connectRequest") : null)), TonConnectRequest.class);
        if (interfaceC9738bbJ == null || l == null || l.longValue() != 607) {
            if (obj != null) {
                notifySendError$default(this, obj, "", strValueOf, null, 8, null);
            }
        } else {
            FragmentActivity fragmentActivity = EZpvd().get();
            if (fragmentActivity != null) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new TonWebAppInterface$onWalletAndNetSelect$2$1(tonConnectRequest, this, interfaceC9738bbJ, obj, strValueOf, null), 3, null);
            }
        }
    }

    public final void djBIcL() {
        java.lang.String strCopydefault;
        Application application = this.AhwBna;
        if (application != null) {
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = OLrzqt();
            if (interfaceC9738bbJOLrzqt == null || (strCopydefault = copydefault(interfaceC9738bbJOLrzqt)) == null) {
                strCopydefault = "";
            }
            application.copydefault(strCopydefault, OLrzqt());
        }
    }

    public final java.lang.String OLrzqt(InterfaceC9738bbJ interfaceC9738bbJ) {
        java.lang.Object next;
        java.util.Iterator<T> it = interfaceC9738bbJ.dvKsVJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C9756bbb) next).EZpvd() == 0) {
                break;
            }
        }
        C9756bbb c9756bbb = (C9756bbb) next;
        return C33129mqd.gEmmrt(c9756bbb != null ? c9756bbb.OLrzqt() : null);
    }

    public final java.lang.String copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
        java.lang.Object next;
        java.util.Iterator<T> it = interfaceC9738bbJ.dvKsVJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C9756bbb) next).EZpvd() == 1) {
                break;
            }
        }
        C9756bbb c9756bbb = (C9756bbb) next;
        return C33129mqd.gEmmrt(c9756bbb != null ? c9756bbb.OLrzqt() : null);
    }

    public final void OLrzqt(java.lang.String str) {
        java.lang.String url;
        java.util.Set<java.lang.String> orDefault = this.djBIcL.getOrDefault(str, new LinkedHashSet());
        java.lang.String str2 = "";
        Intrinsics.checkNotNullExpressionValue(orDefault, "");
        java.util.Set<java.lang.String> set = orDefault;
        C14923duc c14923duc = C14923duc.EZpvd;
        PlatformItem platformItemAEQbTJ = AEQbTJ();
        if (platformItemAEQbTJ != null && (url = platformItemAEQbTJ.getUrl()) != null) {
            str2 = url;
        }
        set.add(c14923duc.KWHzl(str2));
        this.djBIcL.put(str, set);
    }

    public final boolean AEQbTJ(java.lang.String str) {
        java.util.HashMap<java.lang.String, java.util.Set<java.lang.String>> map = this.djBIcL;
        java.util.Set<java.lang.String> set = map != null ? map.get(str) : null;
        PlatformItem platformItemAEQbTJ = AEQbTJ();
        if (platformItemAEQbTJ != null) {
            java.lang.Boolean boolValueOf = set != null ? java.lang.Boolean.valueOf(set.contains(C14923duc.EZpvd.KWHzl(platformItemAEQbTJ.getUrl()))) : null;
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
        }
        return false;
    }

    public final JsonObject AYXKKw(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "ton_addr");
        jsonObject.addProperty(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, OLrzqt(interfaceC9738bbJ));
        jsonObject.addProperty("network", "-239");
        jsonObject.addProperty("publicKey", interfaceC9738bbJ.OLrzqt(607L));
        C9757bbc c9757bbcDxcTrN = interfaceC9738bbJ.dxcTrN();
        jsonObject.addProperty("walletStateInit", C33129mqd.gEmmrt(c9757bbcDxcTrN != null ? c9757bbcDxcTrN.AEQbTJ() : null));
        return jsonObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull TonConnectItem tonConnectItem, InterfaceC9738bbJ interfaceC9738bbJ, @NotNull Continuation<? super JsonObject> continuation) throws java.lang.Throwable {
        TonWebAppInterface$getTonProfResult$1 tonWebAppInterface$getTonProfResult$1;
        dFE dfe;
        JsonPrimitive jsonPrimitive;
        java.lang.String contentOrNull;
        if (continuation instanceof TonWebAppInterface$getTonProfResult$1) {
            tonWebAppInterface$getTonProfResult$1 = (TonWebAppInterface$getTonProfResult$1) continuation;
            int i = tonWebAppInterface$getTonProfResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tonWebAppInterface$getTonProfResult$1.label = i - Integer.MIN_VALUE;
            } else {
                tonWebAppInterface$getTonProfResult$1 = new TonWebAppInterface$getTonProfResult$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = tonWebAppInterface$getTonProfResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tonWebAppInterface$getTonProfResult$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            EZpvd().get();
            dES des = copydefault().get();
            if (des != null) {
                des.showLoading();
            }
            CoroutineDispatcher io2 = Dispatchers.getIO();
            TonWebAppInterface$getTonProfResult$dappDetail$1 tonWebAppInterface$getTonProfResult$dappDetail$1 = new TonWebAppInterface$getTonProfResult$dappDetail$1(str, null);
            tonWebAppInterface$getTonProfResult$1.L$0 = this;
            tonWebAppInterface$getTonProfResult$1.L$1 = tonConnectItem;
            tonWebAppInterface$getTonProfResult$1.L$2 = interfaceC9738bbJ;
            tonWebAppInterface$getTonProfResult$1.label = 1;
            objWithContext = BuildersKt.withContext(io2, tonWebAppInterface$getTonProfResult$dappDetail$1, tonWebAppInterface$getTonProfResult$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            dfe = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            interfaceC9738bbJ = (InterfaceC9738bbJ) tonWebAppInterface$getTonProfResult$1.L$2;
            tonConnectItem = (TonConnectItem) tonWebAppInterface$getTonProfResult$1.L$1;
            dfe = (dFE) tonWebAppInterface$getTonProfResult$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        JsonElement jsonElement = (JsonElement) ((kotlinx.serialization.json.JsonObject) objWithContext).get((java.lang.Object) "url");
        if (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null || (contentOrNull = JsonElementKt.getContentOrNull(jsonPrimitive)) == null) {
            throw new java.lang.IllegalArgumentException("URL not found in dappDetail");
        }
        tonConnectItem.setUrl(contentOrNull);
        tonWebAppInterface$getTonProfResult$1.L$0 = dfe;
        tonWebAppInterface$getTonProfResult$1.L$1 = tonConnectItem;
        tonWebAppInterface$getTonProfResult$1.L$2 = interfaceC9738bbJ;
        tonWebAppInterface$getTonProfResult$1.label = 2;
        C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(tonWebAppInterface$getTonProfResult$1));
        java.lang.String json = new Gson().toJson(tonConnectItem);
        Intrinsics.checkNotNullExpressionValue(json, "");
        dfe.copydefault(json, interfaceC9738bbJ, new Activity(c56434yFf), new ActionBar(c56434yFf));
        objWithContext = c56434yFf.KWHzl();
        if (objWithContext == C56442yFn.copydefault()) {
            C56447yFs.copydefault(tonWebAppInterface$getTonProfResult$1);
        }
        return objWithContext == objCopydefault ? objCopydefault : objWithContext;
    }

    public static final class ActionBar implements Function0<Unit> {
        public final /* synthetic */ Continuation<JsonObject> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super com.google.gson.JsonObject> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Continuation<? super JsonObject> continuation) {
            this.copydefault = continuation;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public final void OLrzqt() {
            Continuation<JsonObject> continuation = this.copydefault;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("sign error"))));
        }
    }

    public static final class Activity implements Function1<java.lang.String, Unit> {
        public final /* synthetic */ Continuation<JsonObject> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super com.google.gson.JsonObject> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(Continuation<? super JsonObject> continuation) {
            this.EZpvd = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            OLrzqt(str);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(str);
            if (jsonObjectOLrzqt != null) {
                Continuation<JsonObject> continuation = this.EZpvd;
                Result.Application application = Result.Companion;
                continuation.resumeWith(Result.m7377constructorimpl(jsonObjectOLrzqt));
            }
        }
    }

    public static /* synthetic */ void notifySendError$default(dFE dfe, java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            num = 0;
        }
        dfe.KWHzl(obj, str, str2, num);
    }

    public final void KWHzl(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        Application application = this.AhwBna;
        if (application != null) {
            application.AEQbTJ(obj, str, str2, num);
        }
    }
}
