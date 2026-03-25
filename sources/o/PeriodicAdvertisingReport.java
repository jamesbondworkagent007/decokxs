package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.AliasExistsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AliasExistsExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PeriodicAdvertisingReport implements BB<AliasExistsException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AliasExistsException> continuation) throws java.lang.Throwable {
        AliasExistsExceptionDeserializer$deserialize$1 aliasExistsExceptionDeserializer$deserialize$1;
        AliasExistsException.Application application;
        if (continuation instanceof AliasExistsExceptionDeserializer$deserialize$1) {
            aliasExistsExceptionDeserializer$deserialize$1 = (AliasExistsExceptionDeserializer$deserialize$1) continuation;
            int i = aliasExistsExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aliasExistsExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                aliasExistsExceptionDeserializer$deserialize$1 = new AliasExistsExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = aliasExistsExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = aliasExistsExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            AliasExistsException.Application application2 = new AliasExistsException.Application();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            aliasExistsExceptionDeserializer$deserialize$1.L$0 = application2;
            aliasExistsExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, aliasExistsExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (AliasExistsException.Application) aliasExistsExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            PeriodicAdvertisingCallback.copydefault(application, bArr);
        }
        application.EZpvd();
        return application.copydefault();
    }
}
