package uniffi.settings;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C60173zxj;
import uniffi.BaseFfiConverterString;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceSettingsServiceForeignHandling$getCurrencyListFromRemote$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1 $handleError;
    final /* synthetic */ Function1 $handleSuccess;
    final /* synthetic */ Function1 $makeCall;
    final /* synthetic */ RustBuffer $rustBuffer;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uniffiCallbackInterfaceSettingsServiceForeignHandling$getCurrencyListFromRemote$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(Function1 function1, Function1 function12, Function1 function13, RustBuffer rustBuffer, Continuation continuation) {
        super(2, continuation);
        this.$handleSuccess = function1;
        this.$makeCall = function12;
        this.$handleError = function13;
        this.$rustBuffer = rustBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new uniffiCallbackInterfaceSettingsServiceForeignHandling$getCurrencyListFromRemote$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(this.$handleSuccess, this.$makeCall, this.$handleError, this.$rustBuffer, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((uniffiCallbackInterfaceSettingsServiceForeignHandling$getCurrencyListFromRemote$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Function1 function1;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Function1 function12 = this.$handleSuccess;
                Function1 function13 = this.$makeCall;
                this.L$0 = function12;
                this.label = 1;
                Object objInvoke = function13.invoke(this);
                if (objInvoke == objCopydefault) {
                    return objCopydefault;
                }
                function1 = function12;
                obj = objInvoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            function1.invoke(obj);
        } catch (Exception e) {
            if (e instanceof SettingsException) {
                this.$handleError.invoke(UniffiRustCallStatus.Companion.EZpvd(this.$rustBuffer.getRustBufferOp(), (byte) 1, FfiConverterTypeSettingsError.INSTANCE.lower2(e)));
            } else {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                this.$handleError.invoke(UniffiRustCallStatus.Companion.EZpvd(this.$rustBuffer.getRustBufferOp(), (byte) 2, new BaseFfiConverterString(this.$rustBuffer).lower2(e.toString())));
            }
        }
        return Unit.INSTANCE;
    }
}
