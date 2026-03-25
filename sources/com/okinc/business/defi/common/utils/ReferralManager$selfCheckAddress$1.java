package com.okinc.business.defi.common.utils;

import com.okinc.business.defi.biz.database.extra.bean.ReferralInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralManager$selfCheckAddress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReferralInfoBean $bean;
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ ReferralManager this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralManager$selfCheckAddress$1(ReferralManager referralManager, AbstractC12782ctV abstractC12782ctV, ReferralInfoBean referralInfoBean, Continuation<? super ReferralManager$selfCheckAddress$1> continuation) {
        super(2, continuation);
        this.this$0 = referralManager;
        this.$wallet = abstractC12782ctV;
        this.$bean = referralInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferralManager$selfCheckAddress$1(this.this$0, this.$wallet, this.$bean, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReferralManager$selfCheckAddress$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("DexReferral", "selfCheckAddress: start save");
                ReferralManager referralManager = this.this$0;
                AbstractC12782ctV abstractC12782ctV = this.$wallet;
                String referralCode = this.$bean.getReferralCode();
                String signMsg = this.$bean.getSignMsg();
                String str = signMsg == null ? "" : signMsg;
                String signature = this.$bean.getSignature();
                String str2 = signature == null ? "" : signature;
                this.label = 1;
                if (referralManager.copydefault(abstractC12782ctV, referralCode, str, str2, (Continuation<? super Boolean>) this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "selfCheckAddress: Exception occurred", e);
        }
        return Unit.INSTANCE;
    }
}
