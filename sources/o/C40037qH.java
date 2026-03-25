package o;

import aws.sdk.kotlin.services.textract.serde.GetLendingAnalysisSummaryOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C36390oa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C40037qH implements BB<C36390oa> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C36390oa> continuation) throws java.lang.Throwable {
        GetLendingAnalysisSummaryOperationDeserializer$deserialize$1 getLendingAnalysisSummaryOperationDeserializer$deserialize$1;
        C36390oa.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof GetLendingAnalysisSummaryOperationDeserializer$deserialize$1) {
            getLendingAnalysisSummaryOperationDeserializer$deserialize$1 = (GetLendingAnalysisSummaryOperationDeserializer$deserialize$1) continuation;
            int i = getLendingAnalysisSummaryOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLendingAnalysisSummaryOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getLendingAnalysisSummaryOperationDeserializer$deserialize$1 = new GetLendingAnalysisSummaryOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getLendingAnalysisSummaryOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getLendingAnalysisSummaryOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (C36390oa.StateListAnimator) getLendingAnalysisSummaryOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C40064qI.KWHzl(stateListAnimator, bArr);
            }
            stateListAnimator.KWHzl();
            return stateListAnimator.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getLendingAnalysisSummaryOperationDeserializer$deserialize$1.label = 1;
            if (C40064qI.EZpvd(dt, c58859zS, getLendingAnalysisSummaryOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new C36390oa.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getLendingAnalysisSummaryOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        getLendingAnalysisSummaryOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getLendingAnalysisSummaryOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.KWHzl();
        return stateListAnimator.OLrzqt();
    }
}
