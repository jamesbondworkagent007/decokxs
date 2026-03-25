package com.okinc.im.imui.group.create;

import com.okinc.im.imui.group.create.viewmodel.SelectMembershipFeeViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33925nKy;
import o.C34109nRt;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class SelectMembershipFeeFragment$observeViewModel$2 extends SuspendLambda implements yHO<CoroutineScope, SelectMembershipFeeViewModel.Application, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34109nRt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectMembershipFeeFragment$observeViewModel$2(C34109nRt c34109nRt, Continuation<? super SelectMembershipFeeFragment$observeViewModel$2> continuation) {
        super(3, continuation);
        this.this$0 = c34109nRt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, SelectMembershipFeeViewModel.Application application, Continuation<? super Unit> continuation) {
        SelectMembershipFeeFragment$observeViewModel$2 selectMembershipFeeFragment$observeViewModel$2 = new SelectMembershipFeeFragment$observeViewModel$2(this.this$0, continuation);
        selectMembershipFeeFragment$observeViewModel$2.L$0 = application;
        return selectMembershipFeeFragment$observeViewModel$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            SelectMembershipFeeViewModel.Application application = (SelectMembershipFeeViewModel.Application) this.L$0;
            if (application instanceof SelectMembershipFeeViewModel.Application.C0417Application) {
                C33925nKy c33925nKy = this.this$0.AYXKKw;
                if (c33925nKy == null) {
                    Intrinsics.gEmmrt("");
                    c33925nKy = null;
                }
                C34109nRt c34109nRt = this.this$0;
                SelectMembershipFeeViewModel.Application.C0417Application c0417Application = (SelectMembershipFeeViewModel.Application.C0417Application) application;
                c33925nKy.AEQbTJ.setError(!c0417Application.OLrzqt());
                c33925nKy.gEmmrt.setTextColor(c0417Application.OLrzqt() ? c34109nRt.djBIcL() : c34109nRt.valueOf());
                c33925nKy.KWHzl.setEnabled(c0417Application.EZpvd());
                return Unit.INSTANCE;
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
