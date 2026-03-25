package com.okinc.business.market.features.analysis.futures.root;

import android.widget.TextView;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25852jIt;
import o.C28005kLj;
import o.C42787rcx;
import o.C56391yDq;
import o.C56442yFn;
import o.jHT;

/* JADX INFO: loaded from: classes15.dex */
public final class FuturesAnalysisRootFragment$updateAccountFilterChip$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ jHT $accountVo;
    int label;
    final /* synthetic */ C25852jIt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisRootFragment$updateAccountFilterChip$1(C25852jIt c25852jIt, jHT jht, Continuation<? super FuturesAnalysisRootFragment$updateAccountFilterChip$1> continuation) {
        super(2, continuation);
        this.this$0 = c25852jIt;
        this.$accountVo = jht;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAnalysisRootFragment$updateAccountFilterChip$1(this.this$0, this.$accountVo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisRootFragment$updateAccountFilterChip$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C28005kLj c28005kLj;
        int i;
        C28005kLj c28005kLj2;
        TextView textViewCopydefault;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            FuturesAnalysisViewModel futuresAnalysisViewModelFARcdN = this.this$0.fARcdN();
            this.label = 1;
            obj = futuresAnalysisViewModelFARcdN.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) obj;
        C42787rcx c42787rcx = this.this$0.OLrzqt;
        if (c42787rcx != null && (c28005kLj = c42787rcx.copydefault) != null) {
            if (list.size() < 2) {
                i = 8;
            } else {
                C42787rcx c42787rcx2 = this.this$0.OLrzqt;
                if (c42787rcx2 != null && (c28005kLj2 = c42787rcx2.copydefault) != null && (textViewCopydefault = c28005kLj2.copydefault()) != null) {
                    textViewCopydefault.setText(this.$accountVo.KWHzl());
                }
                i = 0;
            }
            c28005kLj.setVisibility(i);
        }
        return Unit.INSTANCE;
    }
}
