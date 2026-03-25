package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminListGroupsForUserOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.IvParameterSpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class BluetoothDevicePicker implements BB<IvParameterSpec> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super IvParameterSpec> continuation) throws java.lang.Throwable {
        AdminListGroupsForUserOperationDeserializer$deserialize$1 adminListGroupsForUserOperationDeserializer$deserialize$1;
        IvParameterSpec.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof AdminListGroupsForUserOperationDeserializer$deserialize$1) {
            adminListGroupsForUserOperationDeserializer$deserialize$1 = (AdminListGroupsForUserOperationDeserializer$deserialize$1) continuation;
            int i = adminListGroupsForUserOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminListGroupsForUserOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminListGroupsForUserOperationDeserializer$deserialize$1 = new AdminListGroupsForUserOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = adminListGroupsForUserOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = adminListGroupsForUserOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (IvParameterSpec.StateListAnimator) adminListGroupsForUserOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                BluetoothGattCallback.OLrzqt(stateListAnimator, bArr);
            }
            stateListAnimator.copydefault();
            return stateListAnimator.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            adminListGroupsForUserOperationDeserializer$deserialize$1.label = 1;
            if (BluetoothGattCallback.AEQbTJ(dt, c58859zS, adminListGroupsForUserOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new IvParameterSpec.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        adminListGroupsForUserOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        adminListGroupsForUserOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, adminListGroupsForUserOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.copydefault();
        return stateListAnimator.AEQbTJ();
    }
}
