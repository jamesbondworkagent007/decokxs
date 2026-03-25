package o;

import aws.sdk.kotlin.services.cognitoidentity.serde.UnlinkDeveloperIdentityOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Readable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class Hashtable implements BB<Readable> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Readable> continuation) throws java.lang.Throwable {
        UnlinkDeveloperIdentityOperationDeserializer$deserialize$1 unlinkDeveloperIdentityOperationDeserializer$deserialize$1;
        if (continuation instanceof UnlinkDeveloperIdentityOperationDeserializer$deserialize$1) {
            unlinkDeveloperIdentityOperationDeserializer$deserialize$1 = (UnlinkDeveloperIdentityOperationDeserializer$deserialize$1) continuation;
            int i = unlinkDeveloperIdentityOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unlinkDeveloperIdentityOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                unlinkDeveloperIdentityOperationDeserializer$deserialize$1 = new UnlinkDeveloperIdentityOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = unlinkDeveloperIdentityOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unlinkDeveloperIdentityOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                unlinkDeveloperIdentityOperationDeserializer$deserialize$1.label = 1;
                if (List.OLrzqt(dt, c58859zS, unlinkDeveloperIdentityOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                Readable.Activity activity = new Readable.Activity();
                activity.AEQbTJ();
                return activity.EZpvd();
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
