package com.okinc.business.market.features.smart_money.signal.domain;

import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewKLineUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C29507kuu;
import o.C29508kuv;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class GetSignalOverviewListUseCase$fetchKlineLoadMore$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ TimeIntervalSelector $timeIntervalSelector$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    int label;
    final /* synthetic */ C29508kuv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignalOverviewListUseCase$fetchKlineLoadMore$$inlined$dexRunCatching$1(Continuation continuation, C29508kuv c29508kuv, String str, String str2, TimeIntervalSelector timeIntervalSelector) {
        super(2, continuation);
        this.this$0 = c29508kuv;
        this.$chainId$inlined = str;
        this.$tokenContractAddress$inlined = str2;
        this.$timeIntervalSelector$inlined = timeIntervalSelector;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSignalOverviewListUseCase$fetchKlineLoadMore$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$tokenContractAddress$inlined, this.$timeIntervalSelector$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return ((GetSignalOverviewListUseCase$fetchKlineLoadMore$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Unit unit;
        Object next;
        Object value;
        ArrayList arrayList;
        Object objM7386unboximpl;
        Object value2;
        ArrayList arrayList2;
        Object value3;
        ArrayList arrayList3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            List<SignalOverviewUiModel> value4 = this.this$0.AEQbTJ().getValue();
            if (value4 != null) {
                Iterator<T> it = value4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    SignalOverviewUiModel signalOverviewUiModel = (SignalOverviewUiModel) next;
                    if (Intrinsics.EZpvd((Object) signalOverviewUiModel.valueOf(), (Object) this.$chainId$inlined) && Intrinsics.EZpvd((Object) signalOverviewUiModel.values(), (Object) this.$tokenContractAddress$inlined)) {
                        break;
                    }
                }
                SignalOverviewUiModel signalOverviewUiModel2 = (SignalOverviewUiModel) next;
                if (signalOverviewUiModel2 == null) {
                    unit = Unit.INSTANCE;
                    objM7377constructorimpl = Result.m7377constructorimpl(unit);
                } else if (signalOverviewUiModel2.OLrzqt().OLrzqt()) {
                    MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
                    do {
                        value = mutableStateFlow.getValue();
                        List<SignalOverviewUiModel> list = (List) value;
                        if (list != null) {
                            arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                            for (SignalOverviewUiModel signalOverviewUiModelAEQbTJ : list) {
                                if (Intrinsics.EZpvd((Object) signalOverviewUiModelAEQbTJ.valueOf(), (Object) this.$chainId$inlined) && Intrinsics.EZpvd((Object) signalOverviewUiModelAEQbTJ.values(), (Object) this.$tokenContractAddress$inlined)) {
                                    signalOverviewUiModelAEQbTJ = signalOverviewUiModelAEQbTJ.AEQbTJ((212991 & 1) != 0 ? signalOverviewUiModelAEQbTJ.AkhnZx : null, (212991 & 2) != 0 ? signalOverviewUiModelAEQbTJ.DbNXlk : null, (212991 & 4) != 0 ? signalOverviewUiModelAEQbTJ.isConnected : null, (212991 & 8) != 0 ? signalOverviewUiModelAEQbTJ.values : null, (212991 & 16) != 0 ? signalOverviewUiModelAEQbTJ.fetchVPNInfo : null, (212991 & 32) != 0 ? signalOverviewUiModelAEQbTJ.fARcdN : null, (212991 & 64) != 0 ? signalOverviewUiModelAEQbTJ.fIwbmz : null, (212991 & 128) != 0 ? signalOverviewUiModelAEQbTJ.ejfBZ : null, (212991 & 256) != 0 ? signalOverviewUiModelAEQbTJ.AEQbTJ : null, (212991 & 512) != 0 ? signalOverviewUiModelAEQbTJ.KWHzl : null, (212991 & 1024) != 0 ? signalOverviewUiModelAEQbTJ.EZpvd : null, (212991 & 2048) != 0 ? signalOverviewUiModelAEQbTJ.copydefault : null, (212991 & 4096) != 0 ? signalOverviewUiModelAEQbTJ.valueOf : 0L, (212991 & 8192) != 0 ? signalOverviewUiModelAEQbTJ.AhwBna : null, (212991 & 16384) != 0 ? signalOverviewUiModelAEQbTJ.AYXKKw : null, (212991 & 32768) != 0 ? signalOverviewUiModelAEQbTJ.djBIcL : SignalOverviewKLineUiModel.copy$default(signalOverviewUiModelAEQbTJ.OLrzqt(), null, null, false, false, false, false, 15, null), (212991 & 65536) != 0 ? signalOverviewUiModelAEQbTJ.gEmmrt : null, (212991 & 131072) != 0 ? signalOverviewUiModelAEQbTJ.AuCTel : null);
                                }
                                arrayList.add(signalOverviewUiModelAEQbTJ);
                            }
                        } else {
                            arrayList = null;
                        }
                    } while (!mutableStateFlow.compareAndSet(value, arrayList));
                    C29507kuu c29507kuu = this.this$0.AEQbTJ;
                    String str = this.$chainId$inlined;
                    String str2 = this.$tokenContractAddress$inlined;
                    TimeIntervalSelector timeIntervalSelector = this.$timeIntervalSelector$inlined;
                    long jAEQbTJ = ((SignalOverviewKLineUiModel.DataPoint) CollectionsKt___CollectionsKt.AuCTelauCTel(signalOverviewUiModel2.OLrzqt().EZpvd())).AEQbTJ();
                    this.label = 1;
                    Object objAEQbTJ = c29507kuu.AEQbTJ(str, str2, timeIntervalSelector, jAEQbTJ, this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7386unboximpl = objAEQbTJ;
                } else {
                    unit = Unit.INSTANCE;
                    objM7377constructorimpl = Result.m7377constructorimpl(unit);
                }
            } else {
                unit = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
            }
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        objM7386unboximpl = ((Result) obj).m7386unboximpl();
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            SignalOverviewKLineUiModel signalOverviewKLineUiModel = (SignalOverviewKLineUiModel) objM7386unboximpl;
            MutableStateFlow mutableStateFlow2 = this.this$0.KWHzl;
            do {
                value3 = mutableStateFlow2.getValue();
                List<SignalOverviewUiModel> list2 = (List) value3;
                if (list2 != null) {
                    arrayList3 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                    for (SignalOverviewUiModel signalOverviewUiModelAEQbTJ2 : list2) {
                        if (Intrinsics.EZpvd((Object) signalOverviewUiModelAEQbTJ2.valueOf(), (Object) this.$chainId$inlined) && Intrinsics.EZpvd((Object) signalOverviewUiModelAEQbTJ2.values(), (Object) this.$tokenContractAddress$inlined)) {
                            signalOverviewUiModelAEQbTJ2 = signalOverviewUiModelAEQbTJ2.AEQbTJ((212991 & 1) != 0 ? signalOverviewUiModelAEQbTJ2.AkhnZx : null, (212991 & 2) != 0 ? signalOverviewUiModelAEQbTJ2.DbNXlk : null, (212991 & 4) != 0 ? signalOverviewUiModelAEQbTJ2.isConnected : null, (212991 & 8) != 0 ? signalOverviewUiModelAEQbTJ2.values : null, (212991 & 16) != 0 ? signalOverviewUiModelAEQbTJ2.fetchVPNInfo : null, (212991 & 32) != 0 ? signalOverviewUiModelAEQbTJ2.fARcdN : null, (212991 & 64) != 0 ? signalOverviewUiModelAEQbTJ2.fIwbmz : null, (212991 & 128) != 0 ? signalOverviewUiModelAEQbTJ2.ejfBZ : null, (212991 & 256) != 0 ? signalOverviewUiModelAEQbTJ2.AEQbTJ : null, (212991 & 512) != 0 ? signalOverviewUiModelAEQbTJ2.KWHzl : null, (212991 & 1024) != 0 ? signalOverviewUiModelAEQbTJ2.EZpvd : null, (212991 & 2048) != 0 ? signalOverviewUiModelAEQbTJ2.copydefault : null, (212991 & 4096) != 0 ? signalOverviewUiModelAEQbTJ2.valueOf : 0L, (212991 & 8192) != 0 ? signalOverviewUiModelAEQbTJ2.AhwBna : null, (212991 & 16384) != 0 ? signalOverviewUiModelAEQbTJ2.AYXKKw : null, (212991 & 32768) != 0 ? signalOverviewUiModelAEQbTJ2.djBIcL : SignalOverviewKLineUiModel.copy$default(signalOverviewKLineUiModel, null, null, false, false, false, true, 15, null), (212991 & 65536) != 0 ? signalOverviewUiModelAEQbTJ2.gEmmrt : null, (212991 & 131072) != 0 ? signalOverviewUiModelAEQbTJ2.AuCTel : null);
                        }
                        arrayList3.add(signalOverviewUiModelAEQbTJ2);
                    }
                } else {
                    arrayList3 = null;
                }
            } while (!mutableStateFlow2.compareAndSet(value3, arrayList3));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
            MutableStateFlow mutableStateFlow3 = this.this$0.KWHzl;
            do {
                value2 = mutableStateFlow3.getValue();
                List<SignalOverviewUiModel> list3 = (List) value2;
                if (list3 != null) {
                    arrayList2 = new ArrayList(C56403yEb.AYXKKw(list3, 10));
                    for (SignalOverviewUiModel signalOverviewUiModelAEQbTJ3 : list3) {
                        if (Intrinsics.EZpvd((Object) signalOverviewUiModelAEQbTJ3.valueOf(), (Object) this.$chainId$inlined) && Intrinsics.EZpvd((Object) signalOverviewUiModelAEQbTJ3.values(), (Object) this.$tokenContractAddress$inlined)) {
                            signalOverviewUiModelAEQbTJ3 = signalOverviewUiModelAEQbTJ3.AEQbTJ((212991 & 1) != 0 ? signalOverviewUiModelAEQbTJ3.AkhnZx : null, (212991 & 2) != 0 ? signalOverviewUiModelAEQbTJ3.DbNXlk : null, (212991 & 4) != 0 ? signalOverviewUiModelAEQbTJ3.isConnected : null, (212991 & 8) != 0 ? signalOverviewUiModelAEQbTJ3.values : null, (212991 & 16) != 0 ? signalOverviewUiModelAEQbTJ3.fetchVPNInfo : null, (212991 & 32) != 0 ? signalOverviewUiModelAEQbTJ3.fARcdN : null, (212991 & 64) != 0 ? signalOverviewUiModelAEQbTJ3.fIwbmz : null, (212991 & 128) != 0 ? signalOverviewUiModelAEQbTJ3.ejfBZ : null, (212991 & 256) != 0 ? signalOverviewUiModelAEQbTJ3.AEQbTJ : null, (212991 & 512) != 0 ? signalOverviewUiModelAEQbTJ3.KWHzl : null, (212991 & 1024) != 0 ? signalOverviewUiModelAEQbTJ3.EZpvd : null, (212991 & 2048) != 0 ? signalOverviewUiModelAEQbTJ3.copydefault : null, (212991 & 4096) != 0 ? signalOverviewUiModelAEQbTJ3.valueOf : 0L, (212991 & 8192) != 0 ? signalOverviewUiModelAEQbTJ3.AhwBna : null, (212991 & 16384) != 0 ? signalOverviewUiModelAEQbTJ3.AYXKKw : null, (212991 & 32768) != 0 ? signalOverviewUiModelAEQbTJ3.djBIcL : SignalOverviewKLineUiModel.copy$default(signalOverviewUiModelAEQbTJ3.OLrzqt(), null, null, false, false, false, true, 15, null), (212991 & 65536) != 0 ? signalOverviewUiModelAEQbTJ3.gEmmrt : null, (212991 & 131072) != 0 ? signalOverviewUiModelAEQbTJ3.AuCTel : null);
                        }
                        arrayList2.add(signalOverviewUiModelAEQbTJ3);
                    }
                } else {
                    arrayList2 = null;
                }
            } while (!mutableStateFlow3.compareAndSet(value2, arrayList2));
            pUU.AEQbTJ("GetSignalOverviewListUseCase", "Failed to fetch KLine data", thM7380exceptionOrNullimpl);
        }
        unit = Unit.INSTANCE;
        objM7377constructorimpl = Result.m7377constructorimpl(unit);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
