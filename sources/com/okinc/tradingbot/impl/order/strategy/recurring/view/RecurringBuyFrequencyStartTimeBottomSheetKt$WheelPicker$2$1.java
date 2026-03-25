package com.okinc.tradingbot.impl.order.strategy.recurring.view;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.List;
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
import o.C56548yJl;

/* JADX INFO: loaded from: classes11.dex */
public final class RecurringBuyFrequencyStartTimeBottomSheetKt$WheelPicker$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Integer> $centerIndex$delegate;
    final /* synthetic */ List<String> $items;
    final /* synthetic */ Function1<Integer, Unit> $onSelectedIndexChanged;
    final /* synthetic */ int $selectedIndex;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecurringBuyFrequencyStartTimeBottomSheetKt$WheelPicker$2$1(State<Integer> state, List<String> list, int i, Function1<? super Integer, Unit> function1, Continuation<? super RecurringBuyFrequencyStartTimeBottomSheetKt$WheelPicker$2$1> continuation) {
        super(2, continuation);
        this.$centerIndex$delegate = state;
        this.$items = list;
        this.$selectedIndex = i;
        this.$onSelectedIndexChanged = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringBuyFrequencyStartTimeBottomSheetKt$WheelPicker$2$1(this.$centerIndex$delegate, this.$items, this.$selectedIndex, this.$onSelectedIndexChanged, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringBuyFrequencyStartTimeBottomSheetKt$WheelPicker$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final State<Integer> state = this.$centerIndex$delegate;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: o.vVG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Integer.valueOf(C50637vVu.EZpvd(state));
                }
            });
            final List<String> list = this.$items;
            final int i2 = this.$selectedIndex;
            final Function1<Integer, Unit> function1 = this.$onSelectedIndexChanged;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.order.strategy.recurring.view.RecurringBuyFrequencyStartTimeBottomSheetKt$WheelPicker$2$1.4
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return EZpvd(((Number) obj2).intValue(), continuation);
                }

                public final Object EZpvd(int i3, Continuation<? super Unit> continuation) {
                    int iEZpvd = C56548yJl.EZpvd(i3, 0, C56548yJl.copydefault(list.size() - 1, 0));
                    if (iEZpvd != i2) {
                        function1.invoke(C56443yFo.AEQbTJ(iEZpvd));
                    }
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
