package com.okinc.business.web3pay.lib.features.onchaintransaction.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class PayToAddressBalanceResp {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<Pay2AddressTokenDetail> chainBalanceList;
    private final List<Pay2AddressTokenDetail> convertibleBalanceList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.lib.features.onchaintransaction.model.PayToAddressBalanceResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PayToAddressBalanceResp copy$default(PayToAddressBalanceResp payToAddressBalanceResp, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = payToAddressBalanceResp.chainBalanceList;
        }
        if ((i & 2) != 0) {
            list2 = payToAddressBalanceResp.convertibleBalanceList;
        }
        return payToAddressBalanceResp.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Pay2AddressTokenDetail> component1() {
        return this.chainBalanceList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Pay2AddressTokenDetail> component2() {
        return this.convertibleBalanceList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PayToAddressBalanceResp copy(@NotNull List<Pay2AddressTokenDetail> list, @NotNull List<Pay2AddressTokenDetail> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new PayToAddressBalanceResp(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayToAddressBalanceResp)) {
            return false;
        }
        PayToAddressBalanceResp payToAddressBalanceResp = (PayToAddressBalanceResp) obj;
        return Intrinsics.EZpvd(this.chainBalanceList, payToAddressBalanceResp.chainBalanceList) && Intrinsics.EZpvd(this.convertibleBalanceList, payToAddressBalanceResp.convertibleBalanceList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Pay2AddressTokenDetail> getChainBalanceList() {
        return this.chainBalanceList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Pay2AddressTokenDetail> getConvertibleBalanceList() {
        return this.convertibleBalanceList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.chainBalanceList.hashCode() * 31) + this.convertibleBalanceList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PayToAddressBalanceResp(chainBalanceList=" + this.chainBalanceList + ", convertibleBalanceList=" + this.convertibleBalanceList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.onchaintransaction.model.PayToAddressBalanceResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PayToAddressBalanceResp> serializer() {
            return PayToAddressBalanceResp$$serializer.INSTANCE;
        }
    }

    static {
        Pay2AddressTokenDetail$$serializer pay2AddressTokenDetail$$serializer = Pay2AddressTokenDetail$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(pay2AddressTokenDetail$$serializer), new ArrayListSerializer(pay2AddressTokenDetail$$serializer)};
    }

    public /* synthetic */ PayToAddressBalanceResp(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PayToAddressBalanceResp$$serializer.INSTANCE.getDescriptor());
        }
        this.chainBalanceList = list;
        this.convertibleBalanceList = list2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(PayToAddressBalanceResp payToAddressBalanceResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], payToAddressBalanceResp.chainBalanceList);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], payToAddressBalanceResp.convertibleBalanceList);
    }

    public PayToAddressBalanceResp(@NotNull List<Pay2AddressTokenDetail> list, @NotNull List<Pay2AddressTokenDetail> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.chainBalanceList = list;
        this.convertibleBalanceList = list2;
    }
}
