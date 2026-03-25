package com.okinc.business.defi.wallet.common;

import com.okinc.business.defi.biz.walletconnect.WCSessionMeta;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletConnectUtils$getConnectedSessionDataByWalletIdSuspend$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends WCSessionMeta>>, Object> {
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ WalletConnectUtils this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletConnectUtils$getConnectedSessionDataByWalletIdSuspend$2(WalletConnectUtils walletConnectUtils, String str, Continuation<? super WalletConnectUtils$getConnectedSessionDataByWalletIdSuspend$2> continuation) {
        super(2, continuation);
        this.this$0 = walletConnectUtils;
        this.$walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletConnectUtils$getConnectedSessionDataByWalletIdSuspend$2(this.this$0, this.$walletId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends WCSessionMeta>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<WCSessionMeta>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<WCSessionMeta>> continuation) {
        return ((WalletConnectUtils$getConnectedSessionDataByWalletIdSuspend$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return this.this$0.AhwBna(this.$walletId);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
