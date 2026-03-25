package o;

import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.google.gson.Gson;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.SolanaMethod;
import com.okinc.business.defi.dapp.net.OKCheckLeveldappInfo;
import com.okinc.network.okg.response.ResponseData;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.InterfaceC9737bbI;
import o.dLX;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.dFf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13273dFf extends dAX {
    public final java.lang.String AhwBna;
    public InterfaceC9738bbJ AkhnZx;
    public Activity djBIcL;
    public boolean fetchVPNInfo;
    public Application gEmmrt;
    public boolean isConnected;
    public long valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AYXKKw = 8;

    /* JADX INFO: renamed from: o.dFf$Activity */
    public interface Activity {
        void EZpvd(android.os.Bundle bundle, boolean z);

        void OLrzqt(android.os.Bundle bundle, boolean z);

        void copydefault(android.os.Bundle bundle, boolean z);
    }

    /* JADX INFO: renamed from: o.dFf$Application */
    public interface Application {
        void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z);

        void KWHzl(java.lang.Long l, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, boolean z);

        void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z);

        void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(InterfaceC9738bbJ interfaceC9738bbJ) {
        this.AkhnZx = interfaceC9738bbJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(long j) {
        this.valueOf = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13273dFf(@NotNull WeakReference<FragmentActivity> weakReference, Application application, Activity activity, @NotNull WeakReference<dES> weakReference2) {
        super(1, weakReference, weakReference2);
        Intrinsics.checkNotNullParameter(weakReference, "");
        Intrinsics.checkNotNullParameter(weakReference2, "");
        this.gEmmrt = application;
        this.djBIcL = activity;
        this.AhwBna = C13273dFf.class.getName();
        InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd();
        this.valueOf = interfaceC9731bbCEZpvd != null ? interfaceC9731bbCEZpvd.fetchVPNInfo() : 501L;
    }

    /* JADX INFO: renamed from: o.dFf$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dFf.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @android.webkit.JavascriptInterface
    public final void postMessage(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            EZpvd(new Function1() { // from class: o.dFm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13273dFf.OLrzqt(this.EZpvd, str, (java.lang.String) obj);
                }
            });
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("dappwebview", "solana", e);
        }
    }

    public static final Unit OLrzqt(final C13273dFf c13273dFf, final java.lang.String str, final java.lang.String str2) {
        final FragmentActivity fragmentActivity = c13273dFf.EZpvd().get();
        if (fragmentActivity != null) {
            fragmentActivity.runOnUiThread(new java.lang.Runnable() { // from class: o.dFs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C13273dFf.EZpvd(fragmentActivity, str2, c13273dFf, str);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(FragmentActivity fragmentActivity, java.lang.String str, final C13273dFf c13273dFf, final java.lang.String str2) {
        try {
            C14923duc.checkUrl$default(C14923duc.EZpvd, fragmentActivity, str, null, null, null, null, null, null, null, null, new yHO() { // from class: o.dFl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C13273dFf.EZpvd(this.copydefault, str2, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), (OKCheckLeveldappInfo) obj3);
                }
            }, PointerIconCompat.TYPE_GRAB, null);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("dappwebview", "solana", e);
        }
    }

    public static final Unit EZpvd(C13273dFf c13273dFf, java.lang.String str, boolean z, boolean z2, OKCheckLeveldappInfo oKCheckLeveldappInfo) throws JSONException {
        c13273dFf.OLrzqt(str);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [139=7] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: T */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v17, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.String] */
    public final void OLrzqt(@NotNull java.lang.String str) throws JSONException {
        FragmentActivity fragmentActivity;
        FragmentActivity fragmentActivity2;
        FragmentActivity fragmentActivity3;
        java.lang.String str2;
        FragmentActivity fragmentActivity4;
        Intrinsics.checkNotNullParameter(str, "");
        JSONObject jSONObject = new JSONObject(str);
        C33495mxY.KWHzl(this.AhwBna, str);
        final java.lang.Object obj = jSONObject.get("id");
        if (C33129mqd.valueOf(obj) == 0) {
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        java.lang.Object obj2 = jSONObject.get(MetricsSQLiteCacheKt.METRICS_PARAMS);
        Intrinsics.copydefault(obj2, "");
        final JSONObject jSONObject2 = (JSONObject) obj2;
        this.fetchVPNInfo = jSONObject2.optBoolean("isSVM");
        if (jSONObject2.has("message")) {
            objectRef.element = jSONObject2.getString("message");
        } else if (jSONObject2.has("messages")) {
            objectRef.element = jSONObject2.getString("messages");
        }
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = "";
        if (jSONObject2.has("transaction")) {
            objectRef2.element = jSONObject2.getString("transaction");
        } else if (jSONObject2.has("transactions")) {
            objectRef2.element = jSONObject2.getString("transactions");
        }
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        ?? GEmmrt = C33129mqd.gEmmrt(jSONObject.get("name"));
        objectRef3.element = GEmmrt;
        switch (GEmmrt.hashCode()) {
            case -1674054119:
                if (GEmmrt.equals("signAllTransactions") && (fragmentActivity = EZpvd().get()) != null) {
                    C14923duc.EZpvd.EZpvd(fragmentActivity, this.valueOf, 501L, new Function0() { // from class: o.dFe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C13273dFf.KWHzl(this.EZpvd, obj, objectRef2);
                        }
                    }, new Function0() { // from class: o.dFb
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C13273dFf.OLrzqt(this.OLrzqt, obj);
                        }
                    });
                }
                break;
            case -1414621704:
                if (GEmmrt.equals("getNetwork")) {
                    final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                    java.util.HashMap<java.lang.String, java.lang.String> mapFARcdN = C14923duc.EZpvd.fARcdN();
                    if (mapFARcdN != null) {
                        final Function2 function2 = new Function2() { // from class: o.dFj
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                                return C13273dFf.copydefault(this.AEQbTJ, obj, objectRef3, booleanRef, (java.lang.String) obj3, (java.lang.String) obj4);
                            }
                        };
                        mapFARcdN.forEach(new java.util.function.BiConsumer() { // from class: o.dFn
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // java.util.function.BiConsumer
                            public final void accept(java.lang.Object obj3, java.lang.Object obj4) {
                                C13273dFf.EZpvd(function2, obj3, obj4);
                            }
                        });
                    }
                    if (!booleanRef.element) {
                        copydefault(C33129mqd.gEmmrt(obj), "", (java.lang.String) objectRef3.element);
                    }
                    break;
                }
                break;
            case -79086710:
                if (GEmmrt.equals("signMessage") && (fragmentActivity2 = EZpvd().get()) != null) {
                    C14923duc.EZpvd.EZpvd(fragmentActivity2, this.valueOf, 501L, new Function0() { // from class: o.dFh
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C13273dFf.copydefault(this.OLrzqt, obj, objectRef);
                        }
                    }, new Function0() { // from class: o.dFg
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C13273dFf.djBIcL(this.OLrzqt, obj);
                        }
                    });
                }
                break;
            case 698324193:
                if (GEmmrt.equals("signTransaction") && (fragmentActivity3 = EZpvd().get()) != null) {
                    C14923duc.EZpvd.EZpvd(fragmentActivity3, this.valueOf, 501L, new Function0() { // from class: o.dFu
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C13273dFf.valueOf(this.copydefault, obj, objectRef);
                        }
                    }, new Function0() { // from class: o.dFr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C13273dFf.gEmmrt(this.OLrzqt, obj);
                        }
                    });
                }
                break;
            case 864442462:
                if (GEmmrt.equals("changeNetwork") && jSONObject2.has("genesisHash")) {
                    java.lang.String strOptString = jSONObject2.optString("genesisHash");
                    java.util.HashMap<java.lang.String, java.lang.String> mapFARcdN2 = C14923duc.EZpvd.fARcdN();
                    java.lang.Long lValueOf = (mapFARcdN2 == null || (str2 = mapFARcdN2.get(strOptString)) == null) ? null : java.lang.Long.valueOf(C33129mqd.valueOf(str2));
                    if (lValueOf == null) {
                        copydefault(C33129mqd.gEmmrt(obj), "", (java.lang.String) objectRef3.element);
                    } else {
                        long jLongValue = lValueOf.longValue();
                        InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), jLongValue, false, 2, null);
                        if (chainMetaWithRealChainId$default != null && chainMetaWithRealChainId$default.fARcdN()) {
                            this.valueOf = jLongValue;
                            java.lang.String strGEmmrt = C33129mqd.gEmmrt(obj);
                            Intrinsics.copydefault((java.lang.Object) strOptString);
                            AEQbTJ(strGEmmrt, strOptString, (java.lang.String) objectRef3.element);
                            KWHzl(java.lang.String.valueOf(obj), OLrzqt(), lValueOf);
                        } else {
                            copydefault(C33129mqd.gEmmrt(obj), "", (java.lang.String) objectRef3.element);
                        }
                    }
                }
                break;
            case 951351530:
                if (GEmmrt.equals("connect")) {
                    KWHzl(this.valueOf, C56424yEw.AYXKKw(C56390yDp.OLrzqt("id", obj)));
                    break;
                }
                break;
            case 2021990396:
                if (GEmmrt.equals("signAndSendTransaction") && (fragmentActivity4 = EZpvd().get()) != null) {
                    C14923duc.EZpvd.EZpvd(fragmentActivity4, this.valueOf, 501L, new Function0() { // from class: o.dFk
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C13273dFf.copydefault(this.AEQbTJ, obj, jSONObject2);
                        }
                    }, new Function0() { // from class: o.dFi
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C13273dFf.valueOf(this.OLrzqt, obj);
                        }
                    });
                }
                break;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit valueOf(C13273dFf c13273dFf, java.lang.Object obj, Ref.ObjectRef objectRef) {
        Intrinsics.copydefault(obj);
        c13273dFf.copydefault(obj, (java.lang.String) objectRef.element);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C13273dFf c13273dFf, java.lang.Object obj) {
        c13273dFf.AEQbTJ(C33129mqd.gEmmrt(obj), "", "signTransaction");
        Activity activity = c13273dFf.djBIcL;
        if (activity != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("result", 0);
            activity.EZpvd(bundle, c13273dFf.fetchVPNInfo);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C13273dFf c13273dFf, java.lang.Object obj, Ref.ObjectRef objectRef) {
        Intrinsics.copydefault(obj);
        c13273dFf.KWHzl(obj, (java.lang.String) objectRef.element);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C13273dFf c13273dFf, java.lang.Object obj) {
        c13273dFf.AEQbTJ(C33129mqd.gEmmrt(obj), "", "signAllTransactions");
        Activity activity = c13273dFf.djBIcL;
        if (activity != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("result", 0);
            activity.EZpvd(bundle, c13273dFf.fetchVPNInfo);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C13273dFf c13273dFf, java.lang.Object obj, Ref.ObjectRef objectRef) {
        Intrinsics.copydefault(obj);
        c13273dFf.EZpvd(obj, (java.lang.String) objectRef.element);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C13273dFf c13273dFf, java.lang.Object obj) {
        c13273dFf.AEQbTJ(C33129mqd.gEmmrt(obj), "", "signMessage");
        Activity activity = c13273dFf.djBIcL;
        if (activity != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("result", 0);
            activity.EZpvd(bundle, c13273dFf.fetchVPNInfo);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C13273dFf c13273dFf, java.lang.Object obj, JSONObject jSONObject) {
        Intrinsics.copydefault(obj);
        c13273dFf.EZpvd(obj, jSONObject);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C13273dFf c13273dFf, java.lang.Object obj) {
        c13273dFf.AEQbTJ(C33129mqd.gEmmrt(obj), "", "signAndSendTransaction");
        Activity activity = c13273dFf.djBIcL;
        if (activity != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("result", 0);
            activity.EZpvd(bundle, c13273dFf.fetchVPNInfo);
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        function2.invoke(obj, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C13273dFf c13273dFf, java.lang.Object obj, Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) C33129mqd.gEmmrt(java.lang.Long.valueOf(c13273dFf.valueOf)))) {
            c13273dFf.AEQbTJ(C33129mqd.gEmmrt(obj), str, (java.lang.String) objectRef.element);
            booleanRef.element = true;
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.Object obj, JSONObject jSONObject) {
        java.lang.String strDbNXlk;
        if (this.isConnected) {
            C55326xho.toast$default(dLX.Dialog.gwTjWJ, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        AEQbTJ(C33129mqd.gEmmrt(obj), "", "signAndSendTransaction");
        FragmentActivity fragmentActivity = EZpvd().get();
        if (fragmentActivity != null) {
            InterfaceC9738bbJ interfaceC9738bbJ = this.AkhnZx;
            java.lang.String str = (interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) ? "" : strDbNXlk;
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(this.valueOf));
            PlatformItem platformItemAEQbTJ = AEQbTJ();
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(jSONObject);
            Gson gson = new Gson();
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            PlatformItem platformItemAEQbTJ2 = AEQbTJ();
            pairArr[0] = C56390yDp.OLrzqt("dappUrl", platformItemAEQbTJ2 != null ? platformItemAEQbTJ2.getUrl() : null);
            pairArr[1] = C56390yDp.OLrzqt("signDataJson", C33129mqd.gEmmrt(jSONObject));
            dFN.startContractInteractionWithReport$default("signAndSendTransaction", fragmentActivity, new DappInteractionArgs(str, null, strGEmmrt, platformItemAEQbTJ, strGEmmrt2, null, "dapp", 2, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, null, null, 6, gson.toJson(C56424yEw.gEmmrt(pairArr)), null, null, null, null, -201326846, null), new Function1() { // from class: o.dFt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C13273dFf.djBIcL(this.KWHzl, (android.os.Bundle) obj2);
                }
            }, null, null, 32, null);
        }
    }

    public static final Unit djBIcL(C13273dFf c13273dFf, android.os.Bundle bundle) {
        if (bundle == null || bundle.getInt("result") == 0) {
            Activity activity = c13273dFf.djBIcL;
            if (activity != null) {
                activity.EZpvd(null, c13273dFf.fetchVPNInfo);
            }
        } else {
            Activity activity2 = c13273dFf.djBIcL;
            if (activity2 != null) {
                activity2.copydefault(bundle, c13273dFf.fetchVPNInfo);
            }
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.Object obj, java.lang.String str) {
        java.lang.String strDbNXlk;
        if (this.isConnected) {
            C55326xho.toast$default(dLX.Dialog.gwTjWJ, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        AEQbTJ(C33129mqd.gEmmrt(obj), "", "signMessage");
        FragmentActivity fragmentActivity = EZpvd().get();
        if (fragmentActivity != null) {
            InterfaceC9738bbJ interfaceC9738bbJ = this.AkhnZx;
            dFN.startSignDappWithReport$default("signMessage", fragmentActivity, new DappSignArgs((interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) ? "" : strDbNXlk, C33129mqd.gEmmrt(java.lang.Long.valueOf(this.valueOf)), AEQbTJ(), str, false, 2, "dapp", null, false, true, null, null, null, null, null, false, null, 130432, null), new Function1() { // from class: o.dFp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C13273dFf.AYXKKw(this.copydefault, (android.os.Bundle) obj2);
                }
            }, null, 16, null);
        }
    }

    public static final Unit AYXKKw(C13273dFf c13273dFf, android.os.Bundle bundle) {
        if (bundle == null || bundle.getInt("result") == 0) {
            Activity activity = c13273dFf.djBIcL;
            if (activity != null) {
                activity.EZpvd(bundle, c13273dFf.fetchVPNInfo);
            }
        } else {
            Activity activity2 = c13273dFf.djBIcL;
            if (activity2 != null) {
                activity2.OLrzqt(bundle, c13273dFf.fetchVPNInfo);
            }
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.Object obj, java.lang.String str) {
        java.lang.String strDbNXlk;
        if (this.isConnected) {
            C55326xho.toast$default(dLX.Dialog.gwTjWJ, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        AEQbTJ(C33129mqd.gEmmrt(obj), "", "signAllTransactions");
        FragmentActivity fragmentActivity = EZpvd().get();
        if (fragmentActivity != null) {
            InterfaceC9738bbJ interfaceC9738bbJ = this.AkhnZx;
            java.lang.String str2 = (interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) ? "" : strDbNXlk;
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(this.valueOf));
            PlatformItem platformItemAEQbTJ = AEQbTJ();
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(str);
            Gson gson = new Gson();
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            PlatformItem platformItemAEQbTJ2 = AEQbTJ();
            pairArr[0] = C56390yDp.OLrzqt("dappUrl", platformItemAEQbTJ2 != null ? platformItemAEQbTJ2.getUrl() : null);
            pairArr[1] = C56390yDp.OLrzqt("signDataJson", C33129mqd.gEmmrt(str));
            dFN.startContractInteractionWithReport$default("signAllTransactions", fragmentActivity, new DappInteractionArgs(str2, null, strGEmmrt, platformItemAEQbTJ, strGEmmrt2, null, "dapp", 2, null, null, null, null, false, false, null, true, null, null, null, null, null, null, null, null, null, null, 6, gson.toJson(C56424yEw.gEmmrt(pairArr)), null, null, SolanaMethod.SIGN_ALL_TRANSACTIONS, null, -1275101438, null), new Function1() { // from class: o.dFd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C13273dFf.KWHzl(this.AEQbTJ, (android.os.Bundle) obj2);
                }
            }, new Function1() { // from class: o.dFc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C13273dFf.copydefault((NewCallbackBean) obj2);
                }
            }, null, 32, null);
        }
    }

    public static final Unit KWHzl(C13273dFf c13273dFf, android.os.Bundle bundle) {
        if (bundle == null || bundle.getInt("result") == 0) {
            Activity activity = c13273dFf.djBIcL;
            if (activity != null) {
                activity.EZpvd(bundle, c13273dFf.fetchVPNInfo);
            }
        } else {
            Activity activity2 = c13273dFf.djBIcL;
            if (activity2 != null) {
                activity2.OLrzqt(bundle, c13273dFf.fetchVPNInfo);
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

    public final void copydefault(java.lang.Object obj, java.lang.String str) {
        java.lang.String strDbNXlk;
        if (this.isConnected) {
            C55326xho.toast$default(dLX.Dialog.gwTjWJ, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        AEQbTJ(C33129mqd.gEmmrt(obj), "", "signTransaction");
        FragmentActivity fragmentActivity = EZpvd().get();
        if (fragmentActivity != null) {
            InterfaceC9738bbJ interfaceC9738bbJ = this.AkhnZx;
            dFN.startSignDappWithReport$default("signTransaction", fragmentActivity, new DappSignArgs((interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) ? "" : strDbNXlk, C33129mqd.gEmmrt(java.lang.Long.valueOf(this.valueOf)), AEQbTJ(), str, false, 2, "dapp", null, false, false, null, null, null, null, null, false, null, 130944, null), new Function1() { // from class: o.dFo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C13273dFf.AhwBna(this.OLrzqt, (android.os.Bundle) obj2);
                }
            }, null, 16, null);
        }
    }

    public static final Unit AhwBna(C13273dFf c13273dFf, android.os.Bundle bundle) {
        if (bundle == null || bundle.getInt("result") == 0) {
            Activity activity = c13273dFf.djBIcL;
            if (activity != null) {
                activity.EZpvd(bundle, c13273dFf.fetchVPNInfo);
            }
        } else {
            Activity activity2 = c13273dFf.djBIcL;
            if (activity2 != null) {
                activity2.OLrzqt(bundle, c13273dFf.fetchVPNInfo);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.dAX
    public void EZpvd(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l, java.util.HashMap<java.lang.String, java.lang.Object> map) {
        java.lang.Object obj = map != null ? map.get("id") : null;
        InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), l != null ? l.longValue() : 501L, false, 2, null);
        if (interfaceC9738bbJ == null || (chainMetaWithRealChainId$default != null && !chainMetaWithRealChainId$default.fARcdN())) {
            copydefault(java.lang.String.valueOf(obj), "", "connect");
        } else {
            EZpvd(interfaceC9738bbJ);
            KWHzl(java.lang.String.valueOf(obj), interfaceC9738bbJ, l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(@NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        if (interfaceC9738bbJ == null) {
            str2 = "";
        } else {
            java.lang.String strEZpvd = interfaceC9738bbJ.EZpvd(l != null ? l.longValue() : 501L);
            if (strEZpvd != null) {
                str2 = strEZpvd;
            }
        }
        KWHzl(java.lang.String.valueOf(str), str2, "connect");
        copydefault(this.valueOf, str2, interfaceC9738bbJ, false);
    }

    public static /* synthetic */ void notifySolanaSendError$default(C13273dFf c13273dFf, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        c13273dFf.copydefault(str, str2, str3);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Application application = this.gEmmrt;
        if (application != null) {
            application.copydefault(str, str2, str3, this.fetchVPNInfo);
        }
    }

    public static /* synthetic */ void notifySolanaSendResult$default(C13273dFf c13273dFf, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        c13273dFf.AEQbTJ(str, str2, str3);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Application application = this.gEmmrt;
        if (application != null) {
            application.OLrzqt(str, str2, str3, this.fetchVPNInfo);
        }
    }

    public final void copydefault(long j, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Application application = this.gEmmrt;
        if (application != null) {
            application.KWHzl(java.lang.Long.valueOf(j), str, interfaceC9738bbJ, z);
        }
    }

    public static /* synthetic */ void notifySolanaSendParams$default(C13273dFf c13273dFf, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        c13273dFf.KWHzl(str, str2, str3);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Application application = this.gEmmrt;
        if (application != null) {
            application.EZpvd(str, str2, str3, this.fetchVPNInfo);
        }
    }
}
