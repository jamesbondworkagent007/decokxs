package com.okinc.ok_kyc_core.impl;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C42467rTy;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.rSB;

/* JADX INFO: loaded from: classes10.dex */
public final class OKComplianceServiceImpl$startOKFace$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ FacialExtParams $extParams;
    final /* synthetic */ ActivityResultLauncher<Intent> $launcher;
    final /* synthetic */ String $sessionId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKComplianceServiceImpl$startOKFace$1(FragmentActivity fragmentActivity, String str, ActivityResultLauncher<Intent> activityResultLauncher, FacialExtParams facialExtParams, Continuation<? super OKComplianceServiceImpl$startOKFace$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$sessionId = str;
        this.$launcher = activityResultLauncher;
        this.$extParams = facialExtParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKComplianceServiceImpl$startOKFace$1(this.$activity, this.$sessionId, this.$launcher, this.$extParams, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKComplianceServiceImpl$startOKFace$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        rSB rsb;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            FragmentActivity fragmentActivity = this.$activity;
            this.label = 1;
            obj = c42467rTy.OLrzqt(fragmentActivity, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue() && (rsb = (rSB) C43251rlk.OLrzqt(rSB.class)) != null) {
            rsb.KWHzl(this.$activity, this.$sessionId, this.$launcher, this.$extParams);
        }
        return Unit.INSTANCE;
    }
}
