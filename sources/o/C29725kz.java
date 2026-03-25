package o;

import aws.sdk.kotlin.services.rekognition.serde.StartContentModerationOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C10205bk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C29725kz implements BB<C10205bk> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C10205bk> continuation) throws java.lang.Throwable {
        StartContentModerationOperationDeserializer$deserialize$1 startContentModerationOperationDeserializer$deserialize$1;
        C10205bk.Activity activity;
        byte[] bArr;
        if (continuation instanceof StartContentModerationOperationDeserializer$deserialize$1) {
            startContentModerationOperationDeserializer$deserialize$1 = (StartContentModerationOperationDeserializer$deserialize$1) continuation;
            int i = startContentModerationOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startContentModerationOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startContentModerationOperationDeserializer$deserialize$1 = new StartContentModerationOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startContentModerationOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startContentModerationOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (C10205bk.Activity) startContentModerationOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C27697kA.copydefault(activity, bArr);
            }
            activity.KWHzl();
            return activity.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startContentModerationOperationDeserializer$deserialize$1.label = 1;
            if (C27697kA.AEQbTJ(dt, c58859zS, startContentModerationOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new C10205bk.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startContentModerationOperationDeserializer$deserialize$1.L$0 = activity;
        startContentModerationOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startContentModerationOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.KWHzl();
        return activity.copydefault();
    }
}
