package com.okinc.business.market.features.holdings.domain;

import com.okinc.business.market.data.model.position_pnl.HoldingTokenData;
import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C25389ivm;
import o.C28434kah;
import o.C28438kal;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC28437kak;

/* JADX INFO: loaded from: classes7.dex */
public final class GetHoldingsUseCase$startWebSocketSubscriptions$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C28434kah this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHoldingsUseCase$startWebSocketSubscriptions$3(C28434kah c28434kah, Continuation<? super GetHoldingsUseCase$startWebSocketSubscriptions$3> continuation) {
        super(2, continuation);
        this.this$0 = c28434kah;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetHoldingsUseCase$startWebSocketSubscriptions$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetHoldingsUseCase$startWebSocketSubscriptions$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<HoldingAsset> list = this.this$0.values;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (HoldingAsset holdingAsset : list) {
                arrayList.add(new C28438kal(holdingAsset.OLrzqt(), holdingAsset.fetchVPNInfo()));
            }
            InterfaceC28437kak interfaceC28437kak = this.this$0.isConnected;
            this.label = 1;
            obj = interfaceC28437kak.EZpvd(arrayList, this);
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
        final C28434kah c28434kah = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.holdings.domain.GetHoldingsUseCase$startWebSocketSubscriptions$3.2
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<HoldingTokenData> list2, Continuation<? super Unit> continuation) {
                HoldingTokenData holdingTokenData = (HoldingTokenData) CollectionsKt___CollectionsKt.firstOrNull(list2);
                if (holdingTokenData == null) {
                    return Unit.INSTANCE;
                }
                c28434kah.djBIcL.put(c28434kah.AEQbTJ(holdingTokenData.copydefault(), holdingTokenData.OLrzqt()), holdingTokenData.KWHzl());
                Job job = (Job) c28434kah.AhwBna.getAndSet(C25389ivm.safeLaunch$default(c28434kah.DbNXlk, null, null, new GetHoldingsUseCase$startWebSocketSubscriptions$3$1$1(c28434kah, null), 3, null));
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
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
