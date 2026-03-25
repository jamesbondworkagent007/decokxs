package com.okinc.business.defi.common.utils;

import com.okinc.business.defi.biz.net.bean.InviteeInfoItemResponse;
import com.okinc.business.defi.biz.net.bean.PreferRefCodeInfoResponse;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralManager$checkAndSaveUnbindBackendReferralCode$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReferralManager this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralManager$checkAndSaveUnbindBackendReferralCode$1(ReferralManager referralManager, Continuation<? super ReferralManager$checkAndSaveUnbindBackendReferralCode$1> continuation) {
        super(continuation);
        this.this$0 = referralManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((String) null, (InviteeInfoItemResponse) null, (PreferRefCodeInfoResponse) null, (String) null, (Continuation<? super Boolean>) this);
    }
}
