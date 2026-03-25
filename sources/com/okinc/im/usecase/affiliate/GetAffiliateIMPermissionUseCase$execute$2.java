package com.okinc.im.usecase.affiliate;

import com.okinc.affiliate.bean.AffiliateIMPermission;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32962mnV;
import o.C35744oCb;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class GetAffiliateIMPermissionUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AffiliateIMPermission>, Object> {
    int label;
    final /* synthetic */ C35744oCb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAffiliateIMPermissionUseCase$execute$2(C35744oCb c35744oCb, Continuation<? super GetAffiliateIMPermissionUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = c35744oCb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetAffiliateIMPermissionUseCase$execute$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AffiliateIMPermission> continuation) {
        return ((GetAffiliateIMPermissionUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.KWHzl != null) {
                return (AffiliateIMPermission) C32962mnV.AEQbTJ(this.this$0.KWHzl.EZpvd());
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
