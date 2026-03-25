package com.okinc.business.defi.wallet;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.ActivityC15452eIw;
import o.C12827cuN;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiWalletMainActivity$dispatchDeepLink$19 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ DefiWalletMainActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMainActivity$dispatchDeepLink$19(String str, DefiWalletMainActivity defiWalletMainActivity, Continuation<? super DefiWalletMainActivity$dispatchDeepLink$19> continuation) {
        super(2, continuation);
        this.$walletId = str;
        this.this$0 = defiWalletMainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletMainActivity$dispatchDeepLink$19(this.$walletId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletMainActivity$dispatchDeepLink$19) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$walletId.length() != 0) {
                this.label = 2;
                if (DelayKt.delay(500L, this) == objCopydefault) {
                    return objCopydefault;
                }
                ActivityC15452eIw.ActionBar.startActivity$default(ActivityC15452eIw.Companion, this.this$0, this.$walletId, 0L, 4, null);
            } else {
                Result.Application application2 = Result.Companion;
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(true);
                this.label = 1;
                obj = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) obj);
                DefiWalletMainActivity defiWalletMainActivity = this.this$0;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                Result.m7376boximpl(objM7377constructorimpl);
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) obj);
            DefiWalletMainActivity defiWalletMainActivity2 = this.this$0;
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                ActivityC15452eIw.ActionBar.startActivity$default(ActivityC15452eIw.Companion, defiWalletMainActivity2, ((AbstractC12782ctV) objM7377constructorimpl).DbNXlk(), 0L, 4, null);
            }
            Result.m7376boximpl(objM7377constructorimpl);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ActivityC15452eIw.ActionBar.startActivity$default(ActivityC15452eIw.Companion, this.this$0, this.$walletId, 0L, 4, null);
        }
        return Unit.INSTANCE;
    }
}
