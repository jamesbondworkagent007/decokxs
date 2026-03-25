package o;

import aws.sdk.kotlin.services.comprehend.serde.DeleteFlywheelOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ApduList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class FillContext implements BB<ApduList> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ApduList> continuation) throws java.lang.Throwable {
        DeleteFlywheelOperationDeserializer$deserialize$1 deleteFlywheelOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteFlywheelOperationDeserializer$deserialize$1) {
            deleteFlywheelOperationDeserializer$deserialize$1 = (DeleteFlywheelOperationDeserializer$deserialize$1) continuation;
            int i = deleteFlywheelOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteFlywheelOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteFlywheelOperationDeserializer$deserialize$1 = new DeleteFlywheelOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteFlywheelOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteFlywheelOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteFlywheelOperationDeserializer$deserialize$1.label = 1;
                if (FieldClassification.AEQbTJ(dt, c58859zS, deleteFlywheelOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                ApduList.Application application = new ApduList.Application();
                application.EZpvd();
                return application.AEQbTJ();
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
