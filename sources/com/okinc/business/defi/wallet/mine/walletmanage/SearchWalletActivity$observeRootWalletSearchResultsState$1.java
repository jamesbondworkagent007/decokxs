package com.okinc.business.defi.wallet.mine.walletmanage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.okinc.business.defi.wallet.mine.walletmanage.viewmodel.SearchWalletViewModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C16423eje;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.Point;
import o.fDL;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class SearchWalletActivity$observeRootWalletSearchResultsState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SearchWalletActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchWalletActivity$observeRootWalletSearchResultsState$1(SearchWalletActivity searchWalletActivity, Continuation<? super SearchWalletActivity$observeRootWalletSearchResultsState$1> continuation) {
        super(2, continuation);
        this.this$0 = searchWalletActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchWalletActivity$observeRootWalletSearchResultsState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchWalletActivity$observeRootWalletSearchResultsState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Point<SearchWalletViewModel.Application>> stateFlowEZpvd = this.this$0.AYXKKw().EZpvd();
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

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.walletmanage.SearchWalletActivity$observeRootWalletSearchResultsState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Point<? extends SearchWalletViewModel.Application>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SearchWalletActivity this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchWalletActivity searchWalletActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = searchWalletActivity;
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
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            C16423eje c16423eje = null;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Point point = (Point) this.L$0;
                if (point == null) {
                    return Unit.INSTANCE;
                }
                if (point instanceof Point.StateListAnimator) {
                    C16423eje c16423eje2 = this.this$0.AYXKKw;
                    if (c16423eje2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c16423eje = c16423eje2;
                    }
                    c16423eje.OLrzqt.KWHzl(0L);
                } else if (point instanceof Point.Application) {
                    C16423eje c16423eje3 = this.this$0.AYXKKw;
                    if (c16423eje3 == null) {
                        Intrinsics.gEmmrt("");
                        c16423eje3 = null;
                    }
                    c16423eje3.OLrzqt.copydefault();
                    CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                    SearchWalletActivity$observeRootWalletSearchResultsState$1$1$viewHolderData$1 searchWalletActivity$observeRootWalletSearchResultsState$1$1$viewHolderData$1 = new SearchWalletActivity$observeRootWalletSearchResultsState$1$1$viewHolderData$1(this.this$0, point, null);
                    this.label = 1;
                    obj = BuildersKt.withContext(coroutineDispatcher, searchWalletActivity$observeRootWalletSearchResultsState$1$1$viewHolderData$1, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (point instanceof Point.TaskDescription) {
                    C16423eje c16423eje4 = this.this$0.AYXKKw;
                    if (c16423eje4 == null) {
                        Intrinsics.gEmmrt("");
                        c16423eje4 = null;
                    }
                    c16423eje4.OLrzqt.copydefault();
                    String strEZpvd = ((Point.TaskDescription) point).EZpvd();
                    if (strEZpvd != null) {
                        C55326xho.toast$default(strEZpvd, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    }
                    rVN.reportFullyDrawn$default((Activity) this.this$0, false, (String) null, 2, (Object) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            List<? extends fDL<Object>> list = (List) obj;
            if (list != null) {
                this.this$0.OLrzqt().copydefault(list);
            }
            rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
    }
}
