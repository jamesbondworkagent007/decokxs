package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.unify_trade.biz.ArbitrageSetFavoriteBean;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56524yIo;
import o.InterfaceC55813xqy;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class FundingRateArbitrageData implements Parcelable, InterfaceC55813xqy {
    private String acc3dFundingRate;
    private String apy;
    private String apyNoneAbsolute;
    private String arbitrageId;
    private String buyInstId;
    private String buyInstType;
    private String ccy;
    private String ccyType;
    private String ctType;
    private String fundingRate;
    private String fundingTime;
    private String groupType;
    private String instFamily;
    private boolean isSearchVisible;
    private boolean isShow;
    private String nextFundingRate;
    private String notionalUsd;
    private CharSequence searchCcy;
    private String sellInstId;
    private String sellInstType;
    private String spread;
    private String state;
    private String ts;
    private String type;
    private String uly;
    private String yield3dPer10K;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FundingRateArbitrageData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PolymorphicSerializer(C56524yIo.AEQbTJ(CharSequence.class), new Annotation[0]), null};

    public static final class Creator implements Parcelable.Creator<FundingRateArbitrageData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundingRateArbitrageData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FundingRateArbitrageData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundingRateArbitrageData[] newArray(int i) {
            return new FundingRateArbitrageData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FundingRateArbitrageData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (CharSequence) null, (String) null, 67108863, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.arbitrageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isSearchVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.fundingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.spread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.yield3dPer10K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.acc3dFundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.buyInstId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.groupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.ctType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.ccyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component25() {
        return this.searchCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.apyNoneAbsolute;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.sellInstId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.buyInstType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sellInstType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.nextFundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingRateArbitrageData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, @NotNull String str19, String str20, String str21, String str22, CharSequence charSequence, String str23) {
        Intrinsics.checkNotNullParameter(str19, "");
        return new FundingRateArbitrageData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z, z2, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, charSequence, str23);
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
        if (!(obj instanceof FundingRateArbitrageData)) {
            return false;
        }
        FundingRateArbitrageData fundingRateArbitrageData = (FundingRateArbitrageData) obj;
        return Intrinsics.EZpvd((Object) this.arbitrageId, (Object) fundingRateArbitrageData.arbitrageId) && Intrinsics.EZpvd((Object) this.buyInstId, (Object) fundingRateArbitrageData.buyInstId) && Intrinsics.EZpvd((Object) this.sellInstId, (Object) fundingRateArbitrageData.sellInstId) && Intrinsics.EZpvd((Object) this.buyInstType, (Object) fundingRateArbitrageData.buyInstType) && Intrinsics.EZpvd((Object) this.sellInstType, (Object) fundingRateArbitrageData.sellInstType) && Intrinsics.EZpvd((Object) this.apy, (Object) fundingRateArbitrageData.apy) && Intrinsics.EZpvd((Object) this.fundingRate, (Object) fundingRateArbitrageData.fundingRate) && Intrinsics.EZpvd((Object) this.nextFundingRate, (Object) fundingRateArbitrageData.nextFundingRate) && Intrinsics.EZpvd((Object) this.state, (Object) fundingRateArbitrageData.state) && Intrinsics.EZpvd((Object) this.ts, (Object) fundingRateArbitrageData.ts) && this.isShow == fundingRateArbitrageData.isShow && this.isSearchVisible == fundingRateArbitrageData.isSearchVisible && Intrinsics.EZpvd((Object) this.ccy, (Object) fundingRateArbitrageData.ccy) && Intrinsics.EZpvd((Object) this.uly, (Object) fundingRateArbitrageData.uly) && Intrinsics.EZpvd((Object) this.fundingTime, (Object) fundingRateArbitrageData.fundingTime) && Intrinsics.EZpvd((Object) this.spread, (Object) fundingRateArbitrageData.spread) && Intrinsics.EZpvd((Object) this.yield3dPer10K, (Object) fundingRateArbitrageData.yield3dPer10K) && Intrinsics.EZpvd((Object) this.notionalUsd, (Object) fundingRateArbitrageData.notionalUsd) && Intrinsics.EZpvd((Object) this.acc3dFundingRate, (Object) fundingRateArbitrageData.acc3dFundingRate) && Intrinsics.EZpvd((Object) this.type, (Object) fundingRateArbitrageData.type) && Intrinsics.EZpvd((Object) this.groupType, (Object) fundingRateArbitrageData.groupType) && Intrinsics.EZpvd((Object) this.ctType, (Object) fundingRateArbitrageData.ctType) && Intrinsics.EZpvd((Object) this.ccyType, (Object) fundingRateArbitrageData.ccyType) && Intrinsics.EZpvd((Object) this.instFamily, (Object) fundingRateArbitrageData.instFamily) && Intrinsics.EZpvd(this.searchCcy, fundingRateArbitrageData.searchCcy) && Intrinsics.EZpvd((Object) this.apyNoneAbsolute, (Object) fundingRateArbitrageData.apyNoneAbsolute);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcc3dFundingRate() {
        return this.acc3dFundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApy() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApyNoneAbsolute() {
        return this.apyNoneAbsolute;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55813xqy
    public String getArbCcy() {
        String str = this.ccy;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55813xqy
    public String getArbCtType() {
        String str = this.ctType;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55813xqy
    public String getArbGroupType() {
        String str = this.groupType;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55813xqy
    public String getArbId() {
        String str = this.arbitrageId;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55813xqy
    public String getArbLeftInstId() {
        String str = this.sellInstId;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55813xqy
    public String getArbLeftInstType() {
        String str = this.sellInstType;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getArbLeftSide() {
        return "sell";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55813xqy
    public String getArbRightInstId() {
        String str = this.buyInstId;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55813xqy
    public String getArbRightInstType() {
        String str = this.buyInstType;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getArbRightSide() {
        return "buy";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55813xqy
    public String getArbType() {
        String str = this.type;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbitrageId() {
        return this.arbitrageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyInstId() {
        return this.buyInstId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyInstType() {
        return this.buyInstType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcyType() {
        return this.ccyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtType() {
        return this.ctType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingRate() {
        return this.fundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingTime() {
        return this.fundingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupType() {
        return this.groupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextFundingRate() {
        return this.nextFundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsd() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getSearchCcy() {
        return this.searchCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellInstId() {
        return this.sellInstId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellInstType() {
        return this.sellInstType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpread() {
        return this.spread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getYield3dPer10K() {
        return this.yield3dPer10K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.arbitrageId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.buyInstId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.sellInstId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.buyInstType;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.sellInstType;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.apy;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.fundingRate;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.nextFundingRate;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.state;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.ts;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        int iHashCode11 = Boolean.hashCode(this.isShow);
        int iHashCode12 = Boolean.hashCode(this.isSearchVisible);
        String str11 = this.ccy;
        int iHashCode13 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.uly;
        int iHashCode14 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.fundingTime;
        int iHashCode15 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.spread;
        int iHashCode16 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.yield3dPer10K;
        int iHashCode17 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.notionalUsd;
        int iHashCode18 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.acc3dFundingRate;
        int iHashCode19 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.type;
        int iHashCode20 = str18 == null ? 0 : str18.hashCode();
        int iHashCode21 = this.groupType.hashCode();
        String str19 = this.ctType;
        int iHashCode22 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.ccyType;
        int iHashCode23 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.instFamily;
        int iHashCode24 = str21 == null ? 0 : str21.hashCode();
        CharSequence charSequence = this.searchCcy;
        int iHashCode25 = charSequence == null ? 0 : charSequence.hashCode();
        String str22 = this.apyNoneAbsolute;
        return (((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + (str22 == null ? 0 : str22.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSearchVisible() {
        return this.isSearchVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShow() {
        return this.isShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAcc3dFundingRate(String str) {
        this.acc3dFundingRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApy(String str) {
        this.apy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApyNoneAbsolute(String str) {
        this.apyNoneAbsolute = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbitrageId(String str) {
        this.arbitrageId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyInstId(String str) {
        this.buyInstId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyInstType(String str) {
        this.buyInstType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcyType(String str) {
        this.ccyType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtType(String str) {
        this.ctType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFundingRate(String str) {
        this.fundingRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFundingTime(String str) {
        this.fundingTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.groupType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstFamily(String str) {
        this.instFamily = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNextFundingRate(String str) {
        this.nextFundingRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsd(String str) {
        this.notionalUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSearchCcy(CharSequence charSequence) {
        this.searchCcy = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSearchVisible(boolean z) {
        this.isSearchVisible = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellInstId(String str) {
        this.sellInstId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellInstType(String str) {
        this.sellInstType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShow(boolean z) {
        this.isShow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpread(String str) {
        this.spread = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(String str) {
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTs(String str) {
        this.ts = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUly(String str) {
        this.uly = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setYield3dPer10K(String str) {
        this.yield3dPer10K = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        String str = this.arbitrageId;
        String str2 = this.buyInstId;
        String str3 = this.sellInstId;
        String str4 = this.buyInstType;
        String str5 = this.sellInstType;
        String str6 = this.apy;
        String str7 = this.fundingRate;
        String str8 = this.nextFundingRate;
        String str9 = this.state;
        String str10 = this.ts;
        boolean z = this.isShow;
        boolean z2 = this.isSearchVisible;
        String str11 = this.ccy;
        String str12 = this.uly;
        String str13 = this.fundingTime;
        String str14 = this.spread;
        String str15 = this.yield3dPer10K;
        String str16 = this.notionalUsd;
        String str17 = this.acc3dFundingRate;
        String str18 = this.type;
        String str19 = this.groupType;
        String str20 = this.ctType;
        String str21 = this.ccyType;
        String str22 = this.instFamily;
        CharSequence charSequence = this.searchCcy;
        return "FundingRateArbitrageData(arbitrageId=" + str + ", buyInstId=" + str2 + ", sellInstId=" + str3 + ", buyInstType=" + str4 + ", sellInstType=" + str5 + ", apy=" + str6 + ", fundingRate=" + str7 + ", nextFundingRate=" + str8 + ", state=" + str9 + ", ts=" + str10 + ", isShow=" + z + ", isSearchVisible=" + z2 + ", ccy=" + str11 + ", uly=" + str12 + ", fundingTime=" + str13 + ", spread=" + str14 + ", yield3dPer10K=" + str15 + ", notionalUsd=" + str16 + ", acc3dFundingRate=" + str17 + ", type=" + str18 + ", groupType=" + str19 + ", ctType=" + str20 + ", ccyType=" + str21 + ", instFamily=" + str22 + ", searchCcy=" + ((Object) charSequence) + ", apyNoneAbsolute=" + this.apyNoneAbsolute + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.arbitrageId);
        parcel.writeString(this.buyInstId);
        parcel.writeString(this.sellInstId);
        parcel.writeString(this.buyInstType);
        parcel.writeString(this.sellInstType);
        parcel.writeString(this.apy);
        parcel.writeString(this.fundingRate);
        parcel.writeString(this.nextFundingRate);
        parcel.writeString(this.state);
        parcel.writeString(this.ts);
        parcel.writeInt(this.isShow ? 1 : 0);
        parcel.writeInt(this.isSearchVisible ? 1 : 0);
        parcel.writeString(this.ccy);
        parcel.writeString(this.uly);
        parcel.writeString(this.fundingTime);
        parcel.writeString(this.spread);
        parcel.writeString(this.yield3dPer10K);
        parcel.writeString(this.notionalUsd);
        parcel.writeString(this.acc3dFundingRate);
        parcel.writeString(this.type);
        parcel.writeString(this.groupType);
        parcel.writeString(this.ctType);
        parcel.writeString(this.ccyType);
        parcel.writeString(this.instFamily);
        TextUtils.writeToParcel(this.searchCcy, parcel, i);
        parcel.writeString(this.apyNoneAbsolute);
    }

    public /* synthetic */ FundingRateArbitrageData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, CharSequence charSequence, String str23, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.arbitrageId = null;
        } else {
            this.arbitrageId = str;
        }
        if ((i & 2) == 0) {
            this.buyInstId = null;
        } else {
            this.buyInstId = str2;
        }
        if ((i & 4) == 0) {
            this.sellInstId = null;
        } else {
            this.sellInstId = str3;
        }
        if ((i & 8) == 0) {
            this.buyInstType = null;
        } else {
            this.buyInstType = str4;
        }
        if ((i & 16) == 0) {
            this.sellInstType = null;
        } else {
            this.sellInstType = str5;
        }
        if ((i & 32) == 0) {
            this.apy = null;
        } else {
            this.apy = str6;
        }
        if ((i & 64) == 0) {
            this.fundingRate = null;
        } else {
            this.fundingRate = str7;
        }
        if ((i & 128) == 0) {
            this.nextFundingRate = null;
        } else {
            this.nextFundingRate = str8;
        }
        if ((i & 256) == 0) {
            this.state = null;
        } else {
            this.state = str9;
        }
        if ((i & 512) == 0) {
            this.ts = null;
        } else {
            this.ts = str10;
        }
        this.isShow = (i & 1024) == 0 ? true : z;
        this.isSearchVisible = (i & 2048) == 0 ? false : z2;
        if ((i & 4096) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str11;
        }
        if ((i & 8192) == 0) {
            this.uly = null;
        } else {
            this.uly = str12;
        }
        if ((i & 16384) == 0) {
            this.fundingTime = null;
        } else {
            this.fundingTime = str13;
        }
        if ((32768 & i) == 0) {
            this.spread = null;
        } else {
            this.spread = str14;
        }
        if ((65536 & i) == 0) {
            this.yield3dPer10K = null;
        } else {
            this.yield3dPer10K = str15;
        }
        if ((131072 & i) == 0) {
            this.notionalUsd = null;
        } else {
            this.notionalUsd = str16;
        }
        if ((262144 & i) == 0) {
            this.acc3dFundingRate = null;
        } else {
            this.acc3dFundingRate = str17;
        }
        if ((524288 & i) == 0) {
            this.type = null;
        } else {
            this.type = str18;
        }
        this.groupType = (1048576 & i) == 0 ? "funding-rate" : str19;
        if ((2097152 & i) == 0) {
            this.ctType = null;
        } else {
            this.ctType = str20;
        }
        if ((4194304 & i) == 0) {
            this.ccyType = null;
        } else {
            this.ccyType = str21;
        }
        if ((8388608 & i) == 0) {
            this.instFamily = null;
        } else {
            this.instFamily = str22;
        }
        if ((16777216 & i) == 0) {
            this.searchCcy = null;
        } else {
            this.searchCcy = charSequence;
        }
        if ((i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0) {
            this.apyNoneAbsolute = null;
        } else {
            this.apyNoneAbsolute = str23;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(FundingRateArbitrageData fundingRateArbitrageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || fundingRateArbitrageData.arbitrageId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, fundingRateArbitrageData.arbitrageId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || fundingRateArbitrageData.buyInstId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, fundingRateArbitrageData.buyInstId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || fundingRateArbitrageData.sellInstId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, fundingRateArbitrageData.sellInstId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || fundingRateArbitrageData.buyInstType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, fundingRateArbitrageData.buyInstType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || fundingRateArbitrageData.sellInstType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, fundingRateArbitrageData.sellInstType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || fundingRateArbitrageData.apy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, fundingRateArbitrageData.apy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || fundingRateArbitrageData.fundingRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, fundingRateArbitrageData.fundingRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || fundingRateArbitrageData.nextFundingRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, fundingRateArbitrageData.nextFundingRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || fundingRateArbitrageData.state != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, fundingRateArbitrageData.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || fundingRateArbitrageData.ts != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, fundingRateArbitrageData.ts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !fundingRateArbitrageData.isShow) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, fundingRateArbitrageData.isShow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || fundingRateArbitrageData.isSearchVisible) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, fundingRateArbitrageData.isSearchVisible);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || fundingRateArbitrageData.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, fundingRateArbitrageData.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || fundingRateArbitrageData.uly != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, fundingRateArbitrageData.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || fundingRateArbitrageData.fundingTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, fundingRateArbitrageData.fundingTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || fundingRateArbitrageData.spread != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, fundingRateArbitrageData.spread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || fundingRateArbitrageData.yield3dPer10K != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, fundingRateArbitrageData.yield3dPer10K);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || fundingRateArbitrageData.notionalUsd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, fundingRateArbitrageData.notionalUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || fundingRateArbitrageData.acc3dFundingRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, fundingRateArbitrageData.acc3dFundingRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || fundingRateArbitrageData.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, fundingRateArbitrageData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) fundingRateArbitrageData.groupType, (Object) "funding-rate")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, fundingRateArbitrageData.groupType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || fundingRateArbitrageData.ctType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, fundingRateArbitrageData.ctType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || fundingRateArbitrageData.ccyType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, fundingRateArbitrageData.ccyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || fundingRateArbitrageData.instFamily != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, fundingRateArbitrageData.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || fundingRateArbitrageData.searchCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, kSerializerArr[24], fundingRateArbitrageData.searchCcy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) && fundingRateArbitrageData.apyNoneAbsolute == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, fundingRateArbitrageData.apyNoneAbsolute);
    }

    public FundingRateArbitrageData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, @NotNull String str19, String str20, String str21, String str22, CharSequence charSequence, String str23) {
        Intrinsics.checkNotNullParameter(str19, "");
        this.arbitrageId = str;
        this.buyInstId = str2;
        this.sellInstId = str3;
        this.buyInstType = str4;
        this.sellInstType = str5;
        this.apy = str6;
        this.fundingRate = str7;
        this.nextFundingRate = str8;
        this.state = str9;
        this.ts = str10;
        this.isShow = z;
        this.isSearchVisible = z2;
        this.ccy = str11;
        this.uly = str12;
        this.fundingTime = str13;
        this.spread = str14;
        this.yield3dPer10K = str15;
        this.notionalUsd = str16;
        this.acc3dFundingRate = str17;
        this.type = str18;
        this.groupType = str19;
        this.ctType = str20;
        this.ccyType = str21;
        this.instFamily = str22;
        this.searchCcy = charSequence;
        this.apyNoneAbsolute = str23;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0129: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r54v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r54v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r54v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r54v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r54v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r54v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r54v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r54v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r54v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r54v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (r54v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? true : (r38v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005a: ARITH (r54v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r39v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r54v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r54v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r54v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r54v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r54v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r54v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r54v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r54v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r54v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("funding-rate") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r54v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r54v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r54v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r54v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.CharSequence) : (r52v0 java.lang.CharSequence))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r54v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.CharSequence, java.lang.String):void (m)] (LINE:27) call: com.okinc.unify_trade.biz.subscribe.FundingRateArbitrageData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.CharSequence, java.lang.String):void type: THIS */
    public /* synthetic */ FundingRateArbitrageData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, CharSequence charSequence, String str23, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? true : z, (i & 2048) != 0 ? false : z2, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? null : str15, (i & 131072) != 0 ? null : str16, (i & 262144) != 0 ? null : str17, (i & 524288) != 0 ? null : str18, (i & 1048576) != 0 ? "funding-rate" : str19, (i & 2097152) != 0 ? null : str20, (i & 4194304) != 0 ? null : str21, (i & 8388608) != 0 ? null : str22, (i & 16777216) != 0 ? null : charSequence, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str23);
    }

    public static final class Companion {

        public static final class Application extends TypeToken<List<? extends FundingRateArbitrageData>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.FundingRateArbitrageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FundingRateArbitrageData> serializer() {
            return FundingRateArbitrageData$$serializer.INSTANCE;
        }

        public final List<FundingRateArbitrageData> EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                List<FundingRateArbitrageData> list = (List) new Gson().fromJson(str, new Application().getType());
                if (list != null) {
                    if (!list.isEmpty()) {
                        return list;
                    }
                }
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "FundingRateArbitrageData-jsonConvertList" + e.getMessage());
            }
            return null;
        }
    }

    public final boolean filterBySearch(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "");
        String str3 = this.buyInstId;
        return (str3 != null && StringsKt__StringsKt.contains$default((CharSequence) str3, (CharSequence) str, false, 2, (Object) null)) || ((str2 = this.sellInstId) != null && StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) str, false, 2, (Object) null));
    }

    public final ArbitrageSetFavoriteBean toSetFavoriteBean(int i, @NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        ArbitrageSetFavoriteBean arbitrageSetFavoriteBean = new ArbitrageSetFavoriteBean();
        arbitrageSetFavoriteBean.setOperator(Integer.valueOf(i));
        String str3 = this.arbitrageId;
        if (str3 == null) {
            str3 = "";
        }
        arbitrageSetFavoriteBean.setArbitrageId(str3);
        String str4 = this.ccy;
        arbitrageSetFavoriteBean.setCcy(str4 != null ? str4 : "");
        arbitrageSetFavoriteBean.setGroupType("funding-rate");
        arbitrageSetFavoriteBean.setCtType(str);
        arbitrageSetFavoriteBean.setArbitrageType(str2);
        return arbitrageSetFavoriteBean;
    }
}
