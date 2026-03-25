package com.okinc.ok_kyc_core.presentation.base;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42060rEw;
import o.ActivityC42162rIq;
import o.C42467rTy;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class BaseKYCFragment$amaniVideoCallLauncher$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ActivityResult $result;
    int label;
    final /* synthetic */ AbstractC42060rEw<BINDING, VM> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseKYCFragment$amaniVideoCallLauncher$1$1(ActivityResult activityResult, AbstractC42060rEw<BINDING, VM> abstractC42060rEw, Continuation<? super BaseKYCFragment$amaniVideoCallLauncher$1$1> continuation) {
        super(2, continuation);
        this.$result = activityResult;
        this.this$0 = abstractC42060rEw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseKYCFragment$amaniVideoCallLauncher$1$1(this.$result, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseKYCFragment$amaniVideoCallLauncher$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$result.getResultCode() == -1) {
                if (this.this$0.getActivity() != null && (this.this$0.getActivity() instanceof ActivityC42162rIq)) {
                    C42467rTy c42467rTy = C42467rTy.KWHzl;
                    if (c42467rTy.sSMYrx() && c42467rTy.AxsJAY()) {
                        FragmentActivity activity = this.this$0.getActivity();
                        Intrinsics.copydefault(activity, "");
                        this.label = 1;
                        if (c42467rTy.KWHzl((ActivityC42162rIq) activity, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
            } else if (this.$result.getResultCode() == 0) {
                pUU.EZpvd("qjf", "amani video call 用户点击了返回----quit by user cancel");
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        pUU.KWHzl("qjf", "amani video call callback");
        Intent data = this.$result.getData();
        if (Intrinsics.EZpvd(data != null ? C56443yFo.KWHzl(data.getBooleanExtra("EXTRA_RESULT_SUCCESS", false)) : null, C56443yFo.KWHzl(true))) {
            AbstractC42060rEw<BINDING, VM> abstractC42060rEw = this.this$0;
            abstractC42060rEw.KWHzl(abstractC42060rEw.EZpvd().gEmmrt());
        }
        return Unit.INSTANCE;
    }
}
