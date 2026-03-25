package o;

import aws.sdk.kotlin.services.cognitoidentity.serde.SetPrincipalTagAttributeMapOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Override;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class AbstractSet implements BB<Override> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Override> continuation) throws java.lang.Throwable {
        SetPrincipalTagAttributeMapOperationDeserializer$deserialize$1 setPrincipalTagAttributeMapOperationDeserializer$deserialize$1;
        Override.Activity activity;
        byte[] bArr;
        if (continuation instanceof SetPrincipalTagAttributeMapOperationDeserializer$deserialize$1) {
            setPrincipalTagAttributeMapOperationDeserializer$deserialize$1 = (SetPrincipalTagAttributeMapOperationDeserializer$deserialize$1) continuation;
            int i = setPrincipalTagAttributeMapOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                setPrincipalTagAttributeMapOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                setPrincipalTagAttributeMapOperationDeserializer$deserialize$1 = new SetPrincipalTagAttributeMapOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = setPrincipalTagAttributeMapOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = setPrincipalTagAttributeMapOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (Override.Activity) setPrincipalTagAttributeMapOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                Collection.OLrzqt(activity, bArr);
            }
            activity.copydefault();
            return activity.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            setPrincipalTagAttributeMapOperationDeserializer$deserialize$1.label = 1;
            if (Collection.AEQbTJ(dt, c58859zS, setPrincipalTagAttributeMapOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new Override.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        setPrincipalTagAttributeMapOperationDeserializer$deserialize$1.L$0 = activity;
        setPrincipalTagAttributeMapOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, setPrincipalTagAttributeMapOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.copydefault();
        return activity.OLrzqt();
    }
}
