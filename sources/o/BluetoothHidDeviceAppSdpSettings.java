package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminRespondToAuthChallengeOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Destroyable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class BluetoothHidDeviceAppSdpSettings implements BB<Destroyable> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Destroyable> continuation) throws java.lang.Throwable {
        AdminRespondToAuthChallengeOperationDeserializer$deserialize$1 adminRespondToAuthChallengeOperationDeserializer$deserialize$1;
        Destroyable.Activity activity;
        byte[] bArr;
        if (continuation instanceof AdminRespondToAuthChallengeOperationDeserializer$deserialize$1) {
            adminRespondToAuthChallengeOperationDeserializer$deserialize$1 = (AdminRespondToAuthChallengeOperationDeserializer$deserialize$1) continuation;
            int i = adminRespondToAuthChallengeOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminRespondToAuthChallengeOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminRespondToAuthChallengeOperationDeserializer$deserialize$1 = new AdminRespondToAuthChallengeOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = adminRespondToAuthChallengeOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = adminRespondToAuthChallengeOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (Destroyable.Activity) adminRespondToAuthChallengeOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                BluetoothHidDeviceAppQosSettings.EZpvd(activity, bArr);
            }
            activity.OLrzqt();
            return activity.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            adminRespondToAuthChallengeOperationDeserializer$deserialize$1.label = 1;
            if (BluetoothHidDeviceAppQosSettings.AEQbTJ(dt, c58859zS, adminRespondToAuthChallengeOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new Destroyable.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        adminRespondToAuthChallengeOperationDeserializer$deserialize$1.L$0 = activity;
        adminRespondToAuthChallengeOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, adminRespondToAuthChallengeOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.OLrzqt();
        return activity.AEQbTJ();
    }
}
