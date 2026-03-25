package o;

import aws.sdk.kotlin.services.translate.serde.DeleteTerminologyOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C44584sZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C49730uu implements BB<C44584sZ> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C44584sZ> continuation) throws java.lang.Throwable {
        DeleteTerminologyOperationDeserializer$deserialize$1 deleteTerminologyOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteTerminologyOperationDeserializer$deserialize$1) {
            deleteTerminologyOperationDeserializer$deserialize$1 = (DeleteTerminologyOperationDeserializer$deserialize$1) continuation;
            int i = deleteTerminologyOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteTerminologyOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteTerminologyOperationDeserializer$deserialize$1 = new DeleteTerminologyOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteTerminologyOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteTerminologyOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteTerminologyOperationDeserializer$deserialize$1.label = 1;
                if (C49836uw.OLrzqt(dt, c58859zS, deleteTerminologyOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                C44584sZ.Activity activity = new C44584sZ.Activity();
                activity.EZpvd();
                return activity.KWHzl();
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
