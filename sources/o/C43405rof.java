package o;

import com.okinc.base.thread.TPM;
import com.okinc.network.okg.core.ThreadPoolType;
import com.okinc.network.okg.dns.model.DnsReport;
import com.okinc.network.okg.log.LruLinkedHashMap;
import com.okinc.network.okg.log.NetEventData;
import com.okinc.network.okg.log.NetEventMetricApi;
import com.okinc.network.okg.log.NetEventReportManager$reportDOHLinkEvent$1;
import com.okinc.network.okg.log.NetEventReportManager$startTimer$3;
import com.okinc.okuser.data.User;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rof, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43405rof {
    public static boolean gEmmrt;
    public static InterfaceC58217yxC isConnected;
    public static final C43405rof EZpvd = new C43405rof();
    public static AtomicBoolean AYXKKw = new AtomicBoolean(false);
    public static final LruLinkedHashMap<java.lang.String, NetEventData> valueOf = new LruLinkedHashMap<>(128);
    public static final LruLinkedHashMap<java.lang.String, DnsReport> AhwBna = new LruLinkedHashMap<>(256);
    public static C43472rpt djBIcL = new C43472rpt(null, 1, 0 == true ? 1 : 0);
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.roc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43405rof.EZpvd();
        }
    });
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.roe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43405rof.copydefault();
        }
    });
    public static ActionBar OLrzqt = new ActionBar();
    public static final int KWHzl = 8;

    /* JADX INFO: renamed from: o.rof$StateListAnimator */
    public static final class StateListAnimator implements TPM.Application {
        public final java.lang.String OLrzqt = "Grafana.Network";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.base.thread.TPM.Application
        public java.lang.String EZpvd() {
            return this.OLrzqt;
        }
    }

    private C43405rof() {
    }

    public final Json KWHzl() {
        return (Json) AEQbTJ.getValue();
    }

    public static final Json EZpvd() {
        return JsonKt.Json$default(null, new Function1() { // from class: o.rol
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43405rof.KWHzl((JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        return Unit.INSTANCE;
    }

    public final AbstractC58253yxm gEmmrt() {
        return (AbstractC58253yxm) copydefault.getValue();
    }

    public static final AbstractC58253yxm copydefault() {
        return TPM.ActionBar.create$default(TPM.ActionBar.AEQbTJ, "Grafana.Network", new StateListAnimator(), 0, 4, null);
    }

    /* JADX INFO: renamed from: o.rof$ActionBar */
    public static final class ActionBar implements InterfaceC54816xWj {
        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            C43405rof.EZpvd.AhwBna();
        }

        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
            C43405rof.EZpvd.djBIcL();
        }
    }

    public final void valueOf() {
        gEmmrt = true;
        C54819xWm.KWHzl().AEQbTJ(OLrzqt);
        AhwBna();
    }

    public final void AhwBna() {
        if (isConnected == null) {
            pUU.EZpvd("Grafana.Network", "--- startTimer ---");
            AbstractC58247yxg<java.lang.Long> abstractC58247yxgRepeat = AbstractC58247yxg.timer(10L, java.util.concurrent.TimeUnit.SECONDS, C43357rnk.KWHzl.EZpvd(ThreadPoolType.OTHER)).repeat();
            final Function1 function1 = new Function1() { // from class: o.roh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C43405rof.EZpvd((java.lang.Throwable) obj);
                }
            };
            AbstractC58247yxg<java.lang.Long> abstractC58247yxgDoOnError = abstractC58247yxgRepeat.doOnError(new InterfaceC58227yxM() { // from class: o.rok
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C43405rof.EZpvd(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.roi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C43405rof.AEQbTJ((java.lang.Long) obj);
                }
            };
            isConnected = abstractC58247yxgDoOnError.subscribe(new InterfaceC58227yxM() { // from class: o.roj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C43405rof.djBIcL(function12, obj);
                }
            });
        }
        djBIcL.KWHzl(30000L, new NetEventReportManager$startTimer$3(null));
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        th.printStackTrace();
        Unit unit = Unit.INSTANCE;
        pUU.valueOf("Grafana.Network", "net event timer error: " + unit);
        return unit;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Long l) throws java.lang.CloneNotSupportedException {
        EZpvd.AYXKKw();
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        InterfaceC58217yxC interfaceC58217yxC = isConnected;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        isConnected = null;
        djBIcL.EZpvd();
    }

    public final void KWHzl(@NotNull NetEventData netEventData) {
        Intrinsics.checkNotNullParameter(netEventData, "");
        if (gEmmrt) {
            final NetEventData netEventDataOLrzqt = OLrzqt(netEventData);
            AbstractC58247yxg abstractC58247yxgSubscribeOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.roq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58249yxi
                public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                    C43405rof.OLrzqt(netEventDataOLrzqt, interfaceC58251yxk);
                }
            }).subscribeOn(gEmmrt());
            final Function1 function1 = new Function1() { // from class: o.rog
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C43405rof.copydefault((NetEventData) obj);
                }
            };
            abstractC58247yxgSubscribeOn.subscribe(new InterfaceC58227yxM() { // from class: o.rod
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C43405rof.OLrzqt(function1, obj);
                }
            });
        }
    }

    public static final void OLrzqt(NetEventData netEventData, InterfaceC58251yxk interfaceC58251yxk) {
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        C43346rnZ c43346rnZ = C43346rnZ.KWHzl;
        netEventData.setDest_domain(c43346rnZ.AEQbTJ(netEventData));
        if (netEventData.getUseDoh() && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) netEventData.getDest_ip())) {
            netEventData.setDest_ip(c43346rnZ.KWHzl(netEventData));
        }
        interfaceC58251yxk.onNext(netEventData);
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(NetEventData netEventData) {
        if (!netEventData.isRespCodeNoChanged()) {
            valueOf.put(java.lang.String.valueOf(netEventData.hashCode()), netEventData);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull DnsReport dnsReport) {
        Intrinsics.checkNotNullParameter(dnsReport, "");
        if (gEmmrt) {
            AhwBna.put(java.lang.String.valueOf(dnsReport.hashCode()), dnsReport);
        }
    }

    public final void AYXKKw() throws java.lang.CloneNotSupportedException {
        if (AYXKKw.get()) {
            pUU.EZpvd("Grafana.Network", "--- report event return cause previous report is running!");
            return;
        }
        LruLinkedHashMap<java.lang.String, NetEventData> lruLinkedHashMap = valueOf;
        if (lruLinkedHashMap.size() <= 0) {
            pUU.EZpvd("Grafana.Network", "--- report event return cause map is empty!");
            return;
        }
        java.lang.Object objClone = lruLinkedHashMap.clone();
        Intrinsics.copydefault(objClone, "");
        final LruLinkedHashMap lruLinkedHashMap2 = (LruLinkedHashMap) objClone;
        lruLinkedHashMap.clear();
        pUU.EZpvd("Grafana.Network", "--- reportMap: " + lruLinkedHashMap2.size() + ", pendingMap: " + lruLinkedHashMap.size() + ", reportEvent: " + lruLinkedHashMap2.keySet());
        java.util.Collection<NetEventData> collectionValues = lruLinkedHashMap2.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        RequestBody requestBodyOLrzqt = OLrzqt(collectionValues);
        AYXKKw = new AtomicBoolean(true);
        if (requestBodyOLrzqt != null) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            User userOLrzqt = C43292rmY.OLrzqt.AwvSrB().OLrzqt();
            java.lang.String uid = userOLrzqt != null ? userOLrzqt.getUid() : null;
            C43357rnk c43357rnk = C43357rnk.KWHzl;
            NetEventMetricApi netEventMetricApiOLrzqt = NetEventMetricApi.Companion.OLrzqt();
            java.lang.String strEZpvd = EZpvd.EZpvd(jCurrentTimeMillis);
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            AbstractC58185ywX abstractC58185ywXKWHzl = c43357rnk.EZpvd(NetEventMetricApi.ActionBar.reportNetEvents$default(netEventMetricApiOLrzqt, strEZpvd, java.lang.String.valueOf(jCurrentTimeMillis), uid == null ? "" : uid, requestBodyOLrzqt, null, 16, null), ThreadPoolType.HTTP).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            yBI.subscribeBy$default(abstractC58185ywXKWHzl, new Function1() { // from class: o.ron
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C43405rof.copydefault(lruLinkedHashMap2, (java.lang.Throwable) obj);
                }
            }, (Function0) null, new Function1() { // from class: o.roo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C43405rof.OLrzqt((ResponseBody) obj);
                }
            }, 2, (java.lang.Object) null);
        }
    }

    public static final Unit copydefault(LruLinkedHashMap lruLinkedHashMap, java.lang.Throwable th) throws java.lang.CloneNotSupportedException {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.EZpvd("Grafana.Network", "netEvent report error: " + th);
        AYXKKw = new AtomicBoolean(false);
        EZpvd.KWHzl((LruLinkedHashMap<java.lang.String, NetEventData>) lruLinkedHashMap);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ResponseBody responseBody) {
        AYXKKw = new AtomicBoolean(false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0145 A[LOOP:0: B:41:0x013f->B:43:0x0145, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016b A[LOOP:1: B:45:0x0165->B:47:0x016b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        NetEventReportManager$reportDOHLinkEvent$1 netEventReportManager$reportDOHLinkEvent$1;
        java.util.HashMap map;
        java.util.HashMap map2;
        if (continuation instanceof NetEventReportManager$reportDOHLinkEvent$1) {
            netEventReportManager$reportDOHLinkEvent$1 = (NetEventReportManager$reportDOHLinkEvent$1) continuation;
            int i = netEventReportManager$reportDOHLinkEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                netEventReportManager$reportDOHLinkEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                netEventReportManager$reportDOHLinkEvent$1 = new NetEventReportManager$reportDOHLinkEvent$1(this, continuation);
            }
        }
        NetEventReportManager$reportDOHLinkEvent$1 netEventReportManager$reportDOHLinkEvent$12 = netEventReportManager$reportDOHLinkEvent$1;
        java.lang.Object objReportDOHLinkEvent$default = netEventReportManager$reportDOHLinkEvent$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = netEventReportManager$reportDOHLinkEvent$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objReportDOHLinkEvent$default);
            LruLinkedHashMap<java.lang.String, DnsReport> lruLinkedHashMap = AhwBna;
            if (lruLinkedHashMap.isEmpty()) {
                pUU.EZpvd("Grafana.Network", "--- reportDOHLinkEvent return cause map is empty!");
                return Unit.INSTANCE;
            }
            map = new java.util.HashMap(lruLinkedHashMap);
            lruLinkedHashMap.clear();
            try {
                pUU.EZpvd("Grafana.Network", "--- reportDOHLinkEvent: " + map.size() + ", pendingMap: " + lruLinkedHashMap.size() + ", reportEvent: " + map.keySet());
                Json jsonKWHzl = KWHzl();
                java.util.Collection collectionValues = map.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "");
                java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues);
                jsonKWHzl.getSerializersModule();
                RequestBody requestBodyCreate = RequestBody.Companion.create(jsonKWHzl.encodeToString(new ArrayListSerializer(BuiltinSerializersKt.getNullable(DnsReport.Companion.serializer())), listAxsJAYsNCnLh), MediaType.Companion.get(EIP1271Verifier.mediaTypeString));
                User userOLrzqt = C43292rmY.OLrzqt.AwvSrB().OLrzqt();
                java.lang.String uid = userOLrzqt != null ? userOLrzqt.getUid() : null;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                NetEventMetricApi netEventMetricApiOLrzqt = NetEventMetricApi.Companion.OLrzqt();
                java.lang.String strEZpvd = EZpvd(jCurrentTimeMillis);
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                if (uid == null) {
                    uid = "";
                }
                netEventReportManager$reportDOHLinkEvent$12.L$0 = map;
                netEventReportManager$reportDOHLinkEvent$12.label = 1;
                objReportDOHLinkEvent$default = NetEventMetricApi.ActionBar.reportDOHLinkEvent$default(netEventMetricApiOLrzqt, strEZpvd, java.lang.String.valueOf(jCurrentTimeMillis), uid, null, requestBodyCreate, netEventReportManager$reportDOHLinkEvent$12, 8, null);
                if (objReportDOHLinkEvent$default == objCopydefault) {
                    return objCopydefault;
                }
                map2 = map;
            } catch (java.lang.Exception e) {
                e = e;
                pUU.EZpvd("Grafana.Network", "reportDOHLinkEvent report error: " + e);
                LruLinkedHashMap<java.lang.String, DnsReport> lruLinkedHashMap2 = AhwBna;
                LinkedHashMap linkedHashMap = new LinkedHashMap(lruLinkedHashMap2);
                lruLinkedHashMap2.clear();
                for (Map.Entry entry : map.entrySet()) {
                    AhwBna.put((java.lang.String) entry.getKey(), (DnsReport) entry.getValue());
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    AhwBna.put((java.lang.String) entry2.getKey(), (DnsReport) entry2.getValue());
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map2 = (java.util.HashMap) netEventReportManager$reportDOHLinkEvent$12.L$0;
            try {
                C56391yDq.AEQbTJ(objReportDOHLinkEvent$default);
            } catch (java.lang.Exception e2) {
                e = e2;
                map = map2;
                pUU.EZpvd("Grafana.Network", "reportDOHLinkEvent report error: " + e);
                LruLinkedHashMap<java.lang.String, DnsReport> lruLinkedHashMap22 = AhwBna;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(lruLinkedHashMap22);
                lruLinkedHashMap22.clear();
                while (r14.hasNext()) {
                }
                while (r14.hasNext()) {
                }
            }
        }
        pUU.EZpvd("Grafana.Network", "reportDOHLinkEvent report success: " + ((ResponseBody) objReportDOHLinkEvent$default).string());
        return Unit.INSTANCE;
    }

    public final RequestBody OLrzqt(java.util.Collection<NetEventData> collection) {
        java.lang.String json = C43466rpn.OLrzqt.valueOf().toJson(collection);
        if (json != null) {
            return RequestBody.Companion.create(json, MediaType.Companion.get(EIP1271Verifier.mediaTypeString));
        }
        return null;
    }

    public final java.lang.String EZpvd(long j) {
        return C43346rnZ.KWHzl.OLrzqt(xVW.copydefault() + "iopu34e" + ((j / ((long) 1000)) / ((long) 15)));
    }

    public final void KWHzl(LruLinkedHashMap<java.lang.String, NetEventData> lruLinkedHashMap) throws java.lang.CloneNotSupportedException {
        LruLinkedHashMap<java.lang.String, NetEventData> lruLinkedHashMap2 = valueOf;
        java.lang.Object objClone = lruLinkedHashMap2.clone();
        Intrinsics.copydefault(objClone, "");
        LruLinkedHashMap lruLinkedHashMap3 = (LruLinkedHashMap) objClone;
        lruLinkedHashMap2.clear();
        lruLinkedHashMap2.putAll(lruLinkedHashMap);
        lruLinkedHashMap2.putAll(lruLinkedHashMap3);
        lruLinkedHashMap3.clear();
    }

    public final NetEventData OLrzqt(NetEventData netEventData) {
        NetEventData netEventData2 = new NetEventData(netEventData.getConnect_type(), netEventData.getUrl_path());
        netEventData2.setError_code(netEventData.getError_code());
        netEventData2.setDest_domain(netEventData.getDest_domain());
        netEventData2.setDest_ip(netEventData.getDest_ip());
        netEventData2.setStartTime(netEventData.getStartTime());
        netEventData2.setDuration(netEventData.getDuration());
        netEventData2.setConnect_duration(netEventData.getConnect_duration());
        netEventData2.setOperator_type(netEventData.getOperator_type());
        netEventData2.setProtocol(netEventData.getProtocol());
        netEventData2.setUseDoh(netEventData.getUseDoh());
        netEventData2.setTime(netEventData.getTime());
        netEventData2.setAppStatus(netEventData.getAppStatus());
        netEventData2.setDohType(netEventData.getDohType());
        netEventData2.setAttribute(netEventData.getAttribute());
        return netEventData2;
    }
}
