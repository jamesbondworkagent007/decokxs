package com.okinc.ok_kyc_core.presentation.base;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42060rEw;
import o.C56391yDq;
import o.C56442yFn;
import o.rTM;

/* JADX INFO: loaded from: classes23.dex */
public final class BaseKYCFragment$initPermissionStateObservable$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AbstractC42060rEw<BINDING, VM> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseKYCFragment$initPermissionStateObservable$1$1$2(AbstractC42060rEw<BINDING, VM> abstractC42060rEw, Continuation<? super BaseKYCFragment$initPermissionStateObservable$1$1$2> continuation) {
        super(2, continuation);
        this.this$0 = abstractC42060rEw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseKYCFragment$initPermissionStateObservable$1$1$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseKYCFragment$initPermissionStateObservable$1$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            rTM rtm = rTM.KWHzl;
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            ActivityResultLauncher<Intent> activityResultLauncher = this.this$0.EZpvd;
            String strAYXKKw = this.this$0.EZpvd().AYXKKw();
            if (strAYXKKw == null) {
                strAYXKKw = "";
            }
            String strOLrzqt = this.this$0.EZpvd().OLrzqt();
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            this.label = 1;
            if (rtm.copydefault(fragmentActivityRequireActivity, activityResultLauncher, strAYXKKw, strOLrzqt, this) == objCopydefault) {
                return objCopydefault;
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
