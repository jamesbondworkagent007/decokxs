package com.okinc.business.trade.features.home.ui.cefi.placeorder.strategy;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C21668hHx;
import o.C30798lhu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC30595leC;
import o.InterfaceC30792lho;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedStrategyManager$handleInputFields$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC30595leC $error;
    int label;
    final /* synthetic */ C30798lhu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedStrategyManager$handleInputFields$1(C30798lhu c30798lhu, InterfaceC30595leC interfaceC30595leC, Continuation<? super AdvancedStrategyManager$handleInputFields$1> continuation) {
        super(2, continuation);
        this.this$0 = c30798lhu;
        this.$error = interfaceC30595leC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedStrategyManager$handleInputFields$1(this.this$0, this.$error, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedStrategyManager$handleInputFields$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC30792lho interfaceC30792lho = (InterfaceC30792lho) this.this$0.EZpvd.getValue();
            C21668hHx c21668hHx = this.this$0.copydefault;
            Intrinsics.copydefault(c21668hHx);
            InterfaceC30595leC interfaceC30595leC = this.$error;
            this.label = 1;
            obj = interfaceC30792lho.KWHzl(c21668hHx, interfaceC30595leC, this);
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
        if (((Boolean) obj).booleanValue()) {
            MutableSharedFlow mutableSharedFlow = this.this$0.KWHzl;
            Unit unit = Unit.INSTANCE;
            this.label = 2;
            if (mutableSharedFlow.emit(unit, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
