package uniffi.lifecycle;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "getMetadata", "getParams", "canHandle"})
public class UniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2 canHandle;
    public UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0 getMetadata;
    public UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1 getParams;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0) : (r7v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1) : (r8v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2) : (r9v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2):void (m)] (LINE:338) call: uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0 uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0, UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1 uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1, UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2 uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0) : (r7v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1) : (r8v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2) : (r9v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2):void (m)] (LINE:345) call: uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0 uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0, UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1 uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1, UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2 uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0 uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0, UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1 uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1, UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2 uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0, uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1, uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2);
        }
    }

    public UniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0 uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0, UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1 uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1, UniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2 uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.getMetadata = uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod0;
        this.getParams = uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod1;
        this.canHandle = uniffiCallbackInterfaceCoreDeeplinkParsedInfoMethod2;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo uniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo.uniffiClone;
        this.getMetadata = uniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo.getMetadata;
        this.getParams = uniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo.getParams;
        this.canHandle = uniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo.canHandle;
    }
}
