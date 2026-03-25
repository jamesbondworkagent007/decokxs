package com.okinc.business.defi.common.utils;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralManager$deleteReferralInfo$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ ReferralManager this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralManager$deleteReferralInfo$4(AbstractC12782ctV abstractC12782ctV, ReferralManager referralManager, Continuation<? super ReferralManager$deleteReferralInfo$4> continuation) {
        super(2, continuation);
        this.$wallet = abstractC12782ctV;
        this.this$0 = referralManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferralManager$deleteReferralInfo$4(this.$wallet, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((ReferralManager$deleteReferralInfo$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String strValueOf = String.valueOf(this.$wallet.QwvEab().ordinal());
                String strAYXKKw = this.this$0.AYXKKw(this.$wallet);
                pUU.KWHzl("DexReferral", "deleteReferralInfo: Starting save for walletType=" + strValueOf + ", walletAddress=" + strAYXKKw);
                if (strAYXKKw != null) {
                    ReferralManager referralManager = this.this$0;
                    this.label = 1;
                    obj = referralManager.KWHzl(strValueOf, strAYXKKw, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    return C56443yFo.KWHzl(false);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return obj;
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "deleteReferralInfo: Exception occurred", e);
            return C56443yFo.KWHzl(false);
        }
    }
}
