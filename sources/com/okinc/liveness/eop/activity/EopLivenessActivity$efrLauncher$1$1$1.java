package com.okinc.liveness.eop.activity;

import com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC38205pQc;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes9.dex */
public final class EopLivenessActivity$efrLauncher$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $image;
    final /* synthetic */ String $imageHash;
    final /* synthetic */ String $status;
    final /* synthetic */ String $thumbnail;
    int label;
    final /* synthetic */ ActivityC38205pQc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EopLivenessActivity$efrLauncher$1$1$1(ActivityC38205pQc activityC38205pQc, String str, String str2, String str3, String str4, Continuation<? super EopLivenessActivity$efrLauncher$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC38205pQc;
        this.$image = str;
        this.$imageHash = str2;
        this.$thumbnail = str3;
        this.$status = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EopLivenessActivity$efrLauncher$1$1$1(this.this$0, this.$image, this.$imageHash, this.$thumbnail, this.$status, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EopLivenessActivity$efrLauncher$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            EopLivenessBasicViewModel eopLivenessBasicViewModel = this.this$0.KWHzl;
            if (eopLivenessBasicViewModel != null) {
                String str = this.$image;
                String str2 = this.$imageHash;
                String str3 = this.$thumbnail;
                String str4 = this.$status;
                this.label = 1;
                if (eopLivenessBasicViewModel.OLrzqt(str, str2, str3, str4, this) == objCopydefault) {
                    return objCopydefault;
                }
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
