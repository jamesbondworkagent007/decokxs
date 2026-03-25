package com.okinc.business.invest_biz.ui.screens.home.container;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58260yxt;
import o.C23580iBq;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestHomeContainerFragment$updateTabVisibilityOnWalletChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InvestHomeContainerFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestHomeContainerFragment$updateTabVisibilityOnWalletChange$1(InvestHomeContainerFragment investHomeContainerFragment, Continuation<? super InvestHomeContainerFragment$updateTabVisibilityOnWalletChange$1> continuation) {
        super(2, continuation);
        this.this$0 = investHomeContainerFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestHomeContainerFragment$updateTabVisibilityOnWalletChange$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestHomeContainerFragment$updateTabVisibilityOnWalletChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtEZpvd = C23580iBq.AEQbTJ.EZpvd();
                this.label = 1;
                obj = RxAwaitKt.await(abstractC58260yxtEZpvd, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC9738bbJ) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        InvestHomeContainerFragment investHomeContainerFragment = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            investHomeContainerFragment.OLrzqt().KWHzl();
        }
        return Unit.INSTANCE;
    }
}
