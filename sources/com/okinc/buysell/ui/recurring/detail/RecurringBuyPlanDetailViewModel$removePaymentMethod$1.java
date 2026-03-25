package com.okinc.buysell.ui.recurring.detail;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.Account;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC43419rot;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.lMD;
import o.lyI;

/* JADX INFO: loaded from: classes7.dex */
public final class RecurringBuyPlanDetailViewModel$removePaymentMethod$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ PaymentMethod $paymentMethod;
    Object L$0;
    int label;
    final /* synthetic */ RecurringBuyPlanDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyPlanDetailViewModel$removePaymentMethod$1(RecurringBuyPlanDetailViewModel recurringBuyPlanDetailViewModel, Channel channel, PaymentMethod paymentMethod, Continuation<? super RecurringBuyPlanDetailViewModel$removePaymentMethod$1> continuation) {
        super(2, continuation);
        this.this$0 = recurringBuyPlanDetailViewModel;
        this.$channel = channel;
        this.$paymentMethod = paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringBuyPlanDetailViewModel$removePaymentMethod$1(this.this$0, this.$channel, this.$paymentMethod, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringBuyPlanDetailViewModel$removePaymentMethod$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            lyI lyi = this.this$0.KWHzl;
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
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                abstractC43419rot = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                RecurringBuyPlanDetailViewModel recurringBuyPlanDetailViewModel = this.this$0;
                Channel channel = this.$channel;
                PaymentMethod paymentMethod2 = this.$paymentMethod;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                    MutableSharedFlow mutableSharedFlow = recurringBuyPlanDetailViewModel.OLrzqt;
                    Pair pairOLrzqt = C56390yDp.OLrzqt(channel, new lMD.StateListAnimator(paymentMethod2, oKServerException));
                    this.L$0 = abstractC43419rot;
                    this.label = 3;
                    if (mutableSharedFlow.emit(pairOLrzqt, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        RecurringBuyPlanDetailViewModel recurringBuyPlanDetailViewModel2 = this.this$0;
        Channel channel2 = this.$channel;
        PaymentMethod paymentMethod3 = this.$paymentMethod;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            MutableSharedFlow mutableSharedFlow2 = recurringBuyPlanDetailViewModel2.OLrzqt;
            Pair pairOLrzqt2 = C56390yDp.OLrzqt(channel2, new lMD.TaskDescription(paymentMethod3));
            this.L$0 = abstractC43419rot;
            this.label = 2;
            if (mutableSharedFlow2.emit(pairOLrzqt2, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        RecurringBuyPlanDetailViewModel recurringBuyPlanDetailViewModel3 = this.this$0;
        Channel channel3 = this.$channel;
        PaymentMethod paymentMethod22 = this.$paymentMethod;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
