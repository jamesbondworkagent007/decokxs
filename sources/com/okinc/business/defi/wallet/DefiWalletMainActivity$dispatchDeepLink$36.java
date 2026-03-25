package com.okinc.business.defi.wallet;

import com.okinc.wallet.api.WalletReferralSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C17670fNy;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.xWP;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiWalletMainActivity$dispatchDeepLink$36 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $from;
    final /* synthetic */ String $uri;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ DefiWalletMainActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMainActivity$dispatchDeepLink$36(String str, DefiWalletMainActivity defiWalletMainActivity, String str2, String str3, Continuation<? super DefiWalletMainActivity$dispatchDeepLink$36> continuation) {
        super(2, continuation);
        this.$url = str;
        this.this$0 = defiWalletMainActivity;
        this.$uri = str2;
        this.$from = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletMainActivity$dispatchDeepLink$36(this.$url, this.this$0, this.$uri, this.$from, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletMainActivity$dispatchDeepLink$36) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        WalletReferralSource walletReferralSourceEZpvd;
        WalletReferralSource walletReferralSourceEZpvd2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$url;
            if (Intrinsics.EZpvd((Object) str, (Object) "wallet/home") || Intrinsics.EZpvd((Object) str, (Object) "wallet/home/page")) {
                C17670fNy.TaskDescription.getInstance$default(C17670fNy.Companion, null, 1, null).OLrzqt(true);
                xWP xwp = (xWP) C43251rlk.OLrzqt(xWP.class);
                if (xwp != null) {
                    DefiWalletMainActivity defiWalletMainActivity = this.this$0;
                    String str2 = this.$uri;
                    String str3 = this.$from;
                    if (str3 == null) {
                        walletReferralSourceEZpvd = WalletReferralSource.OTHERS;
                    } else {
                        walletReferralSourceEZpvd = WalletReferralSource.Companion.EZpvd(str3);
                    }
                    this.label = 1;
                    if (xWP.TaskDescription.bindReferralCode$default(xwp, defiWalletMainActivity, str2, false, walletReferralSourceEZpvd, null, this, 16, null) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                C17670fNy.TaskDescription.getInstance$default(C17670fNy.Companion, null, 1, null).OLrzqt(true);
                xWP xwp2 = (xWP) C43251rlk.OLrzqt(xWP.class);
                if (xwp2 != null) {
                    DefiWalletMainActivity defiWalletMainActivity2 = this.this$0;
                    String str4 = this.$uri;
                    String str5 = this.$from;
                    if (str5 == null) {
                        walletReferralSourceEZpvd2 = WalletReferralSource.OTHERS;
                    } else {
                        walletReferralSourceEZpvd2 = WalletReferralSource.Companion.EZpvd(str5);
                    }
                    this.label = 2;
                    if (xWP.TaskDescription.bindShortReferralCode$default(xwp2, defiWalletMainActivity2, str4, false, walletReferralSourceEZpvd2, null, this, 16, null) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
