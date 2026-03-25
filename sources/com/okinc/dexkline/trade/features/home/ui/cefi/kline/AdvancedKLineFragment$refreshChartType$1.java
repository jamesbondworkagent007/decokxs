package com.okinc.dexkline.trade.features.home.ui.cefi.kline;

import android.widget.TextView;
import com.okinc.dexkline.trade.features.home.advanced.viewmodel.AdvancedKLineVM;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34695ngu;
import o.C34698ngx;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class AdvancedKLineFragment$refreshChartType$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C34698ngx $this_refreshChartType;
    int label;
    final /* synthetic */ C34695ngu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedKLineFragment$refreshChartType$1(C34695ngu c34695ngu, C34698ngx c34698ngx, Continuation<? super AdvancedKLineFragment$refreshChartType$1> continuation) {
        super(2, continuation);
        this.this$0 = c34695ngu;
        this.$this_refreshChartType = c34698ngx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedKLineFragment$refreshChartType$1(this.this$0, this.$this_refreshChartType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedKLineFragment$refreshChartType$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AdvancedKLineVM advancedKLineVMDjBIcL = this.this$0.djBIcL();
            this.label = 1;
            if (advancedKLineVMDjBIcL.EZpvd(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C34695ngu c34695ngu = this.this$0;
        c34695ngu.AhwBna = c34695ngu.djBIcL().AEQbTJ();
        TextView textViewAEQbTJ = this.$this_refreshChartType.AEQbTJ();
        if (textViewAEQbTJ != null) {
            C34695ngu c34695ngu2 = this.this$0;
            textViewAEQbTJ.setText(c34695ngu2.OLrzqt(c34695ngu2.AhwBna));
        }
        this.$this_refreshChartType.copydefault(this.this$0.AhwBna);
        this.this$0.gEmmrt();
        return Unit.INSTANCE;
    }
}
