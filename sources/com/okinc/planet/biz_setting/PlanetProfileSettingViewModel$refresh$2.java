package com.okinc.planet.biz_setting;

import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC46197tLk;
import o.C46126tIu;
import o.C56391yDq;
import o.C56442yFn;
import o.tHW;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetProfileSettingViewModel$refresh$2 extends SuspendLambda implements yHO<FlowCollector<? super AbstractC46197tLk<? extends C46126tIu>>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ tHW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetProfileSettingViewModel$refresh$2(tHW thw, Continuation<? super PlanetProfileSettingViewModel$refresh$2> continuation) {
        super(3, continuation);
        this.this$0 = thw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super AbstractC46197tLk<? extends C46126tIu>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super AbstractC46197tLk<C46126tIu>>) flowCollector, th, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super AbstractC46197tLk<C46126tIu>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        PlanetProfileSettingViewModel$refresh$2 planetProfileSettingViewModel$refresh$2 = new PlanetProfileSettingViewModel$refresh$2(this.this$0, continuation);
        planetProfileSettingViewModel$refresh$2.L$0 = flowCollector;
        planetProfileSettingViewModel$refresh$2.L$1 = th;
        return planetProfileSettingViewModel$refresh$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Throwable th;
        String message;
        FlowCollector flowCollector2;
        AbstractC46197tLk abstractC46197tLkOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            th = (Throwable) this.L$1;
            if ((th instanceof OKServerException) && (message = th.getMessage()) != null && !StringsKt__StringsKt.fARcdN((CharSequence) message)) {
                tHW thw = this.this$0;
                String message2 = th.getMessage();
                if (message2 == null) {
                    message2 = "";
                }
                tHW.ActionBar.StateListAnimator stateListAnimator = new tHW.ActionBar.StateListAnimator(message2);
                this.L$0 = flowCollector;
                this.L$1 = th;
                this.label = 1;
                if (thw.EZpvd(stateListAnimator, this) == objCopydefault) {
                    return objCopydefault;
                }
                flowCollector2 = flowCollector;
            }
            abstractC46197tLkOLrzqt = AbstractC46197tLk.Companion.OLrzqt(th);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (flowCollector.emit(abstractC46197tLkOLrzqt, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
        th = (Throwable) this.L$1;
        flowCollector2 = (FlowCollector) this.L$0;
        C56391yDq.AEQbTJ(obj);
        flowCollector = flowCollector2;
        abstractC46197tLkOLrzqt = AbstractC46197tLk.Companion.OLrzqt(th);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (flowCollector.emit(abstractC46197tLkOLrzqt, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
