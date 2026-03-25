package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.ScopeDoesNotExistException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.ScopeDoesNotExistExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class MarshalQueryableSizeF implements BB<ScopeDoesNotExistException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ScopeDoesNotExistException> continuation) throws java.lang.Throwable {
        ScopeDoesNotExistExceptionDeserializer$deserialize$1 scopeDoesNotExistExceptionDeserializer$deserialize$1;
        ScopeDoesNotExistException.Application application;
        if (continuation instanceof ScopeDoesNotExistExceptionDeserializer$deserialize$1) {
            scopeDoesNotExistExceptionDeserializer$deserialize$1 = (ScopeDoesNotExistExceptionDeserializer$deserialize$1) continuation;
            int i = scopeDoesNotExistExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scopeDoesNotExistExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                scopeDoesNotExistExceptionDeserializer$deserialize$1 = new ScopeDoesNotExistExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = scopeDoesNotExistExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = scopeDoesNotExistExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ScopeDoesNotExistException.Application application2 = new ScopeDoesNotExistException.Application();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            scopeDoesNotExistExceptionDeserializer$deserialize$1.L$0 = application2;
            scopeDoesNotExistExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, scopeDoesNotExistExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (ScopeDoesNotExistException.Application) scopeDoesNotExistExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            MarshalQueryableRggbChannelVector.OLrzqt(application, bArr);
        }
        application.EZpvd();
        return application.OLrzqt();
    }
}
