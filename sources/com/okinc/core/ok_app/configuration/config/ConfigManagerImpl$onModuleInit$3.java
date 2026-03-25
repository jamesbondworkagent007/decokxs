package com.okinc.core.ok_app.configuration.config;

import com.okinc.core.ok_app.api.configuration.Scenario;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionDiffSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33285mta;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class ConfigManagerImpl$onModuleInit$3 extends SuspendLambda implements Function2<FeatureRestrictionDiffSet, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C33285mta this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigManagerImpl$onModuleInit$3(C33285mta c33285mta, Continuation<? super ConfigManagerImpl$onModuleInit$3> continuation) {
        super(2, continuation);
        this.this$0 = c33285mta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConfigManagerImpl$onModuleInit$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FeatureRestrictionDiffSet featureRestrictionDiffSet, Continuation<? super Unit> continuation) {
        return ((ConfigManagerImpl$onModuleInit$3) create(featureRestrictionDiffSet, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl(Scenario.FeatureRestrictionUpdated.EZpvd);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
