package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.ListDevicesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.DexLoadReporter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class GestureStroke implements BB<DexLoadReporter> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super DexLoadReporter> continuation) throws java.lang.Throwable {
        ListDevicesOperationDeserializer$deserialize$1 listDevicesOperationDeserializer$deserialize$1;
        DexLoadReporter.Activity activity;
        byte[] bArr;
        if (continuation instanceof ListDevicesOperationDeserializer$deserialize$1) {
            listDevicesOperationDeserializer$deserialize$1 = (ListDevicesOperationDeserializer$deserialize$1) continuation;
            int i = listDevicesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listDevicesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listDevicesOperationDeserializer$deserialize$1 = new ListDevicesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listDevicesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listDevicesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (DexLoadReporter.Activity) listDevicesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                Prediction.OLrzqt(activity, bArr);
            }
            activity.copydefault();
            return activity.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listDevicesOperationDeserializer$deserialize$1.label = 1;
            if (Prediction.copydefault(dt, c58859zS, listDevicesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new DexLoadReporter.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listDevicesOperationDeserializer$deserialize$1.L$0 = activity;
        listDevicesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listDevicesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.copydefault();
        return activity.EZpvd();
    }
}
