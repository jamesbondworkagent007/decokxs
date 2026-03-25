package com.okinc.planet.biz_performance;

import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.tAN;

/* JADX INFO: loaded from: classes16.dex */
public final class ProfileOverviewFragment$observeUserDataChanges$1 extends SuspendLambda implements Function2<PlanetBasicUserInfoResp, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tAN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileOverviewFragment$observeUserDataChanges$1(tAN tan, Continuation<? super ProfileOverviewFragment$observeUserDataChanges$1> continuation) {
        super(2, continuation);
        this.this$0 = tan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfileOverviewFragment$observeUserDataChanges$1 profileOverviewFragment$observeUserDataChanges$1 = new ProfileOverviewFragment$observeUserDataChanges$1(this.this$0, continuation);
        profileOverviewFragment$observeUserDataChanges$1.L$0 = obj;
        return profileOverviewFragment$observeUserDataChanges$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PlanetBasicUserInfoResp planetBasicUserInfoResp, Continuation<? super Unit> continuation) {
        return ((ProfileOverviewFragment$observeUserDataChanges$1) create(planetBasicUserInfoResp, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl((PlanetBasicUserInfoResp) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
