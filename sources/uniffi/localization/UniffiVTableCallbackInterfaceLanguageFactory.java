package uniffi.localization;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "getAppLanguage", "getSystemLanguageIfNecessaryForFallback", "createLanguageListFromLocalTask", "createLanguageListFromRemoteTask"})
public class UniffiVTableCallbackInterfaceLanguageFactory extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceLanguageFactoryMethod2 createLanguageListFromLocalTask;
    public UniffiCallbackInterfaceLanguageFactoryMethod3 createLanguageListFromRemoteTask;
    public UniffiCallbackInterfaceLanguageFactoryMethod0 getAppLanguage;
    public UniffiCallbackInterfaceLanguageFactoryMethod1 getSystemLanguageIfNecessaryForFallback;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceLanguageFactory() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r6v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r7v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod0) : (r8v0 uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod0))
  (wrap:uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod1) : (r9v0 uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod1))
  (wrap:uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod2) : (r10v0 uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod2))
  (wrap:uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod3) : (r11v0 uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod3))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod0, uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod1, uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod2, uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod3):void (m)] (LINE:86) call: uniffi.localization.UniffiVTableCallbackInterfaceLanguageFactory.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod0, uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod1, uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod2, uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod3):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceLanguageFactory(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLanguageFactoryMethod0 uniffiCallbackInterfaceLanguageFactoryMethod0, UniffiCallbackInterfaceLanguageFactoryMethod1 uniffiCallbackInterfaceLanguageFactoryMethod1, UniffiCallbackInterfaceLanguageFactoryMethod2 uniffiCallbackInterfaceLanguageFactoryMethod2, UniffiCallbackInterfaceLanguageFactoryMethod3 uniffiCallbackInterfaceLanguageFactoryMethod3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceLanguageFactoryMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceLanguageFactoryMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceLanguageFactoryMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceLanguageFactoryMethod3);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceLanguageFactory implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r6v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r7v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod0) : (r8v0 uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod0))
  (wrap:uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod1) : (r9v0 uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod1))
  (wrap:uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod2) : (r10v0 uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod2))
  (wrap:uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod3) : (r11v0 uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod3))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod0, uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod1, uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod2, uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod3):void (m)] (LINE:94) call: uniffi.localization.UniffiVTableCallbackInterfaceLanguageFactory.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod0, uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod1, uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod2, uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod3):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLanguageFactoryMethod0 uniffiCallbackInterfaceLanguageFactoryMethod0, UniffiCallbackInterfaceLanguageFactoryMethod1 uniffiCallbackInterfaceLanguageFactoryMethod1, UniffiCallbackInterfaceLanguageFactoryMethod2 uniffiCallbackInterfaceLanguageFactoryMethod2, UniffiCallbackInterfaceLanguageFactoryMethod3 uniffiCallbackInterfaceLanguageFactoryMethod3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceLanguageFactoryMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceLanguageFactoryMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceLanguageFactoryMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceLanguageFactoryMethod3);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLanguageFactoryMethod0 uniffiCallbackInterfaceLanguageFactoryMethod0, UniffiCallbackInterfaceLanguageFactoryMethod1 uniffiCallbackInterfaceLanguageFactoryMethod1, UniffiCallbackInterfaceLanguageFactoryMethod2 uniffiCallbackInterfaceLanguageFactoryMethod2, UniffiCallbackInterfaceLanguageFactoryMethod3 uniffiCallbackInterfaceLanguageFactoryMethod3) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceLanguageFactoryMethod0, uniffiCallbackInterfaceLanguageFactoryMethod1, uniffiCallbackInterfaceLanguageFactoryMethod2, uniffiCallbackInterfaceLanguageFactoryMethod3);
        }
    }

    public UniffiVTableCallbackInterfaceLanguageFactory(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLanguageFactoryMethod0 uniffiCallbackInterfaceLanguageFactoryMethod0, UniffiCallbackInterfaceLanguageFactoryMethod1 uniffiCallbackInterfaceLanguageFactoryMethod1, UniffiCallbackInterfaceLanguageFactoryMethod2 uniffiCallbackInterfaceLanguageFactoryMethod2, UniffiCallbackInterfaceLanguageFactoryMethod3 uniffiCallbackInterfaceLanguageFactoryMethod3) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.getAppLanguage = uniffiCallbackInterfaceLanguageFactoryMethod0;
        this.getSystemLanguageIfNecessaryForFallback = uniffiCallbackInterfaceLanguageFactoryMethod1;
        this.createLanguageListFromLocalTask = uniffiCallbackInterfaceLanguageFactoryMethod2;
        this.createLanguageListFromRemoteTask = uniffiCallbackInterfaceLanguageFactoryMethod3;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceLanguageFactory uniffiVTableCallbackInterfaceLanguageFactory) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceLanguageFactory, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceLanguageFactory.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceLanguageFactory.uniffiClone;
        this.getAppLanguage = uniffiVTableCallbackInterfaceLanguageFactory.getAppLanguage;
        this.getSystemLanguageIfNecessaryForFallback = uniffiVTableCallbackInterfaceLanguageFactory.getSystemLanguageIfNecessaryForFallback;
        this.createLanguageListFromLocalTask = uniffiVTableCallbackInterfaceLanguageFactory.createLanguageListFromLocalTask;
        this.createLanguageListFromRemoteTask = uniffiVTableCallbackInterfaceLanguageFactory.createLanguageListFromRemoteTask;
    }
}
