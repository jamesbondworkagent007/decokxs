package com.okinc.tradingbot.impl.botDetail.ui;

import com.okinc.unify_trade.biz.StgySourceInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C55804xqp;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes19.dex */
public final class DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$1 extends SuspendLambda implements yHO<C55804xqp<StrategyDetailsResponse>, List<? extends StgySourceInfo>, Continuation<? super Pair<? extends C55804xqp<StrategyDetailsResponse>, ? extends List<? extends StgySourceInfo>>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$1(Continuation<? super DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(C55804xqp<StrategyDetailsResponse> c55804xqp, List<? extends StgySourceInfo> list, Continuation<? super Pair<? extends C55804xqp<StrategyDetailsResponse>, ? extends List<? extends StgySourceInfo>>> continuation) {
        return invoke2(c55804xqp, (List<StgySourceInfo>) list, (Continuation<? super Pair<C55804xqp<StrategyDetailsResponse>, ? extends List<StgySourceInfo>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C55804xqp<StrategyDetailsResponse> c55804xqp, List<StgySourceInfo> list, Continuation<? super Pair<C55804xqp<StrategyDetailsResponse>, ? extends List<StgySourceInfo>>> continuation) {
        DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$1 detailParameterFragmentExtensionKt$handleUIUpdatesForDCA$1 = new DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$1(continuation);
        detailParameterFragmentExtensionKt$handleUIUpdatesForDCA$1.L$0 = c55804xqp;
        detailParameterFragmentExtensionKt$handleUIUpdatesForDCA$1.L$1 = list;
        return detailParameterFragmentExtensionKt$handleUIUpdatesForDCA$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return C56390yDp.OLrzqt((C55804xqp) this.L$0, (List) this.L$1);
    }
}
