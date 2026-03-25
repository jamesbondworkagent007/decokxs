package com.okinc.business.defi.wallet.tee.activate.ui;

import androidx.activity.result.ActivityResult;
import com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC17792fSl;
import o.C56391yDq;
import o.C56442yFn;
import o.fVE;
import o.fWX;

/* JADX INFO: loaded from: classes5.dex */
public final class ActivateSAActivity$createSADoneActivityResultLauncher$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ActivityResult $result;
    int label;
    final /* synthetic */ ActivityC17792fSl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateSAActivity$createSADoneActivityResultLauncher$1$1(ActivityC17792fSl activityC17792fSl, ActivityResult activityResult, Continuation<? super ActivateSAActivity$createSADoneActivityResultLauncher$1$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC17792fSl;
        this.$result = activityResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivateSAActivity$createSADoneActivityResultLauncher$1$1(this.this$0, this.$result, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ActivateSAActivity$createSADoneActivityResultLauncher$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityC17792fSl activityC17792fSl = this.this$0;
            ActivateSAViewModel activateSAViewModelAEQbTJ = activityC17792fSl.AEQbTJ();
            this.label = 1;
            obj = activityC17792fSl.copydefault(activateSAViewModelAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        ActivityC17792fSl activityC17792fSl2 = this.this$0;
        ActivityResult activityResult = this.$result;
        ActivateSAViewModel.Application application = (ActivateSAViewModel.Application) obj;
        activityC17792fSl2.setResult(activityResult.getResultCode(), activityResult.getData());
        activityC17792fSl2.finish();
        if (activityC17792fSl2.AEQbTJ().AEQbTJ().getValue().isNeedToCreateNewAccount()) {
            fVE.Companion.EZpvd().EZpvd(new fWX.PictureInPictureParams(application.djBIcL()));
        }
        return Unit.INSTANCE;
    }
}
