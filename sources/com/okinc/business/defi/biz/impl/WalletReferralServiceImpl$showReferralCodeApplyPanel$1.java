package com.okinc.business.defi.biz.impl;

import android.content.Context;
import com.okinc.business.defi.common.utils.ReferralManager;
import com.okinc.wallet.api.bean.ReferralInfo;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletReferralServiceImpl$showReferralCodeApplyPanel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    final /* synthetic */ ReferralInfo $codeInfo;
    final /* synthetic */ Context $context;
    final /* synthetic */ Map<String, String> $params;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletReferralServiceImpl$showReferralCodeApplyPanel$1(Context context, String str, ReferralInfo referralInfo, Map<String, String> map, Function1<? super Boolean, Unit> function1, Continuation<? super WalletReferralServiceImpl$showReferralCodeApplyPanel$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$accountId = str;
        this.$codeInfo = referralInfo;
        this.$params = map;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletReferralServiceImpl$showReferralCodeApplyPanel$1(this.$context, this.$accountId, this.$codeInfo, this.$params, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletReferralServiceImpl$showReferralCodeApplyPanel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null).KWHzl(this.$context, this.$accountId, this.$codeInfo, this.$params, this.$callback);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
