package o;

import aws.sdk.kotlin.services.rekognition.serde.CreateFaceLivenessSessionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.CalendarViewMaterialDelegate;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C15159dz implements BB<CalendarViewMaterialDelegate> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super CalendarViewMaterialDelegate> continuation) throws java.lang.Throwable {
        CreateFaceLivenessSessionOperationDeserializer$deserialize$1 createFaceLivenessSessionOperationDeserializer$deserialize$1;
        CalendarViewMaterialDelegate.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof CreateFaceLivenessSessionOperationDeserializer$deserialize$1) {
            createFaceLivenessSessionOperationDeserializer$deserialize$1 = (CreateFaceLivenessSessionOperationDeserializer$deserialize$1) continuation;
            int i = createFaceLivenessSessionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createFaceLivenessSessionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                createFaceLivenessSessionOperationDeserializer$deserialize$1 = new CreateFaceLivenessSessionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = createFaceLivenessSessionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = createFaceLivenessSessionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (CalendarViewMaterialDelegate.ActionBar) createFaceLivenessSessionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C15106dy.EZpvd(actionBar, bArr);
            }
            actionBar.AEQbTJ();
            return actionBar.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            createFaceLivenessSessionOperationDeserializer$deserialize$1.label = 1;
            if (C15106dy.EZpvd(dt, c58859zS, createFaceLivenessSessionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new CalendarViewMaterialDelegate.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        createFaceLivenessSessionOperationDeserializer$deserialize$1.L$0 = actionBar;
        createFaceLivenessSessionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, createFaceLivenessSessionOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.AEQbTJ();
        return actionBar.OLrzqt();
    }
}
