package o;

import aws.sdk.kotlin.services.comprehend.serde.ContainsPiiEntitiesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.StringNetworkSpecifier;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class InternalRecoveryServiceException implements BB<StringNetworkSpecifier> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super StringNetworkSpecifier> continuation) throws java.lang.Throwable {
        ContainsPiiEntitiesOperationDeserializer$deserialize$1 containsPiiEntitiesOperationDeserializer$deserialize$1;
        StringNetworkSpecifier.Activity activity;
        byte[] bArr;
        if (continuation instanceof ContainsPiiEntitiesOperationDeserializer$deserialize$1) {
            containsPiiEntitiesOperationDeserializer$deserialize$1 = (ContainsPiiEntitiesOperationDeserializer$deserialize$1) continuation;
            int i = containsPiiEntitiesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                containsPiiEntitiesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                containsPiiEntitiesOperationDeserializer$deserialize$1 = new ContainsPiiEntitiesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = containsPiiEntitiesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = containsPiiEntitiesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (StringNetworkSpecifier.Activity) containsPiiEntitiesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                DecryptionFailedException.KWHzl(activity, bArr);
            }
            activity.EZpvd();
            return activity.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            containsPiiEntitiesOperationDeserializer$deserialize$1.label = 1;
            if (DecryptionFailedException.AEQbTJ(dt, c58859zS, containsPiiEntitiesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new StringNetworkSpecifier.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        containsPiiEntitiesOperationDeserializer$deserialize$1.L$0 = activity;
        containsPiiEntitiesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, containsPiiEntitiesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.EZpvd();
        return activity.OLrzqt();
    }
}
