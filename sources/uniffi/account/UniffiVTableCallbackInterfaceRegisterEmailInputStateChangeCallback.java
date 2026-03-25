package uniffi.account;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onChanged"})
public class UniffiVTableCallbackInterfaceRegisterEmailInputStateChangeCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0 onChanged;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceRegisterEmailInputStateChangeCallback() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0):void (m)] (LINE:2035) call: uniffi.account.UniffiVTableCallbackInterfaceRegisterEmailInputStateChangeCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceRegisterEmailInputStateChangeCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0 uniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceRegisterEmailInputStateChangeCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0):void (m)] (LINE:2040) call: uniffi.account.UniffiVTableCallbackInterfaceRegisterEmailInputStateChangeCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0 uniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0 uniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceRegisterEmailInputStateChangeCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0 uniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onChanged = uniffiCallbackInterfaceRegisterEmailInputStateChangeCallbackMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceRegisterEmailInputStateChangeCallback uniffiVTableCallbackInterfaceRegisterEmailInputStateChangeCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceRegisterEmailInputStateChangeCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceRegisterEmailInputStateChangeCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceRegisterEmailInputStateChangeCallback.uniffiClone;
        this.onChanged = uniffiVTableCallbackInterfaceRegisterEmailInputStateChangeCallback.onChanged;
    }
}
