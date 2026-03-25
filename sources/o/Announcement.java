package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateIdentityProviderOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.BackupDataInputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class Announcement implements BB<BackupDataInputStream> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super BackupDataInputStream> continuation) throws java.lang.Throwable {
        UpdateIdentityProviderOperationDeserializer$deserialize$1 updateIdentityProviderOperationDeserializer$deserialize$1;
        BackupDataInputStream.Activity activity;
        byte[] bArr;
        if (continuation instanceof UpdateIdentityProviderOperationDeserializer$deserialize$1) {
            updateIdentityProviderOperationDeserializer$deserialize$1 = (UpdateIdentityProviderOperationDeserializer$deserialize$1) continuation;
            int i = updateIdentityProviderOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateIdentityProviderOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                updateIdentityProviderOperationDeserializer$deserialize$1 = new UpdateIdentityProviderOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = updateIdentityProviderOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = updateIdentityProviderOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (BackupDataInputStream.Activity) updateIdentityProviderOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                ProgramList.copydefault(activity, bArr);
            }
            activity.KWHzl();
            return activity.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            updateIdentityProviderOperationDeserializer$deserialize$1.label = 1;
            if (ProgramList.OLrzqt(dt, c58859zS, updateIdentityProviderOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new BackupDataInputStream.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        updateIdentityProviderOperationDeserializer$deserialize$1.L$0 = activity;
        updateIdentityProviderOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, updateIdentityProviderOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.KWHzl();
        return activity.AEQbTJ();
    }
}
