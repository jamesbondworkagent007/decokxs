package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.GlobalSignOutOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ApplicationPackageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteDirectCursorDriver implements BB<ApplicationPackageManager> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ApplicationPackageManager> continuation) throws java.lang.Throwable {
        GlobalSignOutOperationDeserializer$deserialize$1 globalSignOutOperationDeserializer$deserialize$1;
        if (continuation instanceof GlobalSignOutOperationDeserializer$deserialize$1) {
            globalSignOutOperationDeserializer$deserialize$1 = (GlobalSignOutOperationDeserializer$deserialize$1) continuation;
            int i = globalSignOutOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                globalSignOutOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                globalSignOutOperationDeserializer$deserialize$1 = new GlobalSignOutOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = globalSignOutOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = globalSignOutOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                globalSignOutOperationDeserializer$deserialize$1.label = 1;
                if (SQLiteGlobal.EZpvd(dt, c58859zS, globalSignOutOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                ApplicationPackageManager.ActionBar actionBar = new ApplicationPackageManager.ActionBar();
                actionBar.copydefault();
                return actionBar.AEQbTJ();
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
