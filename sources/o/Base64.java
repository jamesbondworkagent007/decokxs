package o;

import aws.sdk.kotlin.services.comprehend.serde.ListPiiEntitiesDetectionJobsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.WifiBatteryStats;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class Base64 implements BB<WifiBatteryStats> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super WifiBatteryStats> continuation) throws java.lang.Throwable {
        ListPiiEntitiesDetectionJobsOperationDeserializer$deserialize$1 listPiiEntitiesDetectionJobsOperationDeserializer$deserialize$1;
        WifiBatteryStats.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof ListPiiEntitiesDetectionJobsOperationDeserializer$deserialize$1) {
            listPiiEntitiesDetectionJobsOperationDeserializer$deserialize$1 = (ListPiiEntitiesDetectionJobsOperationDeserializer$deserialize$1) continuation;
            int i = listPiiEntitiesDetectionJobsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listPiiEntitiesDetectionJobsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listPiiEntitiesDetectionJobsOperationDeserializer$deserialize$1 = new ListPiiEntitiesDetectionJobsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listPiiEntitiesDetectionJobsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listPiiEntitiesDetectionJobsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (WifiBatteryStats.ActionBar) listPiiEntitiesDetectionJobsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                Base64OutputStream.copydefault(actionBar, bArr);
            }
            actionBar.EZpvd();
            return actionBar.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listPiiEntitiesDetectionJobsOperationDeserializer$deserialize$1.label = 1;
            if (Base64OutputStream.copydefault(dt, c58859zS, listPiiEntitiesDetectionJobsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new WifiBatteryStats.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listPiiEntitiesDetectionJobsOperationDeserializer$deserialize$1.L$0 = actionBar;
        listPiiEntitiesDetectionJobsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listPiiEntitiesDetectionJobsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.EZpvd();
        return actionBar.copydefault();
    }
}
