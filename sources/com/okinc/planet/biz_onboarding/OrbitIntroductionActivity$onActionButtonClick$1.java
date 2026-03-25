package com.okinc.planet.biz_onboarding;

import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC45902tAm;
import o.C46234tMu;
import o.C46388tSm;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.wYF;

/* JADX INFO: loaded from: classes10.dex */
public final class OrbitIntroductionActivity$onActionButtonClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC45902tAm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrbitIntroductionActivity$onActionButtonClick$1(ActivityC45902tAm activityC45902tAm, Continuation<? super OrbitIntroductionActivity$onActionButtonClick$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC45902tAm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OrbitIntroductionActivity$onActionButtonClick$1 orbitIntroductionActivity$onActionButtonClick$1 = new OrbitIntroductionActivity$onActionButtonClick$1(this.this$0, continuation);
        orbitIntroductionActivity$onActionButtonClick$1.L$0 = obj;
        return orbitIntroductionActivity$onActionButtonClick$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrbitIntroductionActivity$onActionButtonClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        wYF wyf;
        C52794wYp c52794wYpCopydefault;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C46388tSm c46388tSmKWHzl = C46388tSm.Companion.KWHzl();
                this.label = 1;
                obj = c46388tSmKWHzl.EZpvd(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((OrbitBeanResp) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        OrbitBeanResp orbitBeanResp = (OrbitBeanResp) objM7377constructorimpl;
        C46234tMu c46234tMuOLrzqt = this.this$0.OLrzqt();
        if (c46234tMuOLrzqt != null && (wyf = c46234tMuOLrzqt.copydefault) != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
            c52794wYpCopydefault.fIwbmz();
        }
        this.this$0.KWHzl(orbitBeanResp);
        return Unit.INSTANCE;
    }
}
