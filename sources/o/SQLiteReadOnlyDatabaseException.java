package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.InitiateAuthOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.DialogFragment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteReadOnlyDatabaseException implements BB<DialogFragment> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super DialogFragment> continuation) throws java.lang.Throwable {
        InitiateAuthOperationDeserializer$deserialize$1 initiateAuthOperationDeserializer$deserialize$1;
        DialogFragment.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof InitiateAuthOperationDeserializer$deserialize$1) {
            initiateAuthOperationDeserializer$deserialize$1 = (InitiateAuthOperationDeserializer$deserialize$1) continuation;
            int i = initiateAuthOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                initiateAuthOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                initiateAuthOperationDeserializer$deserialize$1 = new InitiateAuthOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = initiateAuthOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = initiateAuthOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (DialogFragment.ActionBar) initiateAuthOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                SQLiteQuery.OLrzqt(actionBar, bArr);
            }
            actionBar.OLrzqt();
            return actionBar.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            initiateAuthOperationDeserializer$deserialize$1.label = 1;
            if (SQLiteQuery.OLrzqt(dt, c58859zS, initiateAuthOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new DialogFragment.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        initiateAuthOperationDeserializer$deserialize$1.L$0 = actionBar;
        initiateAuthOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, initiateAuthOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.OLrzqt();
        return actionBar.copydefault();
    }
}
