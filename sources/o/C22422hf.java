package o;

import aws.sdk.kotlin.services.rekognition.serde.GetSegmentDetectionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C17293f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C22422hf implements BB<C17293f> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C17293f> continuation) throws java.lang.Throwable {
        GetSegmentDetectionOperationDeserializer$deserialize$1 getSegmentDetectionOperationDeserializer$deserialize$1;
        C17293f.Activity activity;
        byte[] bArr;
        if (continuation instanceof GetSegmentDetectionOperationDeserializer$deserialize$1) {
            getSegmentDetectionOperationDeserializer$deserialize$1 = (GetSegmentDetectionOperationDeserializer$deserialize$1) continuation;
            int i = getSegmentDetectionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSegmentDetectionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getSegmentDetectionOperationDeserializer$deserialize$1 = new GetSegmentDetectionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getSegmentDetectionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getSegmentDetectionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (C17293f.Activity) getSegmentDetectionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C22210hb.EZpvd(activity, bArr);
            }
            activity.copydefault();
            return activity.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getSegmentDetectionOperationDeserializer$deserialize$1.label = 1;
            if (C22210hb.EZpvd(dt, c58859zS, getSegmentDetectionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new C17293f.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getSegmentDetectionOperationDeserializer$deserialize$1.L$0 = activity;
        getSegmentDetectionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getSegmentDetectionOperationDeserializer$deserialize$1);
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
