package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateUserImportJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.TimeAnimator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SyncRequest implements BB<TimeAnimator> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super TimeAnimator> continuation) throws java.lang.Throwable {
        CreateUserImportJobOperationDeserializer$deserialize$1 createUserImportJobOperationDeserializer$deserialize$1;
        TimeAnimator.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof CreateUserImportJobOperationDeserializer$deserialize$1) {
            createUserImportJobOperationDeserializer$deserialize$1 = (CreateUserImportJobOperationDeserializer$deserialize$1) continuation;
            int i = createUserImportJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createUserImportJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                createUserImportJobOperationDeserializer$deserialize$1 = new CreateUserImportJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = createUserImportJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = createUserImportJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (TimeAnimator.StateListAnimator) createUserImportJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                SyncStatusObserver.copydefault(stateListAnimator, bArr);
            }
            stateListAnimator.AEQbTJ();
            return stateListAnimator.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            createUserImportJobOperationDeserializer$deserialize$1.label = 1;
            if (SyncStatusObserver.EZpvd(dt, c58859zS, createUserImportJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new TimeAnimator.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        createUserImportJobOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        createUserImportJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, createUserImportJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.AEQbTJ();
        return stateListAnimator.copydefault();
    }
}
