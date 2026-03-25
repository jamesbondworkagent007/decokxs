package o;

import aws.sdk.kotlin.services.comprehend.serde.DescribePiiEntitiesDetectionJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.IsoDep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ScheduleCalendar implements BB<IsoDep> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super IsoDep> continuation) throws java.lang.Throwable {
        DescribePiiEntitiesDetectionJobOperationDeserializer$deserialize$1 describePiiEntitiesDetectionJobOperationDeserializer$deserialize$1;
        IsoDep.Activity activity;
        byte[] bArr;
        if (continuation instanceof DescribePiiEntitiesDetectionJobOperationDeserializer$deserialize$1) {
            describePiiEntitiesDetectionJobOperationDeserializer$deserialize$1 = (DescribePiiEntitiesDetectionJobOperationDeserializer$deserialize$1) continuation;
            int i = describePiiEntitiesDetectionJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describePiiEntitiesDetectionJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describePiiEntitiesDetectionJobOperationDeserializer$deserialize$1 = new DescribePiiEntitiesDetectionJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describePiiEntitiesDetectionJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describePiiEntitiesDetectionJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (IsoDep.Activity) describePiiEntitiesDetectionJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                PersistentDataBlockManager.KWHzl(activity, bArr);
            }
            activity.AEQbTJ();
            return activity.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describePiiEntitiesDetectionJobOperationDeserializer$deserialize$1.label = 1;
            if (PersistentDataBlockManager.AEQbTJ(dt, c58859zS, describePiiEntitiesDetectionJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new IsoDep.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describePiiEntitiesDetectionJobOperationDeserializer$deserialize$1.L$0 = activity;
        describePiiEntitiesDetectionJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describePiiEntitiesDetectionJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.AEQbTJ();
        return activity.copydefault();
    }
}
