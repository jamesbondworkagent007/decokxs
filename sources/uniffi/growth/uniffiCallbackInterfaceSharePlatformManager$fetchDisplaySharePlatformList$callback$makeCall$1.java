package uniffi.growth;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.APJ;
import o.APK;
import o.C56391yDq;
import o.C56442yFn;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceSharePlatformManager$fetchDisplaySharePlatformList$callback$makeCall$1 extends SuspendLambda implements Function1<Continuation<? super List<? extends SharePlatform>>, Object> {
    final /* synthetic */ RustBuffer.ByValue $shareConfig;
    final /* synthetic */ APK $uniffiObj;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uniffiCallbackInterfaceSharePlatformManager$fetchDisplaySharePlatformList$callback$makeCall$1(APK apk, RustBuffer.ByValue byValue, Continuation<? super uniffiCallbackInterfaceSharePlatformManager$fetchDisplaySharePlatformList$callback$makeCall$1> continuation) {
        super(1, continuation);
        this.$uniffiObj = apk;
        this.$shareConfig = byValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new uniffiCallbackInterfaceSharePlatformManager$fetchDisplaySharePlatformList$callback$makeCall$1(this.$uniffiObj, this.$shareConfig, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super List<? extends SharePlatform>> continuation) {
        return ((uniffiCallbackInterfaceSharePlatformManager$fetchDisplaySharePlatformList$callback$makeCall$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            APK apk = this.$uniffiObj;
            APJ apj = (APJ) FfiConverterTypeShareConfig.INSTANCE.lift2(this.$shareConfig);
            this.label = 1;
            obj = apk.KWHzl(apj, this);
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
