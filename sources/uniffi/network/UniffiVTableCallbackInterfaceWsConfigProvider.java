package uniffi.network;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes25.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "getUrl", "getLoginState", "getLoginString"})
public class UniffiVTableCallbackInterfaceWsConfigProvider extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceWsConfigProviderMethod1 getLoginState;
    public UniffiCallbackInterfaceWsConfigProviderMethod2 getLoginString;
    public UniffiCallbackInterfaceWsConfigProviderMethod0 getUrl;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceWsConfigProvider() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod0) : (r7v0 uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod1) : (r8v0 uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod1))
  (wrap:uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod2) : (r9v0 uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod0, uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod1, uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod2):void (m)] (LINE:466) call: uniffi.network.UniffiVTableCallbackInterfaceWsConfigProvider.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod0, uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod1, uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod2):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceWsConfigProvider(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceWsConfigProviderMethod0 uniffiCallbackInterfaceWsConfigProviderMethod0, UniffiCallbackInterfaceWsConfigProviderMethod1 uniffiCallbackInterfaceWsConfigProviderMethod1, UniffiCallbackInterfaceWsConfigProviderMethod2 uniffiCallbackInterfaceWsConfigProviderMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceWsConfigProviderMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceWsConfigProviderMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceWsConfigProviderMethod2);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceWsConfigProvider implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod0) : (r7v0 uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod1) : (r8v0 uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod1))
  (wrap:uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod2) : (r9v0 uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod0, uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod1, uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod2):void (m)] (LINE:473) call: uniffi.network.UniffiVTableCallbackInterfaceWsConfigProvider.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod0, uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod1, uniffi.network.UniffiCallbackInterfaceWsConfigProviderMethod2):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceWsConfigProviderMethod0 uniffiCallbackInterfaceWsConfigProviderMethod0, UniffiCallbackInterfaceWsConfigProviderMethod1 uniffiCallbackInterfaceWsConfigProviderMethod1, UniffiCallbackInterfaceWsConfigProviderMethod2 uniffiCallbackInterfaceWsConfigProviderMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceWsConfigProviderMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceWsConfigProviderMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceWsConfigProviderMethod2);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceWsConfigProviderMethod0 uniffiCallbackInterfaceWsConfigProviderMethod0, UniffiCallbackInterfaceWsConfigProviderMethod1 uniffiCallbackInterfaceWsConfigProviderMethod1, UniffiCallbackInterfaceWsConfigProviderMethod2 uniffiCallbackInterfaceWsConfigProviderMethod2) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceWsConfigProviderMethod0, uniffiCallbackInterfaceWsConfigProviderMethod1, uniffiCallbackInterfaceWsConfigProviderMethod2);
        }
    }

    public UniffiVTableCallbackInterfaceWsConfigProvider(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceWsConfigProviderMethod0 uniffiCallbackInterfaceWsConfigProviderMethod0, UniffiCallbackInterfaceWsConfigProviderMethod1 uniffiCallbackInterfaceWsConfigProviderMethod1, UniffiCallbackInterfaceWsConfigProviderMethod2 uniffiCallbackInterfaceWsConfigProviderMethod2) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.getUrl = uniffiCallbackInterfaceWsConfigProviderMethod0;
        this.getLoginState = uniffiCallbackInterfaceWsConfigProviderMethod1;
        this.getLoginString = uniffiCallbackInterfaceWsConfigProviderMethod2;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceWsConfigProvider uniffiVTableCallbackInterfaceWsConfigProvider) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceWsConfigProvider, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceWsConfigProvider.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceWsConfigProvider.uniffiClone;
        this.getUrl = uniffiVTableCallbackInterfaceWsConfigProvider.getUrl;
        this.getLoginState = uniffiVTableCallbackInterfaceWsConfigProvider.getLoginState;
        this.getLoginString = uniffiVTableCallbackInterfaceWsConfigProvider.getLoginString;
    }
}
