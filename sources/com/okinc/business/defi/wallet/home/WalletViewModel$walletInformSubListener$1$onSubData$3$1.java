package com.okinc.business.defi.wallet.home;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C11449cOr;
import o.C15275eCh;
import o.C56391yDq;
import o.C56442yFn;
import o.eUI;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletViewModel$walletInformSubListener$1$onSubData$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<C11449cOr> $entities;
    Object L$0;
    int label;
    final /* synthetic */ eUI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletViewModel$walletInformSubListener$1$onSubData$3$1(eUI eui, List<C11449cOr> list, Continuation<? super WalletViewModel$walletInformSubListener$1$onSubData$3$1> continuation) {
        super(2, continuation);
        this.this$0 = eui;
        this.$entities = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletViewModel$walletInformSubListener$1$onSubData$3$1(this.this$0, this.$entities, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletViewModel$walletInformSubListener$1$onSubData$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        eUI eui;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                eUI eui2 = this.this$0;
                List<C11449cOr> list = this.$entities;
                Result.Application application = Result.Companion;
                C15275eCh c15275eCh = eui2.isConnected;
                this.L$0 = eui2;
                this.label = 1;
                if (c15275eCh.EZpvd(list, this) == objCopydefault) {
                    return objCopydefault;
                }
                eui = eui2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eUI eui3 = (eUI) this.L$0;
                C56391yDq.AEQbTJ(obj);
                eui = eui3;
            }
            eUI.requestAllHomeData$default(eui, "walletInfoPush", null, false, false, true, false, null, false, false, null, 934, null);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
