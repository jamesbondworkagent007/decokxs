package com.okinc.planet.biz_positions;

import androidx.fragment.app.Fragment;
import com.okinc.planet.biz_positions.ProfilePositionsHistoryFragment$initView$1$4;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC46197tLk;
import o.C33070mpX;
import o.C33546myW;
import o.C46068tGq;
import o.C46095tHq;
import o.C46098tHt;
import o.C47501trL;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC46104tHz;
import o.rVN;
import o.tFJ;
import o.tNZ;
import o.tQX;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class ProfilePositionsHistoryFragment$initView$1$4 extends SuspendLambda implements Function2<AbstractC46197tLk<? extends tQX.TaskDescription<C46068tGq>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ tNZ $this_apply;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tFJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePositionsHistoryFragment$initView$1$4(tFJ tfj, tNZ tnz, Continuation<? super ProfilePositionsHistoryFragment$initView$1$4> continuation) {
        super(2, continuation);
        this.this$0 = tfj;
        this.$this_apply = tnz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfilePositionsHistoryFragment$initView$1$4 profilePositionsHistoryFragment$initView$1$4 = new ProfilePositionsHistoryFragment$initView$1$4(this.this$0, this.$this_apply, continuation);
        profilePositionsHistoryFragment$initView$1$4.L$0 = obj;
        return profilePositionsHistoryFragment$initView$1$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AbstractC46197tLk<? extends tQX.TaskDescription<C46068tGq>> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return invoke2((AbstractC46197tLk<tQX.TaskDescription<C46068tGq>>) abstractC46197tLk, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AbstractC46197tLk<tQX.TaskDescription<C46068tGq>> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return ((ProfilePositionsHistoryFragment$initView$1$4) create(abstractC46197tLk, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<InterfaceC46104tHz> listValueOf;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) this.L$0;
            if (abstractC46197tLk instanceof AbstractC46197tLk.Activity) {
                tFJ tfj = this.this$0;
                C33546myW c33546myW = this.$this_apply.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c33546myW, "");
                tfj.copydefault(c33546myW, false);
                this.$this_apply.AEQbTJ.djBIcL(false);
                this.$this_apply.AEQbTJ.AhwBna(false);
                this.this$0.AhwBna().submitList(yDY.AhwBna());
                C46098tHt c46098tHtAYXKKw = this.this$0.AYXKKw();
                Throwable thEZpvd = ((AbstractC46197tLk.Activity) abstractC46197tLk).EZpvd();
                final tFJ tfj2 = this.this$0;
                c46098tHtAYXKKw.submitList(new InterfaceC46104tHz.TaskDescription(null, 0.0f, new C46095tHq(null, null, null, null, false, new Function0() { // from class: o.tGa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ProfilePositionsHistoryFragment$initView$1$4.invokeSuspend$lambda$0(tfj2);
                    }
                }, 31, null), true, false, thEZpvd, false, 83, null).valueOf());
                if (!this.this$0.AYXKKw) {
                    this.this$0.AYXKKw = true;
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                }
            } else if (!(abstractC46197tLk instanceof AbstractC46197tLk.StateListAnimator)) {
                if (!(abstractC46197tLk instanceof AbstractC46197tLk.Application)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC46197tLk.Application application = (AbstractC46197tLk.Application) abstractC46197tLk;
                List listOLrzqt = ((tQX.TaskDescription) application.copydefault()).OLrzqt();
                boolean z = !listOLrzqt.isEmpty();
                tFJ tfj3 = this.this$0;
                C33546myW c33546myW2 = this.$this_apply.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c33546myW2, "");
                tfj3.copydefault(c33546myW2, z);
                this.$this_apply.AEQbTJ.djBIcL(true);
                this.$this_apply.AEQbTJ.AhwBna(((tQX.TaskDescription) application.copydefault()).copydefault());
                this.this$0.AhwBna().submitList(listOLrzqt);
                C46098tHt c46098tHtAYXKKw2 = this.this$0.AYXKKw();
                if (z) {
                    listValueOf = yDY.AhwBna();
                } else {
                    listValueOf = new InterfaceC46104tHz.StateListAnimator(null, null, 0.0f, null, C33070mpX.AYXKKw(C47501trL.Fragment.QOLQEE), true, false, 0, false, 463, null).valueOf();
                }
                c46098tHtAYXKKw2.submitList(listValueOf);
                if (!this.this$0.AYXKKw) {
                    this.this$0.AYXKKw = true;
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(tFJ tfj) {
        ProfilePositionsHistoryViewModel.loadData$default(tfj.gEmmrt(), false, 1, null);
        return Unit.INSTANCE;
    }
}
