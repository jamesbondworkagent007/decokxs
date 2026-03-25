package com.okinc.business.defi.wallet.tee.review.ui;

import androidx.compose.material3.TooltipKt;
import com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$6$1$11$1;
import com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel;
import com.okinc.business.dex.api.bean.OrderListParams;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.AbstractC14702dqT;
import o.C17877fVp;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC54939xaY;
import o.fVU;
import o.gKO;

/* JADX INFO: loaded from: classes18.dex */
public final class ReNewEnableActivity$observeViewModelState$6$1$11$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReNewEnableViewModel.ActionBar $dialog;
    final /* synthetic */ AbstractC14702dqT $this_apply;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ fVU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReNewEnableActivity$observeViewModelState$6$1$11$1(AbstractC14702dqT abstractC14702dqT, fVU fvu, ReNewEnableViewModel.ActionBar actionBar, Continuation<? super ReNewEnableActivity$observeViewModelState$6$1$11$1> continuation) {
        super(2, continuation);
        this.$this_apply = abstractC14702dqT;
        this.this$0 = fvu;
        this.$dialog = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReNewEnableActivity$observeViewModelState$6$1$11$1(this.$this_apply, this.this$0, this.$dialog, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReNewEnableActivity$observeViewModelState$6$1$11$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final fVU fvu;
        AbstractC14702dqT abstractC14702dqT;
        ReNewEnableViewModel.ActionBar actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC14702dqT abstractC14702dqT2 = this.$this_apply;
                fvu = this.this$0;
                ReNewEnableViewModel.ActionBar actionBar2 = this.$dialog;
                Result.Application application = Result.Companion;
                this.L$0 = abstractC14702dqT2;
                this.L$1 = fvu;
                this.L$2 = actionBar2;
                this.label = 1;
                if (DelayKt.delay(TooltipKt.TooltipDuration, this) == objCopydefault) {
                    return objCopydefault;
                }
                abstractC14702dqT = abstractC14702dqT2;
                actionBar = actionBar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                actionBar = (ReNewEnableViewModel.ActionBar) this.L$2;
                fvu = (fVU) this.L$1;
                abstractC14702dqT = (AbstractC14702dqT) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            abstractC14702dqT.dismissAllowingStateLoss();
            C17877fVp.Companion.OLrzqt().copydefault(fvu, ((ReNewEnableViewModel.ActionBar.Activity) actionBar).EZpvd(), new Function1() { // from class: o.fWC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return ReNewEnableActivity$observeViewModelState$6$1$11$1.invokeSuspend$lambda$2$lambda$0(fvu, (ViewOnClickListenerC54939xaY) obj2);
                }
            }, new Function1() { // from class: o.fWy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return ReNewEnableActivity$observeViewModelState$6$1$11$1.invokeSuspend$lambda$2$lambda$1(fvu, (ViewOnClickListenerC54939xaY) obj2);
                }
            });
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$0(fVU fvu, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        viewOnClickListenerC54939xaY.dismiss();
        fvu.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$1(fVU fvu, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        ((gKO) C43251rlk.copydefault(gKO.class)).OLrzqt(fvu, new OrderListParams(OrderListParams.Page.OpenOrder, null, 2, null));
        return Unit.INSTANCE;
    }
}
