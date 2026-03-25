package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import com.okinc.business.defi.biz.net.bean.SupportPnlChainResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletPnlDataViewModel$getWalletPnlSupportChainList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ WalletPnlDataViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletPnlDataViewModel$getWalletPnlSupportChainList$1(WalletPnlDataViewModel walletPnlDataViewModel, Continuation<? super WalletPnlDataViewModel$getWalletPnlSupportChainList$1> continuation) {
        super(2, continuation);
        this.this$0 = walletPnlDataViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletPnlDataViewModel$getWalletPnlSupportChainList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletPnlDataViewModel$getWalletPnlSupportChainList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            WalletPnlDataViewModel walletPnlDataViewModel = this.this$0;
            Result.Application application2 = Result.Companion;
            Flow<List<SupportPnlChainResponse>> flowEZpvd = walletPnlDataViewModel.gEmmrt.EZpvd();
            StateListAnimator stateListAnimator = new StateListAnimator(walletPnlDataViewModel);
            this.label = 1;
            if (flowEZpvd.collect(stateListAnimator, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        WalletPnlDataViewModel walletPnlDataViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            MutableStateFlow mutableStateFlow = walletPnlDataViewModel2.AEQbTJ;
            List listAhwBna = yDY.AhwBna();
            this.L$0 = objM7377constructorimpl;
            this.label = 2;
            if (mutableStateFlow.emit(listAhwBna, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        public final /* synthetic */ WalletPnlDataViewModel KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(WalletPnlDataViewModel walletPnlDataViewModel) {
            this.KWHzl = walletPnlDataViewModel;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<SupportPnlChainResponse> list, Continuation<? super Unit> continuation) {
            MutableStateFlow mutableStateFlow = this.KWHzl.AEQbTJ;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Long chainId = ((SupportPnlChainResponse) it.next()).getChainId();
                Intrinsics.copydefault(chainId);
                arrayList.add(C56443yFo.KWHzl(chainId.longValue()));
            }
            Object objEmit = mutableStateFlow.emit(arrayList, continuation);
            return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
        }
    }
}
