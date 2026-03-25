package com.okinc.buysell.ui.recurring.legacy;

import com.okinc.buysell.ui.recurring.RecurringBuyPlanStatus;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanUpdateBean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31655lzc;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC30225lQm;
import o.InterfaceC30234lQv;
import o.lQE;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class RecurringBuyPlanDetailLegacyViewModel$onPlanEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $editedAmount;
    final /* synthetic */ String $editedFrequency;
    final /* synthetic */ InterfaceC30225lQm $event;
    int label;
    final /* synthetic */ RecurringBuyPlanDetailLegacyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyPlanDetailLegacyViewModel$onPlanEvent$1(String str, String str2, RecurringBuyPlanDetailLegacyViewModel recurringBuyPlanDetailLegacyViewModel, InterfaceC30225lQm interfaceC30225lQm, Continuation<? super RecurringBuyPlanDetailLegacyViewModel$onPlanEvent$1> continuation) {
        super(2, continuation);
        this.$editedAmount = str;
        this.$editedFrequency = str2;
        this.this$0 = recurringBuyPlanDetailLegacyViewModel;
        this.$event = interfaceC30225lQm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringBuyPlanDetailLegacyViewModel$onPlanEvent$1(this.$editedAmount, this.$editedFrequency, this.this$0, this.$event, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringBuyPlanDetailLegacyViewModel$onPlanEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String value;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$editedAmount == null && this.$editedFrequency == null) {
                mHA.OLrzqt.OLrzqt(this.this$0.AYXKKw, InterfaceC30234lQv.Application.AEQbTJ);
            }
            C31655lzc c31655lzc = this.this$0.fIwbmz;
            String strCopydefault = this.this$0.copydefault();
            InterfaceC30225lQm interfaceC30225lQm = this.$event;
            if (Intrinsics.EZpvd(interfaceC30225lQm, InterfaceC30225lQm.ActionBar.AEQbTJ)) {
                value = RecurringBuyPlanStatus.CANCELED.getValue();
            } else if (Intrinsics.EZpvd(interfaceC30225lQm, InterfaceC30225lQm.TaskDescription.AEQbTJ)) {
                value = RecurringBuyPlanStatus.PAUSED.getValue();
            } else {
                if (!Intrinsics.EZpvd(interfaceC30225lQm, InterfaceC30225lQm.Application.EZpvd)) {
                    throw new NoWhenBranchMatchedException();
                }
                value = RecurringBuyPlanStatus.ACTIVE.getValue();
            }
            String str = value;
            String str2 = this.$editedAmount;
            String str3 = this.$editedFrequency;
            this.label = 1;
            obj = c31655lzc.EZpvd(strCopydefault, str, str2, str3, this);
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
            this.this$0.gEmmrt = RecurringBuyPlanStatus.Companion.KWHzl(((RecurringBuyPlanUpdateBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getStatus());
            if (Intrinsics.EZpvd(this.$event, InterfaceC30225lQm.ActionBar.AEQbTJ)) {
                mHA.OLrzqt.OLrzqt(this.this$0.EZpvd, Unit.INSTANCE);
            } else {
                RecurringBuyPlanDetailLegacyViewModel recurringBuyPlanDetailLegacyViewModel = this.this$0;
                recurringBuyPlanDetailLegacyViewModel.copydefault(recurringBuyPlanDetailLegacyViewModel.copydefault());
                InterfaceC30225lQm interfaceC30225lQm2 = this.$event;
                if (Intrinsics.EZpvd(interfaceC30225lQm2, InterfaceC30225lQm.TaskDescription.AEQbTJ)) {
                    mHA.OLrzqt.OLrzqt(this.this$0.KWHzl, Unit.INSTANCE);
                } else if (Intrinsics.EZpvd(interfaceC30225lQm2, InterfaceC30225lQm.Application.EZpvd)) {
                    mHA.OLrzqt.OLrzqt(this.this$0.AEQbTJ, Unit.INSTANCE);
                }
                if (this.$editedAmount != null || this.$editedFrequency != null) {
                    mHA.OLrzqt.OLrzqt(this.this$0.copydefault, this.$event);
                }
            }
            this.this$0.OLrzqt(this.$event);
        } else if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            lQE lqe = this.this$0.valueOf;
            if (lqe == null) {
                mHA.OLrzqt.OLrzqt(this.this$0.AYXKKw, InterfaceC30234lQv.Activity.AEQbTJ);
            } else {
                mHA.OLrzqt.OLrzqt(this.this$0.AYXKKw, new InterfaceC30234lQv.ActionBar(lqe));
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
