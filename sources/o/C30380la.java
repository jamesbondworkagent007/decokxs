package o;

import aws.sdk.kotlin.services.rekognition.serde.StartProjectVersionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C10682bt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C30380la implements BB<C10682bt> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C10682bt> continuation) throws java.lang.Throwable {
        StartProjectVersionOperationDeserializer$deserialize$1 startProjectVersionOperationDeserializer$deserialize$1;
        C10682bt.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof StartProjectVersionOperationDeserializer$deserialize$1) {
            startProjectVersionOperationDeserializer$deserialize$1 = (StartProjectVersionOperationDeserializer$deserialize$1) continuation;
            int i = startProjectVersionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startProjectVersionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startProjectVersionOperationDeserializer$deserialize$1 = new StartProjectVersionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startProjectVersionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startProjectVersionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (C10682bt.ActionBar) startProjectVersionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C28346kY.EZpvd(actionBar, bArr);
            }
            actionBar.copydefault();
            return actionBar.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startProjectVersionOperationDeserializer$deserialize$1.label = 1;
            if (C28346kY.OLrzqt(dt, c58859zS, startProjectVersionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new C10682bt.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startProjectVersionOperationDeserializer$deserialize$1.L$0 = actionBar;
        startProjectVersionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startProjectVersionOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.copydefault();
        return actionBar.AEQbTJ();
    }
}
