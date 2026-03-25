package o;

import aws.sdk.kotlin.services.rekognition.serde.DetectCustomLabelsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.MultiAutoCompleteTextView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C18367fh implements BB<MultiAutoCompleteTextView> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super MultiAutoCompleteTextView> continuation) throws java.lang.Throwable {
        DetectCustomLabelsOperationDeserializer$deserialize$1 detectCustomLabelsOperationDeserializer$deserialize$1;
        MultiAutoCompleteTextView.Activity activity;
        byte[] bArr;
        if (continuation instanceof DetectCustomLabelsOperationDeserializer$deserialize$1) {
            detectCustomLabelsOperationDeserializer$deserialize$1 = (DetectCustomLabelsOperationDeserializer$deserialize$1) continuation;
            int i = detectCustomLabelsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                detectCustomLabelsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                detectCustomLabelsOperationDeserializer$deserialize$1 = new DetectCustomLabelsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = detectCustomLabelsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = detectCustomLabelsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (MultiAutoCompleteTextView.Activity) detectCustomLabelsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C18314fg.AEQbTJ(activity, bArr);
            }
            activity.EZpvd();
            return activity.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            detectCustomLabelsOperationDeserializer$deserialize$1.label = 1;
            if (C18314fg.OLrzqt(dt, c58859zS, detectCustomLabelsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new MultiAutoCompleteTextView.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        detectCustomLabelsOperationDeserializer$deserialize$1.L$0 = activity;
        detectCustomLabelsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, detectCustomLabelsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.EZpvd();
        return activity.AEQbTJ();
    }
}
