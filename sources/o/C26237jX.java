package o;

import aws.sdk.kotlin.services.rekognition.serde.SearchFacesByImageOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C6476aQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C26237jX implements BB<C6476aQ> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C6476aQ> continuation) throws java.lang.Throwable {
        SearchFacesByImageOperationDeserializer$deserialize$1 searchFacesByImageOperationDeserializer$deserialize$1;
        C6476aQ.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof SearchFacesByImageOperationDeserializer$deserialize$1) {
            searchFacesByImageOperationDeserializer$deserialize$1 = (SearchFacesByImageOperationDeserializer$deserialize$1) continuation;
            int i = searchFacesByImageOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchFacesByImageOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                searchFacesByImageOperationDeserializer$deserialize$1 = new SearchFacesByImageOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = searchFacesByImageOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = searchFacesByImageOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (C6476aQ.TaskDescription) searchFacesByImageOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C26210jW.AEQbTJ(taskDescription, bArr);
            }
            taskDescription.OLrzqt();
            return taskDescription.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            searchFacesByImageOperationDeserializer$deserialize$1.label = 1;
            if (C26210jW.OLrzqt(dt, c58859zS, searchFacesByImageOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new C6476aQ.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        searchFacesByImageOperationDeserializer$deserialize$1.L$0 = taskDescription;
        searchFacesByImageOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, searchFacesByImageOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.OLrzqt();
        return taskDescription.copydefault();
    }
}
