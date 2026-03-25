package com.okinc.tradingbot.impl.aiBot.ui.preview;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes19.dex */
public final class PreviewAiStrategyResultComposableKt$PreviewAiStrategyResultComposable$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Boolean> $isAtBottom$delegate;
    final /* synthetic */ Function1<Boolean, Unit> $onScrolledToBottom;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreviewAiStrategyResultComposableKt$PreviewAiStrategyResultComposable$1$1(State<Boolean> state, Function1<? super Boolean, Unit> function1, Continuation<? super PreviewAiStrategyResultComposableKt$PreviewAiStrategyResultComposable$1$1> continuation) {
        super(2, continuation);
        this.$isAtBottom$delegate = state;
        this.$onScrolledToBottom = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PreviewAiStrategyResultComposableKt$PreviewAiStrategyResultComposable$1$1(this.$isAtBottom$delegate, this.$onScrolledToBottom, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PreviewAiStrategyResultComposableKt$PreviewAiStrategyResultComposable$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final State<Boolean> state = this.$isAtBottom$delegate;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: o.uGm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(uFZ.OLrzqt(state));
                }
            });
            final Function1<Boolean, Unit> function1 = this.$onScrolledToBottom;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.aiBot.ui.preview.PreviewAiStrategyResultComposableKt$PreviewAiStrategyResultComposable$1$1.4
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return AEQbTJ(((Boolean) obj2).booleanValue(), continuation);
                }

                public final Object AEQbTJ(boolean z, Continuation<? super Unit> continuation) {
                    function1.invoke(C56443yFo.KWHzl(z));
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowSnapshotFlow.collect(flowCollector, this) == objCopydefault) {
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
