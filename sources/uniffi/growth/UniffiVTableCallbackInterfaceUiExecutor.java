package uniffi.growth;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "runOnUi"})
public class UniffiVTableCallbackInterfaceUiExecutor extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceUiExecutorMethod0 runOnUi;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceUiExecutor() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.growth.UniffiCallbackInterfaceUiExecutorMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfaceUiExecutorMethod0) : (r4v0 uniffi.growth.UniffiCallbackInterfaceUiExecutorMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfaceUiExecutorMethod0):void (m)] (LINE:226) call: uniffi.growth.UniffiVTableCallbackInterfaceUiExecutor.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfaceUiExecutorMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceUiExecutor(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceUiExecutorMethod0 uniffiCallbackInterfaceUiExecutorMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceUiExecutorMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceUiExecutor implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.growth.UniffiCallbackInterfaceUiExecutorMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfaceUiExecutorMethod0) : (r4v0 uniffi.growth.UniffiCallbackInterfaceUiExecutorMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfaceUiExecutorMethod0):void (m)] (LINE:231) call: uniffi.growth.UniffiVTableCallbackInterfaceUiExecutor.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfaceUiExecutorMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceUiExecutorMethod0 uniffiCallbackInterfaceUiExecutorMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceUiExecutorMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceUiExecutorMethod0 uniffiCallbackInterfaceUiExecutorMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceUiExecutorMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceUiExecutor(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceUiExecutorMethod0 uniffiCallbackInterfaceUiExecutorMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.runOnUi = uniffiCallbackInterfaceUiExecutorMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceUiExecutor uniffiVTableCallbackInterfaceUiExecutor) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceUiExecutor, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceUiExecutor.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceUiExecutor.uniffiClone;
        this.runOnUi = uniffiVTableCallbackInterfaceUiExecutor.runOnUi;
    }
}
