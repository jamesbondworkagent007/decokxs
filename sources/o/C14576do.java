package o;

import aws.sdk.kotlin.services.rekognition.serde.CreateCollectionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Button;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C14576do implements BB<Button> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Button> continuation) throws java.lang.Throwable {
        CreateCollectionOperationDeserializer$deserialize$1 createCollectionOperationDeserializer$deserialize$1;
        Button.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof CreateCollectionOperationDeserializer$deserialize$1) {
            createCollectionOperationDeserializer$deserialize$1 = (CreateCollectionOperationDeserializer$deserialize$1) continuation;
            int i = createCollectionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createCollectionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                createCollectionOperationDeserializer$deserialize$1 = new CreateCollectionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = createCollectionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = createCollectionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (Button.ActionBar) createCollectionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C14947dv.AEQbTJ(actionBar, bArr);
            }
            actionBar.copydefault();
            return actionBar.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            createCollectionOperationDeserializer$deserialize$1.label = 1;
            if (C14947dv.copydefault(dt, c58859zS, createCollectionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new Button.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        createCollectionOperationDeserializer$deserialize$1.L$0 = actionBar;
        createCollectionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, createCollectionOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.copydefault();
        return actionBar.EZpvd();
    }
}
