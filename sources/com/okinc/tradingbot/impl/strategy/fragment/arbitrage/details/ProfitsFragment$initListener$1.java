package com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentManager;
import com.okinc.tradingbot.impl.dto.BillsArchive;
import com.okinc.tradingbot.impl.dto.InterestInfoResponse;
import com.okinc.tradingbot.impl.strategy.view.BorrowInterestBottomSheetUiModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C54012wwN;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.vNB;
import o.wPP;

/* JADX INFO: loaded from: classes17.dex */
public final class ProfitsFragment$initListener$1 extends SuspendLambda implements Function2<vNB<? extends Pair<? extends List<? extends BillsArchive>, ? extends InterestInfoResponse>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C54012wwN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfitsFragment$initListener$1(C54012wwN c54012wwN, Continuation<? super ProfitsFragment$initListener$1> continuation) {
        super(2, continuation);
        this.this$0 = c54012wwN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfitsFragment$initListener$1 profitsFragment$initListener$1 = new ProfitsFragment$initListener$1(this.this$0, continuation);
        profitsFragment$initListener$1.L$0 = obj;
        return profitsFragment$initListener$1;
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
        return ((ProfitsFragment$initListener$1) create(vnb, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            vNB vnb = (vNB) this.L$0;
            if (vnb instanceof vNB.StateListAnimator) {
                C55326xho.toast$default(((vNB.StateListAnimator) vnb).AEQbTJ().getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            } else {
                Pair pair = (Pair) vnb.KWHzl();
                if (pair != null) {
                    C54012wwN c54012wwN = this.this$0;
                    List list = (List) pair.component1();
                    InterestInfoResponse interestInfoResponse = (InterestInfoResponse) pair.component2();
                    wPP.ActionBar actionBar = wPP.Companion;
                    FragmentManager parentFragmentManager = c54012wwN.getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                    actionBar.copydefault(parentFragmentManager, new BorrowInterestBottomSheetUiModel(c54012wwN.AuCTel().getDebtCcy(), interestInfoResponse, list));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
