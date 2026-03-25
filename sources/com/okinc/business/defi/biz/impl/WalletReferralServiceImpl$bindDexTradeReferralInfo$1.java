package com.okinc.business.defi.biz.impl;

import com.okinc.business.defi.common.utils.ReferralManager;
import com.okinc.wallet.api.bean.ReferralInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletReferralServiceImpl$bindDexTradeReferralInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ ReferralInfo $codeInfo;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletReferralServiceImpl$bindDexTradeReferralInfo$1(ReferralInfo referralInfo, String str, Continuation<? super WalletReferralServiceImpl$bindDexTradeReferralInfo$1> continuation) {
        super(2, continuation);
        this.$codeInfo = referralInfo;
        this.$accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletReferralServiceImpl$bindDexTradeReferralInfo$1(this.$codeInfo, this.$accountId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletReferralServiceImpl$bindDexTradeReferralInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("DexReferral", "bindDexTradeReferralInfo start, codeInfo=" + this.$codeInfo + ", accountId=" + this.$accountId);
                ReferralManager instance$default = ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null);
                ReferralInfo referralInfo = this.$codeInfo;
                String str = this.$accountId;
                this.label = 1;
                if (instance$default.KWHzl(referralInfo, str, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "triggerBindReferralInfo failed", e);
        }
        return Unit.INSTANCE;
    }
}
