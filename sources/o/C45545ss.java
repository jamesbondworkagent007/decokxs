package o;

import aws.sdk.kotlin.services.textract.model.ThrottlingException;
import aws.sdk.kotlin.services.textract.serde.ThrottlingExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ss, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C45545ss implements BB<ThrottlingException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ThrottlingException> continuation) throws java.lang.Throwable {
        ThrottlingExceptionDeserializer$deserialize$1 throttlingExceptionDeserializer$deserialize$1;
        ThrottlingException.Activity activity;
        if (continuation instanceof ThrottlingExceptionDeserializer$deserialize$1) {
            throttlingExceptionDeserializer$deserialize$1 = (ThrottlingExceptionDeserializer$deserialize$1) continuation;
            int i = throttlingExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                throttlingExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                throttlingExceptionDeserializer$deserialize$1 = new ThrottlingExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = throttlingExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = throttlingExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ThrottlingException.Activity activity2 = new ThrottlingException.Activity();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            throttlingExceptionDeserializer$deserialize$1.L$0 = activity2;
            throttlingExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, throttlingExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            activity = activity2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (ThrottlingException.Activity) throttlingExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C45399sp.OLrzqt(activity, bArr);
        }
        activity.KWHzl();
        return activity.copydefault();
    }
}
