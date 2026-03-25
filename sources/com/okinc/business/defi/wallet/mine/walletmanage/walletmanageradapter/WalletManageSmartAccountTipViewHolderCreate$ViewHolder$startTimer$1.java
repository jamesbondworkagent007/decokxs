package com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import o.AbstractC12782ctV;
import o.C17434fFe;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletManageSmartAccountTipViewHolderCreate$ViewHolder$startTimer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $expireTimestamp;
    final /* synthetic */ Function1<AbstractC12782ctV, Unit> $onTeeExpired;
    final /* synthetic */ AbstractC12782ctV $wallet;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C17434fFe.StateListAnimator this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletManageSmartAccountTipViewHolderCreate$ViewHolder$startTimer$1(long j, Function1<? super AbstractC12782ctV, Unit> function1, AbstractC12782ctV abstractC12782ctV, C17434fFe.StateListAnimator stateListAnimator, Continuation<? super WalletManageSmartAccountTipViewHolderCreate$ViewHolder$startTimer$1> continuation) {
        super(2, continuation);
        this.$expireTimestamp = j;
        this.$onTeeExpired = function1;
        this.$wallet = abstractC12782ctV;
        this.this$0 = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletManageSmartAccountTipViewHolderCreate$ViewHolder$startTimer$1 walletManageSmartAccountTipViewHolderCreate$ViewHolder$startTimer$1 = new WalletManageSmartAccountTipViewHolderCreate$ViewHolder$startTimer$1(this.$expireTimestamp, this.$onTeeExpired, this.$wallet, this.this$0, continuation);
        walletManageSmartAccountTipViewHolderCreate$ViewHolder$startTimer$1.L$0 = obj;
        return walletManageSmartAccountTipViewHolderCreate$ViewHolder$startTimer$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletManageSmartAccountTipViewHolderCreate$ViewHolder$startTimer$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            if (CoroutineScopeKt.isActive(coroutineScope)) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        coroutineScope = (CoroutineScope) this.L$0;
        C56391yDq.AEQbTJ(obj);
        long jCurrentTimeMillis = this.$expireTimestamp - System.currentTimeMillis();
        if (jCurrentTimeMillis <= 0) {
            this.this$0.copydefault(jCurrentTimeMillis);
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                this.L$0 = coroutineScope;
                this.label = 1;
                if (DelayKt.delay(1000L, this) == objCopydefault) {
                    return objCopydefault;
                }
                long jCurrentTimeMillis2 = this.$expireTimestamp - System.currentTimeMillis();
                if (jCurrentTimeMillis2 <= 0) {
                }
            }
            return Unit.INSTANCE;
        }
        Function1<AbstractC12782ctV, Unit> function1 = this.$onTeeExpired;
        if (function1 != null) {
            function1.invoke(this.$wallet);
        }
        return Unit.INSTANCE;
    }
}
