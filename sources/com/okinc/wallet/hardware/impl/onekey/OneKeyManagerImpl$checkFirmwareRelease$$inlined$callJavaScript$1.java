package com.okinc.wallet.hardware.impl.onekey;

import com.okinc.wallet.hardware.impl.onekey.data.CheckFirmwareRelease;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonElementKt;
import o.C33489mxS;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC57144ycq;

/* JADX INFO: loaded from: classes12.dex */
public final class OneKeyManagerImpl$checkFirmwareRelease$$inlined$callJavaScript$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ InterfaceC57144ycq $params;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneKeyManagerImpl$checkFirmwareRelease$$inlined$callJavaScript$1(InterfaceC57144ycq interfaceC57144ycq, Continuation continuation) {
        super(2, continuation);
        this.$params = interfaceC57144ycq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneKeyManagerImpl$checkFirmwareRelease$$inlined$callJavaScript$1(this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((OneKeyManagerImpl$checkFirmwareRelease$$inlined$callJavaScript$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return JsonElementKt.JsonPrimitive(C33489mxS.KWHzl.KWHzl(CheckFirmwareRelease.Companion.serializer(), this.$params)).toString();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
