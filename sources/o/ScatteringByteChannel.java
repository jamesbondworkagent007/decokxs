package o;

import aws.sdk.kotlin.services.cognitoidentity.serde.GetOpenIdTokenOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.InternalError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ScatteringByteChannel implements BB<InternalError> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InternalError> continuation) throws java.lang.Throwable {
        GetOpenIdTokenOperationDeserializer$deserialize$1 getOpenIdTokenOperationDeserializer$deserialize$1;
        InternalError.Activity activity;
        byte[] bArr;
        if (continuation instanceof GetOpenIdTokenOperationDeserializer$deserialize$1) {
            getOpenIdTokenOperationDeserializer$deserialize$1 = (GetOpenIdTokenOperationDeserializer$deserialize$1) continuation;
            int i = getOpenIdTokenOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOpenIdTokenOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getOpenIdTokenOperationDeserializer$deserialize$1 = new GetOpenIdTokenOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getOpenIdTokenOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getOpenIdTokenOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (InternalError.Activity) getOpenIdTokenOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                InterruptibleChannel.AEQbTJ(activity, bArr);
            }
            activity.copydefault();
            return activity.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getOpenIdTokenOperationDeserializer$deserialize$1.label = 1;
            if (InterruptibleChannel.EZpvd(dt, c58859zS, getOpenIdTokenOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new InternalError.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getOpenIdTokenOperationDeserializer$deserialize$1.L$0 = activity;
        getOpenIdTokenOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getOpenIdTokenOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.copydefault();
        return activity.AEQbTJ();
    }
}
