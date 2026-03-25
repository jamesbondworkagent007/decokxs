package uniffi.account;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onSuccess", "onFailure"})
public class UniffiVTableCallbackInterfaceOkxPasskeySyncCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1 onFailure;
    public UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0 onSuccess;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceOkxPasskeySyncCallback() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1) : (r5v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0, uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1):void (m)] (LINE:1622) call: uniffi.account.UniffiVTableCallbackInterfaceOkxPasskeySyncCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0, uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceOkxPasskeySyncCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0 uniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0, UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1 uniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceOkxPasskeySyncCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1) : (r5v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0, uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1):void (m)] (LINE:1628) call: uniffi.account.UniffiVTableCallbackInterfaceOkxPasskeySyncCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0, uniffi.account.UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0 uniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0, UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1 uniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0 uniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0, UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1 uniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0, uniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceOkxPasskeySyncCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0 uniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0, UniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1 uniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onSuccess = uniffiCallbackInterfaceOkxPasskeySyncCallbackMethod0;
        this.onFailure = uniffiCallbackInterfaceOkxPasskeySyncCallbackMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceOkxPasskeySyncCallback uniffiVTableCallbackInterfaceOkxPasskeySyncCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceOkxPasskeySyncCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceOkxPasskeySyncCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceOkxPasskeySyncCallback.uniffiClone;
        this.onSuccess = uniffiVTableCallbackInterfaceOkxPasskeySyncCallback.onSuccess;
        this.onFailure = uniffiVTableCallbackInterfaceOkxPasskeySyncCallback.onFailure;
    }
}
