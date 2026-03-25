package uniffi.account;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onSuccess", "onFailure"})
public class UniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1 onFailure;
    public UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0 onSuccess;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1) : (r5v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0, uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1):void (m)] (LINE:1644) call: uniffi.account.UniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0, uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0 uniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0, UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1 uniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1) : (r5v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0, uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1):void (m)] (LINE:1650) call: uniffi.account.UniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0, uniffi.account.UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0 uniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0, UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1 uniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0 uniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0, UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1 uniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0, uniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0 uniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0, UniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1 uniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onSuccess = uniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod0;
        this.onFailure = uniffiCallbackInterfaceOkxPasskeyUpgradeCallbackMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback uniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback.uniffiClone;
        this.onSuccess = uniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback.onSuccess;
        this.onFailure = uniffiVTableCallbackInterfaceOkxPasskeyUpgradeCallback.onFailure;
    }
}
