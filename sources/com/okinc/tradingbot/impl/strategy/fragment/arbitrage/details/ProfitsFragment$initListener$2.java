package com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details;

import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.okinc.tradingbot.impl.dto.FundingFeeIncomeResponse;
import com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.ArbRewardsBottomSheet;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C33064mpR;
import o.C54012wwN;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.uSJ;
import o.vNB;

/* JADX INFO: loaded from: classes19.dex */
public final class ProfitsFragment$initListener$2 extends SuspendLambda implements Function2<vNB<? extends List<? extends FundingFeeIncomeResponse>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C54012wwN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfitsFragment$initListener$2(C54012wwN c54012wwN, Continuation<? super ProfitsFragment$initListener$2> continuation) {
        super(2, continuation);
        this.this$0 = c54012wwN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfitsFragment$initListener$2 profitsFragment$initListener$2 = new ProfitsFragment$initListener$2(this.this$0, continuation);
        profitsFragment$initListener$2.L$0 = obj;
        return profitsFragment$initListener$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vNB<? extends List<? extends FundingFeeIncomeResponse>> vnb, Continuation<? super Unit> continuation) {
        return invoke2((vNB<? extends List<FundingFeeIncomeResponse>>) vnb, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vNB<? extends List<FundingFeeIncomeResponse>> vnb, Continuation<? super Unit> continuation) {
        return ((ProfitsFragment$initListener$2) create(vnb, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            vNB vnb = (vNB) this.L$0;
            if (vnb instanceof vNB.TaskDescription) {
                List list = (List) ((vNB.TaskDescription) vnb).AEQbTJ();
                C33064mpR.OLrzqt(this.this$0.djBIcL(), (List<? extends Object>) CollectionsKt___CollectionsKt.AhwBna((Iterable) list, 3));
                uSJ usj = this.this$0.gEmmrt;
                if (usj != null) {
                    C54012wwN c54012wwN = this.this$0;
                    TextView textView = usj.AEQbTJ;
                    Intrinsics.copydefault(textView);
                    textView.setVisibility(list.size() <= 3 ? 8 : 0);
                    textView.setOnClickListener(new StateListAnimator(textView, 1000L, c54012wwN, usj, list));
                }
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            } else if (vnb instanceof vNB.StateListAnimator) {
                rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ List EZpvd;
        public final /* synthetic */ C54012wwN KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ uSJ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, C54012wwN c54012wwN, uSJ usj, List list) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c54012wwN;
            this.copydefault = usj;
            this.EZpvd = list;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ArbRewardsBottomSheet.TaskDescription taskDescription = ArbRewardsBottomSheet.Companion;
                FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                CharSequence text = this.copydefault.isConnected.getText();
                Intrinsics.checkNotNullExpressionValue(text, "");
                int currentTextColor = this.copydefault.isConnected.getCurrentTextColor();
                CharSequence text2 = this.copydefault.DbNXlk.getText();
                Intrinsics.checkNotNullExpressionValue(text2, "");
                CharSequence text3 = this.copydefault.values.getText();
                Intrinsics.checkNotNullExpressionValue(text3, "");
                int currentTextColor2 = this.copydefault.values.getCurrentTextColor();
                ProfitDetailResponse arbitrageProfit = this.KWHzl.AuCTel().getArbitrageProfit();
                String ccy = arbitrageProfit != null ? arbitrageProfit.getCcy() : null;
                taskDescription.OLrzqt(childFragmentManager, new ArbRewardsBottomSheet.ArbRewardsBottomSheetUiModel(text, currentTextColor, text2, text3, currentTextColor2, ccy == null ? "" : ccy, this.EZpvd));
            }
        }
    }
}
