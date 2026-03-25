package o;

import com.okinc.okimcore.usecase.support.DefaultRetryExecutor$run$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sSE implements sSK {
    @yCM
    public sSE() {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0062 -> B:26:0x0065). Please report as a decompilation issue!!! */
    @Override // o.sSK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> java.lang.Object KWHzl(int i, @NotNull Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1, @NotNull Continuation<? super T> continuation) throws java.lang.Throwable {
        DefaultRetryExecutor$run$1 defaultRetryExecutor$run$1;
        int i2;
        int i3;
        Ref.ObjectRef objectRef;
        Function1<? super Continuation<? super T>, ? extends java.lang.Object> function12;
        Function1<? super Continuation<? super T>, ? extends java.lang.Object> function13;
        T th;
        if (continuation instanceof DefaultRetryExecutor$run$1) {
            defaultRetryExecutor$run$1 = (DefaultRetryExecutor$run$1) continuation;
            int i4 = defaultRetryExecutor$run$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                defaultRetryExecutor$run$1.label = i4 - Integer.MIN_VALUE;
            } else {
                defaultRetryExecutor$run$1 = new DefaultRetryExecutor$run$1(this, continuation);
            }
        }
        java.lang.Object objInvoke = defaultRetryExecutor$run$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = defaultRetryExecutor$run$1.label;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = defaultRetryExecutor$run$1.I$1;
            i2 = defaultRetryExecutor$run$1.I$0;
            objectRef = (Ref.ObjectRef) defaultRetryExecutor$run$1.L$1;
            function13 = (Function1) defaultRetryExecutor$run$1.L$0;
            try {
                C56391yDq.AEQbTJ(objInvoke);
            } catch (java.lang.Throwable th2) {
                th = th2;
                objectRef.element = th;
                i3++;
                function12 = function13;
                if (i3 < i2) {
                }
            }
        }
        C56391yDq.AEQbTJ(objInvoke);
        i2 = i;
        i3 = 0;
        objectRef = new Ref.ObjectRef();
        function12 = function1;
        if (i3 < i2) {
            try {
            } catch (java.lang.Throwable th3) {
                function13 = function12;
                th = th3;
                objectRef.element = th;
                i3++;
                function12 = function13;
                if (i3 < i2) {
                }
            }
            defaultRetryExecutor$run$1.L$0 = function12;
            defaultRetryExecutor$run$1.L$1 = objectRef;
            defaultRetryExecutor$run$1.I$0 = i2;
            defaultRetryExecutor$run$1.I$1 = i3;
            defaultRetryExecutor$run$1.label = 1;
            objInvoke = function12.invoke(defaultRetryExecutor$run$1);
            return objInvoke == objCopydefault ? objCopydefault : objInvoke;
        }
        java.lang.Throwable th4 = (java.lang.Throwable) objectRef.element;
        if (th4 == null) {
            throw new java.lang.IllegalStateException("RetryExecutor failed without exception");
        }
        throw th4;
    }
}
