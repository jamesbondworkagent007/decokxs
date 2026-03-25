package o;

import aws.smithy.kotlin.runtime.io.GzipByteReadChannel$read$1;
import java.util.zip.GZIPOutputStream;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CD implements CS {
    public final CQ AEQbTJ;
    public final GZIPOutputStream EZpvd;
    public final CS KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.CS
    public java.lang.Throwable EZpvd() {
        return this.KWHzl.EZpvd();
    }

    public CD(@NotNull CS cs) {
        Intrinsics.checkNotNullParameter(cs, "");
        this.KWHzl = cs;
        CQ cq = new CQ();
        this.AEQbTJ = cq;
        this.EZpvd = new GZIPOutputStream(cq.gEmmrt(), true);
    }

    @Override // o.CS
    public int AEQbTJ() {
        return (int) this.AEQbTJ.AhwBna();
    }

    @Override // o.CS
    public boolean KWHzl() {
        return this.KWHzl.KWHzl() && this.AEQbTJ.c_() && this.copydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.CS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull CQ cq, long j, @NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
        GzipByteReadChannel$read$1 gzipByteReadChannel$read$1;
        CQ cq2;
        CQ cq3;
        CD cd;
        if (continuation instanceof GzipByteReadChannel$read$1) {
            gzipByteReadChannel$read$1 = (GzipByteReadChannel$read$1) continuation;
            int i = gzipByteReadChannel$read$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                gzipByteReadChannel$read$1.label = i - Integer.MIN_VALUE;
            } else {
                gzipByteReadChannel$read$1 = new GzipByteReadChannel$read$1(this, continuation);
            }
        }
        java.lang.Object obj = gzipByteReadChannel$read$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = gzipByteReadChannel$read$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (j == 0) {
                return C56443yFo.KWHzl(0L);
            }
            CQ cq4 = new CQ();
            CS cs = this.KWHzl;
            gzipByteReadChannel$read$1.L$0 = this;
            gzipByteReadChannel$read$1.L$1 = cq;
            gzipByteReadChannel$read$1.L$2 = cq4;
            gzipByteReadChannel$read$1.J$0 = j;
            gzipByteReadChannel$read$1.label = 1;
            java.lang.Object objCopydefault2 = cs.copydefault(cq4, j, gzipByteReadChannel$read$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            cq2 = cq;
            cq3 = cq4;
            obj = objCopydefault2;
            cd = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = gzipByteReadChannel$read$1.J$0;
            cq3 = (CQ) gzipByteReadChannel$read$1.L$2;
            cq2 = (CQ) gzipByteReadChannel$read$1.L$1;
            cd = (CD) gzipByteReadChannel$read$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        long jLongValue = ((java.lang.Number) obj).longValue();
        if (jLongValue == -1) {
            cd.EZpvd.close();
            cd.copydefault = true;
        }
        if (jLongValue == -1 && cd.AEQbTJ.c_()) {
            return C56443yFo.KWHzl(-1L);
        }
        if (jLongValue >= 0) {
            cd.EZpvd.write(cq3.KWHzl());
            cd.EZpvd.flush();
        }
        return C56443yFo.KWHzl(cd.AEQbTJ.KWHzl(cq2, j));
    }

    @Override // o.CS
    public boolean OLrzqt(java.lang.Throwable th) throws java.io.IOException {
        this.EZpvd.close();
        return this.KWHzl.OLrzqt(th);
    }
}
