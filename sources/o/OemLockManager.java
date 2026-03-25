package o;

import aws.sdk.kotlin.services.comprehend.serde.DescribeResourcePolicyOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Ndef;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class OemLockManager implements BB<Ndef> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Ndef> continuation) throws java.lang.Throwable {
        DescribeResourcePolicyOperationDeserializer$deserialize$1 describeResourcePolicyOperationDeserializer$deserialize$1;
        Ndef.Application application;
        byte[] bArr;
        if (continuation instanceof DescribeResourcePolicyOperationDeserializer$deserialize$1) {
            describeResourcePolicyOperationDeserializer$deserialize$1 = (DescribeResourcePolicyOperationDeserializer$deserialize$1) continuation;
            int i = describeResourcePolicyOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeResourcePolicyOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeResourcePolicyOperationDeserializer$deserialize$1 = new DescribeResourcePolicyOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeResourcePolicyOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeResourcePolicyOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (Ndef.Application) describeResourcePolicyOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                TileService.EZpvd(application, bArr);
            }
            application.EZpvd();
            return application.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeResourcePolicyOperationDeserializer$deserialize$1.label = 1;
            if (TileService.KWHzl(dt, c58859zS, describeResourcePolicyOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new Ndef.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeResourcePolicyOperationDeserializer$deserialize$1.L$0 = application;
        describeResourcePolicyOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeResourcePolicyOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.EZpvd();
        return application.AEQbTJ();
    }
}
