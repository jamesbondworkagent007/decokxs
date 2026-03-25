package o;

import aws.smithy.kotlin.runtime.io.SdkByteReadChannelKt$readAll$2;
import aws.smithy.kotlin.runtime.io.SdkByteReadChannelKt$readFully$1;
import aws.smithy.kotlin.runtime.io.SdkByteReadChannelKt$readToBuffer$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CV {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(@NotNull CS cs, @NotNull CQ cq, long j, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SdkByteReadChannelKt$readFully$1 sdkByteReadChannelKt$readFully$1;
        long j2;
        if (continuation instanceof SdkByteReadChannelKt$readFully$1) {
            sdkByteReadChannelKt$readFully$1 = (SdkByteReadChannelKt$readFully$1) continuation;
            int i = sdkByteReadChannelKt$readFully$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdkByteReadChannelKt$readFully$1.label = i - Integer.MIN_VALUE;
            } else {
                sdkByteReadChannelKt$readFully$1 = new SdkByteReadChannelKt$readFully$1(continuation);
            }
        }
        java.lang.Object objCopydefault = sdkByteReadChannelKt$readFully$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = sdkByteReadChannelKt$readFully$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            j2 = j;
            if (j <= 0) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = sdkByteReadChannelKt$readFully$1.J$1;
            long j4 = sdkByteReadChannelKt$readFully$1.J$0;
            CQ cq2 = (CQ) sdkByteReadChannelKt$readFully$1.L$1;
            CS cs2 = (CS) sdkByteReadChannelKt$readFully$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            long jLongValue = ((java.lang.Number) objCopydefault).longValue();
            if (jLongValue == -1) {
                long j5 = j3 - jLongValue;
                cq = cq2;
                cs = cs2;
                j2 = j4;
                j = j5;
                if (j <= 0) {
                    sdkByteReadChannelKt$readFully$1.L$0 = cs;
                    sdkByteReadChannelKt$readFully$1.L$1 = cq;
                    sdkByteReadChannelKt$readFully$1.J$0 = j2;
                    sdkByteReadChannelKt$readFully$1.J$1 = j;
                    sdkByteReadChannelKt$readFully$1.label = 1;
                    objCopydefault = cs.copydefault(cq, j, sdkByteReadChannelKt$readFully$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    cq2 = cq;
                    long j6 = j2;
                    cs2 = cs;
                    j3 = j;
                    j4 = j6;
                    long jLongValue2 = ((java.lang.Number) objCopydefault).longValue();
                    if (jLongValue2 == -1) {
                        throw new java.io.EOFException("Unexpected EOF: expected " + j3 + " more bytes; consumed: " + (j4 - j3));
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(@org.jetbrains.annotations.NotNull o.CS r7, @org.jetbrains.annotations.NotNull o.CQ r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof aws.smithy.kotlin.runtime.io.SdkByteReadChannelKt$readRemaining$1
            if (r0 == 0) goto L13
            r0 = r9
            aws.smithy.kotlin.runtime.io.SdkByteReadChannelKt$readRemaining$1 r0 = (aws.smithy.kotlin.runtime.io.SdkByteReadChannelKt$readRemaining$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            aws.smithy.kotlin.runtime.io.SdkByteReadChannelKt$readRemaining$1 r0 = new aws.smithy.kotlin.runtime.io.SdkByteReadChannelKt$readRemaining$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = o.C56437yFi.OLrzqt()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.L$1
            o.CQ r7 = (o.CQ) r7
            java.lang.Object r8 = r0.L$0
            o.CS r8 = (o.CS) r8
            o.C56391yDq.AEQbTJ(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L51
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            o.C56391yDq.AEQbTJ(r9)
        L3f:
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r9 = r7.copydefault(r8, r4, r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            boolean r9 = r7.KWHzl()
            if (r9 == 0) goto L3f
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CV.copydefault(o.CS, o.CQ, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(@NotNull CS cs, @NotNull Continuation<? super CQ> continuation) throws java.lang.Throwable {
        SdkByteReadChannelKt$readToBuffer$1 sdkByteReadChannelKt$readToBuffer$1;
        if (continuation instanceof SdkByteReadChannelKt$readToBuffer$1) {
            sdkByteReadChannelKt$readToBuffer$1 = (SdkByteReadChannelKt$readToBuffer$1) continuation;
            int i = sdkByteReadChannelKt$readToBuffer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdkByteReadChannelKt$readToBuffer$1.label = i - Integer.MIN_VALUE;
            } else {
                sdkByteReadChannelKt$readToBuffer$1 = new SdkByteReadChannelKt$readToBuffer$1(continuation);
            }
        }
        java.lang.Object obj = sdkByteReadChannelKt$readToBuffer$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = sdkByteReadChannelKt$readToBuffer$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CQ cq = (CQ) sdkByteReadChannelKt$readToBuffer$1.L$0;
            C56391yDq.AEQbTJ(obj);
            return cq;
        }
        C56391yDq.AEQbTJ(obj);
        CQ cq2 = new CQ();
        sdkByteReadChannelKt$readToBuffer$1.L$0 = cq2;
        sdkByteReadChannelKt$readToBuffer$1.label = 1;
        return copydefault(cs, cq2, sdkByteReadChannelKt$readToBuffer$1) == objCopydefault ? objCopydefault : cq2;
    }

    public static final java.lang.Object KWHzl(@NotNull CS cs, @NotNull InterfaceC5058Dc interfaceC5058Dc, @NotNull Continuation<? super java.lang.Long> continuation) {
        return BuildersKt.withContext(C5070Do.OLrzqt.AEQbTJ(), new SdkByteReadChannelKt$readAll$2(interfaceC5058Dc, cs, null), continuation);
    }
}
