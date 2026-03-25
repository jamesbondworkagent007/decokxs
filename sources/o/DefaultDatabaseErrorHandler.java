package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.GetIdentityProviderByIdentifierOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ActivityView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DefaultDatabaseErrorHandler implements BB<ActivityView> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ActivityView> continuation) throws java.lang.Throwable {
        GetIdentityProviderByIdentifierOperationDeserializer$deserialize$1 getIdentityProviderByIdentifierOperationDeserializer$deserialize$1;
        ActivityView.Activity activity;
        byte[] bArr;
        if (continuation instanceof GetIdentityProviderByIdentifierOperationDeserializer$deserialize$1) {
            getIdentityProviderByIdentifierOperationDeserializer$deserialize$1 = (GetIdentityProviderByIdentifierOperationDeserializer$deserialize$1) continuation;
            int i = getIdentityProviderByIdentifierOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getIdentityProviderByIdentifierOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getIdentityProviderByIdentifierOperationDeserializer$deserialize$1 = new GetIdentityProviderByIdentifierOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getIdentityProviderByIdentifierOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getIdentityProviderByIdentifierOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (ActivityView.Activity) getIdentityProviderByIdentifierOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                IBulkCursor.copydefault(activity, bArr);
            }
            activity.EZpvd();
            return activity.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getIdentityProviderByIdentifierOperationDeserializer$deserialize$1.label = 1;
            if (IBulkCursor.EZpvd(dt, c58859zS, getIdentityProviderByIdentifierOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new ActivityView.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getIdentityProviderByIdentifierOperationDeserializer$deserialize$1.L$0 = activity;
        getIdentityProviderByIdentifierOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getIdentityProviderByIdentifierOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.EZpvd();
        return activity.KWHzl();
    }
}
