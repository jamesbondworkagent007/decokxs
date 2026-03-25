package o;

import android.support.v4.media.session.PlaybackStateCompat;
import aws.smithy.kotlin.runtime.auth.awssigning.AwsSignatureType;
import aws.smithy.kotlin.runtime.auth.awssigning.internal.AwsChunkedReader$ensureValidChunk$1;
import aws.smithy.kotlin.runtime.auth.awssigning.internal.AwsChunkedReader$getFinalChunk$1;
import aws.smithy.kotlin.runtime.auth.awssigning.internal.AwsChunkedReader$getSignedChunk$1;
import aws.smithy.kotlin.runtime.auth.awssigning.internal.AwsChunkedReader$getTrailingHeadersChunk$1;
import aws.smithy.kotlin.runtime.auth.awssigning.internal.AwsChunkedReader$getUnsignedChunk$1;
import aws.smithy.kotlin.runtime.auth.awssigning.internal.AwsChunkedReader$readChunk$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import o.AbstractC55709xp;
import o.C55338xi;
import o.CO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C56080xw {
    public final InterfaceC55285xh AEQbTJ;
    public final Application AYXKKw;
    public final InterfaceC58536zG AhwBna;
    public final CQ EZpvd;
    public final C55338xi KWHzl;
    public boolean OLrzqt;
    public byte[] copydefault;

    /* JADX INFO: renamed from: o.xw$Application */
    public interface Application {
        java.lang.Object AEQbTJ(@NotNull CQ cq, long j, @NotNull Continuation<? super java.lang.Long> continuation);

        boolean EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CQ KWHzl() {
        return this.EZpvd;
    }

    public C56080xw(@NotNull Application application, @NotNull InterfaceC55285xh interfaceC55285xh, @NotNull C55338xi c55338xi, @NotNull byte[] bArr, @NotNull InterfaceC58536zG interfaceC58536zG) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(interfaceC55285xh, "");
        Intrinsics.checkNotNullParameter(c55338xi, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(interfaceC58536zG, "");
        this.AYXKKw = application;
        this.AEQbTJ = interfaceC55285xh;
        this.KWHzl = c55338xi;
        this.copydefault = bArr;
        this.AhwBna = interfaceC58536zG;
        this.EZpvd = new CQ();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        AwsChunkedReader$ensureValidChunk$1 awsChunkedReader$ensureValidChunk$1;
        CQ cq;
        C56080xw c56080xw;
        C56080xw c56080xw2;
        CQ cq2;
        if (continuation instanceof AwsChunkedReader$ensureValidChunk$1) {
            awsChunkedReader$ensureValidChunk$1 = (AwsChunkedReader$ensureValidChunk$1) continuation;
            int i = awsChunkedReader$ensureValidChunk$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                awsChunkedReader$ensureValidChunk$1.label = i - Integer.MIN_VALUE;
            } else {
                awsChunkedReader$ensureValidChunk$1 = new AwsChunkedReader$ensureValidChunk$1(this, continuation);
            }
        }
        java.lang.Object signedChunk$default = awsChunkedReader$ensureValidChunk$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = awsChunkedReader$ensureValidChunk$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(signedChunk$default);
            if (this.EZpvd.AhwBna() > 0) {
                return C56443yFo.KWHzl(true);
            }
            cq = null;
            if (this.AYXKKw.EZpvd() && this.OLrzqt) {
                c56080xw2 = this;
                if (cq != null) {
                }
                if (cq != null) {
                }
                return C56443yFo.KWHzl(c56080xw2.EZpvd.AhwBna() > 0);
            }
            boolean zAEQbTJ = AEQbTJ(this.KWHzl);
            awsChunkedReader$ensureValidChunk$1.L$0 = this;
            if (zAEQbTJ) {
                awsChunkedReader$ensureValidChunk$1.label = 1;
                signedChunk$default = getUnsignedChunk$default(this, null, awsChunkedReader$ensureValidChunk$1, 1, null);
                if (signedChunk$default == objCopydefault) {
                    return objCopydefault;
                }
                c56080xw = this;
                cq2 = (CQ) signedChunk$default;
            } else {
                awsChunkedReader$ensureValidChunk$1.label = 2;
                signedChunk$default = getSignedChunk$default(this, null, awsChunkedReader$ensureValidChunk$1, 1, null);
                if (signedChunk$default == objCopydefault) {
                    return objCopydefault;
                }
                c56080xw = this;
                cq2 = (CQ) signedChunk$default;
            }
        } else if (i2 == 1) {
            c56080xw = (C56080xw) awsChunkedReader$ensureValidChunk$1.L$0;
            C56391yDq.AEQbTJ(signedChunk$default);
            cq2 = (CQ) signedChunk$default;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c56080xw2 = (C56080xw) awsChunkedReader$ensureValidChunk$1.L$0;
                C56391yDq.AEQbTJ(signedChunk$default);
                cq2 = (CQ) signedChunk$default;
                c56080xw2.OLrzqt = true;
                cq = cq2;
                if (cq != null) {
                    CO.Application.writeUtf8$default(cq, "\r\n", 0, 0, 6, null);
                }
                if (cq != null) {
                    C56443yFo.KWHzl(c56080xw2.EZpvd.KWHzl(cq));
                }
                return C56443yFo.KWHzl(c56080xw2.EZpvd.AhwBna() > 0);
            }
            c56080xw = (C56080xw) awsChunkedReader$ensureValidChunk$1.L$0;
            C56391yDq.AEQbTJ(signedChunk$default);
            cq2 = (CQ) signedChunk$default;
        }
        if (cq2 != null) {
            c56080xw2 = c56080xw;
            cq = cq2;
            if (cq != null) {
            }
            if (cq != null) {
            }
            return C56443yFo.KWHzl(c56080xw2.EZpvd.AhwBna() > 0);
        }
        if (!c56080xw.AYXKKw.EZpvd()) {
            throw new java.lang.IllegalStateException("Expected underlying reader to be closed".toString());
        }
        awsChunkedReader$ensureValidChunk$1.L$0 = c56080xw;
        awsChunkedReader$ensureValidChunk$1.label = 3;
        signedChunk$default = c56080xw.copydefault(awsChunkedReader$ensureValidChunk$1);
        if (signedChunk$default == objCopydefault) {
            return objCopydefault;
        }
        c56080xw2 = c56080xw;
        cq2 = (CQ) signedChunk$default;
        c56080xw2.OLrzqt = true;
        cq = cq2;
        if (cq != null) {
        }
        if (cq != null) {
        }
        return C56443yFo.KWHzl(c56080xw2.EZpvd.AhwBna() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(Continuation<? super CQ> continuation) throws java.lang.Throwable {
        AwsChunkedReader$getFinalChunk$1 awsChunkedReader$getFinalChunk$1;
        C56080xw c56080xw;
        CQ cq;
        CQ cq2;
        if (continuation instanceof AwsChunkedReader$getFinalChunk$1) {
            awsChunkedReader$getFinalChunk$1 = (AwsChunkedReader$getFinalChunk$1) continuation;
            int i = awsChunkedReader$getFinalChunk$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                awsChunkedReader$getFinalChunk$1.label = i - Integer.MIN_VALUE;
            } else {
                awsChunkedReader$getFinalChunk$1 = new AwsChunkedReader$getFinalChunk$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = awsChunkedReader$getFinalChunk$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = awsChunkedReader$getFinalChunk$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (AEQbTJ(this.KWHzl)) {
                CQ cq3 = new CQ();
                awsChunkedReader$getFinalChunk$1.L$0 = this;
                awsChunkedReader$getFinalChunk$1.label = 1;
                objEZpvd = OLrzqt(cq3, awsChunkedReader$getFinalChunk$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                CQ cq4 = new CQ();
                awsChunkedReader$getFinalChunk$1.L$0 = this;
                awsChunkedReader$getFinalChunk$1.label = 2;
                objEZpvd = EZpvd(cq4, awsChunkedReader$getFinalChunk$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            }
            c56080xw = this;
        } else {
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cq2 = (CQ) awsChunkedReader$getFinalChunk$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    cq2.KWHzl((CQ) objEZpvd);
                    return cq2;
                }
                c56080xw = (C56080xw) awsChunkedReader$getFinalChunk$1.L$1;
                cq = (CQ) awsChunkedReader$getFinalChunk$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                awsChunkedReader$getFinalChunk$1.L$0 = cq;
                awsChunkedReader$getFinalChunk$1.L$1 = null;
                awsChunkedReader$getFinalChunk$1.label = 4;
                objEZpvd = c56080xw.OLrzqt((InterfaceC58725zN) objEZpvd, awsChunkedReader$getFinalChunk$1);
                if (objEZpvd != objCopydefault) {
                    return objCopydefault;
                }
                cq2 = cq;
                cq2.KWHzl((CQ) objEZpvd);
                return cq2;
            }
            c56080xw = (C56080xw) awsChunkedReader$getFinalChunk$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        CQ cq5 = (CQ) objEZpvd;
        if (cq5 == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        if (c56080xw.AhwBna.EZpvd()) {
            return cq5;
        }
        InterfaceC58536zG interfaceC58536zG = c56080xw.AhwBna;
        awsChunkedReader$getFinalChunk$1.L$0 = cq5;
        awsChunkedReader$getFinalChunk$1.L$1 = c56080xw;
        awsChunkedReader$getFinalChunk$1.label = 3;
        java.lang.Object objOLrzqt = C58671zL.OLrzqt(interfaceC58536zG, awsChunkedReader$getFinalChunk$1);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        cq = cq5;
        objEZpvd = objOLrzqt;
        awsChunkedReader$getFinalChunk$1.L$0 = cq;
        awsChunkedReader$getFinalChunk$1.L$1 = null;
        awsChunkedReader$getFinalChunk$1.label = 4;
        objEZpvd = c56080xw.OLrzqt((InterfaceC58725zN) objEZpvd, awsChunkedReader$getFinalChunk$1);
        if (objEZpvd != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005e -> B:21:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Application application, Continuation<? super CQ> continuation) throws java.lang.Throwable {
        AwsChunkedReader$readChunk$1 awsChunkedReader$readChunk$1;
        long j;
        Application application2;
        CQ cq;
        if (continuation instanceof AwsChunkedReader$readChunk$1) {
            awsChunkedReader$readChunk$1 = (AwsChunkedReader$readChunk$1) continuation;
            int i = awsChunkedReader$readChunk$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                awsChunkedReader$readChunk$1.label = i - Integer.MIN_VALUE;
            } else {
                awsChunkedReader$readChunk$1 = new AwsChunkedReader$readChunk$1(this, continuation);
            }
        }
        java.lang.Object obj = awsChunkedReader$readChunk$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = awsChunkedReader$readChunk$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = awsChunkedReader$readChunk$1.J$0;
            cq = (CQ) awsChunkedReader$readChunk$1.L$1;
            Application application3 = (Application) awsChunkedReader$readChunk$1.L$0;
            C56391yDq.AEQbTJ(obj);
            long jLongValue = ((java.lang.Number) obj).longValue();
            if (jLongValue != -1) {
                j -= jLongValue;
                application2 = application3;
                if (j > 0) {
                    awsChunkedReader$readChunk$1.L$0 = application2;
                    awsChunkedReader$readChunk$1.L$1 = cq;
                    awsChunkedReader$readChunk$1.J$0 = j;
                    awsChunkedReader$readChunk$1.label = 1;
                    java.lang.Object objAEQbTJ = application2.AEQbTJ(cq, j, awsChunkedReader$readChunk$1);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    application3 = application2;
                    obj = objAEQbTJ;
                    long jLongValue2 = ((java.lang.Number) obj).longValue();
                    if (jLongValue2 != -1) {
                    }
                }
            }
            if (cq.AhwBna() != 0) {
                return null;
            }
            return cq;
        }
        C56391yDq.AEQbTJ(obj);
        CQ cq2 = new CQ();
        j = PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
        application2 = application;
        cq = cq2;
        if (j > 0) {
        }
        if (cq.AhwBna() != 0) {
        }
    }

    public static /* synthetic */ java.lang.Object getSignedChunk$default(C56080xw c56080xw, CQ cq, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cq = null;
        }
        return c56080xw.EZpvd(cq, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(CQ cq, Continuation<? super CQ> continuation) throws java.lang.Throwable {
        AwsChunkedReader$getSignedChunk$1 awsChunkedReader$getSignedChunk$1;
        C56080xw c56080xw;
        C56080xw c56080xw2;
        byte[] bArrKWHzl;
        byte[] bArr;
        C56080xw c56080xw3;
        if (continuation instanceof AwsChunkedReader$getSignedChunk$1) {
            awsChunkedReader$getSignedChunk$1 = (AwsChunkedReader$getSignedChunk$1) continuation;
            int i = awsChunkedReader$getSignedChunk$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                awsChunkedReader$getSignedChunk$1.label = i - Integer.MIN_VALUE;
            } else {
                awsChunkedReader$getSignedChunk$1 = new AwsChunkedReader$getSignedChunk$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = awsChunkedReader$getSignedChunk$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = awsChunkedReader$getSignedChunk$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            if (cq != null) {
                c56080xw = this;
                if (cq == null && (bArrKWHzl = cq.KWHzl()) != null) {
                    InterfaceC55285xh interfaceC55285xh = c56080xw.AEQbTJ;
                    byte[] bArr2 = c56080xw.copydefault;
                    C55338xi c55338xiKWHzl = c56080xw.KWHzl(c56080xw.KWHzl);
                    awsChunkedReader$getSignedChunk$1.L$0 = c56080xw;
                    awsChunkedReader$getSignedChunk$1.L$1 = bArrKWHzl;
                    awsChunkedReader$getSignedChunk$1.label = 2;
                    java.lang.Object objOLrzqt2 = interfaceC55285xh.OLrzqt(bArrKWHzl, bArr2, c55338xiKWHzl, awsChunkedReader$getSignedChunk$1);
                    if (objOLrzqt2 == objCopydefault) {
                        return objCopydefault;
                    }
                    bArr = bArrKWHzl;
                    c56080xw3 = c56080xw;
                    objOLrzqt = objOLrzqt2;
                    byte[] bArrOLrzqt = ((C55497xl) objOLrzqt).OLrzqt();
                    c56080xw3.copydefault = bArrOLrzqt;
                    CQ cq2 = new CQ();
                    java.lang.String string = java.lang.Integer.toString(bArr.length, CharsKt__CharJVMKt.checkRadix(16));
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    CO.Application.writeUtf8$default(cq2, string, 0, 0, 6, null);
                    CO.Application.writeUtf8$default(cq2, ";", 0, 0, 6, null);
                    CO.Application.writeUtf8$default(cq2, "chunk-signature=", 0, 0, 6, null);
                    CO.Application.write$default(cq2, bArrOLrzqt, 0, 0, 6, null);
                    CO.Application.writeUtf8$default(cq2, "\r\n", 0, 0, 6, null);
                    CO.Application.write$default(cq2, bArr, 0, 0, 6, null);
                    return cq2;
                }
            }
            Application application = this.AYXKKw;
            awsChunkedReader$getSignedChunk$1.L$0 = this;
            awsChunkedReader$getSignedChunk$1.label = 1;
            objOLrzqt = OLrzqt(application, awsChunkedReader$getSignedChunk$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c56080xw2 = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                byte[] bArr3 = (byte[]) awsChunkedReader$getSignedChunk$1.L$1;
                c56080xw3 = (C56080xw) awsChunkedReader$getSignedChunk$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                bArr = bArr3;
                byte[] bArrOLrzqt2 = ((C55497xl) objOLrzqt).OLrzqt();
                c56080xw3.copydefault = bArrOLrzqt2;
                CQ cq22 = new CQ();
                java.lang.String string2 = java.lang.Integer.toString(bArr.length, CharsKt__CharJVMKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string2, "");
                CO.Application.writeUtf8$default(cq22, string2, 0, 0, 6, null);
                CO.Application.writeUtf8$default(cq22, ";", 0, 0, 6, null);
                CO.Application.writeUtf8$default(cq22, "chunk-signature=", 0, 0, 6, null);
                CO.Application.write$default(cq22, bArrOLrzqt2, 0, 0, 6, null);
                CO.Application.writeUtf8$default(cq22, "\r\n", 0, 0, 6, null);
                CO.Application.write$default(cq22, bArr, 0, 0, 6, null);
                return cq22;
            }
            c56080xw2 = (C56080xw) awsChunkedReader$getSignedChunk$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        CQ cq3 = (CQ) objOLrzqt;
        c56080xw = c56080xw2;
        cq = cq3;
        return cq == null ? null : null;
    }

    public static /* synthetic */ java.lang.Object getUnsignedChunk$default(C56080xw c56080xw, CQ cq, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cq = null;
        }
        return c56080xw.OLrzqt(cq, (Continuation<? super CQ>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(CQ cq, Continuation<? super CQ> continuation) throws java.lang.Throwable {
        AwsChunkedReader$getUnsignedChunk$1 awsChunkedReader$getUnsignedChunk$1;
        if (continuation instanceof AwsChunkedReader$getUnsignedChunk$1) {
            awsChunkedReader$getUnsignedChunk$1 = (AwsChunkedReader$getUnsignedChunk$1) continuation;
            int i = awsChunkedReader$getUnsignedChunk$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                awsChunkedReader$getUnsignedChunk$1.label = i - Integer.MIN_VALUE;
            } else {
                awsChunkedReader$getUnsignedChunk$1 = new AwsChunkedReader$getUnsignedChunk$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = awsChunkedReader$getUnsignedChunk$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = awsChunkedReader$getUnsignedChunk$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            if (cq == null) {
                Application application = this.AYXKKw;
                awsChunkedReader$getUnsignedChunk$1.label = 1;
                objOLrzqt = OLrzqt(application, awsChunkedReader$getUnsignedChunk$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            }
            CQ cq2 = new CQ();
            java.lang.String string = java.lang.Long.toString(cq.AhwBna(), CharsKt__CharJVMKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "");
            CO.Application.writeUtf8$default(cq2, string, 0, 0, 6, null);
            CO.Application.writeUtf8$default(cq2, "\r\n", 0, 0, 6, null);
            cq2.KWHzl(cq);
            return cq2;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        cq = (CQ) objOLrzqt;
        if (cq == null) {
            return null;
        }
        CQ cq22 = new CQ();
        java.lang.String string2 = java.lang.Long.toString(cq.AhwBna(), CharsKt__CharJVMKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string2, "");
        CO.Application.writeUtf8$default(cq22, string2, 0, 0, 6, null);
        CO.Application.writeUtf8$default(cq22, "\r\n", 0, 0, 6, null);
        cq22.KWHzl(cq);
        return cq22;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(InterfaceC58725zN interfaceC58725zN, Continuation<? super CQ> continuation) throws java.lang.Throwable {
        AwsChunkedReader$getTrailingHeadersChunk$1 awsChunkedReader$getTrailingHeadersChunk$1;
        C56080xw c56080xw;
        if (continuation instanceof AwsChunkedReader$getTrailingHeadersChunk$1) {
            awsChunkedReader$getTrailingHeadersChunk$1 = (AwsChunkedReader$getTrailingHeadersChunk$1) continuation;
            int i = awsChunkedReader$getTrailingHeadersChunk$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                awsChunkedReader$getTrailingHeadersChunk$1.label = i - Integer.MIN_VALUE;
            } else {
                awsChunkedReader$getTrailingHeadersChunk$1 = new AwsChunkedReader$getTrailingHeadersChunk$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = awsChunkedReader$getTrailingHeadersChunk$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = awsChunkedReader$getTrailingHeadersChunk$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            InterfaceC55285xh interfaceC55285xh = this.AEQbTJ;
            byte[] bArr = this.copydefault;
            C55338xi c55338xiCopydefault = copydefault(this.KWHzl);
            awsChunkedReader$getTrailingHeadersChunk$1.L$0 = this;
            awsChunkedReader$getTrailingHeadersChunk$1.L$1 = interfaceC58725zN;
            awsChunkedReader$getTrailingHeadersChunk$1.label = 1;
            objKWHzl = interfaceC55285xh.KWHzl(interfaceC58725zN, bArr, c55338xiCopydefault, awsChunkedReader$getTrailingHeadersChunk$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c56080xw = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC58725zN = (InterfaceC58725zN) awsChunkedReader$getTrailingHeadersChunk$1.L$1;
            c56080xw = (C56080xw) awsChunkedReader$getTrailingHeadersChunk$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        byte[] bArrOLrzqt = ((C55497xl) objKWHzl).OLrzqt();
        c56080xw.copydefault = bArrOLrzqt;
        CQ cq = new CQ();
        C54265xC.KWHzl(cq, interfaceC58725zN);
        if (!c56080xw.AEQbTJ(c56080xw.KWHzl)) {
            C54265xC.OLrzqt(cq, C59449zhJ.copydefault(bArrOLrzqt));
        }
        return cq;
    }

    public final C55338xi KWHzl(C55338xi c55338xi) {
        C55338xi.Activity activityAkhnZx = c55338xi.AkhnZx();
        activityAkhnZx.copydefault(AwsSignatureType.HTTP_REQUEST_CHUNK);
        activityAkhnZx.OLrzqt(AbstractC55709xp.StateListAnimator.OLrzqt);
        return activityAkhnZx.EZpvd();
    }

    public final C55338xi copydefault(C55338xi c55338xi) {
        C55338xi.Activity activityAkhnZx = c55338xi.AkhnZx();
        activityAkhnZx.copydefault(AwsSignatureType.HTTP_REQUEST_TRAILING_HEADERS);
        activityAkhnZx.OLrzqt(AbstractC55709xp.StateListAnimator.OLrzqt);
        return activityAkhnZx.EZpvd();
    }

    public final boolean AEQbTJ(C55338xi c55338xi) {
        return Intrinsics.EZpvd(c55338xi.copydefault(), AbstractC55709xp.FragmentManager.AEQbTJ);
    }
}
