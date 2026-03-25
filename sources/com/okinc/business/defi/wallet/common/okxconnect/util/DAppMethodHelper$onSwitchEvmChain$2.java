package com.okinc.business.defi.wallet.common.okxconnect.util;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C15974ebF;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppMethodHelper$onSwitchEvmChain$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ String $chainIdHex;
    final /* synthetic */ String $walletId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C15974ebF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppMethodHelper$onSwitchEvmChain$2(C15974ebF c15974ebF, String str, String str2, Continuation<? super DAppMethodHelper$onSwitchEvmChain$2> continuation) {
        super(2, continuation);
        this.this$0 = c15974ebF;
        this.$walletId = str;
        this.$chainIdHex = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DAppMethodHelper$onSwitchEvmChain$2 dAppMethodHelper$onSwitchEvmChain$2 = new DAppMethodHelper$onSwitchEvmChain$2(this.this$0, this.$walletId, this.$chainIdHex, continuation);
        dAppMethodHelper$onSwitchEvmChain$2.L$0 = obj;
        return dAppMethodHelper$onSwitchEvmChain$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<String>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<String>> continuation) {
        return ((DAppMethodHelper$onSwitchEvmChain$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C15974ebF c15974ebF = this.this$0;
                String str = this.$walletId;
                String str2 = this.$chainIdHex;
                Result.Application application = Result.Companion;
                pUU.KWHzl("DAppMethodHelper", "Start onSwitchEvmChain");
                DAppMethodHelper$onSwitchEvmChain$2$1$1 dAppMethodHelper$onSwitchEvmChain$2$1$1 = new DAppMethodHelper$onSwitchEvmChain$2$1$1(c15974ebF, str, str2, null);
                this.label = 1;
                obj = c15974ebF.KWHzl(dAppMethodHelper$onSwitchEvmChain$2$1$1, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((String) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
