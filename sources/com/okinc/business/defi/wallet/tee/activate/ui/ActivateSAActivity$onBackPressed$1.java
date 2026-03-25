package com.okinc.business.defi.wallet.tee.activate.ui;

import com.okinc.business.defi.wallet.tee.activate.model.NotificationStateType;
import com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC17792fSl;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class ActivateSAActivity$onBackPressed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ActivityC17792fSl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateSAActivity$onBackPressed$1(ActivityC17792fSl activityC17792fSl, Continuation<? super ActivateSAActivity$onBackPressed$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC17792fSl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivateSAActivity$onBackPressed$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ActivateSAActivity$onBackPressed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ActivityC17792fSl activityC17792fSl;
        NotificationStateType notificationStateType;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            activityC17792fSl = this.this$0;
            NotificationStateType notificationStateType2 = NotificationStateType.EnableFailed;
            ActivateSAViewModel activateSAViewModelAEQbTJ = activityC17792fSl.AEQbTJ();
            this.L$0 = activityC17792fSl;
            this.L$1 = notificationStateType2;
            this.label = 1;
            Object objCopydefault2 = activityC17792fSl.copydefault(activateSAViewModelAEQbTJ, this);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            notificationStateType = notificationStateType2;
            obj = objCopydefault2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            notificationStateType = (NotificationStateType) this.L$1;
            activityC17792fSl = (ActivityC17792fSl) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        activityC17792fSl.copydefault(notificationStateType, ((ActivateSAViewModel.Application) obj).djBIcL(), true);
        return Unit.INSTANCE;
    }
}
