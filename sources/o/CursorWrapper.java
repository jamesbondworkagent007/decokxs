package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.GetGroupOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ActivityOptions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CursorWrapper implements BB<ActivityOptions> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ActivityOptions> continuation) throws java.lang.Throwable {
        GetGroupOperationDeserializer$deserialize$1 getGroupOperationDeserializer$deserialize$1;
        ActivityOptions.Activity activity;
        byte[] bArr;
        if (continuation instanceof GetGroupOperationDeserializer$deserialize$1) {
            getGroupOperationDeserializer$deserialize$1 = (GetGroupOperationDeserializer$deserialize$1) continuation;
            int i = getGroupOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getGroupOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getGroupOperationDeserializer$deserialize$1 = new GetGroupOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getGroupOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getGroupOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (ActivityOptions.Activity) getGroupOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                DatabaseUtils.OLrzqt(activity, bArr);
            }
            activity.AEQbTJ();
            return activity.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getGroupOperationDeserializer$deserialize$1.label = 1;
            if (DatabaseUtils.OLrzqt(dt, c58859zS, getGroupOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new ActivityOptions.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getGroupOperationDeserializer$deserialize$1.L$0 = activity;
        getGroupOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getGroupOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.AEQbTJ();
        return activity.EZpvd();
    }
}
