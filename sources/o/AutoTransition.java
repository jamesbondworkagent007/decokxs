package o;

import aws.sdk.kotlin.services.comprehend.serde.ListDominantLanguageDetectionJobsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.TransactionTracker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class AutoTransition implements BB<TransactionTracker> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super TransactionTracker> continuation) throws java.lang.Throwable {
        ListDominantLanguageDetectionJobsOperationDeserializer$deserialize$1 listDominantLanguageDetectionJobsOperationDeserializer$deserialize$1;
        TransactionTracker.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof ListDominantLanguageDetectionJobsOperationDeserializer$deserialize$1) {
            listDominantLanguageDetectionJobsOperationDeserializer$deserialize$1 = (ListDominantLanguageDetectionJobsOperationDeserializer$deserialize$1) continuation;
            int i = listDominantLanguageDetectionJobsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listDominantLanguageDetectionJobsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listDominantLanguageDetectionJobsOperationDeserializer$deserialize$1 = new ListDominantLanguageDetectionJobsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listDominantLanguageDetectionJobsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listDominantLanguageDetectionJobsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (TransactionTracker.ActionBar) listDominantLanguageDetectionJobsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                ChangeBounds.AEQbTJ(actionBar, bArr);
            }
            actionBar.KWHzl();
            return actionBar.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listDominantLanguageDetectionJobsOperationDeserializer$deserialize$1.label = 1;
            if (ChangeBounds.OLrzqt(dt, c58859zS, listDominantLanguageDetectionJobsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new TransactionTracker.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listDominantLanguageDetectionJobsOperationDeserializer$deserialize$1.L$0 = actionBar;
        listDominantLanguageDetectionJobsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listDominantLanguageDetectionJobsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.KWHzl();
        return actionBar.copydefault();
    }
}
