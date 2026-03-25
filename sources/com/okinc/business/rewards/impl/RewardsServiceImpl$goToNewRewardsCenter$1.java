package com.okinc.business.rewards.impl;

import android.content.Context;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C43176rkO;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class RewardsServiceImpl$goToNewRewardsCenter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Map<String, Object> $params;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsServiceImpl$goToNewRewardsCenter$1(Map<String, ? extends Object> map, Context context, Continuation<? super RewardsServiceImpl$goToNewRewardsCenter$1> continuation) {
        super(2, continuation);
        this.$params = map;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RewardsServiceImpl$goToNewRewardsCenter$1(this.$params, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RewardsServiceImpl$goToNewRewardsCenter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "0";
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = "0";
            Map<String, Object> map = this.$params;
            if (map != null) {
                if (map.containsKey("tab")) {
                    objectRef.element = C33129mqd.gEmmrt(map.get("tab"));
                }
                if (map.containsKey("secondTab")) {
                    objectRef2.element = C33129mqd.gEmmrt(map.get("secondTab"));
                }
            }
            C43176rkO.AEQbTJ.OLrzqt(this.$context, "/growth/route", C56424yEw.gEmmrt(C56390yDp.OLrzqt("to", "RewardsCenterMainVC"), C56390yDp.OLrzqt("pageanim", "push"), C56390yDp.OLrzqt("tab", objectRef.element), C56390yDp.OLrzqt("secondTab", objectRef2.element)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
