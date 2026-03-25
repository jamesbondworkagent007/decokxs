package com.okinc.business.market.features.trader.ui;

import com.okinc.business.market.features.trader.domain.model.Traders;
import com.okinc.business.market.features.trader.domain.model.TradersRequestParam;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C29777kzz;
import o.C56391yDq;
import o.C56442yFn;
import o.C59449zhJ;

/* JADX INFO: loaded from: classes7.dex */
public final class TraderViewModel$subscribe$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TraderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraderViewModel$subscribe$1(TraderViewModel traderViewModel, Continuation<? super TraderViewModel$subscribe$1> continuation) {
        super(2, continuation);
        this.this$0 = traderViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TraderViewModel$subscribe$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TraderViewModel$subscribe$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String strOLrzqt = this.this$0.AkhnZx.OLrzqt();
            String strAYXKKw = this.this$0.AkhnZx.AYXKKw();
            String strCopydefault = this.this$0.gEmmrt().getValue().KWHzl().copydefault();
            String strEZpvd = this.this$0.gEmmrt().getValue().EZpvd();
            String str = this.this$0.fARcdN;
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            TradersRequestParam tradersRequestParam = new TradersRequestParam(strOLrzqt, strAYXKKw, str, strCopydefault, strEZpvd, C59449zhJ.replace$default(string, "-", "", false, 4, (Object) null));
            C29777kzz c29777kzz = this.this$0.DbNXlk;
            this.label = 1;
            objCopydefault = c29777kzz.copydefault(tradersRequestParam, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
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
            objCopydefault = obj;
        }
        final TraderViewModel traderViewModel = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.trader.ui.TraderViewModel$subscribe$1.4
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<Traders> list, Continuation<? super Unit> continuation) {
                traderViewModel.fetchVPNInfo = list;
                traderViewModel.copydefault();
                return Unit.INSTANCE;
            }
        };
        this.label = 2;
        if (((Flow) objCopydefault).collect(flowCollector, this) == objCopydefault2) {
            return objCopydefault2;
        }
        return Unit.INSTANCE;
    }
}
