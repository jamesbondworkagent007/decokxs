package o;

import aws.sdk.kotlin.services.textract.serde.StartDocumentTextDetectionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C35877oH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C44604sa implements BB<C35877oH> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C35877oH> continuation) throws java.lang.Throwable {
        StartDocumentTextDetectionOperationDeserializer$deserialize$1 startDocumentTextDetectionOperationDeserializer$deserialize$1;
        C35877oH.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof StartDocumentTextDetectionOperationDeserializer$deserialize$1) {
            startDocumentTextDetectionOperationDeserializer$deserialize$1 = (StartDocumentTextDetectionOperationDeserializer$deserialize$1) continuation;
            int i = startDocumentTextDetectionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startDocumentTextDetectionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startDocumentTextDetectionOperationDeserializer$deserialize$1 = new StartDocumentTextDetectionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startDocumentTextDetectionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startDocumentTextDetectionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (C35877oH.TaskDescription) startDocumentTextDetectionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C44710sc.copydefault(taskDescription, bArr);
            }
            taskDescription.copydefault();
            return taskDescription.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startDocumentTextDetectionOperationDeserializer$deserialize$1.label = 1;
            if (C44710sc.AEQbTJ(dt, c58859zS, startDocumentTextDetectionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new C35877oH.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startDocumentTextDetectionOperationDeserializer$deserialize$1.L$0 = taskDescription;
        startDocumentTextDetectionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startDocumentTextDetectionOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.copydefault();
        return taskDescription.KWHzl();
    }
}
