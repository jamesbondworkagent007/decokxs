package o;

import aws.sdk.kotlin.services.rekognition.serde.GetFaceLivenessSessionResultsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.TwoLineListItem;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C19509gF implements BB<TwoLineListItem> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super TwoLineListItem> continuation) throws java.lang.Throwable {
        GetFaceLivenessSessionResultsOperationDeserializer$deserialize$1 getFaceLivenessSessionResultsOperationDeserializer$deserialize$1;
        TwoLineListItem.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof GetFaceLivenessSessionResultsOperationDeserializer$deserialize$1) {
            getFaceLivenessSessionResultsOperationDeserializer$deserialize$1 = (GetFaceLivenessSessionResultsOperationDeserializer$deserialize$1) continuation;
            int i = getFaceLivenessSessionResultsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getFaceLivenessSessionResultsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getFaceLivenessSessionResultsOperationDeserializer$deserialize$1 = new GetFaceLivenessSessionResultsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getFaceLivenessSessionResultsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getFaceLivenessSessionResultsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (TwoLineListItem.TaskDescription) getFaceLivenessSessionResultsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C19644gK.OLrzqt(taskDescription, bArr);
            }
            taskDescription.OLrzqt();
            return taskDescription.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getFaceLivenessSessionResultsOperationDeserializer$deserialize$1.label = 1;
            if (C19644gK.copydefault(dt, c58859zS, getFaceLivenessSessionResultsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new TwoLineListItem.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getFaceLivenessSessionResultsOperationDeserializer$deserialize$1.L$0 = taskDescription;
        getFaceLivenessSessionResultsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getFaceLivenessSessionResultsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.OLrzqt();
        return taskDescription.AEQbTJ();
    }
}
