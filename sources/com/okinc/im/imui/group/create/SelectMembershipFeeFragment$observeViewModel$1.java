package com.okinc.im.imui.group.create;

import com.okinc.im.imui.group.create.viewmodel.SelectMembershipFeeViewModel;
import com.okinc.okimcore.model.remote.SupportedCurrencies;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C34109nRt;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class SelectMembershipFeeFragment$observeViewModel$1 extends SuspendLambda implements yHO<CoroutineScope, SelectMembershipFeeViewModel.ActionBar, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34109nRt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectMembershipFeeFragment$observeViewModel$1(C34109nRt c34109nRt, Continuation<? super SelectMembershipFeeFragment$observeViewModel$1> continuation) {
        super(3, continuation);
        this.this$0 = c34109nRt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, SelectMembershipFeeViewModel.ActionBar actionBar, Continuation<? super Unit> continuation) {
        SelectMembershipFeeFragment$observeViewModel$1 selectMembershipFeeFragment$observeViewModel$1 = new SelectMembershipFeeFragment$observeViewModel$1(this.this$0, continuation);
        selectMembershipFeeFragment$observeViewModel$1.L$0 = actionBar;
        return selectMembershipFeeFragment$observeViewModel$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            SelectMembershipFeeViewModel.ActionBar actionBar = (SelectMembershipFeeViewModel.ActionBar) this.L$0;
            if (actionBar instanceof SelectMembershipFeeViewModel.ActionBar.Application) {
                SelectMembershipFeeViewModel.ActionBar.Application application = (SelectMembershipFeeViewModel.ActionBar.Application) actionBar;
                if (!application.copydefault().isEmpty()) {
                    this.this$0.OLrzqt((SupportedCurrencies) CollectionsKt___CollectionsKt.AuCTelauCTel(application.copydefault()));
                }
            } else {
                if (!(actionBar instanceof SelectMembershipFeeViewModel.ActionBar.TaskDescription)) {
                    throw new NoWhenBranchMatchedException();
                }
                C55326xho.toastWithFailedIcon$default(((SelectMembershipFeeViewModel.ActionBar.TaskDescription) actionBar).KWHzl(), 0, 1, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
