package uniffi.retail_trading;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "getUpDownTimeZone"})
public class UniffiVTableCallbackInterfaceRetailTradingNativeApi extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceRetailTradingNativeApiMethod0 getUpDownTimeZone;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceRetailTradingNativeApi() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.retail_trading.UniffiCallbackInterfaceRetailTradingNativeApiMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.retail_trading.UniffiCallbackInterfaceRetailTradingNativeApiMethod0) : (r4v0 uniffi.retail_trading.UniffiCallbackInterfaceRetailTradingNativeApiMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.retail_trading.UniffiCallbackInterfaceRetailTradingNativeApiMethod0):void (m)] (LINE:107) call: uniffi.retail_trading.UniffiVTableCallbackInterfaceRetailTradingNativeApi.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.retail_trading.UniffiCallbackInterfaceRetailTradingNativeApiMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceRetailTradingNativeApi(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRetailTradingNativeApiMethod0 uniffiCallbackInterfaceRetailTradingNativeApiMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceRetailTradingNativeApiMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceRetailTradingNativeApi implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.retail_trading.UniffiCallbackInterfaceRetailTradingNativeApiMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.retail_trading.UniffiCallbackInterfaceRetailTradingNativeApiMethod0) : (r4v0 uniffi.retail_trading.UniffiCallbackInterfaceRetailTradingNativeApiMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.retail_trading.UniffiCallbackInterfaceRetailTradingNativeApiMethod0):void (m)] (LINE:112) call: uniffi.retail_trading.UniffiVTableCallbackInterfaceRetailTradingNativeApi.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.retail_trading.UniffiCallbackInterfaceRetailTradingNativeApiMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRetailTradingNativeApiMethod0 uniffiCallbackInterfaceRetailTradingNativeApiMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceRetailTradingNativeApiMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRetailTradingNativeApiMethod0 uniffiCallbackInterfaceRetailTradingNativeApiMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceRetailTradingNativeApiMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceRetailTradingNativeApi(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRetailTradingNativeApiMethod0 uniffiCallbackInterfaceRetailTradingNativeApiMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.getUpDownTimeZone = uniffiCallbackInterfaceRetailTradingNativeApiMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceRetailTradingNativeApi uniffiVTableCallbackInterfaceRetailTradingNativeApi) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceRetailTradingNativeApi, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceRetailTradingNativeApi.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceRetailTradingNativeApi.uniffiClone;
        this.getUpDownTimeZone = uniffiVTableCallbackInterfaceRetailTradingNativeApi.getUpDownTimeZone;
    }
}
