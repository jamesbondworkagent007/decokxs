package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateAuthEventFeedbackOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.PasswordMetrics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class GeofenceHardwareImpl implements BB<PasswordMetrics> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super PasswordMetrics> continuation) throws java.lang.Throwable {
        UpdateAuthEventFeedbackOperationDeserializer$deserialize$1 updateAuthEventFeedbackOperationDeserializer$deserialize$1;
        if (continuation instanceof UpdateAuthEventFeedbackOperationDeserializer$deserialize$1) {
            updateAuthEventFeedbackOperationDeserializer$deserialize$1 = (UpdateAuthEventFeedbackOperationDeserializer$deserialize$1) continuation;
            int i = updateAuthEventFeedbackOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateAuthEventFeedbackOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                updateAuthEventFeedbackOperationDeserializer$deserialize$1 = new UpdateAuthEventFeedbackOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = updateAuthEventFeedbackOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateAuthEventFeedbackOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                updateAuthEventFeedbackOperationDeserializer$deserialize$1.label = 1;
                if (GeofenceHardwareMonitorCallback.OLrzqt(dt, c58859zS, updateAuthEventFeedbackOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                PasswordMetrics.Application application = new PasswordMetrics.Application();
                application.copydefault();
                return application.KWHzl();
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
