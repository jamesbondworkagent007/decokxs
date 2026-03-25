package com.okinc.core.ok_app.modeswitch.view;

import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC33244msm;
import o.C33123mqX;
import o.C33302mtr;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ModeSwitchBottomSheet$onCreateContent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Pair<AbstractC33244msm, C33302mtr>> $modeCardList;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends kotlin.Pair<? extends o.msm, o.mtr>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModeSwitchBottomSheet$onCreateContent$2(List<? extends Pair<? extends AbstractC33244msm, C33302mtr>> list, Continuation<? super ModeSwitchBottomSheet$onCreateContent$2> continuation) {
        super(2, continuation);
        this.$modeCardList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModeSwitchBottomSheet$onCreateContent$2(this.$modeCardList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModeSwitchBottomSheet$onCreateContent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<AbstractC33244msm> stateFlowAYXKKw = C33123mqX.Companion.KWHzl().AYXKKw();
            final List<Pair<AbstractC33244msm, C33302mtr>> list = this.$modeCardList;
            FlowCollector<? super AbstractC33244msm> flowCollector = new FlowCollector() { // from class: com.okinc.core.ok_app.modeswitch.view.ModeSwitchBottomSheet$onCreateContent$2.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(AbstractC33244msm abstractC33244msm, Continuation<? super Unit> continuation) {
                    pUU.KWHzl("ModeSwitch-BottomSheet", "current mode: " + abstractC33244msm);
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ((C33302mtr) pair.getSecond()).AEQbTJ.setSelected(Intrinsics.EZpvd(pair.getFirst(), abstractC33244msm));
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowAYXKKw.collect(flowCollector, this) == objCopydefault) {
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
