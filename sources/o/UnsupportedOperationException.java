package o;

import aws.sdk.kotlin.services.cognitoidentity.serde.DescribeIdentityPoolOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Exception;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class UnsupportedOperationException implements BB<Exception> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Exception> continuation) throws java.lang.Throwable {
        DescribeIdentityPoolOperationDeserializer$deserialize$1 describeIdentityPoolOperationDeserializer$deserialize$1;
        Exception.Application application;
        byte[] bArr;
        if (continuation instanceof DescribeIdentityPoolOperationDeserializer$deserialize$1) {
            describeIdentityPoolOperationDeserializer$deserialize$1 = (DescribeIdentityPoolOperationDeserializer$deserialize$1) continuation;
            int i = describeIdentityPoolOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeIdentityPoolOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeIdentityPoolOperationDeserializer$deserialize$1 = new DescribeIdentityPoolOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeIdentityPoolOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeIdentityPoolOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (Exception.Application) describeIdentityPoolOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                VerifyError.OLrzqt(application, bArr);
            }
            application.AEQbTJ();
            return application.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeIdentityPoolOperationDeserializer$deserialize$1.label = 1;
            if (VerifyError.copydefault(dt, c58859zS, describeIdentityPoolOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new Exception.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeIdentityPoolOperationDeserializer$deserialize$1.L$0 = application;
        describeIdentityPoolOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeIdentityPoolOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.AEQbTJ();
        return application.KWHzl();
    }
}
