package com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui;

import android.widget.TextView;
import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.viewmodel.SpotAnalysisCumulativePnlViewModel;
import com.okinc.market.ext.UpDownColor;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C41426qqb;
import o.C42793rdC;
import o.C56391yDq;
import o.C56442yFn;
import o.jLZ;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisCumulativePnlFragment$updateCurrentDayPnl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currentDayPnlOriginValue;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ jLZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisCumulativePnlFragment$updateCurrentDayPnl$1(jLZ jlz, String str, Continuation<? super SpotAnalysisCumulativePnlFragment$updateCurrentDayPnl$1> continuation) {
        super(2, continuation);
        this.this$0 = jlz;
        this.$currentDayPnlOriginValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisCumulativePnlFragment$updateCurrentDayPnl$1(this.this$0, this.$currentDayPnlOriginValue, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisCumulativePnlFragment$updateCurrentDayPnl$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        jLZ jlz;
        String str;
        String str2;
        C42793rdC c42793rdC;
        TextView textView;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jLZ jlz2 = this.this$0;
            SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModelDbNXlk = jlz2.DbNXlk();
            this.label = 1;
            obj = jlz2.copydefault(spotAnalysisCumulativePnlViewModelDbNXlk, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$1;
                jlz = (jLZ) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str2 = (String) obj;
                c42793rdC = jlz.djBIcL;
                if (c42793rdC != null && (textView = c42793rdC.KWHzl) != null) {
                    C41426qqb.setText$default(textView, UpDownColor.Companion.AEQbTJ(str), (CharSequence) str2, 0, 0, 0, false, 60, (Object) null);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        jlz = this.this$0;
        String str3 = this.$currentDayPnlOriginValue;
        SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModelDbNXlk2 = jlz.DbNXlk();
        String str4 = str3 == null ? "--" : str3;
        this.L$0 = jlz;
        this.L$1 = str3;
        this.label = 2;
        obj = spotAnalysisCumulativePnlViewModelDbNXlk2.OLrzqt(str4, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        str = str3;
        str2 = (String) obj;
        c42793rdC = jlz.djBIcL;
        if (c42793rdC != null) {
            C41426qqb.setText$default(textView, UpDownColor.Companion.AEQbTJ(str), (CharSequence) str2, 0, 0, 0, false, 60, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
