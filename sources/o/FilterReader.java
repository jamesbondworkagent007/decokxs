package o;

import aws.sdk.kotlin.runtime.config.compression.RequestCompressionResolversKt$resolveDisableRequestCompression$1;
import aws.sdk.kotlin.runtime.config.compression.RequestCompressionResolversKt$resolveRequestMinCompressionSizeBytes$1;
import com.huawei.hms.utils.FileUtil;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class FilterReader {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(@NotNull HL hl, @NotNull HH<ObjectStreamField> hh, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        RequestCompressionResolversKt$resolveDisableRequestCompression$1 requestCompressionResolversKt$resolveDisableRequestCompression$1;
        java.lang.Boolean boolKWHzl;
        if (continuation instanceof RequestCompressionResolversKt$resolveDisableRequestCompression$1) {
            requestCompressionResolversKt$resolveDisableRequestCompression$1 = (RequestCompressionResolversKt$resolveDisableRequestCompression$1) continuation;
            int i = requestCompressionResolversKt$resolveDisableRequestCompression$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                requestCompressionResolversKt$resolveDisableRequestCompression$1.label = i - Integer.MIN_VALUE;
            } else {
                requestCompressionResolversKt$resolveDisableRequestCompression$1 = new RequestCompressionResolversKt$resolveDisableRequestCompression$1(continuation);
            }
        }
        java.lang.Object objKWHzl = requestCompressionResolversKt$resolveDisableRequestCompression$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = requestCompressionResolversKt$resolveDisableRequestCompression$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            boolKWHzl = (java.lang.Boolean) C59333zf.AEQbTJ(IOException.zsXlph.djBIcL(), hl);
            if (boolKWHzl == null) {
                requestCompressionResolversKt$resolveDisableRequestCompression$1.label = 1;
                objKWHzl = hh.KWHzl(requestCompressionResolversKt$resolveDisableRequestCompression$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            }
            return C56443yFo.KWHzl(zBooleanValue);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objKWHzl);
        boolKWHzl = ObjectInputValidation.KWHzl((ObjectStreamField) objKWHzl);
        boolean zBooleanValue = boolKWHzl != null ? boolKWHzl.booleanValue() : false;
        return C56443yFo.KWHzl(zBooleanValue);
    }

    public static /* synthetic */ java.lang.Object resolveDisableRequestCompression$default(HL hl, HH hh, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hl = HL.OLrzqt.copydefault();
        }
        return EZpvd(hl, hh, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(@NotNull HL hl, @NotNull HH<ObjectStreamField> hh, @NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
        RequestCompressionResolversKt$resolveRequestMinCompressionSizeBytes$1 requestCompressionResolversKt$resolveRequestMinCompressionSizeBytes$1;
        java.lang.Long lAYXKKw;
        if (continuation instanceof RequestCompressionResolversKt$resolveRequestMinCompressionSizeBytes$1) {
            requestCompressionResolversKt$resolveRequestMinCompressionSizeBytes$1 = (RequestCompressionResolversKt$resolveRequestMinCompressionSizeBytes$1) continuation;
            int i = requestCompressionResolversKt$resolveRequestMinCompressionSizeBytes$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                requestCompressionResolversKt$resolveRequestMinCompressionSizeBytes$1.label = i - Integer.MIN_VALUE;
            } else {
                requestCompressionResolversKt$resolveRequestMinCompressionSizeBytes$1 = new RequestCompressionResolversKt$resolveRequestMinCompressionSizeBytes$1(continuation);
            }
        }
        java.lang.Object objKWHzl = requestCompressionResolversKt$resolveRequestMinCompressionSizeBytes$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = requestCompressionResolversKt$resolveRequestMinCompressionSizeBytes$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            lAYXKKw = (java.lang.Long) C59333zf.AEQbTJ(IOException.zsXlph.fJNWhG(), hl);
            if (lAYXKKw == null) {
                requestCompressionResolversKt$resolveRequestMinCompressionSizeBytes$1.label = 1;
                objKWHzl = hh.KWHzl(requestCompressionResolversKt$resolveRequestMinCompressionSizeBytes$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            }
            return C56443yFo.KWHzl(jLongValue);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objKWHzl);
        lAYXKKw = ObjectInputValidation.AYXKKw((ObjectStreamField) objKWHzl);
        long jLongValue = lAYXKKw != null ? lAYXKKw.longValue() : FileUtil.LOCAL_REPORT_FILE_MAX_SIZE;
        return C56443yFo.KWHzl(jLongValue);
    }

    public static /* synthetic */ java.lang.Object resolveRequestMinCompressionSizeBytes$default(HL hl, HH hh, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hl = HL.OLrzqt.copydefault();
        }
        return AEQbTJ(hl, hh, continuation);
    }
}
