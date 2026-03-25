package com.okinc.business.market.features.holdings.domain;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.data.model.position_pnl.HoldingTransactionData;
import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C28434kah;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28437kak;

/* JADX INFO: loaded from: classes7.dex */
public final class GetHoldingsUseCase$startWebSocketSubscriptions$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C28434kah this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHoldingsUseCase$startWebSocketSubscriptions$2(C28434kah c28434kah, Continuation<? super GetHoldingsUseCase$startWebSocketSubscriptions$2> continuation) {
        super(2, continuation);
        this.this$0 = c28434kah;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetHoldingsUseCase$startWebSocketSubscriptions$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetHoldingsUseCase$startWebSocketSubscriptions$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28434kah c28434kah = this.this$0;
            c28434kah.copydefault = c28434kah.fetchVPNInfo.EZpvd();
            InterfaceC28437kak interfaceC28437kak = this.this$0.isConnected;
            List<String> list = this.this$0.copydefault;
            this.label = 1;
            obj = interfaceC28437kak.OLrzqt(list, this);
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
        final C28434kah c28434kah2 = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.holdings.domain.GetHoldingsUseCase$startWebSocketSubscriptions$2.5
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<HoldingTransactionData> list2, Continuation<? super Unit> continuation) {
                T next;
                C28434kah c28434kah3 = c28434kah2;
                for (HoldingTransactionData holdingTransactionData : list2) {
                    if (c28434kah3.copydefault.contains(holdingTransactionData.getWalletAddress())) {
                        Iterator<T> it = c28434kah3.values.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            HoldingAsset holdingAsset = (HoldingAsset) next;
                            if (Intrinsics.EZpvd((Object) holdingAsset.fetchVPNInfo(), (Object) holdingTransactionData.getTokenContractAddress()) && Intrinsics.EZpvd((Object) holdingAsset.OLrzqt(), (Object) holdingTransactionData.getChainId())) {
                                break;
                            }
                        }
                        HoldingAsset holdingAsset2 = next;
                        if (holdingAsset2 != null) {
                            String strAEQbTJ = c28434kah3.AEQbTJ(holdingAsset2.fetchVPNInfo(), holdingAsset2.OLrzqt());
                            ConcurrentHashMap concurrentHashMap = c28434kah3.gEmmrt;
                            HoldingAsset holdingAsset3 = (HoldingAsset) c28434kah3.gEmmrt.get(strAEQbTJ);
                            HoldingAsset holdingAsset4 = holdingAsset3 == null ? holdingAsset2 : holdingAsset3;
                            concurrentHashMap.put(strAEQbTJ, holdingAsset4.OLrzqt((2021653471 & 1) != 0 ? holdingAsset4.AEQbTJ : null, (2021653471 & 2) != 0 ? holdingAsset4.EZpvd : null, (2021653471 & 4) != 0 ? holdingAsset4.uzCIH : null, (2021653471 & 8) != 0 ? holdingAsset4.iwGUEr : null, (2021653471 & 16) != 0 ? holdingAsset4.getFieldNames : null, (2021653471 & 32) != 0 ? holdingAsset4.fIwbmz : null, (2021653471 & 64) != 0 ? holdingAsset4.copydefault : null, (2021653471 & 128) != 0 ? holdingAsset4.KWHzl : holdingTransactionData.getHoldAvgPrice(), (2021653471 & 256) != 0 ? holdingAsset4.OLrzqt : null, (2021653471 & 512) != 0 ? holdingAsset4.djBIcL : null, (2021653471 & 1024) != 0 ? holdingAsset4.gEmmrt : null, (2021653471 & 2048) != 0 ? holdingAsset4.AYXKKw : holdingTransactionData.getHoldAvgPrice(), (2021653471 & 4096) != 0 ? holdingAsset4.AhwBna : false, (2021653471 & 8192) != 0 ? holdingAsset4.fetchVPNInfo : false, (2021653471 & 16384) != 0 ? holdingAsset4.AkhnZx : null, (2021653471 & 32768) != 0 ? holdingAsset4.values : false, (2021653471 & 65536) != 0 ? holdingAsset4.DbNXlk : false, (2021653471 & 131072) != 0 ? holdingAsset4.getNewProxyInstance : false, (2021653471 & 262144) != 0 ? holdingAsset4.isConnected : null, (2021653471 & 524288) != 0 ? holdingAsset4.fARcdN : null, (2021653471 & 1048576) != 0 ? holdingAsset4.fJNWhG : holdingTransactionData.getRealizedProfit(), (2021653471 & 2097152) != 0 ? holdingAsset4.AuCTel : null, (2021653471 & 4194304) != 0 ? holdingAsset4.hDKMBd : holdingTransactionData.getSpotBalance(), (2021653471 & 8388608) != 0 ? holdingAsset4.wlaJM : null, (2021653471 & 16777216) != 0 ? holdingAsset4.AubY : null, (2021653471 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? holdingAsset4.zsXlph : null, (2021653471 & 67108864) != 0 ? holdingAsset4.AuCTelauCTel : null, (2021653471 & 134217728) != 0 ? holdingAsset4.zLjUOn : null, (2021653471 & 268435456) != 0 ? holdingAsset4.AwvSrB : null, (2021653471 & 536870912) != 0 ? holdingAsset4.ejfBZ : false, (2021653471 & 1073741824) != 0 ? holdingAsset4.valueOf : false));
                            c28434kah3.EZpvd();
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                }
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
