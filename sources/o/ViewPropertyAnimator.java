package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.InvalidScopeException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.serde.InvalidScopeExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPropertyAnimator implements BB<InvalidScopeException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidScopeException> continuation) throws java.lang.Throwable {
        InvalidScopeExceptionDeserializer$deserialize$1 invalidScopeExceptionDeserializer$deserialize$1;
        InvalidScopeException.Application application;
        if (continuation instanceof InvalidScopeExceptionDeserializer$deserialize$1) {
            invalidScopeExceptionDeserializer$deserialize$1 = (InvalidScopeExceptionDeserializer$deserialize$1) continuation;
            int i = invalidScopeExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidScopeExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidScopeExceptionDeserializer$deserialize$1 = new InvalidScopeExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidScopeExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidScopeExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidScopeException.Application application2 = new InvalidScopeException.Application();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidScopeExceptionDeserializer$deserialize$1.L$0 = application2;
            invalidScopeExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidScopeExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (InvalidScopeException.Application) invalidScopeExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            ViewTreeObserver.EZpvd(application, bArr);
        }
        application.copydefault();
        return application.AEQbTJ();
    }
}
