package o;

import aws.sdk.kotlin.services.comprehend.serde.ListEntityRecognizersOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.UserManagerInternal;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class Transition implements BB<UserManagerInternal> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UserManagerInternal> continuation) throws java.lang.Throwable {
        ListEntityRecognizersOperationDeserializer$deserialize$1 listEntityRecognizersOperationDeserializer$deserialize$1;
        UserManagerInternal.Activity activity;
        byte[] bArr;
        if (continuation instanceof ListEntityRecognizersOperationDeserializer$deserialize$1) {
            listEntityRecognizersOperationDeserializer$deserialize$1 = (ListEntityRecognizersOperationDeserializer$deserialize$1) continuation;
            int i = listEntityRecognizersOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listEntityRecognizersOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listEntityRecognizersOperationDeserializer$deserialize$1 = new ListEntityRecognizersOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listEntityRecognizersOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listEntityRecognizersOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (UserManagerInternal.Activity) listEntityRecognizersOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                Slide.KWHzl(activity, bArr);
            }
            activity.AEQbTJ();
            return activity.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listEntityRecognizersOperationDeserializer$deserialize$1.label = 1;
            if (Slide.OLrzqt(dt, c58859zS, listEntityRecognizersOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new UserManagerInternal.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listEntityRecognizersOperationDeserializer$deserialize$1.L$0 = activity;
        listEntityRecognizersOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listEntityRecognizersOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.AEQbTJ();
        return activity.copydefault();
    }
}
