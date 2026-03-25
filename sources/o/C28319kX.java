package o;

import aws.sdk.kotlin.services.rekognition.serde.StartPersonTrackingOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C10735bu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C28319kX implements BB<C10735bu> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C10735bu> continuation) throws java.lang.Throwable {
        StartPersonTrackingOperationDeserializer$deserialize$1 startPersonTrackingOperationDeserializer$deserialize$1;
        C10735bu.Activity activity;
        byte[] bArr;
        if (continuation instanceof StartPersonTrackingOperationDeserializer$deserialize$1) {
            startPersonTrackingOperationDeserializer$deserialize$1 = (StartPersonTrackingOperationDeserializer$deserialize$1) continuation;
            int i = startPersonTrackingOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startPersonTrackingOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startPersonTrackingOperationDeserializer$deserialize$1 = new StartPersonTrackingOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startPersonTrackingOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startPersonTrackingOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (C10735bu.Activity) startPersonTrackingOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C28265kV.copydefault(activity, bArr);
            }
            activity.KWHzl();
            return activity.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startPersonTrackingOperationDeserializer$deserialize$1.label = 1;
            if (C28265kV.KWHzl(dt, c58859zS, startPersonTrackingOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new C10735bu.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startPersonTrackingOperationDeserializer$deserialize$1.L$0 = activity;
        startPersonTrackingOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startPersonTrackingOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.KWHzl();
        return activity.OLrzqt();
    }
}
