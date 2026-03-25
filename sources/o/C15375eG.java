package o;

import aws.sdk.kotlin.services.rekognition.serde.DeleteUserOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.HorizontalScrollView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C15375eG implements BB<HorizontalScrollView> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super HorizontalScrollView> continuation) throws java.lang.Throwable {
        DeleteUserOperationDeserializer$deserialize$1 deleteUserOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteUserOperationDeserializer$deserialize$1) {
            deleteUserOperationDeserializer$deserialize$1 = (DeleteUserOperationDeserializer$deserialize$1) continuation;
            int i = deleteUserOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteUserOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteUserOperationDeserializer$deserialize$1 = new DeleteUserOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteUserOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteUserOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteUserOperationDeserializer$deserialize$1.label = 1;
                if (C15483eK.copydefault(dt, c58859zS, deleteUserOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                HorizontalScrollView.StateListAnimator stateListAnimator = new HorizontalScrollView.StateListAnimator();
                stateListAnimator.OLrzqt();
                return stateListAnimator.copydefault();
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
