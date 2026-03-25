package com.okinc.business.dex.trade.order.ui;

import com.okinc.business.dex.trade.order.ui.viewmodel.TradesPagerViewModel;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C22241hbe;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC20070gZu;

/* JADX INFO: loaded from: classes5.dex */
public final class TradesPagerFragment$setListener$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C22241hbe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradesPagerFragment$setListener$7(C22241hbe c22241hbe, Continuation<? super TradesPagerFragment$setListener$7> continuation) {
        super(2, continuation);
        this.this$0 = c22241hbe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradesPagerFragment$setListener$7(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradesPagerFragment$setListener$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<InterfaceC20070gZu> stateFlowKWHzl = this.this$0.gEmmrt().KWHzl();
            final C22241hbe c22241hbe = this.this$0;
            FlowCollector<? super InterfaceC20070gZu> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.order.ui.TradesPagerFragment$setListener$7.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(InterfaceC20070gZu interfaceC20070gZu, Continuation<? super Unit> continuation) {
                    if (Intrinsics.EZpvd(interfaceC20070gZu, InterfaceC20070gZu.StateListAnimator.copydefault)) {
                        if (c22241hbe.AYXKKw().EZpvd() != null) {
                            c22241hbe.AYXKKw().copydefault((String) null);
                        }
                    } else {
                        if (!(interfaceC20070gZu instanceof InterfaceC20070gZu.Application)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC20070gZu.Application application = (InterfaceC20070gZu.Application) interfaceC20070gZu;
                        if (application.OLrzqt()) {
                            DefiChainInfo defiChainInfoEZpvd = c22241hbe.AYXKKw().EZpvd();
                            if (!Intrinsics.EZpvd((Object) (defiChainInfoEZpvd != null ? defiChainInfoEZpvd.getChainId() : null), (Object) application.copydefault())) {
                                c22241hbe.AYXKKw().copydefault(application.copydefault());
                            }
                        } else if (c22241hbe.AYXKKw().EZpvd() != null) {
                            c22241hbe.AYXKKw().copydefault((String) null);
                        } else {
                            TradesPagerViewModel.loadOrderList$default(c22241hbe.AYXKKw(), false, 1, null);
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowKWHzl.collect(flowCollector, this) == objCopydefault) {
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
