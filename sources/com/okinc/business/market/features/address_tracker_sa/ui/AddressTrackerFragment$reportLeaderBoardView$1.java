package com.okinc.business.market.features.address_tracker_sa.ui;

import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25677jCg;
import o.C56391yDq;
import o.C56442yFn;
import o.jBN;

/* JADX INFO: loaded from: classes6.dex */
public final class AddressTrackerFragment$reportLeaderBoardView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C25677jCg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressTrackerFragment$reportLeaderBoardView$1(C25677jCg c25677jCg, Continuation<? super AddressTrackerFragment$reportLeaderBoardView$1> continuation) {
        super(2, continuation);
        this.this$0 = c25677jCg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressTrackerFragment$reportLeaderBoardView$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressTrackerFragment$reportLeaderBoardView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String string = SPUtils.getString("SP_KEY_LEADERBOARD_SORT_SELECTION_RANKING_LABEL", "");
            String string2 = SPUtils.getString("SP_KEY_LEADERBOARD_SORT_SELECTION_DURATION_LABEL", "");
            boolean z = SPUtils.getBoolean("SP_KEY_LEADERBOARD_DISPLAY_TOKEN", true);
            jBN jbn = jBN.copydefault;
            Intrinsics.copydefault((Object) string);
            Intrinsics.copydefault((Object) string2);
            jbn.OLrzqt(string, string2, z, this.this$0.isConnected());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
