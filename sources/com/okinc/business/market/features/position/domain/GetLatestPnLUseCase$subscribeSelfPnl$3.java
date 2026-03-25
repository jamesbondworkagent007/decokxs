package com.okinc.business.market.features.position.domain;

import com.okinc.business.market.data.model.position_pnl.HoldingTokenData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C28438kal;
import o.C29123knh;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.InterfaceC28437kak;

/* JADX INFO: loaded from: classes7.dex */
public final class GetLatestPnLUseCase$subscribeSelfPnl$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenAddress;
    int label;
    final /* synthetic */ C29123knh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLatestPnLUseCase$subscribeSelfPnl$3(C29123knh c29123knh, String str, String str2, Continuation<? super GetLatestPnLUseCase$subscribeSelfPnl$3> continuation) {
        super(2, continuation);
        this.this$0 = c29123knh;
        this.$chainId = str;
        this.$tokenAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetLatestPnLUseCase$subscribeSelfPnl$3(this.this$0, this.$chainId, this.$tokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetLatestPnLUseCase$subscribeSelfPnl$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC28437kak interfaceC28437kak = this.this$0.AYXKKw;
            List<C28438kal> listEZpvd = C56402yEa.EZpvd(new C28438kal(this.$chainId, this.$tokenAddress));
            this.label = 1;
            obj = interfaceC28437kak.EZpvd(listEZpvd, this);
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
        final C29123knh c29123knh = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.position.domain.GetLatestPnLUseCase$subscribeSelfPnl$3.2
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<HoldingTokenData> list, Continuation<? super Unit> continuation) {
                HoldingTokenData holdingTokenData = (HoldingTokenData) CollectionsKt___CollectionsKt.firstOrNull(list);
                if (holdingTokenData != null && Intrinsics.EZpvd((Object) holdingTokenData.copydefault(), (Object) c29123knh.OLrzqt.djBIcL())) {
                    c29123knh.EZpvd(holdingTokenData.KWHzl());
                    return Unit.INSTANCE;
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
