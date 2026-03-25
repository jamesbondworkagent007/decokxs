package com.okinc.okex.common.ui.util;

import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes10.dex */
public final class ViewsKt$afterLayoutStableHeight$heightFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super Integer>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $interval;
    final /* synthetic */ int $maxChecks;
    final /* synthetic */ int $stabilityThreshold;
    final /* synthetic */ View $this_afterLayoutStableHeight;
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewsKt$afterLayoutStableHeight$heightFlow$1(int i, long j, View view, int i2, Continuation<? super ViewsKt$afterLayoutStableHeight$heightFlow$1> continuation) {
        super(2, continuation);
        this.$maxChecks = i;
        this.$interval = j;
        this.$this_afterLayoutStableHeight = view;
        this.$stabilityThreshold = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ViewsKt$afterLayoutStableHeight$heightFlow$1 viewsKt$afterLayoutStableHeight$heightFlow$1 = new ViewsKt$afterLayoutStableHeight$heightFlow$1(this.$maxChecks, this.$interval, this.$this_afterLayoutStableHeight, this.$stabilityThreshold, continuation);
        viewsKt$afterLayoutStableHeight$heightFlow$1.L$0 = obj;
        return viewsKt$afterLayoutStableHeight$heightFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Integer> flowCollector, Continuation<? super Unit> continuation) {
        return ((ViewsKt$afterLayoutStableHeight$heightFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Path cross not found for [B:20:0x005c, B:28:0x0075], limit reached: 35 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0051 -> B:18:0x0054). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        int i;
        int i2;
        int i3;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = this.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            i = 0;
            i2 = 0;
            i3 = 0;
            if (i < this.$maxChecks) {
            }
        } else {
            if (i4 != 1) {
                if (i4 == 2) {
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            i = this.I$2;
            i2 = this.I$1;
            i3 = this.I$0;
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
            int height = this.$this_afterLayoutStableHeight.getHeight();
            if (height == i2 || height <= 0) {
                i3 = 0;
            } else {
                i3++;
                if (i3 >= this.$stabilityThreshold) {
                    Integer numAEQbTJ = C56443yFo.AEQbTJ(height);
                    this.L$0 = null;
                    this.label = 2;
                    if (flowCollector.emit(numAEQbTJ, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
            }
            i++;
            i2 = height;
            if (i < this.$maxChecks) {
                long j = this.$interval;
                this.L$0 = flowCollector;
                this.I$0 = i3;
                this.I$1 = i2;
                this.I$2 = i;
                this.label = 1;
                if (DelayKt.delay(j, this) == objCopydefault) {
                    return objCopydefault;
                }
                int height2 = this.$this_afterLayoutStableHeight.getHeight();
                if (height2 == i2) {
                }
                i3 = 0;
                i++;
                i2 = height2;
                if (i < this.$maxChecks) {
                    Integer numAEQbTJ2 = C56443yFo.AEQbTJ(i2);
                    this.L$0 = null;
                    this.label = 3;
                    if (flowCollector.emit(numAEQbTJ2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
