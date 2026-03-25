package com.okinc.buysell.ui.recurring.legacy;

import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanListRootBean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31654lzb;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC30270lSd;

/* JADX INFO: loaded from: classes7.dex */
public final class RecurringBuyPlanListLegacyViewModel$loadNextPlanPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RecurringBuyPlanListLegacyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyPlanListLegacyViewModel$loadNextPlanPage$1(RecurringBuyPlanListLegacyViewModel recurringBuyPlanListLegacyViewModel, Continuation<? super RecurringBuyPlanListLegacyViewModel$loadNextPlanPage$1> continuation) {
        super(2, continuation);
        this.this$0 = recurringBuyPlanListLegacyViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringBuyPlanListLegacyViewModel$loadNextPlanPage$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringBuyPlanListLegacyViewModel$loadNextPlanPage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C31654lzb c31654lzb = this.this$0.djBIcL;
            String str = this.this$0.AEQbTJ;
            String str2 = this.this$0.AhwBna;
            String str3 = this.this$0.DbNXlk;
            Integer numAEQbTJ = C56443yFo.AEQbTJ(this.this$0.valueOf);
            Integer numAEQbTJ2 = C56443yFo.AEQbTJ(20);
            this.label = 1;
            obj = c31654lzb.EZpvd(str, str2, str3, numAEQbTJ, numAEQbTJ2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            RecurringBuyPlanListRootBean recurringBuyPlanListRootBean = (RecurringBuyPlanListRootBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            this.this$0.valueOf = (int) recurringBuyPlanListRootBean.getNextPage();
            this.this$0.OLrzqt = recurringBuyPlanListRootBean.getHasNextPage() && (recurringBuyPlanListRootBean.getPlanList().isEmpty() ^ true);
            this.this$0.AYXKKw.addAll(this.this$0.gEmmrt.copydefault(recurringBuyPlanListRootBean.getPlanList()));
            if (this.this$0.AYXKKw.isEmpty()) {
                this.this$0.EZpvd.setValue(InterfaceC30270lSd.StateListAnimator.EZpvd);
            } else {
                this.this$0.EZpvd.setValue(new InterfaceC30270lSd.TaskDescription(this.this$0.AYXKKw, false));
            }
        } else if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            this.this$0.OLrzqt = false;
            if (this.this$0.valueOf == 1) {
                this.this$0.EZpvd.setValue(InterfaceC30270lSd.ActionBar.copydefault);
            } else {
                this.this$0.copydefault(false);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
