package o;

import aws.sdk.kotlin.services.textract.serde.DeleteAdapterOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C35053no;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C38094pM implements BB<C35053no> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C35053no> continuation) throws java.lang.Throwable {
        DeleteAdapterOperationDeserializer$deserialize$1 deleteAdapterOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteAdapterOperationDeserializer$deserialize$1) {
            deleteAdapterOperationDeserializer$deserialize$1 = (DeleteAdapterOperationDeserializer$deserialize$1) continuation;
            int i = deleteAdapterOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteAdapterOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteAdapterOperationDeserializer$deserialize$1 = new DeleteAdapterOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteAdapterOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteAdapterOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteAdapterOperationDeserializer$deserialize$1.label = 1;
                if (C38040pK.KWHzl(dt, c58859zS, deleteAdapterOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                C35053no.StateListAnimator stateListAnimator = new C35053no.StateListAnimator();
                stateListAnimator.copydefault();
                return stateListAnimator.KWHzl();
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
