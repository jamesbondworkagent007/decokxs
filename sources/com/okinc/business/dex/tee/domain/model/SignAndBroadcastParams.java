package com.okinc.business.dex.tee.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.DexRouterList;
import com.okinc.business.dexlogic.bean.DexRouterList$$serializer;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo$$serializer;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.bean.TraceData$$serializer;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class SignAndBroadcastParams implements Parcelable {
    private final String accountId;
    private final String amount;
    private final String chainId;
    private final List<DexRouterList> dexRouterList;
    private final String direction;
    private final Boolean enableJito;
    private final String fromTokenAddress;
    private final String gasPrice;
    private final String gasUsed;
    private final String maxSlippage;
    private final String mevInfo;
    private final String orderSource;
    private final String priorityFee;
    private final String priorityFeeType;
    private final String quoteId;
    private final String routerModeType;
    private final ServiceFeeInfo serviceFeeInfo;
    private final String slippage;
    private final String slippageType;
    private final boolean teeSilentSignEnabled;
    private final String toAmount;
    private final String toTokenAddress;
    private final TpslConfig tpslConfig;
    private final TraceData traceData;
    private final int tradeMode;
    private final String userWalletAddress;
    private final WalletAuthParam walletAuthParam;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignAndBroadcastParams> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(DexRouterList$$serializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<SignAndBroadcastParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignAndBroadcastParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            TpslConfig tpslConfigCreateFromParcel = parcel.readInt() == 0 ? null : TpslConfig.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            WalletAuthParam walletAuthParamCreateFromParcel = parcel.readInt() == 0 ? null : WalletAuthParam.CREATOR.createFromParcel(parcel);
            String string6 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            ServiceFeeInfo serviceFeeInfoCreateFromParcel = parcel.readInt() == 0 ? null : ServiceFeeInfo.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            TraceData traceDataCreateFromParcel = parcel.readInt() != 0 ? TraceData.CREATOR.createFromParcel(parcel) : null;
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
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(DexRouterList.CREATOR.createFromParcel(parcel));
            }
            return new SignAndBroadcastParams(string, string2, string3, string4, tpslConfigCreateFromParcel, string5, walletAuthParamCreateFromParcel, string6, boolValueOf, string7, string8, serviceFeeInfoCreateFromParcel, i, traceDataCreateFromParcel, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, arrayList, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignAndBroadcastParams[] newArray(int i) {
            return new SignAndBroadcastParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.gasUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component12() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TraceData component14() {
        return this.traceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexRouterList> component25() {
        return this.dexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component26() {
        return this.teeSilentSignEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpslConfig component5() {
        return this.tpslConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.orderSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAuthParam component7() {
        return this.walletAuthParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignAndBroadcastParams copy(String str, @NotNull String str2, @NotNull String str3, String str4, TpslConfig tpslConfig, String str5, WalletAuthParam walletAuthParam, String str6, Boolean bool, @NotNull String str7, String str8, ServiceFeeInfo serviceFeeInfo, int i, TraceData traceData, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull List<DexRouterList> list, boolean z, String str19) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SignAndBroadcastParams(str, str2, str3, str4, tpslConfig, str5, walletAuthParam, str6, bool, str7, str8, serviceFeeInfo, i, traceData, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, list, z, str19);
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
        if (!(obj instanceof SignAndBroadcastParams)) {
            return false;
        }
        SignAndBroadcastParams signAndBroadcastParams = (SignAndBroadcastParams) obj;
        return Intrinsics.EZpvd((Object) this.maxSlippage, (Object) signAndBroadcastParams.maxSlippage) && Intrinsics.EZpvd((Object) this.priorityFeeType, (Object) signAndBroadcastParams.priorityFeeType) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) signAndBroadcastParams.priorityFee) && Intrinsics.EZpvd((Object) this.routerModeType, (Object) signAndBroadcastParams.routerModeType) && Intrinsics.EZpvd(this.tpslConfig, signAndBroadcastParams.tpslConfig) && Intrinsics.EZpvd((Object) this.orderSource, (Object) signAndBroadcastParams.orderSource) && Intrinsics.EZpvd(this.walletAuthParam, signAndBroadcastParams.walletAuthParam) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) signAndBroadcastParams.gasPrice) && Intrinsics.EZpvd(this.enableJito, signAndBroadcastParams.enableJito) && Intrinsics.EZpvd((Object) this.gasUsed, (Object) signAndBroadcastParams.gasUsed) && Intrinsics.EZpvd((Object) this.mevInfo, (Object) signAndBroadcastParams.mevInfo) && Intrinsics.EZpvd(this.serviceFeeInfo, signAndBroadcastParams.serviceFeeInfo) && this.tradeMode == signAndBroadcastParams.tradeMode && Intrinsics.EZpvd(this.traceData, signAndBroadcastParams.traceData) && Intrinsics.EZpvd((Object) this.direction, (Object) signAndBroadcastParams.direction) && Intrinsics.EZpvd((Object) this.chainId, (Object) signAndBroadcastParams.chainId) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) signAndBroadcastParams.fromTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) signAndBroadcastParams.toTokenAddress) && Intrinsics.EZpvd((Object) this.amount, (Object) signAndBroadcastParams.amount) && Intrinsics.EZpvd((Object) this.slippageType, (Object) signAndBroadcastParams.slippageType) && Intrinsics.EZpvd((Object) this.slippage, (Object) signAndBroadcastParams.slippage) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) signAndBroadcastParams.userWalletAddress) && Intrinsics.EZpvd((Object) this.accountId, (Object) signAndBroadcastParams.accountId) && Intrinsics.EZpvd((Object) this.toAmount, (Object) signAndBroadcastParams.toAmount) && Intrinsics.EZpvd(this.dexRouterList, signAndBroadcastParams.dexRouterList) && this.teeSilentSignEnabled == signAndBroadcastParams.teeSilentSignEnabled && Intrinsics.EZpvd((Object) this.quoteId, (Object) signAndBroadcastParams.quoteId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexRouterList> getDexRouterList() {
        return this.dexRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnableJito() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasUsed() {
        return this.gasUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSlippage() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevInfo() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderSource() {
        return this.orderSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFeeType() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRouterModeType() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo getServiceFeeInfo() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageType() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTeeSilentSignEnabled() {
        return this.teeSilentSignEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmount() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpslConfig getTpslConfig() {
        return this.tpslConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TraceData getTraceData() {
        return this.traceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTradeMode() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAuthParam getWalletAuthParam() {
        return this.walletAuthParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.maxSlippage;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.priorityFeeType.hashCode();
        int iHashCode3 = this.priorityFee.hashCode();
        String str2 = this.routerModeType;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        TpslConfig tpslConfig = this.tpslConfig;
        int iHashCode5 = tpslConfig == null ? 0 : tpslConfig.hashCode();
        String str3 = this.orderSource;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        WalletAuthParam walletAuthParam = this.walletAuthParam;
        int iHashCode7 = walletAuthParam == null ? 0 : walletAuthParam.hashCode();
        String str4 = this.gasPrice;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        Boolean bool = this.enableJito;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        int iHashCode10 = this.gasUsed.hashCode();
        String str5 = this.mevInfo;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        int iHashCode12 = serviceFeeInfo == null ? 0 : serviceFeeInfo.hashCode();
        int iHashCode13 = Integer.hashCode(this.tradeMode);
        TraceData traceData = this.traceData;
        int iHashCode14 = traceData == null ? 0 : traceData.hashCode();
        int iHashCode15 = this.direction.hashCode();
        int iHashCode16 = this.chainId.hashCode();
        int iHashCode17 = this.fromTokenAddress.hashCode();
        int iHashCode18 = this.toTokenAddress.hashCode();
        int iHashCode19 = this.amount.hashCode();
        int iHashCode20 = this.slippageType.hashCode();
        int iHashCode21 = this.slippage.hashCode();
        int iHashCode22 = this.userWalletAddress.hashCode();
        int iHashCode23 = this.accountId.hashCode();
        int iHashCode24 = this.toAmount.hashCode();
        int iHashCode25 = this.dexRouterList.hashCode();
        int iHashCode26 = Boolean.hashCode(this.teeSilentSignEnabled);
        String str6 = this.quoteId;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + (str6 == null ? 0 : str6.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignAndBroadcastParams(maxSlippage=" + this.maxSlippage + ", priorityFeeType=" + this.priorityFeeType + ", priorityFee=" + this.priorityFee + ", routerModeType=" + this.routerModeType + ", tpslConfig=" + this.tpslConfig + ", orderSource=" + this.orderSource + ", walletAuthParam=" + this.walletAuthParam + ", gasPrice=" + this.gasPrice + ", enableJito=" + this.enableJito + ", gasUsed=" + this.gasUsed + ", mevInfo=" + this.mevInfo + ", serviceFeeInfo=" + this.serviceFeeInfo + ", tradeMode=" + this.tradeMode + ", traceData=" + this.traceData + ", direction=" + this.direction + ", chainId=" + this.chainId + ", fromTokenAddress=" + this.fromTokenAddress + ", toTokenAddress=" + this.toTokenAddress + ", amount=" + this.amount + ", slippageType=" + this.slippageType + ", slippage=" + this.slippage + ", userWalletAddress=" + this.userWalletAddress + ", accountId=" + this.accountId + ", toAmount=" + this.toAmount + ", dexRouterList=" + this.dexRouterList + ", teeSilentSignEnabled=" + this.teeSilentSignEnabled + ", quoteId=" + this.quoteId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.maxSlippage);
        parcel.writeString(this.priorityFeeType);
        parcel.writeString(this.priorityFee);
        parcel.writeString(this.routerModeType);
        TpslConfig tpslConfig = this.tpslConfig;
        if (tpslConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tpslConfig.writeToParcel(parcel, i);
        }
        parcel.writeString(this.orderSource);
        WalletAuthParam walletAuthParam = this.walletAuthParam;
        if (walletAuthParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            walletAuthParam.writeToParcel(parcel, i);
        }
        parcel.writeString(this.gasPrice);
        Boolean bool = this.enableJito;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.gasUsed);
        parcel.writeString(this.mevInfo);
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        if (serviceFeeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceFeeInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.tradeMode);
        TraceData traceData = this.traceData;
        if (traceData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            traceData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.direction);
        parcel.writeString(this.chainId);
        parcel.writeString(this.fromTokenAddress);
        parcel.writeString(this.toTokenAddress);
        parcel.writeString(this.amount);
        parcel.writeString(this.slippageType);
        parcel.writeString(this.slippage);
        parcel.writeString(this.userWalletAddress);
        parcel.writeString(this.accountId);
        parcel.writeString(this.toAmount);
        List<DexRouterList> list = this.dexRouterList;
        parcel.writeInt(list.size());
        Iterator<DexRouterList> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.teeSilentSignEnabled ? 1 : 0);
        parcel.writeString(this.quoteId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.domain.model.SignAndBroadcastParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignAndBroadcastParams> serializer() {
            return SignAndBroadcastParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignAndBroadcastParams(int i, String str, String str2, String str3, String str4, TpslConfig tpslConfig, String str5, WalletAuthParam walletAuthParam, String str6, Boolean bool, String str7, String str8, ServiceFeeInfo serviceFeeInfo, int i2, TraceData traceData, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, List list, boolean z, String str19, SerializationConstructorMarker serializationConstructorMarker) {
        if (4096 != (i & 4096)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4096, SignAndBroadcastParams$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.maxSlippage = null;
        } else {
            this.maxSlippage = str;
        }
        if ((i & 2) == 0) {
            this.priorityFeeType = "";
        } else {
            this.priorityFeeType = str2;
        }
        if ((i & 4) == 0) {
            this.priorityFee = "";
        } else {
            this.priorityFee = str3;
        }
        if ((i & 8) == 0) {
            this.routerModeType = null;
        } else {
            this.routerModeType = str4;
        }
        if ((i & 16) == 0) {
            this.tpslConfig = null;
        } else {
            this.tpslConfig = tpslConfig;
        }
        if ((i & 32) == 0) {
            this.orderSource = null;
        } else {
            this.orderSource = str5;
        }
        if ((i & 64) == 0) {
            this.walletAuthParam = null;
        } else {
            this.walletAuthParam = walletAuthParam;
        }
        if ((i & 128) == 0) {
            this.gasPrice = null;
        } else {
            this.gasPrice = str6;
        }
        if ((i & 256) == 0) {
            this.enableJito = null;
        } else {
            this.enableJito = bool;
        }
        if ((i & 512) == 0) {
            this.gasUsed = "";
        } else {
            this.gasUsed = str7;
        }
        if ((i & 1024) == 0) {
            this.mevInfo = null;
        } else {
            this.mevInfo = str8;
        }
        if ((i & 2048) == 0) {
            this.serviceFeeInfo = null;
        } else {
            this.serviceFeeInfo = serviceFeeInfo;
        }
        this.tradeMode = i2;
        if ((i & 8192) == 0) {
            this.traceData = null;
        } else {
            this.traceData = traceData;
        }
        if ((i & 16384) == 0) {
            this.direction = "";
        } else {
            this.direction = str9;
        }
        if ((32768 & i) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str10;
        }
        if ((65536 & i) == 0) {
            this.fromTokenAddress = "";
        } else {
            this.fromTokenAddress = str11;
        }
        if ((131072 & i) == 0) {
            this.toTokenAddress = "";
        } else {
            this.toTokenAddress = str12;
        }
        if ((262144 & i) == 0) {
            this.amount = "";
        } else {
            this.amount = str13;
        }
        if ((524288 & i) == 0) {
            this.slippageType = "";
        } else {
            this.slippageType = str14;
        }
        if ((1048576 & i) == 0) {
            this.slippage = "";
        } else {
            this.slippage = str15;
        }
        if ((2097152 & i) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str16;
        }
        if ((4194304 & i) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str17;
        }
        if ((8388608 & i) == 0) {
            this.toAmount = "";
        } else {
            this.toAmount = str18;
        }
        this.dexRouterList = (16777216 & i) == 0 ? yDY.AhwBna() : list;
        this.teeSilentSignEnabled = (33554432 & i) == 0 ? false : z;
        if ((i & 67108864) == 0) {
            this.quoteId = null;
        } else {
            this.quoteId = str19;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SignAndBroadcastParams signAndBroadcastParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signAndBroadcastParams.maxSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, signAndBroadcastParams.maxSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) signAndBroadcastParams.priorityFeeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, signAndBroadcastParams.priorityFeeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) signAndBroadcastParams.priorityFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, signAndBroadcastParams.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || signAndBroadcastParams.routerModeType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, signAndBroadcastParams.routerModeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || signAndBroadcastParams.tpslConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, TpslConfig$$serializer.INSTANCE, signAndBroadcastParams.tpslConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || signAndBroadcastParams.orderSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, signAndBroadcastParams.orderSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || signAndBroadcastParams.walletAuthParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, WalletAuthParam$$serializer.INSTANCE, signAndBroadcastParams.walletAuthParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || signAndBroadcastParams.gasPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, signAndBroadcastParams.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || signAndBroadcastParams.enableJito != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, signAndBroadcastParams.enableJito);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) signAndBroadcastParams.gasUsed, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, signAndBroadcastParams.gasUsed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || signAndBroadcastParams.mevInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, signAndBroadcastParams.mevInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || signAndBroadcastParams.serviceFeeInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, ServiceFeeInfo$$serializer.INSTANCE, signAndBroadcastParams.serviceFeeInfo);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 12, signAndBroadcastParams.tradeMode);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || signAndBroadcastParams.traceData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, TraceData$$serializer.INSTANCE, signAndBroadcastParams.traceData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) signAndBroadcastParams.direction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, signAndBroadcastParams.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) signAndBroadcastParams.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, signAndBroadcastParams.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) signAndBroadcastParams.fromTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, signAndBroadcastParams.fromTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) signAndBroadcastParams.toTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, signAndBroadcastParams.toTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) signAndBroadcastParams.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, signAndBroadcastParams.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) signAndBroadcastParams.slippageType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, signAndBroadcastParams.slippageType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) signAndBroadcastParams.slippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, signAndBroadcastParams.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) signAndBroadcastParams.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, signAndBroadcastParams.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) signAndBroadcastParams.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, signAndBroadcastParams.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) signAndBroadcastParams.toAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, signAndBroadcastParams.toAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd(signAndBroadcastParams.dexRouterList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 24, kSerializerArr[24], signAndBroadcastParams.dexRouterList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || signAndBroadcastParams.teeSilentSignEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 25, signAndBroadcastParams.teeSilentSignEnabled);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) && signAndBroadcastParams.quoteId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, signAndBroadcastParams.quoteId);
    }

    public SignAndBroadcastParams(String str, @NotNull String str2, @NotNull String str3, String str4, TpslConfig tpslConfig, String str5, WalletAuthParam walletAuthParam, String str6, Boolean bool, @NotNull String str7, String str8, ServiceFeeInfo serviceFeeInfo, int i, TraceData traceData, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull List<DexRouterList> list, boolean z, String str19) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.maxSlippage = str;
        this.priorityFeeType = str2;
        this.priorityFee = str3;
        this.routerModeType = str4;
        this.tpslConfig = tpslConfig;
        this.orderSource = str5;
        this.walletAuthParam = walletAuthParam;
        this.gasPrice = str6;
        this.enableJito = bool;
        this.gasUsed = str7;
        this.mevInfo = str8;
        this.serviceFeeInfo = serviceFeeInfo;
        this.tradeMode = i;
        this.traceData = traceData;
        this.direction = str9;
        this.chainId = str10;
        this.fromTokenAddress = str11;
        this.toTokenAddress = str12;
        this.amount = str13;
        this.slippageType = str14;
        this.slippage = str15;
        this.userWalletAddress = str16;
        this.accountId = str17;
        this.toAmount = str18;
        this.dexRouterList = list;
        this.teeSilentSignEnabled = z;
        this.quoteId = str19;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f9: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r59v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r59v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r59v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r59v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:com.okinc.business.dex.tee.domain.model.TpslConfig:?: TERNARY null = ((wrap:int:0x0025: ARITH (r59v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.tee.domain.model.TpslConfig) : (r36v0 com.okinc.business.dex.tee.domain.model.TpslConfig))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r59v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:com.okinc.business.dex.tee.domain.model.WalletAuthParam:?: TERNARY null = ((wrap:int:0x0035: ARITH (r59v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.tee.domain.model.WalletAuthParam) : (r38v0 com.okinc.business.dex.tee.domain.model.WalletAuthParam))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r59v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0045: ARITH (r59v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r40v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r59v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r59v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.ServiceFeeInfo:?: TERNARY null = ((wrap:int:0x005d: ARITH (r59v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ServiceFeeInfo) : (r43v0 com.okinc.business.dexlogic.bean.ServiceFeeInfo))
  (r44v0 int)
  (wrap:com.okinc.business.dexlogic.bean.TraceData:?: TERNARY null = ((wrap:int:0x0065: ARITH (r59v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.TraceData) : (r45v0 com.okinc.business.dexlogic.bean.TraceData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006e: ARITH (r59v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007a: ARITH (32768 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0084: ARITH (65536 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008e: ARITH (131072 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (262144 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a2: ARITH (524288 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ac: ARITH (1048576 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b6: ARITH (2097152 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c0: ARITH (4194304 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (8388608 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00d4: ARITH (16777216 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00db: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:46)) : (r56v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00e2: ARITH (33554432 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? false : (r57v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ed: ARITH (r59v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.tee.domain.model.TpslConfig, java.lang.String, com.okinc.business.dex.tee.domain.model.WalletAuthParam, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo, int, com.okinc.business.dexlogic.bean.TraceData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.dexlogic.bean.DexRouterList>, boolean, java.lang.String):void (m)] (LINE:21) call: com.okinc.business.dex.tee.domain.model.SignAndBroadcastParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.tee.domain.model.TpslConfig, java.lang.String, com.okinc.business.dex.tee.domain.model.WalletAuthParam, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo, int, com.okinc.business.dexlogic.bean.TraceData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ SignAndBroadcastParams(String str, String str2, String str3, String str4, TpslConfig tpslConfig, String str5, WalletAuthParam walletAuthParam, String str6, Boolean bool, String str7, String str8, ServiceFeeInfo serviceFeeInfo, int i, TraceData traceData, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, List list, boolean z, String str19, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : tpslConfig, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : walletAuthParam, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? null : bool, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) != 0 ? null : str8, (i2 & 2048) != 0 ? null : serviceFeeInfo, i, (i2 & 8192) != 0 ? null : traceData, (i2 & 16384) != 0 ? "" : str9, (32768 & i2) != 0 ? "" : str10, (65536 & i2) != 0 ? "" : str11, (131072 & i2) != 0 ? "" : str12, (262144 & i2) != 0 ? "" : str13, (524288 & i2) != 0 ? "" : str14, (1048576 & i2) != 0 ? "" : str15, (2097152 & i2) != 0 ? "" : str16, (4194304 & i2) != 0 ? "" : str17, (8388608 & i2) != 0 ? "" : str18, (16777216 & i2) != 0 ? yDY.AhwBna() : list, (33554432 & i2) != 0 ? false : z, (i2 & 67108864) != 0 ? null : str19);
    }
}
