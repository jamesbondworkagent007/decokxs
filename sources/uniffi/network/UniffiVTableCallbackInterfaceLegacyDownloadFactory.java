package uniffi.network;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "create"})
public class UniffiVTableCallbackInterfaceLegacyDownloadFactory extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceLegacyDownloadFactoryMethod0 create;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceLegacyDownloadFactory() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceLegacyDownloadFactoryMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceLegacyDownloadFactoryMethod0) : (r4v0 uniffi.network.UniffiCallbackInterfaceLegacyDownloadFactoryMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceLegacyDownloadFactoryMethod0):void (m)] (LINE:183) call: uniffi.network.UniffiVTableCallbackInterfaceLegacyDownloadFactory.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceLegacyDownloadFactoryMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceLegacyDownloadFactory(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLegacyDownloadFactoryMethod0 uniffiCallbackInterfaceLegacyDownloadFactoryMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceLegacyDownloadFactoryMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceLegacyDownloadFactory implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceLegacyDownloadFactoryMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceLegacyDownloadFactoryMethod0) : (r4v0 uniffi.network.UniffiCallbackInterfaceLegacyDownloadFactoryMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceLegacyDownloadFactoryMethod0):void (m)] (LINE:188) call: uniffi.network.UniffiVTableCallbackInterfaceLegacyDownloadFactory.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceLegacyDownloadFactoryMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLegacyDownloadFactoryMethod0 uniffiCallbackInterfaceLegacyDownloadFactoryMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceLegacyDownloadFactoryMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLegacyDownloadFactoryMethod0 uniffiCallbackInterfaceLegacyDownloadFactoryMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceLegacyDownloadFactoryMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceLegacyDownloadFactory(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLegacyDownloadFactoryMethod0 uniffiCallbackInterfaceLegacyDownloadFactoryMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.create = uniffiCallbackInterfaceLegacyDownloadFactoryMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceLegacyDownloadFactory uniffiVTableCallbackInterfaceLegacyDownloadFactory) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceLegacyDownloadFactory, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceLegacyDownloadFactory.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceLegacyDownloadFactory.uniffiClone;
        this.create = uniffiVTableCallbackInterfaceLegacyDownloadFactory.create;
    }
}
