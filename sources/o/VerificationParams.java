package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.DescribeUserImportJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.LongDef;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class VerificationParams implements BB<LongDef> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super LongDef> continuation) throws java.lang.Throwable {
        DescribeUserImportJobOperationDeserializer$deserialize$1 describeUserImportJobOperationDeserializer$deserialize$1;
        LongDef.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof DescribeUserImportJobOperationDeserializer$deserialize$1) {
            describeUserImportJobOperationDeserializer$deserialize$1 = (DescribeUserImportJobOperationDeserializer$deserialize$1) continuation;
            int i = describeUserImportJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeUserImportJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeUserImportJobOperationDeserializer$deserialize$1 = new DescribeUserImportJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeUserImportJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeUserImportJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (LongDef.StateListAnimator) describeUserImportJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                VerifierDeviceIdentity.KWHzl(stateListAnimator, bArr);
            }
            stateListAnimator.OLrzqt();
            return stateListAnimator.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeUserImportJobOperationDeserializer$deserialize$1.label = 1;
            if (VerifierDeviceIdentity.OLrzqt(dt, c58859zS, describeUserImportJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new LongDef.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeUserImportJobOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        describeUserImportJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeUserImportJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.OLrzqt();
        return stateListAnimator.copydefault();
    }
}
