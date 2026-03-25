package o;

import aws.sdk.kotlin.services.comprehend.serde.StartTargetedSentimentDetectionJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.PreferenceScreen;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class TimingLogger implements BB<PreferenceScreen> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super PreferenceScreen> continuation) throws java.lang.Throwable {
        StartTargetedSentimentDetectionJobOperationDeserializer$deserialize$1 startTargetedSentimentDetectionJobOperationDeserializer$deserialize$1;
        PreferenceScreen.Application application;
        byte[] bArr;
        if (continuation instanceof StartTargetedSentimentDetectionJobOperationDeserializer$deserialize$1) {
            startTargetedSentimentDetectionJobOperationDeserializer$deserialize$1 = (StartTargetedSentimentDetectionJobOperationDeserializer$deserialize$1) continuation;
            int i = startTargetedSentimentDetectionJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startTargetedSentimentDetectionJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startTargetedSentimentDetectionJobOperationDeserializer$deserialize$1 = new StartTargetedSentimentDetectionJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startTargetedSentimentDetectionJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startTargetedSentimentDetectionJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (PreferenceScreen.Application) startTargetedSentimentDetectionJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                TypedValue.copydefault(application, bArr);
            }
            application.AEQbTJ();
            return application.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startTargetedSentimentDetectionJobOperationDeserializer$deserialize$1.label = 1;
            if (TypedValue.EZpvd(dt, c58859zS, startTargetedSentimentDetectionJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new PreferenceScreen.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startTargetedSentimentDetectionJobOperationDeserializer$deserialize$1.L$0 = application;
        startTargetedSentimentDetectionJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startTargetedSentimentDetectionJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.AEQbTJ();
        return application.KWHzl();
    }
}
