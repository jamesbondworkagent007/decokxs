package o;

import aws.sdk.kotlin.services.cognitoidentity.serde.MergeDeveloperIdentitiesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.NumberFormatException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ECPrivateKeySpec implements BB<NumberFormatException> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super NumberFormatException> continuation) throws java.lang.Throwable {
        MergeDeveloperIdentitiesOperationDeserializer$deserialize$1 mergeDeveloperIdentitiesOperationDeserializer$deserialize$1;
        NumberFormatException.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof MergeDeveloperIdentitiesOperationDeserializer$deserialize$1) {
            mergeDeveloperIdentitiesOperationDeserializer$deserialize$1 = (MergeDeveloperIdentitiesOperationDeserializer$deserialize$1) continuation;
            int i = mergeDeveloperIdentitiesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mergeDeveloperIdentitiesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                mergeDeveloperIdentitiesOperationDeserializer$deserialize$1 = new MergeDeveloperIdentitiesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = mergeDeveloperIdentitiesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = mergeDeveloperIdentitiesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (NumberFormatException.ActionBar) mergeDeveloperIdentitiesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                EllipticCurve.OLrzqt(actionBar, bArr);
            }
            actionBar.copydefault();
            return actionBar.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            mergeDeveloperIdentitiesOperationDeserializer$deserialize$1.label = 1;
            if (EllipticCurve.KWHzl(dt, c58859zS, mergeDeveloperIdentitiesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new NumberFormatException.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        mergeDeveloperIdentitiesOperationDeserializer$deserialize$1.L$0 = actionBar;
        mergeDeveloperIdentitiesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, mergeDeveloperIdentitiesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.copydefault();
        return actionBar.OLrzqt();
    }
}
