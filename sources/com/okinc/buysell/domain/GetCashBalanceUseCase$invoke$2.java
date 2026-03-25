package com.okinc.buysell.domain;

import com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.PaymentMethodResponseBean;
import com.okinc.crcore.shared.net.responsebean.bsc.ChannelBean;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC31764mDa;
import o.lyC;
import o.lyQ;

/* JADX INFO: loaded from: classes23.dex */
public final class GetCashBalanceUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super lyQ.TaskDescription>, Object> {
    final /* synthetic */ String $baseAmount;
    final /* synthetic */ String $baseCurrency;
    final /* synthetic */ String $quoteAmount;
    final /* synthetic */ String $quoteCurrency;
    final /* synthetic */ boolean $shouldApplyCached;
    final /* synthetic */ Integer $standard;
    final /* synthetic */ TradeType $tradeType;
    int label;
    final /* synthetic */ lyQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCashBalanceUseCase$invoke$2(lyQ lyq, TradeType tradeType, boolean z, String str, String str2, String str3, String str4, Integer num, Continuation<? super GetCashBalanceUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = lyq;
        this.$tradeType = tradeType;
        this.$shouldApplyCached = z;
        this.$baseAmount = str;
        this.$baseCurrency = str2;
        this.$quoteAmount = str3;
        this.$quoteCurrency = str4;
        this.$standard = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetCashBalanceUseCase$invoke$2(this.this$0, this.$tradeType, this.$shouldApplyCached, this.$baseAmount, this.$baseCurrency, this.$quoteAmount, this.$quoteCurrency, this.$standard, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super lyQ.TaskDescription> continuation) {
        return ((GetCashBalanceUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:60:0x00ef */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x000b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5 A[Catch: Exception -> 0x00ef, TryCatch #0 {Exception -> 0x00ef, blocks: (B:52:0x00d1, B:54:0x00d5, B:55:0x00d8, B:57:0x00dc, B:58:0x00df), top: B:68:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc A[Catch: Exception -> 0x00ef, TryCatch #0 {Exception -> 0x00ef, blocks: (B:52:0x00d1, B:54:0x00d5, B:55:0x00d8, B:57:0x00dc, B:58:0x00df), top: B:68:0x00d1 }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.okinc.buysell.domain.GetCashBalanceUseCase$invoke$2] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r2;
        Object channelPaymentMethods$default;
        Object next;
        boolean z;
        String availableBalance;
        String str;
        String str2;
        AccountResponseBean account;
        ?? r10 = this;
        Object objCopydefault = C56442yFn.copydefault();
        int i = r10.label;
        String str3 = null;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC31764mDa interfaceC31764mDa = r10.this$0.KWHzl;
                String type = r10.$tradeType.getType();
                Integer numAEQbTJ = C56443yFo.AEQbTJ(r10.$shouldApplyCached ? 5 : 0);
                String str4 = r10.$baseAmount;
                String str5 = r10.$baseCurrency;
                String str6 = r10.$quoteAmount;
                String str7 = r10.$quoteCurrency;
                Integer num = r10.$standard;
                r10.label = 1;
                str3 = str7;
                Integer num2 = num;
                try {
                    channelPaymentMethods$default = InterfaceC31764mDa.ActionBar.getChannelPaymentMethods$default(interfaceC31764mDa, null, null, numAEQbTJ, str4, str5, str6, str3, type, num2, null, null, null, null, null, null, this, 32259, null);
                    r10 = num2;
                    if (channelPaymentMethods$default == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (Exception e) {
                    e = e;
                    r2 = 0;
                    return new lyQ.TaskDescription.Activity(e.getMessage(), r2, 2, null);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                channelPaymentMethods$default = obj;
                r10 = r10;
            }
            List list = (List) ((AbstractC43419rot) channelPaymentMethods$default).AEQbTJ();
            boolean z2 = list.size() == 1;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ChannelBean) next).getCategoryCode().getCode() == ChannelCategoryCode.BALANCE.getCode()) {
                    break;
                }
            }
            ChannelBean channelBean = (ChannelBean) next;
            if (channelBean == null) {
                return new lyQ.TaskDescription.Activity("", z2);
            }
            List<PaymentMethodResponseBean> paymentMethods = channelBean.getPaymentMethods();
            try {
                if (paymentMethods != null) {
                    r2 = 0;
                    r2 = 0;
                    z = false;
                    z = false;
                    try {
                        PaymentMethodResponseBean paymentMethodResponseBean = paymentMethods.get(0);
                        if (paymentMethodResponseBean != null && (account = paymentMethodResponseBean.getAccount()) != null) {
                            availableBalance = account.getAvailableBalance();
                        }
                        String str8 = availableBalance != null ? availableBalance : "";
                        str = this.$quoteCurrency;
                        if (str != null) {
                            channelBean.setQuoteCurrency(str);
                        }
                        str2 = this.$baseCurrency;
                        if (str2 != null) {
                            channelBean.setBaseCurrency(str2);
                        }
                        return new lyQ.TaskDescription.Application(C33129mqd.OLrzqt((Object) str8), lyC.AEQbTJ.AEQbTJ(channelBean), z2);
                    } catch (Exception e2) {
                        e = e2;
                        return new lyQ.TaskDescription.Activity(e.getMessage(), r2, 2, null);
                    }
                }
                z = false;
                str = this.$quoteCurrency;
                if (str != null) {
                }
                str2 = this.$baseCurrency;
                if (str2 != null) {
                }
                return new lyQ.TaskDescription.Application(C33129mqd.OLrzqt((Object) str8), lyC.AEQbTJ.AEQbTJ(channelBean), z2);
            } catch (Exception e3) {
                e = e3;
                return new lyQ.TaskDescription.Activity(e.getMessage(), r2, 2, null);
            }
            availableBalance = null;
            r2 = z;
            if (availableBalance != null) {
            }
        } catch (Exception e4) {
            e = e4;
            r2 = str3;
        }
    }
}
