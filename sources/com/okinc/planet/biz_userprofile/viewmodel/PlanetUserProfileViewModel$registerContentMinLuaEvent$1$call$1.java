package com.okinc.planet.biz_userprofile.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.tLX;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetUserProfileViewModel$registerContentMinLuaEvent$1$call$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $followStatusV2;
    final /* synthetic */ Boolean $isFollowing;
    int label;
    final /* synthetic */ tLX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetUserProfileViewModel$registerContentMinLuaEvent$1$call$1(tLX tlx, Boolean bool, String str, Continuation<? super PlanetUserProfileViewModel$registerContentMinLuaEvent$1$call$1> continuation) {
        super(2, continuation);
        this.this$0 = tlx;
        this.$isFollowing = bool;
        this.$followStatusV2 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetUserProfileViewModel$registerContentMinLuaEvent$1$call$1(this.this$0, this.$isFollowing, this.$followStatusV2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetUserProfileViewModel$registerContentMinLuaEvent$1$call$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            tLX tlx = this.this$0;
            boolean zBooleanValue = this.$isFollowing.booleanValue();
            String str = this.$followStatusV2;
            this.label = 1;
            if (tlx.copydefault(tlx, zBooleanValue, str, this) == objCopydefault) {
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
