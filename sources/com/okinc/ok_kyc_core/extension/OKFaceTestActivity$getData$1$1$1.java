package com.okinc.ok_kyc_core.extension;

import com.okinc.kyc.api.biz.bean.FacialExtParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC41985rCb;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.rTU;

/* JADX INFO: loaded from: classes19.dex */
public final class OKFaceTestActivity$getData$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    int label;
    final /* synthetic */ ActivityC41985rCb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKFaceTestActivity$getData$1$1$1(ActivityC41985rCb activityC41985rCb, String str, Continuation<? super OKFaceTestActivity$getData$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC41985rCb;
        this.$sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKFaceTestActivity$getData$1$1$1(this.this$0, this.$sessionId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKFaceTestActivity$getData$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Map mapCopydefault = this.this$0.copydefault();
            rTU rtu = (rTU) C43251rlk.OLrzqt(rTU.class);
            if (rtu != null) {
                ActivityC41985rCb activityC41985rCb = this.this$0;
                rtu.AEQbTJ(activityC41985rCb, this.$sessionId, activityC41985rCb.gEmmrt, new FacialExtParams(mapCopydefault, "okface_test"));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
