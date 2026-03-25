package o;

import aws.sdk.kotlin.services.comprehend.serde.StartFlywheelIterationOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.MultiSelectListPreference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class Slog implements BB<MultiSelectListPreference> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super MultiSelectListPreference> continuation) throws java.lang.Throwable {
        StartFlywheelIterationOperationDeserializer$deserialize$1 startFlywheelIterationOperationDeserializer$deserialize$1;
        MultiSelectListPreference.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof StartFlywheelIterationOperationDeserializer$deserialize$1) {
            startFlywheelIterationOperationDeserializer$deserialize$1 = (StartFlywheelIterationOperationDeserializer$deserialize$1) continuation;
            int i = startFlywheelIterationOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startFlywheelIterationOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startFlywheelIterationOperationDeserializer$deserialize$1 = new StartFlywheelIterationOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startFlywheelIterationOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startFlywheelIterationOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (MultiSelectListPreference.ActionBar) startFlywheelIterationOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                Singleton.OLrzqt(actionBar, bArr);
            }
            actionBar.KWHzl();
            return actionBar.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startFlywheelIterationOperationDeserializer$deserialize$1.label = 1;
            if (Singleton.KWHzl(dt, c58859zS, startFlywheelIterationOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new MultiSelectListPreference.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startFlywheelIterationOperationDeserializer$deserialize$1.L$0 = actionBar;
        startFlywheelIterationOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startFlywheelIterationOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.KWHzl();
        return actionBar.OLrzqt();
    }
}
