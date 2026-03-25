package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.models.UnderlyingToken;
import com.okinc.business.invest_biz.data.models.UnderlyingToken$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestDetail implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final String activityButtonKey;
    private String activityDeeplinkUrl;
    private String activityDesc;
    private String activityIcoUrl;
    private final String activityImageUrlNew;
    private String activityLuaDeeplinkUrl;
    private String activityName;
    private final HomeActivityNewItem activityNameNew;
    private final String activityTextKey;
    private String activityUrl;
    private Integer aggregateInvestmentId;
    private List<UnderlyingToken> bottomRightLogoList;
    private Long chainId;
    private final String darkNetworkLogo;
    private String feeRate;
    private boolean hasBonus;
    private final List<InvestTag> investTagList;
    private Integer investType;
    private final String investmentClassify;
    private final String investmentDesc;
    private Long investmentId;
    private String investmentName;
    private List<InvestmentNetworkLogo> investmentNetworkList;
    private String investmentShowName;
    private boolean isTrackEvent;
    private String maxRate;
    private List<UnderlyingToken> middleLogoList;
    private String minRate;
    private String network;
    private String networkLogo;
    private String nickname;
    private String platformName;
    private String rate;
    private String rateType;
    private String rateTypeDesc;
    private Integer recommendRank;
    private int recommendType;
    private String recommendTypeDesc;
    private String sumTvl;
    private List<UnderlyingToken> topLeftLogoList;
    private List<UnderlyingToken> topRightLogoList;
    private String tvl;
    private Boolean useLuaFlag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestDetail> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestDetail createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            String string14 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int i2 = 0;
                while (i2 != i) {
                    arrayList.add(UnderlyingToken.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList;
                arrayList3 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i3);
                arrayList2 = arrayList;
                int i4 = 0;
                while (i4 != i3) {
                    arrayList10.add(UnderlyingToken.CREATOR.createFromParcel(parcel));
                    i4++;
                    i3 = i3;
                }
                arrayList3 = arrayList10;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = arrayList3;
                arrayList5 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(i5);
                arrayList4 = arrayList3;
                int i6 = 0;
                while (i6 != i5) {
                    arrayList11.add(UnderlyingToken.CREATOR.createFromParcel(parcel));
                    i6++;
                    i5 = i5;
                }
                arrayList5 = arrayList11;
            }
            if (parcel.readInt() == 0) {
                arrayList6 = arrayList5;
                arrayList7 = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList12 = new ArrayList(i7);
                arrayList6 = arrayList5;
                int i8 = 0;
                while (i8 != i7) {
                    arrayList12.add(UnderlyingToken.CREATOR.createFromParcel(parcel));
                    i8++;
                    i7 = i7;
                }
                arrayList7 = arrayList12;
            }
            if (parcel.readInt() == 0) {
                arrayList8 = arrayList7;
                arrayList9 = null;
            } else {
                int i9 = parcel.readInt();
                ArrayList arrayList13 = new ArrayList(i9);
                arrayList8 = arrayList7;
                int i10 = 0;
                while (i10 != i9) {
                    arrayList13.add(InvestmentNetworkLogo.CREATOR.createFromParcel(parcel));
                    i10++;
                    i9 = i9;
                }
                arrayList9 = arrayList13;
            }
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i11 = parcel.readInt();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string21 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            int i12 = parcel.readInt();
            Integer num = numValueOf3;
            ArrayList arrayList14 = new ArrayList(i12);
            ArrayList arrayList15 = arrayList9;
            int i13 = 0;
            while (i13 != i12) {
                arrayList14.add(InvestTag.CREATOR.createFromParcel(parcel));
                i13++;
                i12 = i12;
            }
            return new InvestDetail(numValueOf, lValueOf, lValueOf2, string, numValueOf2, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, arrayList2, arrayList4, arrayList6, arrayList8, arrayList15, num, i11, string15, string16, string17, string18, string19, string20, boolValueOf, string21, z, z2, string22, string23, string24, string25, string26, arrayList14, parcel.readString(), parcel.readInt() == 0 ? null : HomeActivityNewItem.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestDetail[] newArray(int i) {
            return new InvestDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestDetail() {
        this((Integer) null, (Long) null, (Long) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Integer) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (HomeActivityNewItem) null, -1, 2047, (DefaultConstructorMarker) null);
    }

    @SerialName("activityButtonKey")
    public static /* synthetic */ void getActivityButtonKey$annotations() {
    }

    @SerialName("activityImageUrlNew")
    public static /* synthetic */ void getActivityImageUrlNew$annotations() {
    }

    @SerialName("activityName")
    public static /* synthetic */ void getActivityName$annotations() {
    }

    @SerialName("activityNameNew")
    public static /* synthetic */ void getActivityNameNew$annotations() {
    }

    @SerialName("activityTextKey")
    public static /* synthetic */ void getActivityTextKey$annotations() {
    }

    @SerialName("darkNetworkLogo")
    public static /* synthetic */ void getDarkNetworkLogo$annotations() {
    }

    @SerialName("feeRate")
    public static /* synthetic */ void getFeeRate$annotations() {
    }

    @SerialName("investTagList")
    public static /* synthetic */ void getInvestTagList$annotations() {
    }

    @SerialName("investmentClassify")
    public static /* synthetic */ void getInvestmentClassify$annotations() {
    }

    @SerialName("investmentDesc")
    public static /* synthetic */ void getInvestmentDesc$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.aggregateInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.sumTvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.minRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.maxRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.rateTypeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> component19() {
        return this.middleLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> component20() {
        return this.bottomRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> component21() {
        return this.topLeftLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> component22() {
        return this.topRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestmentNetworkLogo> component23() {
        return this.investmentNetworkList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component24() {
        return this.recommendRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component25() {
        return this.recommendType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.recommendTypeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.activityName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.activityDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.activityUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.activityDeeplinkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.activityLuaDeeplinkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component32() {
        return this.useLuaFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.activityIcoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component34() {
        return this.isTrackEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component35() {
        return this.hasBonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.activityButtonKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.activityImageUrlNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.activityTextKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.investmentDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.darkNetworkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTag> component41() {
        return this.investTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.investmentClassify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeActivityNewItem component43() {
        return this.activityNameNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.investmentShowName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestDetail copy(Integer num, Long l, Long l2, String str, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List<UnderlyingToken> list, List<UnderlyingToken> list2, List<UnderlyingToken> list3, List<UnderlyingToken> list4, List<InvestmentNetworkLogo> list5, Integer num3, int i, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, String str20, Boolean bool, @NotNull String str21, boolean z, boolean z2, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull List<InvestTag> list6, @NotNull String str27, HomeActivityNewItem homeActivityNewItem) {
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(str27, "");
        return new InvestDetail(num, l, l2, str, num2, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, list, list2, list3, list4, list5, num3, i, str15, str16, str17, str18, str19, str20, bool, str21, z, z2, str22, str23, str24, str25, str26, list6, str27, homeActivityNewItem);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivityButtonKey() {
        return this.activityButtonKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivityDeeplinkUrl() {
        return this.activityDeeplinkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivityDesc() {
        return this.activityDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivityIcoUrl() {
        return this.activityIcoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivityImageUrlNew() {
        return this.activityImageUrlNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivityLuaDeeplinkUrl() {
        return this.activityLuaDeeplinkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivityName() {
        return this.activityName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeActivityNewItem getActivityNameNew() {
        return this.activityNameNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivityTextKey() {
        return this.activityTextKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivityUrl() {
        return this.activityUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAggregateInvestmentId() {
        return this.aggregateInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> getBottomRightLogoList() {
        return this.bottomRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDarkNetworkLogo() {
        return this.darkNetworkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasBonus() {
        return this.hasBonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTag> getInvestTagList() {
        return this.investTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInvestType() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentClassify() {
        return this.investmentClassify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentDesc() {
        return this.investmentDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentName() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestmentNetworkLogo> getInvestmentNetworkList() {
        return this.investmentNetworkList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentShowName() {
        return this.investmentShowName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxRate() {
        return this.maxRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> getMiddleLogoList() {
        return this.middleLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinRate() {
        return this.minRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkLogo() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformName() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateType() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateTypeDesc() {
        return this.rateTypeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRecommendRank() {
        return this.recommendRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRecommendType() {
        return this.recommendType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendTypeDesc() {
        return this.recommendTypeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSumTvl() {
        return this.sumTvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> getTopLeftLogoList() {
        return this.topLeftLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> getTopRightLogoList() {
        return this.topRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTvl() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUseLuaFlag() {
        return this.useLuaFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.aggregateInvestmentId;
        int iHashCode = num == null ? 0 : num.hashCode();
        Long l = this.investmentId;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.chainId;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        String str = this.platformName;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        Integer num2 = this.investType;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        String str2 = this.investmentName;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.investmentShowName;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.nickname;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.network;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.networkLogo;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.sumTvl;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.tvl;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.feeRate;
        int iHashCode13 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.rate;
        int iHashCode14 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.minRate;
        int iHashCode15 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.maxRate;
        int iHashCode16 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.rateType;
        int iHashCode17 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.rateTypeDesc;
        int iHashCode18 = str14 == null ? 0 : str14.hashCode();
        List<UnderlyingToken> list = this.middleLogoList;
        int iHashCode19 = list == null ? 0 : list.hashCode();
        List<UnderlyingToken> list2 = this.bottomRightLogoList;
        int iHashCode20 = list2 == null ? 0 : list2.hashCode();
        List<UnderlyingToken> list3 = this.topLeftLogoList;
        int iHashCode21 = list3 == null ? 0 : list3.hashCode();
        List<UnderlyingToken> list4 = this.topRightLogoList;
        int iHashCode22 = list4 == null ? 0 : list4.hashCode();
        List<InvestmentNetworkLogo> list5 = this.investmentNetworkList;
        int iHashCode23 = list5 == null ? 0 : list5.hashCode();
        Integer num3 = this.recommendRank;
        int iHashCode24 = num3 == null ? 0 : num3.hashCode();
        int iHashCode25 = Integer.hashCode(this.recommendType);
        int iHashCode26 = this.recommendTypeDesc.hashCode();
        int iHashCode27 = this.activityName.hashCode();
        int iHashCode28 = this.activityDesc.hashCode();
        int iHashCode29 = this.activityUrl.hashCode();
        int iHashCode30 = this.activityDeeplinkUrl.hashCode();
        String str15 = this.activityLuaDeeplinkUrl;
        int iHashCode31 = str15 == null ? 0 : str15.hashCode();
        Boolean bool = this.useLuaFlag;
        int iHashCode32 = bool == null ? 0 : bool.hashCode();
        int iHashCode33 = this.activityIcoUrl.hashCode();
        int iHashCode34 = Boolean.hashCode(this.isTrackEvent);
        int iHashCode35 = Boolean.hashCode(this.hasBonus);
        int iHashCode36 = this.activityButtonKey.hashCode();
        int iHashCode37 = this.activityImageUrlNew.hashCode();
        int iHashCode38 = this.activityTextKey.hashCode();
        int iHashCode39 = this.investmentDesc.hashCode();
        int iHashCode40 = this.darkNetworkLogo.hashCode();
        int iHashCode41 = this.investTagList.hashCode();
        int iHashCode42 = this.investmentClassify.hashCode();
        HomeActivityNewItem homeActivityNewItem = this.activityNameNew;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + (homeActivityNewItem == null ? 0 : homeActivityNewItem.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTrackEvent() {
        return this.isTrackEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivityDeeplinkUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.activityDeeplinkUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivityDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.activityDesc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivityIcoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.activityIcoUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivityLuaDeeplinkUrl(String str) {
        this.activityLuaDeeplinkUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivityName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.activityName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivityUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.activityUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAggregateInvestmentId(Integer num) {
        this.aggregateInvestmentId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBottomRightLogoList(List<UnderlyingToken> list) {
        this.bottomRightLogoList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(Long l) {
        this.chainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeRate(String str) {
        this.feeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasBonus(boolean z) {
        this.hasBonus = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestType(Integer num) {
        this.investType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestmentId(Long l) {
        this.investmentId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestmentName(String str) {
        this.investmentName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestmentNetworkList(List<InvestmentNetworkLogo> list) {
        this.investmentNetworkList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestmentShowName(String str) {
        this.investmentShowName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxRate(String str) {
        this.maxRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMiddleLogoList(List<UnderlyingToken> list) {
        this.middleLogoList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinRate(String str) {
        this.minRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetwork(String str) {
        this.network = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetworkLogo(String str) {
        this.networkLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNickname(String str) {
        this.nickname = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlatformName(String str) {
        this.platformName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRate(String str) {
        this.rate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRateType(String str) {
        this.rateType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRateTypeDesc(String str) {
        this.rateTypeDesc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommendRank(Integer num) {
        this.recommendRank = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommendType(int i) {
        this.recommendType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommendTypeDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.recommendTypeDesc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSumTvl(String str) {
        this.sumTvl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopLeftLogoList(List<UnderlyingToken> list) {
        this.topLeftLogoList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopRightLogoList(List<UnderlyingToken> list) {
        this.topRightLogoList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrackEvent(boolean z) {
        this.isTrackEvent = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTvl(String str) {
        this.tvl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUseLuaFlag(Boolean bool) {
        this.useLuaFlag = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestDetail(aggregateInvestmentId=" + this.aggregateInvestmentId + ", investmentId=" + this.investmentId + ", chainId=" + this.chainId + ", platformName=" + this.platformName + ", investType=" + this.investType + ", investmentName=" + this.investmentName + ", investmentShowName=" + this.investmentShowName + ", nickname=" + this.nickname + ", network=" + this.network + ", networkLogo=" + this.networkLogo + ", sumTvl=" + this.sumTvl + ", tvl=" + this.tvl + ", feeRate=" + this.feeRate + ", rate=" + this.rate + ", minRate=" + this.minRate + ", maxRate=" + this.maxRate + ", rateType=" + this.rateType + ", rateTypeDesc=" + this.rateTypeDesc + ", middleLogoList=" + this.middleLogoList + ", bottomRightLogoList=" + this.bottomRightLogoList + ", topLeftLogoList=" + this.topLeftLogoList + ", topRightLogoList=" + this.topRightLogoList + ", investmentNetworkList=" + this.investmentNetworkList + ", recommendRank=" + this.recommendRank + ", recommendType=" + this.recommendType + ", recommendTypeDesc=" + this.recommendTypeDesc + ", activityName=" + this.activityName + ", activityDesc=" + this.activityDesc + ", activityUrl=" + this.activityUrl + ", activityDeeplinkUrl=" + this.activityDeeplinkUrl + ", activityLuaDeeplinkUrl=" + this.activityLuaDeeplinkUrl + ", useLuaFlag=" + this.useLuaFlag + ", activityIcoUrl=" + this.activityIcoUrl + ", isTrackEvent=" + this.isTrackEvent + ", hasBonus=" + this.hasBonus + ", activityButtonKey=" + this.activityButtonKey + ", activityImageUrlNew=" + this.activityImageUrlNew + ", activityTextKey=" + this.activityTextKey + ", investmentDesc=" + this.investmentDesc + ", darkNetworkLogo=" + this.darkNetworkLogo + ", investTagList=" + this.investTagList + ", investmentClassify=" + this.investmentClassify + ", activityNameNew=" + this.activityNameNew + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.aggregateInvestmentId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.investmentId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.chainId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.platformName);
        Integer num2 = this.investType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.investmentName);
        parcel.writeString(this.investmentShowName);
        parcel.writeString(this.nickname);
        parcel.writeString(this.network);
        parcel.writeString(this.networkLogo);
        parcel.writeString(this.sumTvl);
        parcel.writeString(this.tvl);
        parcel.writeString(this.feeRate);
        parcel.writeString(this.rate);
        parcel.writeString(this.minRate);
        parcel.writeString(this.maxRate);
        parcel.writeString(this.rateType);
        parcel.writeString(this.rateTypeDesc);
        List<UnderlyingToken> list = this.middleLogoList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<UnderlyingToken> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<UnderlyingToken> list2 = this.bottomRightLogoList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<UnderlyingToken> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<UnderlyingToken> list3 = this.topLeftLogoList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<UnderlyingToken> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        List<UnderlyingToken> list4 = this.topRightLogoList;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<UnderlyingToken> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        List<InvestmentNetworkLogo> list5 = this.investmentNetworkList;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            Iterator<InvestmentNetworkLogo> it5 = list5.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(parcel, i);
            }
        }
        Integer num3 = this.recommendRank;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeInt(this.recommendType);
        parcel.writeString(this.recommendTypeDesc);
        parcel.writeString(this.activityName);
        parcel.writeString(this.activityDesc);
        parcel.writeString(this.activityUrl);
        parcel.writeString(this.activityDeeplinkUrl);
        parcel.writeString(this.activityLuaDeeplinkUrl);
        Boolean bool = this.useLuaFlag;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.activityIcoUrl);
        parcel.writeInt(this.isTrackEvent ? 1 : 0);
        parcel.writeInt(this.hasBonus ? 1 : 0);
        parcel.writeString(this.activityButtonKey);
        parcel.writeString(this.activityImageUrlNew);
        parcel.writeString(this.activityTextKey);
        parcel.writeString(this.investmentDesc);
        parcel.writeString(this.darkNetworkLogo);
        List<InvestTag> list6 = this.investTagList;
        parcel.writeInt(list6.size());
        Iterator<InvestTag> it6 = list6.iterator();
        while (it6.hasNext()) {
            it6.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.investmentClassify);
        HomeActivityNewItem homeActivityNewItem = this.activityNameNew;
        if (homeActivityNewItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            homeActivityNewItem.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestDetail> serializer() {
            return InvestDetail$$serializer.INSTANCE;
        }
    }

    static {
        UnderlyingToken$$serializer underlyingToken$$serializer = UnderlyingToken$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(underlyingToken$$serializer), new ArrayListSerializer(underlyingToken$$serializer), new ArrayListSerializer(underlyingToken$$serializer), new ArrayListSerializer(underlyingToken$$serializer), new ArrayListSerializer(InvestmentNetworkLogo$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(InvestTag$$serializer.INSTANCE), null, null};
    }

    public /* synthetic */ InvestDetail(int i, int i2, Integer num, Long l, Long l2, String str, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list, List list2, List list3, List list4, List list5, Integer num3, int i3, String str15, String str16, String str17, String str18, String str19, String str20, Boolean bool, String str21, boolean z, boolean z2, String str22, String str23, String str24, String str25, String str26, List list6, String str27, HomeActivityNewItem homeActivityNewItem, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.aggregateInvestmentId = null;
        } else {
            this.aggregateInvestmentId = num;
        }
        if ((i & 2) == 0) {
            this.investmentId = null;
        } else {
            this.investmentId = l;
        }
        if ((i & 4) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l2;
        }
        if ((i & 8) == 0) {
            this.platformName = null;
        } else {
            this.platformName = str;
        }
        if ((i & 16) == 0) {
            this.investType = null;
        } else {
            this.investType = num2;
        }
        if ((i & 32) == 0) {
            this.investmentName = null;
        } else {
            this.investmentName = str2;
        }
        if ((i & 64) == 0) {
            this.investmentShowName = null;
        } else {
            this.investmentShowName = str3;
        }
        if ((i & 128) == 0) {
            this.nickname = null;
        } else {
            this.nickname = str4;
        }
        if ((i & 256) == 0) {
            this.network = null;
        } else {
            this.network = str5;
        }
        if ((i & 512) == 0) {
            this.networkLogo = null;
        } else {
            this.networkLogo = str6;
        }
        if ((i & 1024) == 0) {
            this.sumTvl = null;
        } else {
            this.sumTvl = str7;
        }
        if ((i & 2048) == 0) {
            this.tvl = null;
        } else {
            this.tvl = str8;
        }
        if ((i & 4096) == 0) {
            this.feeRate = null;
        } else {
            this.feeRate = str9;
        }
        if ((i & 8192) == 0) {
            this.rate = null;
        } else {
            this.rate = str10;
        }
        if ((i & 16384) == 0) {
            this.minRate = null;
        } else {
            this.minRate = str11;
        }
        if ((32768 & i) == 0) {
            this.maxRate = null;
        } else {
            this.maxRate = str12;
        }
        if ((65536 & i) == 0) {
            this.rateType = null;
        } else {
            this.rateType = str13;
        }
        if ((131072 & i) == 0) {
            this.rateTypeDesc = null;
        } else {
            this.rateTypeDesc = str14;
        }
        if ((262144 & i) == 0) {
            this.middleLogoList = null;
        } else {
            this.middleLogoList = list;
        }
        if ((524288 & i) == 0) {
            this.bottomRightLogoList = null;
        } else {
            this.bottomRightLogoList = list2;
        }
        if ((1048576 & i) == 0) {
            this.topLeftLogoList = null;
        } else {
            this.topLeftLogoList = list3;
        }
        if ((2097152 & i) == 0) {
            this.topRightLogoList = null;
        } else {
            this.topRightLogoList = list4;
        }
        if ((4194304 & i) == 0) {
            this.investmentNetworkList = null;
        } else {
            this.investmentNetworkList = list5;
        }
        if ((8388608 & i) == 0) {
            this.recommendRank = null;
        } else {
            this.recommendRank = num3;
        }
        if ((16777216 & i) == 0) {
            this.recommendType = 0;
        } else {
            this.recommendType = i3;
        }
        if ((33554432 & i) == 0) {
            this.recommendTypeDesc = "";
        } else {
            this.recommendTypeDesc = str15;
        }
        if ((67108864 & i) == 0) {
            this.activityName = "";
        } else {
            this.activityName = str16;
        }
        if ((134217728 & i) == 0) {
            this.activityDesc = "";
        } else {
            this.activityDesc = str17;
        }
        if ((268435456 & i) == 0) {
            this.activityUrl = "";
        } else {
            this.activityUrl = str18;
        }
        if ((536870912 & i) == 0) {
            this.activityDeeplinkUrl = "";
        } else {
            this.activityDeeplinkUrl = str19;
        }
        if ((1073741824 & i) == 0) {
            this.activityLuaDeeplinkUrl = "";
        } else {
            this.activityLuaDeeplinkUrl = str20;
        }
        this.useLuaFlag = (i & Integer.MIN_VALUE) == 0 ? Boolean.FALSE : bool;
        if ((i2 & 1) == 0) {
            this.activityIcoUrl = "";
        } else {
            this.activityIcoUrl = str21;
        }
        if ((i2 & 2) == 0) {
            this.isTrackEvent = false;
        } else {
            this.isTrackEvent = z;
        }
        if ((i2 & 4) == 0) {
            this.hasBonus = false;
        } else {
            this.hasBonus = z2;
        }
        if ((i2 & 8) == 0) {
            this.activityButtonKey = "";
        } else {
            this.activityButtonKey = str22;
        }
        if ((i2 & 16) == 0) {
            this.activityImageUrlNew = "";
        } else {
            this.activityImageUrlNew = str23;
        }
        if ((i2 & 32) == 0) {
            this.activityTextKey = "";
        } else {
            this.activityTextKey = str24;
        }
        if ((i2 & 64) == 0) {
            this.investmentDesc = "";
        } else {
            this.investmentDesc = str25;
        }
        if ((i2 & 128) == 0) {
            this.darkNetworkLogo = "";
        } else {
            this.darkNetworkLogo = str26;
        }
        this.investTagList = (i2 & 256) == 0 ? yDY.AhwBna() : list6;
        if ((i2 & 512) == 0) {
            this.investmentClassify = "";
        } else {
            this.investmentClassify = str27;
        }
        if ((i2 & 1024) == 0) {
            this.activityNameNew = null;
        } else {
            this.activityNameNew = homeActivityNewItem;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestDetail investDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investDetail.aggregateInvestmentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, investDetail.aggregateInvestmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investDetail.investmentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, investDetail.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investDetail.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, investDetail.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investDetail.platformName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investDetail.platformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investDetail.investType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, investDetail.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investDetail.investmentName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, investDetail.investmentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investDetail.investmentShowName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, investDetail.investmentShowName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investDetail.nickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, investDetail.nickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investDetail.network != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, investDetail.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || investDetail.networkLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, investDetail.networkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || investDetail.sumTvl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, investDetail.sumTvl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || investDetail.tvl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, investDetail.tvl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || investDetail.feeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, investDetail.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || investDetail.rate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, investDetail.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || investDetail.minRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, investDetail.minRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || investDetail.maxRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, investDetail.maxRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || investDetail.rateType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, investDetail.rateType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || investDetail.rateTypeDesc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, investDetail.rateTypeDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || investDetail.middleLogoList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, kSerializerArr[18], investDetail.middleLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || investDetail.bottomRightLogoList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, kSerializerArr[19], investDetail.bottomRightLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || investDetail.topLeftLogoList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, kSerializerArr[20], investDetail.topLeftLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || investDetail.topRightLogoList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, kSerializerArr[21], investDetail.topRightLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || investDetail.investmentNetworkList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, kSerializerArr[22], investDetail.investmentNetworkList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || investDetail.recommendRank != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, IntSerializer.INSTANCE, investDetail.recommendRank);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || investDetail.recommendType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 24, investDetail.recommendType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) investDetail.recommendTypeDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, investDetail.recommendTypeDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) investDetail.activityName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, investDetail.activityName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) investDetail.activityDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, investDetail.activityDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) investDetail.activityUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, investDetail.activityUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) investDetail.activityDeeplinkUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, investDetail.activityDeeplinkUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) investDetail.activityLuaDeeplinkUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, investDetail.activityLuaDeeplinkUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd(investDetail.useLuaFlag, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, BooleanSerializer.INSTANCE, investDetail.useLuaFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) investDetail.activityIcoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, investDetail.activityIcoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || investDetail.isTrackEvent) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 33, investDetail.isTrackEvent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || investDetail.hasBonus) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 34, investDetail.hasBonus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) investDetail.activityButtonKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, investDetail.activityButtonKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) investDetail.activityImageUrlNew, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, investDetail.activityImageUrlNew);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) investDetail.activityTextKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, investDetail.activityTextKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) investDetail.investmentDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, investDetail.investmentDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) investDetail.darkNetworkLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, investDetail.darkNetworkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd(investDetail.investTagList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 40, kSerializerArr[40], investDetail.investTagList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) investDetail.investmentClassify, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, investDetail.investmentClassify);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) && investDetail.activityNameNew == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, HomeActivityNewItem$$serializer.INSTANCE, investDetail.activityNameNew);
    }

    public InvestDetail(Integer num, Long l, Long l2, String str, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List<UnderlyingToken> list, List<UnderlyingToken> list2, List<UnderlyingToken> list3, List<UnderlyingToken> list4, List<InvestmentNetworkLogo> list5, Integer num3, int i, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, String str20, Boolean bool, @NotNull String str21, boolean z, boolean z2, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull List<InvestTag> list6, @NotNull String str27, HomeActivityNewItem homeActivityNewItem) {
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(str27, "");
        this.aggregateInvestmentId = num;
        this.investmentId = l;
        this.chainId = l2;
        this.platformName = str;
        this.investType = num2;
        this.investmentName = str2;
        this.investmentShowName = str3;
        this.nickname = str4;
        this.network = str5;
        this.networkLogo = str6;
        this.sumTvl = str7;
        this.tvl = str8;
        this.feeRate = str9;
        this.rate = str10;
        this.minRate = str11;
        this.maxRate = str12;
        this.rateType = str13;
        this.rateTypeDesc = str14;
        this.middleLogoList = list;
        this.bottomRightLogoList = list2;
        this.topLeftLogoList = list3;
        this.topRightLogoList = list4;
        this.investmentNetworkList = list5;
        this.recommendRank = num3;
        this.recommendType = i;
        this.recommendTypeDesc = str15;
        this.activityName = str16;
        this.activityDesc = str17;
        this.activityUrl = str18;
        this.activityDeeplinkUrl = str19;
        this.activityLuaDeeplinkUrl = str20;
        this.useLuaFlag = bool;
        this.activityIcoUrl = str21;
        this.isTrackEvent = z;
        this.hasBonus = z2;
        this.activityButtonKey = str22;
        this.activityImageUrlNew = str23;
        this.activityTextKey = str24;
        this.investmentDesc = str25;
        this.darkNetworkLogo = str26;
        this.investTagList = list6;
        this.investmentClassify = str27;
        this.activityNameNew = homeActivityNewItem;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01fc: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0004: ARITH (r87v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r44v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r87v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r45v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0014: ARITH (r87v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r46v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r87v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0024: ARITH (r87v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r48v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r87v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r87v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r87v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r87v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r87v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r87v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r87v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r87v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:0x0074: TERNARY null = ((wrap:int:0x006c: ARITH (r87v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r87v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0081: ARITH (r87v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008c: ARITH (r87v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0097: ARITH (r87v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00a2: ARITH (r87v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r62v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r87v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r63v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00b8: ARITH (r87v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r64v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00c3: ARITH (r87v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r65v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00ce: ARITH (r87v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r66v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00d9: ARITH (r87v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r67v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00e4: ARITH (r87v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r68v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f1: ARITH (r87v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fe: ARITH (r87v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0109: ARITH (r87v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0114: ARITH (r87v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011f: ARITH (r87v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012a: ARITH (r87v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0135: ARITH (r87v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0139: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r75v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013e: ARITH (r88v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0147: ARITH (r88v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r77v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0150: ARITH (r88v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r78v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0157: ARITH (r88v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0160: ARITH (r88v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0169: ARITH (r88v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0172: ARITH (r88v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:java.lang.String:0x0186: TERNARY null = ((wrap:int:0x017d: ARITH (r88v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r83v0 java.lang.String))
  (wrap:java.util.List:0x0193: TERNARY null = ((wrap:int:0x0188: ARITH (r88v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x018c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:86)) : (r84v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0195: ARITH (r88v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r85v0 java.lang.String) : (""))
  (wrap:com.okinc.business.invest_biz.data.bean.HomeActivityNewItem:?: TERNARY null = ((wrap:int:0x019c: ARITH (r88v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.HomeActivityNewItem) : (r86v0 com.okinc.business.invest_biz.data.bean.HomeActivityNewItem))
 A[MD:(java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.UnderlyingToken>, java.util.List<com.okinc.business.invest_biz.data.models.UnderlyingToken>, java.util.List<com.okinc.business.invest_biz.data.models.UnderlyingToken>, java.util.List<com.okinc.business.invest_biz.data.models.UnderlyingToken>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestmentNetworkLogo>, java.lang.Integer, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestTag>, java.lang.String, com.okinc.business.invest_biz.data.bean.HomeActivityNewItem):void (m)] (LINE:37) call: com.okinc.business.invest_biz.data.bean.InvestDetail.<init>(java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.Integer, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, com.okinc.business.invest_biz.data.bean.HomeActivityNewItem):void type: THIS */
    public /* synthetic */ InvestDetail(Integer num, Long l, Long l2, String str, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list, List list2, List list3, List list4, List list5, Integer num3, int i, String str15, String str16, String str17, String str18, String str19, String str20, Boolean bool, String str21, boolean z, boolean z2, String str22, String str23, String str24, String str25, String str26, List list6, String str27, HomeActivityNewItem homeActivityNewItem, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : l2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : num2, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? null : str6, (i2 & 1024) != 0 ? null : str7, (i2 & 2048) != 0 ? null : str8, (i2 & 4096) != 0 ? null : str9, (i2 & 8192) != 0 ? null : str10, (i2 & 16384) != 0 ? null : str11, (i2 & 32768) != 0 ? null : str12, (i2 & 65536) != 0 ? null : str13, (i2 & 131072) != 0 ? null : str14, (i2 & 262144) != 0 ? null : list, (i2 & 524288) != 0 ? null : list2, (i2 & 1048576) != 0 ? null : list3, (i2 & 2097152) != 0 ? null : list4, (i2 & 4194304) != 0 ? null : list5, (i2 & 8388608) != 0 ? null : num3, (i2 & 16777216) != 0 ? 0 : i, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str15, (i2 & 67108864) != 0 ? "" : str16, (i2 & 134217728) != 0 ? "" : str17, (i2 & 268435456) != 0 ? "" : str18, (i2 & 536870912) != 0 ? "" : str19, (i2 & 1073741824) != 0 ? "" : str20, (i2 & Integer.MIN_VALUE) != 0 ? Boolean.FALSE : bool, (i3 & 1) != 0 ? "" : str21, (i3 & 2) != 0 ? false : z, (i3 & 4) == 0 ? z2 : false, (i3 & 8) != 0 ? "" : str22, (i3 & 16) != 0 ? "" : str23, (i3 & 32) != 0 ? "" : str24, (i3 & 64) != 0 ? "" : str25, (i3 & 128) != 0 ? "" : str26, (i3 & 256) != 0 ? yDY.AhwBna() : list6, (i3 & 512) == 0 ? str27 : "", (i3 & 1024) != 0 ? null : homeActivityNewItem);
    }

    public boolean equals(Object obj) {
        if (obj instanceof InvestDetail) {
            return Intrinsics.EZpvd(this.investmentId, ((InvestDetail) obj).investmentId);
        }
        return false;
    }
}
