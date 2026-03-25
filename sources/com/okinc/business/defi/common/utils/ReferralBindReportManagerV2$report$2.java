package com.okinc.business.defi.common.utils;

import com.okinc.business.defi.common.utils.ReferralBindReportManagerV2;
import java.util.Map;
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
public final class ReferralBindReportManagerV2$report$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, String> $addressMap;
    final /* synthetic */ boolean $isRestore;
    final /* synthetic */ String $referralCode;
    final /* synthetic */ String $signMsg;
    final /* synthetic */ String $signature;
    final /* synthetic */ int $source;
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ ReferralBindReportManagerV2 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralBindReportManagerV2$report$2(AbstractC12782ctV abstractC12782ctV, String str, String str2, String str3, Map<String, String> map, int i, boolean z, ReferralBindReportManagerV2 referralBindReportManagerV2, Continuation<? super ReferralBindReportManagerV2$report$2> continuation) {
        super(2, continuation);
        this.$wallet = abstractC12782ctV;
        this.$referralCode = str;
        this.$signMsg = str2;
        this.$signature = str3;
        this.$addressMap = map;
        this.$source = i;
        this.$isRestore = z;
        this.this$0 = referralBindReportManagerV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferralBindReportManagerV2$report$2(this.$wallet, this.$referralCode, this.$signMsg, this.$signature, this.$addressMap, this.$source, this.$isRestore, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReferralBindReportManagerV2$report$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String strDbNXlk = this.$wallet.DbNXlk();
                ReferralBindReportManagerV2.ReferralBindReportDataV2 referralBindReportDataV2 = new ReferralBindReportManagerV2.ReferralBindReportDataV2(this.$referralCode, this.$signMsg, this.$signature, this.$addressMap, strDbNXlk, String.valueOf(this.$wallet.QwvEab().ordinal()), System.currentTimeMillis(), this.$source, this.$isRestore);
                this.this$0.EZpvd(strDbNXlk, referralBindReportDataV2);
                pUU.KWHzl("ReferralBindReportManagerV2", "Report data saved to SP for accountId: " + strDbNXlk + ", reportData: " + referralBindReportDataV2);
                ReferralBindReportManagerV2 referralBindReportManagerV2 = this.this$0;
                AbstractC12782ctV abstractC12782ctV = this.$wallet;
                this.label = 1;
                if (referralBindReportManagerV2.AEQbTJ(abstractC12782ctV, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception e) {
            pUU.AEQbTJ("ReferralBindReportManagerV2", "Error in report: " + e.getMessage(), e);
        }
        return Unit.INSTANCE;
    }
}
