package o;

import aws.sdk.kotlin.services.comprehend.serde.UpdateEndpointOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.CalendarContract;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SoundEffectConstants implements BB<CalendarContract> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super CalendarContract> continuation) throws java.lang.Throwable {
        UpdateEndpointOperationDeserializer$deserialize$1 updateEndpointOperationDeserializer$deserialize$1;
        CalendarContract.Activity activity;
        byte[] bArr;
        if (continuation instanceof UpdateEndpointOperationDeserializer$deserialize$1) {
            updateEndpointOperationDeserializer$deserialize$1 = (UpdateEndpointOperationDeserializer$deserialize$1) continuation;
            int i = updateEndpointOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateEndpointOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                updateEndpointOperationDeserializer$deserialize$1 = new UpdateEndpointOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = updateEndpointOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = updateEndpointOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (CalendarContract.Activity) updateEndpointOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                RoundScrollbarRenderer.copydefault(activity, bArr);
            }
            activity.OLrzqt();
            return activity.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            updateEndpointOperationDeserializer$deserialize$1.label = 1;
            if (RoundScrollbarRenderer.copydefault(dt, c58859zS, updateEndpointOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new CalendarContract.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        updateEndpointOperationDeserializer$deserialize$1.L$0 = activity;
        updateEndpointOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, updateEndpointOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.OLrzqt();
        return activity.copydefault();
    }
}
