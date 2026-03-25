package o;

import aws.sdk.kotlin.services.rekognition.serde.UpdateStreamProcessorOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C13025cy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C33099mq implements BB<C13025cy> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C13025cy> continuation) throws java.lang.Throwable {
        UpdateStreamProcessorOperationDeserializer$deserialize$1 updateStreamProcessorOperationDeserializer$deserialize$1;
        if (continuation instanceof UpdateStreamProcessorOperationDeserializer$deserialize$1) {
            updateStreamProcessorOperationDeserializer$deserialize$1 = (UpdateStreamProcessorOperationDeserializer$deserialize$1) continuation;
            int i = updateStreamProcessorOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateStreamProcessorOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                updateStreamProcessorOperationDeserializer$deserialize$1 = new UpdateStreamProcessorOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = updateStreamProcessorOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateStreamProcessorOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                updateStreamProcessorOperationDeserializer$deserialize$1.label = 1;
                if (C33311mu.KWHzl(dt, c58859zS, updateStreamProcessorOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                C13025cy.ActionBar actionBar = new C13025cy.ActionBar();
                actionBar.OLrzqt();
                return actionBar.KWHzl();
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
