package com.okinc.liveness.eop.activity;

import com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC38205pQc;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes9.dex */
public final class EopLivenessActivity$efrLauncher$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $message;
    final /* synthetic */ String $status;
    int label;
    final /* synthetic */ ActivityC38205pQc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EopLivenessActivity$efrLauncher$1$2$1(String str, ActivityC38205pQc activityC38205pQc, String str2, Continuation<? super EopLivenessActivity$efrLauncher$1$2$1> continuation) {
        super(2, continuation);
        this.$status = str;
        this.this$0 = activityC38205pQc;
        this.$message = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EopLivenessActivity$efrLauncher$1$2$1(this.$status, this.this$0, this.$message, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EopLivenessActivity$efrLauncher$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        EopLivenessBasicViewModel eopLivenessBasicViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!Intrinsics.EZpvd((Object) this.$status, (Object) C33129mqd.gEmmrt(C56443yFo.AEQbTJ(-1))) && (eopLivenessBasicViewModel = this.this$0.KWHzl) != null) {
                String str = "{\"status\":\"" + this.$status + "\",\"errorMsg\":\"" + this.$message + "\"}";
                this.label = 1;
                if (eopLivenessBasicViewModel.OLrzqt(str, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel2 = this.this$0.KWHzl;
        if (eopLivenessBasicViewModel2 != null) {
            eopLivenessBasicViewModel2.OLrzqt();
        }
        return Unit.INSTANCE;
    }
}
