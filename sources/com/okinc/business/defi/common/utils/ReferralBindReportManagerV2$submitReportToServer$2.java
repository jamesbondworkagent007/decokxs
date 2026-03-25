package com.okinc.business.defi.common.utils;

import com.okinc.business.defi.common.utils.ReferralBindReportManagerV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralBindReportManagerV2$submitReportToServer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $prvKey;
    final /* synthetic */ ReferralBindReportManagerV2.ReferralBindReportDataV2 $reportData;
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ ReferralBindReportManagerV2 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralBindReportManagerV2$submitReportToServer$2(ReferralBindReportManagerV2 referralBindReportManagerV2, String str, String str2, ReferralBindReportManagerV2.ReferralBindReportDataV2 referralBindReportDataV2, Continuation<? super ReferralBindReportManagerV2$submitReportToServer$2> continuation) {
        super(2, continuation);
        this.this$0 = referralBindReportManagerV2;
        this.$prvKey = str;
        this.$walletId = str2;
        this.$reportData = referralBindReportDataV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferralBindReportManagerV2$submitReportToServer$2(this.this$0, this.$prvKey, this.$walletId, this.$reportData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((ReferralBindReportManagerV2$submitReportToServer$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C13934dbu c13934dbu = this.this$0.AEQbTJ;
                String str = this.$prvKey;
                String str2 = this.$walletId;
                ReferralBindReportManagerV2.ReferralBindReportDataV2 referralBindReportDataV2 = this.$reportData;
                this.label = 1;
                obj = c13934dbu.EZpvd(str, str2, referralBindReportDataV2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            pUU.KWHzl("ReferralBindReportManagerV2", "submitReportToServer success: walletId=" + this.$walletId + ", reportData=" + this.$reportData);
            zEZpvd = ((AbstractC43419rot) obj).EZpvd();
        } catch (Exception e) {
            pUU.AEQbTJ("ReferralBindReportManagerV2", "Error submitting to server", e);
            zEZpvd = false;
        }
        return C56443yFo.KWHzl(zEZpvd);
    }
}
