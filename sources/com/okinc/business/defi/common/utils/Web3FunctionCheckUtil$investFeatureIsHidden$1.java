package com.okinc.business.defi.common.utils;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C14687dqE;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9774bbt;

/* JADX INFO: loaded from: classes4.dex */
public final class Web3FunctionCheckUtil$investFeatureIsHidden$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Web3FunctionCheckUtil$investFeatureIsHidden$1(Continuation<? super Web3FunctionCheckUtil$investFeatureIsHidden$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Web3FunctionCheckUtil$investFeatureIsHidden$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((Web3FunctionCheckUtil$investFeatureIsHidden$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List listAYXKKw = C14687dqE.OLrzqt.AYXKKw();
            InterfaceC9774bbt interfaceC9774bbt = listAYXKKw != null ? (InterfaceC9774bbt) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw) : null;
            if (interfaceC9774bbt != null) {
                this.label = 1;
                obj = interfaceC9774bbt.KWHzl(this);
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
