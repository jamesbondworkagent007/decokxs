package o;

import aws.sdk.kotlin.services.rekognition.serde.CreateUserOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.DatePicker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C13591dR implements BB<DatePicker> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super DatePicker> continuation) throws java.lang.Throwable {
        CreateUserOperationDeserializer$deserialize$1 createUserOperationDeserializer$deserialize$1;
        if (continuation instanceof CreateUserOperationDeserializer$deserialize$1) {
            createUserOperationDeserializer$deserialize$1 = (CreateUserOperationDeserializer$deserialize$1) continuation;
            int i = createUserOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createUserOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                createUserOperationDeserializer$deserialize$1 = new CreateUserOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = createUserOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = createUserOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                createUserOperationDeserializer$deserialize$1.label = 1;
                if (C13672dU.AEQbTJ(dt, c58859zS, createUserOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                DatePicker.Activity activity = new DatePicker.Activity();
                activity.AEQbTJ();
                return activity.copydefault();
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
