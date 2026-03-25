package o;

import aws.sdk.kotlin.services.rekognition.serde.CopyProjectVersionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.AlphabetIndexer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C14417dl implements BB<AlphabetIndexer> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AlphabetIndexer> continuation) throws java.lang.Throwable {
        CopyProjectVersionOperationDeserializer$deserialize$1 copyProjectVersionOperationDeserializer$deserialize$1;
        AlphabetIndexer.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof CopyProjectVersionOperationDeserializer$deserialize$1) {
            copyProjectVersionOperationDeserializer$deserialize$1 = (CopyProjectVersionOperationDeserializer$deserialize$1) continuation;
            int i = copyProjectVersionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyProjectVersionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                copyProjectVersionOperationDeserializer$deserialize$1 = new CopyProjectVersionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = copyProjectVersionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = copyProjectVersionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (AlphabetIndexer.TaskDescription) copyProjectVersionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C14735dr.KWHzl(taskDescription, bArr);
            }
            taskDescription.copydefault();
            return taskDescription.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            copyProjectVersionOperationDeserializer$deserialize$1.label = 1;
            if (C14735dr.KWHzl(dt, c58859zS, copyProjectVersionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new AlphabetIndexer.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        copyProjectVersionOperationDeserializer$deserialize$1.L$0 = taskDescription;
        copyProjectVersionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, copyProjectVersionOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.copydefault();
        return taskDescription.OLrzqt();
    }
}
