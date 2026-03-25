package o;

import aws.sdk.kotlin.runtime.region.ImdsRegionProvider$resolvedRegion$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterruptedIOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ArithmeticException implements AssertionError, java.io.Closeable {
    public final HM EZpvd;
    public final HH<java.lang.String> KWHzl;
    public final InterfaceC56387yDm<NotSerializableException> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArithmeticException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yDm<? extends o.NotSerializableException> */
    /* JADX WARN: Multi-variable type inference failed */
    public ArithmeticException(@NotNull InterfaceC56387yDm<? extends NotSerializableException> interfaceC56387yDm, @NotNull HM hm) {
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        Intrinsics.checkNotNullParameter(hm, "");
        this.copydefault = interfaceC56387yDm;
        this.EZpvd = hm;
        this.KWHzl = HE.AEQbTJ(new ImdsRegionProvider$resolvedRegion$1(this));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:o.yDm:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yDm:0x0006: INVOKE 
  (wrap:aws.sdk.kotlin.runtime.region.ImdsRegionProvider$1:0x0004: SGET  A[WRAPPED] (LINE:26) aws.sdk.kotlin.runtime.region.ImdsRegionProvider$1.INSTANCE aws.sdk.kotlin.runtime.region.ImdsRegionProvider$1)
 STATIC call: o.yDr.copydefault(kotlin.jvm.functions.Function0):o.yDm A[MD:<T>:(kotlin.jvm.functions.Function0<? extends T>):o.yDm<T> (m), WRAPPED] (LINE:26)) : (r1v0 o.yDm))
  (wrap:o.HM:?: TERNARY null = ((wrap:int:0x000a: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.HM:0x0010: INVOKE (wrap:o.HL$TaskDescription:0x000e: SGET  A[WRAPPED] (LINE:27) o.HL.OLrzqt o.HL$TaskDescription) VIRTUAL call: o.HL.TaskDescription.copydefault():o.HL A[MD:():o.HL (m), WRAPPED] (LINE:27)) : (r2v0 o.HM))
 A[MD:(o.yDm<? extends o.NotSerializableException>, o.HM):void (m)] (LINE:25) call: o.ArithmeticException.<init>(o.yDm, o.HM):void type: THIS */
    public /* synthetic */ ArithmeticException(InterfaceC56387yDm interfaceC56387yDm, HM hm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C56392yDr.copydefault(new Function0<InterruptedIOException>() { // from class: aws.sdk.kotlin.runtime.region.ImdsRegionProvider$1
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final InterruptedIOException invoke() {
                return new InterruptedIOException();
            }
        }) : interfaceC56387yDm, (i & 2) != 0 ? HL.OLrzqt.copydefault() : hm);
    }

    @Override // o.AssertionError
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.String> continuation) {
        if (Intrinsics.EZpvd(C59333zf.AEQbTJ(IOException.zsXlph.fetchVPNInfo(), this.EZpvd), C56443yFo.KWHzl(true))) {
            return null;
        }
        return this.KWHzl.KWHzl(continuation);
    }

    public final java.lang.Object OLrzqt(Continuation<? super java.lang.String> continuation) {
        return this.copydefault.getValue().KWHzl("/latest/meta-data/placement/region", continuation);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.copydefault.isInitialized()) {
            this.copydefault.getValue().close();
        }
    }
}
