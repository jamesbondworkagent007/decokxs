package o;

import com.okinc.im.usecase.message.GetReferenceMessageUseCase$execute$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35813oEq {
    public final C35805oEi KWHzl;
    public final C35814oEr copydefault;

    @yCM
    public C35813oEq(@NotNull C35814oEr c35814oEr, @NotNull C35805oEi c35805oEi) {
        Intrinsics.checkNotNullParameter(c35814oEr, "");
        Intrinsics.checkNotNullParameter(c35805oEi, "");
        this.copydefault = c35814oEr;
        this.KWHzl = c35805oEi;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super OKMessage> continuation) throws java.lang.Throwable {
        GetReferenceMessageUseCase$execute$1 getReferenceMessageUseCase$execute$1;
        C35813oEq c35813oEq;
        if (continuation instanceof GetReferenceMessageUseCase$execute$1) {
            getReferenceMessageUseCase$execute$1 = (GetReferenceMessageUseCase$execute$1) continuation;
            int i = getReferenceMessageUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getReferenceMessageUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getReferenceMessageUseCase$execute$1 = new GetReferenceMessageUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = getReferenceMessageUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getReferenceMessageUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            C35814oEr c35814oEr = this.copydefault;
            getReferenceMessageUseCase$execute$1.L$0 = this;
            getReferenceMessageUseCase$execute$1.L$1 = str;
            getReferenceMessageUseCase$execute$1.label = 1;
            objAEQbTJ = c35814oEr.AEQbTJ(str, getReferenceMessageUseCase$execute$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c35813oEq = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objAEQbTJ);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) getReferenceMessageUseCase$execute$1.L$1;
            c35813oEq = (C35813oEq) getReferenceMessageUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        java.lang.Long l = (java.lang.Long) objAEQbTJ;
        if (l == null) {
            return null;
        }
        C35805oEi c35805oEi = c35813oEq.KWHzl;
        long jLongValue = l.longValue();
        getReferenceMessageUseCase$execute$1.L$0 = null;
        getReferenceMessageUseCase$execute$1.L$1 = null;
        getReferenceMessageUseCase$execute$1.label = 2;
        objAEQbTJ = c35805oEi.OLrzqt(str, jLongValue, getReferenceMessageUseCase$execute$1);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }
}
