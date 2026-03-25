package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.sso.model.UnauthorizedException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sso.serde.UnauthorizedExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflater implements BB<UnauthorizedException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UnauthorizedException> continuation) throws java.lang.Throwable {
        UnauthorizedExceptionDeserializer$deserialize$1 unauthorizedExceptionDeserializer$deserialize$1;
        UnauthorizedException.Activity activity;
        if (continuation instanceof UnauthorizedExceptionDeserializer$deserialize$1) {
            unauthorizedExceptionDeserializer$deserialize$1 = (UnauthorizedExceptionDeserializer$deserialize$1) continuation;
            int i = unauthorizedExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unauthorizedExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                unauthorizedExceptionDeserializer$deserialize$1 = new UnauthorizedExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = unauthorizedExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unauthorizedExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            UnauthorizedException.Activity activity2 = new UnauthorizedException.Activity();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            unauthorizedExceptionDeserializer$deserialize$1.L$0 = activity2;
            unauthorizedExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, unauthorizedExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            activity = activity2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (UnauthorizedException.Activity) unauthorizedExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            DispatcherState.OLrzqt(activity, bArr);
        }
        activity.EZpvd();
        return activity.OLrzqt();
    }
}
