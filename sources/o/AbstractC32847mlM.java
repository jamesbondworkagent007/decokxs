package o;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.appsflyer.AbsAppsFlyerTracker$setupCustomUserId$1;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okuser.data.User;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import o.AbstractC32847mlM;
import o.C32840mlF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mlM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC32847mlM extends AbstractC32806mkY {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public android.content.Context valueOf;
    public final java.util.ArrayList<java.lang.String> KWHzl = yDY.copydefault(MTPushConstants.Manufacturer.MEIZU, "okex_ru", "shalltry_int", "ACE_Samsung_510500", "APPEX10750", "APPEX10752", "APPEX10749", "APPEX10751", "google", "huaweice", "transsion", "guanwang", "APPEX10754", "APPEX10756", "APPEX10755", "APPEX10753", "APPEX10757");
    public final C32911mmX djBIcL = new C32911mmX();
    public final ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> copydefault = new ConcurrentHashMap<>();
    public final java.lang.Object gEmmrt = new java.lang.Object();
    public final AtomicBoolean AhwBna = new AtomicBoolean(false);
    public final AppsFlyerConversionListener OLrzqt = new ActionBar();
    public final DeepLinkListener AEQbTJ = new DeepLinkListener() { // from class: o.mlN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.appsflyer.deeplink.DeepLinkListener
        public final void onDeepLinking(DeepLinkResult deepLinkResult) {
            AbstractC32847mlM.EZpvd(deepLinkResult);
        }
    };

    public abstract android.app.Application KWHzl();

    public abstract java.lang.String OLrzqt();

    @Override // o.InterfaceC32874mln
    public TrackChannel fJNWhG() {
        return TrackChannel.Appsflyer;
    }

    /* JADX INFO: renamed from: o.mlM$ActionBar */
    public static final class ActionBar implements AppsFlyerConversionListener {
        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onAppOpenAttribution(java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            pUU.EZpvd("appsflyer", "onAppOpenAttribution()-->:" + map);
            C32853mlS.EZpvd.AEQbTJ(map);
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onAttributionFailure(java.lang.String str) {
            pUU.EZpvd("appsflyer", "onAttributionFailure()-->:" + str);
            C32853mlS.EZpvd.copydefault(str);
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onConversionDataFail(java.lang.String str) {
            pUU.EZpvd("appsflyer", "onConversionDataFail()-->");
            C32853mlS.EZpvd.AEQbTJ(str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: o.mlS */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onConversionDataSuccess(java.util.Map<java.lang.String, java.lang.Object> map) {
            java.util.Map map2;
            pUU.EZpvd("appsflyer", "onConversionDataSuccess()-->:" + map);
            if (map == null) {
                map2 = new java.util.HashMap();
            } else {
                map2 = new LinkedHashMap(C56423yEv.copydefault(map.size()));
                java.util.Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    map2.put(entry.getKey(), C33129mqd.gEmmrt(entry.getValue()));
                }
            }
            C32853mlS.EZpvd.EZpvd(map2);
        }
    }

    public static final void EZpvd(DeepLinkResult deepLinkResult) {
        Intrinsics.checkNotNullParameter(deepLinkResult, "");
        C32853mlS.EZpvd.AEQbTJ(deepLinkResult);
    }

    @Override // o.AbstractC32806mkY
    public void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = context;
        if (!C54807xWa.AEQbTJ()) {
            pUU.KWHzl("appsflyer", "No delay initialization " + java.lang.Thread.currentThread().getName());
            initAppsFlyer$default(this, null, 1, null);
            return;
        }
        C54819xWm.KWHzl().AEQbTJ(new TaskDescription());
    }

    /* JADX INFO: renamed from: o.mlM$TaskDescription */
    public static final class TaskDescription implements InterfaceC54816xWj {
        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
        }

        public TaskDescription() {
        }

        @Override // o.InterfaceC54816xWj
        public void EZpvd() {
            C6922aYX c6922aYXUzCIH = AbstractC32847mlM.this.uzCIH();
            final AbstractC32847mlM abstractC32847mlM = AbstractC32847mlM.this;
            c6922aYXUzCIH.OLrzqt("init", new Function0() { // from class: o.mlK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC32847mlM.TaskDescription.KWHzl(abstractC32847mlM);
                }
            });
        }

        public static final Unit KWHzl(AbstractC32847mlM abstractC32847mlM) {
            pUU.KWHzl("appsflyer", "Delay initialization " + java.lang.Thread.currentThread().getName());
            abstractC32847mlM.AEQbTJ(C54819xWm.KWHzl().AEQbTJ());
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void initAppsFlyer$default(AbstractC32847mlM abstractC32847mlM, android.app.Activity activity, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initAppsFlyer");
        }
        if ((i & 1) != 0) {
            activity = null;
        }
        abstractC32847mlM.AEQbTJ(activity);
    }

    public final void AEQbTJ(android.app.Activity activity) {
        AppsFlyerLib.getInstance().setDebugLog(false);
        android.content.Context context = this.valueOf;
        android.content.Context context2 = null;
        if (context == null) {
            Intrinsics.gEmmrt("");
            context = null;
        }
        java.lang.String strCopydefault = C8087awC.copydefault(context);
        if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) C32844mlJ.EZpvd.copydefault()), strCopydefault)) {
            AppsFlyerLib.getInstance().setPreinstallAttribution(strCopydefault, null, null);
        }
        pUU.KWHzl("appsflyer", "walleChannel " + strCopydefault);
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        java.lang.String strOLrzqt = OLrzqt();
        AppsFlyerConversionListener appsFlyerConversionListener = this.OLrzqt;
        android.content.Context context3 = this.valueOf;
        if (context3 == null) {
            Intrinsics.gEmmrt("");
            context3 = null;
        }
        appsFlyerLib.init(strOLrzqt, appsFlyerConversionListener, context3.getApplicationContext());
        AppsFlyerLib.getInstance().subscribeForDeepLink(this.AEQbTJ);
        if (strCopydefault != null) {
            if (this.KWHzl.contains(strCopydefault)) {
                AppsFlyerLib.getInstance().setOutOfStore(strCopydefault);
            }
        } else {
            android.content.Context context4 = this.valueOf;
            if (context4 == null) {
                Intrinsics.gEmmrt("");
                context4 = null;
            }
            java.lang.String strKWHzl = xVY.KWHzl(context4);
            if (this.KWHzl.contains(strKWHzl)) {
                AppsFlyerLib.getInstance().setOutOfStore(strKWHzl);
            }
            pUU.KWHzl("appsflyer", "appChannel " + strKWHzl);
        }
        AEQbTJ();
        EZpvd();
        synchronized (this.gEmmrt) {
            for (Map.Entry<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> entry : this.copydefault.entrySet()) {
                OLrzqt(entry.getKey(), entry.getValue());
            }
            this.copydefault.clear();
            Unit unit = Unit.INSTANCE;
        }
        this.AhwBna.set(true);
        AppsFlyerLib appsFlyerLib2 = AppsFlyerLib.getInstance();
        android.content.Context contextKWHzl = activity;
        if (activity == null) {
            contextKWHzl = KWHzl();
        }
        appsFlyerLib2.start(contextKWHzl);
        C32864mld c32864mld = C32864mld.OLrzqt;
        AppsFlyerLib appsFlyerLib3 = AppsFlyerLib.getInstance();
        android.content.Context context5 = this.valueOf;
        if (context5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            context2 = context5;
        }
        c32864mld.AEQbTJ(appsFlyerLib3.getAppsFlyerUID(context2));
    }

    public final void EZpvd() {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        C32840mlF c32840mlF = C32840mlF.copydefault;
        appsFlyerLib.setAdditionalData(c32840mlF.copydefault());
        pUU.EZpvd("appsflyer", "setupCommonEventParams-> setAdditionalData:" + c32840mlF.copydefault());
        c32840mlF.copydefault(new Activity());
    }

    /* JADX INFO: renamed from: o.mlM$Activity */
    public static final class Activity implements C32840mlF.StateListAnimator {
        @Override // o.C32840mlF.StateListAnimator
        public void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
            C32840mlF c32840mlF = C32840mlF.copydefault;
            appsFlyerLib.setAdditionalData(c32840mlF.copydefault());
            pUU.EZpvd("appsflyer", "onPropertyPutted-> setAdditionalData:" + c32840mlF.copydefault());
        }

        @Override // o.C32840mlF.StateListAnimator
        public void copydefault(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
            C32840mlF c32840mlF = C32840mlF.copydefault;
            appsFlyerLib.setAdditionalData(c32840mlF.copydefault());
            pUU.EZpvd("appsflyer", "onPropertyRemoved-> setAdditionalData:" + c32840mlF.copydefault());
        }
    }

    public final void AEQbTJ() {
        User userOLrzqt = C43292rmY.OLrzqt.AwvSrB().OLrzqt();
        java.lang.String tk = userOLrzqt != null ? userOLrzqt.getTk() : null;
        if (tk == null) {
            tk = "";
        }
        if (!android.text.TextUtils.isEmpty(tk)) {
            AppsFlyerLib.getInstance().setCustomerUserId(tk);
        }
        pUU.KWHzl("appsflyer", "setupCustomUserId init userId,userId.isEmpty:" + (tk.length() == 0));
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new AbsAppsFlyerTracker$setupCustomUserId$1(null), 2, null);
    }

    @Override // o.InterfaceC32874mln
    public void onEvent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        onEventInternal$default(this, str, null, 2, null);
    }

    @Override // o.InterfaceC32874mln
    public void copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        KWHzl(str, map);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mlM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onEventInternal$default(AbstractC32847mlM abstractC32847mlM, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEventInternal");
        }
        if ((i & 2) != 0) {
            map = null;
        }
        abstractC32847mlM.KWHzl(str, map);
    }

    private final void KWHzl(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        if (this.AhwBna.get()) {
            OLrzqt(str, map);
            return;
        }
        synchronized (this.gEmmrt) {
            if (!this.AhwBna.get()) {
                this.copydefault.put(str, map);
            } else {
                OLrzqt(str, map);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mlM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void doLogEvent$default(AbstractC32847mlM abstractC32847mlM, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doLogEvent");
        }
        if ((i & 2) != 0) {
            map = null;
        }
        abstractC32847mlM.OLrzqt(str, map);
    }

    public final void OLrzqt(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.djBIcL.AEQbTJ(str);
        java.util.Map<java.lang.String, java.lang.String> mapOLrzqt = OLrzqt(map);
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        android.content.Context context = this.valueOf;
        if (context == null) {
            Intrinsics.gEmmrt("");
            context = null;
        }
        appsFlyerLib.logEvent(context, str, mapOLrzqt);
    }

    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.Map<java.lang.String, java.lang.String> mapCopydefault = C32840mlF.copydefault.copydefault();
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap(mapCopydefault.size() + (map != null ? map.size() : 0));
        if (map != null) {
            for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                arrayMap.put(entry.getKey(), URLEncoder.encode(entry.getValue(), com.google.android.exoplayer2.C.UTF8_NAME));
            }
        }
        for (Map.Entry<java.lang.String, java.lang.String> entry2 : mapCopydefault.entrySet()) {
            arrayMap.put(entry2.getKey(), URLEncoder.encode(entry2.getValue(), com.google.android.exoplayer2.C.UTF8_NAME));
        }
        return arrayMap;
    }

    /* JADX INFO: renamed from: o.mlM$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mlM.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.InterfaceC32874mln
    public void copydefault(@NotNull java.lang.String str, @NotNull EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(eventParamsList, 10)), 16));
        for (EventParam eventParam : eventParamsList) {
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(eventParam.copydefault(), eventParam.KWHzl());
            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        KWHzl(str, linkedHashMap);
    }
}
