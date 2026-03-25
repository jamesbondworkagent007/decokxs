package com.okinc.im.imui.group.create.viewmodel;

import com.okinc.im.imui.group.create.viewmodel.SelectMembershipFeeViewModel;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import com.okinc.okimcore.model.remote.SupportedCurrencies;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.yHS;

/* JADX INFO: loaded from: classes8.dex */
public final class SelectMembershipFeeViewModel$validateFormFlow$1 extends SuspendLambda implements yHS<Double, GroupBillingType, Boolean, SupportedCurrencies, Continuation<? super SelectMembershipFeeViewModel.Application.C0417Application>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ SelectMembershipFeeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectMembershipFeeViewModel$validateFormFlow$1(SelectMembershipFeeViewModel selectMembershipFeeViewModel, Continuation<? super SelectMembershipFeeViewModel$validateFormFlow$1> continuation) {
        super(5, continuation);
        this.this$0 = selectMembershipFeeViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(Double d, GroupBillingType groupBillingType, boolean z, SupportedCurrencies supportedCurrencies, Continuation<? super SelectMembershipFeeViewModel.Application.C0417Application> continuation) {
        SelectMembershipFeeViewModel$validateFormFlow$1 selectMembershipFeeViewModel$validateFormFlow$1 = new SelectMembershipFeeViewModel$validateFormFlow$1(this.this$0, continuation);
        selectMembershipFeeViewModel$validateFormFlow$1.L$0 = d;
        selectMembershipFeeViewModel$validateFormFlow$1.L$1 = groupBillingType;
        selectMembershipFeeViewModel$validateFormFlow$1.Z$0 = z;
        selectMembershipFeeViewModel$validateFormFlow$1.L$2 = supportedCurrencies;
        return selectMembershipFeeViewModel$validateFormFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHS
    public /* synthetic */ Object invoke(Double d, GroupBillingType groupBillingType, Boolean bool, SupportedCurrencies supportedCurrencies, Continuation<? super SelectMembershipFeeViewModel.Application.C0417Application> continuation) {
        return invoke(d, groupBillingType, bool.booleanValue(), supportedCurrencies, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return this.this$0.AEQbTJ((Double) this.L$0, (GroupBillingType) this.L$1, this.Z$0, (SupportedCurrencies) this.L$2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
