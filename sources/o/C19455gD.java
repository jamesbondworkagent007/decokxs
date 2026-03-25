package o;

import aws.sdk.kotlin.services.rekognition.serde.GetFaceDetectionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.VideoView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C19455gD implements BB<VideoView> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super VideoView> continuation) throws java.lang.Throwable {
        GetFaceDetectionOperationDeserializer$deserialize$1 getFaceDetectionOperationDeserializer$deserialize$1;
        VideoView.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof GetFaceDetectionOperationDeserializer$deserialize$1) {
            getFaceDetectionOperationDeserializer$deserialize$1 = (GetFaceDetectionOperationDeserializer$deserialize$1) continuation;
            int i = getFaceDetectionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getFaceDetectionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getFaceDetectionOperationDeserializer$deserialize$1 = new GetFaceDetectionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getFaceDetectionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getFaceDetectionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (VideoView.ActionBar) getFaceDetectionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C19428gC.OLrzqt(actionBar, bArr);
            }
            actionBar.EZpvd();
            return actionBar.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getFaceDetectionOperationDeserializer$deserialize$1.label = 1;
            if (C19428gC.copydefault(dt, c58859zS, getFaceDetectionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new VideoView.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getFaceDetectionOperationDeserializer$deserialize$1.L$0 = actionBar;
        getFaceDetectionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getFaceDetectionOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.EZpvd();
        return actionBar.AEQbTJ();
    }
}
