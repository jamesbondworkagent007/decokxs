package com.okinc.planet.biz_performance.chart;

import androidx.fragment.app.Fragment;
import com.okinc.planet.biz_performance.data.ChartProfileDataResp;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC46197tLk;
import o.C33070mpX;
import o.C45920tBd;
import o.C46277tOj;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.tWE;
import o.yDY;

/* JADX INFO: loaded from: classes16.dex */
public final class ProfileChartFragment$initView$1$2 extends SuspendLambda implements Function2<AbstractC46197tLk<? extends List<? extends ChartProfileDataResp>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ C46277tOj $this_requireBinding;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C45920tBd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileChartFragment$initView$1$2(C45920tBd c45920tBd, C46277tOj c46277tOj, Continuation<? super ProfileChartFragment$initView$1$2> continuation) {
        super(2, continuation);
        this.this$0 = c45920tBd;
        this.$this_requireBinding = c46277tOj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfileChartFragment$initView$1$2 profileChartFragment$initView$1$2 = new ProfileChartFragment$initView$1$2(this.this$0, this.$this_requireBinding, continuation);
        profileChartFragment$initView$1$2.L$0 = obj;
        return profileChartFragment$initView$1$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AbstractC46197tLk<? extends List<? extends ChartProfileDataResp>> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return invoke2((AbstractC46197tLk<? extends List<ChartProfileDataResp>>) abstractC46197tLk, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AbstractC46197tLk<? extends List<ChartProfileDataResp>> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return ((ProfileChartFragment$initView$1$2) create(abstractC46197tLk, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) this.L$0;
            if (abstractC46197tLk instanceof AbstractC46197tLk.Application) {
                C45920tBd c45920tBd = this.this$0;
                tWE twe = this.$this_requireBinding.EZpvd;
                Intrinsics.checkNotNullExpressionValue(twe, "");
                c45920tBd.AEQbTJ(twe, (List<ChartProfileDataResp>) ((AbstractC46197tLk.Application) abstractC46197tLk).copydefault());
                if (!this.this$0.valueOf) {
                    this.this$0.valueOf = true;
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                }
            } else if (abstractC46197tLk instanceof AbstractC46197tLk.StateListAnimator) {
                List listAhwBna = (List) ((AbstractC46197tLk.StateListAnimator) abstractC46197tLk).copydefault();
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                if (listAhwBna.isEmpty()) {
                    this.$this_requireBinding.KWHzl.setText("--");
                    this.$this_requireBinding.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                }
            } else {
                if (!(abstractC46197tLk instanceof AbstractC46197tLk.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                List listAhwBna2 = (List) ((AbstractC46197tLk.Activity) abstractC46197tLk).copydefault();
                if (listAhwBna2 == null) {
                    listAhwBna2 = yDY.AhwBna();
                }
                if (listAhwBna2.isEmpty()) {
                    this.$this_requireBinding.KWHzl.setText("--");
                    this.$this_requireBinding.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                }
                if (!this.this$0.valueOf) {
                    this.this$0.valueOf = true;
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
