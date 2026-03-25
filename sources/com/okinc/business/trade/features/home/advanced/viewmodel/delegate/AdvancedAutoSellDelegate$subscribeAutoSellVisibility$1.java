package com.okinc.business.trade.features.home.advanced.viewmodel.delegate;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC30503lcQ;
import o.C28227kTp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedAutoSellDelegate$subscribeAutoSellVisibility$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StateFlow<Boolean> $isAutoSellVisible;
    final /* synthetic */ Function2<AbstractC30503lcQ, Boolean, Unit> $onAutoSellChanged;
    int label;
    final /* synthetic */ C28227kTp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super o.lcQ, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdvancedAutoSellDelegate$subscribeAutoSellVisibility$1(StateFlow<Boolean> stateFlow, C28227kTp c28227kTp, Function2<? super AbstractC30503lcQ, ? super Boolean, Unit> function2, Continuation<? super AdvancedAutoSellDelegate$subscribeAutoSellVisibility$1> continuation) {
        super(2, continuation);
        this.$isAutoSellVisible = stateFlow;
        this.this$0 = c28227kTp;
        this.$onAutoSellChanged = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedAutoSellDelegate$subscribeAutoSellVisibility$1(this.$isAutoSellVisible, this.this$0, this.$onAutoSellChanged, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedAutoSellDelegate$subscribeAutoSellVisibility$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Boolean> stateFlow = this.$isAutoSellVisible;
            final C28227kTp c28227kTp = this.this$0;
            final Function2<AbstractC30503lcQ, Boolean, Unit> function2 = this.$onAutoSellChanged;
            FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedAutoSellDelegate$subscribeAutoSellVisibility$1.4
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return OLrzqt(((Boolean) obj2).booleanValue(), continuation);
                }

                public final Object OLrzqt(boolean z, Continuation<? super Unit> continuation) {
                    if (!z && !(c28227kTp.copydefault.getValue() instanceof AbstractC30503lcQ.Activity)) {
                        pUU.KWHzl("AutoSellDelegate", "Auto-sell visibility changed to false, disabling auto-sell state");
                        function2.invoke(AbstractC30503lcQ.Activity.AEQbTJ, C56443yFo.KWHzl(false));
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlow.collect(flowCollector, this) == objCopydefault) {
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
