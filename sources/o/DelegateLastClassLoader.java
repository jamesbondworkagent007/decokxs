package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.serde.AssumeRoleWithWebIdentityOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ExtractedTextRequest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class DelegateLastClassLoader implements BB<ExtractedTextRequest> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ExtractedTextRequest> continuation) throws java.lang.Throwable {
        AssumeRoleWithWebIdentityOperationDeserializer$deserialize$1 assumeRoleWithWebIdentityOperationDeserializer$deserialize$1;
        ExtractedTextRequest.Activity activity;
        byte[] bArr;
        if (continuation instanceof AssumeRoleWithWebIdentityOperationDeserializer$deserialize$1) {
            assumeRoleWithWebIdentityOperationDeserializer$deserialize$1 = (AssumeRoleWithWebIdentityOperationDeserializer$deserialize$1) continuation;
            int i = assumeRoleWithWebIdentityOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                assumeRoleWithWebIdentityOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                assumeRoleWithWebIdentityOperationDeserializer$deserialize$1 = new AssumeRoleWithWebIdentityOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = assumeRoleWithWebIdentityOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = assumeRoleWithWebIdentityOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (ExtractedTextRequest.Activity) assumeRoleWithWebIdentityOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                PathClassLoader.EZpvd(activity, bArr);
            }
            activity.AEQbTJ();
            return activity.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            assumeRoleWithWebIdentityOperationDeserializer$deserialize$1.label = 1;
            if (PathClassLoader.copydefault(dt, c58859zS, assumeRoleWithWebIdentityOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new ExtractedTextRequest.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        assumeRoleWithWebIdentityOperationDeserializer$deserialize$1.L$0 = activity;
        assumeRoleWithWebIdentityOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, assumeRoleWithWebIdentityOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.AEQbTJ();
        return activity.copydefault();
    }
}
