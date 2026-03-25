package com.okinc.business.defi.wallet.mine.walletbind;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.wallet.mine.data.BoundWallet;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import com.okinc.wallet.api.bean.ScanResult;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C19365fzs;
import o.C56391yDq;
import o.C56442yFn;
import o.dZK;

/* JADX INFO: loaded from: classes15.dex */
public final class WalletBoundManageFragment$initAdapter$1$2$2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BoundWallet $wallet;
    int label;
    final /* synthetic */ C19365fzs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBoundManageFragment$initAdapter$1$2$2$2(BoundWallet boundWallet, C19365fzs c19365fzs, Continuation<? super WalletBoundManageFragment$initAdapter$1$2$2$2> continuation) {
        super(2, continuation);
        this.$wallet = boundWallet;
        this.this$0 = c19365fzs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletBoundManageFragment$initAdapter$1$2$2$2(this.$wallet, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletBoundManageFragment$initAdapter$1$2$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FragmentActivity activity;
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
            if (!this.$wallet.AhwBna()) {
                BoundWallet boundWallet = this.$wallet;
                Result.Application application2 = Result.Companion;
                AbstractC58260yxt<Integer> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(boundWallet.KWHzl());
                this.label = 1;
                obj = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            dZK dzk = dZK.AEQbTJ;
            activity = this.this$0.getActivity();
            if (activity != null) {
                return Unit.INSTANCE;
            }
            dzk.AEQbTJ(activity, new EnterWalletMainBean((Boolean) null, (String) null, (Integer) null, (String) null, false, false, (ScanResult) null, 127, (DefaultConstructorMarker) null));
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        Result.m7377constructorimpl((Integer) obj);
        dZK dzk2 = dZK.AEQbTJ;
        activity = this.this$0.getActivity();
        if (activity != null) {
        }
    }
}
