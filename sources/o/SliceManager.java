package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminCreateUserOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.CipherSpi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class SliceManager implements BB<CipherSpi> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super CipherSpi> continuation) throws java.lang.Throwable {
        AdminCreateUserOperationDeserializer$deserialize$1 adminCreateUserOperationDeserializer$deserialize$1;
        CipherSpi.Activity activity;
        byte[] bArr;
        if (continuation instanceof AdminCreateUserOperationDeserializer$deserialize$1) {
            adminCreateUserOperationDeserializer$deserialize$1 = (AdminCreateUserOperationDeserializer$deserialize$1) continuation;
            int i = adminCreateUserOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminCreateUserOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminCreateUserOperationDeserializer$deserialize$1 = new AdminCreateUserOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = adminCreateUserOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = adminCreateUserOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (CipherSpi.Activity) adminCreateUserOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                DistroRulesVersion.AEQbTJ(activity, bArr);
            }
            activity.OLrzqt();
            return activity.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            adminCreateUserOperationDeserializer$deserialize$1.label = 1;
            if (DistroRulesVersion.EZpvd(dt, c58859zS, adminCreateUserOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new CipherSpi.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        adminCreateUserOperationDeserializer$deserialize$1.L$0 = activity;
        adminCreateUserOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, adminCreateUserOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.OLrzqt();
        return activity.KWHzl();
    }
}
