package uniffi.settings;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "setAppLanguage"})
public class UniffiVTableCallbackInterfaceLanguageCoreBinding extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceLanguageCoreBindingMethod0 setAppLanguage;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceLanguageCoreBinding() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.settings.UniffiCallbackInterfaceLanguageCoreBindingMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.settings.UniffiCallbackInterfaceLanguageCoreBindingMethod0) : (r4v0 uniffi.settings.UniffiCallbackInterfaceLanguageCoreBindingMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.settings.UniffiCallbackInterfaceLanguageCoreBindingMethod0):void (m)] (LINE:268) call: uniffi.settings.UniffiVTableCallbackInterfaceLanguageCoreBinding.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.settings.UniffiCallbackInterfaceLanguageCoreBindingMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceLanguageCoreBinding(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLanguageCoreBindingMethod0 uniffiCallbackInterfaceLanguageCoreBindingMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceLanguageCoreBindingMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceLanguageCoreBinding implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.settings.UniffiCallbackInterfaceLanguageCoreBindingMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.settings.UniffiCallbackInterfaceLanguageCoreBindingMethod0) : (r4v0 uniffi.settings.UniffiCallbackInterfaceLanguageCoreBindingMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.settings.UniffiCallbackInterfaceLanguageCoreBindingMethod0):void (m)] (LINE:273) call: uniffi.settings.UniffiVTableCallbackInterfaceLanguageCoreBinding.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.settings.UniffiCallbackInterfaceLanguageCoreBindingMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLanguageCoreBindingMethod0 uniffiCallbackInterfaceLanguageCoreBindingMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceLanguageCoreBindingMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLanguageCoreBindingMethod0 uniffiCallbackInterfaceLanguageCoreBindingMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceLanguageCoreBindingMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceLanguageCoreBinding(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLanguageCoreBindingMethod0 uniffiCallbackInterfaceLanguageCoreBindingMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.setAppLanguage = uniffiCallbackInterfaceLanguageCoreBindingMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceLanguageCoreBinding uniffiVTableCallbackInterfaceLanguageCoreBinding) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceLanguageCoreBinding, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceLanguageCoreBinding.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceLanguageCoreBinding.uniffiClone;
        this.setAppLanguage = uniffiVTableCallbackInterfaceLanguageCoreBinding.setAppLanguage;
    }
}
