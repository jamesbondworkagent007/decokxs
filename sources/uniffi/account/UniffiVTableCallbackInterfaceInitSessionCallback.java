package uniffi.account;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onSuccess", "onError"})
public class UniffiVTableCallbackInterfaceInitSessionCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceInitSessionCallbackMethod1 onError;
    public UniffiCallbackInterfaceInitSessionCallbackMethod0 onSuccess;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceInitSessionCallback() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod0))
  (wrap:uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod1) : (r5v0 uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod0, uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod1):void (m)] (LINE:630) call: uniffi.account.UniffiVTableCallbackInterfaceInitSessionCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod0, uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceInitSessionCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceInitSessionCallbackMethod0 uniffiCallbackInterfaceInitSessionCallbackMethod0, UniffiCallbackInterfaceInitSessionCallbackMethod1 uniffiCallbackInterfaceInitSessionCallbackMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceInitSessionCallbackMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceInitSessionCallbackMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceInitSessionCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod0))
  (wrap:uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod1) : (r5v0 uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod0, uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod1):void (m)] (LINE:636) call: uniffi.account.UniffiVTableCallbackInterfaceInitSessionCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod0, uniffi.account.UniffiCallbackInterfaceInitSessionCallbackMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceInitSessionCallbackMethod0 uniffiCallbackInterfaceInitSessionCallbackMethod0, UniffiCallbackInterfaceInitSessionCallbackMethod1 uniffiCallbackInterfaceInitSessionCallbackMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceInitSessionCallbackMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceInitSessionCallbackMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceInitSessionCallbackMethod0 uniffiCallbackInterfaceInitSessionCallbackMethod0, UniffiCallbackInterfaceInitSessionCallbackMethod1 uniffiCallbackInterfaceInitSessionCallbackMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceInitSessionCallbackMethod0, uniffiCallbackInterfaceInitSessionCallbackMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceInitSessionCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceInitSessionCallbackMethod0 uniffiCallbackInterfaceInitSessionCallbackMethod0, UniffiCallbackInterfaceInitSessionCallbackMethod1 uniffiCallbackInterfaceInitSessionCallbackMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onSuccess = uniffiCallbackInterfaceInitSessionCallbackMethod0;
        this.onError = uniffiCallbackInterfaceInitSessionCallbackMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceInitSessionCallback uniffiVTableCallbackInterfaceInitSessionCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceInitSessionCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceInitSessionCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceInitSessionCallback.uniffiClone;
        this.onSuccess = uniffiVTableCallbackInterfaceInitSessionCallback.onSuccess;
        this.onError = uniffiVTableCallbackInterfaceInitSessionCallback.onError;
    }
}
