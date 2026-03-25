package com.okinc.ok_kyc_core_okx_impl.foebidden.service;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.rUS;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class FeatureRestrictionLegacyRepository$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ rUS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureRestrictionLegacyRepository$1(rUS rus, Continuation<? super FeatureRestrictionLegacyRepository$1> continuation) {
        super(2, continuation);
        this.this$0 = rus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeatureRestrictionLegacyRepository$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeatureRestrictionLegacyRepository$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        rUS rus;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            rUS rus2 = this.this$0;
            this.L$0 = rus2;
            this.label = 1;
            Object objKWHzl = rus2.KWHzl((Continuation<? super JSONObject>) this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            rus = rus2;
            obj = objKWHzl;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rus = (rUS) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        rus.AEQbTJ((JSONObject) obj);
        return Unit.INSTANCE;
    }
}
