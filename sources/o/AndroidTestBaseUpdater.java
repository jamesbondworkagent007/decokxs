package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserPoolOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ValueAnimator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AndroidTestBaseUpdater implements BB<ValueAnimator> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ValueAnimator> continuation) throws java.lang.Throwable {
        CreateUserPoolOperationDeserializer$deserialize$1 createUserPoolOperationDeserializer$deserialize$1;
        ValueAnimator.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof CreateUserPoolOperationDeserializer$deserialize$1) {
            createUserPoolOperationDeserializer$deserialize$1 = (CreateUserPoolOperationDeserializer$deserialize$1) continuation;
            int i = createUserPoolOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createUserPoolOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                createUserPoolOperationDeserializer$deserialize$1 = new CreateUserPoolOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = createUserPoolOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = createUserPoolOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (ValueAnimator.ActionBar) createUserPoolOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                OverlayInfo.EZpvd(actionBar, bArr);
            }
            actionBar.OLrzqt();
            return actionBar.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            createUserPoolOperationDeserializer$deserialize$1.label = 1;
            if (OverlayInfo.KWHzl(dt, c58859zS, createUserPoolOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new ValueAnimator.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        createUserPoolOperationDeserializer$deserialize$1.L$0 = actionBar;
        createUserPoolOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, createUserPoolOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.OLrzqt();
        return actionBar.EZpvd();
    }
}
