package com.okinc.business.dex.trade.core.domain.usecase;

import com.okinc.business.dex.trade.core.domain.model.limit.PairRateParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.gYO;
import o.gYP;
import o.gYR;
import o.gYS;

/* JADX INFO: loaded from: classes5.dex */
public final class LimitV2FirstHandler$poll$1 extends SuspendLambda implements Function1<Continuation<? super gYP.TaskDescription>, Object> {
    final /* synthetic */ gYS $params;
    int label;
    final /* synthetic */ gYR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitV2FirstHandler$poll$1(gYR gyr, gYS gys, Continuation<? super LimitV2FirstHandler$poll$1> continuation) {
        super(1, continuation);
        this.this$0 = gyr;
        this.$params = gys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new LimitV2FirstHandler$poll$1(this.this$0, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super gYP.TaskDescription> continuation) {
        return ((LimitV2FirstHandler$poll$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            gYO gyo = this.this$0.EZpvd;
            PairRateParams pairRateParamsEZpvd = ((gYS.ActionBar) this.$params).EZpvd();
            this.label = 1;
            obj = gyo.copydefault(pairRateParamsEZpvd, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return new gYP.TaskDescription((AbstractC43419rot) obj);
    }
}
