package o;

import aws.sdk.kotlin.services.rekognition.serde.StartLabelDetectionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C10364bn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C27995kL implements BB<C10364bn> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C10364bn> continuation) throws java.lang.Throwable {
        StartLabelDetectionOperationDeserializer$deserialize$1 startLabelDetectionOperationDeserializer$deserialize$1;
        C10364bn.Activity activity;
        byte[] bArr;
        if (continuation instanceof StartLabelDetectionOperationDeserializer$deserialize$1) {
            startLabelDetectionOperationDeserializer$deserialize$1 = (StartLabelDetectionOperationDeserializer$deserialize$1) continuation;
            int i = startLabelDetectionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startLabelDetectionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startLabelDetectionOperationDeserializer$deserialize$1 = new StartLabelDetectionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startLabelDetectionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startLabelDetectionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (C10364bn.Activity) startLabelDetectionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C28184kS.EZpvd(activity, bArr);
            }
            activity.EZpvd();
            return activity.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startLabelDetectionOperationDeserializer$deserialize$1.label = 1;
            if (C28184kS.OLrzqt(dt, c58859zS, startLabelDetectionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new C10364bn.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startLabelDetectionOperationDeserializer$deserialize$1.L$0 = activity;
        startLabelDetectionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startLabelDetectionOperationDeserializer$deserialize$1);
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
