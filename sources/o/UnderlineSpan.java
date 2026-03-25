package o;

import aws.sdk.kotlin.services.comprehend.serde.ListDocumentClassifierSummariesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Trace;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class UnderlineSpan implements BB<Trace> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Trace> continuation) throws java.lang.Throwable {
        ListDocumentClassifierSummariesOperationDeserializer$deserialize$1 listDocumentClassifierSummariesOperationDeserializer$deserialize$1;
        Trace.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof ListDocumentClassifierSummariesOperationDeserializer$deserialize$1) {
            listDocumentClassifierSummariesOperationDeserializer$deserialize$1 = (ListDocumentClassifierSummariesOperationDeserializer$deserialize$1) continuation;
            int i = listDocumentClassifierSummariesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listDocumentClassifierSummariesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listDocumentClassifierSummariesOperationDeserializer$deserialize$1 = new ListDocumentClassifierSummariesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listDocumentClassifierSummariesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listDocumentClassifierSummariesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (Trace.TaskDescription) listDocumentClassifierSummariesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                TabStopSpan.OLrzqt(taskDescription, bArr);
            }
            taskDescription.copydefault();
            return taskDescription.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listDocumentClassifierSummariesOperationDeserializer$deserialize$1.label = 1;
            if (TabStopSpan.OLrzqt(dt, c58859zS, listDocumentClassifierSummariesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new Trace.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listDocumentClassifierSummariesOperationDeserializer$deserialize$1.L$0 = taskDescription;
        listDocumentClassifierSummariesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listDocumentClassifierSummariesOperationDeserializer$deserialize$1);
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
