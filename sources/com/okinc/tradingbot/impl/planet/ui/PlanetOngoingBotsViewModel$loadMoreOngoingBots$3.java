package com.okinc.tradingbot.impl.planet.ui;

import com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsViewModel;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C53664wpk;
import o.C56391yDq;
import o.C56442yFn;
import o.uLU;

/* JADX INFO: loaded from: classes11.dex */
public final class PlanetOngoingBotsViewModel$loadMoreOngoingBots$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PlanetOngoingBotsViewModel.StateListAnimator $currentData;
    int label;
    final /* synthetic */ PlanetOngoingBotsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetOngoingBotsViewModel$loadMoreOngoingBots$3(PlanetOngoingBotsViewModel planetOngoingBotsViewModel, PlanetOngoingBotsViewModel.StateListAnimator stateListAnimator, Continuation<? super PlanetOngoingBotsViewModel$loadMoreOngoingBots$3> continuation) {
        super(2, continuation);
        this.this$0 = planetOngoingBotsViewModel;
        this.$currentData = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetOngoingBotsViewModel$loadMoreOngoingBots$3(this.this$0, this.$currentData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetOngoingBotsViewModel$loadMoreOngoingBots$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C53664wpk c53664wpk = this.this$0.KWHzl;
            C53664wpk.TaskDescription taskDescription = new C53664wpk.TaskDescription(this.$currentData.AEQbTJ());
            this.label = 1;
            obj = c53664wpk.KWHzl(taskDescription, this);
            if (obj == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C53664wpk.ActionBar actionBar = (C53664wpk.ActionBar) obj;
        MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
        do {
            value = mutableStateFlow.getValue();
            objCopydefault = (uLU) value;
            if (objCopydefault instanceof uLU.ActionBar) {
                uLU.ActionBar actionBar2 = (uLU.ActionBar) objCopydefault;
                objCopydefault = actionBar2.copydefault(((PlanetOngoingBotsViewModel.StateListAnimator) actionBar2.KWHzl()).EZpvd(CollectionsKt___CollectionsKt.djBIcL((Collection) ((PlanetOngoingBotsViewModel.StateListAnimator) actionBar2.KWHzl()).copydefault(), (Iterable) actionBar.copydefault()), actionBar.AEQbTJ(), actionBar.KWHzl(), false));
            }
        } while (!mutableStateFlow.compareAndSet(value, objCopydefault));
        return Unit.INSTANCE;
    }
}
