package o;

import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.common.ProtocolInfoData;
import com.okinc.business.market.features.meme.data.model.MediaV2Data;
import com.okinc.business.market.features.meme.domain.model.Media;
import com.okinc.business.market.features.meme.domain.model.MemeProtocolUiData;
import com.okinc.business.market.features.meme.domain.model.MemeSocialMediaData;
import com.okinc.business.market.features.meme.domain.model.MemeTagsData;
import com.okinc.business.market.features.scanner.surge.trending.data.TrendingConfigData;
import com.okinc.business.market.features.scanner.surge.trending.data.TrendingTokenData;
import com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$applyPendingKlineUpdates$1;
import com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$invoke$1;
import com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$manageKlineSubscriptions$1$2;
import com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$manageKlineSubscriptions$2;
import com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$special$$inlined$map$1$2$1;
import com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$stopWs$1;
import com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$subscribeToTokenKline$job$1;
import com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$subscribeWs$1;
import com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$subscribeWs$2;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kqz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29300kqz {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC29249kqA AYXKKw;
    public final CoroutineScope AhwBna;
    public final java.util.Map<java.lang.String, Job> EZpvd;
    public final Mutex KWHzl;
    public final MutableStateFlow<java.util.List<C29250kqB>> OLrzqt;
    public final java.util.Map<java.lang.String, java.util.Map<java.lang.Long, java.lang.Float>> copydefault;
    public final Flow<java.util.List<C29250kqB>> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<java.util.List<C29250kqB>> AEQbTJ() {
        return this.valueOf;
    }

    @yCM
    public C29300kqz(@NotNull InterfaceC29249kqA interfaceC29249kqA, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC29249kqA, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AYXKKw = interfaceC29249kqA;
        this.AEQbTJ = coroutineDispatcher;
        this.AhwBna = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        MutableStateFlow<java.util.List<C29250kqB>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow;
        this.valueOf = new TaskDescription(MutableStateFlow);
        this.EZpvd = new LinkedHashMap();
        this.copydefault = new LinkedHashMap();
        this.KWHzl = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX INFO: renamed from: o.kqz$TaskDescription */
    public static final class TaskDescription implements Flow<java.util.List<? extends C29250kqB>> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.kqz$TaskDescription$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                GetTrendingTokensUseCase$special$$inlined$map$1$2$1 getTrendingTokensUseCase$special$$inlined$map$1$2$1;
                java.util.ArrayList arrayList;
                if (continuation instanceof GetTrendingTokensUseCase$special$$inlined$map$1$2$1) {
                    getTrendingTokensUseCase$special$$inlined$map$1$2$1 = (GetTrendingTokensUseCase$special$$inlined$map$1$2$1) continuation;
                    int i = getTrendingTokensUseCase$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        getTrendingTokensUseCase$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        getTrendingTokensUseCase$special$$inlined$map$1$2$1 = new GetTrendingTokensUseCase$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = getTrendingTokensUseCase$special$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = getTrendingTokensUseCase$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    java.util.List list = (java.util.List) obj;
                    if (list != null) {
                        arrayList = new java.util.ArrayList();
                        for (T t : list) {
                            if (!((C29250kqB) t).EZpvd().isEmpty()) {
                                arrayList.add(t);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    getTrendingTokensUseCase$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, getTrendingTokensUseCase$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends C29250kqB>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull TrendingConfigData trendingConfigData, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        GetTrendingTokensUseCase$invoke$1 getTrendingTokensUseCase$invoke$1;
        if (continuation instanceof GetTrendingTokensUseCase$invoke$1) {
            getTrendingTokensUseCase$invoke$1 = (GetTrendingTokensUseCase$invoke$1) continuation;
            int i = getTrendingTokensUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTrendingTokensUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getTrendingTokensUseCase$invoke$1 = new GetTrendingTokensUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getTrendingTokensUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getTrendingTokensUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            GetTrendingTokensUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 getTrendingTokensUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 = new GetTrendingTokensUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(null, this, str, str2, trendingConfigData);
            getTrendingTokensUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getTrendingTokensUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1, getTrendingTokensUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final C29250kqB OLrzqt(TrendingTokenData trendingTokenData, TrendingConfigData trendingConfigData) {
        ProtocolInfoData protocolInfoData;
        java.lang.String strAEQbTJ;
        Media media;
        java.util.List<java.lang.String> protocolGradientColor;
        java.lang.String str;
        java.util.List<java.lang.String> protocolGradientColor2;
        java.lang.Object next;
        java.util.List<ProtocolInfoData> listEZpvd = trendingConfigData.EZpvd();
        java.lang.Object obj = null;
        if (listEZpvd != null) {
            java.util.Iterator<T> it = listEZpvd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((ProtocolInfoData) next).getProtocolId(), (java.lang.Object) trendingTokenData.AkhnZx())) {
                    break;
                }
            }
            protocolInfoData = (ProtocolInfoData) next;
        } else {
            protocolInfoData = null;
        }
        int iKWHzl = C31256lqb.KWHzl((protocolInfoData == null || (protocolGradientColor2 = protocolInfoData.getProtocolGradientColor()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(protocolGradientColor2, 0), C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
        int iKWHzl2 = (protocolInfoData == null || (protocolGradientColor = protocolInfoData.getProtocolGradientColor()) == null || (str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(protocolGradientColor, 1)) == null) ? iKWHzl : C31256lqb.KWHzl(str, C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
        java.lang.String strCopydefault = trendingTokenData.copydefault();
        if (strCopydefault == null || (strAEQbTJ = trendingTokenData.AEQbTJ()) == null) {
            return null;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z = (((jCurrentTimeMillis - C33129mqd.valueOf(trendingTokenData.gEmmrt())) > 120000L ? 1 : ((jCurrentTimeMillis - C33129mqd.valueOf(trendingTokenData.gEmmrt())) == 120000L ? 0 : -1)) < 0) || (((jCurrentTimeMillis - C33129mqd.valueOf(trendingTokenData.DbNXlk())) > 600000L ? 1 : ((jCurrentTimeMillis - C33129mqd.valueOf(trendingTokenData.DbNXlk())) == 600000L ? 0 : -1)) < 0);
        java.lang.String strValueOf = trendingTokenData.valueOf();
        java.lang.String str2 = strValueOf == null ? "" : strValueOf;
        java.lang.String strEZpvd = trendingTokenData.EZpvd();
        java.lang.String protocolLogo = protocolInfoData != null ? protocolInfoData.getProtocolLogo() : null;
        MemeProtocolUiData memeProtocolUiData = new MemeProtocolUiData(protocolLogo == null ? "" : protocolLogo, java.lang.Integer.valueOf(iKWHzl), java.lang.Integer.valueOf(iKWHzl2), null, null, null, 56, null);
        java.lang.String strAkhnZx = trendingTokenData.AkhnZx();
        java.lang.String strFARcdN = trendingTokenData.fARcdN();
        java.lang.String str3 = strFARcdN == null ? "" : strFARcdN;
        java.lang.String strValues = trendingTokenData.values();
        java.lang.String str4 = strValues == null ? "" : strValues;
        java.lang.String strGEmmrt = trendingTokenData.gEmmrt();
        java.lang.String strDjBIcL = trendingTokenData.djBIcL();
        java.lang.String str5 = strDjBIcL == null ? "" : strDjBIcL;
        MediaV2Data mediaV2DataFetchVPNInfo = trendingTokenData.fetchVPNInfo();
        java.util.List<MemeSocialMediaData> listKWHzl = (mediaV2DataFetchVPNInfo == null || (media = mediaV2DataFetchVPNInfo.toMedia()) == null) ? null : C28927kjx.KWHzl(media);
        if (listKWHzl == null) {
            listKWHzl = yDY.AhwBna();
        }
        java.util.List<MemeSocialMediaData> list = listKWHzl;
        java.util.List<java.lang.Float> listKWHzl2 = KWHzl(trendingTokenData.AhwBna());
        java.lang.String strIsConnected = trendingTokenData.isConnected();
        java.lang.String strFIwbmz = trendingTokenData.fIwbmz();
        java.lang.String strDbNXlk = trendingTokenData.DbNXlk();
        java.lang.String strAYXKKw = trendingTokenData.AYXKKw();
        java.lang.String str6 = strAYXKKw == null ? "" : strAYXKKw;
        java.lang.String strOLrzqt = trendingTokenData.OLrzqt();
        java.lang.String str7 = strOLrzqt == null ? "" : strOLrzqt;
        java.util.List<CompactTagData> listAuCTel = trendingTokenData.AuCTel();
        if (listAuCTel != null) {
            java.util.Iterator<T> it2 = listAuCTel.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((CompactTagData) next2).copydefault(), (java.lang.Object) "devHoldingStatus_sellAll")) {
                    obj = next2;
                    break;
                }
            }
            obj = (CompactTagData) obj;
        }
        return new C29250kqB(str2, strEZpvd, memeProtocolUiData, strAkhnZx, str3, str4, strAEQbTJ, strCopydefault, str5, strGEmmrt, list, listKWHzl2, strIsConnected, strFIwbmz, strDbNXlk, new MemeTagsData(null, str6, obj != null, null, null, null, null, str7, null, null, null, 1913, null), z);
    }

    /* JADX INFO: renamed from: o.kqz$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx((java.util.List) t, 0);
            java.lang.Long fieldNames = str != null ? StringsKt__StringNumberConversionsKt.getFieldNames(str) : null;
            java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx((java.util.List) t2, 0);
            return yET.KWHzl(fieldNames, str2 != null ? StringsKt__StringNumberConversionsKt.getFieldNames(str2) : null);
        }
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, TrendingConfigData trendingConfigData) {
        C25389ivm.safeLaunch$default(this.AhwBna, null, null, new GetTrendingTokensUseCase$subscribeWs$1(this, str, str2, trendingConfigData, null), 3, null);
        C25389ivm.safeLaunch$default(this.AhwBna, null, null, new GetTrendingTokensUseCase$subscribeWs$2(this, str2, trendingConfigData, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.util.List<C29250kqB> list, Continuation<? super java.util.List<C29250kqB>> continuation) throws java.lang.Throwable {
        GetTrendingTokensUseCase$applyPendingKlineUpdates$1 getTrendingTokensUseCase$applyPendingKlineUpdates$1;
        java.util.List<C29250kqB> list2;
        Mutex mutex;
        C29300kqz c29300kqz;
        java.lang.Object next;
        java.util.List<java.lang.Float> listAhwBna;
        java.util.List<java.lang.Float> listFetchVPNInfo;
        if (continuation instanceof GetTrendingTokensUseCase$applyPendingKlineUpdates$1) {
            getTrendingTokensUseCase$applyPendingKlineUpdates$1 = (GetTrendingTokensUseCase$applyPendingKlineUpdates$1) continuation;
            int i = getTrendingTokensUseCase$applyPendingKlineUpdates$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTrendingTokensUseCase$applyPendingKlineUpdates$1.label = i - Integer.MIN_VALUE;
            } else {
                getTrendingTokensUseCase$applyPendingKlineUpdates$1 = new GetTrendingTokensUseCase$applyPendingKlineUpdates$1(this, continuation);
            }
        }
        java.lang.Object obj = getTrendingTokensUseCase$applyPendingKlineUpdates$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getTrendingTokensUseCase$applyPendingKlineUpdates$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Mutex mutex2 = this.KWHzl;
            getTrendingTokensUseCase$applyPendingKlineUpdates$1.L$0 = this;
            list2 = list;
            getTrendingTokensUseCase$applyPendingKlineUpdates$1.L$1 = list2;
            getTrendingTokensUseCase$applyPendingKlineUpdates$1.L$2 = mutex2;
            getTrendingTokensUseCase$applyPendingKlineUpdates$1.label = 1;
            if (mutex2.lock(null, getTrendingTokensUseCase$applyPendingKlineUpdates$1) == objCopydefault) {
                return objCopydefault;
            }
            mutex = mutex2;
            c29300kqz = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) getTrendingTokensUseCase$applyPendingKlineUpdates$1.L$2;
            list2 = (java.util.List) getTrendingTokensUseCase$applyPendingKlineUpdates$1.L$1;
            c29300kqz = (C29300kqz) getTrendingTokensUseCase$applyPendingKlineUpdates$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            java.util.List<C29250kqB> value = c29300kqz.OLrzqt.getValue();
            if (value == null) {
                value = yDY.AhwBna();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            for (C29250kqB c29250kqB : list2) {
                java.lang.String strAEQbTJ = c29300kqz.AEQbTJ(c29250kqB.valueOf(), c29250kqB.AYXKKw());
                java.util.Iterator<T> it = value.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    C29250kqB c29250kqB2 = (C29250kqB) next;
                    if (Intrinsics.EZpvd((java.lang.Object) c29250kqB2.valueOf(), (java.lang.Object) c29250kqB.valueOf()) && Intrinsics.EZpvd((java.lang.Object) c29250kqB2.AYXKKw(), (java.lang.Object) c29250kqB.AYXKKw())) {
                        break;
                    }
                }
                C29250kqB c29250kqB3 = (C29250kqB) next;
                if (!c29250kqB.EZpvd().isEmpty()) {
                    listAhwBna = c29250kqB.EZpvd();
                } else {
                    listAhwBna = (c29250kqB3 == null || !(c29250kqB3.EZpvd().isEmpty() ^ true)) ? yDY.AhwBna() : c29250kqB3.EZpvd();
                }
                java.util.Map<java.lang.Long, java.lang.Float> map = c29300kqz.copydefault.get(strAEQbTJ);
                if (map == null || map.isEmpty()) {
                    listFetchVPNInfo = listAhwBna;
                } else {
                    java.util.Collection collectionValues = C56423yEv.gEmmrt(map).values();
                    Intrinsics.checkNotNullExpressionValue(collectionValues, "");
                    listFetchVPNInfo = CollectionsKt___CollectionsKt.fetchVPNInfo(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listAhwBna, (java.lang.Iterable) CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues)), 20);
                }
                arrayList.add(c29250kqB.OLrzqt((129023 & 1) != 0 ? c29250kqB.AkhnZx : null, (129023 & 2) != 0 ? c29250kqB.fetchVPNInfo : null, (129023 & 4) != 0 ? c29250kqB.gEmmrt : null, (129023 & 8) != 0 ? c29250kqB.OLrzqt : null, (129023 & 16) != 0 ? c29250kqB.fIwbmz : null, (129023 & 32) != 0 ? c29250kqB.values : null, (129023 & 64) != 0 ? c29250kqB.djBIcL : null, (129023 & 128) != 0 ? c29250kqB.valueOf : null, (129023 & 256) != 0 ? c29250kqB.DbNXlk : null, (129023 & 512) != 0 ? c29250kqB.isConnected : null, (129023 & 1024) != 0 ? c29250kqB.fARcdN : null, (129023 & 2048) != 0 ? c29250kqB.copydefault : listFetchVPNInfo, (129023 & 4096) != 0 ? c29250kqB.KWHzl : null, (129023 & 8192) != 0 ? c29250kqB.AuCTel : null, (129023 & 16384) != 0 ? c29250kqB.EZpvd : null, (129023 & 32768) != 0 ? c29250kqB.AYXKKw : null, (129023 & 65536) != 0 ? c29250kqB.AEQbTJ : false));
            }
            c29300kqz.copydefault.clear();
            return arrayList;
        } finally {
            mutex.unlock(null);
        }
    }

    public final java.util.List<C29250kqB> EZpvd(java.util.List<C29250kqB> list, java.util.List<TrendingTokenData> list2, TrendingConfigData trendingConfigData) {
        C29250kqB c29250kqBOLrzqt;
        C29250kqB c29250kqBOLrzqt2;
        if (list == null || list.isEmpty()) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            TrendingTokenData trendingTokenData = (TrendingTokenData) obj;
            if (trendingTokenData.copydefault() != null && trendingTokenData.AEQbTJ() != null) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
        for (java.lang.Object obj2 : arrayList) {
            TrendingTokenData trendingTokenData2 = (TrendingTokenData) obj2;
            java.lang.String strCopydefault = trendingTokenData2.copydefault();
            java.lang.String str = "";
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            java.lang.String strAEQbTJ = trendingTokenData2.AEQbTJ();
            if (strAEQbTJ != null) {
                str = strAEQbTJ;
            }
            linkedHashMap.put(AEQbTJ(strCopydefault, str), obj2);
        }
        if (linkedHashMap.isEmpty()) {
            return list;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C29250kqB c29250kqB : list) {
            TrendingTokenData trendingTokenData3 = (TrendingTokenData) linkedHashMap.get(AEQbTJ(c29250kqB.valueOf(), c29250kqB.AYXKKw()));
            if (trendingTokenData3 != null && (c29250kqBOLrzqt = OLrzqt(trendingTokenData3, trendingConfigData)) != null && (c29250kqBOLrzqt2 = c29250kqBOLrzqt.OLrzqt((129023 & 1) != 0 ? c29250kqBOLrzqt.AkhnZx : null, (129023 & 2) != 0 ? c29250kqBOLrzqt.fetchVPNInfo : null, (129023 & 4) != 0 ? c29250kqBOLrzqt.gEmmrt : null, (129023 & 8) != 0 ? c29250kqBOLrzqt.OLrzqt : null, (129023 & 16) != 0 ? c29250kqBOLrzqt.fIwbmz : null, (129023 & 32) != 0 ? c29250kqBOLrzqt.values : null, (129023 & 64) != 0 ? c29250kqBOLrzqt.djBIcL : null, (129023 & 128) != 0 ? c29250kqBOLrzqt.valueOf : null, (129023 & 256) != 0 ? c29250kqBOLrzqt.DbNXlk : null, (129023 & 512) != 0 ? c29250kqBOLrzqt.isConnected : null, (129023 & 1024) != 0 ? c29250kqBOLrzqt.fARcdN : null, (129023 & 2048) != 0 ? c29250kqBOLrzqt.copydefault : c29250kqB.EZpvd(), (129023 & 4096) != 0 ? c29250kqBOLrzqt.KWHzl : null, (129023 & 8192) != 0 ? c29250kqBOLrzqt.AuCTel : null, (129023 & 16384) != 0 ? c29250kqBOLrzqt.EZpvd : null, (129023 & 32768) != 0 ? c29250kqBOLrzqt.AYXKKw : null, (129023 & 65536) != 0 ? c29250kqBOLrzqt.AEQbTJ : c29250kqB.AuCTel())) != null) {
                c29250kqB = c29250kqBOLrzqt2;
            }
            arrayList2.add(c29250kqB);
        }
        return arrayList2;
    }

    public final void AEQbTJ(java.util.List<C29250kqB> list, java.util.Set<java.lang.String> set, java.util.Set<java.lang.String> set2) {
        if (C22416heu.ejfBZ()) {
            return;
        }
        java.util.Set setEZpvd = yEJ.EZpvd((java.util.Set) set, (java.lang.Iterable) set2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            C29250kqB c29250kqB = (C29250kqB) obj;
            if (setEZpvd.contains(AEQbTJ(c29250kqB.valueOf(), c29250kqB.AYXKKw()))) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            KWHzl((C29250kqB) it.next());
        }
    }

    public final void KWHzl(C29250kqB c29250kqB) {
        if (C22416heu.ejfBZ()) {
            return;
        }
        java.lang.String strAEQbTJ = AEQbTJ(c29250kqB.valueOf(), c29250kqB.AYXKKw());
        Job job = this.EZpvd.get(strAEQbTJ);
        if (job == null || !job.isActive()) {
            this.EZpvd.put(strAEQbTJ, C25389ivm.safeLaunch$default(this.AhwBna, null, null, new GetTrendingTokensUseCase$subscribeToTokenKline$job$1(this, c29250kqB, strAEQbTJ, null), 3, null));
        }
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        return str + "_" + str2;
    }

    public final void EZpvd() {
        JobKt__JobKt.cancelChildren$default(this.AhwBna.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
        this.EZpvd.clear();
        C25389ivm.safeLaunch$default(this.AhwBna, null, null, new GetTrendingTokensUseCase$stopWs$1(this, null), 3, null);
    }

    public final java.util.List<java.lang.Float> KWHzl(java.util.List<? extends java.util.List<java.lang.String>> list) {
        java.util.List listEZpvd;
        java.lang.Float fFIwbmz;
        java.util.ArrayList arrayList = null;
        if (list != null && (listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list, new ActionBar())) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = listEZpvd.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx((java.util.List) it.next(), 1);
                java.lang.Float fValueOf = (str == null || (fFIwbmz = C59443zhD.fIwbmz(str)) == null) ? null : java.lang.Float.valueOf(fFIwbmz.floatValue());
                if (fValueOf != null) {
                    arrayList2.add(fValueOf);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }

    public final void copydefault(java.util.List<C29250kqB> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C29250kqB c29250kqB : list) {
            arrayList.add(AEQbTJ(c29250kqB.valueOf(), c29250kqB.AYXKKw()));
        }
        java.util.Set<java.lang.String> setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        java.util.Set<java.lang.String> setOqFWZa2 = CollectionsKt___CollectionsKt.OqFWZa(this.EZpvd.keySet());
        java.util.Set<java.lang.String> setEZpvd = yEJ.EZpvd((java.util.Set) setOqFWZa2, (java.lang.Iterable) setOqFWZa);
        if (!(!setEZpvd.isEmpty())) {
            AEQbTJ(list, setOqFWZa, setOqFWZa2);
            return;
        }
        for (java.lang.String str : setEZpvd) {
            Job job = this.EZpvd.get(str);
            if (job != null && job.isActive()) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.EZpvd.remove(str);
            C25389ivm.safeLaunch$default(this.AhwBna, null, null, new GetTrendingTokensUseCase$manageKlineSubscriptions$1$2(this, str, null), 3, null);
        }
        C25389ivm.safeLaunch$default(this.AhwBna, null, null, new GetTrendingTokensUseCase$manageKlineSubscriptions$2(this, list, setOqFWZa, setOqFWZa2, null), 3, null);
    }
}
