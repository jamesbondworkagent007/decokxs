package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.models.InvestSimpleToken;
import com.okinc.business.invest_biz.data.models.InvestSimpleToken$$serializer;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount$$serializer;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class InvestOrderBean implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<InvestLogoBaseVo> bottomRightLogoList;
    private final String browserUrl;
    private final long chainId;
    private final String costTime;
    private final long createTime;
    private final List<InvestTokenWithAmount> investInfo;
    private final int investType;
    private final String investmentClassify;
    private final long investmentId;
    private final String investmentName;
    private final List<InvestLogoBaseVo> middleLogoList;
    private final String network;
    private final String networkName;
    private final String nickname;
    private final String orderId;
    private final int orderStatus;
    private final int orderType;
    private int orderVoStatus;
    private final int platformId;
    private final String platformLogo;
    private final String platformName;
    private final String poolId;
    private final String sourcePlatformName;
    private final List<InvestSimpleToken> tokenInfo;
    private final List<InvestLogoBaseVo> topLeftLogoList;
    private final List<InvestLogoBaseVo> topRightLogoList;
    private final String totalValue;
    private final String txHash;
    private final String txId;
    private final List<UnderlyingToken> underlyingToken;
    private final String uopHash;
    private final long updateTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestOrderBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<InvestOrderBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestOrderBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InvestLogoBaseVo.CREATOR.createFromParcel(parcel));
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j = parcel.readLong();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            int i5 = parcel.readInt();
            long j2 = parcel.readLong();
            String string3 = parcel.readString();
            int i6 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i6);
            for (int i7 = 0; i7 != i6; i7++) {
                arrayList3.add(InvestLogoBaseVo.CREATOR.createFromParcel(parcel));
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i8 = parcel.readInt();
            int i9 = parcel.readInt();
            int i10 = parcel.readInt();
            int i11 = parcel.readInt();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i12);
            int i13 = 0;
            while (i13 != i12) {
                arrayList4.add(InvestSimpleToken.CREATOR.createFromParcel(parcel));
                i13++;
                i12 = i12;
            }
            int i14 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i14);
            int i15 = 0;
            while (i15 != i14) {
                arrayList5.add(InvestLogoBaseVo.CREATOR.createFromParcel(parcel));
                i15++;
                i14 = i14;
            }
            int i16 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i16);
            int i17 = 0;
            while (i17 != i16) {
                arrayList6.add(InvestLogoBaseVo.CREATOR.createFromParcel(parcel));
                i17++;
                i16 = i16;
            }
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            int i18 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i18);
            int i19 = 0;
            while (i19 != i18) {
                arrayList7.add(UnderlyingToken.CREATOR.createFromParcel(parcel));
                i19++;
                i18 = i18;
            }
            return new InvestOrderBean(arrayList, string, string2, j, arrayList2, i5, j2, string3, arrayList3, string4, string5, string6, string7, i8, i9, i10, i11, string8, string9, string10, arrayList4, arrayList5, arrayList6, string11, string12, string13, arrayList7, parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestOrderBean[] newArray(int i) {
            return new InvestOrderBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestOrderBean() {
        this(null, null, null, 0L, null, 0, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, -1, null);
    }

    @SerialName("investmentClassify")
    public static /* synthetic */ void getInvestmentClassify$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> component1() {
        return this.bottomRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.orderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component16() {
        return this.orderVoStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.platformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.browserUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.sourcePlatformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestSimpleToken> component21() {
        return this.tokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> component22() {
        return this.topLeftLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> component23() {
        return this.topRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.totalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> component27() {
        return this.underlyingToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component28() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component29() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.costTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.poolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.investmentClassify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component5() {
        return this.investInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> component9() {
        return this.middleLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestOrderBean copy(@NotNull List<InvestLogoBaseVo> list, @NotNull String str, @NotNull String str2, long j, @NotNull List<InvestTokenWithAmount> list2, int i, long j2, @NotNull String str3, @NotNull List<InvestLogoBaseVo> list3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i2, int i3, int i4, int i5, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull List<InvestSimpleToken> list4, @NotNull List<InvestLogoBaseVo> list5, @NotNull List<InvestLogoBaseVo> list6, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull List<UnderlyingToken> list7, long j3, long j4, String str14, String str15, @NotNull String str16) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(str16, "");
        return new InvestOrderBean(list, str, str2, j, list2, i, j2, str3, list3, str4, str5, str6, str7, i2, i3, i4, i5, str8, str9, str10, list4, list5, list6, str11, str12, str13, list7, j3, j4, str14, str15, str16);
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
        if (!(obj instanceof InvestOrderBean)) {
            return false;
        }
        InvestOrderBean investOrderBean = (InvestOrderBean) obj;
        return Intrinsics.EZpvd(this.bottomRightLogoList, investOrderBean.bottomRightLogoList) && Intrinsics.EZpvd((Object) this.browserUrl, (Object) investOrderBean.browserUrl) && Intrinsics.EZpvd((Object) this.costTime, (Object) investOrderBean.costTime) && this.createTime == investOrderBean.createTime && Intrinsics.EZpvd(this.investInfo, investOrderBean.investInfo) && this.investType == investOrderBean.investType && this.investmentId == investOrderBean.investmentId && Intrinsics.EZpvd((Object) this.investmentName, (Object) investOrderBean.investmentName) && Intrinsics.EZpvd(this.middleLogoList, investOrderBean.middleLogoList) && Intrinsics.EZpvd((Object) this.network, (Object) investOrderBean.network) && Intrinsics.EZpvd((Object) this.networkName, (Object) investOrderBean.networkName) && Intrinsics.EZpvd((Object) this.nickname, (Object) investOrderBean.nickname) && Intrinsics.EZpvd((Object) this.orderId, (Object) investOrderBean.orderId) && this.orderStatus == investOrderBean.orderStatus && this.orderType == investOrderBean.orderType && this.orderVoStatus == investOrderBean.orderVoStatus && this.platformId == investOrderBean.platformId && Intrinsics.EZpvd((Object) this.platformLogo, (Object) investOrderBean.platformLogo) && Intrinsics.EZpvd((Object) this.platformName, (Object) investOrderBean.platformName) && Intrinsics.EZpvd((Object) this.sourcePlatformName, (Object) investOrderBean.sourcePlatformName) && Intrinsics.EZpvd(this.tokenInfo, investOrderBean.tokenInfo) && Intrinsics.EZpvd(this.topLeftLogoList, investOrderBean.topLeftLogoList) && Intrinsics.EZpvd(this.topRightLogoList, investOrderBean.topRightLogoList) && Intrinsics.EZpvd((Object) this.totalValue, (Object) investOrderBean.totalValue) && Intrinsics.EZpvd((Object) this.txHash, (Object) investOrderBean.txHash) && Intrinsics.EZpvd((Object) this.txId, (Object) investOrderBean.txId) && Intrinsics.EZpvd(this.underlyingToken, investOrderBean.underlyingToken) && this.updateTime == investOrderBean.updateTime && this.chainId == investOrderBean.chainId && Intrinsics.EZpvd((Object) this.uopHash, (Object) investOrderBean.uopHash) && Intrinsics.EZpvd((Object) this.poolId, (Object) investOrderBean.poolId) && Intrinsics.EZpvd((Object) this.investmentClassify, (Object) investOrderBean.investmentClassify);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> getBottomRightLogoList() {
        return this.bottomRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrowserUrl() {
        return this.browserUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCostTime() {
        return this.costTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getInvestInfo() {
        return this.investInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInvestType() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentClassify() {
        return this.investmentClassify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentName() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> getMiddleLogoList() {
        return this.middleLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkName() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderStatus() {
        return this.orderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderVoStatus() {
        return this.orderVoStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPlatformId() {
        return this.platformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformLogo() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformName() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPoolId() {
        return this.poolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourcePlatformName() {
        return this.sourcePlatformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestSimpleToken> getTokenInfo() {
        return this.tokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> getTopLeftLogoList() {
        return this.topLeftLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> getTopRightLogoList() {
        return this.topRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalValue() {
        return this.totalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> getUnderlyingToken() {
        return this.underlyingToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUopHash() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.bottomRightLogoList.hashCode();
        int iHashCode2 = this.browserUrl.hashCode();
        int iHashCode3 = this.costTime.hashCode();
        int iHashCode4 = Long.hashCode(this.createTime);
        int iHashCode5 = this.investInfo.hashCode();
        int iHashCode6 = Integer.hashCode(this.investType);
        int iHashCode7 = Long.hashCode(this.investmentId);
        int iHashCode8 = this.investmentName.hashCode();
        int iHashCode9 = this.middleLogoList.hashCode();
        int iHashCode10 = this.network.hashCode();
        int iHashCode11 = this.networkName.hashCode();
        int iHashCode12 = this.nickname.hashCode();
        int iHashCode13 = this.orderId.hashCode();
        int iHashCode14 = Integer.hashCode(this.orderStatus);
        int iHashCode15 = Integer.hashCode(this.orderType);
        int iHashCode16 = Integer.hashCode(this.orderVoStatus);
        int iHashCode17 = Integer.hashCode(this.platformId);
        int iHashCode18 = this.platformLogo.hashCode();
        int iHashCode19 = this.platformName.hashCode();
        int iHashCode20 = this.sourcePlatformName.hashCode();
        int iHashCode21 = this.tokenInfo.hashCode();
        int iHashCode22 = this.topLeftLogoList.hashCode();
        int iHashCode23 = this.topRightLogoList.hashCode();
        int iHashCode24 = this.totalValue.hashCode();
        int iHashCode25 = this.txHash.hashCode();
        int iHashCode26 = this.txId.hashCode();
        int iHashCode27 = this.underlyingToken.hashCode();
        int iHashCode28 = Long.hashCode(this.updateTime);
        int iHashCode29 = Long.hashCode(this.chainId);
        String str = this.uopHash;
        int iHashCode30 = str == null ? 0 : str.hashCode();
        String str2 = this.poolId;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.investmentClassify.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderVoStatus(int i) {
        this.orderVoStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestOrderBean(bottomRightLogoList=" + this.bottomRightLogoList + ", browserUrl=" + this.browserUrl + ", costTime=" + this.costTime + ", createTime=" + this.createTime + ", investInfo=" + this.investInfo + ", investType=" + this.investType + ", investmentId=" + this.investmentId + ", investmentName=" + this.investmentName + ", middleLogoList=" + this.middleLogoList + ", network=" + this.network + ", networkName=" + this.networkName + ", nickname=" + this.nickname + ", orderId=" + this.orderId + ", orderStatus=" + this.orderStatus + ", orderType=" + this.orderType + ", orderVoStatus=" + this.orderVoStatus + ", platformId=" + this.platformId + ", platformLogo=" + this.platformLogo + ", platformName=" + this.platformName + ", sourcePlatformName=" + this.sourcePlatformName + ", tokenInfo=" + this.tokenInfo + ", topLeftLogoList=" + this.topLeftLogoList + ", topRightLogoList=" + this.topRightLogoList + ", totalValue=" + this.totalValue + ", txHash=" + this.txHash + ", txId=" + this.txId + ", underlyingToken=" + this.underlyingToken + ", updateTime=" + this.updateTime + ", chainId=" + this.chainId + ", uopHash=" + this.uopHash + ", poolId=" + this.poolId + ", investmentClassify=" + this.investmentClassify + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<InvestLogoBaseVo> list = this.bottomRightLogoList;
        parcel.writeInt(list.size());
        Iterator<InvestLogoBaseVo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.browserUrl);
        parcel.writeString(this.costTime);
        parcel.writeLong(this.createTime);
        List<InvestTokenWithAmount> list2 = this.investInfo;
        parcel.writeInt(list2.size());
        Iterator<InvestTokenWithAmount> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.investType);
        parcel.writeLong(this.investmentId);
        parcel.writeString(this.investmentName);
        List<InvestLogoBaseVo> list3 = this.middleLogoList;
        parcel.writeInt(list3.size());
        Iterator<InvestLogoBaseVo> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.network);
        parcel.writeString(this.networkName);
        parcel.writeString(this.nickname);
        parcel.writeString(this.orderId);
        parcel.writeInt(this.orderStatus);
        parcel.writeInt(this.orderType);
        parcel.writeInt(this.orderVoStatus);
        parcel.writeInt(this.platformId);
        parcel.writeString(this.platformLogo);
        parcel.writeString(this.platformName);
        parcel.writeString(this.sourcePlatformName);
        List<InvestSimpleToken> list4 = this.tokenInfo;
        parcel.writeInt(list4.size());
        Iterator<InvestSimpleToken> it4 = list4.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        List<InvestLogoBaseVo> list5 = this.topLeftLogoList;
        parcel.writeInt(list5.size());
        Iterator<InvestLogoBaseVo> it5 = list5.iterator();
        while (it5.hasNext()) {
            it5.next().writeToParcel(parcel, i);
        }
        List<InvestLogoBaseVo> list6 = this.topRightLogoList;
        parcel.writeInt(list6.size());
        Iterator<InvestLogoBaseVo> it6 = list6.iterator();
        while (it6.hasNext()) {
            it6.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.totalValue);
        parcel.writeString(this.txHash);
        parcel.writeString(this.txId);
        List<UnderlyingToken> list7 = this.underlyingToken;
        parcel.writeInt(list7.size());
        Iterator<UnderlyingToken> it7 = list7.iterator();
        while (it7.hasNext()) {
            it7.next().writeToParcel(parcel, i);
        }
        parcel.writeLong(this.updateTime);
        parcel.writeLong(this.chainId);
        parcel.writeString(this.uopHash);
        parcel.writeString(this.poolId);
        parcel.writeString(this.investmentClassify);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestOrderBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestOrderBean> serializer() {
            return InvestOrderBean$$serializer.INSTANCE;
        }
    }

    static {
        InvestLogoBaseVo$$serializer investLogoBaseVo$$serializer = InvestLogoBaseVo$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(investLogoBaseVo$$serializer), null, null, null, new ArrayListSerializer(InvestTokenWithAmount$$serializer.INSTANCE), null, null, null, new ArrayListSerializer(investLogoBaseVo$$serializer), null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(InvestSimpleToken$$serializer.INSTANCE), new ArrayListSerializer(investLogoBaseVo$$serializer), new ArrayListSerializer(investLogoBaseVo$$serializer), null, null, null, new ArrayListSerializer(UnderlyingToken$$serializer.INSTANCE), null, null, null, null, null};
    }

    public /* synthetic */ InvestOrderBean(int i, int i2, List list, String str, String str2, long j, List list2, int i3, long j2, String str3, List list3, String str4, String str5, String str6, String str7, int i4, int i5, int i6, int i7, String str8, String str9, String str10, List list4, List list5, List list6, String str11, String str12, String str13, List list7, long j3, long j4, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        this.bottomRightLogoList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.browserUrl = "";
        } else {
            this.browserUrl = str;
        }
        if ((i & 4) == 0) {
            this.costTime = "";
        } else {
            this.costTime = str2;
        }
        if ((i & 8) == 0) {
            this.createTime = 0L;
        } else {
            this.createTime = j;
        }
        this.investInfo = (i & 16) == 0 ? yDY.AhwBna() : list2;
        if ((i & 32) == 0) {
            this.investType = 0;
        } else {
            this.investType = i3;
        }
        if ((i & 64) == 0) {
            this.investmentId = 0L;
        } else {
            this.investmentId = j2;
        }
        if ((i & 128) == 0) {
            this.investmentName = "";
        } else {
            this.investmentName = str3;
        }
        this.middleLogoList = (i & 256) == 0 ? yDY.AhwBna() : list3;
        if ((i & 512) == 0) {
            this.network = "";
        } else {
            this.network = str4;
        }
        if ((i & 1024) == 0) {
            this.networkName = "";
        } else {
            this.networkName = str5;
        }
        if ((i & 2048) == 0) {
            this.nickname = "";
        } else {
            this.nickname = str6;
        }
        if ((i & 4096) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str7;
        }
        if ((i & 8192) == 0) {
            this.orderStatus = 0;
        } else {
            this.orderStatus = i4;
        }
        if ((i & 16384) == 0) {
            this.orderType = 0;
        } else {
            this.orderType = i5;
        }
        if ((32768 & i) == 0) {
            this.orderVoStatus = 0;
        } else {
            this.orderVoStatus = i6;
        }
        this.platformId = (65536 & i) != 0 ? i7 : 0;
        if ((131072 & i) == 0) {
            this.platformLogo = "";
        } else {
            this.platformLogo = str8;
        }
        if ((262144 & i) == 0) {
            this.platformName = "";
        } else {
            this.platformName = str9;
        }
        if ((524288 & i) == 0) {
            this.sourcePlatformName = "";
        } else {
            this.sourcePlatformName = str10;
        }
        this.tokenInfo = (1048576 & i) == 0 ? yDY.AhwBna() : list4;
        this.topLeftLogoList = (2097152 & i) == 0 ? yDY.AhwBna() : list5;
        this.topRightLogoList = (4194304 & i) == 0 ? yDY.AhwBna() : list6;
        if ((8388608 & i) == 0) {
            this.totalValue = "";
        } else {
            this.totalValue = str11;
        }
        if ((16777216 & i) == 0) {
            this.txHash = "";
        } else {
            this.txHash = str12;
        }
        if ((33554432 & i) == 0) {
            this.txId = "";
        } else {
            this.txId = str13;
        }
        this.underlyingToken = (67108864 & i) == 0 ? yDY.AhwBna() : list7;
        if ((134217728 & i) == 0) {
            this.updateTime = 0L;
        } else {
            this.updateTime = j3;
        }
        this.chainId = (268435456 & i) != 0 ? j4 : 0L;
        if ((536870912 & i) == 0) {
            this.uopHash = null;
        } else {
            this.uopHash = str14;
        }
        if ((1073741824 & i) == 0) {
            this.poolId = null;
        } else {
            this.poolId = str15;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.investmentClassify = "";
        } else {
            this.investmentClassify = str16;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [895=8] */
    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestOrderBean investOrderBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(investOrderBean.bottomRightLogoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], investOrderBean.bottomRightLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investOrderBean.browserUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investOrderBean.browserUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investOrderBean.costTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investOrderBean.costTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investOrderBean.createTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, investOrderBean.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(investOrderBean.investInfo, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], investOrderBean.investInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investOrderBean.investType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, investOrderBean.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investOrderBean.investmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 6, investOrderBean.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) investOrderBean.investmentName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, investOrderBean.investmentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(investOrderBean.middleLogoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], investOrderBean.middleLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) investOrderBean.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, investOrderBean.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) investOrderBean.networkName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, investOrderBean.networkName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) investOrderBean.nickname, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, investOrderBean.nickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) investOrderBean.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, investOrderBean.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || investOrderBean.orderStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 13, investOrderBean.orderStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || investOrderBean.orderType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 14, investOrderBean.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || investOrderBean.orderVoStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 15, investOrderBean.orderVoStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || investOrderBean.platformId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 16, investOrderBean.platformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) investOrderBean.platformLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, investOrderBean.platformLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) investOrderBean.platformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, investOrderBean.platformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) investOrderBean.sourcePlatformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, investOrderBean.sourcePlatformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd(investOrderBean.tokenInfo, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 20, kSerializerArr[20], investOrderBean.tokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd(investOrderBean.topLeftLogoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 21, kSerializerArr[21], investOrderBean.topLeftLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd(investOrderBean.topRightLogoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 22, kSerializerArr[22], investOrderBean.topRightLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) investOrderBean.totalValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, investOrderBean.totalValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) investOrderBean.txHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, investOrderBean.txHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) investOrderBean.txId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, investOrderBean.txId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd(investOrderBean.underlyingToken, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 26, kSerializerArr[26], investOrderBean.underlyingToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || investOrderBean.updateTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 27, investOrderBean.updateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || investOrderBean.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 28, investOrderBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || investOrderBean.uopHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, investOrderBean.uopHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || investOrderBean.poolId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, investOrderBean.poolId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) && Intrinsics.EZpvd((Object) investOrderBean.investmentClassify, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 31, investOrderBean.investmentClassify);
    }

    public InvestOrderBean(@NotNull List<InvestLogoBaseVo> list, @NotNull String str, @NotNull String str2, long j, @NotNull List<InvestTokenWithAmount> list2, int i, long j2, @NotNull String str3, @NotNull List<InvestLogoBaseVo> list3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i2, int i3, int i4, int i5, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull List<InvestSimpleToken> list4, @NotNull List<InvestLogoBaseVo> list5, @NotNull List<InvestLogoBaseVo> list6, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull List<UnderlyingToken> list7, long j3, long j4, String str14, String str15, @NotNull String str16) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(str16, "");
        this.bottomRightLogoList = list;
        this.browserUrl = str;
        this.costTime = str2;
        this.createTime = j;
        this.investInfo = list2;
        this.investType = i;
        this.investmentId = j2;
        this.investmentName = str3;
        this.middleLogoList = list3;
        this.network = str4;
        this.networkName = str5;
        this.nickname = str6;
        this.orderId = str7;
        this.orderStatus = i2;
        this.orderType = i3;
        this.orderVoStatus = i4;
        this.platformId = i5;
        this.platformLogo = str8;
        this.platformName = str9;
        this.sourcePlatformName = str10;
        this.tokenInfo = list4;
        this.topLeftLogoList = list5;
        this.topRightLogoList = list6;
        this.totalValue = str11;
        this.txHash = str12;
        this.txId = str13;
        this.underlyingToken = list7;
        this.updateTime = j3;
        this.chainId = j4;
        this.uopHash = str14;
        this.poolId = str15;
        this.investmentClassify = str16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0194: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r74v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:899)) : (r38v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r74v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r74v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001f: ARITH (r74v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r41v0 long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0028: ARITH (r74v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:903)) : (r43v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0033: ARITH (r74v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r44v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x003b: ARITH (r74v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r45v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r74v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004c: ARITH (r74v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0050: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:907)) : (r48v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r74v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005f: ARITH (r74v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r74v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:0x007a: TERNARY null = ((wrap:int:0x0071: ARITH (r74v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:int:0x0084: TERNARY null = ((wrap:int:0x007c: ARITH (r74v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r53v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0086: ARITH (r74v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r54v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0091: ARITH (r74v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r55v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x009c: ARITH (r74v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r56v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a7: ARITH (r74v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b2: ARITH (r74v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bd: ARITH (r74v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00c8: ARITH (r74v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00cc: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:920)) : (r60v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r74v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00d9: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:921)) : (r61v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00e2: ARITH (r74v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00e6: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:922)) : (r62v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ef: ARITH (r74v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fa: ARITH (r74v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0105: ARITH (r74v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0110: ARITH (r74v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0114: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:926)) : (r66v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x011d: ARITH (r74v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r67v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0128: ARITH (r74v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r69v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0133: ARITH (r74v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0140: ARITH (r74v0 int) & (1073741824 int) A[WRAPPED]) == (0 int)) ? (r72v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0149: ARITH (r74v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo>, java.lang.String, java.lang.String, long, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, int, long, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.InvestSimpleToken>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo>, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.UnderlyingToken>, long, long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:898) call: com.okinc.business.invest_biz.data.bean.InvestOrderBean.<init>(java.util.List, java.lang.String, java.lang.String, long, java.util.List, int, long, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.util.List, long, long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestOrderBean(List list, String str, String str2, long j, List list2, int i, long j2, String str3, List list3, String str4, String str5, String str6, String str7, int i2, int i3, int i4, int i5, String str8, String str9, String str10, List list4, List list5, List list6, String str11, String str12, String str13, List list7, long j3, long j4, String str14, String str15, String str16, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? yDY.AhwBna() : list, (i6 & 2) != 0 ? "" : str, (i6 & 4) != 0 ? "" : str2, (i6 & 8) != 0 ? 0L : j, (i6 & 16) != 0 ? yDY.AhwBna() : list2, (i6 & 32) != 0 ? 0 : i, (i6 & 64) != 0 ? 0L : j2, (i6 & 128) != 0 ? "" : str3, (i6 & 256) != 0 ? yDY.AhwBna() : list3, (i6 & 512) != 0 ? "" : str4, (i6 & 1024) != 0 ? "" : str5, (i6 & 2048) != 0 ? "" : str6, (i6 & 4096) != 0 ? "" : str7, (i6 & 8192) != 0 ? 0 : i2, (i6 & 16384) != 0 ? 0 : i3, (i6 & 32768) != 0 ? 0 : i4, (i6 & 65536) != 0 ? 0 : i5, (i6 & 131072) != 0 ? "" : str8, (i6 & 262144) != 0 ? "" : str9, (i6 & 524288) != 0 ? "" : str10, (i6 & 1048576) != 0 ? yDY.AhwBna() : list4, (i6 & 2097152) != 0 ? yDY.AhwBna() : list5, (i6 & 4194304) != 0 ? yDY.AhwBna() : list6, (i6 & 8388608) != 0 ? "" : str11, (i6 & 16777216) != 0 ? "" : str12, (i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str13, (i6 & 67108864) != 0 ? yDY.AhwBna() : list7, (i6 & 134217728) != 0 ? 0L : j3, (i6 & 268435456) != 0 ? 0L : j4, (i6 & 536870912) != 0 ? null : str14, (i6 & 1073741824) == 0 ? str15 : null, (i6 & Integer.MIN_VALUE) != 0 ? "" : str16);
    }
}
