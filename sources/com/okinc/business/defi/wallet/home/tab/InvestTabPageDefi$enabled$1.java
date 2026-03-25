package com.okinc.business.defi.wallet.home.tab;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C18161fdF;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9774bbt;

/* JADX INFO: loaded from: classes5.dex */
public final class InvestTabPageDefi$enabled$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ C18161fdF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestTabPageDefi$enabled$1(C18161fdF c18161fdF, Continuation<? super InvestTabPageDefi$enabled$1> continuation) {
        super(2, continuation);
        this.this$0 = c18161fdF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestTabPageDefi$enabled$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((InvestTabPageDefi$enabled$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zBooleanValue;
        InterfaceC9774bbt interfaceC9774bbt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List listEZpvd = this.this$0.EZpvd();
            if (listEZpvd == null || (interfaceC9774bbt = (InterfaceC9774bbt) CollectionsKt___CollectionsKt.firstOrNull(listEZpvd)) == null) {
                zBooleanValue = true;
                return C56443yFo.KWHzl(!zBooleanValue);
            }
            this.label = 1;
            obj = interfaceC9774bbt.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        return C56443yFo.KWHzl(!zBooleanValue);
    }
}
