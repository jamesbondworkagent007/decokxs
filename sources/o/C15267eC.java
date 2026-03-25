package o;

import aws.sdk.kotlin.services.rekognition.serde.DeleteProjectVersionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.HeaderViewListAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C15267eC implements BB<HeaderViewListAdapter> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super HeaderViewListAdapter> continuation) throws java.lang.Throwable {
        DeleteProjectVersionOperationDeserializer$deserialize$1 deleteProjectVersionOperationDeserializer$deserialize$1;
        HeaderViewListAdapter.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof DeleteProjectVersionOperationDeserializer$deserialize$1) {
            deleteProjectVersionOperationDeserializer$deserialize$1 = (DeleteProjectVersionOperationDeserializer$deserialize$1) continuation;
            int i = deleteProjectVersionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteProjectVersionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteProjectVersionOperationDeserializer$deserialize$1 = new DeleteProjectVersionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = deleteProjectVersionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = deleteProjectVersionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (HeaderViewListAdapter.TaskDescription) deleteProjectVersionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C15321eE.copydefault(taskDescription, bArr);
            }
            taskDescription.AEQbTJ();
            return taskDescription.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            deleteProjectVersionOperationDeserializer$deserialize$1.label = 1;
            if (C15321eE.OLrzqt(dt, c58859zS, deleteProjectVersionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new HeaderViewListAdapter.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        deleteProjectVersionOperationDeserializer$deserialize$1.L$0 = taskDescription;
        deleteProjectVersionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, deleteProjectVersionOperationDeserializer$deserialize$1);
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
