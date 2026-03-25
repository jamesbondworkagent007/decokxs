package uniffi.settings;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "setThemeMode", "setColorTheme", "getThemeMode", "getColorTheme", "emitThemeChange"})
public class UniffiVTableCallbackInterfaceColorCoreBinding extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceColorCoreBindingMethod4 emitThemeChange;
    public UniffiCallbackInterfaceColorCoreBindingMethod3 getColorTheme;
    public UniffiCallbackInterfaceColorCoreBindingMethod2 getThemeMode;
    public UniffiCallbackInterfaceColorCoreBindingMethod1 setColorTheme;
    public UniffiCallbackInterfaceColorCoreBindingMethod0 setThemeMode;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceColorCoreBinding() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r7v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r8v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod0) : (r9v0 uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod0))
  (wrap:uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod1) : (r10v0 uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod1))
  (wrap:uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod2) : (r11v0 uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod2))
  (wrap:uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod3) : (r12v0 uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod3))
  (wrap:uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod4:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod4) : (r13v0 uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod4))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod0, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod1, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod2, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod3, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod4):void (m)] (LINE:161) call: uniffi.settings.UniffiVTableCallbackInterfaceColorCoreBinding.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod0, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod1, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod2, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod3, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod4):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceColorCoreBinding(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceColorCoreBindingMethod0 uniffiCallbackInterfaceColorCoreBindingMethod0, UniffiCallbackInterfaceColorCoreBindingMethod1 uniffiCallbackInterfaceColorCoreBindingMethod1, UniffiCallbackInterfaceColorCoreBindingMethod2 uniffiCallbackInterfaceColorCoreBindingMethod2, UniffiCallbackInterfaceColorCoreBindingMethod3 uniffiCallbackInterfaceColorCoreBindingMethod3, UniffiCallbackInterfaceColorCoreBindingMethod4 uniffiCallbackInterfaceColorCoreBindingMethod4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceColorCoreBindingMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceColorCoreBindingMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceColorCoreBindingMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceColorCoreBindingMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfaceColorCoreBindingMethod4);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceColorCoreBinding implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r7v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r8v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod0) : (r9v0 uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod0))
  (wrap:uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod1) : (r10v0 uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod1))
  (wrap:uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod2) : (r11v0 uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod2))
  (wrap:uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod3) : (r12v0 uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod3))
  (wrap:uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod4:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod4) : (r13v0 uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod4))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod0, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod1, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod2, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod3, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod4):void (m)] (LINE:170) call: uniffi.settings.UniffiVTableCallbackInterfaceColorCoreBinding.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod0, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod1, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod2, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod3, uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod4):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceColorCoreBindingMethod0 uniffiCallbackInterfaceColorCoreBindingMethod0, UniffiCallbackInterfaceColorCoreBindingMethod1 uniffiCallbackInterfaceColorCoreBindingMethod1, UniffiCallbackInterfaceColorCoreBindingMethod2 uniffiCallbackInterfaceColorCoreBindingMethod2, UniffiCallbackInterfaceColorCoreBindingMethod3 uniffiCallbackInterfaceColorCoreBindingMethod3, UniffiCallbackInterfaceColorCoreBindingMethod4 uniffiCallbackInterfaceColorCoreBindingMethod4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceColorCoreBindingMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceColorCoreBindingMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceColorCoreBindingMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceColorCoreBindingMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfaceColorCoreBindingMethod4);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceColorCoreBindingMethod0 uniffiCallbackInterfaceColorCoreBindingMethod0, UniffiCallbackInterfaceColorCoreBindingMethod1 uniffiCallbackInterfaceColorCoreBindingMethod1, UniffiCallbackInterfaceColorCoreBindingMethod2 uniffiCallbackInterfaceColorCoreBindingMethod2, UniffiCallbackInterfaceColorCoreBindingMethod3 uniffiCallbackInterfaceColorCoreBindingMethod3, UniffiCallbackInterfaceColorCoreBindingMethod4 uniffiCallbackInterfaceColorCoreBindingMethod4) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceColorCoreBindingMethod0, uniffiCallbackInterfaceColorCoreBindingMethod1, uniffiCallbackInterfaceColorCoreBindingMethod2, uniffiCallbackInterfaceColorCoreBindingMethod3, uniffiCallbackInterfaceColorCoreBindingMethod4);
        }
    }

    public UniffiVTableCallbackInterfaceColorCoreBinding(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceColorCoreBindingMethod0 uniffiCallbackInterfaceColorCoreBindingMethod0, UniffiCallbackInterfaceColorCoreBindingMethod1 uniffiCallbackInterfaceColorCoreBindingMethod1, UniffiCallbackInterfaceColorCoreBindingMethod2 uniffiCallbackInterfaceColorCoreBindingMethod2, UniffiCallbackInterfaceColorCoreBindingMethod3 uniffiCallbackInterfaceColorCoreBindingMethod3, UniffiCallbackInterfaceColorCoreBindingMethod4 uniffiCallbackInterfaceColorCoreBindingMethod4) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.setThemeMode = uniffiCallbackInterfaceColorCoreBindingMethod0;
        this.setColorTheme = uniffiCallbackInterfaceColorCoreBindingMethod1;
        this.getThemeMode = uniffiCallbackInterfaceColorCoreBindingMethod2;
        this.getColorTheme = uniffiCallbackInterfaceColorCoreBindingMethod3;
        this.emitThemeChange = uniffiCallbackInterfaceColorCoreBindingMethod4;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceColorCoreBinding uniffiVTableCallbackInterfaceColorCoreBinding) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceColorCoreBinding, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceColorCoreBinding.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceColorCoreBinding.uniffiClone;
        this.setThemeMode = uniffiVTableCallbackInterfaceColorCoreBinding.setThemeMode;
        this.setColorTheme = uniffiVTableCallbackInterfaceColorCoreBinding.setColorTheme;
        this.getThemeMode = uniffiVTableCallbackInterfaceColorCoreBinding.getThemeMode;
        this.getColorTheme = uniffiVTableCallbackInterfaceColorCoreBinding.getColorTheme;
        this.emitThemeChange = uniffiVTableCallbackInterfaceColorCoreBinding.emitThemeChange;
    }
}
