package o;

import aws.sdk.kotlin.services.comprehend.serde.StartPiiEntitiesDetectionJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.PreferenceGroup;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class Spline implements BB<PreferenceGroup> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super PreferenceGroup> continuation) throws java.lang.Throwable {
        StartPiiEntitiesDetectionJobOperationDeserializer$deserialize$1 startPiiEntitiesDetectionJobOperationDeserializer$deserialize$1;
        PreferenceGroup.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof StartPiiEntitiesDetectionJobOperationDeserializer$deserialize$1) {
            startPiiEntitiesDetectionJobOperationDeserializer$deserialize$1 = (StartPiiEntitiesDetectionJobOperationDeserializer$deserialize$1) continuation;
            int i = startPiiEntitiesDetectionJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startPiiEntitiesDetectionJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startPiiEntitiesDetectionJobOperationDeserializer$deserialize$1 = new StartPiiEntitiesDetectionJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startPiiEntitiesDetectionJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startPiiEntitiesDetectionJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (PreferenceGroup.ActionBar) startPiiEntitiesDetectionJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                SparseIntArray.AEQbTJ(actionBar, bArr);
            }
            actionBar.copydefault();
            return actionBar.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startPiiEntitiesDetectionJobOperationDeserializer$deserialize$1.label = 1;
            if (SparseIntArray.AEQbTJ(dt, c58859zS, startPiiEntitiesDetectionJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new PreferenceGroup.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startPiiEntitiesDetectionJobOperationDeserializer$deserialize$1.L$0 = actionBar;
        startPiiEntitiesDetectionJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startPiiEntitiesDetectionJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.copydefault();
        return actionBar.AEQbTJ();
    }
}
