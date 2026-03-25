package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.ListUserPoolsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Instrumentation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class BiometricPrompt implements BB<Instrumentation> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Instrumentation> continuation) throws java.lang.Throwable {
        ListUserPoolsOperationDeserializer$deserialize$1 listUserPoolsOperationDeserializer$deserialize$1;
        Instrumentation.Activity activity;
        byte[] bArr;
        if (continuation instanceof ListUserPoolsOperationDeserializer$deserialize$1) {
            listUserPoolsOperationDeserializer$deserialize$1 = (ListUserPoolsOperationDeserializer$deserialize$1) continuation;
            int i = listUserPoolsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listUserPoolsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listUserPoolsOperationDeserializer$deserialize$1 = new ListUserPoolsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listUserPoolsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listUserPoolsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (Instrumentation.Activity) listUserPoolsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                CryptoObject.KWHzl(activity, bArr);
            }
            activity.KWHzl();
            return activity.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listUserPoolsOperationDeserializer$deserialize$1.label = 1;
            if (CryptoObject.AEQbTJ(dt, c58859zS, listUserPoolsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new Instrumentation.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listUserPoolsOperationDeserializer$deserialize$1.L$0 = activity;
        listUserPoolsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listUserPoolsOperationDeserializer$deserialize$1);
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
