package com.okinc.business.defi.common.utils;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.okinc.wallet.api.WalletReferralSource;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralManager$bindReferralCode$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ WalletReferralSource $source;
    final /* synthetic */ String $upperCaseReferralCode;
    int label;
    final /* synthetic */ ReferralManager this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralManager$bindReferralCode$4(Context context, ReferralManager referralManager, String str, WalletReferralSource walletReferralSource, Map<String, String> map, Continuation<? super ReferralManager$bindReferralCode$4> continuation) {
        super(2, continuation);
        this.$context = context;
        this.this$0 = referralManager;
        this.$upperCaseReferralCode = str;
        this.$source = walletReferralSource;
        this.$params = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferralManager$bindReferralCode$4(this.$context, this.this$0, this.$upperCaseReferralCode, this.$source, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReferralManager$bindReferralCode$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Context context = this.$context;
            if (context instanceof FragmentActivity) {
                this.this$0.OLrzqt(context, this.$upperCaseReferralCode, "0", this.$source, (Map<String, String>) this.$params, true);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
