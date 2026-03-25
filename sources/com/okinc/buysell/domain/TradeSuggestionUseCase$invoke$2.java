package com.okinc.buysell.domain;

import com.okinc.crcore.shared.net.responsebean.bsc.ChannelBean;
import com.okinc.crcore.shared.net.responsebean.bsc.TradeSuggestionBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.BalanceAccountType;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31659lzg;
import o.C31667lzo;
import o.C33129mqd;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C59449zhJ;
import o.InterfaceC31670lzr;
import o.InterfaceC31764mDa;
import o.lAA;
import o.lyF;

/* JADX INFO: loaded from: classes7.dex */
public final class TradeSuggestionUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends TradeSuggestionBean, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $baseAmount;
    final /* synthetic */ String $baseCurrency;
    final /* synthetic */ String $chainIndex;
    final /* synthetic */ boolean $multipleCurrency;
    final /* synthetic */ String $quoteAmount;
    final /* synthetic */ String $quoteCurrency;
    final /* synthetic */ int $standard;
    final /* synthetic */ String $tokenAddress;
    final /* synthetic */ TradeType $tradeType;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C31659lzg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeSuggestionUseCase$invoke$2(String str, String str2, C31659lzg c31659lzg, TradeType tradeType, String str3, String str4, int i, boolean z, String str5, String str6, Continuation<? super TradeSuggestionUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$baseCurrency = str;
        this.$quoteCurrency = str2;
        this.this$0 = c31659lzg;
        this.$tradeType = tradeType;
        this.$baseAmount = str3;
        this.$quoteAmount = str4;
        this.$standard = i;
        this.$multipleCurrency = z;
        this.$chainIndex = str5;
        this.$tokenAddress = str6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeSuggestionUseCase$invoke$2(this.$baseCurrency, this.$quoteCurrency, this.this$0, this.$tradeType, this.$baseAmount, this.$quoteAmount, this.$standard, this.$multipleCurrency, this.$chainIndex, this.$tokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends TradeSuggestionBean, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<TradeSuggestionBean, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<TradeSuggestionBean, OKServerException>> continuation) {
        return ((TradeSuggestionUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00f3 -> B:26:0x00f8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Object objCopydefault;
        C31659lzg c31659lzg;
        Collection arrayList;
        int i;
        Iterator it;
        TradeSuggestionBean tradeSuggestionBean;
        int i2;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i3 = this.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean zAYXKKw = ((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AYXKKw();
            String str = C59449zhJ.gEmmrt(this.$baseCurrency, this.$quoteCurrency, true) ? "" : this.$quoteCurrency;
            InterfaceC31764mDa interfaceC31764mDa = this.this$0.KWHzl;
            String type = this.$tradeType.getType();
            String value = BalanceAccountType.TRADING.getValue();
            String str2 = this.$baseCurrency;
            String str3 = this.$baseAmount;
            String str4 = this.$quoteAmount;
            int i4 = this.$standard;
            boolean z2 = this.$multipleCurrency;
            String str5 = this.$chainIndex;
            String str6 = this.$tokenAddress;
            this.label = 1;
            z = true;
            objCopydefault = interfaceC31764mDa.copydefault(type, value, str2, str, str3, str4, i4, z2, str5, str6, zAYXKKw, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else if (i3 == 1) {
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
            z = true;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.I$1;
            i = this.I$0;
            ChannelBean channelBean = (ChannelBean) this.L$4;
            it = (Iterator) this.L$3;
            arrayList = (Collection) this.L$2;
            TradeSuggestionBean tradeSuggestionBean2 = (TradeSuggestionBean) this.L$1;
            c31659lzg = (C31659lzg) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objKWHzl = obj;
            z = true;
            lyF.TaskDescription taskDescription = (lyF.TaskDescription) objKWHzl;
            if (!Intrinsics.EZpvd(taskDescription, lyF.TaskDescription.C0873TaskDescription.KWHzl)) {
                if (Intrinsics.EZpvd(taskDescription, lyF.TaskDescription.Application.OLrzqt)) {
                    channelBean.setGooglePayReadyToUse(z);
                } else if (Intrinsics.EZpvd(taskDescription, lyF.TaskDescription.Activity.copydefault)) {
                    channelBean.setGooglePaySupportedButNotSetup(z);
                } else {
                    if (!(taskDescription instanceof lyF.TaskDescription.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    channelBean = null;
                }
            }
            if (channelBean != null) {
                arrayList.add(channelBean);
            }
            tradeSuggestionBean = tradeSuggestionBean2;
            if (it.hasNext()) {
                ChannelBean channelBean2 = (ChannelBean) it.next();
                lyF lyf = c31659lzg.OLrzqt;
                this.L$0 = c31659lzg;
                this.L$1 = tradeSuggestionBean;
                this.L$2 = arrayList;
                this.L$3 = it;
                this.L$4 = channelBean2;
                this.I$0 = i;
                this.I$1 = i2;
                this.label = 2;
                objKWHzl = lyf.KWHzl(channelBean2, this);
                if (objKWHzl == objCopydefault2) {
                    return objCopydefault2;
                }
                tradeSuggestionBean2 = tradeSuggestionBean;
                channelBean = channelBean2;
                lyF.TaskDescription taskDescription2 = (lyF.TaskDescription) objKWHzl;
                if (!Intrinsics.EZpvd(taskDescription2, lyF.TaskDescription.C0873TaskDescription.KWHzl)) {
                }
                if (channelBean != null) {
                }
                tradeSuggestionBean = tradeSuggestionBean2;
                if (it.hasNext()) {
                    return new AbstractC43419rot.StateListAnimator(TradeSuggestionBean.copy$default(tradeSuggestionBean, i2 != 0 ? z : false, i != 0 ? z : false, null, null, (List) arrayList, null, 47, null));
                }
            }
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objCopydefault;
        C31659lzg c31659lzg2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            TradeSuggestionBean tradeSuggestionBean3 = (TradeSuggestionBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            lAA.KWHzl.AEQbTJ(C33129mqd.OLrzqt((CharSequence) tradeSuggestionBean3.getBaseCurrency().getDexInfoBean().getUniqueId()) ^ z, C31667lzo.AEQbTJ(tradeSuggestionBean3));
            List<ChannelBean> paymentChannels = tradeSuggestionBean3.getPaymentChannels();
            c31659lzg = c31659lzg2;
            arrayList = new ArrayList();
            i = 0;
            it = paymentChannels.iterator();
            tradeSuggestionBean = tradeSuggestionBean3;
            i2 = 0;
            if (it.hasNext()) {
            }
        } else {
            if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
