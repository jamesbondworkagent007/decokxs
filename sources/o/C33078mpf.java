package o;

import com.okinc.core.common.CancellableOperationKt$withCancellableRust$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C33078mpf {
    public static final BdU OLrzqt() {
        return new BdU();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object OLrzqt(@NotNull Function2<? super BdU, ? super Continuation<? super T>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Result<? extends T>> continuation) {
        CancellableOperationKt$withCancellableRust$1 cancellableOperationKt$withCancellableRust$1;
        BdU bdUOLrzqt;
        if (continuation instanceof CancellableOperationKt$withCancellableRust$1) {
            cancellableOperationKt$withCancellableRust$1 = (CancellableOperationKt$withCancellableRust$1) continuation;
            int i = cancellableOperationKt$withCancellableRust$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cancellableOperationKt$withCancellableRust$1.label = i - Integer.MIN_VALUE;
            } else {
                cancellableOperationKt$withCancellableRust$1 = new CancellableOperationKt$withCancellableRust$1(continuation);
            }
        }
        java.lang.Object obj = cancellableOperationKt$withCancellableRust$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = cancellableOperationKt$withCancellableRust$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            bdUOLrzqt = OLrzqt();
            try {
                JobKt.ensureActive(cancellableOperationKt$withCancellableRust$1.getContext());
                Result.Application application = Result.Companion;
                cancellableOperationKt$withCancellableRust$1.L$0 = bdUOLrzqt;
                cancellableOperationKt$withCancellableRust$1.label = 1;
                java.lang.Object objInvoke = function2.invoke(bdUOLrzqt, cancellableOperationKt$withCancellableRust$1);
                if (objInvoke == objCopydefault) {
                    return objCopydefault;
                }
                obj = objInvoke;
            } catch (java.lang.Exception e) {
                e = e;
                if (!bdUOLrzqt.EZpvd()) {
                    bdUOLrzqt.copydefault();
                }
                Result.Application application2 = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd(e));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BdU bdU = (BdU) cancellableOperationKt$withCancellableRust$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (java.lang.Exception e2) {
                bdUOLrzqt = bdU;
                e = e2;
                if (!bdUOLrzqt.EZpvd()) {
                }
                Result.Application application22 = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd(e));
            }
        }
        return Result.m7377constructorimpl(obj);
    }
}
