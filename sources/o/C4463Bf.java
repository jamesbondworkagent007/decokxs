package o;

import aws.smithy.kotlin.runtime.http.interceptors.ChecksumValidatingByteReadChannel$read$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C4463Bf implements CS {
    public final java.lang.String KWHzl;
    public final CE OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.CS
    public int AEQbTJ() {
        return this.OLrzqt.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.CS
    public java.lang.Throwable EZpvd() {
        return this.OLrzqt.EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.CS
    public boolean KWHzl() {
        return this.OLrzqt.KWHzl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.CS
    public boolean OLrzqt(java.lang.Throwable th) {
        return this.OLrzqt.OLrzqt(th);
    }

    public C4463Bf(@NotNull java.lang.String str, @NotNull CE ce) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(ce, "");
        this.KWHzl = str;
        this.OLrzqt = ce;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.CS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull CQ cq, long j, @NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
        ChecksumValidatingByteReadChannel$read$1 checksumValidatingByteReadChannel$read$1;
        C4463Bf c4463Bf;
        if (continuation instanceof ChecksumValidatingByteReadChannel$read$1) {
            checksumValidatingByteReadChannel$read$1 = (ChecksumValidatingByteReadChannel$read$1) continuation;
            int i = checksumValidatingByteReadChannel$read$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checksumValidatingByteReadChannel$read$1.label = i - Integer.MIN_VALUE;
            } else {
                checksumValidatingByteReadChannel$read$1 = new ChecksumValidatingByteReadChannel$read$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = checksumValidatingByteReadChannel$read$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = checksumValidatingByteReadChannel$read$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            CE ce = this.OLrzqt;
            checksumValidatingByteReadChannel$read$1.L$0 = this;
            checksumValidatingByteReadChannel$read$1.label = 1;
            objCopydefault = ce.copydefault(cq, j, checksumValidatingByteReadChannel$read$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c4463Bf = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4463Bf = (C4463Bf) checksumValidatingByteReadChannel$read$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        if (((java.lang.Number) objCopydefault).longValue() == -1) {
            C4490Bg.copydefault(c4463Bf.KWHzl, C5162Hc.OLrzqt(c4463Bf.OLrzqt.OLrzqt()));
        }
        return objCopydefault;
    }
}
