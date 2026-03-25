package com.okinc.business.defi.wallet.mine.walletbind.utils;

import android.content.Context;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;

/* JADX INFO: loaded from: classes5.dex */
public final class IndependentWalletBindCeFiUtils$goToWithdraw$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndependentWalletBindCeFiUtils$goToWithdraw$1(Context context, Continuation<? super IndependentWalletBindCeFiUtils$goToWithdraw$1> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IndependentWalletBindCeFiUtils$goToWithdraw$1(this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IndependentWalletBindCeFiUtils$goToWithdraw$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Context context;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            context = this.$context;
            Result.Application application2 = Result.Companion;
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl();
            this.L$0 = context;
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtKWHzl, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            context = (Context) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        String strDbNXlk = ((InterfaceC9738bbJ) obj).DbNXlk();
        MainCoroutineDispatcher main = Dispatchers.getMain();
        IndependentWalletBindCeFiUtils$goToWithdraw$1$1$1 independentWalletBindCeFiUtils$goToWithdraw$1$1$1 = new IndependentWalletBindCeFiUtils$goToWithdraw$1$1$1(context, strDbNXlk, null);
        this.L$0 = null;
        this.label = 2;
        if (BuildersKt.withContext(main, independentWalletBindCeFiUtils$goToWithdraw$1$1$1, this) == objCopydefault) {
            return objCopydefault;
        }
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}
