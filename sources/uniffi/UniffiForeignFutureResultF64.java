package uniffi;

import androidx.camera.video.AudioStats;
import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60174zxk;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes25.dex */
@Structure.FieldOrder({"returnValue", "callStatus"})
public class UniffiForeignFutureResultF64 extends Structure {
    public static final int $stable = 8;
    public UniffiRustCallStatus.ByValue callStatus;
    public double returnValue;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (r1v0 o.zxk)
  (wrap:double:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:double:0x0004: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r2v0 double))
  (wrap:uniffi.UniffiRustCallStatus$ByValue:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:uniffi.UniffiRustCallStatus$ByValue:0x000c: CONSTRUCTOR (r1v0 o.zxk) A[MD:(o.zxk):void (m), WRAPPED] (LINE:685) call: uniffi.UniffiRustCallStatus.ByValue.<init>(o.zxk):void type: CONSTRUCTOR) : (r4v0 uniffi.UniffiRustCallStatus$ByValue))
 A[MD:(o.zxk, double, uniffi.UniffiRustCallStatus$ByValue):void (m)] (LINE:682) call: uniffi.UniffiForeignFutureResultF64.<init>(o.zxk, double, uniffi.UniffiRustCallStatus$ByValue):void type: THIS */
    public /* synthetic */ UniffiForeignFutureResultF64(InterfaceC60174zxk interfaceC60174zxk, double d, UniffiRustCallStatus.ByValue byValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC60174zxk, (i & 2) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i & 4) != 0 ? new UniffiRustCallStatus.ByValue(interfaceC60174zxk) : byValue);
    }

    public UniffiForeignFutureResultF64(@NotNull InterfaceC60174zxk interfaceC60174zxk, double d, @NotNull UniffiRustCallStatus.ByValue byValue) {
        Intrinsics.checkNotNullParameter(interfaceC60174zxk, "");
        Intrinsics.checkNotNullParameter(byValue, "");
        this.returnValue = d;
        this.callStatus = byValue;
    }

    public static final class UniffiByValue extends UniffiForeignFutureResultF64 implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (r1v0 o.zxk)
  (wrap:double:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:double:0x0004: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r2v0 double))
  (wrap:uniffi.UniffiRustCallStatus$ByValue:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:uniffi.UniffiRustCallStatus$ByValue:0x000c: CONSTRUCTOR (r1v0 o.zxk) A[MD:(o.zxk):void (m), WRAPPED] (LINE:692) call: uniffi.UniffiRustCallStatus.ByValue.<init>(o.zxk):void type: CONSTRUCTOR) : (r4v0 uniffi.UniffiRustCallStatus$ByValue))
 A[MD:(o.zxk, double, uniffi.UniffiRustCallStatus$ByValue):void (m)] (LINE:689) call: uniffi.UniffiForeignFutureResultF64.UniffiByValue.<init>(o.zxk, double, uniffi.UniffiRustCallStatus$ByValue):void type: THIS */
        public /* synthetic */ UniffiByValue(InterfaceC60174zxk interfaceC60174zxk, double d, UniffiRustCallStatus.ByValue byValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC60174zxk, (i & 2) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i & 4) != 0 ? new UniffiRustCallStatus.ByValue(interfaceC60174zxk) : byValue);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(@NotNull InterfaceC60174zxk interfaceC60174zxk, double d, @NotNull UniffiRustCallStatus.ByValue byValue) {
            super(interfaceC60174zxk, d, byValue);
            Intrinsics.checkNotNullParameter(interfaceC60174zxk, "");
            Intrinsics.checkNotNullParameter(byValue, "");
        }
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiForeignFutureResultF64 uniffiForeignFutureResultF64) {
        Intrinsics.checkNotNullParameter(uniffiForeignFutureResultF64, "");
        this.returnValue = uniffiForeignFutureResultF64.returnValue;
        this.callStatus = uniffiForeignFutureResultF64.callStatus;
    }
}
