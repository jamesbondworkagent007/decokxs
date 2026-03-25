package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel.SpotAnalysisPnlDetailItemViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25970jNc;
import o.C56391yDq;
import o.C56442yFn;
import o.jMM;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotAnalysisPnlDetailItemFragment$updateData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<PnlDetailVo.PnlListItem> $data;
    Object L$0;
    int label;
    final /* synthetic */ jMM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisPnlDetailItemFragment$updateData$1(jMM jmm, List<PnlDetailVo.PnlListItem> list, Continuation<? super SpotAnalysisPnlDetailItemFragment$updateData$1> continuation) {
        super(2, continuation);
        this.this$0 = jmm;
        this.$data = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisPnlDetailItemFragment$updateData$1(this.this$0, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisPnlDetailItemFragment$updateData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C25970jNc c25970jNc;
        SpotAnalysisPnlDetailItemViewModel spotAnalysisPnlDetailItemViewModelGEmmrt;
        List<PnlDetailVo.PnlListItem> list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jMM jmm = this.this$0;
            SpotAnalysisPnlDetailItemViewModel spotAnalysisPnlDetailItemViewModelGEmmrt2 = jmm.gEmmrt();
            this.label = 1;
            obj = jmm.copydefault(spotAnalysisPnlDetailItemViewModelGEmmrt2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                c25970jNc = (C25970jNc) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c25970jNc.EZpvd((List) obj);
                spotAnalysisPnlDetailItemViewModelGEmmrt = this.this$0.gEmmrt();
                list = this.$data;
                this.L$0 = null;
                this.label = 3;
                if (spotAnalysisPnlDetailItemViewModelGEmmrt.EZpvd(list, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        c25970jNc = (C25970jNc) obj;
        SpotAnalysisPnlDetailItemViewModel spotAnalysisPnlDetailItemViewModelGEmmrt3 = this.this$0.gEmmrt();
        List<PnlDetailVo.PnlListItem> list2 = this.$data;
        this.L$0 = c25970jNc;
        this.label = 2;
        obj = spotAnalysisPnlDetailItemViewModelGEmmrt3.AEQbTJ(list2, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        c25970jNc.EZpvd((List) obj);
        spotAnalysisPnlDetailItemViewModelGEmmrt = this.this$0.gEmmrt();
        list = this.$data;
        this.L$0 = null;
        this.label = 3;
        if (spotAnalysisPnlDetailItemViewModelGEmmrt.EZpvd(list, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
