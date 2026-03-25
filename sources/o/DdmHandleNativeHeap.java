package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidOAuthFlowException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.InvalidOAuthFlowExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DdmHandleNativeHeap implements BB<InvalidOAuthFlowException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidOAuthFlowException> continuation) throws java.lang.Throwable {
        InvalidOAuthFlowExceptionDeserializer$deserialize$1 invalidOAuthFlowExceptionDeserializer$deserialize$1;
        InvalidOAuthFlowException.Application application;
        if (continuation instanceof InvalidOAuthFlowExceptionDeserializer$deserialize$1) {
            invalidOAuthFlowExceptionDeserializer$deserialize$1 = (InvalidOAuthFlowExceptionDeserializer$deserialize$1) continuation;
            int i = invalidOAuthFlowExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidOAuthFlowExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidOAuthFlowExceptionDeserializer$deserialize$1 = new InvalidOAuthFlowExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidOAuthFlowExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidOAuthFlowExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidOAuthFlowException.Application application2 = new InvalidOAuthFlowException.Application();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidOAuthFlowExceptionDeserializer$deserialize$1.L$0 = application2;
            invalidOAuthFlowExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidOAuthFlowExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (InvalidOAuthFlowException.Application) invalidOAuthFlowExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            DdmHandleProfiling.copydefault(application, bArr);
        }
        application.KWHzl();
        return application.OLrzqt();
    }
}
