package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import com.okinc.business.defi.biz.net.bean.SupportPnlChainResponse;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletPnlTokenListDetailViewModel$getWalletPnlSupportChainList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WalletPnlTokenListDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletPnlTokenListDetailViewModel$getWalletPnlSupportChainList$1(WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModel, Continuation<? super WalletPnlTokenListDetailViewModel$getWalletPnlSupportChainList$1> continuation) {
        super(2, continuation);
        this.this$0 = walletPnlTokenListDetailViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletPnlTokenListDetailViewModel$getWalletPnlSupportChainList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletPnlTokenListDetailViewModel$getWalletPnlSupportChainList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable th;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModel = this.this$0;
            Result.Application application2 = Result.Companion;
            Flow<List<SupportPnlChainResponse>> flowEZpvd = walletPnlTokenListDetailViewModel.djBIcL.EZpvd();
            StateListAnimator stateListAnimator = new StateListAnimator(walletPnlTokenListDetailViewModel);
            this.label = 1;
            if (flowEZpvd.collect(stateListAnimator, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) this.L$1;
                C56391yDq.AEQbTJ(obj);
                pUU.copydefault("WalletPnlTokenListDetailViewModel", "WalletPnlTokenListDetailViewModel getWalletAddressPnlTokenList error message = " + th.getMessage());
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            MutableSharedFlow mutableSharedFlow = walletPnlTokenListDetailViewModel2.AhwBna;
            List listAhwBna = yDY.AhwBna();
            this.L$0 = objM7377constructorimpl;
            this.L$1 = thM7380exceptionOrNullimpl;
            this.label = 2;
            if (mutableSharedFlow.emit(listAhwBna, this) == objCopydefault) {
                return objCopydefault;
            }
            th = thM7380exceptionOrNullimpl;
            pUU.copydefault("WalletPnlTokenListDetailViewModel", "WalletPnlTokenListDetailViewModel getWalletAddressPnlTokenList error message = " + th.getMessage());
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        public final /* synthetic */ WalletPnlTokenListDetailViewModel EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModel) {
            this.EZpvd = walletPnlTokenListDetailViewModel;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<SupportPnlChainResponse> list, Continuation<? super Unit> continuation) {
            Object objEmit = this.EZpvd.AhwBna.emit(list, continuation);
            return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
        }
    }
}
