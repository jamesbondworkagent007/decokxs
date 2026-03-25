package com.okinc.business.defi.wallet.mine.search.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class SearchRecommendTokenModel implements Parcelable {
    private final String chainIndex;
    private final String chainLogoUrl;
    private final String contractAddress;
    private final int recRank;
    private final String sameUserNumber;
    private final String strategyName;
    private final int strategyType;
    private final List<Integer> tags;
    private final String tokenCustomName;
    private final String tokenCustomSymbol;
    private final String tokenLogoUrl;
    private final String tokenMcp;
    private final String tokenName;
    private final String tokenPrice;
    private final String tokenPrice24hChange;
    private final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchRecommendTokenModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<SearchRecommendTokenModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchRecommendTokenModel createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            String string = parcel.readString();
            int i2 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
                str = string12;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                str = string12;
                int i4 = 0;
                while (i4 != i3) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                    i4++;
                    i3 = i3;
                }
                arrayList = arrayList2;
            }
            return new SearchRecommendTokenModel(i, string, i2, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, str, string13, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchRecommendTokenModel[] newArray(int i) {
            return new SearchRecommendTokenModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tokenPrice24hChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tokenMcp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.sameUserNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component16() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.strategyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.recRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenCustomSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenCustomName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchRecommendTokenModel copy(int i, @NotNull String str, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, String str11, @NotNull String str12, @NotNull String str13, List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        return new SearchRecommendTokenModel(i, str, i2, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchRecommendTokenModel)) {
            return false;
        }
        SearchRecommendTokenModel searchRecommendTokenModel = (SearchRecommendTokenModel) obj;
        return this.strategyType == searchRecommendTokenModel.strategyType && Intrinsics.EZpvd((Object) this.strategyName, (Object) searchRecommendTokenModel.strategyName) && this.recRank == searchRecommendTokenModel.recRank && Intrinsics.EZpvd((Object) this.chainIndex, (Object) searchRecommendTokenModel.chainIndex) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) searchRecommendTokenModel.contractAddress) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) searchRecommendTokenModel.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenName, (Object) searchRecommendTokenModel.tokenName) && Intrinsics.EZpvd((Object) this.tokenCustomSymbol, (Object) searchRecommendTokenModel.tokenCustomSymbol) && Intrinsics.EZpvd((Object) this.tokenCustomName, (Object) searchRecommendTokenModel.tokenCustomName) && Intrinsics.EZpvd((Object) this.tokenPrice, (Object) searchRecommendTokenModel.tokenPrice) && Intrinsics.EZpvd((Object) this.tokenPrice24hChange, (Object) searchRecommendTokenModel.tokenPrice24hChange) && Intrinsics.EZpvd((Object) this.tokenMcp, (Object) searchRecommendTokenModel.tokenMcp) && Intrinsics.EZpvd((Object) this.sameUserNumber, (Object) searchRecommendTokenModel.sameUserNumber) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) searchRecommendTokenModel.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) searchRecommendTokenModel.chainLogoUrl) && Intrinsics.EZpvd(this.tags, searchRecommendTokenModel.tags);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRecRank() {
        return this.recRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSameUserNumber() {
        return this.sameUserNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyName() {
        return this.strategyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCustomName() {
        return this.tokenCustomName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCustomSymbol() {
        return this.tokenCustomSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenMcp() {
        return this.tokenMcp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenPrice() {
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenPrice24hChange() {
        return this.tokenPrice24hChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.strategyType);
        int iHashCode2 = this.strategyName.hashCode();
        int iHashCode3 = Integer.hashCode(this.recRank);
        int iHashCode4 = this.chainIndex.hashCode();
        int iHashCode5 = this.contractAddress.hashCode();
        int iHashCode6 = this.tokenSymbol.hashCode();
        int iHashCode7 = this.tokenName.hashCode();
        int iHashCode8 = this.tokenCustomSymbol.hashCode();
        int iHashCode9 = this.tokenCustomName.hashCode();
        int iHashCode10 = this.tokenPrice.hashCode();
        int iHashCode11 = this.tokenPrice24hChange.hashCode();
        int iHashCode12 = this.tokenMcp.hashCode();
        String str = this.sameUserNumber;
        int iHashCode13 = str == null ? 0 : str.hashCode();
        int iHashCode14 = this.tokenLogoUrl.hashCode();
        int iHashCode15 = this.chainLogoUrl.hashCode();
        List<Integer> list = this.tags;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchRecommendTokenModel(strategyType=" + this.strategyType + ", strategyName=" + this.strategyName + ", recRank=" + this.recRank + ", chainIndex=" + this.chainIndex + ", contractAddress=" + this.contractAddress + ", tokenSymbol=" + this.tokenSymbol + ", tokenName=" + this.tokenName + ", tokenCustomSymbol=" + this.tokenCustomSymbol + ", tokenCustomName=" + this.tokenCustomName + ", tokenPrice=" + this.tokenPrice + ", tokenPrice24hChange=" + this.tokenPrice24hChange + ", tokenMcp=" + this.tokenMcp + ", sameUserNumber=" + this.sameUserNumber + ", tokenLogoUrl=" + this.tokenLogoUrl + ", chainLogoUrl=" + this.chainLogoUrl + ", tags=" + this.tags + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.strategyType);
        parcel.writeString(this.strategyName);
        parcel.writeInt(this.recRank);
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.contractAddress);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenCustomSymbol);
        parcel.writeString(this.tokenCustomName);
        parcel.writeString(this.tokenPrice);
        parcel.writeString(this.tokenPrice24hChange);
        parcel.writeString(this.tokenMcp);
        parcel.writeString(this.sameUserNumber);
        parcel.writeString(this.tokenLogoUrl);
        parcel.writeString(this.chainLogoUrl);
        List<Integer> list = this.tags;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendTokenModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchRecommendTokenModel> serializer() {
            return SearchRecommendTokenModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchRecommendTokenModel(int i, int i2, String str, int i3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i & 8)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8, SearchRecommendTokenModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.strategyType = 0;
        } else {
            this.strategyType = i2;
        }
        if ((i & 2) == 0) {
            this.strategyName = "";
        } else {
            this.strategyName = str;
        }
        if ((i & 4) == 0) {
            this.recRank = 0;
        } else {
            this.recRank = i3;
        }
        this.chainIndex = str2;
        if ((i & 16) == 0) {
            this.contractAddress = "";
        } else {
            this.contractAddress = str3;
        }
        if ((i & 32) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str4;
        }
        if ((i & 64) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str5;
        }
        if ((i & 128) == 0) {
            this.tokenCustomSymbol = "";
        } else {
            this.tokenCustomSymbol = str6;
        }
        if ((i & 256) == 0) {
            this.tokenCustomName = "";
        } else {
            this.tokenCustomName = str7;
        }
        if ((i & 512) == 0) {
            this.tokenPrice = "";
        } else {
            this.tokenPrice = str8;
        }
        if ((i & 1024) == 0) {
            this.tokenPrice24hChange = "";
        } else {
            this.tokenPrice24hChange = str9;
        }
        if ((i & 2048) == 0) {
            this.tokenMcp = "";
        } else {
            this.tokenMcp = str10;
        }
        if ((i & 4096) == 0) {
            this.sameUserNumber = "";
        } else {
            this.sameUserNumber = str11;
        }
        if ((i & 8192) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str12;
        }
        if ((i & 16384) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str13;
        }
        this.tags = (i & 32768) == 0 ? yDY.AhwBna() : list;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SearchRecommendTokenModel searchRecommendTokenModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || searchRecommendTokenModel.strategyType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, searchRecommendTokenModel.strategyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) searchRecommendTokenModel.strategyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, searchRecommendTokenModel.strategyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || searchRecommendTokenModel.recRank != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, searchRecommendTokenModel.recRank);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, searchRecommendTokenModel.chainIndex);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) searchRecommendTokenModel.contractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, searchRecommendTokenModel.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) searchRecommendTokenModel.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, searchRecommendTokenModel.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) searchRecommendTokenModel.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, searchRecommendTokenModel.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) searchRecommendTokenModel.tokenCustomSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, searchRecommendTokenModel.tokenCustomSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) searchRecommendTokenModel.tokenCustomName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, searchRecommendTokenModel.tokenCustomName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) searchRecommendTokenModel.tokenPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, searchRecommendTokenModel.tokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) searchRecommendTokenModel.tokenPrice24hChange, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, searchRecommendTokenModel.tokenPrice24hChange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) searchRecommendTokenModel.tokenMcp, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, searchRecommendTokenModel.tokenMcp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) searchRecommendTokenModel.sameUserNumber, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, searchRecommendTokenModel.sameUserNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) searchRecommendTokenModel.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, searchRecommendTokenModel.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) searchRecommendTokenModel.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, searchRecommendTokenModel.chainLogoUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && Intrinsics.EZpvd(searchRecommendTokenModel.tags, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, kSerializerArr[15], searchRecommendTokenModel.tags);
    }

    public SearchRecommendTokenModel(int i, @NotNull String str, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, String str11, @NotNull String str12, @NotNull String str13, List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        this.strategyType = i;
        this.strategyName = str;
        this.recRank = i2;
        this.chainIndex = str2;
        this.contractAddress = str3;
        this.tokenSymbol = str4;
        this.tokenName = str5;
        this.tokenCustomSymbol = str6;
        this.tokenCustomName = str7;
        this.tokenPrice = str8;
        this.tokenPrice24hChange = str9;
        this.tokenMcp = str10;
        this.sameUserNumber = str11;
        this.tokenLogoUrl = str12;
        this.chainLogoUrl = str13;
        this.tags = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r21v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r37v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r37v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r23v0 int))
  (r24v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r37v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r37v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r37v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r37v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r37v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r37v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r37v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006f: ARITH (r37v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x007b: ARITH (r37v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0082: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:167)) : (r36v0 java.util.List))
 A[MD:(int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.Integer>):void (m)] (LINE:126) call: com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendTokenModel.<init>(int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ SearchRecommendTokenModel(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i2, str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? "" : str6, (i3 & 256) != 0 ? "" : str7, (i3 & 512) != 0 ? "" : str8, (i3 & 1024) != 0 ? "" : str9, (i3 & 2048) != 0 ? "" : str10, (i3 & 4096) != 0 ? "" : str11, (i3 & 8192) != 0 ? "" : str12, (i3 & 16384) != 0 ? "" : str13, (i3 & 32768) != 0 ? yDY.AhwBna() : list);
    }
}
