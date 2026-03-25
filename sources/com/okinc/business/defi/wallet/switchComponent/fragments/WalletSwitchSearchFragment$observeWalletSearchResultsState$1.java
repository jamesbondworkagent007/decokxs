package com.okinc.business.defi.wallet.switchComponent.fragments;

import androidx.fragment.app.Fragment;
import com.okinc.business.defi.wallet.mine.walletmanage.viewmodel.SearchWalletViewModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C17760fRg;
import o.C56391yDq;
import o.C56442yFn;
import o.Point;
import o.fDL;
import o.fDM;
import o.fRB;
import o.pUU;
import o.rVN;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSwitchSearchFragment$observeWalletSearchResultsState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C17760fRg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSwitchSearchFragment$observeWalletSearchResultsState$1(C17760fRg c17760fRg, Continuation<? super WalletSwitchSearchFragment$observeWalletSearchResultsState$1> continuation) {
        super(2, continuation);
        this.this$0 = c17760fRg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSwitchSearchFragment$observeWalletSearchResultsState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSwitchSearchFragment$observeWalletSearchResultsState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Point<SearchWalletViewModel.Application>> stateFlowEZpvd = this.this$0.AEQbTJ().EZpvd();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowEZpvd, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.switchComponent.fragments.WalletSwitchSearchFragment$observeWalletSearchResultsState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Point<? extends SearchWalletViewModel.Application>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C17760fRg this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C17760fRg c17760fRg, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c17760fRg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Point<? extends SearchWalletViewModel.Application> point, Continuation<? super Unit> continuation) {
            return invoke2((Point<SearchWalletViewModel.Application>) point, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Point<SearchWalletViewModel.Application> point, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(point, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            fDM fdm;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Point point = (Point) this.L$0;
                if (this.this$0.getContext() == null) {
                    return Unit.INSTANCE;
                }
                if (point == null) {
                    return Unit.INSTANCE;
                }
                if (point instanceof Point.StateListAnimator) {
                    this.this$0.EZpvd(true);
                } else if (point instanceof Point.Application) {
                    this.this$0.EZpvd(false);
                    fRB frb = this.this$0.KWHzl;
                    List<fDL<Object>> listEZpvd = frb != null ? frb.EZpvd((SearchWalletViewModel.Application) ((Point.Application) point).copydefault(), this.this$0.AEQbTJ().copydefault()) : null;
                    if (listEZpvd != null && (fdm = this.this$0.OLrzqt) != null) {
                        fdm.copydefault(listEZpvd);
                    }
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                } else if (point instanceof Point.TaskDescription) {
                    this.this$0.EZpvd(false);
                    pUU.copydefault(this.this$0.getTAG(), "Error while fetching wallets : " + ((Point.TaskDescription) point).EZpvd());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
