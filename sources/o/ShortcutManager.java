package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.DescribeRiskConfigurationOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.IdRes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ShortcutManager implements BB<IdRes> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super IdRes> continuation) throws java.lang.Throwable {
        DescribeRiskConfigurationOperationDeserializer$deserialize$1 describeRiskConfigurationOperationDeserializer$deserialize$1;
        IdRes.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof DescribeRiskConfigurationOperationDeserializer$deserialize$1) {
            describeRiskConfigurationOperationDeserializer$deserialize$1 = (DescribeRiskConfigurationOperationDeserializer$deserialize$1) continuation;
            int i = describeRiskConfigurationOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeRiskConfigurationOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeRiskConfigurationOperationDeserializer$deserialize$1 = new DescribeRiskConfigurationOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeRiskConfigurationOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeRiskConfigurationOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (IdRes.TaskDescription) describeRiskConfigurationOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                SigningInfo.KWHzl(taskDescription, bArr);
            }
            taskDescription.AEQbTJ();
            return taskDescription.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeRiskConfigurationOperationDeserializer$deserialize$1.label = 1;
            if (SigningInfo.OLrzqt(dt, c58859zS, describeRiskConfigurationOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new IdRes.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeRiskConfigurationOperationDeserializer$deserialize$1.L$0 = taskDescription;
        describeRiskConfigurationOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeRiskConfigurationOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.AEQbTJ();
        return taskDescription.KWHzl();
    }
}
