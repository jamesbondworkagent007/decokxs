package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateGroupOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ObjectAnimator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PeriodicSync implements BB<ObjectAnimator> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ObjectAnimator> continuation) throws java.lang.Throwable {
        CreateGroupOperationDeserializer$deserialize$1 createGroupOperationDeserializer$deserialize$1;
        ObjectAnimator.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof CreateGroupOperationDeserializer$deserialize$1) {
            createGroupOperationDeserializer$deserialize$1 = (CreateGroupOperationDeserializer$deserialize$1) continuation;
            int i = createGroupOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createGroupOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                createGroupOperationDeserializer$deserialize$1 = new CreateGroupOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = createGroupOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = createGroupOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (ObjectAnimator.StateListAnimator) createGroupOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                RestrictionEntry.EZpvd(stateListAnimator, bArr);
            }
            stateListAnimator.OLrzqt();
            return stateListAnimator.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            createGroupOperationDeserializer$deserialize$1.label = 1;
            if (RestrictionEntry.KWHzl(dt, c58859zS, createGroupOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new ObjectAnimator.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        createGroupOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        createGroupOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, createGroupOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.OLrzqt();
        return stateListAnimator.copydefault();
    }
}
