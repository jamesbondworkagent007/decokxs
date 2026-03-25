package o;

import com.okinc.business.invest_biz.utils.ResultKt$suspendRunCatching$1;
import com.okinc.business.invest_biz.utils.ResultKt$suspendRunCatching$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jxC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27540jxC {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object copydefault(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1, @NotNull Continuation<? super Result<? extends T>> continuation) {
        ResultKt$suspendRunCatching$1 resultKt$suspendRunCatching$1;
        if (continuation instanceof ResultKt$suspendRunCatching$1) {
            resultKt$suspendRunCatching$1 = (ResultKt$suspendRunCatching$1) continuation;
            int i = resultKt$suspendRunCatching$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resultKt$suspendRunCatching$1.label = i - Integer.MIN_VALUE;
            } else {
                resultKt$suspendRunCatching$1 = new ResultKt$suspendRunCatching$1(continuation);
            }
        }
        java.lang.Object objWithContext = resultKt$suspendRunCatching$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = resultKt$suspendRunCatching$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            ResultKt$suspendRunCatching$2 resultKt$suspendRunCatching$2 = new ResultKt$suspendRunCatching$2(function1, null);
            resultKt$suspendRunCatching$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, resultKt$suspendRunCatching$2, resultKt$suspendRunCatching$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
