package o;

import aws.smithy.kotlin.runtime.http.interceptors.LengthValidatingByteReadChannel$read$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C4679Bn implements CS {
    public final long EZpvd;
    public long KWHzl;
    public final CS OLrzqt;

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

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.CS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull CQ cq, long j, @NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
        LengthValidatingByteReadChannel$read$1 lengthValidatingByteReadChannel$read$1;
        C4679Bn c4679Bn;
        if (continuation instanceof LengthValidatingByteReadChannel$read$1) {
            lengthValidatingByteReadChannel$read$1 = (LengthValidatingByteReadChannel$read$1) continuation;
            int i = lengthValidatingByteReadChannel$read$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lengthValidatingByteReadChannel$read$1.label = i - Integer.MIN_VALUE;
            } else {
                lengthValidatingByteReadChannel$read$1 = new LengthValidatingByteReadChannel$read$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = lengthValidatingByteReadChannel$read$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = lengthValidatingByteReadChannel$read$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            CS cs = this.OLrzqt;
            lengthValidatingByteReadChannel$read$1.L$0 = this;
            lengthValidatingByteReadChannel$read$1.label = 1;
            objCopydefault = cs.copydefault(cq, j, lengthValidatingByteReadChannel$read$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c4679Bn = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4679Bn = (C4679Bn) lengthValidatingByteReadChannel$read$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        long jLongValue = ((java.lang.Number) objCopydefault).longValue();
        if (!c4679Bn.OLrzqt.KWHzl()) {
            long j2 = c4679Bn.KWHzl;
            if (j2 > c4679Bn.EZpvd) {
                if (jLongValue != -1) {
                    c4679Bn.KWHzl += jLongValue;
                }
                C4814Bs.KWHzl(c4679Bn.EZpvd, C56443yFo.KWHzl(c4679Bn.KWHzl));
            } else {
                c4679Bn.KWHzl = j2 + jLongValue;
            }
        }
        return objCopydefault;
    }
}
