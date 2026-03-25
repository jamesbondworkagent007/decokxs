package o;

import aws.sdk.kotlin.services.comprehend.serde.PutResourcePolicyOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.LeakedClosableViolation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class Log implements BB<LeakedClosableViolation> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super LeakedClosableViolation> continuation) throws java.lang.Throwable {
        PutResourcePolicyOperationDeserializer$deserialize$1 putResourcePolicyOperationDeserializer$deserialize$1;
        LeakedClosableViolation.Activity activity;
        byte[] bArr;
        if (continuation instanceof PutResourcePolicyOperationDeserializer$deserialize$1) {
            putResourcePolicyOperationDeserializer$deserialize$1 = (PutResourcePolicyOperationDeserializer$deserialize$1) continuation;
            int i = putResourcePolicyOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                putResourcePolicyOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                putResourcePolicyOperationDeserializer$deserialize$1 = new PutResourcePolicyOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = putResourcePolicyOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = putResourcePolicyOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (LeakedClosableViolation.Activity) putResourcePolicyOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                LogWriter.EZpvd(activity, bArr);
            }
            activity.AEQbTJ();
            return activity.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            putResourcePolicyOperationDeserializer$deserialize$1.label = 1;
            if (LogWriter.AEQbTJ(dt, c58859zS, putResourcePolicyOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new LeakedClosableViolation.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        putResourcePolicyOperationDeserializer$deserialize$1.L$0 = activity;
        putResourcePolicyOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, putResourcePolicyOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.AEQbTJ();
        return activity.KWHzl();
    }
}
