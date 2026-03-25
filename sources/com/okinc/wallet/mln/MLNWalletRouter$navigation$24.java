package com.okinc.wallet.mln;

import android.content.Context;
import com.okinc.business.defi.common.utils.ReferralManager;
import com.okinc.wallet.api.WalletReferralSource;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;

/* JADX INFO: loaded from: classes17.dex */
public final class MLNWalletRouter$navigation$24 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<String> $code;
    final /* synthetic */ Context $context;
    final /* synthetic */ WalletReferralSource $sourceType;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MLNWalletRouter$navigation$24(Context context, Ref.ObjectRef<String> objectRef, WalletReferralSource walletReferralSource, Continuation<? super MLNWalletRouter$navigation$24> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$code = objectRef;
        this.$sourceType = walletReferralSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MLNWalletRouter$navigation$24(this.$context, this.$code, this.$sourceType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MLNWalletRouter$navigation$24) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ReferralManager instance$default = ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null);
            Context context = this.$context;
            String str = this.$code.element;
            WalletReferralSource walletReferralSource = this.$sourceType;
            this.label = 1;
            if (instance$default.OLrzqt(context, str, false, walletReferralSource, true, (Map<String, String>) ((32 & 32) != 0 ? C56424yEw.KWHzl() : null), (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
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
