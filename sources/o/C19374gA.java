package o;

import aws.sdk.kotlin.services.rekognition.serde.GetContentModerationOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.VideoView2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C19374gA implements BB<VideoView2> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super VideoView2> continuation) throws java.lang.Throwable {
        GetContentModerationOperationDeserializer$deserialize$1 getContentModerationOperationDeserializer$deserialize$1;
        VideoView2.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof GetContentModerationOperationDeserializer$deserialize$1) {
            getContentModerationOperationDeserializer$deserialize$1 = (GetContentModerationOperationDeserializer$deserialize$1) continuation;
            int i = getContentModerationOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getContentModerationOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getContentModerationOperationDeserializer$deserialize$1 = new GetContentModerationOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getContentModerationOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getContentModerationOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (VideoView2.ActionBar) getContentModerationOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C21295gx.KWHzl(actionBar, bArr);
            }
            actionBar.OLrzqt();
            return actionBar.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getContentModerationOperationDeserializer$deserialize$1.label = 1;
            if (C21295gx.OLrzqt(dt, c58859zS, getContentModerationOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new VideoView2.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getContentModerationOperationDeserializer$deserialize$1.L$0 = actionBar;
        getContentModerationOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getContentModerationOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.OLrzqt();
        return actionBar.copydefault();
    }
}
