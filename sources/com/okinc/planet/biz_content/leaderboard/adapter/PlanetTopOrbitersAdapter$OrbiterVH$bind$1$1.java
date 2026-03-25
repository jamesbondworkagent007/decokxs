package com.okinc.planet.biz_content.leaderboard.adapter;

import android.content.Context;
import com.okinc.planet.biz_content.leaderboard.bean.TopOrbiter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C43251rlk;
import o.C47651tuD;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44531sTi;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetTopOrbitersAdapter$OrbiterVH$bind$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TopOrbiter $item;
    int label;
    final /* synthetic */ C47651tuD.StateListAnimator this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetTopOrbitersAdapter$OrbiterVH$bind$1$1(C47651tuD.StateListAnimator stateListAnimator, TopOrbiter topOrbiter, Continuation<? super PlanetTopOrbitersAdapter$OrbiterVH$bind$1$1> continuation) {
        super(2, continuation);
        this.this$0 = stateListAnimator;
        this.$item = topOrbiter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetTopOrbitersAdapter$OrbiterVH$bind$1$1(this.this$0, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetTopOrbitersAdapter$OrbiterVH$bind$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44531sTi interfaceC44531sTi = (InterfaceC44531sTi) C43251rlk.OLrzqt(InterfaceC44531sTi.class);
            if (interfaceC44531sTi != null) {
                Context context = this.this$0.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                String strGEmmrt = C33129mqd.gEmmrt(this.$item.getShareCode());
                this.label = 1;
                if (InterfaceC44531sTi.Application.navigateToLiveStreamPage$default(interfaceC44531sTi, context, strGEmmrt, null, "orbit_leaderboard_top_orbiters", null, null, this, 52, null) == objCopydefault) {
                    return objCopydefault;
                }
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
