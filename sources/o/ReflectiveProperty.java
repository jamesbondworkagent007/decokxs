package o;

import aws.sdk.kotlin.services.comprehend.serde.StartKeyPhrasesDetectionJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.PreferenceActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ReflectiveProperty implements BB<PreferenceActivity> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super PreferenceActivity> continuation) throws java.lang.Throwable {
        StartKeyPhrasesDetectionJobOperationDeserializer$deserialize$1 startKeyPhrasesDetectionJobOperationDeserializer$deserialize$1;
        PreferenceActivity.Activity activity;
        byte[] bArr;
        if (continuation instanceof StartKeyPhrasesDetectionJobOperationDeserializer$deserialize$1) {
            startKeyPhrasesDetectionJobOperationDeserializer$deserialize$1 = (StartKeyPhrasesDetectionJobOperationDeserializer$deserialize$1) continuation;
            int i = startKeyPhrasesDetectionJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startKeyPhrasesDetectionJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startKeyPhrasesDetectionJobOperationDeserializer$deserialize$1 = new StartKeyPhrasesDetectionJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startKeyPhrasesDetectionJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startKeyPhrasesDetectionJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (PreferenceActivity.Activity) startKeyPhrasesDetectionJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                SparseLongArray.KWHzl(activity, bArr);
            }
            activity.copydefault();
            return activity.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startKeyPhrasesDetectionJobOperationDeserializer$deserialize$1.label = 1;
            if (SparseLongArray.copydefault(dt, c58859zS, startKeyPhrasesDetectionJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new PreferenceActivity.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startKeyPhrasesDetectionJobOperationDeserializer$deserialize$1.L$0 = activity;
        startKeyPhrasesDetectionJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startKeyPhrasesDetectionJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.copydefault();
        return activity.KWHzl();
    }
}
