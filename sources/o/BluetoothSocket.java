package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminUpdateAuthEventFeedbackOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.AbstractAccountAuthenticator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class BluetoothSocket implements BB<AbstractAccountAuthenticator> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AbstractAccountAuthenticator> continuation) throws java.lang.Throwable {
        AdminUpdateAuthEventFeedbackOperationDeserializer$deserialize$1 adminUpdateAuthEventFeedbackOperationDeserializer$deserialize$1;
        if (continuation instanceof AdminUpdateAuthEventFeedbackOperationDeserializer$deserialize$1) {
            adminUpdateAuthEventFeedbackOperationDeserializer$deserialize$1 = (AdminUpdateAuthEventFeedbackOperationDeserializer$deserialize$1) continuation;
            int i = adminUpdateAuthEventFeedbackOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminUpdateAuthEventFeedbackOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminUpdateAuthEventFeedbackOperationDeserializer$deserialize$1 = new AdminUpdateAuthEventFeedbackOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = adminUpdateAuthEventFeedbackOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adminUpdateAuthEventFeedbackOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                adminUpdateAuthEventFeedbackOperationDeserializer$deserialize$1.label = 1;
                if (SdpMnsRecord.KWHzl(dt, c58859zS, adminUpdateAuthEventFeedbackOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                AbstractAccountAuthenticator.Application application = new AbstractAccountAuthenticator.Application();
                application.AEQbTJ();
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
