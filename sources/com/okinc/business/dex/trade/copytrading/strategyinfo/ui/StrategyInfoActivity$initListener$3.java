package com.okinc.business.dex.trade.copytrading.strategyinfo.ui;

import android.app.Activity;
import com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C22281hcR;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.gWU;
import o.gXU;
import o.rVN;
import o.yDV;

/* JADX INFO: loaded from: classes18.dex */
public final class StrategyInfoActivity$initListener$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ gXU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyInfoActivity$initListener$3(gXU gxu, Continuation<? super StrategyInfoActivity$initListener$3> continuation) {
        super(2, continuation);
        this.this$0 = gxu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StrategyInfoActivity$initListener$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StrategyInfoActivity$initListener$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<gWU> sharedFlowEZpvd = this.this$0.AuCTel().EZpvd();
            final gXU gxu = this.this$0;
            FlowCollector<? super gWU> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyInfoActivity$initListener$3.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(gWU gwu, Continuation<? super Unit> continuation) {
                    if (gwu instanceof gWU.Application) {
                        rVN.reportFullyDrawn$default((Activity) gxu, false, (String) null, 2, (Object) null);
                        gxu.fIwbmz().OLrzqt.setEnableRefresh(false);
                        gxu.fIwbmz().EZpvd.EZpvd();
                        C22281hcR c22281hcR = gxu.fIwbmz().OLrzqt;
                        Intrinsics.checkNotNullExpressionValue(c22281hcR, "");
                        c22281hcR.setVisibility(8);
                        C55173xeu c55173xeu = gxu.fIwbmz().AhwBna;
                        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                        c55173xeu.setVisibility(0);
                        gxu.fIwbmz().copydefault.setSubDoVisible(8);
                        gxu.fIwbmz().copydefault.setSubDoImageVisible(8);
                        gxu.fIwbmz().OLrzqt.KWHzl();
                    } else if (!Intrinsics.EZpvd(gwu, gWU.TaskDescription.OLrzqt)) {
                        if (!(gwu instanceof gWU.Activity)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rVN.reportFullyDrawn$default((Activity) gxu, true, (String) null, 2, (Object) null);
                        gxu.fIwbmz().EZpvd.EZpvd();
                        C22281hcR c22281hcR2 = gxu.fIwbmz().OLrzqt;
                        Intrinsics.checkNotNullExpressionValue(c22281hcR2, "");
                        c22281hcR2.setVisibility(0);
                        C55173xeu c55173xeu2 = gxu.fIwbmz().AhwBna;
                        Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                        c55173xeu2.setVisibility(8);
                        gxu.fIwbmz().OLrzqt.setEnableRefresh(true);
                        gxu.fIwbmz().OLrzqt.KWHzl();
                        gWU.Activity activity = (gWU.Activity) gwu;
                        gxu.fIwbmz().copydefault.setTitle(activity.OLrzqt().getName());
                        if (yDV.valueOf(new StrategyStatus[]{StrategyStatus.Delete, StrategyStatus.Done, StrategyStatus.Expired}, activity.OLrzqt().getStrategyStatus())) {
                            gxu.fIwbmz().copydefault.setSubDoVisible(8);
                            gxu.fIwbmz().copydefault.setSubDoImageVisible(8);
                        } else {
                            gxu.fIwbmz().copydefault.setSubDoVisible(0);
                            gxu.fIwbmz().copydefault.setSubDoImageVisible(0);
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (sharedFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
