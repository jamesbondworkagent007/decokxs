package com.okinc.okpaymentapi.data.remote.model.experience;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class SupportCurrencies {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<Fiat> depositSupportCurrencies;
    private final List<Fiat> withdrawSupportCurrencies;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportCurrencies() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okpaymentapi.data.remote.model.experience.SupportCurrencies */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportCurrencies copy$default(SupportCurrencies supportCurrencies, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = supportCurrencies.depositSupportCurrencies;
        }
        if ((i & 2) != 0) {
            list2 = supportCurrencies.withdrawSupportCurrencies;
        }
        return supportCurrencies.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Fiat> component1() {
        return this.depositSupportCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Fiat> component2() {
        return this.withdrawSupportCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportCurrencies copy(@NotNull List<Fiat> list, @NotNull List<Fiat> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new SupportCurrencies(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportCurrencies)) {
            return false;
        }
        SupportCurrencies supportCurrencies = (SupportCurrencies) obj;
        return Intrinsics.EZpvd(this.depositSupportCurrencies, supportCurrencies.depositSupportCurrencies) && Intrinsics.EZpvd(this.withdrawSupportCurrencies, supportCurrencies.withdrawSupportCurrencies);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Fiat> getDepositSupportCurrencies() {
        return this.depositSupportCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Fiat> getWithdrawSupportCurrencies() {
        return this.withdrawSupportCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.depositSupportCurrencies.hashCode() * 31) + this.withdrawSupportCurrencies.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportCurrencies(depositSupportCurrencies=" + this.depositSupportCurrencies + ", withdrawSupportCurrencies=" + this.withdrawSupportCurrencies + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.SupportCurrencies.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SupportCurrencies> serializer() {
            return SupportCurrencies$$serializer.INSTANCE;
        }
    }

    static {
        Fiat$$serializer fiat$$serializer = Fiat$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(fiat$$serializer), new ArrayListSerializer(fiat$$serializer)};
    }

    public /* synthetic */ SupportCurrencies(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.depositSupportCurrencies = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.withdrawSupportCurrencies = yDY.AhwBna();
        } else {
            this.withdrawSupportCurrencies = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(SupportCurrencies supportCurrencies, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(supportCurrencies.depositSupportCurrencies, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], supportCurrencies.depositSupportCurrencies);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(supportCurrencies.withdrawSupportCurrencies, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], supportCurrencies.withdrawSupportCurrencies);
    }

    public SupportCurrencies(@NotNull List<Fiat> list, @NotNull List<Fiat> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.depositSupportCurrencies = list;
        this.withdrawSupportCurrencies = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:31)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:32)) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.okinc.okpaymentapi.data.remote.model.experience.Fiat>, java.util.List<com.okinc.okpaymentapi.data.remote.model.experience.Fiat>):void (m)] (LINE:30) call: com.okinc.okpaymentapi.data.remote.model.experience.SupportCurrencies.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ SupportCurrencies(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2);
    }
}
