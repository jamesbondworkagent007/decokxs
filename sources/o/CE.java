package o;

import aws.smithy.kotlin.runtime.io.HashingByteReadChannel$read$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CE implements CS {
    public final InterfaceC59908zr AEQbTJ;
    public final CS EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.CS
    public int AEQbTJ() {
        return this.EZpvd.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.CS
    public java.lang.Throwable EZpvd() {
        return this.EZpvd.EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.CS
    public boolean KWHzl() {
        return this.EZpvd.KWHzl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.CS
    public boolean OLrzqt(java.lang.Throwable th) {
        return this.EZpvd.OLrzqt(th);
    }

    public CE(@NotNull InterfaceC59908zr interfaceC59908zr, @NotNull CS cs) {
        Intrinsics.checkNotNullParameter(interfaceC59908zr, "");
        Intrinsics.checkNotNullParameter(cs, "");
        this.AEQbTJ = interfaceC59908zr;
        this.EZpvd = cs;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.CS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull CQ cq, long j, @NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
        HashingByteReadChannel$read$1 hashingByteReadChannel$read$1;
        CO coAEQbTJ;
        if (continuation instanceof HashingByteReadChannel$read$1) {
            hashingByteReadChannel$read$1 = (HashingByteReadChannel$read$1) continuation;
            int i = hashingByteReadChannel$read$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hashingByteReadChannel$read$1.label = i - Integer.MIN_VALUE;
            } else {
                hashingByteReadChannel$read$1 = new HashingByteReadChannel$read$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = hashingByteReadChannel$read$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = hashingByteReadChannel$read$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            coAEQbTJ = CX.AEQbTJ(new CH(this.AEQbTJ, cq));
            CS cs = this.EZpvd;
            CQ cqCopydefault = coAEQbTJ.copydefault();
            hashingByteReadChannel$read$1.L$0 = coAEQbTJ;
            hashingByteReadChannel$read$1.label = 1;
            objCopydefault = cs.copydefault(cqCopydefault, j, hashingByteReadChannel$read$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coAEQbTJ = (CO) hashingByteReadChannel$read$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        ((java.lang.Number) objCopydefault).longValue();
        coAEQbTJ.AEQbTJ();
        return objCopydefault;
    }

    public final byte[] OLrzqt() {
        return this.AEQbTJ.AEQbTJ();
    }
}
