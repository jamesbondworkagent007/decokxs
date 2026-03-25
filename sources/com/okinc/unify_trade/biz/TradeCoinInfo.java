package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.AbstractC55798xqj;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TradeCoinInfo extends AbstractC55798xqj implements Parcelable {
    private final String autoStakingApr;
    private final String collateralRestrict;
    private final String discount;
    private final ArrayList<String> groups;
    private final String id;
    private final String listTime;
    private final String manualLoan;
    private final String name;
    private final String newLabel;
    private final String newTag;
    private final String sign;
    private final String sizeDig;
    private String sort;
    private final String supportAutoEarn;
    private final String supportAutoLend;
    private final String supportAutoStaking;
    private final String supportSpotAvgCostFlag;
    private final String symbol;
    private final Boolean tradFi;
    private final String tradeCoin;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeCoinInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<TradeCoinInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeCoinInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TradeCoinInfo(string, string2, string3, string4, string5, arrayListCreateStringArrayList, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeCoinInfo[] newArray(int i) {
            return new TradeCoinInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeCoinInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 2097151, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component2() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component9() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.newTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.sort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.newLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.supportSpotAvgCostFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.listTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.collateralRestrict;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.autoStakingApr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.manualLoan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.supportAutoLend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.supportAutoEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.supportAutoStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component21() {
        return this.tradFi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.discount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component6() {
        return this.groups;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sizeDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tradeCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeCoinInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull ArrayList<String> arrayList, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, String str10, @NotNull String str11, String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        return new TradeCoinInfo(str, str2, str3, str4, str5, arrayList, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, bool);
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
        if (!(obj instanceof TradeCoinInfo)) {
            return false;
        }
        TradeCoinInfo tradeCoinInfo = (TradeCoinInfo) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) tradeCoinInfo.id) && Intrinsics.EZpvd((Object) this.sign, (Object) tradeCoinInfo.sign) && Intrinsics.EZpvd((Object) this.name, (Object) tradeCoinInfo.name) && Intrinsics.EZpvd((Object) this.symbol, (Object) tradeCoinInfo.symbol) && Intrinsics.EZpvd((Object) this.discount, (Object) tradeCoinInfo.discount) && Intrinsics.EZpvd(this.groups, tradeCoinInfo.groups) && Intrinsics.EZpvd((Object) this.sizeDig, (Object) tradeCoinInfo.sizeDig) && Intrinsics.EZpvd((Object) this.tradeCoin, (Object) tradeCoinInfo.tradeCoin) && Intrinsics.EZpvd((Object) this.url, (Object) tradeCoinInfo.url) && Intrinsics.EZpvd((Object) this.newTag, (Object) tradeCoinInfo.newTag) && Intrinsics.EZpvd((Object) this.sort, (Object) tradeCoinInfo.sort) && Intrinsics.EZpvd((Object) this.newLabel, (Object) tradeCoinInfo.newLabel) && Intrinsics.EZpvd((Object) this.supportSpotAvgCostFlag, (Object) tradeCoinInfo.supportSpotAvgCostFlag) && Intrinsics.EZpvd((Object) this.listTime, (Object) tradeCoinInfo.listTime) && Intrinsics.EZpvd((Object) this.collateralRestrict, (Object) tradeCoinInfo.collateralRestrict) && Intrinsics.EZpvd((Object) this.autoStakingApr, (Object) tradeCoinInfo.autoStakingApr) && Intrinsics.EZpvd((Object) this.manualLoan, (Object) tradeCoinInfo.manualLoan) && Intrinsics.EZpvd((Object) this.supportAutoLend, (Object) tradeCoinInfo.supportAutoLend) && Intrinsics.EZpvd((Object) this.supportAutoEarn, (Object) tradeCoinInfo.supportAutoEarn) && Intrinsics.EZpvd((Object) this.supportAutoStaking, (Object) tradeCoinInfo.supportAutoStaking) && Intrinsics.EZpvd(this.tradFi, tradeCoinInfo.tradFi);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoStakingApr() {
        return this.autoStakingApr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCollateralRestrict() {
        return this.collateralRestrict;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiscount() {
        return this.discount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplaySymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getGroups() {
        return this.groups;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getListTime() {
        return this.listTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getManualLoan() {
        return this.manualLoan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewLabel() {
        return this.newLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewTag() {
        return this.newTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSign() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSizeDig() {
        return this.sizeDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSort() {
        return this.sort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportAutoEarn() {
        return this.supportAutoEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportAutoLend() {
        return this.supportAutoLend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportAutoStaking() {
        return this.supportAutoStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportSpotAvgCostFlag() {
        return this.supportSpotAvgCostFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getTradFi() {
        return this.tradFi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeCoin() {
        return this.tradeCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.sign.hashCode();
        int iHashCode3 = this.name.hashCode();
        int iHashCode4 = this.symbol.hashCode();
        int iHashCode5 = this.discount.hashCode();
        int iHashCode6 = this.groups.hashCode();
        int iHashCode7 = this.sizeDig.hashCode();
        int iHashCode8 = this.tradeCoin.hashCode();
        int iHashCode9 = this.url.hashCode();
        int iHashCode10 = this.newTag.hashCode();
        String str = this.sort;
        int iHashCode11 = str == null ? 0 : str.hashCode();
        int iHashCode12 = this.newLabel.hashCode();
        String str2 = this.supportSpotAvgCostFlag;
        int iHashCode13 = str2 == null ? 0 : str2.hashCode();
        int iHashCode14 = this.listTime.hashCode();
        int iHashCode15 = this.collateralRestrict.hashCode();
        int iHashCode16 = this.autoStakingApr.hashCode();
        int iHashCode17 = this.manualLoan.hashCode();
        int iHashCode18 = this.supportAutoLend.hashCode();
        int iHashCode19 = this.supportAutoEarn.hashCode();
        int iHashCode20 = this.supportAutoStaking.hashCode();
        Boolean bool = this.tradFi;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSort(String str) {
        this.sort = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeCoinInfo(id=" + this.id + ", sign=" + this.sign + ", name=" + this.name + ", symbol=" + this.symbol + ", discount=" + this.discount + ", groups=" + this.groups + ", sizeDig=" + this.sizeDig + ", tradeCoin=" + this.tradeCoin + ", url=" + this.url + ", newTag=" + this.newTag + ", sort=" + this.sort + ", newLabel=" + this.newLabel + ", supportSpotAvgCostFlag=" + this.supportSpotAvgCostFlag + ", listTime=" + this.listTime + ", collateralRestrict=" + this.collateralRestrict + ", autoStakingApr=" + this.autoStakingApr + ", manualLoan=" + this.manualLoan + ", supportAutoLend=" + this.supportAutoLend + ", supportAutoEarn=" + this.supportAutoEarn + ", supportAutoStaking=" + this.supportAutoStaking + ", tradFi=" + this.tradFi + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [int] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.sign);
        parcel.writeString(this.name);
        parcel.writeString(this.symbol);
        parcel.writeString(this.discount);
        parcel.writeStringList(this.groups);
        parcel.writeString(this.sizeDig);
        parcel.writeString(this.tradeCoin);
        parcel.writeString(this.url);
        parcel.writeString(this.newTag);
        parcel.writeString(this.sort);
        parcel.writeString(this.newLabel);
        parcel.writeString(this.supportSpotAvgCostFlag);
        parcel.writeString(this.listTime);
        parcel.writeString(this.collateralRestrict);
        parcel.writeString(this.autoStakingApr);
        parcel.writeString(this.manualLoan);
        parcel.writeString(this.supportAutoLend);
        parcel.writeString(this.supportAutoEarn);
        parcel.writeString(this.supportAutoStaking);
        Boolean bool = this.tradFi;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeCoinInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeCoinInfo> serializer() {
            return TradeCoinInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeCoinInfo(int i, String str, String str2, String str3, String str4, String str5, ArrayList arrayList, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.sign = "";
        } else {
            this.sign = str2;
        }
        if ((i & 4) == 0) {
            this.name = "";
        } else {
            this.name = str3;
        }
        if ((i & 8) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str4;
        }
        if ((i & 16) == 0) {
            this.discount = "";
        } else {
            this.discount = str5;
        }
        this.groups = (i & 32) == 0 ? new ArrayList() : arrayList;
        if ((i & 64) == 0) {
            this.sizeDig = "";
        } else {
            this.sizeDig = str6;
        }
        if ((i & 128) == 0) {
            this.tradeCoin = "";
        } else {
            this.tradeCoin = str7;
        }
        if ((i & 256) == 0) {
            this.url = "";
        } else {
            this.url = str8;
        }
        if ((i & 512) == 0) {
            this.newTag = "";
        } else {
            this.newTag = str9;
        }
        this.sort = (i & 1024) == 0 ? "0" : str10;
        if ((i & 2048) == 0) {
            this.newLabel = "";
        } else {
            this.newLabel = str11;
        }
        this.supportSpotAvgCostFlag = (i & 4096) == 0 ? null : str12;
        if ((i & 8192) == 0) {
            this.listTime = "";
        } else {
            this.listTime = str13;
        }
        if ((i & 16384) == 0) {
            this.collateralRestrict = "";
        } else {
            this.collateralRestrict = str14;
        }
        if ((32768 & i) == 0) {
            this.autoStakingApr = "";
        } else {
            this.autoStakingApr = str15;
        }
        if ((65536 & i) == 0) {
            this.manualLoan = "";
        } else {
            this.manualLoan = str16;
        }
        if ((131072 & i) == 0) {
            this.supportAutoLend = "";
        } else {
            this.supportAutoLend = str17;
        }
        if ((262144 & i) == 0) {
            this.supportAutoEarn = "";
        } else {
            this.supportAutoEarn = str18;
        }
        if ((524288 & i) == 0) {
            this.supportAutoStaking = "";
        } else {
            this.supportAutoStaking = str19;
        }
        this.tradFi = (i & 1048576) == 0 ? Boolean.FALSE : bool;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeCoinInfo tradeCoinInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradeCoinInfo.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeCoinInfo.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradeCoinInfo.sign, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeCoinInfo.sign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradeCoinInfo.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeCoinInfo.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tradeCoinInfo.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tradeCoinInfo.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradeCoinInfo.discount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tradeCoinInfo.discount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(tradeCoinInfo.groups, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], tradeCoinInfo.groups);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tradeCoinInfo.sizeDig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tradeCoinInfo.sizeDig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tradeCoinInfo.tradeCoin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tradeCoinInfo.tradeCoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tradeCoinInfo.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tradeCoinInfo.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tradeCoinInfo.newTag, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tradeCoinInfo.newTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tradeCoinInfo.sort, (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, tradeCoinInfo.sort);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tradeCoinInfo.newLabel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tradeCoinInfo.newLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || tradeCoinInfo.supportSpotAvgCostFlag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, tradeCoinInfo.supportSpotAvgCostFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) tradeCoinInfo.listTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, tradeCoinInfo.listTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tradeCoinInfo.collateralRestrict, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, tradeCoinInfo.collateralRestrict);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) tradeCoinInfo.autoStakingApr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, tradeCoinInfo.autoStakingApr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) tradeCoinInfo.manualLoan, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, tradeCoinInfo.manualLoan);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) tradeCoinInfo.supportAutoLend, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, tradeCoinInfo.supportAutoLend);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) tradeCoinInfo.supportAutoEarn, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, tradeCoinInfo.supportAutoEarn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) tradeCoinInfo.supportAutoStaking, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, tradeCoinInfo.supportAutoStaking);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) && Intrinsics.EZpvd(tradeCoinInfo.tradFi, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, BooleanSerializer.INSTANCE, tradeCoinInfo.tradFi);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f3: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r44v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r44v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r44v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x002c: ARITH (r44v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0032: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:1132) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r28v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r44v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r44v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r44v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r44v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0058: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("0") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0061: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0069: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0071: ARITH (r44v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r44v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (r44v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r44v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009d: ARITH (r44v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a8: ARITH (r44v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r44v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00be: ARITH (r44v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c2: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r43v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:1126) call: com.okinc.unify_trade.biz.TradeCoinInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ TradeCoinInfo(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? new ArrayList() : arrayList, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "0" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "" : str16, (i & 131072) != 0 ? "" : str17, (i & 262144) != 0 ? "" : str18, (i & 524288) != 0 ? "" : str19, (i & 1048576) != 0 ? Boolean.FALSE : bool);
    }

    public TradeCoinInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull ArrayList<String> arrayList, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, String str10, @NotNull String str11, String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        this.id = str;
        this.sign = str2;
        this.name = str3;
        this.symbol = str4;
        this.discount = str5;
        this.groups = arrayList;
        this.sizeDig = str6;
        this.tradeCoin = str7;
        this.url = str8;
        this.newTag = str9;
        this.sort = str10;
        this.newLabel = str11;
        this.supportSpotAvgCostFlag = str12;
        this.listTime = str13;
        this.collateralRestrict = str14;
        this.autoStakingApr = str15;
        this.manualLoan = str16;
        this.supportAutoLend = str17;
        this.supportAutoEarn = str18;
        this.supportAutoStaking = str19;
        this.tradFi = bool;
    }

    public final boolean isNotSupportSpotAvgCostFlag() {
        return C33129mqd.OLrzqt(this.supportSpotAvgCostFlag, "2");
    }
}
