package uniffi.network;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C4326BbW;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC4267BaQ;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceOKNativeTaskResponseWithNetworkError$execute$callback$makeCall$1 extends SuspendLambda implements Function1<Continuation<? super C4326BbW>, Object> {
    final /* synthetic */ InterfaceC4267BaQ $uniffiObj;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uniffiCallbackInterfaceOKNativeTaskResponseWithNetworkError$execute$callback$makeCall$1(InterfaceC4267BaQ interfaceC4267BaQ, Continuation<? super uniffiCallbackInterfaceOKNativeTaskResponseWithNetworkError$execute$callback$makeCall$1> continuation) {
        super(1, continuation);
        this.$uniffiObj = interfaceC4267BaQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new uniffiCallbackInterfaceOKNativeTaskResponseWithNetworkError$execute$callback$makeCall$1(this.$uniffiObj, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super C4326BbW> continuation) {
        return ((uniffiCallbackInterfaceOKNativeTaskResponseWithNetworkError$execute$callback$makeCall$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC4267BaQ interfaceC4267BaQ = this.$uniffiObj;
            this.label = 1;
            obj = interfaceC4267BaQ.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
