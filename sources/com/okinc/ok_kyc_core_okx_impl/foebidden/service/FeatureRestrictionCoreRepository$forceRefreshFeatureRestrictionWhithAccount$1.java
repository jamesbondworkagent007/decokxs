package com.okinc.ok_kyc_core_okx_impl.foebidden.service;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class FeatureRestrictionCoreRepository$forceRefreshFeatureRestrictionWhithAccount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    int label;
    final /* synthetic */ FeatureRestrictionCoreRepository this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeatureRestrictionCoreRepository$forceRefreshFeatureRestrictionWhithAccount$1(FeatureRestrictionCoreRepository featureRestrictionCoreRepository, Function1<? super Boolean, Unit> function1, Continuation<? super FeatureRestrictionCoreRepository$forceRefreshFeatureRestrictionWhithAccount$1> continuation) {
        super(2, continuation);
        this.this$0 = featureRestrictionCoreRepository;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeatureRestrictionCoreRepository$forceRefreshFeatureRestrictionWhithAccount$1(this.this$0, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeatureRestrictionCoreRepository$forceRefreshFeatureRestrictionWhithAccount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                FeatureRestrictionCoreRepository featureRestrictionCoreRepository = this.this$0;
                this.label = 1;
                if (featureRestrictionCoreRepository.copydefault(this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Function1<Boolean, Unit> function1 = this.$callback;
            if (function1 != null) {
                function1.invoke(C56443yFo.KWHzl(true));
            }
        } catch (Exception e) {
            pUU.AEQbTJ(e);
            Function1<Boolean, Unit> function12 = this.$callback;
            if (function12 != null) {
                function12.invoke(C56443yFo.KWHzl(false));
            }
        }
        return Unit.INSTANCE;
    }
}
