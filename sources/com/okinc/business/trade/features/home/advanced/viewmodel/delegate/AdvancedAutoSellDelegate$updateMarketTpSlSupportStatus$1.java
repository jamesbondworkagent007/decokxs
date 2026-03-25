package com.okinc.business.trade.features.home.advanced.viewmodel.delegate;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C28227kTp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC30595leC;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedAutoSellDelegate$updateMarketTpSlSupportStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<InterfaceC30595leC, Unit> $onOrderError;
    final /* synthetic */ boolean $supported;
    Object L$0;
    int label;
    final /* synthetic */ C28227kTp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.leC, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdvancedAutoSellDelegate$updateMarketTpSlSupportStatus$1(C28227kTp c28227kTp, Function1<? super InterfaceC30595leC, Unit> function1, boolean z, Continuation<? super AdvancedAutoSellDelegate$updateMarketTpSlSupportStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = c28227kTp;
        this.$onOrderError = function1;
        this.$supported = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedAutoSellDelegate$updateMarketTpSlSupportStatus$1(this.this$0, this.$onOrderError, this.$supported, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedAutoSellDelegate$updateMarketTpSlSupportStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Function1<InterfaceC30595leC, Unit> function1;
        InterfaceC30595leC interfaceC30595leC;
        Function1<InterfaceC30595leC, Unit> function12;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
            boolean z = this.$supported;
            do {
                value = mutableStateFlow.getValue();
                ((Boolean) value).booleanValue();
            } while (!mutableStateFlow.compareAndSet(value, C56443yFo.KWHzl(z)));
            function1 = this.$onOrderError;
            Function2<Boolean, Continuation<? super InterfaceC30595leC>, Object> function2KWHzl = this.this$0.KWHzl();
            if (function2KWHzl == null) {
                interfaceC30595leC = null;
                function1.invoke(interfaceC30595leC);
                return Unit.INSTANCE;
            }
            Boolean boolKWHzl = C56443yFo.KWHzl(this.$supported);
            this.L$0 = function1;
            this.label = 1;
            Object objInvoke = function2KWHzl.invoke(boolKWHzl, this);
            if (objInvoke == objCopydefault) {
                return objCopydefault;
            }
            function12 = function1;
            obj = objInvoke;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function12 = (Function1) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Function1<InterfaceC30595leC, Unit> function13 = function12;
        interfaceC30595leC = (InterfaceC30595leC) obj;
        function1 = function13;
        function1.invoke(interfaceC30595leC);
        return Unit.INSTANCE;
    }
}
