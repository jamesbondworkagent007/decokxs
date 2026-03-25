package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailListSortType;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel.SpotAnalysisPnlDetailItemViewModel;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.jMM;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisPnlDetailItemFragment$initSortView$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKSortTextView.SortType $sortType;
    int label;
    final /* synthetic */ jMM this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKSortTextView.SortType.values().length];
            try {
                iArr[OKSortTextView.SortType.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OKSortTextView.SortType.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OKSortTextView.SortType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisPnlDetailItemFragment$initSortView$1$2$1$1(jMM jmm, OKSortTextView.SortType sortType, Continuation<? super SpotAnalysisPnlDetailItemFragment$initSortView$1$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = jmm;
        this.$sortType = sortType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisPnlDetailItemFragment$initSortView$1$2$1$1(this.this$0, this.$sortType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisPnlDetailItemFragment$initSortView$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        PnlDetailListSortType pnlDetailListSortType;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SpotAnalysisPnlDetailItemViewModel spotAnalysisPnlDetailItemViewModelGEmmrt = this.this$0.gEmmrt();
            int i2 = StateListAnimator.copydefault[this.$sortType.ordinal()];
            if (i2 == 1) {
                pnlDetailListSortType = PnlDetailListSortType.AMOUNT_ASC;
            } else if (i2 == 2) {
                pnlDetailListSortType = PnlDetailListSortType.AMOUNT_DESC;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                pnlDetailListSortType = PnlDetailListSortType.NONE;
            }
            this.label = 1;
            if (spotAnalysisPnlDetailItemViewModelGEmmrt.OLrzqt(pnlDetailListSortType, this) == objCopydefault) {
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
}
