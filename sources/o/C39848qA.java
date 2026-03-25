package o;

import aws.sdk.kotlin.services.textract.serde.GetDocumentTextDetectionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C34116nS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C39848qA implements BB<C34116nS> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C34116nS> continuation) throws java.lang.Throwable {
        GetDocumentTextDetectionOperationDeserializer$deserialize$1 getDocumentTextDetectionOperationDeserializer$deserialize$1;
        C34116nS.Activity activity;
        byte[] bArr;
        if (continuation instanceof GetDocumentTextDetectionOperationDeserializer$deserialize$1) {
            getDocumentTextDetectionOperationDeserializer$deserialize$1 = (GetDocumentTextDetectionOperationDeserializer$deserialize$1) continuation;
            int i = getDocumentTextDetectionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDocumentTextDetectionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getDocumentTextDetectionOperationDeserializer$deserialize$1 = new GetDocumentTextDetectionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getDocumentTextDetectionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getDocumentTextDetectionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (C34116nS.Activity) getDocumentTextDetectionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C41769qx.copydefault(activity, bArr);
            }
            activity.AEQbTJ();
            return activity.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getDocumentTextDetectionOperationDeserializer$deserialize$1.label = 1;
            if (C41769qx.OLrzqt(dt, c58859zS, getDocumentTextDetectionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new C34116nS.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getDocumentTextDetectionOperationDeserializer$deserialize$1.L$0 = activity;
        getDocumentTextDetectionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getDocumentTextDetectionOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.AEQbTJ();
        return activity.EZpvd();
    }
}
