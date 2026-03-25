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
import o.rUS;

/* JADX INFO: loaded from: classes10.dex */
public final class FeatureRestrictionLegacyRepository$fetchLatestFeatureRestrictionStatus$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    int label;
    final /* synthetic */ rUS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeatureRestrictionLegacyRepository$fetchLatestFeatureRestrictionStatus$2(rUS rus, Function1<? super Boolean, Unit> function1, Continuation<? super FeatureRestrictionLegacyRepository$fetchLatestFeatureRestrictionStatus$2> continuation) {
        super(2, continuation);
        this.this$0 = rus;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeatureRestrictionLegacyRepository$fetchLatestFeatureRestrictionStatus$2(this.this$0, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeatureRestrictionLegacyRepository$fetchLatestFeatureRestrictionStatus$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                rUS rus = this.this$0;
                this.label = 1;
                if (rus.AEQbTJ(this) == objCopydefault) {
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
            Function1<Boolean, Unit> function12 = this.$callback;
            if (function12 != null) {
                function12.invoke(C56443yFo.KWHzl(false));
            }
            pUU.KWHzl(this.this$0.valueOf(), String.valueOf(e.getMessage()));
        }
        return Unit.INSTANCE;
    }
}
