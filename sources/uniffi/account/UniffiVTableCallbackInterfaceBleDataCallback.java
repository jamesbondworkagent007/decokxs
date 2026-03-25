package uniffi.account;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onDataReceived", "onConfirmationReceived"})
public class UniffiVTableCallbackInterfaceBleDataCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceBleDataCallbackMethod1 onConfirmationReceived;
    public UniffiCallbackInterfaceBleDataCallbackMethod0 onDataReceived;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceBleDataCallback() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod0))
  (wrap:uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod1) : (r5v0 uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod0, uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod1):void (m)] (LINE:551) call: uniffi.account.UniffiVTableCallbackInterfaceBleDataCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod0, uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceBleDataCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBleDataCallbackMethod0 uniffiCallbackInterfaceBleDataCallbackMethod0, UniffiCallbackInterfaceBleDataCallbackMethod1 uniffiCallbackInterfaceBleDataCallbackMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBleDataCallbackMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceBleDataCallbackMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceBleDataCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod0))
  (wrap:uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod1) : (r5v0 uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod0, uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod1):void (m)] (LINE:557) call: uniffi.account.UniffiVTableCallbackInterfaceBleDataCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod0, uniffi.account.UniffiCallbackInterfaceBleDataCallbackMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBleDataCallbackMethod0 uniffiCallbackInterfaceBleDataCallbackMethod0, UniffiCallbackInterfaceBleDataCallbackMethod1 uniffiCallbackInterfaceBleDataCallbackMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBleDataCallbackMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceBleDataCallbackMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBleDataCallbackMethod0 uniffiCallbackInterfaceBleDataCallbackMethod0, UniffiCallbackInterfaceBleDataCallbackMethod1 uniffiCallbackInterfaceBleDataCallbackMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceBleDataCallbackMethod0, uniffiCallbackInterfaceBleDataCallbackMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceBleDataCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBleDataCallbackMethod0 uniffiCallbackInterfaceBleDataCallbackMethod0, UniffiCallbackInterfaceBleDataCallbackMethod1 uniffiCallbackInterfaceBleDataCallbackMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onDataReceived = uniffiCallbackInterfaceBleDataCallbackMethod0;
        this.onConfirmationReceived = uniffiCallbackInterfaceBleDataCallbackMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceBleDataCallback uniffiVTableCallbackInterfaceBleDataCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceBleDataCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceBleDataCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceBleDataCallback.uniffiClone;
        this.onDataReceived = uniffiVTableCallbackInterfaceBleDataCallback.onDataReceived;
        this.onConfirmationReceived = uniffiVTableCallbackInterfaceBleDataCallback.onConfirmationReceived;
    }
}
