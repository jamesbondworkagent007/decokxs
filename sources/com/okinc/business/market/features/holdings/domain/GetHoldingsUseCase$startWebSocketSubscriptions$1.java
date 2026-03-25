package com.okinc.business.market.features.holdings.domain;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.reactive.ReactiveFlowKt;
import o.C28434kah;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C9917bed;
import o.InterfaceC9859bdY;

/* JADX INFO: loaded from: classes7.dex */
public final class GetHoldingsUseCase$startWebSocketSubscriptions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $refreshPnl;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C28434kah this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHoldingsUseCase$startWebSocketSubscriptions$1(C28434kah c28434kah, Function0<Unit> function0, Continuation<? super GetHoldingsUseCase$startWebSocketSubscriptions$1> continuation) {
        super(2, continuation);
        this.this$0 = c28434kah;
        this.$refreshPnl = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetHoldingsUseCase$startWebSocketSubscriptions$1 getHoldingsUseCase$startWebSocketSubscriptions$1 = new GetHoldingsUseCase$startWebSocketSubscriptions$1(this.this$0, this.$refreshPnl, continuation);
        getHoldingsUseCase$startWebSocketSubscriptions$1.L$0 = obj;
        return getHoldingsUseCase$startWebSocketSubscriptions$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetHoldingsUseCase$startWebSocketSubscriptions$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Flow flowAsFlow = ReactiveFlowKt.asFlow(((InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class)).AhwBna(this.this$0.OLrzqt));
            final C28434kah c28434kah = this.this$0;
            final Function0<Unit> function0 = this.$refreshPnl;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.holdings.domain.GetHoldingsUseCase$startWebSocketSubscriptions$1.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public final Object emit(C9917bed c9917bed, Continuation<? super Unit> continuation) {
                    T next;
                    String strDjBIcL = c9917bed.djBIcL();
                    if (strDjBIcL != null) {
                        C28434kah c28434kah2 = c28434kah;
                        Function0<Unit> function02 = function0;
                        Iterator<T> it = c28434kah2.values.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            HoldingAsset holdingAsset = (HoldingAsset) next;
                            if (StringsKt__StringsKt.fARcdN((CharSequence) strDjBIcL)) {
                                if (Intrinsics.EZpvd((Object) holdingAsset.OLrzqt(), (Object) String.valueOf(c9917bed.EZpvd())) && holdingAsset.gEmmrt()) {
                                    break;
                                }
                            } else if (Intrinsics.EZpvd((Object) holdingAsset.fetchVPNInfo(), (Object) strDjBIcL)) {
                                break;
                            }
                        }
                        HoldingAsset holdingAsset2 = next;
                        if (holdingAsset2 != null) {
                            String strAEQbTJ = c28434kah2.AEQbTJ(holdingAsset2.fetchVPNInfo(), holdingAsset2.OLrzqt());
                            ConcurrentHashMap concurrentHashMap = c28434kah2.gEmmrt;
                            HoldingAsset holdingAsset3 = (HoldingAsset) c28434kah2.gEmmrt.get(strAEQbTJ);
                            HoldingAsset holdingAsset4 = holdingAsset3 == null ? holdingAsset2 : holdingAsset3;
                            concurrentHashMap.put(strAEQbTJ, holdingAsset4.OLrzqt((2021653471 & 1) != 0 ? holdingAsset4.AEQbTJ : null, (2021653471 & 2) != 0 ? holdingAsset4.EZpvd : null, (2021653471 & 4) != 0 ? holdingAsset4.uzCIH : null, (2021653471 & 8) != 0 ? holdingAsset4.iwGUEr : null, (2021653471 & 16) != 0 ? holdingAsset4.getFieldNames : null, (2021653471 & 32) != 0 ? holdingAsset4.fIwbmz : null, (2021653471 & 64) != 0 ? holdingAsset4.copydefault : String.valueOf(c9917bed.OLrzqt()), (2021653471 & 128) != 0 ? holdingAsset4.KWHzl : null, (2021653471 & 256) != 0 ? holdingAsset4.OLrzqt : null, (2021653471 & 512) != 0 ? holdingAsset4.djBIcL : null, (2021653471 & 1024) != 0 ? holdingAsset4.gEmmrt : null, (2021653471 & 2048) != 0 ? holdingAsset4.AYXKKw : null, (2021653471 & 4096) != 0 ? holdingAsset4.AhwBna : false, (2021653471 & 8192) != 0 ? holdingAsset4.fetchVPNInfo : false, (2021653471 & 16384) != 0 ? holdingAsset4.AkhnZx : null, (2021653471 & 32768) != 0 ? holdingAsset4.values : false, (2021653471 & 65536) != 0 ? holdingAsset4.DbNXlk : false, (2021653471 & 131072) != 0 ? holdingAsset4.getNewProxyInstance : false, (2021653471 & 262144) != 0 ? holdingAsset4.isConnected : null, (2021653471 & 524288) != 0 ? holdingAsset4.fARcdN : null, (2021653471 & 1048576) != 0 ? holdingAsset4.fJNWhG : null, (2021653471 & 2097152) != 0 ? holdingAsset4.AuCTel : null, (2021653471 & 4194304) != 0 ? holdingAsset4.hDKMBd : null, (2021653471 & 8388608) != 0 ? holdingAsset4.wlaJM : null, (2021653471 & 16777216) != 0 ? holdingAsset4.AubY : null, (2021653471 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? holdingAsset4.zsXlph : null, (2021653471 & 67108864) != 0 ? holdingAsset4.AuCTelauCTel : null, (2021653471 & 134217728) != 0 ? holdingAsset4.zLjUOn : null, (2021653471 & 268435456) != 0 ? holdingAsset4.AwvSrB : null, (2021653471 & 536870912) != 0 ? holdingAsset4.ejfBZ : false, (2021653471 & 1073741824) != 0 ? holdingAsset4.valueOf : false));
                            c28434kah2.EZpvd();
                        } else if (!Intrinsics.EZpvd(c9917bed.gEmmrt(), C56443yFo.KWHzl(true))) {
                            function02.invoke();
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowAsFlow.collect(flowCollector, this) == objCopydefault) {
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
