package o;

import aws.sdk.kotlin.services.comprehend.serde.DescribeSentimentDetectionJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.NfcA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ResolverTarget implements BB<NfcA> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super NfcA> continuation) throws java.lang.Throwable {
        DescribeSentimentDetectionJobOperationDeserializer$deserialize$1 describeSentimentDetectionJobOperationDeserializer$deserialize$1;
        NfcA.Application application;
        byte[] bArr;
        if (continuation instanceof DescribeSentimentDetectionJobOperationDeserializer$deserialize$1) {
            describeSentimentDetectionJobOperationDeserializer$deserialize$1 = (DescribeSentimentDetectionJobOperationDeserializer$deserialize$1) continuation;
            int i = describeSentimentDetectionJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeSentimentDetectionJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeSentimentDetectionJobOperationDeserializer$deserialize$1 = new DescribeSentimentDetectionJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeSentimentDetectionJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeSentimentDetectionJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (NfcA.Application) describeSentimentDetectionJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                RestrictionsReceiver.AEQbTJ(application, bArr);
            }
            application.KWHzl();
            return application.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeSentimentDetectionJobOperationDeserializer$deserialize$1.label = 1;
            if (RestrictionsReceiver.OLrzqt(dt, c58859zS, describeSentimentDetectionJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new NfcA.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeSentimentDetectionJobOperationDeserializer$deserialize$1.L$0 = application;
        describeSentimentDetectionJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeSentimentDetectionJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.KWHzl();
        return application.AEQbTJ();
    }
}
