package com.okinc.business.defi.wallet.common.okxconnect.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC13987dcu;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppMethodHelper$getChainIdFromCaipChainId$2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ String $caipChainId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppMethodHelper$getChainIdFromCaipChainId$2(String str, Continuation<? super DAppMethodHelper$getChainIdFromCaipChainId$2> continuation) {
        super(1, continuation);
        this.$caipChainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DAppMethodHelper$getChainIdFromCaipChainId$2(this.$caipChainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((DAppMethodHelper$getChainIdFromCaipChainId$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC13987dcu interfaceC13987dcuAEQbTJ = InterfaceC13987dcu.Companion.AEQbTJ(this.$caipChainId);
            if (interfaceC13987dcuAEQbTJ != null) {
                return C56443yFo.KWHzl(interfaceC13987dcuAEQbTJ.OLrzqt()).toString();
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
