package o;

import aws.sdk.kotlin.services.textract.serde.StartLendingAnalysisOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C36066oO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C45134sk implements BB<C36066oO> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C36066oO> continuation) throws java.lang.Throwable {
        StartLendingAnalysisOperationDeserializer$deserialize$1 startLendingAnalysisOperationDeserializer$deserialize$1;
        C36066oO.Activity activity;
        byte[] bArr;
        if (continuation instanceof StartLendingAnalysisOperationDeserializer$deserialize$1) {
            startLendingAnalysisOperationDeserializer$deserialize$1 = (StartLendingAnalysisOperationDeserializer$deserialize$1) continuation;
            int i = startLendingAnalysisOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startLendingAnalysisOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startLendingAnalysisOperationDeserializer$deserialize$1 = new StartLendingAnalysisOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startLendingAnalysisOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startLendingAnalysisOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (C36066oO.Activity) startLendingAnalysisOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C45240sm.OLrzqt(activity, bArr);
            }
            activity.copydefault();
            return activity.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startLendingAnalysisOperationDeserializer$deserialize$1.label = 1;
            if (C45240sm.AEQbTJ(dt, c58859zS, startLendingAnalysisOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new C36066oO.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startLendingAnalysisOperationDeserializer$deserialize$1.L$0 = activity;
        startLendingAnalysisOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startLendingAnalysisOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.copydefault();
        return activity.EZpvd();
    }
}
