package o;

import aws.sdk.kotlin.services.comprehend.serde.StartDocumentClassificationJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Violation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class MutableByte implements BB<Violation> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Violation> continuation) throws java.lang.Throwable {
        StartDocumentClassificationJobOperationDeserializer$deserialize$1 startDocumentClassificationJobOperationDeserializer$deserialize$1;
        Violation.Application application;
        byte[] bArr;
        if (continuation instanceof StartDocumentClassificationJobOperationDeserializer$deserialize$1) {
            startDocumentClassificationJobOperationDeserializer$deserialize$1 = (StartDocumentClassificationJobOperationDeserializer$deserialize$1) continuation;
            int i = startDocumentClassificationJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startDocumentClassificationJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startDocumentClassificationJobOperationDeserializer$deserialize$1 = new StartDocumentClassificationJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startDocumentClassificationJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startDocumentClassificationJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (Violation.Application) startDocumentClassificationJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                MutableLong.copydefault(application, bArr);
            }
            application.copydefault();
            return application.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startDocumentClassificationJobOperationDeserializer$deserialize$1.label = 1;
            if (MutableLong.EZpvd(dt, c58859zS, startDocumentClassificationJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new Violation.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startDocumentClassificationJobOperationDeserializer$deserialize$1.L$0 = application;
        startDocumentClassificationJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startDocumentClassificationJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.copydefault();
        return application.AEQbTJ();
    }
}
