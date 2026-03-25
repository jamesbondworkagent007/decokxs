package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.ForgetDeviceOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.XmlRes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class BulkCursorDescriptor implements BB<XmlRes> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super XmlRes> continuation) throws java.lang.Throwable {
        ForgetDeviceOperationDeserializer$deserialize$1 forgetDeviceOperationDeserializer$deserialize$1;
        if (continuation instanceof ForgetDeviceOperationDeserializer$deserialize$1) {
            forgetDeviceOperationDeserializer$deserialize$1 = (ForgetDeviceOperationDeserializer$deserialize$1) continuation;
            int i = forgetDeviceOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                forgetDeviceOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                forgetDeviceOperationDeserializer$deserialize$1 = new ForgetDeviceOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = forgetDeviceOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = forgetDeviceOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                forgetDeviceOperationDeserializer$deserialize$1.label = 1;
                if (XmlResourceParser.AEQbTJ(dt, c58859zS, forgetDeviceOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                XmlRes.Activity activity = new XmlRes.Activity();
                activity.KWHzl();
                return activity.AEQbTJ();
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
