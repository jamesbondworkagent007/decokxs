package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolDomainOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.BackupProgress;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class UsbDeviceConnection implements BB<BackupProgress> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super BackupProgress> continuation) throws java.lang.Throwable {
        UpdateUserPoolDomainOperationDeserializer$deserialize$1 updateUserPoolDomainOperationDeserializer$deserialize$1;
        BackupProgress.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof UpdateUserPoolDomainOperationDeserializer$deserialize$1) {
            updateUserPoolDomainOperationDeserializer$deserialize$1 = (UpdateUserPoolDomainOperationDeserializer$deserialize$1) continuation;
            int i = updateUserPoolDomainOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateUserPoolDomainOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                updateUserPoolDomainOperationDeserializer$deserialize$1 = new UpdateUserPoolDomainOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = updateUserPoolDomainOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = updateUserPoolDomainOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (BackupProgress.StateListAnimator) updateUserPoolDomainOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                UsbConfiguration.AEQbTJ(stateListAnimator, bArr);
            }
            stateListAnimator.AEQbTJ();
            return stateListAnimator.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            updateUserPoolDomainOperationDeserializer$deserialize$1.label = 1;
            if (UsbConfiguration.EZpvd(dt, c58859zS, updateUserPoolDomainOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new BackupProgress.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        updateUserPoolDomainOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        updateUserPoolDomainOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, updateUserPoolDomainOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.AEQbTJ();
        return stateListAnimator.OLrzqt();
    }
}
