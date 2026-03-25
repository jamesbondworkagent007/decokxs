package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.okinc.business.dexlogic.MemeChainType;
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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class MemeModeCommonDexInfo implements Parcelable {
    private final String code;
    private final boolean enableJito;
    private final String fromNativeTokenSymbol;
    private final DexMultiTokenInfoBean fromToken;
    private final String fromTokenAmount;
    private final String fromTokenPrice;
    private final String isEnableMev;
    private final String isSupportDappTrade;
    private final String memeChainType;
    private final List<MevInfoBean> mevList;
    private final String mevUnstableShowLevel;
    private final String nativeTokenPrice;
    private final String nativeTokenUnitPriceUsd;
    private final String needApprove;
    private final NonMevPriorityFeeInfo nonMevPriorityFeeInfo;
    private final String slippage;
    private final boolean supportEip1559;
    private final String teeSignMarketRelTs;
    private final String teeSignTpslRelTs;
    private final String toNativeTokenSymbol;
    private final DexMultiTokenInfoBean toToken;
    private final String tokenTax;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MemeModeCommonDexInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(MevInfoBean$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<MemeModeCommonDexInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeModeCommonDexInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Parcelable.Creator<DexMultiTokenInfoBean> creator = DexMultiTokenInfoBean.CREATOR;
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCreateFromParcel = creator.createFromParcel(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
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
            return new MemeModeCommonDexInfo(string, dexMultiTokenInfoBeanCreateFromParcel, string2, string3, string4, z, string5, string6, dexMultiTokenInfoBeanCreateFromParcel2, string7, string8, arrayList, NonMevPriorityFeeInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeModeCommonDexInfo[] newArray(int i) {
            return new MemeModeCommonDexInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeModeCommonDexInfo() {
        this((String) null, (DexMultiTokenInfoBean) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (DexMultiTokenInfoBean) null, (String) null, (String) null, (List) null, (NonMevPriorityFeeInfo) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4194303, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fromNativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenTax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.isSupportDappTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MevInfoBean> component12() {
        return this.mevList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NonMevPriorityFeeInfo component13() {
        return this.nonMevPriorityFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.nativeTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.isEnableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.mevUnstableShowLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.nativeTokenUnitPriceUsd;
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
        return this.needApprove;
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
    public final boolean component6() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.toNativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.memeChainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component9() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeModeCommonDexInfo copy(@NotNull String str, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, @NotNull String str6, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull String str7, @NotNull String str8, @NotNull List<MevInfoBean> list, @NotNull NonMevPriorityFeeInfo nonMevPriorityFeeInfo, @NotNull String str9, boolean z2, @NotNull String str10, @NotNull String str11, @NotNull String str12, String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        Intrinsics.checkNotNullParameter(nonMevPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        return new MemeModeCommonDexInfo(str, dexMultiTokenInfoBean, str2, str3, str4, z, str5, str6, dexMultiTokenInfoBean2, str7, str8, list, nonMevPriorityFeeInfo, str9, z2, str10, str11, str12, str13, str14, str15, str16);
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
        if (!(obj instanceof MemeModeCommonDexInfo)) {
            return false;
        }
        MemeModeCommonDexInfo memeModeCommonDexInfo = (MemeModeCommonDexInfo) obj;
        return Intrinsics.EZpvd((Object) this.fromNativeTokenSymbol, (Object) memeModeCommonDexInfo.fromNativeTokenSymbol) && Intrinsics.EZpvd(this.fromToken, memeModeCommonDexInfo.fromToken) && Intrinsics.EZpvd((Object) this.fromTokenAmount, (Object) memeModeCommonDexInfo.fromTokenAmount) && Intrinsics.EZpvd((Object) this.fromTokenPrice, (Object) memeModeCommonDexInfo.fromTokenPrice) && Intrinsics.EZpvd((Object) this.slippage, (Object) memeModeCommonDexInfo.slippage) && this.supportEip1559 == memeModeCommonDexInfo.supportEip1559 && Intrinsics.EZpvd((Object) this.toNativeTokenSymbol, (Object) memeModeCommonDexInfo.toNativeTokenSymbol) && Intrinsics.EZpvd((Object) this.memeChainType, (Object) memeModeCommonDexInfo.memeChainType) && Intrinsics.EZpvd(this.toToken, memeModeCommonDexInfo.toToken) && Intrinsics.EZpvd((Object) this.tokenTax, (Object) memeModeCommonDexInfo.tokenTax) && Intrinsics.EZpvd((Object) this.isSupportDappTrade, (Object) memeModeCommonDexInfo.isSupportDappTrade) && Intrinsics.EZpvd(this.mevList, memeModeCommonDexInfo.mevList) && Intrinsics.EZpvd(this.nonMevPriorityFeeInfo, memeModeCommonDexInfo.nonMevPriorityFeeInfo) && Intrinsics.EZpvd((Object) this.nativeTokenPrice, (Object) memeModeCommonDexInfo.nativeTokenPrice) && this.enableJito == memeModeCommonDexInfo.enableJito && Intrinsics.EZpvd((Object) this.isEnableMev, (Object) memeModeCommonDexInfo.isEnableMev) && Intrinsics.EZpvd((Object) this.mevUnstableShowLevel, (Object) memeModeCommonDexInfo.mevUnstableShowLevel) && Intrinsics.EZpvd((Object) this.nativeTokenUnitPriceUsd, (Object) memeModeCommonDexInfo.nativeTokenUnitPriceUsd) && Intrinsics.EZpvd((Object) this.code, (Object) memeModeCommonDexInfo.code) && Intrinsics.EZpvd((Object) this.needApprove, (Object) memeModeCommonDexInfo.needApprove) && Intrinsics.EZpvd((Object) this.teeSignMarketRelTs, (Object) memeModeCommonDexInfo.teeSignMarketRelTs) && Intrinsics.EZpvd((Object) this.teeSignTpslRelTs, (Object) memeModeCommonDexInfo.teeSignTpslRelTs);
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
    public final String getMemeChainType() {
        return this.memeChainType;
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
    public final String getNativeTokenPrice() {
        return this.nativeTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenUnitPriceUsd() {
        return this.nativeTokenUnitPriceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNeedApprove() {
        return this.needApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NonMevPriorityFeeInfo getNonMevPriorityFeeInfo() {
        return this.nonMevPriorityFeeInfo;
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
        int iHashCode6 = Boolean.hashCode(this.supportEip1559);
        int iHashCode7 = this.toNativeTokenSymbol.hashCode();
        int iHashCode8 = this.memeChainType.hashCode();
        int iHashCode9 = this.toToken.hashCode();
        int iHashCode10 = this.tokenTax.hashCode();
        int iHashCode11 = this.isSupportDappTrade.hashCode();
        int iHashCode12 = this.mevList.hashCode();
        int iHashCode13 = this.nonMevPriorityFeeInfo.hashCode();
        int iHashCode14 = this.nativeTokenPrice.hashCode();
        int iHashCode15 = Boolean.hashCode(this.enableJito);
        int iHashCode16 = this.isEnableMev.hashCode();
        int iHashCode17 = this.mevUnstableShowLevel.hashCode();
        int iHashCode18 = this.nativeTokenUnitPriceUsd.hashCode();
        String str = this.code;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.needApprove.hashCode()) * 31) + this.teeSignMarketRelTs.hashCode()) * 31) + this.teeSignTpslRelTs.hashCode();
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
        return "MemeModeCommonDexInfo(fromNativeTokenSymbol=" + this.fromNativeTokenSymbol + ", fromToken=" + this.fromToken + ", fromTokenAmount=" + this.fromTokenAmount + ", fromTokenPrice=" + this.fromTokenPrice + ", slippage=" + this.slippage + ", supportEip1559=" + this.supportEip1559 + ", toNativeTokenSymbol=" + this.toNativeTokenSymbol + ", memeChainType=" + this.memeChainType + ", toToken=" + this.toToken + ", tokenTax=" + this.tokenTax + ", isSupportDappTrade=" + this.isSupportDappTrade + ", mevList=" + this.mevList + ", nonMevPriorityFeeInfo=" + this.nonMevPriorityFeeInfo + ", nativeTokenPrice=" + this.nativeTokenPrice + ", enableJito=" + this.enableJito + ", isEnableMev=" + this.isEnableMev + ", mevUnstableShowLevel=" + this.mevUnstableShowLevel + ", nativeTokenUnitPriceUsd=" + this.nativeTokenUnitPriceUsd + ", code=" + this.code + ", needApprove=" + this.needApprove + ", teeSignMarketRelTs=" + this.teeSignMarketRelTs + ", teeSignTpslRelTs=" + this.teeSignTpslRelTs + ")";
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
        parcel.writeInt(this.supportEip1559 ? 1 : 0);
        parcel.writeString(this.toNativeTokenSymbol);
        parcel.writeString(this.memeChainType);
        this.toToken.writeToParcel(parcel, i);
        parcel.writeString(this.tokenTax);
        parcel.writeString(this.isSupportDappTrade);
        List<MevInfoBean> list = this.mevList;
        parcel.writeInt(list.size());
        Iterator<MevInfoBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        this.nonMevPriorityFeeInfo.writeToParcel(parcel, i);
        parcel.writeString(this.nativeTokenPrice);
        parcel.writeInt(this.enableJito ? 1 : 0);
        parcel.writeString(this.isEnableMev);
        parcel.writeString(this.mevUnstableShowLevel);
        parcel.writeString(this.nativeTokenUnitPriceUsd);
        parcel.writeString(this.code);
        parcel.writeString(this.needApprove);
        parcel.writeString(this.teeSignMarketRelTs);
        parcel.writeString(this.teeSignTpslRelTs);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.MemeModeCommonDexInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MemeModeCommonDexInfo> serializer() {
            return MemeModeCommonDexInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MemeModeCommonDexInfo(int i, String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, String str2, String str3, String str4, boolean z, String str5, String str6, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str7, String str8, List list, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, String str9, boolean z2, String str10, String str11, String str12, String str13, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
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
        this.supportEip1559 = (i & 32) == 0 ? false : z;
        if ((i & 64) == 0) {
            this.toNativeTokenSymbol = "";
        } else {
            this.toNativeTokenSymbol = str5;
        }
        if ((i & 128) == 0) {
            this.memeChainType = "";
        } else {
            this.memeChainType = str6;
        }
        this.toToken = (i & 256) == 0 ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : dexMultiTokenInfoBean2;
        if ((i & 512) == 0) {
            this.tokenTax = "";
        } else {
            this.tokenTax = str7;
        }
        if ((i & 1024) == 0) {
            this.isSupportDappTrade = "";
        } else {
            this.isSupportDappTrade = str8;
        }
        this.mevList = (i & 2048) == 0 ? new ArrayList() : list;
        this.nonMevPriorityFeeInfo = (i & 4096) == 0 ? new NonMevPriorityFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 262143, (DefaultConstructorMarker) null) : nonMevPriorityFeeInfo;
        if ((i & 8192) == 0) {
            this.nativeTokenPrice = "";
        } else {
            this.nativeTokenPrice = str9;
        }
        this.enableJito = (i & 16384) == 0 ? true : z2;
        if ((32768 & i) == 0) {
            this.isEnableMev = "";
        } else {
            this.isEnableMev = str10;
        }
        this.mevUnstableShowLevel = (65536 & i) == 0 ? MevUnstableShowLevelType.NORMAL.getType() : str11;
        if ((131072 & i) == 0) {
            this.nativeTokenUnitPriceUsd = "";
        } else {
            this.nativeTokenUnitPriceUsd = str12;
        }
        this.code = (262144 & i) == 0 ? null : str13;
        this.needApprove = (524288 & i) == 0 ? "0" : str14;
        if ((1048576 & i) == 0) {
            this.teeSignMarketRelTs = "";
        } else {
            this.teeSignMarketRelTs = str15;
        }
        if ((i & 2097152) == 0) {
            this.teeSignTpslRelTs = "";
        } else {
            this.teeSignTpslRelTs = str16;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [79=6] */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MemeModeCommonDexInfo memeModeCommonDexInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) memeModeCommonDexInfo.fromNativeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, memeModeCommonDexInfo.fromNativeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(memeModeCommonDexInfo.fromToken, new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, memeModeCommonDexInfo.fromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) memeModeCommonDexInfo.fromTokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, memeModeCommonDexInfo.fromTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) memeModeCommonDexInfo.fromTokenPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, memeModeCommonDexInfo.fromTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) memeModeCommonDexInfo.slippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, memeModeCommonDexInfo.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || memeModeCommonDexInfo.supportEip1559) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, memeModeCommonDexInfo.supportEip1559);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) memeModeCommonDexInfo.toNativeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, memeModeCommonDexInfo.toNativeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) memeModeCommonDexInfo.memeChainType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, memeModeCommonDexInfo.memeChainType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(memeModeCommonDexInfo.toToken, new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, DexMultiTokenInfoBean$$serializer.INSTANCE, memeModeCommonDexInfo.toToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) memeModeCommonDexInfo.tokenTax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, memeModeCommonDexInfo.tokenTax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) memeModeCommonDexInfo.isSupportDappTrade, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, memeModeCommonDexInfo.isSupportDappTrade);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(memeModeCommonDexInfo.mevList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], memeModeCommonDexInfo.mevList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(memeModeCommonDexInfo.nonMevPriorityFeeInfo, new NonMevPriorityFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 262143, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, NonMevPriorityFeeInfo$$serializer.INSTANCE, memeModeCommonDexInfo.nonMevPriorityFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) memeModeCommonDexInfo.nativeTokenPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, memeModeCommonDexInfo.nativeTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !memeModeCommonDexInfo.enableJito) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 14, memeModeCommonDexInfo.enableJito);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) memeModeCommonDexInfo.isEnableMev, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, memeModeCommonDexInfo.isEnableMev);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) memeModeCommonDexInfo.mevUnstableShowLevel, (Object) MevUnstableShowLevelType.NORMAL.getType())) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, memeModeCommonDexInfo.mevUnstableShowLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) memeModeCommonDexInfo.nativeTokenUnitPriceUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, memeModeCommonDexInfo.nativeTokenUnitPriceUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || memeModeCommonDexInfo.code != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, memeModeCommonDexInfo.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) memeModeCommonDexInfo.needApprove, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, memeModeCommonDexInfo.needApprove);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) memeModeCommonDexInfo.teeSignMarketRelTs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, memeModeCommonDexInfo.teeSignMarketRelTs);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) && Intrinsics.EZpvd((Object) memeModeCommonDexInfo.teeSignTpslRelTs, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 21, memeModeCommonDexInfo.teeSignTpslRelTs);
    }

    public MemeModeCommonDexInfo(@NotNull String str, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, @NotNull String str6, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull String str7, @NotNull String str8, @NotNull List<MevInfoBean> list, @NotNull NonMevPriorityFeeInfo nonMevPriorityFeeInfo, @NotNull String str9, boolean z2, @NotNull String str10, @NotNull String str11, @NotNull String str12, String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        Intrinsics.checkNotNullParameter(nonMevPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        this.fromNativeTokenSymbol = str;
        this.fromToken = dexMultiTokenInfoBean;
        this.fromTokenAmount = str2;
        this.fromTokenPrice = str3;
        this.slippage = str4;
        this.supportEip1559 = z;
        this.toNativeTokenSymbol = str5;
        this.memeChainType = str6;
        this.toToken = dexMultiTokenInfoBean2;
        this.tokenTax = str7;
        this.isSupportDappTrade = str8;
        this.mevList = list;
        this.nonMevPriorityFeeInfo = nonMevPriorityFeeInfo;
        this.nativeTokenPrice = str9;
        this.enableJito = z2;
        this.isEnableMev = str10;
        this.mevUnstableShowLevel = str11;
        this.nativeTokenUnitPriceUsd = str12;
        this.code = str13;
        this.needApprove = str14;
        this.teeSignMarketRelTs = str15;
        this.teeSignTpslRelTs = str16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0225: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r98v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.TokenInfoForApp, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:84) call: com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.TokenInfoForApp, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r77v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008b: ARITH (r98v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r98v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009b: ARITH (r98v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r80v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r98v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r81v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ab: ARITH (r98v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r98v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r83v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r98v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x013b: CONSTRUCTOR 
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.TokenInfoForApp, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:91) call: com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.TokenInfoForApp, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r84v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0141: ARITH (r98v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r85v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0149: ARITH (r98v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r86v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0151: ARITH (r98v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0157: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:94) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r87v0 java.util.List))
  (wrap:com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo:?: TERNARY null = ((wrap:int:0x015d: ARITH (r98v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x018d: CONSTRUCTOR 
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:95) call: com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r88v0 com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0193: ARITH (r98v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x019d: ARITH (r98v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? true : (r90v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01a8: ARITH (r98v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r91v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01b3: ARITH (r98v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x01b9: INVOKE 
  (wrap:com.okinc.business.dexlogic.bean.MevUnstableShowLevelType:0x01b7: SGET  A[WRAPPED] (LINE:99) com.okinc.business.dexlogic.bean.MevUnstableShowLevelType.NORMAL com.okinc.business.dexlogic.bean.MevUnstableShowLevelType)
 VIRTUAL call: com.okinc.business.dexlogic.bean.MevUnstableShowLevelType.getType():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:99)) : (r92v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01c2: ARITH (r98v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r93v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01cd: ARITH (r98v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r94v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01d8: ARITH (r98v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("0") : (r95v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e3: ARITH (r98v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r96v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01ee: ARITH (r98v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r97v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.util.List<com.okinc.business.dexlogic.bean.MevInfoBean>, com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:82) call: com.okinc.business.dexlogic.bean.MemeModeCommonDexInfo.<init>(java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MemeModeCommonDexInfo(String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, String str2, String str3, String str4, boolean z, String str5, String str6, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str7, String str8, List list, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, String str9, boolean z2, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : dexMultiTokenInfoBean, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? false : z, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : dexMultiTokenInfoBean2, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? new ArrayList() : list, (i & 4096) != 0 ? new NonMevPriorityFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 262143, (DefaultConstructorMarker) null) : nonMevPriorityFeeInfo, (i & 8192) != 0 ? "" : str9, (i & 16384) != 0 ? true : z2, (i & 32768) != 0 ? "" : str10, (i & 65536) != 0 ? MevUnstableShowLevelType.NORMAL.getType() : str11, (i & 131072) != 0 ? "" : str12, (i & 262144) != 0 ? null : str13, (i & 524288) != 0 ? "0" : str14, (i & 1048576) != 0 ? "" : str15, (i & 2097152) != 0 ? "" : str16);
    }

    public final boolean isMevUnstableShowLevelTypeWarning() {
        return Intrinsics.EZpvd((Object) this.mevUnstableShowLevel, (Object) MevUnstableShowLevelType.WARNING.getType());
    }

    public static /* synthetic */ boolean isEnableMev$default(MemeModeCommonDexInfo memeModeCommonDexInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return memeModeCommonDexInfo.isEnableMev(str);
    }

    public final boolean isEnableMev(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((Object) this.memeChainType, (Object) MemeChainType.MemeChainTypeSol.getValue()) ? this.enableJito : (Intrinsics.EZpvd((Object) this.isEnableMev, (Object) "1") && Intrinsics.EZpvd((Object) str, (Object) PresetRouteType.RouteTypeAuto.getValue())) || Intrinsics.EZpvd((Object) str, (Object) PresetRouteType.RouteTypeMev.getValue());
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
}
