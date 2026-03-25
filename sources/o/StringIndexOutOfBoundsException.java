package o;

import aws.sdk.kotlin.services.cognitoidentity.serde.CreateIdentityPoolOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Comparable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class StringIndexOutOfBoundsException implements BB<Comparable> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Comparable> continuation) throws java.lang.Throwable {
        CreateIdentityPoolOperationDeserializer$deserialize$1 createIdentityPoolOperationDeserializer$deserialize$1;
        Comparable.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof CreateIdentityPoolOperationDeserializer$deserialize$1) {
            createIdentityPoolOperationDeserializer$deserialize$1 = (CreateIdentityPoolOperationDeserializer$deserialize$1) continuation;
            int i = createIdentityPoolOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createIdentityPoolOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                createIdentityPoolOperationDeserializer$deserialize$1 = new CreateIdentityPoolOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = createIdentityPoolOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = createIdentityPoolOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (Comparable.ActionBar) createIdentityPoolOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                System.copydefault(actionBar, bArr);
            }
            actionBar.AEQbTJ();
            return actionBar.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            createIdentityPoolOperationDeserializer$deserialize$1.label = 1;
            if (System.OLrzqt(dt, c58859zS, createIdentityPoolOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new Comparable.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        createIdentityPoolOperationDeserializer$deserialize$1.L$0 = actionBar;
        createIdentityPoolOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, createIdentityPoolOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.AEQbTJ();
        return actionBar.EZpvd();
    }
}
