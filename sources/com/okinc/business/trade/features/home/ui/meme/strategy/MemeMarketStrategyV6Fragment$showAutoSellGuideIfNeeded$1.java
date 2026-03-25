package com.okinc.business.trade.features.home.ui.meme.strategy;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$showAutoSellGuideIfNeeded$1;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.C30567ldb;
import o.C31139loQ;
import o.C52812wZg;
import o.C55298xhM;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeMarketStrategyV6Fragment$showAutoSellGuideIfNeeded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MemeMarketStrategyV6Fragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeMarketStrategyV6Fragment$showAutoSellGuideIfNeeded$1(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, Continuation<? super MemeMarketStrategyV6Fragment$showAutoSellGuideIfNeeded$1> continuation) {
        super(2, continuation);
        this.this$0 = memeMarketStrategyV6Fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeMarketStrategyV6Fragment$showAutoSellGuideIfNeeded$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeMarketStrategyV6Fragment$showAutoSellGuideIfNeeded$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (SPUtils.getBoolean("key_auto_sell_quick_buy_guide_shown", false, "dex_trading_local_config")) {
                return Unit.INSTANCE;
            }
            if (this.this$0.isAdded() && this.this$0.isVisible() && !this.this$0.isDetached()) {
                C31139loQ c31139loQ = this.this$0.AhwBna;
                MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment = this.this$0;
                C30567ldb c30567ldbAubY = memeMarketStrategyV6Fragment.AubY();
                LinearLayout linearLayoutOLrzqt = c30567ldbAubY != null ? c30567ldbAubY.OLrzqt() : null;
                Intrinsics.copydefault(linearLayoutOLrzqt, "");
                final MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment2 = this.this$0;
                c31139loQ.EZpvd(memeMarketStrategyV6Fragment, linearLayoutOLrzqt, new Function0() { // from class: o.loh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return MemeMarketStrategyV6Fragment$showAutoSellGuideIfNeeded$1.invokeSuspend$lambda$5(memeMarketStrategyV6Fragment2);
                    }
                });
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        LinearLayout linearLayoutOLrzqt;
        FragmentActivity fragmentActivityRequireActivity = memeMarketStrategyV6Fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        final C52812wZg c52812wZg = new C52812wZg(fragmentActivityRequireActivity);
        C30567ldb c30567ldbAubY = memeMarketStrategyV6Fragment.AubY();
        if (c30567ldbAubY != null && (linearLayoutOLrzqt = c30567ldbAubY.OLrzqt()) != null) {
            C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(linearLayoutOLrzqt);
            stateListAnimator.copydefault(C55298xhM.dpInt$default(12.0f, (Context) null, 1, (Object) null));
            stateListAnimator.AEQbTJ(C55298xhM.dpInt$default(12.0f, (Context) null, 1, (Object) null));
            stateListAnimator.KWHzl(C55298xhM.dpInt$default(12.0f, (Context) null, 1, (Object) null));
            stateListAnimator.OLrzqt(C55298xhM.dpInt$default(12.0f, (Context) null, 1, (Object) null));
            stateListAnimator.AEQbTJ(C55298xhM.dp$default(12.0f, (Context) null, 1, (Object) null));
            stateListAnimator.EZpvd(1);
            stateListAnimator.AEQbTJ(memeMarketStrategyV6Fragment.getString(C23274hvD.Fragment.onError));
            stateListAnimator.OLrzqt(memeMarketStrategyV6Fragment.getString(C23274hvD.Fragment.onResult));
            Unit unit = Unit.INSTANCE;
            c52812wZg.EZpvd(yDY.AhwBna(stateListAnimator));
            c52812wZg.OLrzqt(3);
            TextView textViewValues = c52812wZg.values();
            if (textViewValues != null) {
                textViewValues.setVisibility(8);
            }
            c52812wZg.KWHzl(false);
            c52812wZg.AEQbTJ(new Function0() { // from class: o.loa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MemeMarketStrategyV6Fragment$showAutoSellGuideIfNeeded$1.invokeSuspend$lambda$5$lambda$4$lambda$3$lambda$1(c52812wZg);
                }
            });
            c52812wZg.KWHzl(new Function0() { // from class: o.lod
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MemeMarketStrategyV6Fragment$showAutoSellGuideIfNeeded$1.invokeSuspend$lambda$5$lambda$4$lambda$3$lambda$2();
                }
            });
            c52812wZg.fARcdN();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5$lambda$4$lambda$3$lambda$1(C52812wZg c52812wZg) {
        c52812wZg.KWHzl();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5$lambda$4$lambda$3$lambda$2() {
        SPUtils.put("key_auto_sell_quick_buy_guide_shown", Boolean.TRUE, "dex_trading_local_config");
        return Unit.INSTANCE;
    }
}
