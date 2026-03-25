package com.okinc.business.defi.wallet.home;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC8108awX;

/* JADX INFO: loaded from: classes5.dex */
public final class MpcAccountStatusUtils$changeAccount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onError;
    final /* synthetic */ Function0<Unit> $onSuccess;
    final /* synthetic */ String $uid;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MpcAccountStatusUtils$changeAccount$1(String str, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super MpcAccountStatusUtils$changeAccount$1> continuation) {
        super(2, continuation);
        this.$uid = str;
        this.$onSuccess = function0;
        this.$onError = function02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MpcAccountStatusUtils$changeAccount$1(this.$uid, this.$onSuccess, this.$onError, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MpcAccountStatusUtils$changeAccount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC8108awX interfaceC8108awX = (InterfaceC8108awX) C43251rlk.OLrzqt(InterfaceC8108awX.class);
            if (interfaceC8108awX != null) {
                String str = this.$uid;
                Function0<Unit> function0 = this.$onSuccess;
                Function0<Unit> function02 = this.$onError;
                this.label = 1;
                if (interfaceC8108awX.AEQbTJ(str, function0, function02, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
