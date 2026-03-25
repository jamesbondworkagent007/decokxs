package uniffi.experiment;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "getPayload", "getPayloadWithEnterpriseOverride"})
public class UniffiVTableCallbackInterfaceAbTestFactory extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceAbTestFactoryMethod0 getPayload;
    public UniffiCallbackInterfaceAbTestFactoryMethod1 getPayloadWithEnterpriseOverride;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceAbTestFactory() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod0) : (r4v0 uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod0))
  (wrap:uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod1) : (r5v0 uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod0, uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod1):void (m)] (LINE:79) call: uniffi.experiment.UniffiVTableCallbackInterfaceAbTestFactory.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod0, uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceAbTestFactory(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceAbTestFactoryMethod0 uniffiCallbackInterfaceAbTestFactoryMethod0, UniffiCallbackInterfaceAbTestFactoryMethod1 uniffiCallbackInterfaceAbTestFactoryMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceAbTestFactoryMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceAbTestFactoryMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceAbTestFactory implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod0) : (r4v0 uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod0))
  (wrap:uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod1) : (r5v0 uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod0, uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod1):void (m)] (LINE:85) call: uniffi.experiment.UniffiVTableCallbackInterfaceAbTestFactory.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod0, uniffi.experiment.UniffiCallbackInterfaceAbTestFactoryMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceAbTestFactoryMethod0 uniffiCallbackInterfaceAbTestFactoryMethod0, UniffiCallbackInterfaceAbTestFactoryMethod1 uniffiCallbackInterfaceAbTestFactoryMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceAbTestFactoryMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceAbTestFactoryMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceAbTestFactoryMethod0 uniffiCallbackInterfaceAbTestFactoryMethod0, UniffiCallbackInterfaceAbTestFactoryMethod1 uniffiCallbackInterfaceAbTestFactoryMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceAbTestFactoryMethod0, uniffiCallbackInterfaceAbTestFactoryMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceAbTestFactory(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceAbTestFactoryMethod0 uniffiCallbackInterfaceAbTestFactoryMethod0, UniffiCallbackInterfaceAbTestFactoryMethod1 uniffiCallbackInterfaceAbTestFactoryMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.getPayload = uniffiCallbackInterfaceAbTestFactoryMethod0;
        this.getPayloadWithEnterpriseOverride = uniffiCallbackInterfaceAbTestFactoryMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceAbTestFactory uniffiVTableCallbackInterfaceAbTestFactory) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceAbTestFactory, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceAbTestFactory.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceAbTestFactory.uniffiClone;
        this.getPayload = uniffiVTableCallbackInterfaceAbTestFactory.getPayload;
        this.getPayloadWithEnterpriseOverride = uniffiVTableCallbackInterfaceAbTestFactory.getPayloadWithEnterpriseOverride;
    }
}
