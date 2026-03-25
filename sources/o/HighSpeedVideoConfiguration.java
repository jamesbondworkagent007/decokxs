package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.SetUICustomizationOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.SystemServiceRegistry;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class HighSpeedVideoConfiguration implements BB<SystemServiceRegistry> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super SystemServiceRegistry> continuation) throws java.lang.Throwable {
        SetUICustomizationOperationDeserializer$deserialize$1 setUICustomizationOperationDeserializer$deserialize$1;
        SystemServiceRegistry.Activity activity;
        byte[] bArr;
        if (continuation instanceof SetUICustomizationOperationDeserializer$deserialize$1) {
            setUICustomizationOperationDeserializer$deserialize$1 = (SetUICustomizationOperationDeserializer$deserialize$1) continuation;
            int i = setUICustomizationOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                setUICustomizationOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                setUICustomizationOperationDeserializer$deserialize$1 = new SetUICustomizationOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = setUICustomizationOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = setUICustomizationOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (SystemServiceRegistry.Activity) setUICustomizationOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                LensShadingMap.AEQbTJ(activity, bArr);
            }
            activity.AEQbTJ();
            return activity.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            setUICustomizationOperationDeserializer$deserialize$1.label = 1;
            if (LensShadingMap.AEQbTJ(dt, c58859zS, setUICustomizationOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new SystemServiceRegistry.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        setUICustomizationOperationDeserializer$deserialize$1.L$0 = activity;
        setUICustomizationOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, setUICustomizationOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.AEQbTJ();
        return activity.copydefault();
    }
}
