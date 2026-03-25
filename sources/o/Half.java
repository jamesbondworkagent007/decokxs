package o;

import aws.sdk.kotlin.services.comprehend.serde.ListTopicsDetectionJobsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.StorageEventListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class Half implements BB<StorageEventListener> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super StorageEventListener> continuation) throws java.lang.Throwable {
        ListTopicsDetectionJobsOperationDeserializer$deserialize$1 listTopicsDetectionJobsOperationDeserializer$deserialize$1;
        StorageEventListener.Application application;
        byte[] bArr;
        if (continuation instanceof ListTopicsDetectionJobsOperationDeserializer$deserialize$1) {
            listTopicsDetectionJobsOperationDeserializer$deserialize$1 = (ListTopicsDetectionJobsOperationDeserializer$deserialize$1) continuation;
            int i = listTopicsDetectionJobsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listTopicsDetectionJobsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listTopicsDetectionJobsOperationDeserializer$deserialize$1 = new ListTopicsDetectionJobsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listTopicsDetectionJobsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listTopicsDetectionJobsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (StorageEventListener.Application) listTopicsDetectionJobsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                FeatureFlagUtils.OLrzqt(application, bArr);
            }
            application.EZpvd();
            return application.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listTopicsDetectionJobsOperationDeserializer$deserialize$1.label = 1;
            if (FeatureFlagUtils.AEQbTJ(dt, c58859zS, listTopicsDetectionJobsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new StorageEventListener.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listTopicsDetectionJobsOperationDeserializer$deserialize$1.L$0 = application;
        listTopicsDetectionJobsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listTopicsDetectionJobsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.EZpvd();
        return application.OLrzqt();
    }
}
