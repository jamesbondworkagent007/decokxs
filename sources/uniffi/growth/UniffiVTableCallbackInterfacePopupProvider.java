package uniffi.growth;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "popupId", "shouldShow", "showPopup"})
public class UniffiVTableCallbackInterfacePopupProvider extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfacePopupProviderMethod0 popupId;
    public UniffiCallbackInterfacePopupProviderMethod1 shouldShow;
    public UniffiCallbackInterfacePopupProviderMethod2 showPopup;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfacePopupProvider() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.growth.UniffiCallbackInterfacePopupProviderMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfacePopupProviderMethod0) : (r7v0 uniffi.growth.UniffiCallbackInterfacePopupProviderMethod0))
  (wrap:uniffi.growth.UniffiCallbackInterfacePopupProviderMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfacePopupProviderMethod1) : (r8v0 uniffi.growth.UniffiCallbackInterfacePopupProviderMethod1))
  (wrap:uniffi.growth.UniffiCallbackInterfacePopupProviderMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfacePopupProviderMethod2) : (r9v0 uniffi.growth.UniffiCallbackInterfacePopupProviderMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfacePopupProviderMethod0, uniffi.growth.UniffiCallbackInterfacePopupProviderMethod1, uniffi.growth.UniffiCallbackInterfacePopupProviderMethod2):void (m)] (LINE:173) call: uniffi.growth.UniffiVTableCallbackInterfacePopupProvider.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfacePopupProviderMethod0, uniffi.growth.UniffiCallbackInterfacePopupProviderMethod1, uniffi.growth.UniffiCallbackInterfacePopupProviderMethod2):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfacePopupProvider(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePopupProviderMethod0 uniffiCallbackInterfacePopupProviderMethod0, UniffiCallbackInterfacePopupProviderMethod1 uniffiCallbackInterfacePopupProviderMethod1, UniffiCallbackInterfacePopupProviderMethod2 uniffiCallbackInterfacePopupProviderMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePopupProviderMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfacePopupProviderMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfacePopupProviderMethod2);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfacePopupProvider implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.growth.UniffiCallbackInterfacePopupProviderMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfacePopupProviderMethod0) : (r7v0 uniffi.growth.UniffiCallbackInterfacePopupProviderMethod0))
  (wrap:uniffi.growth.UniffiCallbackInterfacePopupProviderMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfacePopupProviderMethod1) : (r8v0 uniffi.growth.UniffiCallbackInterfacePopupProviderMethod1))
  (wrap:uniffi.growth.UniffiCallbackInterfacePopupProviderMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfacePopupProviderMethod2) : (r9v0 uniffi.growth.UniffiCallbackInterfacePopupProviderMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfacePopupProviderMethod0, uniffi.growth.UniffiCallbackInterfacePopupProviderMethod1, uniffi.growth.UniffiCallbackInterfacePopupProviderMethod2):void (m)] (LINE:180) call: uniffi.growth.UniffiVTableCallbackInterfacePopupProvider.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfacePopupProviderMethod0, uniffi.growth.UniffiCallbackInterfacePopupProviderMethod1, uniffi.growth.UniffiCallbackInterfacePopupProviderMethod2):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePopupProviderMethod0 uniffiCallbackInterfacePopupProviderMethod0, UniffiCallbackInterfacePopupProviderMethod1 uniffiCallbackInterfacePopupProviderMethod1, UniffiCallbackInterfacePopupProviderMethod2 uniffiCallbackInterfacePopupProviderMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePopupProviderMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfacePopupProviderMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfacePopupProviderMethod2);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePopupProviderMethod0 uniffiCallbackInterfacePopupProviderMethod0, UniffiCallbackInterfacePopupProviderMethod1 uniffiCallbackInterfacePopupProviderMethod1, UniffiCallbackInterfacePopupProviderMethod2 uniffiCallbackInterfacePopupProviderMethod2) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfacePopupProviderMethod0, uniffiCallbackInterfacePopupProviderMethod1, uniffiCallbackInterfacePopupProviderMethod2);
        }
    }

    public UniffiVTableCallbackInterfacePopupProvider(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePopupProviderMethod0 uniffiCallbackInterfacePopupProviderMethod0, UniffiCallbackInterfacePopupProviderMethod1 uniffiCallbackInterfacePopupProviderMethod1, UniffiCallbackInterfacePopupProviderMethod2 uniffiCallbackInterfacePopupProviderMethod2) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.popupId = uniffiCallbackInterfacePopupProviderMethod0;
        this.shouldShow = uniffiCallbackInterfacePopupProviderMethod1;
        this.showPopup = uniffiCallbackInterfacePopupProviderMethod2;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfacePopupProvider uniffiVTableCallbackInterfacePopupProvider) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfacePopupProvider, "");
        this.uniffiFree = uniffiVTableCallbackInterfacePopupProvider.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfacePopupProvider.uniffiClone;
        this.popupId = uniffiVTableCallbackInterfacePopupProvider.popupId;
        this.shouldShow = uniffiVTableCallbackInterfacePopupProvider.shouldShow;
        this.showPopup = uniffiVTableCallbackInterfacePopupProvider.showPopup;
    }
}
