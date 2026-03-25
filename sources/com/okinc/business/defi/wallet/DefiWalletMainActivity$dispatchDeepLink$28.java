package com.okinc.business.defi.wallet;

import com.okinc.wallet.api.WalletReferralSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C17670fNy;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.xWP;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiWalletMainActivity$dispatchDeepLink$28 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $uri;
    int label;
    final /* synthetic */ DefiWalletMainActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMainActivity$dispatchDeepLink$28(DefiWalletMainActivity defiWalletMainActivity, String str, Continuation<? super DefiWalletMainActivity$dispatchDeepLink$28> continuation) {
        super(2, continuation);
        this.this$0 = defiWalletMainActivity;
        this.$uri = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletMainActivity$dispatchDeepLink$28(this.this$0, this.$uri, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletMainActivity$dispatchDeepLink$28) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C17670fNy.TaskDescription.getInstance$default(C17670fNy.Companion, null, 1, null).OLrzqt(true);
            xWP xwp = (xWP) C43251rlk.OLrzqt(xWP.class);
            if (xwp != null) {
                DefiWalletMainActivity defiWalletMainActivity = this.this$0;
                String str = this.$uri;
                WalletReferralSource walletReferralSource = WalletReferralSource.REFERRAL_DASHBOARD;
                this.label = 1;
                if (xWP.TaskDescription.bindReferralCode$default(xwp, defiWalletMainActivity, str, false, walletReferralSource, null, this, 16, null) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
