package com.okinc.find_ui.ranking.percentchange.sub;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC32996moC;
import o.C35025nnY;
import o.C35094noo;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeUpRankingSpotFragment$setListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C35094noo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeUpRankingSpotFragment$setListener$1$1(C35094noo c35094noo, Continuation<? super MarketHomeUpRankingSpotFragment$setListener$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c35094noo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeUpRankingSpotFragment$setListener$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeUpRankingSpotFragment$setListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35094noo c35094noo = this.this$0;
            this.label = 1;
            if (c35094noo.OLrzqt((Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.zLjUOn().setItems(this.this$0.sSMYrx().djBIcL());
        this.this$0.zLjUOn().notifyDataSetChanged();
        this.this$0.EZpvd(false);
        AbstractC32996moC abstractC32996moC = this.this$0;
        if (!(abstractC32996moC instanceof C35025nnY)) {
            Fragment parentFragment = abstractC32996moC.getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof C35025nnY)) {
                parentFragment = parentFragment.getParentFragment();
            }
            if (!(parentFragment instanceof C35025nnY)) {
                parentFragment = null;
            }
            abstractC32996moC = (C35025nnY) parentFragment;
        }
        C35025nnY c35025nnY = (C35025nnY) abstractC32996moC;
        if (c35025nnY != null) {
            c35025nnY.values();
        }
        return Unit.INSTANCE;
    }
}
