package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.serde.CreateTokenOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.OnCapturedPointerListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OnFocusChangeListener implements BB<OnCapturedPointerListener> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super OnCapturedPointerListener> continuation) throws java.lang.Throwable {
        CreateTokenOperationDeserializer$deserialize$1 createTokenOperationDeserializer$deserialize$1;
        OnCapturedPointerListener.Activity activity;
        byte[] bArr;
        if (continuation instanceof CreateTokenOperationDeserializer$deserialize$1) {
            createTokenOperationDeserializer$deserialize$1 = (CreateTokenOperationDeserializer$deserialize$1) continuation;
            int i = createTokenOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createTokenOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                createTokenOperationDeserializer$deserialize$1 = new CreateTokenOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = createTokenOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = createTokenOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (OnCapturedPointerListener.Activity) createTokenOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                OnHoverListener.EZpvd(activity, bArr);
            }
            activity.KWHzl();
            return activity.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            createTokenOperationDeserializer$deserialize$1.label = 1;
            if (OnHoverListener.EZpvd(dt, c58859zS, createTokenOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new OnCapturedPointerListener.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        createTokenOperationDeserializer$deserialize$1.L$0 = activity;
        createTokenOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, createTokenOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.KWHzl();
        return activity.OLrzqt();
    }
}
