package com.okinc.buysell.ui.bsc;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.MutableLiveData;
import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.okinc.buysell.analytics.GrafanaProperty;
import com.okinc.buysell.ui.bsc.BaseBuySellViewModel;
import com.okinc.buysell.ui.bsc.util.InputType;
import com.okinc.crcore.shared.net.responsebean.B2CQuotePriceBean;
import com.okinc.crcore.shared.net.responsebean.DexQuoteBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31353lsS;
import o.C31657lze;
import o.C33129mqd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.lyT;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class BaseBuySellViewModel$getQuotedPrice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $baseCurrency;
    final /* synthetic */ String $input;
    final /* synthetic */ boolean $isInputChangedEvent;
    final /* synthetic */ String $quoteCurrency;
    final /* synthetic */ int $standard;
    final /* synthetic */ InputBaseViewModel $viewModel;
    int label;
    final /* synthetic */ BaseBuySellViewModel this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.SELL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.BUY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[InputType.values().length];
            try {
                iArr2[InputType.FIAT_INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InputType.CRYPTO_INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            KWHzl = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBuySellViewModel$getQuotedPrice$1(BaseBuySellViewModel baseBuySellViewModel, String str, InputBaseViewModel inputBaseViewModel, boolean z, String str2, String str3, int i, Continuation<? super BaseBuySellViewModel$getQuotedPrice$1> continuation) {
        super(2, continuation);
        this.this$0 = baseBuySellViewModel;
        this.$input = str;
        this.$viewModel = inputBaseViewModel;
        this.$isInputChangedEvent = z;
        this.$quoteCurrency = str2;
        this.$baseCurrency = str3;
        this.$standard = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseBuySellViewModel$getQuotedPrice$1(this.this$0, this.$input, this.$viewModel, this.$isInputChangedEvent, this.$quoteCurrency, this.$baseCurrency, this.$standard, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseBuySellViewModel$getQuotedPrice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0248  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        BaseBuySellViewModel$getQuotedPrice$1 baseBuySellViewModel$getQuotedPrice$1;
        Object objOLrzqt;
        PaymentMethod paymentMethod;
        Pair pairOLrzqt;
        Object objOLrzqt2;
        BaseBuySellViewModel$getQuotedPrice$1 baseBuySellViewModel$getQuotedPrice$12;
        AbstractC43419rot abstractC43419rot;
        AbstractC43419rot abstractC43419rot2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.this$0.hUfVAv()) {
                baseBuySellViewModel$getQuotedPrice$1 = this;
                C31657lze c31657lzeGHZMYf = baseBuySellViewModel$getQuotedPrice$1.this$0.gHZMYf();
                String str = baseBuySellViewModel$getQuotedPrice$1.$baseCurrency;
                String str2 = baseBuySellViewModel$getQuotedPrice$1.$quoteCurrency;
                String type = baseBuySellViewModel$getQuotedPrice$1.this$0.flVtFt().getType();
                String str3 = baseBuySellViewModel$getQuotedPrice$1.$input;
                int i2 = baseBuySellViewModel$getQuotedPrice$1.$standard;
                Channel channelAwvSrB = baseBuySellViewModel$getQuotedPrice$1.this$0.AwvSrB();
                String depositName = channelAwvSrB != null ? channelAwvSrB.getDepositName() : null;
                if (depositName == null) {
                    depositName = "";
                }
                Pair pair = (Pair) mHA.OLrzqt.AEQbTJ(baseBuySellViewModel$getQuotedPrice$1.this$0.sSMYrx());
                String payment = (pair == null || (paymentMethod = (PaymentMethod) pair.getSecond()) == null) ? null : paymentMethod.getPayment();
                String str4 = payment != null ? payment : "";
                baseBuySellViewModel$getQuotedPrice$1.label = 2;
                objOLrzqt = c31657lzeGHZMYf.OLrzqt(str, str2, type, str3, i2, depositName, str4, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                abstractC43419rot2 = (AbstractC43419rot) objOLrzqt;
                BaseBuySellViewModel baseBuySellViewModel = baseBuySellViewModel$getQuotedPrice$1.this$0;
                if (abstractC43419rot2 instanceof AbstractC43419rot.StateListAnimator) {
                }
                BaseBuySellViewModel baseBuySellViewModel2 = baseBuySellViewModel$getQuotedPrice$1.this$0;
                if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                }
            } else {
                if (C33129mqd.AEQbTJ(this.$input) == AudioStats.AUDIO_AMPLITUDE_NONE) {
                    int i3 = StateListAnimator.OLrzqt[this.this$0.flVtFt().ordinal()];
                    if (i3 == 1) {
                        this.$viewModel.gEmmrt("0");
                    } else if (i3 == 2) {
                        this.$viewModel.OLrzqt("0");
                    } else {
                        return Unit.INSTANCE;
                    }
                    mHA.OLrzqt.OLrzqt(this.this$0.fetchVPNInfo, new BaseBuySellViewModel.TaskDescription.Application(BaseBuySellViewModel.QuoteType.DEX, null, null, 4, null));
                    return Unit.INSTANCE;
                }
                if (!this.$isInputChangedEvent) {
                    return Unit.INSTANCE;
                }
                int i4 = StateListAnimator.KWHzl[this.$viewModel.KWHzl().ordinal()];
                if (i4 == 1) {
                    pairOLrzqt = C56390yDp.OLrzqt(this.$quoteCurrency, this.$baseCurrency);
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pairOLrzqt = C56390yDp.OLrzqt(this.$baseCurrency, this.$quoteCurrency);
                }
                String str5 = (String) pairOLrzqt.component1();
                String str6 = (String) pairOLrzqt.component2();
                this.this$0.gGvvIC().setValue(C56443yFo.KWHzl(true));
                lyT lyt = this.this$0.QfsBiF;
                Channel channelAwvSrB2 = this.this$0.AwvSrB();
                depositPlatformCode = channelAwvSrB2 != null ? channelAwvSrB2.getDepositPlatformCode() : null;
                String str7 = depositPlatformCode == null ? "" : depositPlatformCode;
                String type2 = this.this$0.flVtFt().getType();
                String str8 = this.$input;
                String tokenAddress = this.this$0.ORxRYg().getTokenAddress();
                int iAhwBna = C33129mqd.AhwBna(this.this$0.ORxRYg().getChainIndex());
                Integer numAEQbTJ = C56443yFo.AEQbTJ(C33129mqd.AhwBna(this.this$0.DTwDnp()));
                this.label = 1;
                objOLrzqt2 = lyt.OLrzqt(str7, type2, str6, str8, str5, tokenAddress, iAhwBna, (LivenessCoordinator.TARGET_HEIGHT & 128) != 0 ? null : null, (LivenessCoordinator.TARGET_HEIGHT & 256) != 0 ? false : false, (LivenessCoordinator.TARGET_HEIGHT & 512) != 0 ? null : null, (LivenessCoordinator.TARGET_HEIGHT & 1024) != 0 ? null : numAEQbTJ, this);
                if (objOLrzqt2 == objCopydefault) {
                    return objCopydefault;
                }
                baseBuySellViewModel$getQuotedPrice$12 = this;
                BaseBuySellViewModel baseBuySellViewModel3 = baseBuySellViewModel$getQuotedPrice$12.this$0;
                abstractC43419rot = (AbstractC43419rot) objOLrzqt2;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                }
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                }
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objOLrzqt2 = obj;
            baseBuySellViewModel$getQuotedPrice$12 = this;
            BaseBuySellViewModel baseBuySellViewModel32 = baseBuySellViewModel$getQuotedPrice$12.this$0;
            abstractC43419rot = (AbstractC43419rot) objOLrzqt2;
            if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                DexQuoteBean dexQuoteBean = (DexQuoteBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                baseBuySellViewModel32.djBIcL(dexQuoteBean.getReferenceDexQuoteId());
                mHA.OLrzqt.OLrzqt(baseBuySellViewModel32.fetchVPNInfo, new BaseBuySellViewModel.TaskDescription.Application(BaseBuySellViewModel.QuoteType.DEX, null, dexQuoteBean, 2, null));
            }
            if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                new C31353lsS().copydefault(GrafanaProperty.Page.DEX_GET_QUOTE_INPUT.getType()).EZpvd();
                mHA mha = mHA.OLrzqt;
                MutableLiveData mutableLiveData = baseBuySellViewModel32.fetchVPNInfo;
                BaseBuySellViewModel.QuoteType quoteType = BaseBuySellViewModel.QuoteType.DEX;
                String message = oKServerException.getMessage();
                if (message == null) {
                    message = "";
                }
                mha.OLrzqt(mutableLiveData, new BaseBuySellViewModel.TaskDescription.ActionBar(quoteType, message));
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
            baseBuySellViewModel$getQuotedPrice$1 = this;
            abstractC43419rot2 = (AbstractC43419rot) objOLrzqt;
            BaseBuySellViewModel baseBuySellViewModel4 = baseBuySellViewModel$getQuotedPrice$1.this$0;
            if (abstractC43419rot2 instanceof AbstractC43419rot.StateListAnimator) {
                List list = (List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot2).KWHzl();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((B2CQuotePriceBean) next).getBestOption()) {
                        depositPlatformCode = next;
                        break;
                    }
                }
                B2CQuotePriceBean b2CQuotePriceBean = (B2CQuotePriceBean) depositPlatformCode;
                if (b2CQuotePriceBean == null) {
                    b2CQuotePriceBean = (B2CQuotePriceBean) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
                }
                mHA.OLrzqt.OLrzqt(baseBuySellViewModel4.fetchVPNInfo, new BaseBuySellViewModel.TaskDescription.Application(BaseBuySellViewModel.QuoteType.REGULAR, b2CQuotePriceBean, null, 4, null));
            }
            BaseBuySellViewModel baseBuySellViewModel22 = baseBuySellViewModel$getQuotedPrice$1.this$0;
            if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                OKServerException oKServerException2 = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot2).KWHzl();
                mHA mha2 = mHA.OLrzqt;
                MutableLiveData mutableLiveData2 = baseBuySellViewModel22.fetchVPNInfo;
                BaseBuySellViewModel.QuoteType quoteType2 = BaseBuySellViewModel.QuoteType.REGULAR;
                String message2 = oKServerException2.getMessage();
                if (message2 == null) {
                    message2 = "Quote failed";
                }
                mha2.OLrzqt(mutableLiveData2, new BaseBuySellViewModel.TaskDescription.ActionBar(quoteType2, message2));
            }
        }
        return Unit.INSTANCE;
    }
}
