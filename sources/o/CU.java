package o;

import aws.smithy.kotlin.runtime.io.SdkByteWriteChannelKt$writeAvailable$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o.CT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CU {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(@NotNull CT ct, @NotNull CQ cq, @NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
        SdkByteWriteChannelKt$writeAvailable$1 sdkByteWriteChannelKt$writeAvailable$1;
        long j;
        if (continuation instanceof SdkByteWriteChannelKt$writeAvailable$1) {
            sdkByteWriteChannelKt$writeAvailable$1 = (SdkByteWriteChannelKt$writeAvailable$1) continuation;
            int i = sdkByteWriteChannelKt$writeAvailable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdkByteWriteChannelKt$writeAvailable$1.label = i - Integer.MIN_VALUE;
            } else {
                sdkByteWriteChannelKt$writeAvailable$1 = new SdkByteWriteChannelKt$writeAvailable$1(continuation);
            }
        }
        java.lang.Object obj = sdkByteWriteChannelKt$writeAvailable$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = sdkByteWriteChannelKt$writeAvailable$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            long jMin = java.lang.Math.min(ct.AYXKKw(), cq.AhwBna());
            sdkByteWriteChannelKt$writeAvailable$1.J$0 = jMin;
            sdkByteWriteChannelKt$writeAvailable$1.label = 1;
            if (ct.AEQbTJ(cq, jMin, sdkByteWriteChannelKt$writeAvailable$1) == objCopydefault) {
                return objCopydefault;
            }
            j = jMin;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = sdkByteWriteChannelKt$writeAvailable$1.J$0;
            C56391yDq.AEQbTJ(obj);
        }
        return C56443yFo.KWHzl(j);
    }

    public static /* synthetic */ java.lang.Object write$default(CT ct, byte[] bArr, int i, int i2, Continuation continuation, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length - i;
        }
        return KWHzl(ct, bArr, i, i2, continuation);
    }

    public static final java.lang.Object KWHzl(@NotNull CT ct, @NotNull byte[] bArr, int i, int i2, @NotNull Continuation<? super Unit> continuation) {
        CQ cq = new CQ();
        cq.OLrzqt(bArr, i, i2);
        java.lang.Object objWrite$default = CT.TaskDescription.write$default(ct, cq, 0L, continuation, 2, null);
        return objWrite$default == C56442yFn.copydefault() ? objWrite$default : Unit.INSTANCE;
    }
}
