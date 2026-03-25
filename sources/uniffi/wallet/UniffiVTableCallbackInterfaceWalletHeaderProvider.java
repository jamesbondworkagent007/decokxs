package uniffi.wallet;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes14.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "getSignedHeader", "getCommonHeader"})
public class UniffiVTableCallbackInterfaceWalletHeaderProvider extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceWalletHeaderProviderMethod1 getCommonHeader;
    public UniffiCallbackInterfaceWalletHeaderProviderMethod0 getSignedHeader;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceWalletHeaderProvider() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod0) : (r4v0 uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod0))
  (wrap:uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod1) : (r5v0 uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod0, uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod1):void (m)] (LINE:64) call: uniffi.wallet.UniffiVTableCallbackInterfaceWalletHeaderProvider.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod0, uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceWalletHeaderProvider(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceWalletHeaderProviderMethod0 uniffiCallbackInterfaceWalletHeaderProviderMethod0, UniffiCallbackInterfaceWalletHeaderProviderMethod1 uniffiCallbackInterfaceWalletHeaderProviderMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceWalletHeaderProviderMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceWalletHeaderProviderMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceWalletHeaderProvider implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod0) : (r4v0 uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod0))
  (wrap:uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod1) : (r5v0 uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod0, uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod1):void (m)] (LINE:70) call: uniffi.wallet.UniffiVTableCallbackInterfaceWalletHeaderProvider.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod0, uniffi.wallet.UniffiCallbackInterfaceWalletHeaderProviderMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceWalletHeaderProviderMethod0 uniffiCallbackInterfaceWalletHeaderProviderMethod0, UniffiCallbackInterfaceWalletHeaderProviderMethod1 uniffiCallbackInterfaceWalletHeaderProviderMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceWalletHeaderProviderMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceWalletHeaderProviderMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceWalletHeaderProviderMethod0 uniffiCallbackInterfaceWalletHeaderProviderMethod0, UniffiCallbackInterfaceWalletHeaderProviderMethod1 uniffiCallbackInterfaceWalletHeaderProviderMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceWalletHeaderProviderMethod0, uniffiCallbackInterfaceWalletHeaderProviderMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceWalletHeaderProvider(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceWalletHeaderProviderMethod0 uniffiCallbackInterfaceWalletHeaderProviderMethod0, UniffiCallbackInterfaceWalletHeaderProviderMethod1 uniffiCallbackInterfaceWalletHeaderProviderMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.getSignedHeader = uniffiCallbackInterfaceWalletHeaderProviderMethod0;
        this.getCommonHeader = uniffiCallbackInterfaceWalletHeaderProviderMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceWalletHeaderProvider uniffiVTableCallbackInterfaceWalletHeaderProvider) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceWalletHeaderProvider, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceWalletHeaderProvider.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceWalletHeaderProvider.uniffiClone;
        this.getSignedHeader = uniffiVTableCallbackInterfaceWalletHeaderProvider.getSignedHeader;
        this.getCommonHeader = uniffiVTableCallbackInterfaceWalletHeaderProvider.getCommonHeader;
    }
}
