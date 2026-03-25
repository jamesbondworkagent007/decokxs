package o;

import aws.sdk.kotlin.runtime.region.ResolveRegionKt$resolveRegion$1;
import aws.sdk.kotlin.runtime.region.ResolveRegionKt$resolveRegion$2;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayIndexOutOfBoundsException {
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:37:? */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(@NotNull HL hl, @NotNull HH<ObjectStreamField> hh, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        ResolveRegionKt$resolveRegion$1 resolveRegionKt$resolveRegion$1;
        java.lang.Throwable th;
        java.io.Closeable closeable;
        java.io.Closeable closeable2;
        if (continuation instanceof ResolveRegionKt$resolveRegion$1) {
            resolveRegionKt$resolveRegion$1 = (ResolveRegionKt$resolveRegion$1) continuation;
            int i = resolveRegionKt$resolveRegion$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resolveRegionKt$resolveRegion$1.label = i - Integer.MIN_VALUE;
            } else {
                resolveRegionKt$resolveRegion$1 = new ResolveRegionKt$resolveRegion$1(continuation);
            }
        }
        java.lang.Object obj = resolveRegionKt$resolveRegion$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = resolveRegionKt$resolveRegion$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            WriteAbortedException writeAbortedException = new WriteAbortedException(hl, null, hh, 2, null);
            try {
                resolveRegionKt$resolveRegion$1.L$0 = writeAbortedException;
                resolveRegionKt$resolveRegion$1.I$0 = 0;
                resolveRegionKt$resolveRegion$1.label = 1;
                java.lang.Object objKWHzl = writeAbortedException.KWHzl(resolveRegionKt$resolveRegion$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                obj = objKWHzl;
                closeable = writeAbortedException;
            } catch (java.lang.Throwable th2) {
                th = th2;
                closeable2 = writeAbortedException;
                closeable2.close();
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = (java.io.Closeable) resolveRegionKt$resolveRegion$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                closeable = closeable;
            } catch (java.lang.Throwable th3) {
                th = th3;
                closeable2 = closeable;
                try {
                    closeable2.close();
                    throw th;
                } catch (java.lang.Throwable th4) {
                    C56379yDe.EZpvd(th, th4);
                    throw th;
                }
            }
        }
        java.lang.String str = (java.lang.String) obj;
        closeable.close();
        return str;
    }

    public static /* synthetic */ java.lang.Object resolveRegion$default(HL hl, HH hh, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hl = HL.OLrzqt.copydefault();
        }
        if ((i & 2) != 0) {
            hh = HE.AEQbTJ(new ResolveRegionKt$resolveRegion$2(hl, null));
        }
        return copydefault(hl, hh, continuation);
    }
}
