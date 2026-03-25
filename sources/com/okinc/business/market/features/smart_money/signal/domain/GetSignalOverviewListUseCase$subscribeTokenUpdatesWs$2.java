package com.okinc.business.market.features.smart_money.signal.domain;

import com.okinc.business.market.data.model.CoinRankingWsData;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C29508kuv;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC29466kuF;

/* JADX INFO: loaded from: classes23.dex */
public final class GetSignalOverviewListUseCase$subscribeTokenUpdatesWs$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $tokenChainId;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ C29508kuv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignalOverviewListUseCase$subscribeTokenUpdatesWs$2(C29508kuv c29508kuv, String str, String str2, Continuation<? super GetSignalOverviewListUseCase$subscribeTokenUpdatesWs$2> continuation) {
        super(2, continuation);
        this.this$0 = c29508kuv;
        this.$tokenChainId = str;
        this.$tokenContractAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSignalOverviewListUseCase$subscribeTokenUpdatesWs$2(this.this$0, this.$tokenChainId, this.$tokenContractAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetSignalOverviewListUseCase$subscribeTokenUpdatesWs$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC29466kuF interfaceC29466kuF = this.this$0.AYXKKw;
            String str = this.$tokenChainId;
            String str2 = this.$tokenContractAddress;
            this.label = 1;
            obj = interfaceC29466kuF.copydefault(str, str2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        final C29508kuv c29508kuv = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$subscribeTokenUpdatesWs$2.4
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public final Object emit(CoinRankingWsData coinRankingWsData, Continuation<? super Unit> continuation) {
                Object value;
                ArrayList arrayList;
                MutableStateFlow mutableStateFlow = c29508kuv.KWHzl;
                do {
                    value = mutableStateFlow.getValue();
                    List<SignalOverviewUiModel> list = (List) value;
                    if (list != null) {
                        arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                        for (SignalOverviewUiModel signalOverviewUiModelAEQbTJ : list) {
                            if (Intrinsics.EZpvd((Object) signalOverviewUiModelAEQbTJ.valueOf(), (Object) coinRankingWsData.getChainId()) && Intrinsics.EZpvd((Object) signalOverviewUiModelAEQbTJ.values(), (Object) coinRankingWsData.getTokenContractAddress())) {
                                signalOverviewUiModelAEQbTJ = signalOverviewUiModelAEQbTJ.AEQbTJ((212991 & 1) != 0 ? signalOverviewUiModelAEQbTJ.AkhnZx : null, (212991 & 2) != 0 ? signalOverviewUiModelAEQbTJ.DbNXlk : null, (212991 & 4) != 0 ? signalOverviewUiModelAEQbTJ.isConnected : null, (212991 & 8) != 0 ? signalOverviewUiModelAEQbTJ.values : null, (212991 & 16) != 0 ? signalOverviewUiModelAEQbTJ.fetchVPNInfo : null, (212991 & 32) != 0 ? signalOverviewUiModelAEQbTJ.fARcdN : null, (212991 & 64) != 0 ? signalOverviewUiModelAEQbTJ.fIwbmz : null, (212991 & 128) != 0 ? signalOverviewUiModelAEQbTJ.ejfBZ : null, (212991 & 256) != 0 ? signalOverviewUiModelAEQbTJ.AEQbTJ : null, (212991 & 512) != 0 ? signalOverviewUiModelAEQbTJ.KWHzl : coinRankingWsData.getPrice(), (212991 & 1024) != 0 ? signalOverviewUiModelAEQbTJ.EZpvd : coinRankingWsData.getMarketCap(), (212991 & 2048) != 0 ? signalOverviewUiModelAEQbTJ.copydefault : coinRankingWsData.getHolders(), (212991 & 4096) != 0 ? signalOverviewUiModelAEQbTJ.valueOf : 0L, (212991 & 8192) != 0 ? signalOverviewUiModelAEQbTJ.AhwBna : null, (212991 & 16384) != 0 ? signalOverviewUiModelAEQbTJ.AYXKKw : null, (212991 & 32768) != 0 ? signalOverviewUiModelAEQbTJ.djBIcL : null, (212991 & 65536) != 0 ? signalOverviewUiModelAEQbTJ.gEmmrt : null, (212991 & 131072) != 0 ? signalOverviewUiModelAEQbTJ.AuCTel : null);
                            }
                            arrayList.add(signalOverviewUiModelAEQbTJ);
                        }
                    } else {
                        arrayList = null;
                    }
                } while (!mutableStateFlow.compareAndSet(value, arrayList));
                return Unit.INSTANCE;
            }
        };
        this.label = 2;
        if (((Flow) obj).collect(flowCollector, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
