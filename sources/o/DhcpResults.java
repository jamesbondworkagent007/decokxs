package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.UserPoolTaggingException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UserPoolTaggingExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DhcpResults implements BB<UserPoolTaggingException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UserPoolTaggingException> continuation) throws java.lang.Throwable {
        UserPoolTaggingExceptionDeserializer$deserialize$1 userPoolTaggingExceptionDeserializer$deserialize$1;
        UserPoolTaggingException.Activity activity;
        if (continuation instanceof UserPoolTaggingExceptionDeserializer$deserialize$1) {
            userPoolTaggingExceptionDeserializer$deserialize$1 = (UserPoolTaggingExceptionDeserializer$deserialize$1) continuation;
            int i = userPoolTaggingExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userPoolTaggingExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                userPoolTaggingExceptionDeserializer$deserialize$1 = new UserPoolTaggingExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = userPoolTaggingExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = userPoolTaggingExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            UserPoolTaggingException.Activity activity2 = new UserPoolTaggingException.Activity();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            userPoolTaggingExceptionDeserializer$deserialize$1.L$0 = activity2;
            userPoolTaggingExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, userPoolTaggingExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            activity = activity2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (UserPoolTaggingException.Activity) userPoolTaggingExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            InterfaceConfiguration.OLrzqt(activity, bArr);
        }
        activity.OLrzqt();
        return activity.EZpvd();
    }
}
