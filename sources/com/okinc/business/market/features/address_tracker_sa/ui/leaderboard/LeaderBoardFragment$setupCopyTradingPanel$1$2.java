package com.okinc.business.market.features.address_tracker_sa.ui.leaderboard;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C23274hvD;
import o.C25390ivn;
import o.C33069mpW;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.hEO;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardFragment$setupCopyTradingPanel$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ hEO $this_apply;
    int label;
    final /* synthetic */ LeaderBoardFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderBoardFragment$setupCopyTradingPanel$1$2(LeaderBoardFragment leaderBoardFragment, hEO heo, Continuation<? super LeaderBoardFragment$setupCopyTradingPanel$1$2> continuation) {
        super(2, continuation);
        this.this$0 = leaderBoardFragment;
        this.$this_apply = heo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LeaderBoardFragment$setupCopyTradingPanel$1$2(this.this$0, this.$this_apply, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LeaderBoardFragment$setupCopyTradingPanel$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LeaderBoardViewModel leaderBoardViewModelDjBIcL = this.this$0.djBIcL();
            this.label = 1;
            obj = leaderBoardViewModelDjBIcL.OLrzqt(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            LeaderBoardFragment leaderBoardFragment = this.this$0;
            StateFlow<Integer> stateFlowEZpvd = leaderBoardFragment.djBIcL().EZpvd();
            final hEO heo = this.$this_apply;
            final LeaderBoardFragment leaderBoardFragment2 = this.this$0;
            C25390ivn.collectOnViewLifecycle$default(leaderBoardFragment, stateFlowEZpvd, null, new FlowCollector() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.leaderboard.LeaderBoardFragment$setupCopyTradingPanel$1$2.5
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return copydefault(((Number) obj2).intValue(), continuation);
                }

                public final Object copydefault(int i2, Continuation<? super Unit> continuation) {
                    LinearLayout linearLayout = heo.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                    linearLayout.setVisibility(i2 > 0 ? 0 : 8);
                    AppCompatTextView appCompatTextView = heo.djBIcL;
                    Context contextRequireContext = leaderBoardFragment2.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    appCompatTextView.setText(C33069mpW.KWHzl(contextRequireContext, C23274hvD.Fragment.getText, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C56443yFo.AEQbTJ(i2)))));
                    return Unit.INSTANCE;
                }
            }, 2, null);
        } else {
            LinearLayout linearLayout = this.$this_apply.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
        }
        return Unit.INSTANCE;
    }
}
