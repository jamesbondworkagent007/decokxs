package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.VerifySoftwareTokenOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ActivityRelaunchItem;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class IpSecTransformResponse implements BB<ActivityRelaunchItem> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ActivityRelaunchItem> continuation) throws java.lang.Throwable {
        VerifySoftwareTokenOperationDeserializer$deserialize$1 verifySoftwareTokenOperationDeserializer$deserialize$1;
        ActivityRelaunchItem.Activity activity;
        byte[] bArr;
        if (continuation instanceof VerifySoftwareTokenOperationDeserializer$deserialize$1) {
            verifySoftwareTokenOperationDeserializer$deserialize$1 = (VerifySoftwareTokenOperationDeserializer$deserialize$1) continuation;
            int i = verifySoftwareTokenOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                verifySoftwareTokenOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                verifySoftwareTokenOperationDeserializer$deserialize$1 = new VerifySoftwareTokenOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = verifySoftwareTokenOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = verifySoftwareTokenOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (ActivityRelaunchItem.Activity) verifySoftwareTokenOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                KeepalivePacketData.copydefault(activity, bArr);
            }
            activity.KWHzl();
            return activity.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            verifySoftwareTokenOperationDeserializer$deserialize$1.label = 1;
            if (KeepalivePacketData.EZpvd(dt, c58859zS, verifySoftwareTokenOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new ActivityRelaunchItem.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        verifySoftwareTokenOperationDeserializer$deserialize$1.L$0 = activity;
        verifySoftwareTokenOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, verifySoftwareTokenOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.KWHzl();
        return activity.EZpvd();
    }
}
