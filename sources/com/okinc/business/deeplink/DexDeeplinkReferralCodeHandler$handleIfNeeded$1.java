package com.okinc.business.deeplink;

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
import o.C9706bae;
import o.C9708bag;
import o.xWP;

/* JADX INFO: loaded from: classes3.dex */
public final class DexDeeplinkReferralCodeHandler$handleIfNeeded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $context;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ C9708bag.TaskDescription $referralInfo;
    int label;
    final /* synthetic */ C9706bae this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexDeeplinkReferralCodeHandler$handleIfNeeded$1(C9706bae c9706bae, FragmentActivity fragmentActivity, C9708bag.TaskDescription taskDescription, Map<String, String> map, Continuation<? super DexDeeplinkReferralCodeHandler$handleIfNeeded$1> continuation) {
        super(2, continuation);
        this.this$0 = c9706bae;
        this.$context = fragmentActivity;
        this.$referralInfo = taskDescription;
        this.$params = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexDeeplinkReferralCodeHandler$handleIfNeeded$1(this.this$0, this.$context, this.$referralInfo, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DexDeeplinkReferralCodeHandler$handleIfNeeded$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            xWP xwp = this.this$0.AEQbTJ;
            FragmentActivity fragmentActivity = this.$context;
            String strCopydefault = this.$referralInfo.copydefault();
            WalletReferralSource walletReferralSourceEZpvd = WalletReferralSource.Companion.EZpvd(this.$referralInfo.KWHzl());
            Map<String, String> map = this.$params;
            this.label = 1;
            if (xwp.OLrzqt(fragmentActivity, strCopydefault, false, walletReferralSourceEZpvd, map, this) == objCopydefault) {
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
