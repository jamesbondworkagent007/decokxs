package com.okinc.ok_kyc_core.presentation.base;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MergeAccountResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42074rFj;
import o.AbstractC43728ruk;
import o.C33129mqd;
import o.C41981rBy;
import o.C43251rlk;
import o.C43693ruB;
import o.C43734ruq;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.rTU;

/* JADX INFO: loaded from: classes10.dex */
public final class BaseKYCViewModel$ocrMergeAccountAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ ActivityResultLauncher<Intent> $launcher;
    final /* synthetic */ C52794wYp $view;
    int label;
    final /* synthetic */ AbstractC42074rFj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseKYCViewModel$ocrMergeAccountAction$1(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, FragmentActivity fragmentActivity, ActivityResultLauncher<Intent> activityResultLauncher, Continuation<? super BaseKYCViewModel$ocrMergeAccountAction$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC42074rFj;
        this.$view = c52794wYp;
        this.$activity = fragmentActivity;
        this.$launcher = activityResultLauncher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseKYCViewModel$ocrMergeAccountAction$1(this.this$0, this.$view, this.$activity, this.$launcher, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseKYCViewModel$ocrMergeAccountAction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C41981rBy c41981rByEZpvd = this.this$0.values().EZpvd();
                this.label = 1;
                obj = c41981rByEZpvd.KWHzl(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            AbstractC43728ruk abstractC43728ruk = (AbstractC43728ruk) obj;
            AbstractC42074rFj abstractC42074rFj = this.this$0;
            C52794wYp c52794wYp = this.$view;
            FragmentActivity fragmentActivity = this.$activity;
            ActivityResultLauncher<Intent> activityResultLauncher = this.$launcher;
            if (abstractC43728ruk instanceof AbstractC43728ruk.ActionBar) {
                MergeAccountResponse mergeAccountResponse = (MergeAccountResponse) ((AbstractC43728ruk.ActionBar) abstractC43728ruk).KWHzl();
                AbstractC42074rFj.cancelLoading$default(abstractC42074rFj, c52794wYp, fragmentActivity, false, 4, null);
                if (activityResultLauncher != null) {
                    ((rTU) C43251rlk.copydefault(rTU.class)).AEQbTJ(fragmentActivity, C33129mqd.gEmmrt(mergeAccountResponse.getSessionId()), activityResultLauncher, new FacialExtParams((Map) null, "reclaim_kyc", 1, (DefaultConstructorMarker) null));
                }
            }
            AbstractC42074rFj abstractC42074rFj2 = this.this$0;
            C52794wYp c52794wYp2 = this.$view;
            FragmentActivity fragmentActivity2 = this.$activity;
            if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
                ResponseFailedException responseFailedException = (ResponseFailedException) ((AbstractC43728ruk.TaskDescription) abstractC43728ruk).OLrzqt();
                C43693ruB.EZpvd("KYC_MergeAccount_SessionId_Error", C33129mqd.gEmmrt(responseFailedException.getMessage()));
                abstractC42074rFj2.getNewProxyInstance().setValue(new C43734ruq<>(C33129mqd.gEmmrt(responseFailedException.getMessage())));
                AbstractC42074rFj.cancelLoading$default(abstractC42074rFj2, c52794wYp2, fragmentActivity2, false, 4, null);
            }
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }
}
