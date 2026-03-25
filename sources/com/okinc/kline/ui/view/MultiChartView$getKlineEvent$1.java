package com.okinc.kline.ui.view;

import com.okinc.kline.data.KLineEventBean;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.ui.component.business.klinequote.viemodel.KlineQuoteViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C36250oUv;
import o.C37771pAb;
import o.C56391yDq;
import o.C56404yEc;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC39563puh;
import o.pAR;
import o.pED;

/* JADX INFO: loaded from: classes9.dex */
public final class MultiChartView$getKlineEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $after;
    int label;
    final /* synthetic */ C37771pAb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiChartView$getKlineEvent$1(C37771pAb c37771pAb, String str, Continuation<? super MultiChartView$getKlineEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = c37771pAb;
        this.$after = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiChartView$getKlineEvent$1(this.this$0, this.$after, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MultiChartView$getKlineEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList<KLineEventBean> arrayList;
        InterfaceC39563puh.StateListAnimator stateListAnimatorDjBIcL;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pAR par = this.this$0.flVtFt;
            if (par != null && (stateListAnimatorDjBIcL = par.djBIcL()) != null) {
                pED ped = pED.KWHzl;
                String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.KWHzl(ped.AEQbTJ(1)));
                String str = this.$after;
                String strEZpvd = ped.EZpvd();
                this.label = 1;
                obj = stateListAnimatorDjBIcL.KWHzl(strGEmmrt, str, strEZpvd, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                arrayList = null;
                if (arrayList != null) {
                    C37771pAb c37771pAb = this.this$0;
                    C56404yEc.zsXlph(arrayList);
                    C36250oUv c36250oUv = c37771pAb.uzCIH;
                    if (c36250oUv != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
                        chartViewOutSideConfigAkhnZx.setKlineEventList(arrayList);
                    }
                    ((KlineQuoteViewModel) c37771pAb.DTwDnp().getValue()).OLrzqt(arrayList);
                    C36250oUv c36250oUv2 = c37771pAb.uzCIH;
                    if (c36250oUv2 != null) {
                        c36250oUv2.invalidate();
                    }
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        arrayList = (ArrayList) obj;
        if (arrayList != null) {
        }
        return Unit.INSTANCE;
    }
}
