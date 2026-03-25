package o;

import aws.sdk.kotlin.services.cognitoidentity.serde.SetIdentityPoolRolesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Redirect;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class RSAPrivateKeySpec implements BB<Redirect> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Redirect> continuation) throws java.lang.Throwable {
        SetIdentityPoolRolesOperationDeserializer$deserialize$1 setIdentityPoolRolesOperationDeserializer$deserialize$1;
        if (continuation instanceof SetIdentityPoolRolesOperationDeserializer$deserialize$1) {
            setIdentityPoolRolesOperationDeserializer$deserialize$1 = (SetIdentityPoolRolesOperationDeserializer$deserialize$1) continuation;
            int i = setIdentityPoolRolesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                setIdentityPoolRolesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                setIdentityPoolRolesOperationDeserializer$deserialize$1 = new SetIdentityPoolRolesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = setIdentityPoolRolesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = setIdentityPoolRolesOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                setIdentityPoolRolesOperationDeserializer$deserialize$1.label = 1;
                if (X509EncodedKeySpec.AEQbTJ(dt, c58859zS, setIdentityPoolRolesOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                Redirect.ActionBar actionBar = new Redirect.ActionBar();
                actionBar.KWHzl();
                return actionBar.OLrzqt();
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
