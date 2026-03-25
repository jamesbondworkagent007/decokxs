package uniffi.buy_sell;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "formatFiatWithSymbolMax", "formatFiatWithSymbolMinmax", "formatFiatWithCodeMax", "formatFiatWithCodeMinmax", "formatCrypto", "formatExchangeRate", "toPlainString", "formatPlainString"})
public class UniffiVTableCallbackInterfaceBuySellFormatter extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceBuySellFormatterMethod4 formatCrypto;
    public UniffiCallbackInterfaceBuySellFormatterMethod5 formatExchangeRate;
    public UniffiCallbackInterfaceBuySellFormatterMethod2 formatFiatWithCodeMax;
    public UniffiCallbackInterfaceBuySellFormatterMethod3 formatFiatWithCodeMinmax;
    public UniffiCallbackInterfaceBuySellFormatterMethod0 formatFiatWithSymbolMax;
    public UniffiCallbackInterfaceBuySellFormatterMethod1 formatFiatWithSymbolMinmax;
    public UniffiCallbackInterfaceBuySellFormatterMethod7 formatPlainString;
    public UniffiCallbackInterfaceBuySellFormatterMethod6 toPlainString;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceBuySellFormatter() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r12v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r13v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod0:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod0) : (r14v0 uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod0))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod1:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod1) : (r15v0 uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod1))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod2:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod2) : (r16v0 uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod2))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod3:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod3) : (r17v0 uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod3))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod4:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod4) : (r18v0 uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod4))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod5:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod5) : (r19v0 uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod5))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod6:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod6) : (r20v0 uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod6))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod7:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod7) : (null uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod7))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod0, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod1, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod2, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod3, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod4, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod5, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod6, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod7):void (m)] (LINE:161) call: uniffi.buy_sell.UniffiVTableCallbackInterfaceBuySellFormatter.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod0, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod1, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod2, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod3, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod4, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod5, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod6, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod7):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceBuySellFormatter(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBuySellFormatterMethod0 uniffiCallbackInterfaceBuySellFormatterMethod0, UniffiCallbackInterfaceBuySellFormatterMethod1 uniffiCallbackInterfaceBuySellFormatterMethod1, UniffiCallbackInterfaceBuySellFormatterMethod2 uniffiCallbackInterfaceBuySellFormatterMethod2, UniffiCallbackInterfaceBuySellFormatterMethod3 uniffiCallbackInterfaceBuySellFormatterMethod3, UniffiCallbackInterfaceBuySellFormatterMethod4 uniffiCallbackInterfaceBuySellFormatterMethod4, UniffiCallbackInterfaceBuySellFormatterMethod5 uniffiCallbackInterfaceBuySellFormatterMethod5, UniffiCallbackInterfaceBuySellFormatterMethod6 uniffiCallbackInterfaceBuySellFormatterMethod6, UniffiCallbackInterfaceBuySellFormatterMethod7 uniffiCallbackInterfaceBuySellFormatterMethod7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBuySellFormatterMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceBuySellFormatterMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceBuySellFormatterMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceBuySellFormatterMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfaceBuySellFormatterMethod4, (i & 128) != 0 ? null : uniffiCallbackInterfaceBuySellFormatterMethod5, (i & 256) != 0 ? null : uniffiCallbackInterfaceBuySellFormatterMethod6, (i & 512) == 0 ? uniffiCallbackInterfaceBuySellFormatterMethod7 : null);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceBuySellFormatter implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r12v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r13v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod0:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod0) : (r14v0 uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod0))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod1:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod1) : (r15v0 uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod1))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod2:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod2) : (r16v0 uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod2))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod3:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod3) : (r17v0 uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod3))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod4:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod4) : (r18v0 uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod4))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod5:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod5) : (r19v0 uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod5))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod6:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod6) : (r20v0 uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod6))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod7:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod7) : (null uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod7))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod0, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod1, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod2, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod3, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod4, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod5, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod6, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod7):void (m)] (LINE:173) call: uniffi.buy_sell.UniffiVTableCallbackInterfaceBuySellFormatter.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod0, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod1, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod2, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod3, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod4, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod5, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod6, uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod7):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBuySellFormatterMethod0 uniffiCallbackInterfaceBuySellFormatterMethod0, UniffiCallbackInterfaceBuySellFormatterMethod1 uniffiCallbackInterfaceBuySellFormatterMethod1, UniffiCallbackInterfaceBuySellFormatterMethod2 uniffiCallbackInterfaceBuySellFormatterMethod2, UniffiCallbackInterfaceBuySellFormatterMethod3 uniffiCallbackInterfaceBuySellFormatterMethod3, UniffiCallbackInterfaceBuySellFormatterMethod4 uniffiCallbackInterfaceBuySellFormatterMethod4, UniffiCallbackInterfaceBuySellFormatterMethod5 uniffiCallbackInterfaceBuySellFormatterMethod5, UniffiCallbackInterfaceBuySellFormatterMethod6 uniffiCallbackInterfaceBuySellFormatterMethod6, UniffiCallbackInterfaceBuySellFormatterMethod7 uniffiCallbackInterfaceBuySellFormatterMethod7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBuySellFormatterMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceBuySellFormatterMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceBuySellFormatterMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceBuySellFormatterMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfaceBuySellFormatterMethod4, (i & 128) != 0 ? null : uniffiCallbackInterfaceBuySellFormatterMethod5, (i & 256) != 0 ? null : uniffiCallbackInterfaceBuySellFormatterMethod6, (i & 512) == 0 ? uniffiCallbackInterfaceBuySellFormatterMethod7 : null);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBuySellFormatterMethod0 uniffiCallbackInterfaceBuySellFormatterMethod0, UniffiCallbackInterfaceBuySellFormatterMethod1 uniffiCallbackInterfaceBuySellFormatterMethod1, UniffiCallbackInterfaceBuySellFormatterMethod2 uniffiCallbackInterfaceBuySellFormatterMethod2, UniffiCallbackInterfaceBuySellFormatterMethod3 uniffiCallbackInterfaceBuySellFormatterMethod3, UniffiCallbackInterfaceBuySellFormatterMethod4 uniffiCallbackInterfaceBuySellFormatterMethod4, UniffiCallbackInterfaceBuySellFormatterMethod5 uniffiCallbackInterfaceBuySellFormatterMethod5, UniffiCallbackInterfaceBuySellFormatterMethod6 uniffiCallbackInterfaceBuySellFormatterMethod6, UniffiCallbackInterfaceBuySellFormatterMethod7 uniffiCallbackInterfaceBuySellFormatterMethod7) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceBuySellFormatterMethod0, uniffiCallbackInterfaceBuySellFormatterMethod1, uniffiCallbackInterfaceBuySellFormatterMethod2, uniffiCallbackInterfaceBuySellFormatterMethod3, uniffiCallbackInterfaceBuySellFormatterMethod4, uniffiCallbackInterfaceBuySellFormatterMethod5, uniffiCallbackInterfaceBuySellFormatterMethod6, uniffiCallbackInterfaceBuySellFormatterMethod7);
        }
    }

    public UniffiVTableCallbackInterfaceBuySellFormatter(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBuySellFormatterMethod0 uniffiCallbackInterfaceBuySellFormatterMethod0, UniffiCallbackInterfaceBuySellFormatterMethod1 uniffiCallbackInterfaceBuySellFormatterMethod1, UniffiCallbackInterfaceBuySellFormatterMethod2 uniffiCallbackInterfaceBuySellFormatterMethod2, UniffiCallbackInterfaceBuySellFormatterMethod3 uniffiCallbackInterfaceBuySellFormatterMethod3, UniffiCallbackInterfaceBuySellFormatterMethod4 uniffiCallbackInterfaceBuySellFormatterMethod4, UniffiCallbackInterfaceBuySellFormatterMethod5 uniffiCallbackInterfaceBuySellFormatterMethod5, UniffiCallbackInterfaceBuySellFormatterMethod6 uniffiCallbackInterfaceBuySellFormatterMethod6, UniffiCallbackInterfaceBuySellFormatterMethod7 uniffiCallbackInterfaceBuySellFormatterMethod7) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.formatFiatWithSymbolMax = uniffiCallbackInterfaceBuySellFormatterMethod0;
        this.formatFiatWithSymbolMinmax = uniffiCallbackInterfaceBuySellFormatterMethod1;
        this.formatFiatWithCodeMax = uniffiCallbackInterfaceBuySellFormatterMethod2;
        this.formatFiatWithCodeMinmax = uniffiCallbackInterfaceBuySellFormatterMethod3;
        this.formatCrypto = uniffiCallbackInterfaceBuySellFormatterMethod4;
        this.formatExchangeRate = uniffiCallbackInterfaceBuySellFormatterMethod5;
        this.toPlainString = uniffiCallbackInterfaceBuySellFormatterMethod6;
        this.formatPlainString = uniffiCallbackInterfaceBuySellFormatterMethod7;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceBuySellFormatter uniffiVTableCallbackInterfaceBuySellFormatter) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceBuySellFormatter, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceBuySellFormatter.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceBuySellFormatter.uniffiClone;
        this.formatFiatWithSymbolMax = uniffiVTableCallbackInterfaceBuySellFormatter.formatFiatWithSymbolMax;
        this.formatFiatWithSymbolMinmax = uniffiVTableCallbackInterfaceBuySellFormatter.formatFiatWithSymbolMinmax;
        this.formatFiatWithCodeMax = uniffiVTableCallbackInterfaceBuySellFormatter.formatFiatWithCodeMax;
        this.formatFiatWithCodeMinmax = uniffiVTableCallbackInterfaceBuySellFormatter.formatFiatWithCodeMinmax;
        this.formatCrypto = uniffiVTableCallbackInterfaceBuySellFormatter.formatCrypto;
        this.formatExchangeRate = uniffiVTableCallbackInterfaceBuySellFormatter.formatExchangeRate;
        this.toPlainString = uniffiVTableCallbackInterfaceBuySellFormatter.toPlainString;
        this.formatPlainString = uniffiVTableCallbackInterfaceBuySellFormatter.formatPlainString;
    }
}
