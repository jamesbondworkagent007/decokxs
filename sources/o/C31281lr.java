package o;

import aws.sdk.kotlin.services.rekognition.serde.StartTextDetectionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C8562bF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C31281lr implements BB<C8562bF> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C8562bF> continuation) throws java.lang.Throwable {
        StartTextDetectionOperationDeserializer$deserialize$1 startTextDetectionOperationDeserializer$deserialize$1;
        C8562bF.Application application;
        byte[] bArr;
        if (continuation instanceof StartTextDetectionOperationDeserializer$deserialize$1) {
            startTextDetectionOperationDeserializer$deserialize$1 = (StartTextDetectionOperationDeserializer$deserialize$1) continuation;
            int i = startTextDetectionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startTextDetectionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startTextDetectionOperationDeserializer$deserialize$1 = new StartTextDetectionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startTextDetectionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startTextDetectionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (C8562bF.Application) startTextDetectionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C31122lo.AEQbTJ(application, bArr);
            }
            application.EZpvd();
            return application.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startTextDetectionOperationDeserializer$deserialize$1.label = 1;
            if (C31122lo.AEQbTJ(dt, c58859zS, startTextDetectionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new C8562bF.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startTextDetectionOperationDeserializer$deserialize$1.L$0 = application;
        startTextDetectionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startTextDetectionOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.EZpvd();
        return application.copydefault();
    }
}
