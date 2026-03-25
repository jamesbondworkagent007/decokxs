package com.okinc.tradingbot.impl.market_place;

import com.okinc.social_trade_api.data.NmpBannerDto;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C51042vfZ;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49321umO;

/* JADX INFO: loaded from: classes19.dex */
public final class MarketPlaceFragment$addHeaderInfoObserver$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C51042vfZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketPlaceFragment$addHeaderInfoObserver$3(C51042vfZ c51042vfZ, Continuation<? super MarketPlaceFragment$addHeaderInfoObserver$3> continuation) {
        super(2, continuation);
        this.this$0 = c51042vfZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketPlaceFragment$addHeaderInfoObserver$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketPlaceFragment$addHeaderInfoObserver$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<List<NmpBannerDto>> stateFlowAhwBna = this.this$0.valueOf().AhwBna();
            final C51042vfZ c51042vfZ = this.this$0;
            FlowCollector<? super List<NmpBannerDto>> flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.market_place.MarketPlaceFragment$addHeaderInfoObserver$3.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(List<NmpBannerDto> list, Continuation<? super Unit> continuation) {
                    InterfaceC49321umO interfaceC49321umO = c51042vfZ.copydefault;
                    if (interfaceC49321umO != null) {
                        interfaceC49321umO.EZpvd(list);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowAhwBna.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
