package uniffi.account;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onChanged"})
public class UniffiVTableCallbackInterfaceRegisterPhoneInputStateChangeCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0 onChanged;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceRegisterPhoneInputStateChangeCallback() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0):void (m)] (LINE:2149) call: uniffi.account.UniffiVTableCallbackInterfaceRegisterPhoneInputStateChangeCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceRegisterPhoneInputStateChangeCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0 uniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceRegisterPhoneInputStateChangeCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0):void (m)] (LINE:2154) call: uniffi.account.UniffiVTableCallbackInterfaceRegisterPhoneInputStateChangeCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0 uniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0 uniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceRegisterPhoneInputStateChangeCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0 uniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onChanged = uniffiCallbackInterfaceRegisterPhoneInputStateChangeCallbackMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceRegisterPhoneInputStateChangeCallback uniffiVTableCallbackInterfaceRegisterPhoneInputStateChangeCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceRegisterPhoneInputStateChangeCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceRegisterPhoneInputStateChangeCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceRegisterPhoneInputStateChangeCallback.uniffiClone;
        this.onChanged = uniffiVTableCallbackInterfaceRegisterPhoneInputStateChangeCallback.onChanged;
    }
}
