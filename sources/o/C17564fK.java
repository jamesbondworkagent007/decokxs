package o;

import aws.sdk.kotlin.services.rekognition.serde.DisassociateFacesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ScrollView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C17564fK implements BB<ScrollView> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ScrollView> continuation) throws java.lang.Throwable {
        DisassociateFacesOperationDeserializer$deserialize$1 disassociateFacesOperationDeserializer$deserialize$1;
        ScrollView.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof DisassociateFacesOperationDeserializer$deserialize$1) {
            disassociateFacesOperationDeserializer$deserialize$1 = (DisassociateFacesOperationDeserializer$deserialize$1) continuation;
            int i = disassociateFacesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                disassociateFacesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                disassociateFacesOperationDeserializer$deserialize$1 = new DisassociateFacesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = disassociateFacesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = disassociateFacesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (ScrollView.StateListAnimator) disassociateFacesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C17726fQ.copydefault(stateListAnimator, bArr);
            }
            stateListAnimator.KWHzl();
            return stateListAnimator.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            disassociateFacesOperationDeserializer$deserialize$1.label = 1;
            if (C17726fQ.AEQbTJ(dt, c58859zS, disassociateFacesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new ScrollView.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        disassociateFacesOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        disassociateFacesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, disassociateFacesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.KWHzl();
        return stateListAnimator.OLrzqt();
    }
}
