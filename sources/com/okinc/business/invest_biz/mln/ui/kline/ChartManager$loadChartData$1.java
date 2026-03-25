package com.okinc.business.invest_biz.mln.ui.kline;

import com.okinc.business.invest_biz.data.contants.ChartInterval;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C27398juT;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23938iOx;
import o.InterfaceC23939iOy;
import o.iOB;

/* JADX INFO: loaded from: classes6.dex */
public final class ChartManager$loadChartData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC23938iOx $currentConfig;
    final /* synthetic */ ChartInterval $interval;
    int label;
    final /* synthetic */ iOB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartManager$loadChartData$1(iOB iob, InterfaceC23938iOx interfaceC23938iOx, ChartInterval chartInterval, Continuation<? super ChartManager$loadChartData$1> continuation) {
        super(2, continuation);
        this.this$0 = iob;
        this.$currentConfig = interfaceC23938iOx;
        this.$interval = chartInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartManager$loadChartData$1(this.this$0, this.$currentConfig, this.$interval, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChartManager$loadChartData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[Catch: Exception -> 0x0071, TRY_LEAVE, TryCatch #0 {Exception -> 0x0071, blocks: (B:5:0x000d, B:15:0x0061, B:18:0x0067, B:10:0x001e, B:12:0x0054), top: B:23:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C27398juT c27398juT;
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception unused) {
            MutableStateFlow mutableStateFlow = this.this$0.copydefault;
            C27398juT c27398juT2 = (C27398juT) this.this$0.copydefault.getValue();
            mutableStateFlow.setValue(c27398juT2.copydefault((5119 & 1) != 0 ? c27398juT2.copydefault : null, (5119 & 2) != 0 ? c27398juT2.AEQbTJ : null, (5119 & 4) != 0 ? c27398juT2.AhwBna : false, (5119 & 8) != 0 ? c27398juT2.KWHzl : null, (5119 & 16) != 0 ? c27398juT2.EZpvd : null, (5119 & 32) != 0 ? c27398juT2.AYXKKw : null, (5119 & 64) != 0 ? c27398juT2.gEmmrt : 0, (5119 & 128) != 0 ? c27398juT2.djBIcL : null, (5119 & 256) != 0 ? c27398juT2.isConnected : 0, (5119 & 512) != 0 ? c27398juT2.fetchVPNInfo : 0, (5119 & 1024) != 0 ? c27398juT2.valueOf : false, (5119 & 2048) != 0 ? c27398juT2.OLrzqt : true, (5119 & 4096) != 0 ? c27398juT2.AkhnZx : null));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow2 = this.this$0.copydefault;
            C27398juT c27398juT3 = (C27398juT) this.this$0.copydefault.getValue();
            mutableStateFlow2.setValue(c27398juT3.copydefault((5119 & 1) != 0 ? c27398juT3.copydefault : null, (5119 & 2) != 0 ? c27398juT3.AEQbTJ : null, (5119 & 4) != 0 ? c27398juT3.AhwBna : false, (5119 & 8) != 0 ? c27398juT3.KWHzl : null, (5119 & 16) != 0 ? c27398juT3.EZpvd : null, (5119 & 32) != 0 ? c27398juT3.AYXKKw : null, (5119 & 64) != 0 ? c27398juT3.gEmmrt : 0, (5119 & 128) != 0 ? c27398juT3.djBIcL : null, (5119 & 256) != 0 ? c27398juT3.isConnected : 0, (5119 & 512) != 0 ? c27398juT3.fetchVPNInfo : 0, (5119 & 1024) != 0 ? c27398juT3.valueOf : true, (5119 & 2048) != 0 ? c27398juT3.OLrzqt : false, (5119 & 4096) != 0 ? c27398juT3.AkhnZx : null));
            InterfaceC23939iOy interfaceC23939iOy = this.this$0.KWHzl;
            if (interfaceC23939iOy == null) {
                c27398juT = null;
                if (c27398juT != null) {
                    this.this$0.copydefault.setValue(c27398juT);
                }
                return Unit.INSTANCE;
            }
            InterfaceC23938iOx interfaceC23938iOx = this.$currentConfig;
            ChartInterval chartInterval = this.$interval;
            this.label = 1;
            objKWHzl = interfaceC23939iOy.KWHzl(interfaceC23938iOx, chartInterval, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        c27398juT = (C27398juT) objKWHzl;
        if (c27398juT != null) {
        }
        return Unit.INSTANCE;
    }
}
