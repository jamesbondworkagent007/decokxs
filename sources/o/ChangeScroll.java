package o;

import aws.sdk.kotlin.services.comprehend.serde.ListEntitiesDetectionJobsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.UpdateEngineCallback;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ChangeScroll implements BB<UpdateEngineCallback> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UpdateEngineCallback> continuation) throws java.lang.Throwable {
        ListEntitiesDetectionJobsOperationDeserializer$deserialize$1 listEntitiesDetectionJobsOperationDeserializer$deserialize$1;
        UpdateEngineCallback.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof ListEntitiesDetectionJobsOperationDeserializer$deserialize$1) {
            listEntitiesDetectionJobsOperationDeserializer$deserialize$1 = (ListEntitiesDetectionJobsOperationDeserializer$deserialize$1) continuation;
            int i = listEntitiesDetectionJobsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listEntitiesDetectionJobsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listEntitiesDetectionJobsOperationDeserializer$deserialize$1 = new ListEntitiesDetectionJobsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listEntitiesDetectionJobsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listEntitiesDetectionJobsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (UpdateEngineCallback.ActionBar) listEntitiesDetectionJobsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                Explode.AEQbTJ(actionBar, bArr);
            }
            actionBar.KWHzl();
            return actionBar.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listEntitiesDetectionJobsOperationDeserializer$deserialize$1.label = 1;
            if (Explode.copydefault(dt, c58859zS, listEntitiesDetectionJobsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new UpdateEngineCallback.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listEntitiesDetectionJobsOperationDeserializer$deserialize$1.L$0 = actionBar;
        listEntitiesDetectionJobsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listEntitiesDetectionJobsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.KWHzl();
        return actionBar.copydefault();
    }
}
