package o;

import aws.sdk.kotlin.services.comprehend.serde.ListDocumentClassificationJobsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.SystemUpdateManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class SubscriptSpan implements BB<SystemUpdateManager> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super SystemUpdateManager> continuation) throws java.lang.Throwable {
        ListDocumentClassificationJobsOperationDeserializer$deserialize$1 listDocumentClassificationJobsOperationDeserializer$deserialize$1;
        SystemUpdateManager.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof ListDocumentClassificationJobsOperationDeserializer$deserialize$1) {
            listDocumentClassificationJobsOperationDeserializer$deserialize$1 = (ListDocumentClassificationJobsOperationDeserializer$deserialize$1) continuation;
            int i = listDocumentClassificationJobsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listDocumentClassificationJobsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listDocumentClassificationJobsOperationDeserializer$deserialize$1 = new ListDocumentClassificationJobsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listDocumentClassificationJobsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listDocumentClassificationJobsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (SystemUpdateManager.ActionBar) listDocumentClassificationJobsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                TtsSpan.OLrzqt(actionBar, bArr);
            }
            actionBar.EZpvd();
            return actionBar.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listDocumentClassificationJobsOperationDeserializer$deserialize$1.label = 1;
            if (TtsSpan.EZpvd(dt, c58859zS, listDocumentClassificationJobsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new SystemUpdateManager.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listDocumentClassificationJobsOperationDeserializer$deserialize$1.L$0 = actionBar;
        listDocumentClassificationJobsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listDocumentClassificationJobsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.EZpvd();
        return actionBar.OLrzqt();
    }
}
