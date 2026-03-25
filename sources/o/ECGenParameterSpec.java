package o;

import aws.sdk.kotlin.services.cognitoidentity.serde.LookupDeveloperIdentityOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.NoSuchMethodError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ECGenParameterSpec implements BB<NoSuchMethodError> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super NoSuchMethodError> continuation) throws java.lang.Throwable {
        LookupDeveloperIdentityOperationDeserializer$deserialize$1 lookupDeveloperIdentityOperationDeserializer$deserialize$1;
        NoSuchMethodError.Activity activity;
        byte[] bArr;
        if (continuation instanceof LookupDeveloperIdentityOperationDeserializer$deserialize$1) {
            lookupDeveloperIdentityOperationDeserializer$deserialize$1 = (LookupDeveloperIdentityOperationDeserializer$deserialize$1) continuation;
            int i = lookupDeveloperIdentityOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lookupDeveloperIdentityOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                lookupDeveloperIdentityOperationDeserializer$deserialize$1 = new LookupDeveloperIdentityOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = lookupDeveloperIdentityOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = lookupDeveloperIdentityOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (NoSuchMethodError.Activity) lookupDeveloperIdentityOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                ECField.AEQbTJ(activity, bArr);
            }
            activity.KWHzl();
            return activity.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            lookupDeveloperIdentityOperationDeserializer$deserialize$1.label = 1;
            if (ECField.KWHzl(dt, c58859zS, lookupDeveloperIdentityOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new NoSuchMethodError.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        lookupDeveloperIdentityOperationDeserializer$deserialize$1.L$0 = activity;
        lookupDeveloperIdentityOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, lookupDeveloperIdentityOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.KWHzl();
        return activity.OLrzqt();
    }
}
