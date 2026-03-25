package o;

import aws.sdk.kotlin.services.rekognition.serde.IndexFacesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C39847q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C23429hy implements BB<C39847q> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C39847q> continuation) throws java.lang.Throwable {
        IndexFacesOperationDeserializer$deserialize$1 indexFacesOperationDeserializer$deserialize$1;
        C39847q.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof IndexFacesOperationDeserializer$deserialize$1) {
            indexFacesOperationDeserializer$deserialize$1 = (IndexFacesOperationDeserializer$deserialize$1) continuation;
            int i = indexFacesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                indexFacesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                indexFacesOperationDeserializer$deserialize$1 = new IndexFacesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = indexFacesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = indexFacesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (C39847q.TaskDescription) indexFacesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C23323hw.copydefault(taskDescription, bArr);
            }
            taskDescription.copydefault();
            return taskDescription.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            indexFacesOperationDeserializer$deserialize$1.label = 1;
            if (C23323hw.AEQbTJ(dt, c58859zS, indexFacesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new C39847q.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        indexFacesOperationDeserializer$deserialize$1.L$0 = taskDescription;
        indexFacesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, indexFacesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.copydefault();
        return taskDescription.EZpvd();
    }
}
