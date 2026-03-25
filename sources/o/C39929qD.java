package o;

import aws.sdk.kotlin.services.textract.serde.GetExpenseAnalysisOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C34223nW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C39929qD implements BB<C34223nW> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C34223nW> continuation) throws java.lang.Throwable {
        GetExpenseAnalysisOperationDeserializer$deserialize$1 getExpenseAnalysisOperationDeserializer$deserialize$1;
        C34223nW.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof GetExpenseAnalysisOperationDeserializer$deserialize$1) {
            getExpenseAnalysisOperationDeserializer$deserialize$1 = (GetExpenseAnalysisOperationDeserializer$deserialize$1) continuation;
            int i = getExpenseAnalysisOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getExpenseAnalysisOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getExpenseAnalysisOperationDeserializer$deserialize$1 = new GetExpenseAnalysisOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getExpenseAnalysisOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getExpenseAnalysisOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (C34223nW.ActionBar) getExpenseAnalysisOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C39983qF.AEQbTJ(actionBar, bArr);
            }
            actionBar.AEQbTJ();
            return actionBar.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getExpenseAnalysisOperationDeserializer$deserialize$1.label = 1;
            if (C39983qF.copydefault(dt, c58859zS, getExpenseAnalysisOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new C34223nW.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getExpenseAnalysisOperationDeserializer$deserialize$1.L$0 = actionBar;
        getExpenseAnalysisOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getExpenseAnalysisOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.AEQbTJ();
        return actionBar.KWHzl();
    }
}
