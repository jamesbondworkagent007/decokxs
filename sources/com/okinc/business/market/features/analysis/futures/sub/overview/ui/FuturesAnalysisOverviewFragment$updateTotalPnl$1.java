package com.okinc.business.market.features.analysis.futures.sub.overview.ui;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import com.okinc.market.ext.UpDownColor;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C41426qqb;
import o.C42782rcs;
import o.C56391yDq;
import o.C56442yFn;
import o.jKQ;

/* JADX INFO: loaded from: classes15.dex */
public final class FuturesAnalysisOverviewFragment$updateTotalPnl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $totalPnlOriginValue;
    int label;
    final /* synthetic */ jKQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisOverviewFragment$updateTotalPnl$1(jKQ jkq, String str, Continuation<? super FuturesAnalysisOverviewFragment$updateTotalPnl$1> continuation) {
        super(2, continuation);
        this.this$0 = jkq;
        this.$totalPnlOriginValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAnalysisOverviewFragment$updateTotalPnl$1(this.this$0, this.$totalPnlOriginValue, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisOverviewFragment$updateTotalPnl$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AppCompatTextView appCompatTextView;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FuturesAnalysisViewModel futuresAnalysisViewModelGEmmrt = this.this$0.gEmmrt();
            String str = this.$totalPnlOriginValue;
            if (str == null) {
                str = "--";
            }
            this.label = 1;
            obj = futuresAnalysisViewModelGEmmrt.KWHzl(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        String str2 = (String) obj;
        C42782rcs c42782rcs = this.this$0.AEQbTJ;
        if (c42782rcs != null && (appCompatTextView = c42782rcs.QbewEr) != null) {
            C41426qqb.setText$default((TextView) appCompatTextView, UpDownColor.Companion.AEQbTJ(this.$totalPnlOriginValue), (CharSequence) str2, 0, 0, 0, false, 60, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
