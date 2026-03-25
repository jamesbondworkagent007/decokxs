package o;

import aws.sdk.kotlin.services.rekognition.serde.GetCelebrityInfoOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.TimePickerClockDelegate;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C20871gp implements BB<TimePickerClockDelegate> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super TimePickerClockDelegate> continuation) throws java.lang.Throwable {
        GetCelebrityInfoOperationDeserializer$deserialize$1 getCelebrityInfoOperationDeserializer$deserialize$1;
        TimePickerClockDelegate.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof GetCelebrityInfoOperationDeserializer$deserialize$1) {
            getCelebrityInfoOperationDeserializer$deserialize$1 = (GetCelebrityInfoOperationDeserializer$deserialize$1) continuation;
            int i = getCelebrityInfoOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCelebrityInfoOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getCelebrityInfoOperationDeserializer$deserialize$1 = new GetCelebrityInfoOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getCelebrityInfoOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getCelebrityInfoOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (TimePickerClockDelegate.ActionBar) getCelebrityInfoOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C20924gq.EZpvd(actionBar, bArr);
            }
            actionBar.copydefault();
            return actionBar.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getCelebrityInfoOperationDeserializer$deserialize$1.label = 1;
            if (C20924gq.copydefault(dt, c58859zS, getCelebrityInfoOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new TimePickerClockDelegate.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getCelebrityInfoOperationDeserializer$deserialize$1.L$0 = actionBar;
        getCelebrityInfoOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getCelebrityInfoOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.copydefault();
        return actionBar.EZpvd();
    }
}
