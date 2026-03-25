package com.okinc.business.market.features.meme.aped_together.domain.model;

import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.CompactTagData$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class ApedTogetherData {
    private final String holdAmountPercentage;
    private final String holdVolume;
    private final String holderWalletAddress;
    private final List<CompactTagData> newTagList;
    private final String tagType;
    private final String totalProfit;
    private final String totalProfitPercentage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.market.features.meme.aped_together.domain.model.ApedTogetherData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApedTogetherData copy$default(ApedTogetherData apedTogetherData, String str, String str2, String str3, String str4, String str5, List list, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apedTogetherData.holderWalletAddress;
        }
        if ((i & 2) != 0) {
            str2 = apedTogetherData.holdVolume;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = apedTogetherData.holdAmountPercentage;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = apedTogetherData.totalProfit;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = apedTogetherData.totalProfitPercentage;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            list = apedTogetherData.newTagList;
        }
        List list2 = list;
        if ((i & 64) != 0) {
            str6 = apedTogetherData.tagType;
        }
        return apedTogetherData.copy(str, str7, str8, str9, str10, list2, str6);
    }

    @SerialName("holdAmountPercentage")
    public static /* synthetic */ void getHoldAmountPercentage$annotations() {
    }

    @SerialName("holdVolume")
    public static /* synthetic */ void getHoldVolume$annotations() {
    }

    @SerialName("holderWalletAddress")
    public static /* synthetic */ void getHolderWalletAddress$annotations() {
    }

    @SerialName("t")
    public static /* synthetic */ void getNewTagList$annotations() {
    }

    @SerialName("tagType")
    public static /* synthetic */ void getTagType$annotations() {
    }

    @SerialName("totalProfit")
    public static /* synthetic */ void getTotalProfit$annotations() {
    }

    @SerialName("totalProfitPercentage")
    public static /* synthetic */ void getTotalProfitPercentage$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.holderWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.holdVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.holdAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.totalProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> component6() {
        return this.newTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tagType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApedTogetherData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<CompactTagData> list, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new ApedTogetherData(str, str2, str3, str4, str5, list, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApedTogetherData)) {
            return false;
        }
        ApedTogetherData apedTogetherData = (ApedTogetherData) obj;
        return Intrinsics.EZpvd((Object) this.holderWalletAddress, (Object) apedTogetherData.holderWalletAddress) && Intrinsics.EZpvd((Object) this.holdVolume, (Object) apedTogetherData.holdVolume) && Intrinsics.EZpvd((Object) this.holdAmountPercentage, (Object) apedTogetherData.holdAmountPercentage) && Intrinsics.EZpvd((Object) this.totalProfit, (Object) apedTogetherData.totalProfit) && Intrinsics.EZpvd((Object) this.totalProfitPercentage, (Object) apedTogetherData.totalProfitPercentage) && Intrinsics.EZpvd(this.newTagList, apedTogetherData.newTagList) && Intrinsics.EZpvd((Object) this.tagType, (Object) apedTogetherData.tagType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldAmountPercentage() {
        return this.holdAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldVolume() {
        return this.holdVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHolderWalletAddress() {
        return this.holderWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> getNewTagList() {
        return this.newTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTagType() {
        return this.tagType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalProfit() {
        return this.totalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalProfitPercentage() {
        return this.totalProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.holderWalletAddress.hashCode() * 31) + this.holdVolume.hashCode()) * 31) + this.holdAmountPercentage.hashCode()) * 31) + this.totalProfit.hashCode()) * 31) + this.totalProfitPercentage.hashCode()) * 31) + this.newTagList.hashCode()) * 31) + this.tagType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ApedTogetherData(holderWalletAddress=" + this.holderWalletAddress + ", holdVolume=" + this.holdVolume + ", holdAmountPercentage=" + this.holdAmountPercentage + ", totalProfit=" + this.totalProfit + ", totalProfitPercentage=" + this.totalProfitPercentage + ", newTagList=" + this.newTagList + ", tagType=" + this.tagType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.aped_together.domain.model.ApedTogetherData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ApedTogetherData> serializer() {
            return ApedTogetherData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ApedTogetherData(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (95 != (i & 95)) {
            PluginExceptionsKt.throwMissingFieldException(i, 95, ApedTogetherData$$serializer.INSTANCE.getDescriptor());
        }
        this.holderWalletAddress = str;
        this.holdVolume = str2;
        this.holdAmountPercentage = str3;
        this.totalProfit = str4;
        this.totalProfitPercentage = str5;
        if ((i & 32) == 0) {
            this.newTagList = yDY.AhwBna();
        } else {
            this.newTagList = list;
        }
        this.tagType = str6;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ApedTogetherData apedTogetherData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, apedTogetherData.holderWalletAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, apedTogetherData.holdVolume);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, apedTogetherData.holdAmountPercentage);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, apedTogetherData.totalProfit);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, apedTogetherData.totalProfitPercentage);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(apedTogetherData.newTagList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], apedTogetherData.newTagList);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, apedTogetherData.tagType);
    }

    public ApedTogetherData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<CompactTagData> list, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.holderWalletAddress = str;
        this.holdVolume = str2;
        this.holdAmountPercentage = str3;
        this.totalProfit = str4;
        this.totalProfitPercentage = str5;
        this.newTagList = list;
        this.tagType = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:22)) : (r15v0 java.util.List))
  (r16v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>, java.lang.String):void (m)] (LINE:10) call: com.okinc.business.market.features.meme.aped_together.domain.model.ApedTogetherData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ ApedTogetherData(String str, String str2, String str3, String str4, String str5, List list, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? yDY.AhwBna() : list, str6);
    }
}
