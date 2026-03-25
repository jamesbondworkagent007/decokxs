package com.okinc.business.defi.common.utils;

import com.okinc.business.defi.biz.net.bean.ReferralSubInviterInvitationResponse;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralManager$bindReferralSubInviter$resultPair$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Integer, ? extends ReferralSubInviterInvitationResponse>>, Object> {
    final /* synthetic */ String $referralCode;
    int label;
    final /* synthetic */ ReferralManager this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralManager$bindReferralSubInviter$resultPair$1(ReferralManager referralManager, String str, Continuation<? super ReferralManager$bindReferralSubInviter$resultPair$1> continuation) {
        super(2, continuation);
        this.this$0 = referralManager;
        this.$referralCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferralManager$bindReferralSubInviter$resultPair$1(this.this$0, this.$referralCode, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends Integer, ? extends ReferralSubInviterInvitationResponse>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<Integer, ReferralSubInviterInvitationResponse>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<Integer, ReferralSubInviterInvitationResponse>> continuation) {
        return ((ReferralManager$bindReferralSubInviter$resultPair$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ReferralManager referralManager = this.this$0;
            String str = this.$referralCode;
            this.label = 1;
            obj = referralManager.gEmmrt(str, (Continuation<? super Pair<Integer, ReferralSubInviterInvitationResponse>>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
