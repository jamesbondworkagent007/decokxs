package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.RespondToAuthChallengeOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.RecoverableSecurityException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MarshalQueryableBlackLevelPattern implements BB<RecoverableSecurityException> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super RecoverableSecurityException> continuation) throws java.lang.Throwable {
        RespondToAuthChallengeOperationDeserializer$deserialize$1 respondToAuthChallengeOperationDeserializer$deserialize$1;
        RecoverableSecurityException.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof RespondToAuthChallengeOperationDeserializer$deserialize$1) {
            respondToAuthChallengeOperationDeserializer$deserialize$1 = (RespondToAuthChallengeOperationDeserializer$deserialize$1) continuation;
            int i = respondToAuthChallengeOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                respondToAuthChallengeOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                respondToAuthChallengeOperationDeserializer$deserialize$1 = new RespondToAuthChallengeOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = respondToAuthChallengeOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = respondToAuthChallengeOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (RecoverableSecurityException.TaskDescription) respondToAuthChallengeOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                MarshalQueryable.OLrzqt(taskDescription, bArr);
            }
            taskDescription.OLrzqt();
            return taskDescription.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            respondToAuthChallengeOperationDeserializer$deserialize$1.label = 1;
            if (MarshalQueryable.copydefault(dt, c58859zS, respondToAuthChallengeOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new RecoverableSecurityException.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        respondToAuthChallengeOperationDeserializer$deserialize$1.L$0 = taskDescription;
        respondToAuthChallengeOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, respondToAuthChallengeOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.OLrzqt();
        return taskDescription.KWHzl();
    }
}
