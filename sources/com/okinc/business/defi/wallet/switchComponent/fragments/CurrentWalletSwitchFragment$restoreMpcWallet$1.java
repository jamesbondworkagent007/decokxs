package com.okinc.business.defi.wallet.switchComponent.fragments;

import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.ActivityC17523fIm;
import o.C15691eRs;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class CurrentWalletSwitchFragment$restoreMpcWallet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentWalletSwitchFragment$restoreMpcWallet$1(AbstractC12782ctV abstractC12782ctV, FragmentActivity fragmentActivity, Continuation<? super CurrentWalletSwitchFragment$restoreMpcWallet$1> continuation) {
        super(2, continuation);
        this.$wallet = abstractC12782ctV;
        this.$activity = fragmentActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurrentWalletSwitchFragment$restoreMpcWallet$1(this.$wallet, this.$activity, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CurrentWalletSwitchFragment$restoreMpcWallet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC12782ctV abstractC12782ctV = this.$wallet;
                FragmentActivity fragmentActivity = this.$activity;
                Result.Application application = Result.Companion;
                AbstractC58185ywX<Boolean> abstractC58185ywXEZpvd = C15691eRs.AEQbTJ.EZpvd(abstractC12782ctV, fragmentActivity);
                this.label = 1;
                obj = AwaitKt.awaitFirst(abstractC58185ywXEZpvd, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((Boolean) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        FragmentActivity fragmentActivity2 = this.$activity;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl) && ((Boolean) objM7377constructorimpl).booleanValue()) {
            ActivityC17523fIm.ActionBar.start$default(ActivityC17523fIm.Companion, fragmentActivity2, null, 2, 2, null);
        }
        return Unit.INSTANCE;
    }
}
