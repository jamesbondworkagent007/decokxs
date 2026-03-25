package com.okinc.business.dexui.main.swap.trade.single.defiplatform;

import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.data.V6QuoteRequestWrapper;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C24694iif;
import o.C24695iig;
import o.C24994ioO;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC24993ioN;

/* JADX INFO: loaded from: classes6.dex */
public final class OneSwapV6DeFiPlatformSelectionViewModel$startDelayedPolling$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isUsingSmartAccount;
    final /* synthetic */ V6QuoteRequestWrapper $request;
    final /* synthetic */ String $sourceType;
    int label;
    final /* synthetic */ OneSwapV6DeFiPlatformSelectionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSwapV6DeFiPlatformSelectionViewModel$startDelayedPolling$1(OneSwapV6DeFiPlatformSelectionViewModel oneSwapV6DeFiPlatformSelectionViewModel, String str, boolean z, V6QuoteRequestWrapper v6QuoteRequestWrapper, Continuation<? super OneSwapV6DeFiPlatformSelectionViewModel$startDelayedPolling$1> continuation) {
        super(2, continuation);
        this.this$0 = oneSwapV6DeFiPlatformSelectionViewModel;
        this.$sourceType = str;
        this.$isUsingSmartAccount = z;
        this.$request = v6QuoteRequestWrapper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneSwapV6DeFiPlatformSelectionViewModel$startDelayedPolling$1(this.this$0, this.$sourceType, this.$isUsingSmartAccount, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OneSwapV6DeFiPlatformSelectionViewModel$startDelayedPolling$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.OLrzqt.setValue(InterfaceC24993ioN.Application.copydefault);
            C24994ioO c24994ioO = this.this$0.KWHzl;
            String str = this.$sourceType;
            boolean z = this.$isUsingSmartAccount;
            V6QuoteRequestWrapper v6QuoteRequestWrapper = this.$request;
            this.label = 1;
            objKWHzl = c24994ioO.KWHzl(str, z, v6QuoteRequestWrapper, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        OneSwapV6DeFiPlatformSelectionViewModel oneSwapV6DeFiPlatformSelectionViewModel = this.this$0;
        String str2 = this.$sourceType;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            V6BaseQuoteResponse v6BaseQuoteResponse = (V6BaseQuoteResponse) objKWHzl;
            if (!oneSwapV6DeFiPlatformSelectionViewModel.KWHzl.copydefault(v6BaseQuoteResponse).isEmpty()) {
                oneSwapV6DeFiPlatformSelectionViewModel.OLrzqt.setValue(new InterfaceC24993ioN.ActionBar(v6BaseQuoteResponse));
                return Unit.INSTANCE;
            }
            C24694iif c24694iifAEQbTJ = C24695iig.AEQbTJ(str2, true);
            if (!oneSwapV6DeFiPlatformSelectionViewModel.KWHzl.OLrzqt(v6BaseQuoteResponse, c24694iifAEQbTJ)) {
                oneSwapV6DeFiPlatformSelectionViewModel.OLrzqt.setValue(InterfaceC24993ioN.Activity.AEQbTJ);
            } else {
                oneSwapV6DeFiPlatformSelectionViewModel.OLrzqt.setValue(new InterfaceC24993ioN.StateListAnimator(c24694iifAEQbTJ.AEQbTJ()));
            }
        }
        String str3 = this.$sourceType;
        OneSwapV6DeFiPlatformSelectionViewModel oneSwapV6DeFiPlatformSelectionViewModel2 = this.this$0;
        V6QuoteRequestWrapper v6QuoteRequestWrapper2 = this.$request;
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
            C24694iif c24694iifAEQbTJ2 = C24695iig.AEQbTJ(str3, true);
            if (!oneSwapV6DeFiPlatformSelectionViewModel2.OLrzqt(str3, v6QuoteRequestWrapper2.copydefault())) {
                oneSwapV6DeFiPlatformSelectionViewModel2.OLrzqt.setValue(InterfaceC24993ioN.Activity.AEQbTJ);
            } else {
                oneSwapV6DeFiPlatformSelectionViewModel2.OLrzqt.setValue(new InterfaceC24993ioN.StateListAnimator(c24694iifAEQbTJ2.AEQbTJ()));
            }
        }
        return Unit.INSTANCE;
    }
}
