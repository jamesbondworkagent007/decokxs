package com.okinc.im.imui.trending;

import android.content.Context;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.imui.trending.TrendingGroupsHorizontalFragment$setupRecyclerView$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32866mlf;
import o.C33129mqd;
import o.C34168nTy;
import o.C56391yDq;
import o.C56442yFn;
import o.nGS;

/* JADX INFO: loaded from: classes16.dex */
public final class TrendingGroupsHorizontalFragment$setupRecyclerView$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ nGS $group;
    final /* synthetic */ int $position;
    int label;
    final /* synthetic */ TrendingGroupsHorizontalFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrendingGroupsHorizontalFragment$setupRecyclerView$1$1(TrendingGroupsHorizontalFragment trendingGroupsHorizontalFragment, nGS ngs, int i, Continuation<? super TrendingGroupsHorizontalFragment$setupRecyclerView$1$1> continuation) {
        super(2, continuation);
        this.this$0 = trendingGroupsHorizontalFragment;
        this.$group = ngs;
        this.$position = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrendingGroupsHorizontalFragment$setupRecyclerView$1$1(this.this$0, this.$group, this.$position, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrendingGroupsHorizontalFragment$setupRecyclerView$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final nGS ngs = this.$group;
            final int i2 = this.$position;
            C32866mlf.onEvent$default("Orbit_Page_Groupcard_Click", (TrackChannel[]) null, new Function1() { // from class: o.oyD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return TrendingGroupsHorizontalFragment$setupRecyclerView$1$1.invokeSuspend$lambda$0(ngs, i2, (EventParamsList) obj2);
                }
            }, 1, (Object) null);
            C34168nTy c34168nTyGEmmrt = this.this$0.gEmmrt();
            Context context = this.this$0.AhwBna().getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            long jCopydefault = this.$group.copydefault();
            String strKWHzl = this.$group.KWHzl();
            this.label = 1;
            if (C34168nTy.check$default(c34168nTyGEmmrt, context, String.valueOf(jCopydefault), strKWHzl, false, null, this, 24, null) == objCopydefault) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(nGS ngs, int i, EventParamsList eventParamsList) {
        eventParamsList.put("group", ngs.gEmmrt(), true);
        EventParamsList.put$default(eventParamsList, "channel_id", C33129mqd.gEmmrt(Long.valueOf(ngs.copydefault())), false, 4, null);
        EventParamsList.put$default(eventParamsList, "position", C33129mqd.gEmmrt(Integer.valueOf(i)), false, 4, null);
        return Unit.INSTANCE;
    }
}
