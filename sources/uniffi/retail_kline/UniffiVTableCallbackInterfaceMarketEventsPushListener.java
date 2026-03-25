package uniffi.retail_kline;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onEventPush"})
public class UniffiVTableCallbackInterfaceMarketEventsPushListener extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceMarketEventsPushListenerMethod0 onEventPush;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceMarketEventsPushListener() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.retail_kline.UniffiCallbackInterfaceMarketEventsPushListenerMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.retail_kline.UniffiCallbackInterfaceMarketEventsPushListenerMethod0) : (r4v0 uniffi.retail_kline.UniffiCallbackInterfaceMarketEventsPushListenerMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.retail_kline.UniffiCallbackInterfaceMarketEventsPushListenerMethod0):void (m)] (LINE:70) call: uniffi.retail_kline.UniffiVTableCallbackInterfaceMarketEventsPushListener.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.retail_kline.UniffiCallbackInterfaceMarketEventsPushListenerMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceMarketEventsPushListener(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceMarketEventsPushListenerMethod0 uniffiCallbackInterfaceMarketEventsPushListenerMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceMarketEventsPushListenerMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceMarketEventsPushListener implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.retail_kline.UniffiCallbackInterfaceMarketEventsPushListenerMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.retail_kline.UniffiCallbackInterfaceMarketEventsPushListenerMethod0) : (r4v0 uniffi.retail_kline.UniffiCallbackInterfaceMarketEventsPushListenerMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.retail_kline.UniffiCallbackInterfaceMarketEventsPushListenerMethod0):void (m)] (LINE:75) call: uniffi.retail_kline.UniffiVTableCallbackInterfaceMarketEventsPushListener.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.retail_kline.UniffiCallbackInterfaceMarketEventsPushListenerMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceMarketEventsPushListenerMethod0 uniffiCallbackInterfaceMarketEventsPushListenerMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceMarketEventsPushListenerMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceMarketEventsPushListenerMethod0 uniffiCallbackInterfaceMarketEventsPushListenerMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceMarketEventsPushListenerMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceMarketEventsPushListener(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceMarketEventsPushListenerMethod0 uniffiCallbackInterfaceMarketEventsPushListenerMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onEventPush = uniffiCallbackInterfaceMarketEventsPushListenerMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceMarketEventsPushListener uniffiVTableCallbackInterfaceMarketEventsPushListener) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceMarketEventsPushListener, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceMarketEventsPushListener.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceMarketEventsPushListener.uniffiClone;
        this.onEventPush = uniffiVTableCallbackInterfaceMarketEventsPushListener.onEventPush;
    }
}
