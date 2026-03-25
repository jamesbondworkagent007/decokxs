package com.okinc.common.network;

import android.app.Application;
import com.okinc.common.network.NetworkInit;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.dns.RpcDohConfig;
import com.okinc.network.okg.dns.WebViewConfig;
import com.okinc.network.okg.dns.model.DoHChain;
import com.okinc.network.okg.log.NetEventAnalysisParamProxy;
import com.okinc.network.okg.log.NetEventData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C32866mlf;
import o.C35202nqq;
import o.C43292rmY;
import o.C43308rmo;
import o.C43371rny;
import o.C43372rnz;
import o.C43386roM;
import o.C43396roW;
import o.C43405rof;
import o.C43461rpi;
import o.C48787ucK;
import o.C56390yDp;
import o.InterfaceC48788ucL;
import o.InterfaceC56555yJs;
import o.mNS;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class NetworkInit {
    private static final String CN_DOH_QUERY_REPORT = "cn_doh_query_report";
    private static final String RPC_DOH_CONFIG = "rpcDohConfig";
    private static final String WEBVIEW_CONFIG = "webviewConfig";
    private final List<DoHChain> chainList;
    private final Application context;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int $stable = 8;

    public NetworkInit(@NotNull Application application, @NotNull List<DoHChain> list) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.context = application;
        this.chainList = list;
    }

    public final void initNetwork() {
        networkDoh();
        networkXcdn();
        networkQualityMonitoring();
        setReportIpInfoCallback();
        dohEventReport();
    }

    private final void networkDoh() {
        C43292rmY c43292rmY = C43292rmY.OLrzqt;
        C48787ucK c48787ucK = C48787ucK.AEQbTJ;
        c48787ucK.AEQbTJ(WEBVIEW_CONFIG, new ActionBar(c43292rmY));
        c48787ucK.AEQbTJ(RPC_DOH_CONFIG, new StateListAnimator(c43292rmY));
        c43292rmY.AEQbTJ(new yHT() { // from class: o.mfv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHT
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return NetworkInit.networkDoh$lambda$1((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3, (java.util.Map) obj4);
            }
        });
        if (C43308rmo.KWHzl(this.context) && C43371rny.OLrzqt.KWHzl()) {
            C43372rnz.copydefault.copydefault(this.context, this.chainList);
        }
    }

    public static final class ActionBar implements InterfaceC48788ucL {
        public final /* synthetic */ C43292rmY KWHzl;

        public ActionBar(C43292rmY c43292rmY) {
            this.KWHzl = c43292rmY;
        }

        @Override // o.InterfaceC48788ucL
        public void onStrategyUpdated() {
            WebViewConfig webViewConfig = (WebViewConfig) C48787ucK.AEQbTJ.EZpvd(NetworkInit.WEBVIEW_CONFIG, WebViewConfig.class);
            if (webViewConfig != null) {
                this.KWHzl.AEQbTJ(webViewConfig);
            }
        }
    }

    public static final class StateListAnimator implements InterfaceC48788ucL {
        public final /* synthetic */ C43292rmY OLrzqt;

        public StateListAnimator(C43292rmY c43292rmY) {
            this.OLrzqt = c43292rmY;
        }

        @Override // o.InterfaceC48788ucL
        public void onStrategyUpdated() {
            RpcDohConfig rpcDohConfig = (RpcDohConfig) C48787ucK.AEQbTJ.EZpvd(NetworkInit.RPC_DOH_CONFIG, RpcDohConfig.class);
            if (rpcDohConfig != null) {
                this.OLrzqt.copydefault(rpcDohConfig.getWhitelist());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit networkDoh$lambda$1(String str, String str2, String str3, Map map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (Intrinsics.EZpvd((Object) str, (Object) "ip_route_query") && !C35202nqq.OLrzqt.AEQbTJ(CN_DOH_QUERY_REPORT)) {
            return Unit.INSTANCE;
        }
        EventData eventData = new EventData();
        eventData.setAct(str);
        eventData.setCode(str2);
        eventData.setMsg(str3);
        eventData.setAttribute(map);
        ReportManager.AEQbTJ.EZpvd(eventData);
        return Unit.INSTANCE;
    }

    private final void networkXcdn() {
        C43292rmY.OLrzqt.djBIcL(true);
        if (C43308rmo.KWHzl(this.context)) {
            C43386roM.EZpvd.KWHzl(this.context);
        }
    }

    private final void networkQualityMonitoring() {
        C43405rof c43405rof = C43405rof.EZpvd;
        Pair pairOLrzqt = C56390yDp.OLrzqt(new NetworkInit$networkQualityMonitoring$1$1(c43405rof), new NetworkInit$networkQualityMonitoring$1$2(c43405rof));
        InterfaceC56555yJs interfaceC56555yJs = (InterfaceC56555yJs) pairOLrzqt.component1();
        InterfaceC56555yJs interfaceC56555yJs2 = (InterfaceC56555yJs) pairOLrzqt.component2();
        C43292rmY c43292rmY = C43292rmY.OLrzqt;
        c43292rmY.KWHzl((Function1<? super NetEventData, Unit>) interfaceC56555yJs2);
        c43292rmY.AEQbTJ(new Function1() { // from class: o.mfw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return NetworkInit.networkQualityMonitoring$lambda$3((NetEventData) obj);
            }
        });
        if (C43308rmo.KWHzl(this.context)) {
            ((Function0) interfaceC56555yJs).invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit networkQualityMonitoring$lambda$3(NetEventData netEventData) {
        Intrinsics.checkNotNullParameter(netEventData, "");
        mNS.copydefault.OLrzqt(String.valueOf(netEventData.getTime()), netEventData.getUrl_path());
        return Unit.INSTANCE;
    }

    private final void setReportIpInfoCallback() {
        if (C43308rmo.KWHzl(this.context)) {
            C43292rmY.OLrzqt.copydefault(new Function0() { // from class: o.mfr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return NetworkInit.setReportIpInfoCallback$lambda$4();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setReportIpInfoCallback$lambda$4() {
        String strGEmmrt = C43396roW.EZpvd().gEmmrt();
        if (!Intrinsics.EZpvd((Object) strGEmmrt, (Object) "unknown")) {
            EventData eventData = new EventData();
            eventData.setAct("net_ip_type");
            eventData.setSource(strGEmmrt);
            eventData.setMsg(C43396roW.EZpvd().copydefault());
            ReportManager.AEQbTJ.EZpvd(eventData);
        }
        return Unit.INSTANCE;
    }

    private final void dohEventReport() {
        if (C43308rmo.KWHzl(this.context)) {
            C43292rmY.OLrzqt.KWHzl(new Function2() { // from class: o.mfA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return NetworkInit.dohEventReport$lambda$7((java.lang.String) obj, (java.util.ArrayList) obj2);
                }
            });
            C43461rpi.copydefault.OLrzqt(new AnonymousClass2(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dohEventReport$lambda$7(String str, final ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        C32866mlf.EZpvd(str, new TrackChannel[]{TrackChannel.OKStatistics}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mfs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return NetworkInit.dohEventReport$lambda$7$lambda$6(arrayList, (EventParamsList) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.common.network.NetworkInit$dohEventReport$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements yHT<String, String, String, Map<String, ? extends String>, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Object obj) {
            super(4, obj, NetworkInit.class, "reportCommonEvent", "reportCommonEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHT
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3, Map<String, ? extends String> map) {
            invoke2(str, str2, str3, (Map<String, String>) map);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str, String str2, String str3, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(str, "");
            ((NetworkInit) this.receiver).reportCommonEvent(str, str2, str3, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportCommonEvent(String str, String str2, String str3, Map<String, String> map) {
        EventData eventData = new EventData();
        eventData.setAct(str);
        if (str2 != null) {
            eventData.setCode(str2);
        }
        if (str3 != null) {
            eventData.setMsg(str3);
        }
        if (map != null) {
            eventData.setAttrs(map);
        }
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.common.network.NetworkInit.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dohEventReport$lambda$7$lambda$6(ArrayList arrayList, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NetEventAnalysisParamProxy netEventAnalysisParamProxy = (NetEventAnalysisParamProxy) it.next();
            eventParamsList.put(netEventAnalysisParamProxy.KWHzl(), netEventAnalysisParamProxy.OLrzqt(), netEventAnalysisParamProxy.AEQbTJ());
        }
        return Unit.INSTANCE;
    }
}
