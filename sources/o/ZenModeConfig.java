package o;

import aws.sdk.kotlin.services.comprehend.serde.DescribeKeyPhrasesDetectionJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.MifareClassic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ZenModeConfig implements BB<MifareClassic> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super MifareClassic> continuation) throws java.lang.Throwable {
        DescribeKeyPhrasesDetectionJobOperationDeserializer$deserialize$1 describeKeyPhrasesDetectionJobOperationDeserializer$deserialize$1;
        MifareClassic.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof DescribeKeyPhrasesDetectionJobOperationDeserializer$deserialize$1) {
            describeKeyPhrasesDetectionJobOperationDeserializer$deserialize$1 = (DescribeKeyPhrasesDetectionJobOperationDeserializer$deserialize$1) continuation;
            int i = describeKeyPhrasesDetectionJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeKeyPhrasesDetectionJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeKeyPhrasesDetectionJobOperationDeserializer$deserialize$1 = new DescribeKeyPhrasesDetectionJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeKeyPhrasesDetectionJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeKeyPhrasesDetectionJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (MifareClassic.ActionBar) describeKeyPhrasesDetectionJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                SnoozeCriterion.EZpvd(actionBar, bArr);
            }
            actionBar.AEQbTJ();
            return actionBar.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeKeyPhrasesDetectionJobOperationDeserializer$deserialize$1.label = 1;
            if (SnoozeCriterion.AEQbTJ(dt, c58859zS, describeKeyPhrasesDetectionJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new MifareClassic.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeKeyPhrasesDetectionJobOperationDeserializer$deserialize$1.L$0 = actionBar;
        describeKeyPhrasesDetectionJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeKeyPhrasesDetectionJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.AEQbTJ();
        return actionBar.OLrzqt();
    }
}
