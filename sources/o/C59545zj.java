package o;

import aws.smithy.kotlin.runtime.content.ByteStreamJVMKt$writeAll$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C59545zj {
    public static /* synthetic */ AbstractC59439zh asByteStream$default(java.io.File file, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = file.length() - 1;
        }
        return AEQbTJ(file, j, j2);
    }

    public static final AbstractC59439zh AEQbTJ(@NotNull java.io.File file, long j, long j2) {
        Intrinsics.checkNotNullParameter(file, "");
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(("start index " + j + " cannot be negative").toString());
        }
        long j3 = j - 1;
        if (j2 < j3) {
            throw new java.lang.IllegalArgumentException(("end index " + j2 + " must be greater than or equal to start index minus one (" + j3 + ')').toString());
        }
        long length = file.length();
        if (j2 >= length) {
            throw new java.lang.IllegalArgumentException(("end index " + j2 + " must be less than file size " + length).toString());
        }
        return new C59704zm(file, j, j2);
    }

    public static /* synthetic */ AbstractC59439zh asByteStream$default(java.nio.file.Path path, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = -1;
        }
        return cb_(path, j, j2);
    }

    public static final AbstractC59439zh cb_(@NotNull java.nio.file.Path path, long j, long j2) {
        Intrinsics.checkNotNullParameter(path, "");
        java.io.File file = path.toFile();
        if (!file.exists()) {
            throw new java.lang.IllegalArgumentException(("cannot create ByteStream, file does not exist: " + path).toString());
        }
        if (!file.isFile()) {
            throw new java.lang.IllegalArgumentException(("cannot create a ByteStream from a directory: " + path).toString());
        }
        if (j2 == -1) {
            j2 = file.length() - 1;
        }
        long j3 = j - 1;
        if (j2 < j3) {
            throw new java.lang.IllegalArgumentException(("end index " + j2 + " must be greater or equal to start index minus one (" + j3 + ')').toString());
        }
        Intrinsics.copydefault(file);
        return AEQbTJ(file, j, j2);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0021 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(java.io.File file, CS cs, Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
        ByteStreamJVMKt$writeAll$1 byteStreamJVMKt$writeAll$1;
        if (continuation instanceof ByteStreamJVMKt$writeAll$1) {
            byteStreamJVMKt$writeAll$1 = (ByteStreamJVMKt$writeAll$1) continuation;
            int i = byteStreamJVMKt$writeAll$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteStreamJVMKt$writeAll$1.label = i - Integer.MIN_VALUE;
            } else {
                byteStreamJVMKt$writeAll$1 = new ByteStreamJVMKt$writeAll$1(continuation);
            }
        }
        java.lang.Object objKWHzl = byteStreamJVMKt$writeAll$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = byteStreamJVMKt$writeAll$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC5058Dc interfaceC5058DcAEQbTJ = CK.AEQbTJ(file);
                byteStreamJVMKt$writeAll$1.L$0 = interfaceC5058DcAEQbTJ;
                byteStreamJVMKt$writeAll$1.label = 1;
                objKWHzl = CV.KWHzl(cs, interfaceC5058DcAEQbTJ, byteStreamJVMKt$writeAll$1);
                file = interfaceC5058DcAEQbTJ;
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.io.Closeable closeable = (java.io.Closeable) byteStreamJVMKt$writeAll$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                file = closeable;
            }
            java.lang.Long lKWHzl = C56443yFo.KWHzl(((java.lang.Number) objKWHzl).longValue());
            yFA.copydefault(file, null);
            return lKWHzl;
        } finally {
        }
    }
}
