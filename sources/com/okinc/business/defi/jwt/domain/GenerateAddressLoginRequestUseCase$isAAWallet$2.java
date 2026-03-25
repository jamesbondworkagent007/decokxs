package com.okinc.business.defi.jwt.domain;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C13603dRl;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;

/* JADX INFO: loaded from: classes4.dex */
public final class GenerateAddressLoginRequestUseCase$isAAWallet$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ C13603dRl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateAddressLoginRequestUseCase$isAAWallet$2(C13603dRl c13603dRl, Continuation<? super GenerateAddressLoginRequestUseCase$isAAWallet$2> continuation) {
        super(2, continuation);
        this.this$0 = c13603dRl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenerateAddressLoginRequestUseCase$isAAWallet$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((GenerateAddressLoginRequestUseCase$isAAWallet$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowKWHzl = this.this$0.KWHzl();
            this.label = 1;
            obj = FlowKt.first(flowKWHzl, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
                boolean fieldNames = interfaceC9738bbJ == null ? interfaceC9738bbJ.getFieldNames() : false;
                return C56443yFo.KWHzl(fieldNames);
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            Flow flowAEQbTJ = this.this$0.AEQbTJ();
            this.label = 2;
            obj = FlowKt.firstOrNull(flowAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            InterfaceC9738bbJ interfaceC9738bbJ2 = (InterfaceC9738bbJ) obj;
            if (interfaceC9738bbJ2 == null) {
            }
            return C56443yFo.KWHzl(fieldNames);
        }
        return C56443yFo.KWHzl(fieldNames);
    }
}
