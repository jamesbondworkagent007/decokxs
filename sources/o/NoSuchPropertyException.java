package o;

import aws.sdk.kotlin.services.comprehend.serde.StartDominantLanguageDetectionJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.GenericInflater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class NoSuchPropertyException implements BB<GenericInflater> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super GenericInflater> continuation) throws java.lang.Throwable {
        StartDominantLanguageDetectionJobOperationDeserializer$deserialize$1 startDominantLanguageDetectionJobOperationDeserializer$deserialize$1;
        GenericInflater.Activity activity;
        byte[] bArr;
        if (continuation instanceof StartDominantLanguageDetectionJobOperationDeserializer$deserialize$1) {
            startDominantLanguageDetectionJobOperationDeserializer$deserialize$1 = (StartDominantLanguageDetectionJobOperationDeserializer$deserialize$1) continuation;
            int i = startDominantLanguageDetectionJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startDominantLanguageDetectionJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startDominantLanguageDetectionJobOperationDeserializer$deserialize$1 = new StartDominantLanguageDetectionJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startDominantLanguageDetectionJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startDominantLanguageDetectionJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (GenericInflater.Activity) startDominantLanguageDetectionJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                MutableShort.copydefault(activity, bArr);
            }
            activity.EZpvd();
            return activity.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startDominantLanguageDetectionJobOperationDeserializer$deserialize$1.label = 1;
            if (MutableShort.copydefault(dt, c58859zS, startDominantLanguageDetectionJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new GenericInflater.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startDominantLanguageDetectionJobOperationDeserializer$deserialize$1.L$0 = activity;
        startDominantLanguageDetectionJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startDominantLanguageDetectionJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.EZpvd();
        return activity.KWHzl();
    }
}
