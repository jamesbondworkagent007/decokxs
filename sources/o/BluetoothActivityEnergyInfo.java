package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminGetUserOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.SecretKeyFactorySpi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class BluetoothActivityEnergyInfo implements BB<SecretKeyFactorySpi> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super SecretKeyFactorySpi> continuation) throws java.lang.Throwable {
        AdminGetUserOperationDeserializer$deserialize$1 adminGetUserOperationDeserializer$deserialize$1;
        SecretKeyFactorySpi.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof AdminGetUserOperationDeserializer$deserialize$1) {
            adminGetUserOperationDeserializer$deserialize$1 = (AdminGetUserOperationDeserializer$deserialize$1) continuation;
            int i = adminGetUserOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminGetUserOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminGetUserOperationDeserializer$deserialize$1 = new AdminGetUserOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = adminGetUserOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = adminGetUserOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (SecretKeyFactorySpi.ActionBar) adminGetUserOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                AppWidgetProviderInfo.AEQbTJ(actionBar, bArr);
            }
            actionBar.KWHzl();
            return actionBar.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            adminGetUserOperationDeserializer$deserialize$1.label = 1;
            if (AppWidgetProviderInfo.copydefault(dt, c58859zS, adminGetUserOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new SecretKeyFactorySpi.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        adminGetUserOperationDeserializer$deserialize$1.L$0 = actionBar;
        adminGetUserOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, adminGetUserOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.KWHzl();
        return actionBar.OLrzqt();
    }
}
