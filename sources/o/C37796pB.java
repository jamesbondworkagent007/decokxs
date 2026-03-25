package o;

import aws.sdk.kotlin.services.textract.serde.CreateAdapterOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C34894nl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C37796pB implements BB<C34894nl> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C34894nl> continuation) throws java.lang.Throwable {
        CreateAdapterOperationDeserializer$deserialize$1 createAdapterOperationDeserializer$deserialize$1;
        C34894nl.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof CreateAdapterOperationDeserializer$deserialize$1) {
            createAdapterOperationDeserializer$deserialize$1 = (CreateAdapterOperationDeserializer$deserialize$1) continuation;
            int i = createAdapterOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createAdapterOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                createAdapterOperationDeserializer$deserialize$1 = new CreateAdapterOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = createAdapterOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = createAdapterOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (C34894nl.StateListAnimator) createAdapterOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C37823pC.OLrzqt(stateListAnimator, bArr);
            }
            stateListAnimator.KWHzl();
            return stateListAnimator.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            createAdapterOperationDeserializer$deserialize$1.label = 1;
            if (C37823pC.KWHzl(dt, c58859zS, createAdapterOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new C34894nl.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        createAdapterOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        createAdapterOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, createAdapterOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.KWHzl();
        return stateListAnimator.EZpvd();
    }
}
