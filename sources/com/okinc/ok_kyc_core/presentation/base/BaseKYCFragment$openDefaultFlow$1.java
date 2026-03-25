package com.okinc.ok_kyc_core.presentation.base;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.ok_kyc_core.common.Constant;
import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42060rEw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.rTM;

/* JADX INFO: loaded from: classes23.dex */
public final class BaseKYCFragment$openDefaultFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cor;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ VendorConfig $vendorConfig;
    int label;
    final /* synthetic */ AbstractC42060rEw<BINDING, VM> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseKYCFragment$openDefaultFlow$1(VendorConfig vendorConfig, AbstractC42060rEw<BINDING, VM> abstractC42060rEw, String str, String str2, Continuation<? super BaseKYCFragment$openDefaultFlow$1> continuation) {
        super(2, continuation);
        this.$vendorConfig = vendorConfig;
        this.this$0 = abstractC42060rEw;
        this.$sessionId = str;
        this.$cor = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseKYCFragment$openDefaultFlow$1(this.$vendorConfig, this.this$0, this.$sessionId, this.$cor, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseKYCFragment$openDefaultFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ArrayList arrayList = new ArrayList();
            VendorConfig vendorConfig = this.$vendorConfig;
            Integer numAEQbTJ = vendorConfig != null ? C56443yFo.AEQbTJ(vendorConfig.getPhotoNumbers()) : null;
            if (numAEQbTJ != null && numAEQbTJ.intValue() == 0) {
                arrayList.addAll(this.this$0.EZpvd().AEQbTJ());
            } else if (numAEQbTJ != null && numAEQbTJ.intValue() == 2) {
                arrayList.add(C56443yFo.AEQbTJ(Constant.UploadFileType.ID_FRONT.getImageTypeVal()));
                arrayList.add(C56443yFo.AEQbTJ(Constant.UploadFileType.ID_BACK.getImageTypeVal()));
            } else {
                arrayList.add(C56443yFo.AEQbTJ(Constant.UploadFileType.ID_FRONT.getImageTypeVal()));
            }
            pUU.KWHzl("qjf", "cardQueue = " + arrayList);
            rTM rtm = rTM.KWHzl;
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            VendorConfig vendorConfig2 = this.$vendorConfig;
            String str = this.$sessionId;
            if (str == null) {
                str = "";
            }
            String str2 = this.$cor;
            ActivityResultLauncher<Intent> activityResultLauncher = this.this$0.djBIcL;
            ActivityResultLauncher<Intent> activityResultLauncher2 = this.this$0.AuCTel;
            this.label = 1;
            if (rtm.OLrzqt(fragmentActivityRequireActivity, vendorConfig2, str, str2, arrayList, activityResultLauncher, activityResultLauncher2, this) == objCopydefault) {
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
