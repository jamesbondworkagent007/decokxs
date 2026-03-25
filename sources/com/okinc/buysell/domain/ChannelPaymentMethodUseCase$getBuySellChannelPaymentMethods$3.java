package com.okinc.buysell.domain;

import com.okinc.crcore.shared.net.responsebean.bsc.ChannelBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC31764mDa;
import o.lyC;
import o.lyG;

/* JADX INFO: loaded from: classes7.dex */
public final class ChannelPaymentMethodUseCase$getBuySellChannelPaymentMethods$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends Channel>, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $baseAmount;
    final /* synthetic */ String $baseCurrency;
    final /* synthetic */ boolean $includeFundingBalance;
    final /* synthetic */ String $quoteAmount;
    final /* synthetic */ String $quoteCurrency;
    final /* synthetic */ boolean $shouldApplyCached;
    final /* synthetic */ Integer $standard;
    final /* synthetic */ TradeType $tradeType;
    int label;
    final /* synthetic */ lyG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelPaymentMethodUseCase$getBuySellChannelPaymentMethods$3(lyG lyg, TradeType tradeType, boolean z, String str, String str2, String str3, String str4, Integer num, boolean z2, Continuation<? super ChannelPaymentMethodUseCase$getBuySellChannelPaymentMethods$3> continuation) {
        super(2, continuation);
        this.this$0 = lyg;
        this.$tradeType = tradeType;
        this.$shouldApplyCached = z;
        this.$baseAmount = str;
        this.$baseCurrency = str2;
        this.$quoteAmount = str3;
        this.$quoteCurrency = str4;
        this.$standard = num;
        this.$includeFundingBalance = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelPaymentMethodUseCase$getBuySellChannelPaymentMethods$3(this.this$0, this.$tradeType, this.$shouldApplyCached, this.$baseAmount, this.$baseCurrency, this.$quoteAmount, this.$quoteCurrency, this.$standard, this.$includeFundingBalance, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends Channel>, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends List<Channel>, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<Channel>, OKServerException>> continuation) {
        return ((ChannelPaymentMethodUseCase$getBuySellChannelPaymentMethods$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object channelPaymentMethods$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC31764mDa interfaceC31764mDa = this.this$0.EZpvd;
            String type = this.$tradeType.getType();
            Integer numAEQbTJ = C56443yFo.AEQbTJ(this.$shouldApplyCached ? 5 : 0);
            String str = this.$baseAmount;
            String str2 = this.$baseCurrency;
            String str3 = this.$quoteAmount;
            String str4 = this.$quoteCurrency;
            Integer num = this.$standard;
            Boolean boolKWHzl = C56443yFo.KWHzl(this.$includeFundingBalance);
            this.label = 1;
            channelPaymentMethods$default = InterfaceC31764mDa.ActionBar.getChannelPaymentMethods$default(interfaceC31764mDa, null, null, numAEQbTJ, str, str2, str3, str4, type, num, null, null, null, null, null, boolKWHzl, this, 15875, null);
            if (channelPaymentMethods$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            channelPaymentMethods$default = obj;
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) channelPaymentMethods$default;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            List list = (List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(lyC.AEQbTJ.AEQbTJ((ChannelBean) it.next()));
            }
            return new AbstractC43419rot.StateListAnimator(arrayList);
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }
}
