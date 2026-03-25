package com.okinc.business.market.features.scanner.surge.ui;

import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.common.constants.StringBooleanType;
import com.okinc.business.market.data.model.common.ProtocolInfoData;
import com.okinc.business.market.features.meme.domain.model.MemeSocialMediaData;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.business.market.features.scanner.surge.trending.data.ProtocolFilterData;
import com.okinc.business.market.features.scanner.surge.trending.data.RankInfoData;
import com.okinc.business.market.features.scanner.surge.trending.data.SurgeTrendingChainFilterData;
import com.okinc.business.market.features.scanner.surge.trending.data.TrendingConfigData;
import com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter;
import com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneyConfig;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C29250kqB;
import o.C29289kqo;
import o.C29296kqv;
import o.C29297kqw;
import o.C29299kqy;
import o.C29300kqz;
import o.C29345krr;
import o.C29346krs;
import o.C29464kuD;
import o.C29512kuz;
import o.C31191lpP;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C59443zhD;
import o.InterfaceC29359ksE;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SurgeTabViewModel extends ViewModel {
    public final MutableStateFlow<InterfaceC29359ksE> AEQbTJ;
    public final C29296kqv AYXKKw;
    public final C29512kuz AhwBna;
    public final C29464kuD AkhnZx;
    public List<C29250kqB> AuCTel;
    public final StateFlow<Boolean> DbNXlk;
    public C29346krs EZpvd;
    public final MutableStateFlow<Boolean> KWHzl;
    public String OLrzqt;
    public final MutableStateFlow<SmartMoneyConfig> copydefault;
    public boolean djBIcL;
    public final StateFlow<InterfaceC29359ksE> ejfBZ;
    public TrendingConfigData fARcdN;
    public final C29299kqy fetchVPNInfo;
    public final C29289kqo gEmmrt;
    public final StateFlow<SmartMoneyConfig> isConnected;
    public final C29300kqz valueOf;
    public final StateFlow<C29297kqw> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrendingConfigData AhwBna() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29346krs EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<SmartMoneyConfig> djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C29297kqw> gEmmrt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC29359ksE> valueOf() {
        return this.ejfBZ;
    }

    @yCM
    public SurgeTabViewModel(@NotNull C29289kqo c29289kqo, @NotNull C29296kqv c29296kqv, @NotNull C29300kqz c29300kqz, @NotNull C29299kqy c29299kqy, @NotNull C29512kuz c29512kuz, @NotNull C29464kuD c29464kuD) {
        Intrinsics.checkNotNullParameter(c29289kqo, "");
        Intrinsics.checkNotNullParameter(c29296kqv, "");
        Intrinsics.checkNotNullParameter(c29300kqz, "");
        Intrinsics.checkNotNullParameter(c29299kqy, "");
        Intrinsics.checkNotNullParameter(c29512kuz, "");
        Intrinsics.checkNotNullParameter(c29464kuD, "");
        this.gEmmrt = c29289kqo;
        this.AYXKKw = c29296kqv;
        this.valueOf = c29300kqz;
        this.fetchVPNInfo = c29299kqy;
        this.AhwBna = c29512kuz;
        this.AkhnZx = c29464kuD;
        this.OLrzqt = "";
        this.EZpvd = new C29346krs(null, null, null, 7, null);
        this.values = c29289kqo.OLrzqt();
        MutableStateFlow<InterfaceC29359ksE> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC29359ksE.StateListAnimator.copydefault);
        this.AEQbTJ = MutableStateFlow;
        this.ejfBZ = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.KWHzl = MutableStateFlow2;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<SmartMoneyConfig> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow3;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow3);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.scanner.surge.ui.SurgeTabViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SurgeTabViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<List<C29250kqB>> flowAEQbTJ = SurgeTabViewModel.this.valueOf.AEQbTJ();
                final SurgeTabViewModel surgeTabViewModel = SurgeTabViewModel.this;
                FlowCollector<? super List<C29250kqB>> flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.scanner.surge.ui.SurgeTabViewModel.1.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public final Object emit(List<C29250kqB> list, Continuation<? super Unit> continuation) {
                        if (list != null && !list.isEmpty()) {
                            surgeTabViewModel.AuCTel = list;
                            surgeTabViewModel.KWHzl();
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.scanner.surge.ui.SurgeTabViewModel$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SurgeTabViewModel.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                SurgeTabViewModel.fetchSignalSection$default(SurgeTabViewModel.this, false, 1, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void AEQbTJ() {
        this.fARcdN = null;
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SurgeTabViewModel$fetchTrendingSection$1(this, null), 3, null);
    }

    public static /* synthetic */ void fetchSignalSection$default(SurgeTabViewModel surgeTabViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        surgeTabViewModel.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SurgeTabViewModel$fetchSignalSection$1(z, this, null), 3, null);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SmartMoneyConfig value = this.isConnected.getValue();
        if (value == null) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SurgeTabViewModel$onSignalChainSelected$1(this, str, value, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(TrendingConfigData trendingConfigData, String str, SurgeTrendingChainFilterData surgeTrendingChainFilterData) {
        String strKWHzl;
        RankInfoData rankInfoData;
        List listAhwBna;
        ProtocolFilterData protocolFilterData;
        TrendingFilter trendingFilter;
        ProtocolInfoData protocolInfoData;
        Object next;
        Object next2;
        Object next3;
        List<RankInfoData> listOLrzqt = trendingConfigData.OLrzqt();
        if (listOLrzqt != null) {
            Iterator<T> it = listOLrzqt.iterator();
            while (true) {
                if (it.hasNext()) {
                    next3 = it.next();
                    if (((RankInfoData) next3).copydefault() == StringBooleanType.TRUE) {
                        break;
                    }
                } else {
                    next3 = null;
                    break;
                }
            }
            RankInfoData rankInfoData2 = (RankInfoData) next3;
            if (rankInfoData2 == null || (strKWHzl = rankInfoData2.KWHzl()) == null) {
                List<RankInfoData> listOLrzqt2 = trendingConfigData.OLrzqt();
                strKWHzl = (listOLrzqt2 == null || (rankInfoData = (RankInfoData) CollectionsKt___CollectionsKt.firstOrNull(listOLrzqt2)) == null) ? null : rankInfoData.KWHzl();
                if (strKWHzl == null) {
                    strKWHzl = "1h";
                }
            }
        }
        List<RankInfoData> listOLrzqt3 = trendingConfigData.OLrzqt();
        if (listOLrzqt3 != null) {
            listAhwBna = new ArrayList(C56403yEb.AYXKKw(listOLrzqt3, 10));
            Iterator<T> it2 = listOLrzqt3.iterator();
            while (it2.hasNext()) {
                listAhwBna.add(((RankInfoData) it2.next()).KWHzl());
            }
        } else {
            listAhwBna = null;
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        if (surgeTrendingChainFilterData != null && surgeTrendingChainFilterData.getRankType().length() > 0 && listAhwBna.contains(surgeTrendingChainFilterData.getRankType())) {
            strKWHzl = surgeTrendingChainFilterData.getRankType();
        }
        List<ProtocolFilterData> listKWHzl = trendingConfigData.KWHzl();
        if (listKWHzl != null) {
            Iterator<T> it3 = listKWHzl.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.EZpvd((Object) ((ProtocolFilterData) next2).copydefault(), (Object) str)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            protocolFilterData = (ProtocolFilterData) next2;
            if (protocolFilterData == null) {
                List<ProtocolFilterData> listKWHzl2 = trendingConfigData.KWHzl();
                protocolFilterData = listKWHzl2 != null ? (ProtocolFilterData) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl2) : null;
            }
        }
        if (protocolFilterData == null) {
            return;
        }
        List<String> listOLrzqt4 = protocolFilterData.OLrzqt();
        if (listOLrzqt4 == null) {
            listOLrzqt4 = yDY.AhwBna();
        }
        List<String> listEZpvd = protocolFilterData.EZpvd();
        if (listEZpvd == null) {
            listEZpvd = null;
        } else if (listEZpvd.isEmpty()) {
            listEZpvd = listOLrzqt4;
        }
        if (listEZpvd == null) {
            listEZpvd = yDY.AhwBna();
        }
        if (surgeTrendingChainFilterData != null && (!surgeTrendingChainFilterData.getSelectedProtocols().isEmpty())) {
            List<String> selectedProtocols = surgeTrendingChainFilterData.getSelectedProtocols();
            ArrayList arrayList = new ArrayList();
            for (Object obj : selectedProtocols) {
                if (listOLrzqt4.contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                listEZpvd = arrayList;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : listOLrzqt4) {
            List<ProtocolInfoData> listEZpvd2 = trendingConfigData.EZpvd();
            if (listEZpvd2 != null) {
                Iterator<T> it4 = listEZpvd2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (Intrinsics.EZpvd((Object) ((ProtocolInfoData) next).getProtocolId(), (Object) str2)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                protocolInfoData = (ProtocolInfoData) next;
            } else {
                protocolInfoData = null;
            }
            if (protocolInfoData != null) {
                arrayList2.add(protocolInfoData);
            }
        }
        if (surgeTrendingChainFilterData != null) {
            trendingFilter = new TrendingFilter(surgeTrendingChainFilterData.getMarketCapMin(), surgeTrendingChainFilterData.getMarketCapMax(), surgeTrendingChainFilterData.getVolumeMin(), surgeTrendingChainFilterData.getVolumeMax(), surgeTrendingChainFilterData.getTokenAgeMin(), surgeTrendingChainFilterData.getTokenAgeMax(), TokenAgeType.Companion.AEQbTJ(surgeTrendingChainFilterData.getTokenAgeTypeValue()), surgeTrendingChainFilterData.getKeyword(), surgeTrendingChainFilterData.getNeedSocialLink());
        } else {
            trendingFilter = new TrendingFilter(null, null, null, null, null, null, null, null, false, FrameMetricsAggregator.EVERY_DURATION, null);
        }
        this.OLrzqt = str;
        List<String> listEZpvd3 = protocolFilterData.EZpvd();
        if (listEZpvd3 == null) {
            listEZpvd3 = yDY.AhwBna();
        }
        this.EZpvd = new C29346krs(strKWHzl, trendingFilter, new C29345krr(listEZpvd, listEZpvd3, arrayList2));
        KWHzl();
    }

    public final void EZpvd(@NotNull String str) {
        TrendingConfigData trendingConfigData;
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) str, (Object) this.OLrzqt) || (trendingConfigData = this.fARcdN) == null) {
            return;
        }
        values();
        boolean z = this.djBIcL;
        this.djBIcL = false;
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SurgeTabViewModel$onChainSelected$1(this, str, trendingConfigData, z, null), 3, null);
    }

    public final void AEQbTJ(@NotNull TrendingFilter trendingFilter, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(trendingFilter, "");
        Intrinsics.checkNotNullParameter(list, "");
        C29346krs c29346krs = this.EZpvd;
        this.EZpvd = C29346krs.copy$default(c29346krs, null, trendingFilter, C29345krr.copy$default(c29346krs.AEQbTJ(), list, null, null, 6, null), 1, null);
        KWHzl();
    }

    public final String OLrzqt() {
        List<RankInfoData> listOLrzqt;
        RankInfoData rankInfoData;
        List<RankInfoData> listOLrzqt2;
        Object next;
        String strKWHzl;
        TrendingConfigData trendingConfigData = this.fARcdN;
        String strKWHzl2 = null;
        if (trendingConfigData != null && (listOLrzqt2 = trendingConfigData.OLrzqt()) != null) {
            Iterator<T> it = listOLrzqt2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((RankInfoData) next).copydefault() == StringBooleanType.TRUE) {
                    break;
                }
            }
            RankInfoData rankInfoData2 = (RankInfoData) next;
            if (rankInfoData2 != null && (strKWHzl = rankInfoData2.KWHzl()) != null) {
                return strKWHzl;
            }
        }
        TrendingConfigData trendingConfigData2 = this.fARcdN;
        if (trendingConfigData2 != null && (listOLrzqt = trendingConfigData2.OLrzqt()) != null && (rankInfoData = (RankInfoData) CollectionsKt___CollectionsKt.firstOrNull(listOLrzqt)) != null) {
            strKWHzl2 = rankInfoData.KWHzl();
        }
        return strKWHzl2 == null ? "1h" : strKWHzl2;
    }

    public final void fetchVPNInfo() {
        TrendingConfigData trendingConfigData = this.fARcdN;
        if (trendingConfigData != null) {
            String strCopydefault = this.EZpvd.copydefault();
            copydefault(trendingConfigData, this.OLrzqt);
            if (Intrinsics.EZpvd((Object) this.EZpvd.copydefault(), (Object) strCopydefault)) {
                return;
            }
            fetchTrendingTokens$default(this, false, 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(TrendingConfigData trendingConfigData, String str) {
        ProtocolFilterData protocolFilterData;
        ProtocolInfoData protocolInfoData;
        Object next;
        Object next2;
        String strOLrzqt = OLrzqt();
        List<ProtocolFilterData> listKWHzl = trendingConfigData.KWHzl();
        List listAhwBna = null;
        if (listKWHzl != null) {
            Iterator<T> it = listKWHzl.iterator();
            while (true) {
                if (it.hasNext()) {
                    next2 = it.next();
                    if (Intrinsics.EZpvd((Object) ((ProtocolFilterData) next2).copydefault(), (Object) str)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            protocolFilterData = (ProtocolFilterData) next2;
            if (protocolFilterData == null) {
                List<ProtocolFilterData> listKWHzl2 = trendingConfigData.KWHzl();
                protocolFilterData = listKWHzl2 != null ? (ProtocolFilterData) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl2) : null;
            }
        }
        if (protocolFilterData == null) {
            return;
        }
        List<String> listEZpvd = protocolFilterData.EZpvd();
        if (listEZpvd == null) {
            listEZpvd = null;
        } else if (listEZpvd.isEmpty() && (listEZpvd = protocolFilterData.OLrzqt()) == null) {
            listEZpvd = yDY.AhwBna();
        }
        if (listEZpvd == null) {
            listEZpvd = yDY.AhwBna();
        }
        List<String> listOLrzqt = protocolFilterData.OLrzqt();
        if (listOLrzqt != null) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : listOLrzqt) {
                List<ProtocolInfoData> listEZpvd2 = trendingConfigData.EZpvd();
                if (listEZpvd2 != null) {
                    Iterator<T> it2 = listEZpvd2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.EZpvd((Object) ((ProtocolInfoData) next).getProtocolId(), (Object) str2)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    protocolInfoData = (ProtocolInfoData) next;
                } else {
                    protocolInfoData = null;
                }
                if (protocolInfoData != null) {
                    arrayList.add(protocolInfoData);
                }
            }
            listAhwBna = arrayList;
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        TrendingFilter trendingFilter = new TrendingFilter(null, null, null, null, null, null, null, null, false, FrameMetricsAggregator.EVERY_DURATION, null);
        List<String> listEZpvd3 = protocolFilterData.EZpvd();
        if (listEZpvd3 == null) {
            listEZpvd3 = yDY.AhwBna();
        }
        this.EZpvd = new C29346krs(strOLrzqt, trendingFilter, new C29345krr(listEZpvd, listEZpvd3, listAhwBna));
        KWHzl();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.business.market.features.scanner.surge.ui.SurgeTabViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void changeRankType$default(SurgeTabViewModel surgeTabViewModel, String str, TrendingFilter trendingFilter, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            trendingFilter = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        surgeTabViewModel.EZpvd(str, trendingFilter, list);
    }

    public final void EZpvd(@NotNull String str, TrendingFilter trendingFilter, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) this.EZpvd.copydefault(), (Object) str)) {
            return;
        }
        values();
        C29346krs c29346krs = this.EZpvd;
        if (trendingFilter == null) {
            trendingFilter = c29346krs.OLrzqt();
        }
        C29345krr c29345krrAEQbTJ = this.EZpvd.AEQbTJ();
        if (list == null) {
            list = this.EZpvd.AEQbTJ().KWHzl();
        }
        this.EZpvd = c29346krs.EZpvd(str, trendingFilter, C29345krr.copy$default(c29345krrAEQbTJ, list, null, null, 6, null));
        fetchTrendingTokens$default(this, false, 1, null);
    }

    public static /* synthetic */ void fetchTrendingTokens$default(SurgeTabViewModel surgeTabViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        surgeTabViewModel.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        String strCopydefault = this.EZpvd.copydefault();
        if (strCopydefault.length() != 0) {
            String str = this.OLrzqt;
            if (str.length() != 0) {
                C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SurgeTabViewModel$fetchTrendingTokens$1(z, this, strCopydefault, str, null), 3, null);
                return;
            } else {
                MutableStateFlow<InterfaceC29359ksE> mutableStateFlow = this.AEQbTJ;
                while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), InterfaceC29359ksE.Activity.OLrzqt)) {
                }
                return;
            }
        }
        MutableStateFlow<InterfaceC29359ksE> mutableStateFlow2 = this.AEQbTJ;
        while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), InterfaceC29359ksE.Activity.OLrzqt)) {
        }
    }

    public final void values() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SurgeTabViewModel$unSubscribeTrendingWs$1(this, null), 3, null);
    }

    public final void isConnected() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SurgeTabViewModel$unSubscribeSignalWs$1(this, null), 3, null);
    }

    public final boolean AEQbTJ(C29250kqB c29250kqB, TrendingFilter trendingFilter, List<String> list) {
        return EZpvd(c29250kqB, list) && EZpvd(c29250kqB, trendingFilter) && AEQbTJ(c29250kqB, trendingFilter) && OLrzqt(c29250kqB, trendingFilter) && KWHzl(c29250kqB, trendingFilter);
    }

    public final boolean EZpvd(C29250kqB c29250kqB, List<String> list) {
        if (!list.isEmpty()) {
            return CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends String>) ((Iterable<? extends Object>) list), c29250kqB.KWHzl());
        }
        return true;
    }

    public final boolean EZpvd(C29250kqB c29250kqB, TrendingFilter trendingFilter) {
        return OLrzqt(c29250kqB.AEQbTJ(), trendingFilter.OLrzqt(), trendingFilter.AEQbTJ()) && OLrzqt(c29250kqB.fJNWhG(), trendingFilter.gEmmrt(), trendingFilter.valueOf());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AEQbTJ(C29250kqB c29250kqB, TrendingFilter trendingFilter) {
        Long fieldNames;
        boolean z;
        boolean z2;
        if (StringsKt__StringsKt.fARcdN((CharSequence) trendingFilter.djBIcL()) && StringsKt__StringsKt.fARcdN((CharSequence) trendingFilter.copydefault())) {
            return true;
        }
        String strDjBIcL = c29250kqB.djBIcL();
        if (strDjBIcL == null || (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(strDjBIcL)) == null) {
            return false;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - fieldNames.longValue()) / trendingFilter.AYXKKw().getMillis();
        String strDjBIcL2 = trendingFilter.djBIcL();
        if (strDjBIcL2.length() != 0) {
            Long fieldNames2 = StringsKt__StringNumberConversionsKt.getFieldNames(strDjBIcL2);
            z = jCurrentTimeMillis >= (fieldNames2 != null ? fieldNames2.longValue() : 0L);
        }
        String strCopydefault = trendingFilter.copydefault();
        if (strCopydefault.length() != 0) {
            Long fieldNames3 = StringsKt__StringNumberConversionsKt.getFieldNames(strCopydefault);
            z2 = jCurrentTimeMillis <= (fieldNames3 != null ? fieldNames3.longValue() : Long.MAX_VALUE);
        }
        return z && z2;
    }

    public final boolean OLrzqt(C29250kqB c29250kqB, TrendingFilter trendingFilter) {
        if (StringsKt__StringsKt.fARcdN((CharSequence) trendingFilter.KWHzl())) {
            return true;
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) trendingFilter.KWHzl(), new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt__StringsKt.hDKMBd((CharSequence) it.next()).toString());
        }
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            for (String str : arrayList2) {
                if (StringsKt__StringsKt.AhwBna((CharSequence) c29250kqB.isConnected(), (CharSequence) str, true) || StringsKt__StringsKt.AhwBna((CharSequence) c29250kqB.values(), (CharSequence) str, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean KWHzl(C29250kqB c29250kqB, TrendingFilter trendingFilter) {
        if (trendingFilter.EZpvd()) {
            MemeSocialMediaData memeSocialMediaDataEjfBZ = c29250kqB.ejfBZ();
            String strEZpvd = memeSocialMediaDataEjfBZ != null ? memeSocialMediaDataEjfBZ.EZpvd() : null;
            if (strEZpvd == null || StringsKt__StringsKt.fARcdN((CharSequence) strEZpvd)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OLrzqt(String str, String str2, String str3) {
        boolean z;
        boolean z2;
        if (str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            return str2.length() == 0 && str3.length() == 0;
        }
        BigDecimal bigDecimalFARcdN = C59443zhD.fARcdN(str);
        if (bigDecimalFARcdN == null) {
            return false;
        }
        if (str2.length() != 0) {
            BigDecimal bigDecimalFARcdN2 = C59443zhD.fARcdN(C31191lpP.copydefault.AEQbTJ(str2));
            if (bigDecimalFARcdN2 == null) {
                bigDecimalFARcdN2 = BigDecimal.ZERO;
            }
            z = bigDecimalFARcdN.compareTo(bigDecimalFARcdN2) >= 0;
        }
        if (str3.length() != 0) {
            BigDecimal bigDecimalFARcdN3 = C59443zhD.fARcdN(C31191lpP.copydefault.AEQbTJ(str3));
            if (bigDecimalFARcdN3 == null) {
                bigDecimalFARcdN3 = BigDecimal.valueOf(Double.MAX_VALUE);
            }
            z2 = bigDecimalFARcdN.compareTo(bigDecimalFARcdN3) <= 0;
        }
        return z && z2;
    }

    public final void DbNXlk() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SurgeTabViewModel$saveFilterCache$1(this, null), 3, null);
    }

    public final void KWHzl() {
        List<C29250kqB> list = this.AuCTel;
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (AEQbTJ((C29250kqB) obj, this.EZpvd.OLrzqt(), this.EZpvd.AEQbTJ().KWHzl())) {
                arrayList.add(obj);
            }
        }
        MutableStateFlow<InterfaceC29359ksE> mutableStateFlow = this.AEQbTJ;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new InterfaceC29359ksE.Application(arrayList, this.EZpvd))) {
        }
        if (this.djBIcL) {
            DbNXlk();
        }
    }
}
