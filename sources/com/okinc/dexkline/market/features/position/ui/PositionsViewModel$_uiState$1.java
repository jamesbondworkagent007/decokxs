package com.okinc.dexkline.market.features.position.ui;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C34446ncI;
import o.C34455ncR;
import o.C34457ncT;
import o.C34479ncp;
import o.C56391yDq;
import o.C56442yFn;
import o.xHC;
import o.yHT;

/* JADX INFO: loaded from: classes8.dex */
public final class PositionsViewModel$_uiState$1 extends SuspendLambda implements yHT<C34457ncT, Pair<? extends C34479ncp, ? extends xHC.ActionBar>, C34455ncR, Continuation<? super C34446ncI>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ PositionsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsViewModel$_uiState$1(PositionsViewModel positionsViewModel, Continuation<? super PositionsViewModel$_uiState$1> continuation) {
        super(4, continuation);
        this.this$0 = positionsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* bridge */ /* synthetic */ Object invoke(C34457ncT c34457ncT, Pair<? extends C34479ncp, ? extends xHC.ActionBar> pair, C34455ncR c34455ncR, Continuation<? super C34446ncI> continuation) {
        return invoke2(c34457ncT, (Pair<C34479ncp, xHC.ActionBar>) pair, c34455ncR, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C34457ncT c34457ncT, Pair<C34479ncp, xHC.ActionBar> pair, C34455ncR c34455ncR, Continuation<? super C34446ncI> continuation) {
        PositionsViewModel$_uiState$1 positionsViewModel$_uiState$1 = new PositionsViewModel$_uiState$1(this.this$0, continuation);
        positionsViewModel$_uiState$1.L$0 = c34457ncT;
        positionsViewModel$_uiState$1.L$1 = pair;
        positionsViewModel$_uiState$1.L$2 = c34455ncR;
        return positionsViewModel$_uiState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C34457ncT c34457ncT = (C34457ncT) this.L$0;
            Pair pair = (Pair) this.L$1;
            return this.this$0.copydefault(c34457ncT, (C34479ncp) pair.getFirst(), (C34455ncR) this.L$2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
