package com.okinc.tradingbot.impl.planet.ui;

import com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C53657wpd;
import o.C53664wpk;
import o.C56391yDq;
import o.C56442yFn;
import o.uLU;

/* JADX INFO: loaded from: classes11.dex */
public final class PlanetOngoingBotsViewModel$loadOngoingBots$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PlanetOngoingBotsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetOngoingBotsViewModel$loadOngoingBots$2(PlanetOngoingBotsViewModel planetOngoingBotsViewModel, Continuation<? super PlanetOngoingBotsViewModel$loadOngoingBots$2> continuation) {
        super(2, continuation);
        this.this$0 = planetOngoingBotsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetOngoingBotsViewModel$loadOngoingBots$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetOngoingBotsViewModel$loadOngoingBots$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C53664wpk c53664wpk = this.this$0.KWHzl;
            C53664wpk.TaskDescription taskDescription = new C53664wpk.TaskDescription(null);
            this.label = 1;
            obj = c53664wpk.KWHzl(taskDescription, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C53664wpk.ActionBar actionBar = (C53664wpk.ActionBar) obj;
        C53657wpd.copydefault.KWHzl(actionBar.copydefault().isEmpty());
        this.this$0.OLrzqt.setValue(uLU.Companion.AEQbTJ(new PlanetOngoingBotsViewModel.StateListAnimator(actionBar.copydefault(), actionBar.AEQbTJ(), actionBar.KWHzl(), false)));
        return Unit.INSTANCE;
    }
}
