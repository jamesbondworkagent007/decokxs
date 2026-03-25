package com.okinc.business.defi.wallet.tee.activate.ui;

import android.graphics.drawable.Drawable;
import com.okinc.business.defi.wallet.tee.activate.model.NotificationStateType;
import com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC17792fSl;
import o.C33129mqd;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class ActivateSAActivity$handleErrorResponse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Throwable $error;
    final /* synthetic */ String $errorMsg;
    int label;
    final /* synthetic */ ActivityC17792fSl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateSAActivity$handleErrorResponse$1(ActivityC17792fSl activityC17792fSl, Throwable th, String str, Continuation<? super ActivateSAActivity$handleErrorResponse$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC17792fSl;
        this.$error = th;
        this.$errorMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivateSAActivity$handleErrorResponse$1(this.this$0, this.$error, this.$errorMsg, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ActivateSAActivity$handleErrorResponse$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Throwable th = this.$error;
        ActivityC17792fSl activityC17792fSl2 = this.this$0;
        String str = this.$errorMsg;
        ActivateSAViewModel.Application application = (ActivateSAViewModel.Application) obj;
        if (((OKServerException) th).getCode() == 590006) {
            activityC17792fSl2.copydefault(NotificationStateType.SmartEnabled, application.djBIcL(), true);
        } else if (C33129mqd.OLrzqt((CharSequence) str)) {
            C55328xhq.show$default(C55328xhq.OLrzqt, str, (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
