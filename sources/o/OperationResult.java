package o;

import aws.sdk.kotlin.services.comprehend.serde.CreateDatasetOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.UidRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class OperationResult implements BB<UidRange> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UidRange> continuation) throws java.lang.Throwable {
        CreateDatasetOperationDeserializer$deserialize$1 createDatasetOperationDeserializer$deserialize$1;
        UidRange.Activity activity;
        byte[] bArr;
        if (continuation instanceof CreateDatasetOperationDeserializer$deserialize$1) {
            createDatasetOperationDeserializer$deserialize$1 = (CreateDatasetOperationDeserializer$deserialize$1) continuation;
            int i = createDatasetOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createDatasetOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                createDatasetOperationDeserializer$deserialize$1 = new CreateDatasetOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = createDatasetOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = createDatasetOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (UidRange.Activity) createDatasetOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                LockScreenRequiredException.copydefault(activity, bArr);
            }
            activity.KWHzl();
            return activity.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            createDatasetOperationDeserializer$deserialize$1.label = 1;
            if (LockScreenRequiredException.AEQbTJ(dt, c58859zS, createDatasetOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new UidRange.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        createDatasetOperationDeserializer$deserialize$1.L$0 = activity;
        createDatasetOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, createDatasetOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.KWHzl();
        return activity.EZpvd();
    }
}
