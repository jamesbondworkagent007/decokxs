package o;

import aws.sdk.kotlin.services.rekognition.serde.GetCelebrityRecognitionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.TextViewMetrics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C21136gu implements BB<TextViewMetrics> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super TextViewMetrics> continuation) throws java.lang.Throwable {
        GetCelebrityRecognitionOperationDeserializer$deserialize$1 getCelebrityRecognitionOperationDeserializer$deserialize$1;
        TextViewMetrics.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof GetCelebrityRecognitionOperationDeserializer$deserialize$1) {
            getCelebrityRecognitionOperationDeserializer$deserialize$1 = (GetCelebrityRecognitionOperationDeserializer$deserialize$1) continuation;
            int i = getCelebrityRecognitionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCelebrityRecognitionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getCelebrityRecognitionOperationDeserializer$deserialize$1 = new GetCelebrityRecognitionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getCelebrityRecognitionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getCelebrityRecognitionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (TextViewMetrics.ActionBar) getCelebrityRecognitionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C21242gw.AEQbTJ(actionBar, bArr);
            }
            actionBar.AEQbTJ();
            return actionBar.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getCelebrityRecognitionOperationDeserializer$deserialize$1.label = 1;
            if (C21242gw.copydefault(dt, c58859zS, getCelebrityRecognitionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new TextViewMetrics.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getCelebrityRecognitionOperationDeserializer$deserialize$1.L$0 = actionBar;
        getCelebrityRecognitionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getCelebrityRecognitionOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.AEQbTJ();
        return actionBar.KWHzl();
    }
}
