package com.okinc.business.market.features.watch_list_groups.ui.manage;

import androidx.activity.result.ActivityResultCaller;
import androidx.core.view.KeyEventDispatcher;
import com.okinc.business.market.features.watch_list_groups.ui.models.TokenGroupSelectionParams;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.kCQ;
import o.kCW;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenGroupSelectionBottomSheet$setupViews$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ kCW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenGroupSelectionBottomSheet$setupViews$1$1$1(kCW kcw, Continuation<? super TokenGroupSelectionBottomSheet$setupViews$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = kcw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenGroupSelectionBottomSheet$setupViews$1$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenGroupSelectionBottomSheet$setupViews$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            TokenGroupSelectionParams tokenGroupSelectionParamsOLrzqt = this.this$0.OLrzqt();
            if (tokenGroupSelectionParamsOLrzqt != null) {
                kCW kcw = this.this$0;
                Pair<List<Integer>, List<Integer>> pairAhwBna = kcw.AYXKKw().AhwBna();
                ActivityResultCaller parentFragment = kcw.getParentFragment();
                kCQ kcq = parentFragment instanceof kCQ ? (kCQ) parentFragment : null;
                if (kcq == null) {
                    KeyEventDispatcher.Component activity = kcw.getActivity();
                    kCQ kcq2 = activity instanceof kCQ ? (kCQ) activity : null;
                    if (kcq2 == null) {
                        return Unit.INSTANCE;
                    }
                    kcq = kcq2;
                }
                kcq.AEQbTJ(tokenGroupSelectionParamsOLrzqt.OLrzqt(), pairAhwBna);
                kcw.dismissAllowingStateLoss();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
