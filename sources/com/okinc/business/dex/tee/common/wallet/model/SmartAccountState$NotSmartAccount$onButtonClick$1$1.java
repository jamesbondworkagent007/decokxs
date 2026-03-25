package com.okinc.business.dex.tee.common.wallet.model;

import android.content.Context;
import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.dTQ;
import o.gLQ;

/* JADX INFO: loaded from: classes5.dex */
public final class SmartAccountState$NotSmartAccount$onButtonClick$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ gLQ.ActionBar this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartAccountState$NotSmartAccount$onButtonClick$1$1(Context context, gLQ.ActionBar actionBar, Continuation<? super SmartAccountState$NotSmartAccount$onButtonClick$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.this$0 = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartAccountState$NotSmartAccount$onButtonClick$1$1(this.$context, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmartAccountState$NotSmartAccount$onButtonClick$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            dTQ dtq = (dTQ) C43251rlk.copydefault(dTQ.class);
            Context context = this.$context;
            ActivateTeeGuideModel activateTeeGuideModel = new ActivateTeeGuideModel(this.this$0.EZpvd, true, false, (String) null, 0, 0, 0, "sa_dex_copytrade_tradebtn", 124, (DefaultConstructorMarker) null);
            this.label = 1;
            if (dtq.KWHzl(context, activateTeeGuideModel, this) == objCopydefault) {
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
