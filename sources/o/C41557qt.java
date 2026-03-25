package o;

import aws.sdk.kotlin.services.textract.serde.GetDocumentAnalysisOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C34035nP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C41557qt implements BB<C34035nP> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C34035nP> continuation) throws java.lang.Throwable {
        GetDocumentAnalysisOperationDeserializer$deserialize$1 getDocumentAnalysisOperationDeserializer$deserialize$1;
        C34035nP.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof GetDocumentAnalysisOperationDeserializer$deserialize$1) {
            getDocumentAnalysisOperationDeserializer$deserialize$1 = (GetDocumentAnalysisOperationDeserializer$deserialize$1) continuation;
            int i = getDocumentAnalysisOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDocumentAnalysisOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getDocumentAnalysisOperationDeserializer$deserialize$1 = new GetDocumentAnalysisOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getDocumentAnalysisOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getDocumentAnalysisOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (C34035nP.StateListAnimator) getDocumentAnalysisOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C41716qw.EZpvd(stateListAnimator, bArr);
            }
            stateListAnimator.EZpvd();
            return stateListAnimator.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getDocumentAnalysisOperationDeserializer$deserialize$1.label = 1;
            if (C41716qw.copydefault(dt, c58859zS, getDocumentAnalysisOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new C34035nP.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getDocumentAnalysisOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        getDocumentAnalysisOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getDocumentAnalysisOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.EZpvd();
        return stateListAnimator.copydefault();
    }
}
