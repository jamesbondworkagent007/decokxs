package com.okinc.auth.impl.passkey.service;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5908aFO;
import o.C5958aGL;
import o.mNP;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthPasskeyServiceImpl$isPasskeyCompatible$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ C5958aGL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthPasskeyServiceImpl$isPasskeyCompatible$2(C5958aGL c5958aGL, Continuation<? super AuthPasskeyServiceImpl$isPasskeyCompatible$2> continuation) {
        super(2, continuation);
        this.this$0 = c5958aGL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AuthPasskeyServiceImpl$isPasskeyCompatible$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((AuthPasskeyServiceImpl$isPasskeyCompatible$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!mNP.AEQbTJ.copydefault()) {
                C5908aFO c5908aFO = this.this$0.djBIcL;
                this.label = 1;
                obj = c5908aFO.KWHzl(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return C56443yFo.KWHzl(z);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        if (!((Boolean) obj).booleanValue()) {
            z = false;
        }
        return C56443yFo.KWHzl(z);
    }
}
