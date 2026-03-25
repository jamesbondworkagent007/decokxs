package o;

import aws.sdk.kotlin.services.comprehend.serde.DescribeDocumentClassificationJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ErrorCodes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class InternalTransformation implements BB<ErrorCodes> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ErrorCodes> continuation) throws java.lang.Throwable {
        DescribeDocumentClassificationJobOperationDeserializer$deserialize$1 describeDocumentClassificationJobOperationDeserializer$deserialize$1;
        ErrorCodes.Activity activity;
        byte[] bArr;
        if (continuation instanceof DescribeDocumentClassificationJobOperationDeserializer$deserialize$1) {
            describeDocumentClassificationJobOperationDeserializer$deserialize$1 = (DescribeDocumentClassificationJobOperationDeserializer$deserialize$1) continuation;
            int i = describeDocumentClassificationJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeDocumentClassificationJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeDocumentClassificationJobOperationDeserializer$deserialize$1 = new DescribeDocumentClassificationJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeDocumentClassificationJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeDocumentClassificationJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (ErrorCodes.Activity) describeDocumentClassificationJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                Sanitizer.OLrzqt(activity, bArr);
            }
            activity.OLrzqt();
            return activity.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeDocumentClassificationJobOperationDeserializer$deserialize$1.label = 1;
            if (Sanitizer.KWHzl(dt, c58859zS, describeDocumentClassificationJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new ErrorCodes.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeDocumentClassificationJobOperationDeserializer$deserialize$1.L$0 = activity;
        describeDocumentClassificationJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeDocumentClassificationJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.OLrzqt();
        return activity.KWHzl();
    }
}
