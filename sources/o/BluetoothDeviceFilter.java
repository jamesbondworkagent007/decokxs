package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.ChangePasswordOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Animator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class BluetoothDeviceFilter implements BB<Animator> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Animator> continuation) throws java.lang.Throwable {
        ChangePasswordOperationDeserializer$deserialize$1 changePasswordOperationDeserializer$deserialize$1;
        if (continuation instanceof ChangePasswordOperationDeserializer$deserialize$1) {
            changePasswordOperationDeserializer$deserialize$1 = (ChangePasswordOperationDeserializer$deserialize$1) continuation;
            int i = changePasswordOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                changePasswordOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                changePasswordOperationDeserializer$deserialize$1 = new ChangePasswordOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = changePasswordOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = changePasswordOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                changePasswordOperationDeserializer$deserialize$1.label = 1;
                if (DeviceFilter.OLrzqt(dt, c58859zS, changePasswordOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                Animator.Application application = new Animator.Application();
                application.AEQbTJ();
                return application.OLrzqt();
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
