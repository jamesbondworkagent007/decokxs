package com.okinc.business.market.features.analysis.spot.root.ui;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC42839rdw;
import o.C25939jLz;
import o.C33546myW;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisFragment$viewModelCollect$4 extends SuspendLambda implements Function2<HashMap<Integer, InterfaceC49371unL<? extends Unit>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C25939jLz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisFragment$viewModelCollect$4(C25939jLz c25939jLz, Continuation<? super SpotAnalysisFragment$viewModelCollect$4> continuation) {
        super(2, continuation);
        this.this$0 = c25939jLz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotAnalysisFragment$viewModelCollect$4 spotAnalysisFragment$viewModelCollect$4 = new SpotAnalysisFragment$viewModelCollect$4(this.this$0, continuation);
        spotAnalysisFragment$viewModelCollect$4.L$0 = obj;
        return spotAnalysisFragment$viewModelCollect$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(HashMap<Integer, InterfaceC49371unL<? extends Unit>> map, Continuation<? super Unit> continuation) {
        return invoke2((HashMap<Integer, InterfaceC49371unL<Unit>>) map, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HashMap<Integer, InterfaceC49371unL<Unit>> map, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisFragment$viewModelCollect$4) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC42839rdw abstractC42839rdw;
        C33546myW c33546myW;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            HashMap map = (HashMap) this.L$0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() instanceof InterfaceC49371unL.ActionBar) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.isEmpty() && (abstractC42839rdw = this.this$0.gEmmrt) != null && (c33546myW = abstractC42839rdw.AhwBna) != null) {
                c33546myW.AEQbTJ();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
