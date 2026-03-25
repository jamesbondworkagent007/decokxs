package uniffi.lifecycle;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "execute"})
public class UniffiVTableCallbackInterfaceCoreAppLinkHandler extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceCoreAppLinkHandlerMethod0 execute;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceCoreAppLinkHandler() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkHandlerMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkHandlerMethod0) : (r4v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkHandlerMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkHandlerMethod0):void (m)] (LINE:182) call: uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreAppLinkHandler.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkHandlerMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceCoreAppLinkHandler(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreAppLinkHandlerMethod0 uniffiCallbackInterfaceCoreAppLinkHandlerMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceCoreAppLinkHandlerMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceCoreAppLinkHandler implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkHandlerMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkHandlerMethod0) : (r4v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkHandlerMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkHandlerMethod0):void (m)] (LINE:187) call: uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreAppLinkHandler.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkHandlerMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreAppLinkHandlerMethod0 uniffiCallbackInterfaceCoreAppLinkHandlerMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceCoreAppLinkHandlerMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreAppLinkHandlerMethod0 uniffiCallbackInterfaceCoreAppLinkHandlerMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceCoreAppLinkHandlerMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceCoreAppLinkHandler(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreAppLinkHandlerMethod0 uniffiCallbackInterfaceCoreAppLinkHandlerMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.execute = uniffiCallbackInterfaceCoreAppLinkHandlerMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceCoreAppLinkHandler uniffiVTableCallbackInterfaceCoreAppLinkHandler) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceCoreAppLinkHandler, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceCoreAppLinkHandler.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceCoreAppLinkHandler.uniffiClone;
        this.execute = uniffiVTableCallbackInterfaceCoreAppLinkHandler.execute;
    }
}
