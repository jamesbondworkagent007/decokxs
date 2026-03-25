package com.okinc.im.imui.conversationlist;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C34168nTy;
import o.C56391yDq;
import o.C56442yFn;
import o.nGS;
import o.nIZ;

/* JADX INFO: loaded from: classes16.dex */
public final class TrendingGroupsListActivity$setupRecyclerView$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ nGS $group;
    int label;
    final /* synthetic */ TrendingGroupsListActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrendingGroupsListActivity$setupRecyclerView$1$1(TrendingGroupsListActivity trendingGroupsListActivity, nGS ngs, Continuation<? super TrendingGroupsListActivity$setupRecyclerView$1$1> continuation) {
        super(2, continuation);
        this.this$0 = trendingGroupsListActivity;
        this.$group = ngs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrendingGroupsListActivity$setupRecyclerView$1$1(this.this$0, this.$group, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrendingGroupsListActivity$setupRecyclerView$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C34168nTy c34168nTyDjBIcL = this.this$0.djBIcL();
            nIZ niz = this.this$0.djBIcL;
            if (niz == null) {
                Intrinsics.gEmmrt("");
                niz = null;
            }
            Context context = niz.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            long jCopydefault = this.$group.copydefault();
            String strKWHzl = this.$group.KWHzl();
            this.label = 1;
            if (C34168nTy.check$default(c34168nTyDjBIcL, context, String.valueOf(jCopydefault), strKWHzl, false, null, this, 24, null) == objCopydefault) {
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
