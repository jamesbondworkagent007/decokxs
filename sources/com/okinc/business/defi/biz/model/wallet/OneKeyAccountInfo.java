package com.okinc.business.defi.biz.model.wallet;

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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class OneKeyAccountInfo {
    private static final KSerializer<Object>[] $childSerializers;
    private final int addressIndex;
    private final List<OneKeyAddress> btcAddresses;
    private final List<OneKeyAddress> evmAddresses;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.model.wallet.OneKeyAccountInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneKeyAccountInfo copy$default(OneKeyAccountInfo oneKeyAccountInfo, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = oneKeyAccountInfo.addressIndex;
        }
        if ((i2 & 2) != 0) {
            list = oneKeyAccountInfo.btcAddresses;
        }
        if ((i2 & 4) != 0) {
            list2 = oneKeyAccountInfo.evmAddresses;
        }
        return oneKeyAccountInfo.copy(i, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<OneKeyAddress> component2() {
        return this.btcAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<OneKeyAddress> component3() {
        return this.evmAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OneKeyAccountInfo copy(int i, @NotNull List<OneKeyAddress> list, @NotNull List<OneKeyAddress> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new OneKeyAccountInfo(i, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OneKeyAccountInfo)) {
            return false;
        }
        OneKeyAccountInfo oneKeyAccountInfo = (OneKeyAccountInfo) obj;
        return this.addressIndex == oneKeyAccountInfo.addressIndex && Intrinsics.EZpvd(this.btcAddresses, oneKeyAccountInfo.btcAddresses) && Intrinsics.EZpvd(this.evmAddresses, oneKeyAccountInfo.evmAddresses);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressIndex() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<OneKeyAddress> getBtcAddresses() {
        return this.btcAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<OneKeyAddress> getEvmAddresses() {
        return this.evmAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.addressIndex) * 31) + this.btcAddresses.hashCode()) * 31) + this.evmAddresses.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OneKeyAccountInfo(addressIndex=" + this.addressIndex + ", btcAddresses=" + this.btcAddresses + ", evmAddresses=" + this.evmAddresses + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.model.wallet.OneKeyAccountInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OneKeyAccountInfo> serializer() {
            return OneKeyAccountInfo$$serializer.INSTANCE;
        }
    }

    static {
        OneKeyAddress$$serializer oneKeyAddress$$serializer = OneKeyAddress$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(oneKeyAddress$$serializer), new ArrayListSerializer(oneKeyAddress$$serializer)};
    }

    public /* synthetic */ OneKeyAccountInfo(int i, int i2, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, OneKeyAccountInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.addressIndex = i2;
        this.btcAddresses = list;
        this.evmAddresses = list2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(OneKeyAccountInfo oneKeyAccountInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, oneKeyAccountInfo.addressIndex);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], oneKeyAccountInfo.btcAddresses);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], oneKeyAccountInfo.evmAddresses);
    }

    public OneKeyAccountInfo(int i, @NotNull List<OneKeyAddress> list, @NotNull List<OneKeyAddress> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.addressIndex = i;
        this.btcAddresses = list;
        this.evmAddresses = list2;
    }
}
