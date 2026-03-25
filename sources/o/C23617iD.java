package o;

import aws.sdk.kotlin.services.rekognition.serde.ListTagsForResourceOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.R;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C23617iD implements BB<R> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super R> continuation) throws java.lang.Throwable {
        ListTagsForResourceOperationDeserializer$deserialize$1 listTagsForResourceOperationDeserializer$deserialize$1;
        R.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof ListTagsForResourceOperationDeserializer$deserialize$1) {
            listTagsForResourceOperationDeserializer$deserialize$1 = (ListTagsForResourceOperationDeserializer$deserialize$1) continuation;
            int i = listTagsForResourceOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listTagsForResourceOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listTagsForResourceOperationDeserializer$deserialize$1 = new ListTagsForResourceOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listTagsForResourceOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listTagsForResourceOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (R.TaskDescription) listTagsForResourceOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C23725iH.OLrzqt(taskDescription, bArr);
            }
            taskDescription.KWHzl();
            return taskDescription.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listTagsForResourceOperationDeserializer$deserialize$1.label = 1;
            if (C23725iH.EZpvd(dt, c58859zS, listTagsForResourceOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new R.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listTagsForResourceOperationDeserializer$deserialize$1.L$0 = taskDescription;
        listTagsForResourceOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listTagsForResourceOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.KWHzl();
        return taskDescription.AEQbTJ();
    }
}
