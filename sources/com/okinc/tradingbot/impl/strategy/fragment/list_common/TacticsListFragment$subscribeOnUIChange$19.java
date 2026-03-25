package com.okinc.tradingbot.impl.strategy.fragment.list_common;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentManager;
import com.okinc.tradingbot.impl.dto.BillsArchive;
import com.okinc.tradingbot.impl.dto.InterestInfoResponse;
import com.okinc.tradingbot.impl.strategy.view.BorrowInterestBottomSheetUiModel;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52324wHe;
import o.C55326xho;
import o.C55804xqp;
import o.C56391yDq;
import o.C56442yFn;
import o.vNB;
import o.wPP;

/* JADX INFO: loaded from: classes11.dex */
public final class TacticsListFragment$subscribeOnUIChange$19 extends SuspendLambda implements Function2<vNB<? extends Pair<? extends List<? extends BillsArchive>, ? extends InterestInfoResponse>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C52324wHe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TacticsListFragment$subscribeOnUIChange$19(C52324wHe c52324wHe, Continuation<? super TacticsListFragment$subscribeOnUIChange$19> continuation) {
        super(2, continuation);
        this.this$0 = c52324wHe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TacticsListFragment$subscribeOnUIChange$19 tacticsListFragment$subscribeOnUIChange$19 = new TacticsListFragment$subscribeOnUIChange$19(this.this$0, continuation);
        tacticsListFragment$subscribeOnUIChange$19.L$0 = obj;
        return tacticsListFragment$subscribeOnUIChange$19;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vNB<? extends Pair<? extends List<? extends BillsArchive>, ? extends InterestInfoResponse>> vnb, Continuation<? super Unit> continuation) {
        return invoke2((vNB<? extends Pair<? extends List<BillsArchive>, InterestInfoResponse>>) vnb, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vNB<? extends Pair<? extends List<BillsArchive>, InterestInfoResponse>> vnb, Continuation<? super Unit> continuation) {
        return ((TacticsListFragment$subscribeOnUIChange$19) create(vnb, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        StrategyDetailsResponse strategyDetailsResponseCopydefault;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            vNB vnb = (vNB) this.L$0;
            if (vnb instanceof vNB.StateListAnimator) {
                C55326xho.toast$default(((vNB.StateListAnimator) vnb).AEQbTJ().getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            } else {
                Pair pair = (Pair) vnb.KWHzl();
                if (pair != null) {
                    C52324wHe c52324wHe = this.this$0;
                    List list = (List) pair.component1();
                    InterestInfoResponse interestInfoResponse = (InterestInfoResponse) pair.component2();
                    wPP.ActionBar actionBar = wPP.Companion;
                    FragmentManager parentFragmentManager = c52324wHe.getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                    C55804xqp<StrategyDetailsResponse> value = C52324wHe.values(c52324wHe).zuBGHE().getValue();
                    String debtCcy = (value == null || (strategyDetailsResponseCopydefault = value.copydefault()) == null) ? null : strategyDetailsResponseCopydefault.getDebtCcy();
                    actionBar.copydefault(parentFragmentManager, new BorrowInterestBottomSheetUiModel(debtCcy != null ? debtCcy : "", interestInfoResponse, list));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
