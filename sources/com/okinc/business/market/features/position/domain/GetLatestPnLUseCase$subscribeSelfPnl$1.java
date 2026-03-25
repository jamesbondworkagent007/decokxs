package com.okinc.business.market.features.position.domain;

import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.reactive.ReactiveFlowKt;
import o.C29123knh;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C9917bed;
import o.InterfaceC9859bdY;

/* JADX INFO: loaded from: classes7.dex */
public final class GetLatestPnLUseCase$subscribeSelfPnl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C29123knh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLatestPnLUseCase$subscribeSelfPnl$1(C29123knh c29123knh, Continuation<? super GetLatestPnLUseCase$subscribeSelfPnl$1> continuation) {
        super(2, continuation);
        this.this$0 = c29123knh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetLatestPnLUseCase$subscribeSelfPnl$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetLatestPnLUseCase$subscribeSelfPnl$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowAsFlow = ReactiveFlowKt.asFlow(((InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class)).AhwBna(this.this$0.KWHzl));
            final C29123knh c29123knh = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.position.domain.GetLatestPnLUseCase$subscribeSelfPnl$1.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(C9917bed c9917bed, Continuation<? super Unit> continuation) {
                    if (Intrinsics.EZpvd((Object) c9917bed.djBIcL(), (Object) c29123knh.OLrzqt.djBIcL())) {
                        C29123knh c29123knh2 = c29123knh;
                        PnLDetailsUiModel pnLDetailsUiModel = c29123knh2.OLrzqt;
                        c29123knh2.OLrzqt = pnLDetailsUiModel.OLrzqt((393215 & 1) != 0 ? pnLDetailsUiModel.AYXKKw : false, (393215 & 2) != 0 ? pnLDetailsUiModel.DbNXlk : null, (393215 & 4) != 0 ? pnLDetailsUiModel.isConnected : null, (393215 & 8) != 0 ? pnLDetailsUiModel.AkhnZx : null, (393215 & 16) != 0 ? pnLDetailsUiModel.KWHzl : null, (393215 & 32) != 0 ? pnLDetailsUiModel.valueOf : null, (393215 & 64) != 0 ? pnLDetailsUiModel.fJNWhG : null, (393215 & 128) != 0 ? pnLDetailsUiModel.AuCTel : null, (393215 & 256) != 0 ? pnLDetailsUiModel.AhwBna : null, (393215 & 512) != 0 ? pnLDetailsUiModel.djBIcL : null, (393215 & 1024) != 0 ? pnLDetailsUiModel.copydefault : null, (393215 & 2048) != 0 ? pnLDetailsUiModel.EZpvd : null, (393215 & 4096) != 0 ? pnLDetailsUiModel.fetchVPNInfo : null, (393215 & 8192) != 0 ? pnLDetailsUiModel.fIwbmz : null, (393215 & 16384) != 0 ? pnLDetailsUiModel.fARcdN : c9917bed.OLrzqt(), (393215 & 32768) != 0 ? pnLDetailsUiModel.values : null, (393215 & 65536) != 0 ? pnLDetailsUiModel.gEmmrt : null, (393215 & 131072) != 0 ? pnLDetailsUiModel.AEQbTJ : null, (393215 & 262144) != 0 ? pnLDetailsUiModel.OLrzqt : null);
                        C29123knh.updatePnLByPrice$default(c29123knh, null, 1, null);
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
