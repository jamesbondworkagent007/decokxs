package o;

import aws.sdk.kotlin.services.comprehend.serde.BatchDetectEntitiesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.NetworkRecommendationProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SearchIndexableData implements BB<NetworkRecommendationProvider> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super NetworkRecommendationProvider> continuation) throws java.lang.Throwable {
        BatchDetectEntitiesOperationDeserializer$deserialize$1 batchDetectEntitiesOperationDeserializer$deserialize$1;
        NetworkRecommendationProvider.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof BatchDetectEntitiesOperationDeserializer$deserialize$1) {
            batchDetectEntitiesOperationDeserializer$deserialize$1 = (BatchDetectEntitiesOperationDeserializer$deserialize$1) continuation;
            int i = batchDetectEntitiesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                batchDetectEntitiesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                batchDetectEntitiesOperationDeserializer$deserialize$1 = new BatchDetectEntitiesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = batchDetectEntitiesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = batchDetectEntitiesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (NetworkRecommendationProvider.TaskDescription) batchDetectEntitiesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                SearchIndexablesContract.EZpvd(taskDescription, bArr);
            }
            taskDescription.EZpvd();
            return taskDescription.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            batchDetectEntitiesOperationDeserializer$deserialize$1.label = 1;
            if (SearchIndexablesContract.EZpvd(dt, c58859zS, batchDetectEntitiesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new NetworkRecommendationProvider.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        batchDetectEntitiesOperationDeserializer$deserialize$1.L$0 = taskDescription;
        batchDetectEntitiesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, batchDetectEntitiesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.EZpvd();
        return taskDescription.AEQbTJ();
    }
}
