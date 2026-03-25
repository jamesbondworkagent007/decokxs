package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.SetUserPoolMfaConfigOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.TabActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class OisSample implements BB<TabActivity> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super TabActivity> continuation) throws java.lang.Throwable {
        SetUserPoolMfaConfigOperationDeserializer$deserialize$1 setUserPoolMfaConfigOperationDeserializer$deserialize$1;
        TabActivity.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof SetUserPoolMfaConfigOperationDeserializer$deserialize$1) {
            setUserPoolMfaConfigOperationDeserializer$deserialize$1 = (SetUserPoolMfaConfigOperationDeserializer$deserialize$1) continuation;
            int i = setUserPoolMfaConfigOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                setUserPoolMfaConfigOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                setUserPoolMfaConfigOperationDeserializer$deserialize$1 = new SetUserPoolMfaConfigOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = setUserPoolMfaConfigOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = setUserPoolMfaConfigOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (TabActivity.ActionBar) setUserPoolMfaConfigOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                VendorTagDescriptor.copydefault(actionBar, bArr);
            }
            actionBar.EZpvd();
            return actionBar.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            setUserPoolMfaConfigOperationDeserializer$deserialize$1.label = 1;
            if (VendorTagDescriptor.KWHzl(dt, c58859zS, setUserPoolMfaConfigOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new TabActivity.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        setUserPoolMfaConfigOperationDeserializer$deserialize$1.L$0 = actionBar;
        setUserPoolMfaConfigOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, setUserPoolMfaConfigOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.EZpvd();
        return actionBar.OLrzqt();
    }
}
