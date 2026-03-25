package o;

import aws.sdk.kotlin.runtime.auth.credentials.EcsCredentialsDeserializer$deserialize$1;
import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.LocaleList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Uri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5515Uri implements BB<InterfaceC52697wV> {
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InterfaceC52697wV> continuation) throws java.lang.Throwable {
        EcsCredentialsDeserializer$deserialize$1 ecsCredentialsDeserializer$deserialize$1;
        byte[] bArr;
        if (continuation instanceof EcsCredentialsDeserializer$deserialize$1) {
            ecsCredentialsDeserializer$deserialize$1 = (EcsCredentialsDeserializer$deserialize$1) continuation;
            int i = ecsCredentialsDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ecsCredentialsDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                ecsCredentialsDeserializer$deserialize$1 = new EcsCredentialsDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = ecsCredentialsDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = ecsCredentialsDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
                ecsCredentialsDeserializer$deserialize$1.label = 1;
                if (Callback.EZpvd(interfaceC5039CjAEQbTJ, ecsCredentialsDeserializer$deserialize$1) == objCopydefault2) {
                    return objCopydefault2;
                }
                throw new KotlinNothingValueException();
            }
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            ecsCredentialsDeserializer$deserialize$1.label = 2;
            objCopydefault = C58752zO.copydefault(zPVarEZpvd, ecsCredentialsDeserializer$deserialize$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
            }
        } else {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 == 2) {
                C56391yDq.AEQbTJ(objCopydefault);
                bArr = (byte[]) objCopydefault;
                if (bArr != null) {
                    throw new CredentialsProviderException("HTTP credentials response did not contain a payload", null, 2, null);
                }
                EL el = new EL(bArr);
                ecsCredentialsDeserializer$deserialize$1.label = 3;
                objCopydefault = Creator.KWHzl(el, ecsCredentialsDeserializer$deserialize$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
        }
        LocaleList localeList = (LocaleList) objCopydefault;
        if (!(localeList instanceof LocaleList.TaskDescription)) {
            throw new CredentialsProviderException("HTTP credentials response was not of expected format", null, 2, null);
        }
        LocaleList.TaskDescription taskDescription = (LocaleList.TaskDescription) localeList;
        return Spanned.AEQbTJ(taskDescription.KWHzl(), taskDescription.copydefault(), taskDescription.EZpvd(), taskDescription.AEQbTJ(), "EcsContainer", taskDescription.OLrzqt());
    }
}
