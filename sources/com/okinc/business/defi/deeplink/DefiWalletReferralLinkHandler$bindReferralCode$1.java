package com.okinc.business.defi.deeplink;

import android.app.Activity;
import com.okinc.wallet.api.WalletReferralSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C43251rlk;
import o.C54819xWm;
import o.C56391yDq;
import o.C56442yFn;
import o.xWP;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiWalletReferralLinkHandler$bindReferralCode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $code;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletReferralLinkHandler$bindReferralCode$1(String str, Continuation<? super DefiWalletReferralLinkHandler$bindReferralCode$1> continuation) {
        super(2, continuation);
        this.$code = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletReferralLinkHandler$bindReferralCode$1(this.$code, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletReferralLinkHandler$bindReferralCode$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(500L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null) {
            return Unit.INSTANCE;
        }
        if (activityAEQbTJ.isFinishing() || activityAEQbTJ.isDestroyed()) {
            return Unit.INSTANCE;
        }
        xWP xwp = (xWP) C43251rlk.OLrzqt(xWP.class);
        if (xwp != null) {
            String str = this.$code;
            WalletReferralSource walletReferralSource = WalletReferralSource.REFERRAL_DASHBOARD;
            this.label = 2;
            if (xWP.TaskDescription.bindReferralCode$default(xwp, activityAEQbTJ, str, false, walletReferralSource, null, this, 16, null) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
