package o;

import aws.sdk.kotlin.services.rekognition.serde.DetectProtectiveEquipmentOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.RemoteViewsService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C17375fD implements BB<RemoteViewsService> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super RemoteViewsService> continuation) throws java.lang.Throwable {
        DetectProtectiveEquipmentOperationDeserializer$deserialize$1 detectProtectiveEquipmentOperationDeserializer$deserialize$1;
        RemoteViewsService.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof DetectProtectiveEquipmentOperationDeserializer$deserialize$1) {
            detectProtectiveEquipmentOperationDeserializer$deserialize$1 = (DetectProtectiveEquipmentOperationDeserializer$deserialize$1) continuation;
            int i = detectProtectiveEquipmentOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                detectProtectiveEquipmentOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                detectProtectiveEquipmentOperationDeserializer$deserialize$1 = new DetectProtectiveEquipmentOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = detectProtectiveEquipmentOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = detectProtectiveEquipmentOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (RemoteViewsService.StateListAnimator) detectProtectiveEquipmentOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C17402fE.AEQbTJ(stateListAnimator, bArr);
            }
            stateListAnimator.copydefault();
            return stateListAnimator.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            detectProtectiveEquipmentOperationDeserializer$deserialize$1.label = 1;
            if (C17402fE.KWHzl(dt, c58859zS, detectProtectiveEquipmentOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new RemoteViewsService.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        detectProtectiveEquipmentOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        detectProtectiveEquipmentOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, detectProtectiveEquipmentOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.copydefault();
        return stateListAnimator.EZpvd();
    }
}
