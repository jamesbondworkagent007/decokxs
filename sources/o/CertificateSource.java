package o;

import aws.sdk.kotlin.services.comprehend.serde.CreateEntityRecognizerOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.SslCertificate;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CertificateSource implements BB<SslCertificate> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super SslCertificate> continuation) throws java.lang.Throwable {
        CreateEntityRecognizerOperationDeserializer$deserialize$1 createEntityRecognizerOperationDeserializer$deserialize$1;
        SslCertificate.Activity activity;
        byte[] bArr;
        if (continuation instanceof CreateEntityRecognizerOperationDeserializer$deserialize$1) {
            createEntityRecognizerOperationDeserializer$deserialize$1 = (CreateEntityRecognizerOperationDeserializer$deserialize$1) continuation;
            int i = createEntityRecognizerOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createEntityRecognizerOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                createEntityRecognizerOperationDeserializer$deserialize$1 = new CreateEntityRecognizerOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = createEntityRecognizerOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = createEntityRecognizerOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (SslCertificate.Activity) createEntityRecognizerOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                ConfigSource.KWHzl(activity, bArr);
            }
            activity.EZpvd();
            return activity.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            createEntityRecognizerOperationDeserializer$deserialize$1.label = 1;
            if (ConfigSource.copydefault(dt, c58859zS, createEntityRecognizerOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new SslCertificate.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        createEntityRecognizerOperationDeserializer$deserialize$1.L$0 = activity;
        createEntityRecognizerOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, createEntityRecognizerOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.EZpvd();
        return activity.AEQbTJ();
    }
}
