package uniffi;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60174zxk;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"code", "error_buf"})
public class UniffiRustCallStatus extends Structure {
    public byte code;
    public RustBuffer.ByValue error_buf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isError() {
        return this.code == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPanic() {
        return this.code == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSuccess() {
        return this.code == 0;
    }

    public UniffiRustCallStatus(InterfaceC60174zxk interfaceC60174zxk) {
        this.error_buf = new RustBuffer.ByValue(interfaceC60174zxk);
    }

    public UniffiRustCallStatus() {
        this(null);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class ByValue extends UniffiRustCallStatus implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ByValue() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public ByValue(InterfaceC60174zxk interfaceC60174zxk) {
            super(interfaceC60174zxk);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.zxk:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.zxk) : (r1v0 o.zxk))
 A[MD:(o.zxk):void (m)] (LINE:226) call: uniffi.UniffiRustCallStatus.ByValue.<init>(o.zxk):void type: THIS */
        public /* synthetic */ ByValue(InterfaceC60174zxk interfaceC60174zxk, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : interfaceC60174zxk);
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.UniffiRustCallStatus.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ByValue EZpvd(InterfaceC60174zxk interfaceC60174zxk, byte b, @NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            ByValue byValue2 = new ByValue(interfaceC60174zxk);
            byValue2.code = b;
            byValue2.error_buf = byValue;
            return byValue2;
        }
    }
}
