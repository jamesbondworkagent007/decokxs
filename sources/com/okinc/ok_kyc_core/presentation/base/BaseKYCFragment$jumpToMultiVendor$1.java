package com.okinc.ok_kyc_core.presentation.base;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorTokenResp;
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
public final class BaseKYCFragment$jumpToMultiVendor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ VendorConfig $config;
    final /* synthetic */ String $cor;
    final /* synthetic */ MultiVendorTokenResp $data;
    int label;
    final /* synthetic */ AbstractC42060rEw<BINDING, VM> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseKYCFragment$jumpToMultiVendor$1(AbstractC42060rEw<BINDING, VM> abstractC42060rEw, VendorConfig vendorConfig, MultiVendorTokenResp multiVendorTokenResp, String str, Continuation<? super BaseKYCFragment$jumpToMultiVendor$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC42060rEw;
        this.$config = vendorConfig;
        this.$data = multiVendorTokenResp;
        this.$cor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseKYCFragment$jumpToMultiVendor$1(this.this$0, this.$config, this.$data, this.$cor, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseKYCFragment$jumpToMultiVendor$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            VendorConfig vendorConfig = this.$config;
            String sessionId = this.$data.getSessionId();
            if (sessionId == null) {
                sessionId = "";
            }
            String str = this.$cor;
            ActivityResultLauncher<Intent> activityResultLauncher = this.this$0.gEmmrt;
            this.label = 1;
            if (rtm.OLrzqt(fragmentActivityRequireActivity, vendorConfig, sessionId, str, activityResultLauncher, this) == objCopydefault) {
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
