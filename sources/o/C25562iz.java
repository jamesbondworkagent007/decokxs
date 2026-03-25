package o;

import aws.sdk.kotlin.services.rekognition.serde.ListStreamProcessorsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.U;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C25562iz implements BB<U> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super U> continuation) throws java.lang.Throwable {
        ListStreamProcessorsOperationDeserializer$deserialize$1 listStreamProcessorsOperationDeserializer$deserialize$1;
        U.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof ListStreamProcessorsOperationDeserializer$deserialize$1) {
            listStreamProcessorsOperationDeserializer$deserialize$1 = (ListStreamProcessorsOperationDeserializer$deserialize$1) continuation;
            int i = listStreamProcessorsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listStreamProcessorsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listStreamProcessorsOperationDeserializer$deserialize$1 = new ListStreamProcessorsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listStreamProcessorsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listStreamProcessorsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (U.StateListAnimator) listStreamProcessorsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C23563iB.OLrzqt(stateListAnimator, bArr);
            }
            stateListAnimator.AEQbTJ();
            return stateListAnimator.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listStreamProcessorsOperationDeserializer$deserialize$1.label = 1;
            if (C23563iB.EZpvd(dt, c58859zS, listStreamProcessorsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new U.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listStreamProcessorsOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        listStreamProcessorsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listStreamProcessorsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.AEQbTJ();
        return stateListAnimator.EZpvd();
    }
}
