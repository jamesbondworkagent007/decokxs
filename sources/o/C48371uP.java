package o;

import aws.sdk.kotlin.services.translate.serde.ImportTerminologyOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C47439tq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C48371uP implements BB<C47439tq> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C47439tq> continuation) throws java.lang.Throwable {
        ImportTerminologyOperationDeserializer$deserialize$1 importTerminologyOperationDeserializer$deserialize$1;
        C47439tq.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof ImportTerminologyOperationDeserializer$deserialize$1) {
            importTerminologyOperationDeserializer$deserialize$1 = (ImportTerminologyOperationDeserializer$deserialize$1) continuation;
            int i = importTerminologyOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                importTerminologyOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                importTerminologyOperationDeserializer$deserialize$1 = new ImportTerminologyOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = importTerminologyOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = importTerminologyOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (C47439tq.TaskDescription) importTerminologyOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C48589uX.KWHzl(taskDescription, bArr);
            }
            taskDescription.AEQbTJ();
            return taskDescription.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            importTerminologyOperationDeserializer$deserialize$1.label = 1;
            if (C48589uX.OLrzqt(dt, c58859zS, importTerminologyOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new C47439tq.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        importTerminologyOperationDeserializer$deserialize$1.L$0 = taskDescription;
        importTerminologyOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, importTerminologyOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.AEQbTJ();
        return taskDescription.OLrzqt();
    }
}
