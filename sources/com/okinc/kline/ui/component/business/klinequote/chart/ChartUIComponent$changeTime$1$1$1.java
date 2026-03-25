package com.okinc.kline.ui.component.business.klinequote.chart;

import com.okinc.kline.data.KlineTimeAnchorType;
import com.okinc.kline.data.KlineTimeToolType;
import com.okinc.kline.library.template.TemplateSetting;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC39563puh;

/* JADX INFO: loaded from: classes8.dex */
public final class ChartUIComponent$changeTime$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $leftTime;
    final /* synthetic */ TemplateSetting $settings;
    int label;
    final /* synthetic */ ChartUIComponent this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartUIComponent$changeTime$1$1$1(ChartUIComponent chartUIComponent, long j, TemplateSetting templateSetting, Continuation<? super ChartUIComponent$changeTime$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = chartUIComponent;
        this.$leftTime = j;
        this.$settings = templateSetting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartUIComponent$changeTime$1$1$1(this.this$0, this.$leftTime, this.$settings, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChartUIComponent$changeTime$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = this.this$0.AYXKKw().uzCIH();
            if (stateListAnimatorUzCIH != null) {
                stateListAnimatorUzCIH.AEQbTJ();
            }
            ChartUIComponent chartUIComponent = this.this$0;
            this.label = 1;
            obj = chartUIComponent.EZpvd((Continuation<? super Long>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        long j = this.$leftTime;
        if (jLongValue <= j) {
            this.this$0.KWHzl(j, jLongValue, KlineTimeAnchorType.AnchorLeft, KlineTimeToolType.KLineTimeAnchor, false);
        } else {
            this.this$0.OLrzqt(this.$settings);
        }
        return Unit.INSTANCE;
    }
}
