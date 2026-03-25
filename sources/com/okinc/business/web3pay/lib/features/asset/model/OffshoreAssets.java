package com.okinc.business.web3pay.lib.features.asset.model;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OffshoreAssets {
    private final List<ConvertUnsupportedTokenData> notSupportConvert;
    private final List<AssetTokenData> supportConvert;
    private final String usdAmount;
    private final List<String> valuationList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(AssetTokenData$$serializer.INSTANCE), new ArrayListSerializer(ConvertUnsupportedTokenData$$serializer.INSTANCE), new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.lib.features.asset.model.OffshoreAssets */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OffshoreAssets copy$default(OffshoreAssets offshoreAssets, String str, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offshoreAssets.usdAmount;
        }
        if ((i & 2) != 0) {
            list = offshoreAssets.supportConvert;
        }
        if ((i & 4) != 0) {
            list2 = offshoreAssets.notSupportConvert;
        }
        if ((i & 8) != 0) {
            list3 = offshoreAssets.valuationList;
        }
        return offshoreAssets.copy(str, list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AssetTokenData> component2() {
        return this.supportConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConvertUnsupportedTokenData> component3() {
        return this.notSupportConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.valuationList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OffshoreAssets copy(@NotNull String str, @NotNull List<AssetTokenData> list, @NotNull List<ConvertUnsupportedTokenData> list2, @NotNull List<String> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new OffshoreAssets(str, list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffshoreAssets)) {
            return false;
        }
        OffshoreAssets offshoreAssets = (OffshoreAssets) obj;
        return Intrinsics.EZpvd((Object) this.usdAmount, (Object) offshoreAssets.usdAmount) && Intrinsics.EZpvd(this.supportConvert, offshoreAssets.supportConvert) && Intrinsics.EZpvd(this.notSupportConvert, offshoreAssets.notSupportConvert) && Intrinsics.EZpvd(this.valuationList, offshoreAssets.valuationList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConvertUnsupportedTokenData> getNotSupportConvert() {
        return this.notSupportConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AssetTokenData> getSupportConvert() {
        return this.supportConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getValuationList() {
        return this.valuationList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.usdAmount.hashCode() * 31) + this.supportConvert.hashCode()) * 31) + this.notSupportConvert.hashCode()) * 31) + this.valuationList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OffshoreAssets(usdAmount=" + this.usdAmount + ", supportConvert=" + this.supportConvert + ", notSupportConvert=" + this.notSupportConvert + ", valuationList=" + this.valuationList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.asset.model.OffshoreAssets.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OffshoreAssets> serializer() {
            return OffshoreAssets$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OffshoreAssets(int i, String str, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, OffshoreAssets$$serializer.INSTANCE.getDescriptor());
        }
        this.usdAmount = str;
        this.supportConvert = list;
        this.notSupportConvert = list2;
        this.valuationList = list3;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(OffshoreAssets offshoreAssets, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, offshoreAssets.usdAmount);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], offshoreAssets.supportConvert);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], offshoreAssets.notSupportConvert);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], offshoreAssets.valuationList);
    }

    public OffshoreAssets(@NotNull String str, @NotNull List<AssetTokenData> list, @NotNull List<ConvertUnsupportedTokenData> list2, @NotNull List<String> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.usdAmount = str;
        this.supportConvert = list;
        this.notSupportConvert = list2;
        this.valuationList = list3;
    }
}
