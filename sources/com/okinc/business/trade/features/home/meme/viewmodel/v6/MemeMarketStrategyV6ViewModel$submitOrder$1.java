package com.okinc.business.trade.features.home.meme.viewmodel.v6;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.error.SignCancelException;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6OrderSubmitUseCase;
import com.okinc.business.trade.features.home.meme.viewmodel.v6.MemeMarketStrategyV6ViewModel$submitOrder$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC28108kPe;
import o.AbstractC28352kYf;
import o.C23274hvD;
import o.C28109kPf;
import o.C28110kPg;
import o.C30565ldZ;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9740bbL;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeMarketStrategyV6ViewModel$submitOrder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $forceManualSign;
    final /* synthetic */ FragmentActivity $fragmentActivity;
    final /* synthetic */ MemeV6OrderSubmitUseCase.OrderSubmitParams $params;
    final /* synthetic */ String $permit2SignedData;
    final /* synthetic */ boolean $silentSignWhenAvailable;
    int label;
    final /* synthetic */ AbstractC28352kYf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeMarketStrategyV6ViewModel$submitOrder$1(boolean z, AbstractC28352kYf abstractC28352kYf, MemeV6OrderSubmitUseCase.OrderSubmitParams orderSubmitParams, String str, FragmentActivity fragmentActivity, boolean z2, Continuation<? super MemeMarketStrategyV6ViewModel$submitOrder$1> continuation) {
        super(2, continuation);
        this.$forceManualSign = z;
        this.this$0 = abstractC28352kYf;
        this.$params = orderSubmitParams;
        this.$permit2SignedData = str;
        this.$fragmentActivity = fragmentActivity;
        this.$silentSignWhenAvailable = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeMarketStrategyV6ViewModel$submitOrder$1(this.$forceManualSign, this.this$0, this.$params, this.$permit2SignedData, this.$fragmentActivity, this.$silentSignWhenAvailable, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeMarketStrategyV6ViewModel$submitOrder$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        DexMultiTokenInfoBean fromToken;
        DexMultiTokenInfoBean fromToken2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("MemeMarketStrategyV6ViewModel", "submitOrder invoked, forceManualSign=" + this.$forceManualSign);
            MemeV6OrderSubmitUseCase memeV6OrderSubmitUseCaseFinit = this.this$0.finit();
            MemeV6OrderSubmitUseCase.OrderSubmitParams orderSubmitParams = this.$params;
            String str = this.$permit2SignedData;
            FragmentActivity fragmentActivity = this.$fragmentActivity;
            boolean z = this.$silentSignWhenAvailable;
            InterfaceC9740bbL.TaskDescription taskDescriptionDXXBbs = this.this$0.DXXBbs();
            this.label = 1;
            objEZpvd = memeV6OrderSubmitUseCaseFinit.EZpvd(orderSubmitParams, str, fragmentActivity, z, taskDescriptionDXXBbs, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        MemeV6OrderSubmitUseCase.OrderSubmitParams orderSubmitParams2 = this.$params;
        AbstractC28352kYf abstractC28352kYf = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            MemeV6OrderSubmitUseCase.ActionBar actionBar = (MemeV6OrderSubmitUseCase.ActionBar) objEZpvd;
            if (actionBar instanceof MemeV6OrderSubmitUseCase.ActionBar.TaskDescription) {
                pUU.KWHzl("MemeMarketStrategyV6ViewModel", "submitOrder success");
                C28110kPg c28110kPg = C28110kPg.KWHzl;
                CommonDexInfo commonDexInfo = orderSubmitParams2.getQuoteResponse().getCommonDexInfo();
                String chainId = (commonDexInfo == null || (fromToken2 = commonDexInfo.getFromToken()) == null) ? null : fromToken2.getChainId();
                String str2 = chainId == null ? "" : chainId;
                CommonDexInfo commonDexInfo2 = orderSubmitParams2.getQuoteResponse().getCommonDexInfo();
                String chainName = (commonDexInfo2 == null || (fromToken = commonDexInfo2.getFromToken()) == null) ? null : fromToken.getChainName();
                String str3 = chainName == null ? "" : chainName;
                DefiPlatformInfo selectedDeFiPlatform = orderSubmitParams2.getQuoteResponse().getSelectedDeFiPlatform();
                String quoteId = selectedDeFiPlatform != null ? selectedDeFiPlatform.getQuoteId() : null;
                MemeV6OrderSubmitUseCase.ActionBar.TaskDescription taskDescription = (MemeV6OrderSubmitUseCase.ActionBar.TaskDescription) actionBar;
                c28110kPg.copydefault(new AbstractC28108kPe.Activity(new C28109kPf(str2, str3, TabTitleInfo.KEY_MEME, "swap", quoteId == null ? "" : quoteId, abstractC28352kYf.fvQaOB().djBIcL()), taskDescription.AEQbTJ()));
                abstractC28352kYf.OLrzqt(taskDescription.KWHzl());
                abstractC28352kYf.QKudOq.EZpvd();
                if (orderSubmitParams2.getQuoteResponse().isOKXPlatform()) {
                    abstractC28352kYf.DGOPHZ();
                }
            } else if (actionBar instanceof MemeV6OrderSubmitUseCase.ActionBar.Activity) {
                abstractC28352kYf.QKudOq.EZpvd();
                MemeV6OrderSubmitUseCase.ActionBar.Activity activity = (MemeV6OrderSubmitUseCase.ActionBar.Activity) actionBar;
                abstractC28352kYf.EZpvd(activity.AEQbTJ(), activity.KWHzl());
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        final AbstractC28352kYf abstractC28352kYf2 = this.this$0;
        final FragmentActivity fragmentActivity2 = this.$fragmentActivity;
        final String str4 = this.$permit2SignedData;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl("MemeMarketStrategyV6ViewModel", "submitOrder failure, entering retry handler");
            abstractC28352kYf2.QKudOq.AEQbTJ(thM7380exceptionOrNullimpl, new Function1() { // from class: o.kYy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MemeMarketStrategyV6ViewModel$submitOrder$1.invokeSuspend$lambda$3$lambda$1(abstractC28352kYf2, fragmentActivity2, str4, ((java.lang.Boolean) obj2).booleanValue());
                }
            }, new Function1() { // from class: o.kYv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MemeMarketStrategyV6ViewModel$submitOrder$1.invokeSuspend$lambda$3$lambda$2(abstractC28352kYf2, (java.lang.Throwable) obj2);
                }
            }, "V6 RETRY -> JWT error, retrying submitOrder", "V6 RETRY -> Quota exceeded, retrying with manual sign");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$1(AbstractC28352kYf abstractC28352kYf, FragmentActivity fragmentActivity, String str, boolean z) {
        pUU.KWHzl("MemeMarketStrategyV6ViewModel", "submitOrder retryAction invoked, forceManualSign=" + z);
        abstractC28352kYf.AEQbTJ(fragmentActivity, str, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$2(AbstractC28352kYf abstractC28352kYf, Throwable th) {
        pUU.copydefault("MemeMarketStrategyV6ViewModel", "submitPlaceOrderV6 non-retryable code = " + C30565ldZ.EZpvd(th));
        if (!(th instanceof SignCancelException)) {
            String message = th.getMessage();
            String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating);
            if (message == null || message.length() == 0) {
                message = strAYXKKw;
            }
            abstractC28352kYf.EZpvd("", message);
        }
        return Unit.INSTANCE;
    }
}
