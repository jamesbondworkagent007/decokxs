package com.okinc.business.market.features.analysis.spot.root.ui;

import android.widget.TextView;
import com.okinc.business.market.features.analysis.spot.root.ui.viewmodel.SpotAnalysisViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42839rdw;
import o.C25939jLz;
import o.C28005kLj;
import o.C56391yDq;
import o.C56442yFn;
import o.jHT;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisFragment$updateAccountFilterChip$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ jHT $accountVo;
    int label;
    final /* synthetic */ C25939jLz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisFragment$updateAccountFilterChip$1(C25939jLz c25939jLz, jHT jht, Continuation<? super SpotAnalysisFragment$updateAccountFilterChip$1> continuation) {
        super(2, continuation);
        this.this$0 = c25939jLz;
        this.$accountVo = jht;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisFragment$updateAccountFilterChip$1(this.this$0, this.$accountVo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisFragment$updateAccountFilterChip$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            SpotAnalysisViewModel spotAnalysisViewModelDjBIcL = this.this$0.djBIcL();
            this.label = 1;
            obj = spotAnalysisViewModelDjBIcL.KWHzl(this);
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
        AbstractC42839rdw abstractC42839rdw = this.this$0.gEmmrt;
        if (abstractC42839rdw != null && (c28005kLj = abstractC42839rdw.AEQbTJ) != null) {
            if (list.size() < 2) {
                i = 8;
            } else {
                AbstractC42839rdw abstractC42839rdw2 = this.this$0.gEmmrt;
                if (abstractC42839rdw2 != null && (c28005kLj2 = abstractC42839rdw2.AEQbTJ) != null && (textViewCopydefault = c28005kLj2.copydefault()) != null) {
                    textViewCopydefault.setText(this.$accountVo.KWHzl());
                }
                i = 0;
            }
            c28005kLj.setVisibility(i);
        }
        return Unit.INSTANCE;
    }
}
