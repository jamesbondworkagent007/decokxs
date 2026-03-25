package com.okinc.business.trade.features.home.ui.cefi.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.google.gson.annotations.SerializedName;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean$$serializer;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.MevInfoBean$$serializer;
import com.okinc.business.dexlogic.bean.MevUnstableShowLevelType;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo$$serializer;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedChainType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56390yDp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class AdvancedCommonDexInfo implements Parcelable {
    private final String cefiChainType;
    private final String code;
    private final boolean enableJito;
    private final String estReserveNativeAmt;
    private final String fromNativeTokenSymbol;

    @SerializedName("fromToken")
    private final DexMultiTokenInfoBean fromToken;
    private final String fromTokenAmount;
    private final String fromTokenPrice;
    private final String isEnableMev;
    private final String isSupportDappTrade;
    private final List<MevInfoBean> mevList;
    private final String mevUnstableShowLevel;
    private final String minSellAmount;
    private final String nativeTokenUnitPriceUsd;
    private final NonMevPriorityFeeInfo nonMevPriorityFeeInfo;
    private final boolean offlineMev;
    private final String slippage;
    private final boolean supportEip1559;
    private final String teeSignMarketRelTs;
    private final String teeSignTpslRelTs;
    private final String toNativeTokenSymbol;

    @SerializedName("toToken")
    private final DexMultiTokenInfoBean toToken;
    private final String tokenTax;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AdvancedCommonDexInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(MevInfoBean$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<AdvancedCommonDexInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedCommonDexInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Parcelable.Creator<DexMultiTokenInfoBean> creator = DexMultiTokenInfoBean.CREATOR;
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCreateFromParcel = creator.createFromParcel(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCreateFromParcel2 = creator.createFromParcel(parcel);
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(MevInfoBean.CREATOR.createFromParcel(parcel));
            }
            return new AdvancedCommonDexInfo(string, dexMultiTokenInfoBeanCreateFromParcel, string2, string3, string4, string5, string6, dexMultiTokenInfoBeanCreateFromParcel2, string7, string8, arrayList, parcel.readInt() == 0 ? null : NonMevPriorityFeeInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedCommonDexInfo[] newArray(int i) {
            return new AdvancedCommonDexInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedCommonDexInfo() {
        this((String) null, (DexMultiTokenInfoBean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexMultiTokenInfoBean) null, (String) null, (String) null, (List) null, (NonMevPriorityFeeInfo) null, false, false, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, 8388607, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fromNativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.isSupportDappTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MevInfoBean> component11() {
        return this.mevList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NonMevPriorityFeeInfo component12() {
        return this.nonMevPriorityFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.offlineMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.isEnableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.mevUnstableShowLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.nativeTokenUnitPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component2() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.estReserveNativeAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.teeSignMarketRelTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.teeSignTpslRelTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.minSellAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fromTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.toNativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.cefiChainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component8() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenTax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedCommonDexInfo copy(@NotNull String str, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull String str7, @NotNull String str8, @NotNull List<MevInfoBean> list, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z, boolean z2, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z3, String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean2, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        return new AdvancedCommonDexInfo(str, dexMultiTokenInfoBean, str2, str3, str4, str5, str6, dexMultiTokenInfoBean2, str7, str8, list, nonMevPriorityFeeInfo, z, z2, str9, str10, str11, z3, str12, str13, str14, str15, str16);
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
        if (!(obj instanceof AdvancedCommonDexInfo)) {
            return false;
        }
        AdvancedCommonDexInfo advancedCommonDexInfo = (AdvancedCommonDexInfo) obj;
        return Intrinsics.EZpvd((Object) this.fromNativeTokenSymbol, (Object) advancedCommonDexInfo.fromNativeTokenSymbol) && Intrinsics.EZpvd(this.fromToken, advancedCommonDexInfo.fromToken) && Intrinsics.EZpvd((Object) this.fromTokenAmount, (Object) advancedCommonDexInfo.fromTokenAmount) && Intrinsics.EZpvd((Object) this.fromTokenPrice, (Object) advancedCommonDexInfo.fromTokenPrice) && Intrinsics.EZpvd((Object) this.slippage, (Object) advancedCommonDexInfo.slippage) && Intrinsics.EZpvd((Object) this.toNativeTokenSymbol, (Object) advancedCommonDexInfo.toNativeTokenSymbol) && Intrinsics.EZpvd((Object) this.cefiChainType, (Object) advancedCommonDexInfo.cefiChainType) && Intrinsics.EZpvd(this.toToken, advancedCommonDexInfo.toToken) && Intrinsics.EZpvd((Object) this.tokenTax, (Object) advancedCommonDexInfo.tokenTax) && Intrinsics.EZpvd((Object) this.isSupportDappTrade, (Object) advancedCommonDexInfo.isSupportDappTrade) && Intrinsics.EZpvd(this.mevList, advancedCommonDexInfo.mevList) && Intrinsics.EZpvd(this.nonMevPriorityFeeInfo, advancedCommonDexInfo.nonMevPriorityFeeInfo) && this.enableJito == advancedCommonDexInfo.enableJito && this.offlineMev == advancedCommonDexInfo.offlineMev && Intrinsics.EZpvd((Object) this.isEnableMev, (Object) advancedCommonDexInfo.isEnableMev) && Intrinsics.EZpvd((Object) this.mevUnstableShowLevel, (Object) advancedCommonDexInfo.mevUnstableShowLevel) && Intrinsics.EZpvd((Object) this.nativeTokenUnitPriceUsd, (Object) advancedCommonDexInfo.nativeTokenUnitPriceUsd) && this.supportEip1559 == advancedCommonDexInfo.supportEip1559 && Intrinsics.EZpvd((Object) this.code, (Object) advancedCommonDexInfo.code) && Intrinsics.EZpvd((Object) this.estReserveNativeAmt, (Object) advancedCommonDexInfo.estReserveNativeAmt) && Intrinsics.EZpvd((Object) this.teeSignMarketRelTs, (Object) advancedCommonDexInfo.teeSignMarketRelTs) && Intrinsics.EZpvd((Object) this.teeSignTpslRelTs, (Object) advancedCommonDexInfo.teeSignTpslRelTs) && Intrinsics.EZpvd((Object) this.minSellAmount, (Object) advancedCommonDexInfo.minSellAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCefiChainType() {
        return this.cefiChainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableJito() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstReserveNativeAmt() {
        return this.estReserveNativeAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromNativeTokenSymbol() {
        return this.fromNativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAmount() {
        return this.fromTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenPrice() {
        return this.fromTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MevInfoBean> getMevList() {
        return this.mevList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevUnstableShowLevel() {
        return this.mevUnstableShowLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinSellAmount() {
        return this.minSellAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenUnitPriceUsd() {
        return this.nativeTokenUnitPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NonMevPriorityFeeInfo getNonMevPriorityFeeInfo() {
        return this.nonMevPriorityFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOfflineMev() {
        return this.offlineMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportEip1559() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeSignMarketRelTs() {
        return this.teeSignMarketRelTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeSignTpslRelTs() {
        return this.teeSignTpslRelTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToNativeTokenSymbol() {
        return this.toNativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getToToken() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenTax() {
        return this.tokenTax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.fromNativeTokenSymbol.hashCode();
        int iHashCode2 = this.fromToken.hashCode();
        int iHashCode3 = this.fromTokenAmount.hashCode();
        int iHashCode4 = this.fromTokenPrice.hashCode();
        int iHashCode5 = this.slippage.hashCode();
        int iHashCode6 = this.toNativeTokenSymbol.hashCode();
        int iHashCode7 = this.cefiChainType.hashCode();
        int iHashCode8 = this.toToken.hashCode();
        int iHashCode9 = this.tokenTax.hashCode();
        int iHashCode10 = this.isSupportDappTrade.hashCode();
        int iHashCode11 = this.mevList.hashCode();
        NonMevPriorityFeeInfo nonMevPriorityFeeInfo = this.nonMevPriorityFeeInfo;
        int iHashCode12 = nonMevPriorityFeeInfo == null ? 0 : nonMevPriorityFeeInfo.hashCode();
        int iHashCode13 = Boolean.hashCode(this.enableJito);
        int iHashCode14 = Boolean.hashCode(this.offlineMev);
        int iHashCode15 = this.isEnableMev.hashCode();
        int iHashCode16 = this.mevUnstableShowLevel.hashCode();
        int iHashCode17 = this.nativeTokenUnitPriceUsd.hashCode();
        int iHashCode18 = Boolean.hashCode(this.supportEip1559);
        String str = this.code;
        return (((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.estReserveNativeAmt.hashCode()) * 31) + this.teeSignMarketRelTs.hashCode()) * 31) + this.teeSignTpslRelTs.hashCode()) * 31) + this.minSellAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isEnableMev() {
        return this.isEnableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isSupportDappTrade() {
        return this.isSupportDappTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdvancedCommonDexInfo(fromNativeTokenSymbol=" + this.fromNativeTokenSymbol + ", fromToken=" + this.fromToken + ", fromTokenAmount=" + this.fromTokenAmount + ", fromTokenPrice=" + this.fromTokenPrice + ", slippage=" + this.slippage + ", toNativeTokenSymbol=" + this.toNativeTokenSymbol + ", cefiChainType=" + this.cefiChainType + ", toToken=" + this.toToken + ", tokenTax=" + this.tokenTax + ", isSupportDappTrade=" + this.isSupportDappTrade + ", mevList=" + this.mevList + ", nonMevPriorityFeeInfo=" + this.nonMevPriorityFeeInfo + ", enableJito=" + this.enableJito + ", offlineMev=" + this.offlineMev + ", isEnableMev=" + this.isEnableMev + ", mevUnstableShowLevel=" + this.mevUnstableShowLevel + ", nativeTokenUnitPriceUsd=" + this.nativeTokenUnitPriceUsd + ", supportEip1559=" + this.supportEip1559 + ", code=" + this.code + ", estReserveNativeAmt=" + this.estReserveNativeAmt + ", teeSignMarketRelTs=" + this.teeSignMarketRelTs + ", teeSignTpslRelTs=" + this.teeSignTpslRelTs + ", minSellAmount=" + this.minSellAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fromNativeTokenSymbol);
        this.fromToken.writeToParcel(parcel, i);
        parcel.writeString(this.fromTokenAmount);
        parcel.writeString(this.fromTokenPrice);
        parcel.writeString(this.slippage);
        parcel.writeString(this.toNativeTokenSymbol);
        parcel.writeString(this.cefiChainType);
        this.toToken.writeToParcel(parcel, i);
        parcel.writeString(this.tokenTax);
        parcel.writeString(this.isSupportDappTrade);
        List<MevInfoBean> list = this.mevList;
        parcel.writeInt(list.size());
        Iterator<MevInfoBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        NonMevPriorityFeeInfo nonMevPriorityFeeInfo = this.nonMevPriorityFeeInfo;
        if (nonMevPriorityFeeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nonMevPriorityFeeInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.enableJito ? 1 : 0);
        parcel.writeInt(this.offlineMev ? 1 : 0);
        parcel.writeString(this.isEnableMev);
        parcel.writeString(this.mevUnstableShowLevel);
        parcel.writeString(this.nativeTokenUnitPriceUsd);
        parcel.writeInt(this.supportEip1559 ? 1 : 0);
        parcel.writeString(this.code);
        parcel.writeString(this.estReserveNativeAmt);
        parcel.writeString(this.teeSignMarketRelTs);
        parcel.writeString(this.teeSignTpslRelTs);
        parcel.writeString(this.minSellAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedCommonDexInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdvancedCommonDexInfo> serializer() {
            return AdvancedCommonDexInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AdvancedCommonDexInfo(int i, String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, String str2, String str3, String str4, String str5, String str6, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str7, String str8, List list, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z, boolean z2, String str9, String str10, String str11, boolean z3, String str12, String str13, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fromNativeTokenSymbol = "";
        } else {
            this.fromNativeTokenSymbol = str;
        }
        this.fromToken = (i & 2) == 0 ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : dexMultiTokenInfoBean;
        if ((i & 4) == 0) {
            this.fromTokenAmount = "";
        } else {
            this.fromTokenAmount = str2;
        }
        if ((i & 8) == 0) {
            this.fromTokenPrice = "";
        } else {
            this.fromTokenPrice = str3;
        }
        if ((i & 16) == 0) {
            this.slippage = "";
        } else {
            this.slippage = str4;
        }
        if ((i & 32) == 0) {
            this.toNativeTokenSymbol = "";
        } else {
            this.toNativeTokenSymbol = str5;
        }
        if ((i & 64) == 0) {
            this.cefiChainType = "";
        } else {
            this.cefiChainType = str6;
        }
        this.toToken = (i & 128) == 0 ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : dexMultiTokenInfoBean2;
        if ((i & 256) == 0) {
            this.tokenTax = "";
        } else {
            this.tokenTax = str7;
        }
        if ((i & 512) == 0) {
            this.isSupportDappTrade = "";
        } else {
            this.isSupportDappTrade = str8;
        }
        this.mevList = (i & 1024) == 0 ? new ArrayList() : list;
        this.nonMevPriorityFeeInfo = (i & 2048) == 0 ? new NonMevPriorityFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 262143, (DefaultConstructorMarker) null) : nonMevPriorityFeeInfo;
        this.enableJito = (i & 4096) == 0 ? true : z;
        if ((i & 8192) == 0) {
            this.offlineMev = false;
        } else {
            this.offlineMev = z2;
        }
        if ((i & 16384) == 0) {
            this.isEnableMev = "";
        } else {
            this.isEnableMev = str9;
        }
        this.mevUnstableShowLevel = (32768 & i) == 0 ? MevUnstableShowLevelType.NORMAL.getType() : str10;
        if ((65536 & i) == 0) {
            this.nativeTokenUnitPriceUsd = "";
        } else {
            this.nativeTokenUnitPriceUsd = str11;
        }
        if ((131072 & i) == 0) {
            this.supportEip1559 = false;
        } else {
            this.supportEip1559 = z3;
        }
        this.code = (262144 & i) == 0 ? null : str12;
        if ((524288 & i) == 0) {
            this.estReserveNativeAmt = "";
        } else {
            this.estReserveNativeAmt = str13;
        }
        if ((1048576 & i) == 0) {
            this.teeSignMarketRelTs = "";
        } else {
            this.teeSignMarketRelTs = str14;
        }
        if ((2097152 & i) == 0) {
            this.teeSignTpslRelTs = "";
        } else {
            this.teeSignTpslRelTs = str15;
        }
        if ((i & 4194304) == 0) {
            this.minSellAmount = "";
        } else {
            this.minSellAmount = str16;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [190=6] */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(AdvancedCommonDexInfo advancedCommonDexInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) advancedCommonDexInfo.fromNativeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, advancedCommonDexInfo.fromNativeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(advancedCommonDexInfo.fromToken, new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, advancedCommonDexInfo.fromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) advancedCommonDexInfo.fromTokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, advancedCommonDexInfo.fromTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) advancedCommonDexInfo.fromTokenPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, advancedCommonDexInfo.fromTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) advancedCommonDexInfo.slippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, advancedCommonDexInfo.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) advancedCommonDexInfo.toNativeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, advancedCommonDexInfo.toNativeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) advancedCommonDexInfo.cefiChainType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, advancedCommonDexInfo.cefiChainType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(advancedCommonDexInfo.toToken, new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, DexMultiTokenInfoBean$$serializer.INSTANCE, advancedCommonDexInfo.toToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) advancedCommonDexInfo.tokenTax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, advancedCommonDexInfo.tokenTax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) advancedCommonDexInfo.isSupportDappTrade, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, advancedCommonDexInfo.isSupportDappTrade);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(advancedCommonDexInfo.mevList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], advancedCommonDexInfo.mevList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(advancedCommonDexInfo.nonMevPriorityFeeInfo, new NonMevPriorityFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 262143, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, NonMevPriorityFeeInfo$$serializer.INSTANCE, advancedCommonDexInfo.nonMevPriorityFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !advancedCommonDexInfo.enableJito) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, advancedCommonDexInfo.enableJito);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || advancedCommonDexInfo.offlineMev) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, advancedCommonDexInfo.offlineMev);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) advancedCommonDexInfo.isEnableMev, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, advancedCommonDexInfo.isEnableMev);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) advancedCommonDexInfo.mevUnstableShowLevel, (Object) MevUnstableShowLevelType.NORMAL.getType())) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, advancedCommonDexInfo.mevUnstableShowLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) advancedCommonDexInfo.nativeTokenUnitPriceUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, advancedCommonDexInfo.nativeTokenUnitPriceUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || advancedCommonDexInfo.supportEip1559) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 17, advancedCommonDexInfo.supportEip1559);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || advancedCommonDexInfo.code != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, advancedCommonDexInfo.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) advancedCommonDexInfo.estReserveNativeAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, advancedCommonDexInfo.estReserveNativeAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) advancedCommonDexInfo.teeSignMarketRelTs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, advancedCommonDexInfo.teeSignMarketRelTs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) advancedCommonDexInfo.teeSignTpslRelTs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, advancedCommonDexInfo.teeSignTpslRelTs);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) && Intrinsics.EZpvd((Object) advancedCommonDexInfo.minSellAmount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 22, advancedCommonDexInfo.minSellAmount);
    }

    public AdvancedCommonDexInfo(@NotNull String str, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull String str7, @NotNull String str8, @NotNull List<MevInfoBean> list, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z, boolean z2, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z3, String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean2, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        this.fromNativeTokenSymbol = str;
        this.fromToken = dexMultiTokenInfoBean;
        this.fromTokenAmount = str2;
        this.fromTokenPrice = str3;
        this.slippage = str4;
        this.toNativeTokenSymbol = str5;
        this.cefiChainType = str6;
        this.toToken = dexMultiTokenInfoBean2;
        this.tokenTax = str7;
        this.isSupportDappTrade = str8;
        this.mevList = list;
        this.nonMevPriorityFeeInfo = nonMevPriorityFeeInfo;
        this.enableJito = z;
        this.offlineMev = z2;
        this.isEnableMev = str9;
        this.mevUnstableShowLevel = str10;
        this.nativeTokenUnitPriceUsd = str11;
        this.supportEip1559 = z3;
        this.code = str12;
        this.estReserveNativeAmt = str13;
        this.teeSignMarketRelTs = str14;
        this.teeSignTpslRelTs = str15;
        this.minSellAmount = str16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0232: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r98v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r98v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0085: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:double:SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double)
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (0 int)
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:com.okinc.business.dexlogic.bean.TokenInfoForApp:?: CAST (com.okinc.business.dexlogic.bean.TokenInfoForApp) (null com.okinc.business.dexlogic.bean.TokenInfoForApp))
  (-1 int)
  (134217727 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.TokenInfoForApp, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:196) call: com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.TokenInfoForApp, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r76v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008b: ARITH (r98v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r98v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009b: ARITH (r98v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r98v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ab: ARITH (r98v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r81v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r98v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0132: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:double:SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double)
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (0 int)
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:com.okinc.business.dexlogic.bean.TokenInfoForApp:?: CAST (com.okinc.business.dexlogic.bean.TokenInfoForApp) (null com.okinc.business.dexlogic.bean.TokenInfoForApp))
  (-1 int)
  (134217727 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.TokenInfoForApp, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:203) call: com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.TokenInfoForApp, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r82v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0138: ARITH (r98v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r83v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0140: ARITH (r98v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r84v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0148: ARITH (r98v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x014e: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:206) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r85v0 java.util.List))
  (wrap:com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo:?: TERNARY null = ((wrap:int:0x0154: ARITH (r98v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0183: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (262143 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:207) call: com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r86v0 com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0189: ARITH (r98v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? true : (r87v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0191: ARITH (r98v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r88v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x019e: ARITH (r98v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01aa: ARITH (r98v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x01b0: INVOKE 
  (wrap:com.okinc.business.dexlogic.bean.MevUnstableShowLevelType:0x01ae: SGET  A[WRAPPED] (LINE:211) com.okinc.business.dexlogic.bean.MevUnstableShowLevelType.NORMAL com.okinc.business.dexlogic.bean.MevUnstableShowLevelType)
 VIRTUAL call: com.okinc.business.dexlogic.bean.MevUnstableShowLevelType.getType():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:211)) : (r90v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01b9: ARITH (r98v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r91v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x01c4: ARITH (r98v0 int) & (131072 int) A[WRAPPED]) == (0 int)) ? (r92v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01cd: ARITH (r98v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r93v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01d8: ARITH (r98v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r94v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e3: ARITH (r98v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r95v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01ee: ARITH (r98v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r96v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01f9: ARITH (r98v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r97v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.util.List<com.okinc.business.dexlogic.bean.MevInfoBean>, com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:193) call: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedCommonDexInfo.<init>(java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AdvancedCommonDexInfo(String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, String str2, String str3, String str4, String str5, String str6, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str7, String str8, List list, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z, boolean z2, String str9, String str10, String str11, boolean z3, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : dexMultiTokenInfoBean, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : dexMultiTokenInfoBean2, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? new ArrayList() : list, (i & 2048) != 0 ? new NonMevPriorityFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 262143, (DefaultConstructorMarker) null) : nonMevPriorityFeeInfo, (i & 4096) != 0 ? true : z, (i & 8192) != 0 ? false : z2, (i & 16384) != 0 ? "" : str9, (i & 32768) != 0 ? MevUnstableShowLevelType.NORMAL.getType() : str10, (i & 65536) != 0 ? "" : str11, (i & 131072) == 0 ? z3 : false, (i & 262144) != 0 ? null : str12, (i & 524288) != 0 ? "" : str13, (i & 1048576) != 0 ? "" : str14, (i & 2097152) != 0 ? "" : str15, (i & 4194304) != 0 ? "" : str16);
    }

    public final boolean supportDAppTrade() {
        return Intrinsics.EZpvd((Object) this.isSupportDappTrade, (Object) "1");
    }

    public static /* synthetic */ boolean isEnableMev$default(AdvancedCommonDexInfo advancedCommonDexInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return advancedCommonDexInfo.isEnableMev(str);
    }

    public final boolean isEnableMev(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((Object) this.cefiChainType, (Object) AdvancedChainType.SOL.getValue()) ? this.enableJito : !this.offlineMev && Intrinsics.EZpvd((Object) this.isEnableMev, (Object) "1") && isSupportedRoute(str);
    }

    public static /* synthetic */ boolean isSupportedRoute$default(AdvancedCommonDexInfo advancedCommonDexInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return advancedCommonDexInfo.isSupportedRoute(str);
    }

    public final boolean isSupportedRoute(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((Object) str, (Object) PresetRouteType.RouteTypeAuto.getValue()) || Intrinsics.EZpvd((Object) str, (Object) PresetRouteType.RouteTypeMev.getValue());
    }

    public final Pair<Boolean, DexMultiTokenInfoBean> isSafeMoonToken() {
        if (this.fromToken.isSafeMoonCoinToken()) {
            return C56390yDp.OLrzqt(Boolean.TRUE, this.fromToken);
        }
        if (this.toToken.isSafeMoonCoinToken()) {
            return C56390yDp.OLrzqt(Boolean.TRUE, this.toToken);
        }
        return C56390yDp.OLrzqt(Boolean.FALSE, this.fromToken);
    }

    public final boolean isMevUnstableShowLevelTypeError() {
        return Intrinsics.EZpvd((Object) this.mevUnstableShowLevel, (Object) MevUnstableShowLevelType.ERROR.getType());
    }
}
