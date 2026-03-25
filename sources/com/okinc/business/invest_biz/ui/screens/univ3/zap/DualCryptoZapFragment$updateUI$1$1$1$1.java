package com.okinc.business.invest_biz.ui.screens.univ3.zap;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeViewModel;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.YieldState;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23747iHv;
import o.C27021jnN;
import o.C27024jnQ;
import o.C27037jnd;
import o.C27492jwH;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class DualCryptoZapFragment$updateUI$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $amountFirst;
    final /* synthetic */ String $amountSecond;
    final /* synthetic */ InvestTokenWithAmount $firstToken;
    final /* synthetic */ InvestTokenWithAmount $secondToken;
    final /* synthetic */ boolean $showAprLoading;
    final /* synthetic */ C23747iHv $this_apply;
    int label;
    final /* synthetic */ C27037jnd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DualCryptoZapFragment$updateUI$1$1$1$1(C27037jnd c27037jnd, String str, String str2, InvestTokenWithAmount investTokenWithAmount, InvestTokenWithAmount investTokenWithAmount2, boolean z, C23747iHv c23747iHv, Continuation<? super DualCryptoZapFragment$updateUI$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c27037jnd;
        this.$amountFirst = str;
        this.$amountSecond = str2;
        this.$firstToken = investTokenWithAmount;
        this.$secondToken = investTokenWithAmount2;
        this.$showAprLoading = z;
        this.$this_apply = c23747iHv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DualCryptoZapFragment$updateUI$1$1$1$1(this.this$0, this.$amountFirst, this.$amountSecond, this.$firstToken, this.$secondToken, this.$showAprLoading, this.$this_apply, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DualCryptoZapFragment$updateUI$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        String ratePercent$default;
        C27024jnQ c27024jnQ;
        String apr;
        List<InvestTokenWithAmount> investWithTokenList;
        Object next;
        Object next2;
        String coinAmount;
        List<InvestTokenWithAmount> investWithTokenList2;
        Object next3;
        Object next4;
        String coinAmount2;
        List<C27021jnN> listOLrzqt;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AhwBna = this.$amountFirst;
            this.this$0.djBIcL = this.$amountSecond;
            this.this$0.AYXKKw().EZpvd(this.$firstToken);
            this.this$0.AYXKKw().AYXKKw(this.$amountFirst);
            this.this$0.AYXKKw().AhwBna(this.$secondToken);
            this.this$0.AYXKKw().valueOf(this.$amountSecond);
            InvestUniv3SubscribeViewModel investUniv3SubscribeViewModelAYXKKw = this.this$0.AYXKKw();
            String str = this.$amountFirst;
            InvestTokenWithAmount investTokenWithAmount = this.$firstToken;
            String str2 = this.$amountSecond;
            InvestTokenWithAmount investTokenWithAmount2 = this.$secondToken;
            boolean z = this.$showAprLoading;
            this.label = 1;
            objCopydefault = investUniv3SubscribeViewModelAYXKKw.copydefault(false, str, investTokenWithAmount, str2, investTokenWithAmount2, z, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = (InvestUniv3SubscribeReceiveInfo) objCopydefault;
        if (investUniv3SubscribeReceiveInfo != null && (listOLrzqt = this.this$0.OLrzqt(investUniv3SubscribeReceiveInfo)) != null) {
            C23747iHv c23747iHv = this.$this_apply;
            c23747iHv.djBIcL.setCryptoItems(listOLrzqt);
            c23747iHv.djBIcL.setVisibility(listOLrzqt.isEmpty() ^ true ? 0 : 4);
        }
        String coinAmount3 = "0";
        if (investUniv3SubscribeReceiveInfo != null && (investWithTokenList2 = investUniv3SubscribeReceiveInfo.getInvestWithTokenList()) != null) {
            InvestTokenWithAmount investTokenWithAmount3 = this.$firstToken;
            Iterator<T> it = investWithTokenList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it.next();
                if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next3).getTokenAddress(), (Object) investTokenWithAmount3.getTokenAddress())) {
                    break;
                }
            }
            InvestTokenWithAmount investTokenWithAmount4 = (InvestTokenWithAmount) next3;
            if (investTokenWithAmount4 != null) {
                C27037jnd c27037jnd = this.this$0;
                String str3 = this.$amountFirst;
                C23747iHv c23747iHv2 = this.$this_apply;
                InvestTokenWithAmount investTokenWithAmount5 = this.$firstToken;
                Iterator<T> it2 = c27037jnd.valueOf().getInvestWithTokenList().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it2.next();
                    if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next4).getTokenAddress(), (Object) investTokenWithAmount5.getTokenAddress())) {
                        break;
                    }
                }
                InvestTokenWithAmount investTokenWithAmount6 = (InvestTokenWithAmount) next4;
                if (investTokenWithAmount6 == null || (coinAmount2 = investTokenWithAmount6.getCoinAmount()) == null) {
                    InvestTokenWithAmount investTokenWithAmount7 = c27037jnd.AEQbTJ;
                    coinAmount2 = investTokenWithAmount7 != null ? investTokenWithAmount7.getCoinAmount() : "0";
                }
                boolean zGEmmrt = C33129mqd.gEmmrt(coinAmount2, str3);
                c23747iHv2.EZpvd.OLrzqt(investTokenWithAmount4.getCurrencyAmount());
                c23747iHv2.EZpvd.OLrzqt(coinAmount2, zGEmmrt, c27037jnd.OLrzqt(investTokenWithAmount4.isBaseToken(), C33129mqd.subS$default(coinAmount2, str3, null, null, null, 14, null)));
            }
        }
        if (investUniv3SubscribeReceiveInfo != null && (investWithTokenList = investUniv3SubscribeReceiveInfo.getInvestWithTokenList()) != null) {
            InvestTokenWithAmount investTokenWithAmount8 = this.$secondToken;
            Iterator<T> it3 = investWithTokenList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next).getTokenAddress(), (Object) investTokenWithAmount8.getTokenAddress())) {
                    break;
                }
            }
            InvestTokenWithAmount investTokenWithAmount9 = (InvestTokenWithAmount) next;
            if (investTokenWithAmount9 != null) {
                C27037jnd c27037jnd2 = this.this$0;
                String str4 = this.$amountSecond;
                C23747iHv c23747iHv3 = this.$this_apply;
                InvestTokenWithAmount investTokenWithAmount10 = this.$secondToken;
                Iterator<T> it4 = c27037jnd2.valueOf().getInvestWithTokenList().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                    if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next2).getTokenAddress(), (Object) investTokenWithAmount10.getTokenAddress())) {
                        break;
                    }
                }
                InvestTokenWithAmount investTokenWithAmount11 = (InvestTokenWithAmount) next2;
                if (investTokenWithAmount11 == null || (coinAmount = investTokenWithAmount11.getCoinAmount()) == null) {
                    InvestTokenWithAmount investTokenWithAmount12 = c27037jnd2.copydefault;
                    if (investTokenWithAmount12 != null) {
                        coinAmount3 = investTokenWithAmount12.getCoinAmount();
                    }
                } else {
                    coinAmount3 = coinAmount;
                }
                boolean zGEmmrt2 = C33129mqd.gEmmrt(coinAmount3, str4);
                c23747iHv3.valueOf.OLrzqt(investTokenWithAmount9.getCurrencyAmount());
                c23747iHv3.valueOf.OLrzqt(coinAmount3, zGEmmrt2, c27037jnd2.OLrzqt(investTokenWithAmount9.isBaseToken(), C33129mqd.subS$default(coinAmount3, str4, null, null, null, 14, null)));
            }
        }
        MutableLiveData<String> mutableLiveDataGHZMYf = this.this$0.AYXKKw().gHZMYf();
        if (investUniv3SubscribeReceiveInfo == null || (apr = investUniv3SubscribeReceiveInfo.getApr()) == null || (ratePercent$default = C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, apr, false, 2, null)) == null) {
            ratePercent$default = "--";
        }
        mutableLiveDataGHZMYf.setValue(ratePercent$default);
        MutableLiveData<C27024jnQ> mutableLiveDataQKVWgx = this.this$0.AYXKKw().QKVWgx();
        if (investUniv3SubscribeReceiveInfo != null) {
            c27024jnQ = new C27024jnQ(investUniv3SubscribeReceiveInfo, YieldState.FILLED);
        } else {
            c27024jnQ = new C27024jnQ(null, null, 3, null);
        }
        mutableLiveDataQKVWgx.setValue(c27024jnQ);
        this.this$0.gEmmrt();
        return Unit.INSTANCE;
    }
}
