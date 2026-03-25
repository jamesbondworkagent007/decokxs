package com.okinc.buysell.ui.bsc;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.Account;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.lMD;
import o.lyI;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class BaseBuySellViewModel$removePaymentMethod$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ PaymentMethod $paymentMethod;
    int label;
    final /* synthetic */ BaseBuySellViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBuySellViewModel$removePaymentMethod$1(BaseBuySellViewModel baseBuySellViewModel, Channel channel, PaymentMethod paymentMethod, Continuation<? super BaseBuySellViewModel$removePaymentMethod$1> continuation) {
        super(2, continuation);
        this.this$0 = baseBuySellViewModel;
        this.$channel = channel;
        this.$paymentMethod = paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseBuySellViewModel$removePaymentMethod$1(this.this$0, this.$channel, this.$paymentMethod, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseBuySellViewModel$removePaymentMethod$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            lyI lyi = this.this$0.QKVWgx;
            Integer numAEQbTJ = C56443yFo.AEQbTJ(this.$channel.getCategoryCode().getCode());
            String depositPlatformCode = this.$channel.getDepositPlatformCode();
            String paymentMethod = this.$paymentMethod.getPaymentMethod();
            Account account = this.$paymentMethod.getAccount();
            String paymentAccountId = account != null ? account.getPaymentAccountId() : null;
            if (paymentAccountId == null) {
                paymentAccountId = "";
            }
            Account account2 = this.$paymentMethod.getAccount();
            String paymentAccountId2 = account2 != null ? account2.getPaymentAccountId() : null;
            if (paymentAccountId2 == null) {
                paymentAccountId2 = "";
            }
            Account account3 = this.$paymentMethod.getAccount();
            String accountNumber = account3 != null ? account3.getAccountNumber() : null;
            String str = accountNumber == null ? "" : accountNumber;
            this.label = 1;
            obj = lyi.OLrzqt(numAEQbTJ, depositPlatformCode, paymentMethod, paymentAccountId, paymentAccountId2, str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        BaseBuySellViewModel baseBuySellViewModel = this.this$0;
        Channel channel = this.$channel;
        PaymentMethod paymentMethod2 = this.$paymentMethod;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            mHA mha = mHA.OLrzqt;
            mha.OLrzqt(baseBuySellViewModel.djBIcL, C56390yDp.OLrzqt(channel, new lMD.TaskDescription(paymentMethod2)));
            mha.OLrzqt(baseBuySellViewModel.fJNWhG, C56443yFo.KWHzl(false));
        }
        BaseBuySellViewModel baseBuySellViewModel2 = this.this$0;
        Channel channel2 = this.$channel;
        PaymentMethod paymentMethod3 = this.$paymentMethod;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
            mHA mha2 = mHA.OLrzqt;
            mha2.OLrzqt(baseBuySellViewModel2.djBIcL, C56390yDp.OLrzqt(channel2, new lMD.StateListAnimator(paymentMethod3, oKServerException)));
            mha2.OLrzqt(baseBuySellViewModel2.fJNWhG, C56443yFo.KWHzl(false));
        }
        return Unit.INSTANCE;
    }
}
