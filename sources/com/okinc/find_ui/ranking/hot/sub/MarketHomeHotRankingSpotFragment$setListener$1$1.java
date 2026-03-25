package com.okinc.find_ui.ranking.hot.sub;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC32996moC;
import o.C34972nmY;
import o.C35041nno;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeHotRankingSpotFragment$setListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C35041nno this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeHotRankingSpotFragment$setListener$1$1(C35041nno c35041nno, Continuation<? super MarketHomeHotRankingSpotFragment$setListener$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c35041nno;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeHotRankingSpotFragment$setListener$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeHotRankingSpotFragment$setListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35041nno c35041nno = this.this$0;
            this.label = 1;
            if (c35041nno.OLrzqt((Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.zsXlph().setItems(this.this$0.gHZMYf().OLrzqt());
        this.this$0.zsXlph().notifyDataSetChanged();
        this.this$0.EZpvd(false);
        AbstractC32996moC abstractC32996moC = this.this$0;
        if (!(abstractC32996moC instanceof C34972nmY)) {
            Fragment parentFragment = abstractC32996moC.getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof C34972nmY)) {
                parentFragment = parentFragment.getParentFragment();
            }
            if (!(parentFragment instanceof C34972nmY)) {
                parentFragment = null;
            }
            abstractC32996moC = (C34972nmY) parentFragment;
        }
        C34972nmY c34972nmY = (C34972nmY) abstractC32996moC;
        if (c34972nmY != null) {
            c34972nmY.AkhnZx();
        }
        return Unit.INSTANCE;
    }
}
