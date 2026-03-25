package o;

import aws.sdk.kotlin.services.comprehend.serde.DescribeEntityRecognizerOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.TechListParcel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DreamManagerInternal implements BB<TechListParcel> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super TechListParcel> continuation) throws java.lang.Throwable {
        DescribeEntityRecognizerOperationDeserializer$deserialize$1 describeEntityRecognizerOperationDeserializer$deserialize$1;
        TechListParcel.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof DescribeEntityRecognizerOperationDeserializer$deserialize$1) {
            describeEntityRecognizerOperationDeserializer$deserialize$1 = (DescribeEntityRecognizerOperationDeserializer$deserialize$1) continuation;
            int i = describeEntityRecognizerOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeEntityRecognizerOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeEntityRecognizerOperationDeserializer$deserialize$1 = new DescribeEntityRecognizerOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeEntityRecognizerOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeEntityRecognizerOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (TechListParcel.TaskDescription) describeEntityRecognizerOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                EuiccService.AEQbTJ(taskDescription, bArr);
            }
            taskDescription.AEQbTJ();
            return taskDescription.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeEntityRecognizerOperationDeserializer$deserialize$1.label = 1;
            if (EuiccService.OLrzqt(dt, c58859zS, describeEntityRecognizerOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new TechListParcel.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeEntityRecognizerOperationDeserializer$deserialize$1.L$0 = taskDescription;
        describeEntityRecognizerOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeEntityRecognizerOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.AEQbTJ();
        return taskDescription.EZpvd();
    }
}
