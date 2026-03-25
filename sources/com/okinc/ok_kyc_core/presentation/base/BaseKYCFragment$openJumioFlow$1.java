package com.okinc.ok_kyc_core.presentation.base;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import com.okinc.ok_kyc_core.ocrvendor.VendorEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42060rEw;
import o.ActivityC42040rEc;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.rSF;
import o.yDV;

/* JADX INFO: loaded from: classes23.dex */
public final class BaseKYCFragment$openJumioFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ VendorConfig $vendorConfig;
    int label;
    final /* synthetic */ AbstractC42060rEw<BINDING, VM> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseKYCFragment$openJumioFlow$1(AbstractC42060rEw<BINDING, VM> abstractC42060rEw, VendorConfig vendorConfig, Continuation<? super BaseKYCFragment$openJumioFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC42060rEw;
        this.$vendorConfig = vendorConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseKYCFragment$openJumioFlow$1(this.this$0, this.$vendorConfig, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseKYCFragment$openJumioFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0 A[Catch: Exception -> 0x00ca, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ca, blocks: (B:6:0x0013, B:34:0x00a8, B:36:0x00c0, B:10:0x0020, B:16:0x0041, B:20:0x0061, B:22:0x0064, B:23:0x007a, B:25:0x008f, B:27:0x0095, B:29:0x0099, B:31:0x009f, B:13:0x0027), top: B:42:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Intent intent;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            pUU.copydefault("BaseKYCFragment", "message =  " + e.getMessage());
            AbstractC42060rEw.finishWithErrorResult$default(this.this$0, VendorEvent.VENDOR_CRASH_ERROR, null, 2, null);
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            rSF rsf = (rSF) C43251rlk.copydefault(rSF.class);
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            this.label = 1;
            obj = rsf.AEQbTJ(fragmentActivityRequireActivity, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                intent = (Intent) obj;
                pUU.KWHzl("BaseKYCFragment", "jumioActivityIntent = " + intent);
                if (intent != null) {
                    this.this$0.AkhnZx.launch(intent);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        String[] strArr = (String[]) obj;
        pUU.KWHzl("BaseKYCFragment", "openJumioFlow-->permissions = " + yDV.AwvSrB(strArr));
        if (!(strArr.length == 0)) {
            FragmentActivity fragmentActivityRequireActivity2 = this.this$0.requireActivity();
            AbstractC42060rEw<BINDING, VM> abstractC42060rEw = this.this$0;
            ActivityC42040rEc.Application application = ActivityC42040rEc.Companion;
            Intrinsics.copydefault(fragmentActivityRequireActivity2);
            application.AEQbTJ(fragmentActivityRequireActivity2, strArr, abstractC42060rEw.ejfBZ);
            return Unit.INSTANCE;
        }
        rSF rsf2 = (rSF) C43251rlk.copydefault(rSF.class);
        FragmentActivity fragmentActivityRequireActivity3 = this.this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "");
        VendorConfig vendorConfig = this.$vendorConfig;
        String token = vendorConfig != null ? vendorConfig.getToken() : null;
        VendorConfig vendorConfig2 = this.$vendorConfig;
        String dataCenter = vendorConfig2 != null ? vendorConfig2.getDataCenter() : null;
        this.label = 2;
        obj = rsf2.OLrzqt(fragmentActivityRequireActivity3, token, dataCenter, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        intent = (Intent) obj;
        pUU.KWHzl("BaseKYCFragment", "jumioActivityIntent = " + intent);
        if (intent != null) {
        }
        return Unit.INSTANCE;
    }
}
