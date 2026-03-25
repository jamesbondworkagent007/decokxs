package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.GetCSVHeaderOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.UiThread;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class BulkCursorToCursorAdaptor implements BB<UiThread> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UiThread> continuation) throws java.lang.Throwable {
        GetCSVHeaderOperationDeserializer$deserialize$1 getCSVHeaderOperationDeserializer$deserialize$1;
        UiThread.Activity activity;
        byte[] bArr;
        if (continuation instanceof GetCSVHeaderOperationDeserializer$deserialize$1) {
            getCSVHeaderOperationDeserializer$deserialize$1 = (GetCSVHeaderOperationDeserializer$deserialize$1) continuation;
            int i = getCSVHeaderOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCSVHeaderOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getCSVHeaderOperationDeserializer$deserialize$1 = new GetCSVHeaderOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getCSVHeaderOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getCSVHeaderOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (UiThread.Activity) getCSVHeaderOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                CrossProcessCursorWrapper.EZpvd(activity, bArr);
            }
            activity.copydefault();
            return activity.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getCSVHeaderOperationDeserializer$deserialize$1.label = 1;
            if (CrossProcessCursorWrapper.copydefault(dt, c58859zS, getCSVHeaderOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new UiThread.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getCSVHeaderOperationDeserializer$deserialize$1.L$0 = activity;
        getCSVHeaderOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getCSVHeaderOperationDeserializer$deserialize$1);
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
