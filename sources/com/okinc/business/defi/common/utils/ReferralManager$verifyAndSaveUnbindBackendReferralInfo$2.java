package com.okinc.business.defi.common.utils;

import com.okinc.business.defi.biz.net.bean.InviteeInfoItemResponse;
import com.okinc.business.defi.biz.net.bean.PreferRefCodeInfoResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralManager$verifyAndSaveUnbindBackendReferralInfo$2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReferralManager this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralManager$verifyAndSaveUnbindBackendReferralInfo$2(ReferralManager referralManager, Continuation<? super ReferralManager$verifyAndSaveUnbindBackendReferralInfo$2> continuation) {
        super(continuation);
        this.this$0 = referralManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((String) null, (String) null, (String) null, (InviteeInfoItemResponse) null, (PreferRefCodeInfoResponse) null, (String) null, (Continuation<? super Unit>) this);
    }
}
