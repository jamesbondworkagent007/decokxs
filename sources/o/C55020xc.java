package o;

import aws.smithy.kotlin.runtime.auth.awssigning.AwsChunkedByteReadChannel$read$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C55020xc implements CS {
    public final C56080xw AEQbTJ;
    public final InterfaceC55285xh EZpvd;
    public final CS KWHzl;
    public final C55338xi OLrzqt;
    public byte[] copydefault;
    public final InterfaceC58536zG valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.CS
    public java.lang.Throwable EZpvd() {
        return this.KWHzl.EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.CS
    public boolean OLrzqt(java.lang.Throwable th) {
        return this.KWHzl.OLrzqt(th);
    }

    public C55020xc(@NotNull CS cs, @NotNull InterfaceC55285xh interfaceC55285xh, @NotNull C55338xi c55338xi, @NotNull byte[] bArr, @NotNull InterfaceC58536zG interfaceC58536zG) {
        Intrinsics.checkNotNullParameter(cs, "");
        Intrinsics.checkNotNullParameter(interfaceC55285xh, "");
        Intrinsics.checkNotNullParameter(c55338xi, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(interfaceC58536zG, "");
        this.KWHzl = cs;
        this.EZpvd = interfaceC55285xh;
        this.OLrzqt = c55338xi;
        this.copydefault = bArr;
        this.valueOf = interfaceC58536zG;
        this.AEQbTJ = new C56080xw(C55073xd.EZpvd(cs), interfaceC55285xh, c55338xi, this.copydefault, interfaceC58536zG);
    }

    @Override // o.CS
    public boolean KWHzl() {
        return this.AEQbTJ.KWHzl().AhwBna() == 0 && this.AEQbTJ.EZpvd() && this.KWHzl.KWHzl();
    }

    @Override // o.CS
    public int AEQbTJ() {
        return ((int) this.AEQbTJ.KWHzl().AhwBna()) + this.KWHzl.AEQbTJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.CS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull CQ cq, long j, @NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
        AwsChunkedByteReadChannel$read$1 awsChunkedByteReadChannel$read$1;
        C55020xc c55020xc;
        if (continuation instanceof AwsChunkedByteReadChannel$read$1) {
            awsChunkedByteReadChannel$read$1 = (AwsChunkedByteReadChannel$read$1) continuation;
            int i = awsChunkedByteReadChannel$read$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                awsChunkedByteReadChannel$read$1.label = i - Integer.MIN_VALUE;
            } else {
                awsChunkedByteReadChannel$read$1 = new AwsChunkedByteReadChannel$read$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = awsChunkedByteReadChannel$read$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = awsChunkedByteReadChannel$read$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            if (j < 0) {
                throw new java.lang.IllegalArgumentException(("Invalid limit (" + j + ") must be >= 0L").toString());
            }
            C56080xw c56080xw = this.AEQbTJ;
            awsChunkedByteReadChannel$read$1.L$0 = this;
            awsChunkedByteReadChannel$read$1.L$1 = cq;
            awsChunkedByteReadChannel$read$1.J$0 = j;
            awsChunkedByteReadChannel$read$1.label = 1;
            objOLrzqt = c56080xw.OLrzqt(awsChunkedByteReadChannel$read$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c55020xc = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = awsChunkedByteReadChannel$read$1.J$0;
            cq = (CQ) awsChunkedByteReadChannel$read$1.L$1;
            c55020xc = (C55020xc) awsChunkedByteReadChannel$read$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        return !((java.lang.Boolean) objOLrzqt).booleanValue() ? C56443yFo.KWHzl(-1L) : C56443yFo.KWHzl(c55020xc.AEQbTJ.KWHzl().KWHzl(cq, j));
    }
}
