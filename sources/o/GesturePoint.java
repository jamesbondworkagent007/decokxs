package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidSmsRoleTrustRelationshipException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.InvalidSmsRoleTrustRelationshipExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class GesturePoint implements BB<InvalidSmsRoleTrustRelationshipException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidSmsRoleTrustRelationshipException> continuation) throws java.lang.Throwable {
        InvalidSmsRoleTrustRelationshipExceptionDeserializer$deserialize$1 invalidSmsRoleTrustRelationshipExceptionDeserializer$deserialize$1;
        InvalidSmsRoleTrustRelationshipException.ActionBar actionBar;
        if (continuation instanceof InvalidSmsRoleTrustRelationshipExceptionDeserializer$deserialize$1) {
            invalidSmsRoleTrustRelationshipExceptionDeserializer$deserialize$1 = (InvalidSmsRoleTrustRelationshipExceptionDeserializer$deserialize$1) continuation;
            int i = invalidSmsRoleTrustRelationshipExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidSmsRoleTrustRelationshipExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidSmsRoleTrustRelationshipExceptionDeserializer$deserialize$1 = new InvalidSmsRoleTrustRelationshipExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidSmsRoleTrustRelationshipExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidSmsRoleTrustRelationshipExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidSmsRoleTrustRelationshipException.ActionBar actionBar2 = new InvalidSmsRoleTrustRelationshipException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidSmsRoleTrustRelationshipExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            invalidSmsRoleTrustRelationshipExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidSmsRoleTrustRelationshipExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (InvalidSmsRoleTrustRelationshipException.ActionBar) invalidSmsRoleTrustRelationshipExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            GestureLibrary.OLrzqt(actionBar, bArr);
        }
        actionBar.AEQbTJ();
        return actionBar.OLrzqt();
    }
}
