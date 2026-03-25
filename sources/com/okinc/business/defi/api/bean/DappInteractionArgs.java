package com.okinc.business.defi.api.bean;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33490mxT;
import o.C56391yDq;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class DappInteractionArgs implements Parcelable {
    public static final int GAS_LEVEL_CUSTOM = 4;
    public static final int GAS_LEVEL_MAX = 1;
    public static final int GAS_LEVEL_MIN = 3;
    public static final int GAS_LEVEL_RECOMMEND = 2;
    private final String approvalAddress;
    private final String approveAmt;
    private final Integer bizType;
    private String chainId;
    private Long coinId;
    private CustomNetworkInfo customNetworkInfo;
    private final PlatformItem dapp;
    private final DexTransferData dexTransferData;
    private String dexUniqueKey;
    private final String from;
    private final String gasLimitRatio;
    private final String gasPriceRatio;
    private final String gasStationSource;
    private final boolean isCancelApprove;
    private final boolean isDexApprove;
    private boolean isMemeOptimization;
    private Boolean isOpenMEV;
    private boolean multiSignData;
    private final String orderId;
    private Companion.ShowMode showMode;
    private Companion.ShowStyle showStyle;
    private String signDataJson;
    private SolanaMethod solanaMethod;
    private SolanaSignType solanaSignType;
    private Integer source;
    private final Integer txToastCheckBizLine;
    private final String txToastCheckPayload;
    private final boolean useNewCallback;
    private final DappInteractionValueCoinInfo valueCoinInfo;
    private final String walletAddress;
    private final String walletId;
    private final Bundle walletTxDataExtra;
    private final Long wcId;
    private final String wcTopic;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappInteractionArgs> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DappInteractionArgs> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappInteractionArgs createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            PlatformItem platformItemCreateFromParcel = parcel.readInt() == 0 ? null : PlatformItem.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            String string9 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            DexTransferData dexTransferDataCreateFromParcel = parcel.readInt() == 0 ? null : DexTransferData.CREATOR.createFromParcel(parcel);
            CustomNetworkInfo customNetworkInfoCreateFromParcel = parcel.readInt() == 0 ? null : CustomNetworkInfo.CREATOR.createFromParcel(parcel);
            DappInteractionValueCoinInfo dappInteractionValueCoinInfoCreateFromParcel = parcel.readInt() == 0 ? null : DappInteractionValueCoinInfo.CREATOR.createFromParcel(parcel);
            Companion.ShowMode showModeValueOf = parcel.readInt() == 0 ? null : Companion.ShowMode.valueOf(parcel.readString());
            Companion.ShowStyle showStyleValueOf = parcel.readInt() == 0 ? null : Companion.ShowStyle.valueOf(parcel.readString());
            Bundle bundle = parcel.readBundle(DappInteractionArgs.class.getClassLoader());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            SolanaSignType solanaSignTypeValueOf = SolanaSignType.valueOf(parcel.readString());
            SolanaMethod solanaMethodValueOf = parcel.readInt() == 0 ? null : SolanaMethod.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DappInteractionArgs(string, string2, string3, platformItemCreateFromParcel, string4, lValueOf, string5, numValueOf, lValueOf2, string6, string7, string8, z, z2, string9, z3, string10, string11, string12, numValueOf2, dexTransferDataCreateFromParcel, customNetworkInfoCreateFromParcel, dappInteractionValueCoinInfoCreateFromParcel, showModeValueOf, showStyleValueOf, bundle, numValueOf3, string13, string14, solanaSignTypeValueOf, solanaMethodValueOf, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappInteractionArgs[] newArray(int i) {
            return new DappInteractionArgs[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DappInteractionArgs() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.wcTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.approvalAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.approveAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.isCancelApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.isDexApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.useNewCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.gasPriceRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.gasLimitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.gasStationSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component20() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTransferData component21() {
        return this.dexTransferData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomNetworkInfo component22() {
        return this.customNetworkInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappInteractionValueCoinInfo component23() {
        return this.valueCoinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Companion.ShowMode component24() {
        return this.showMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Companion.ShowStyle component25() {
        return this.showStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle component26() {
        return this.walletTxDataExtra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component27() {
        return this.txToastCheckBizLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.txToastCheckPayload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.dexUniqueKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SolanaSignType component30() {
        return this.solanaSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SolanaMethod component31() {
        return this.solanaMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component32() {
        return this.isOpenMEV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformItem component4() {
        return this.dapp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.signDataJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.wcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappInteractionArgs copy(@NotNull String str, @NotNull String str2, @NotNull String str3, PlatformItem platformItem, @NotNull String str4, Long l, String str5, Integer num, Long l2, String str6, String str7, String str8, boolean z, boolean z2, String str9, boolean z3, String str10, String str11, String str12, Integer num2, DexTransferData dexTransferData, CustomNetworkInfo customNetworkInfo, DappInteractionValueCoinInfo dappInteractionValueCoinInfo, Companion.ShowMode showMode, Companion.ShowStyle showStyle, Bundle bundle, Integer num3, String str13, String str14, @NotNull SolanaSignType solanaSignType, SolanaMethod solanaMethod, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(solanaSignType, "");
        return new DappInteractionArgs(str, str2, str3, platformItem, str4, l, str5, num, l2, str6, str7, str8, z, z2, str9, z3, str10, str11, str12, num2, dexTransferData, customNetworkInfo, dappInteractionValueCoinInfo, showMode, showStyle, bundle, num3, str13, str14, solanaSignType, solanaMethod, bool);
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
        if (!(obj instanceof DappInteractionArgs)) {
            return false;
        }
        DappInteractionArgs dappInteractionArgs = (DappInteractionArgs) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) dappInteractionArgs.walletId) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) dappInteractionArgs.walletAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) dappInteractionArgs.chainId) && Intrinsics.EZpvd(this.dapp, dappInteractionArgs.dapp) && Intrinsics.EZpvd((Object) this.signDataJson, (Object) dappInteractionArgs.signDataJson) && Intrinsics.EZpvd(this.coinId, dappInteractionArgs.coinId) && Intrinsics.EZpvd((Object) this.from, (Object) dappInteractionArgs.from) && Intrinsics.EZpvd(this.source, dappInteractionArgs.source) && Intrinsics.EZpvd(this.wcId, dappInteractionArgs.wcId) && Intrinsics.EZpvd((Object) this.wcTopic, (Object) dappInteractionArgs.wcTopic) && Intrinsics.EZpvd((Object) this.approvalAddress, (Object) dappInteractionArgs.approvalAddress) && Intrinsics.EZpvd((Object) this.approveAmt, (Object) dappInteractionArgs.approveAmt) && this.isCancelApprove == dappInteractionArgs.isCancelApprove && this.isDexApprove == dappInteractionArgs.isDexApprove && Intrinsics.EZpvd((Object) this.orderId, (Object) dappInteractionArgs.orderId) && this.useNewCallback == dappInteractionArgs.useNewCallback && Intrinsics.EZpvd((Object) this.gasPriceRatio, (Object) dappInteractionArgs.gasPriceRatio) && Intrinsics.EZpvd((Object) this.gasLimitRatio, (Object) dappInteractionArgs.gasLimitRatio) && Intrinsics.EZpvd((Object) this.gasStationSource, (Object) dappInteractionArgs.gasStationSource) && Intrinsics.EZpvd(this.bizType, dappInteractionArgs.bizType) && Intrinsics.EZpvd(this.dexTransferData, dappInteractionArgs.dexTransferData) && Intrinsics.EZpvd(this.customNetworkInfo, dappInteractionArgs.customNetworkInfo) && Intrinsics.EZpvd(this.valueCoinInfo, dappInteractionArgs.valueCoinInfo) && this.showMode == dappInteractionArgs.showMode && this.showStyle == dappInteractionArgs.showStyle && Intrinsics.EZpvd(this.walletTxDataExtra, dappInteractionArgs.walletTxDataExtra) && Intrinsics.EZpvd(this.txToastCheckBizLine, dappInteractionArgs.txToastCheckBizLine) && Intrinsics.EZpvd((Object) this.txToastCheckPayload, (Object) dappInteractionArgs.txToastCheckPayload) && Intrinsics.EZpvd((Object) this.dexUniqueKey, (Object) dappInteractionArgs.dexUniqueKey) && this.solanaSignType == dappInteractionArgs.solanaSignType && this.solanaMethod == dappInteractionArgs.solanaMethod && Intrinsics.EZpvd(this.isOpenMEV, dappInteractionArgs.isOpenMEV);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApprovalAddress() {
        return this.approvalAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApproveAmt() {
        return this.approveAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomNetworkInfo getCustomNetworkInfo() {
        return this.customNetworkInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformItem getDapp() {
        return this.dapp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTransferData getDexTransferData() {
        return this.dexTransferData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexUniqueKey() {
        return this.dexUniqueKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasLimitRatio() {
        return this.gasLimitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPriceRatio() {
        return this.gasPriceRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasStationSource() {
        return this.gasStationSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMultiSignData() {
        return this.multiSignData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Companion.ShowMode getShowMode() {
        return this.showMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Companion.ShowStyle getShowStyle() {
        return this.showStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignDataJson() {
        return this.signDataJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SolanaMethod getSolanaMethod() {
        return this.solanaMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SolanaSignType getSolanaSignType() {
        return this.solanaSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTxToastCheckBizLine() {
        return this.txToastCheckBizLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxToastCheckPayload() {
        return this.txToastCheckPayload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUseNewCallback() {
        return this.useNewCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappInteractionValueCoinInfo getValueCoinInfo() {
        return this.valueCoinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle getWalletTxDataExtra() {
        return this.walletTxDataExtra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getWcId() {
        return this.wcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWcTopic() {
        return this.wcTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.walletId.hashCode();
        int iHashCode2 = this.walletAddress.hashCode();
        int iHashCode3 = this.chainId.hashCode();
        PlatformItem platformItem = this.dapp;
        int iHashCode4 = platformItem == null ? 0 : platformItem.hashCode();
        int iHashCode5 = this.signDataJson.hashCode();
        Long l = this.coinId;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        String str = this.from;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        Integer num = this.source;
        int iHashCode8 = num == null ? 0 : num.hashCode();
        Long l2 = this.wcId;
        int iHashCode9 = l2 == null ? 0 : l2.hashCode();
        String str2 = this.wcTopic;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.approvalAddress;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.approveAmt;
        int iHashCode12 = str4 == null ? 0 : str4.hashCode();
        int iHashCode13 = Boolean.hashCode(this.isCancelApprove);
        int iHashCode14 = Boolean.hashCode(this.isDexApprove);
        String str5 = this.orderId;
        int iHashCode15 = str5 == null ? 0 : str5.hashCode();
        int iHashCode16 = Boolean.hashCode(this.useNewCallback);
        String str6 = this.gasPriceRatio;
        int iHashCode17 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.gasLimitRatio;
        int iHashCode18 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.gasStationSource;
        int iHashCode19 = str8 == null ? 0 : str8.hashCode();
        Integer num2 = this.bizType;
        int iHashCode20 = num2 == null ? 0 : num2.hashCode();
        DexTransferData dexTransferData = this.dexTransferData;
        int iHashCode21 = dexTransferData == null ? 0 : dexTransferData.hashCode();
        CustomNetworkInfo customNetworkInfo = this.customNetworkInfo;
        int iHashCode22 = customNetworkInfo == null ? 0 : customNetworkInfo.hashCode();
        DappInteractionValueCoinInfo dappInteractionValueCoinInfo = this.valueCoinInfo;
        int iHashCode23 = dappInteractionValueCoinInfo == null ? 0 : dappInteractionValueCoinInfo.hashCode();
        Companion.ShowMode showMode = this.showMode;
        int iHashCode24 = showMode == null ? 0 : showMode.hashCode();
        Companion.ShowStyle showStyle = this.showStyle;
        int iHashCode25 = showStyle == null ? 0 : showStyle.hashCode();
        Bundle bundle = this.walletTxDataExtra;
        int iHashCode26 = bundle == null ? 0 : bundle.hashCode();
        Integer num3 = this.txToastCheckBizLine;
        int iHashCode27 = num3 == null ? 0 : num3.hashCode();
        String str9 = this.txToastCheckPayload;
        int iHashCode28 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.dexUniqueKey;
        int iHashCode29 = str10 == null ? 0 : str10.hashCode();
        int iHashCode30 = this.solanaSignType.hashCode();
        SolanaMethod solanaMethod = this.solanaMethod;
        int iHashCode31 = solanaMethod == null ? 0 : solanaMethod.hashCode();
        Boolean bool = this.isOpenMEV;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCancelApprove() {
        return this.isCancelApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDexApprove() {
        return this.isDexApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMemeOptimization() {
        return this.isMemeOptimization;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isOpenMEV() {
        return this.isOpenMEV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(Long l) {
        this.coinId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomNetworkInfo(CustomNetworkInfo customNetworkInfo) {
        this.customNetworkInfo = customNetworkInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexUniqueKey(String str) {
        this.dexUniqueKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMemeOptimization(boolean z) {
        this.isMemeOptimization = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMultiSignData(boolean z) {
        this.multiSignData = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenMEV(Boolean bool) {
        this.isOpenMEV = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowMode(Companion.ShowMode showMode) {
        this.showMode = showMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowStyle(Companion.ShowStyle showStyle) {
        this.showStyle = showStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignDataJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signDataJson = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSolanaMethod(SolanaMethod solanaMethod) {
        this.solanaMethod = solanaMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSolanaSignType(@NotNull SolanaSignType solanaSignType) {
        Intrinsics.checkNotNullParameter(solanaSignType, "");
        this.solanaSignType = solanaSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSource(Integer num) {
        this.source = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappInteractionArgs(walletId=" + this.walletId + ", walletAddress=" + this.walletAddress + ", chainId=" + this.chainId + ", dapp=" + this.dapp + ", signDataJson=" + this.signDataJson + ", coinId=" + this.coinId + ", from=" + this.from + ", source=" + this.source + ", wcId=" + this.wcId + ", wcTopic=" + this.wcTopic + ", approvalAddress=" + this.approvalAddress + ", approveAmt=" + this.approveAmt + ", isCancelApprove=" + this.isCancelApprove + ", isDexApprove=" + this.isDexApprove + ", orderId=" + this.orderId + ", useNewCallback=" + this.useNewCallback + ", gasPriceRatio=" + this.gasPriceRatio + ", gasLimitRatio=" + this.gasLimitRatio + ", gasStationSource=" + this.gasStationSource + ", bizType=" + this.bizType + ", dexTransferData=" + this.dexTransferData + ", customNetworkInfo=" + this.customNetworkInfo + ", valueCoinInfo=" + this.valueCoinInfo + ", showMode=" + this.showMode + ", showStyle=" + this.showStyle + ", walletTxDataExtra=" + this.walletTxDataExtra + ", txToastCheckBizLine=" + this.txToastCheckBizLine + ", txToastCheckPayload=" + this.txToastCheckPayload + ", dexUniqueKey=" + this.dexUniqueKey + ", solanaSignType=" + this.solanaSignType + ", solanaMethod=" + this.solanaMethod + ", isOpenMEV=" + this.isOpenMEV + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.walletId);
        parcel.writeString(this.walletAddress);
        parcel.writeString(this.chainId);
        PlatformItem platformItem = this.dapp;
        if (platformItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformItem.writeToParcel(parcel, i);
        }
        parcel.writeString(this.signDataJson);
        Long l = this.coinId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.from);
        Integer num = this.source;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l2 = this.wcId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.wcTopic);
        parcel.writeString(this.approvalAddress);
        parcel.writeString(this.approveAmt);
        parcel.writeInt(this.isCancelApprove ? 1 : 0);
        parcel.writeInt(this.isDexApprove ? 1 : 0);
        parcel.writeString(this.orderId);
        parcel.writeInt(this.useNewCallback ? 1 : 0);
        parcel.writeString(this.gasPriceRatio);
        parcel.writeString(this.gasLimitRatio);
        parcel.writeString(this.gasStationSource);
        Integer num2 = this.bizType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        DexTransferData dexTransferData = this.dexTransferData;
        if (dexTransferData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexTransferData.writeToParcel(parcel, i);
        }
        CustomNetworkInfo customNetworkInfo = this.customNetworkInfo;
        if (customNetworkInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customNetworkInfo.writeToParcel(parcel, i);
        }
        DappInteractionValueCoinInfo dappInteractionValueCoinInfo = this.valueCoinInfo;
        if (dappInteractionValueCoinInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dappInteractionValueCoinInfo.writeToParcel(parcel, i);
        }
        Companion.ShowMode showMode = this.showMode;
        if (showMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(showMode.name());
        }
        Companion.ShowStyle showStyle = this.showStyle;
        if (showStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(showStyle.name());
        }
        parcel.writeBundle(this.walletTxDataExtra);
        Integer num3 = this.txToastCheckBizLine;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.txToastCheckPayload);
        parcel.writeString(this.dexUniqueKey);
        parcel.writeString(this.solanaSignType.name());
        SolanaMethod solanaMethod = this.solanaMethod;
        if (solanaMethod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(solanaMethod.name());
        }
        Boolean bool = this.isOpenMEV;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public DappInteractionArgs(@NotNull String str, @NotNull String str2, @NotNull String str3, PlatformItem platformItem, @NotNull String str4, Long l, String str5, Integer num, Long l2, String str6, String str7, String str8, boolean z, boolean z2, String str9, boolean z3, String str10, String str11, String str12, Integer num2, DexTransferData dexTransferData, CustomNetworkInfo customNetworkInfo, DappInteractionValueCoinInfo dappInteractionValueCoinInfo, Companion.ShowMode showMode, Companion.ShowStyle showStyle, Bundle bundle, Integer num3, String str13, String str14, @NotNull SolanaSignType solanaSignType, SolanaMethod solanaMethod, Boolean bool) {
        Companion.ShowStyle showStyle2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(solanaSignType, "");
        this.walletId = str;
        this.walletAddress = str2;
        this.chainId = str3;
        this.dapp = platformItem;
        this.signDataJson = str4;
        this.coinId = l;
        this.from = str5;
        this.source = num;
        this.wcId = l2;
        this.wcTopic = str6;
        this.approvalAddress = str7;
        this.approveAmt = str8;
        this.isCancelApprove = z;
        this.isDexApprove = z2;
        this.orderId = str9;
        this.useNewCallback = z3;
        this.gasPriceRatio = str10;
        this.gasLimitRatio = str11;
        this.gasStationSource = str12;
        this.bizType = num2;
        this.dexTransferData = dexTransferData;
        this.customNetworkInfo = customNetworkInfo;
        this.valueCoinInfo = dappInteractionValueCoinInfo;
        this.showMode = showMode;
        this.showStyle = showStyle;
        this.walletTxDataExtra = bundle;
        this.txToastCheckBizLine = num3;
        this.txToastCheckPayload = str13;
        this.dexUniqueKey = str14;
        this.solanaSignType = solanaSignType;
        this.solanaMethod = solanaMethod;
        this.isOpenMEV = bool;
        if (z3) {
            try {
                Result.Application application = Result.Companion;
                if (new JSONObject(this.signDataJson).opt("array") instanceof JSONArray) {
                    this.multiSignData = true;
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        if (this.showMode == null) {
            this.showMode = Companion.ShowMode.EDIT;
        }
        if (this.showStyle == null) {
            Integer num4 = this.source;
            if (num4 != null && num4.intValue() == 3) {
                showStyle2 = Companion.ShowStyle.DEX;
            } else {
                showStyle2 = Companion.ShowStyle.NORMAL;
            }
            this.showStyle = showStyle2;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0178: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r66v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r66v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r66v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.bean.PlatformItem:?: TERNARY null = ((wrap:int:0x001c: ARITH (r66v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.PlatformItem) : (r37v0 com.okinc.business.defi.api.bean.PlatformItem))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r66v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r38v0 java.lang.String) : (""))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x002b: ARITH (r66v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r39v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r66v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003b: ARITH (r66v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r41v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0043: ARITH (r66v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r42v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r66v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r66v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r66v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0063: ARITH (r66v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r46v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006b: ARITH (r66v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r47v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0073: ARITH (r66v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007e: ARITH (r66v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r49v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (r66v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0094: ARITH (r66v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009f: ARITH (r66v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r66v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r53v0 java.lang.Integer))
  (wrap:com.okinc.business.defi.api.bean.DexTransferData:?: TERNARY null = ((wrap:int:0x00b5: ARITH (r66v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.DexTransferData) : (r54v0 com.okinc.business.defi.api.bean.DexTransferData))
  (wrap:com.okinc.business.defi.api.bean.CustomNetworkInfo:?: TERNARY null = ((wrap:int:0x00c0: ARITH (r66v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.CustomNetworkInfo) : (r55v0 com.okinc.business.defi.api.bean.CustomNetworkInfo))
  (wrap:com.okinc.business.defi.api.bean.DappInteractionValueCoinInfo:?: TERNARY null = ((wrap:int:0x00cb: ARITH (r66v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.DappInteractionValueCoinInfo) : (r56v0 com.okinc.business.defi.api.bean.DappInteractionValueCoinInfo))
  (wrap:com.okinc.business.defi.api.bean.DappInteractionArgs$Companion$ShowMode:?: TERNARY null = ((wrap:int:0x00d6: ARITH (r66v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.DappInteractionArgs$Companion$ShowMode) : (r57v0 com.okinc.business.defi.api.bean.DappInteractionArgs$Companion$ShowMode))
  (wrap:com.okinc.business.defi.api.bean.DappInteractionArgs$Companion$ShowStyle:?: TERNARY null = ((wrap:int:0x00e1: ARITH (r66v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.DappInteractionArgs$Companion$ShowStyle) : (r58v0 com.okinc.business.defi.api.bean.DappInteractionArgs$Companion$ShowStyle))
  (wrap:android.os.Bundle:?: TERNARY null = ((wrap:int:0x00ec: ARITH (r66v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null android.os.Bundle) : (r59v0 android.os.Bundle))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00f7: ARITH (r66v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r60v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0102: ARITH (r66v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010d: ARITH (r66v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.bean.SolanaSignType:?: TERNARY null = ((wrap:int:0x0118: ARITH (r66v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x011c: SGET  A[WRAPPED] (LINE:116) com.okinc.business.defi.api.bean.SolanaSignType.NORMAL com.okinc.business.defi.api.bean.SolanaSignType) : (r63v0 com.okinc.business.defi.api.bean.SolanaSignType))
  (wrap:com.okinc.business.defi.api.bean.SolanaMethod:?: TERNARY null = ((wrap:int:0x0123: ARITH (r66v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.SolanaMethod) : (r64v0 com.okinc.business.defi.api.bean.SolanaMethod))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x012e: ARITH (r66v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r65v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.PlatformItem, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.defi.api.bean.DexTransferData, com.okinc.business.defi.api.bean.CustomNetworkInfo, com.okinc.business.defi.api.bean.DappInteractionValueCoinInfo, com.okinc.business.defi.api.bean.DappInteractionArgs$Companion$ShowMode, com.okinc.business.defi.api.bean.DappInteractionArgs$Companion$ShowStyle, android.os.Bundle, java.lang.Integer, java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.SolanaSignType, com.okinc.business.defi.api.bean.SolanaMethod, java.lang.Boolean):void (m)] (LINE:86) call: com.okinc.business.defi.api.bean.DappInteractionArgs.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.PlatformItem, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.defi.api.bean.DexTransferData, com.okinc.business.defi.api.bean.CustomNetworkInfo, com.okinc.business.defi.api.bean.DappInteractionValueCoinInfo, com.okinc.business.defi.api.bean.DappInteractionArgs$Companion$ShowMode, com.okinc.business.defi.api.bean.DappInteractionArgs$Companion$ShowStyle, android.os.Bundle, java.lang.Integer, java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.SolanaSignType, com.okinc.business.defi.api.bean.SolanaMethod, java.lang.Boolean):void type: THIS */
    public /* synthetic */ DappInteractionArgs(String str, String str2, String str3, PlatformItem platformItem, String str4, Long l, String str5, Integer num, Long l2, String str6, String str7, String str8, boolean z, boolean z2, String str9, boolean z3, String str10, String str11, String str12, Integer num2, DexTransferData dexTransferData, CustomNetworkInfo customNetworkInfo, DappInteractionValueCoinInfo dappInteractionValueCoinInfo, Companion.ShowMode showMode, Companion.ShowStyle showStyle, Bundle bundle, Integer num3, String str13, String str14, SolanaSignType solanaSignType, SolanaMethod solanaMethod, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : platformItem, (i & 16) == 0 ? str4 : "", (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : l2, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? false : z, (i & 8192) != 0 ? false : z2, (i & 16384) != 0 ? null : str9, (i & 32768) != 0 ? false : z3, (i & 65536) != 0 ? null : str10, (i & 131072) != 0 ? null : str11, (i & 262144) != 0 ? null : str12, (i & 524288) != 0 ? null : num2, (i & 1048576) != 0 ? null : dexTransferData, (i & 2097152) != 0 ? null : customNetworkInfo, (i & 4194304) != 0 ? null : dappInteractionValueCoinInfo, (i & 8388608) != 0 ? null : showMode, (i & 16777216) != 0 ? null : showStyle, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : bundle, (i & 67108864) != 0 ? null : num3, (i & 134217728) != 0 ? null : str13, (i & 268435456) != 0 ? null : str14, (i & 536870912) != 0 ? SolanaSignType.NORMAL : solanaSignType, (i & 1073741824) != 0 ? null : solanaMethod, (i & Integer.MIN_VALUE) != 0 ? null : bool);
    }

    public static final class Companion {

        public static final class Application extends TypeToken<List<? extends FromToken>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.DappInteractionArgs.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ShowMode {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ ShowMode[] $VALUES;
            public static final ShowMode EDIT = new ShowMode("EDIT", 0);
            public static final ShowMode PREVIEW = new ShowMode("PREVIEW", 1);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ ShowMode[] $values() {
                return new ShowMode[]{EDIT, PREVIEW};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<ShowMode> getEntries() {
                return $ENTRIES;
            }

            private ShowMode(String str, int i) {
            }

            static {
                ShowMode[] showModeArr$values = $values();
                $VALUES = showModeArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(showModeArr$values);
            }

            public static ShowMode valueOf(String str) {
                return (ShowMode) Enum.valueOf(ShowMode.class, str);
            }

            public static ShowMode[] values() {
                return (ShowMode[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ShowStyle {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ ShowStyle[] $VALUES;
            public static final ShowStyle NORMAL = new ShowStyle("NORMAL", 0);
            public static final ShowStyle DEX = new ShowStyle("DEX", 1);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ ShowStyle[] $values() {
                return new ShowStyle[]{NORMAL, DEX};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<ShowStyle> getEntries() {
                return $ENTRIES;
            }

            private ShowStyle(String str, int i) {
            }

            static {
                ShowStyle[] showStyleArr$values = $values();
                $VALUES = showStyleArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(showStyleArr$values);
            }

            public static ShowStyle valueOf(String str) {
                return (ShowStyle) Enum.valueOf(ShowStyle.class, str);
            }

            public static ShowStyle[] values() {
                return (ShowStyle[]) $VALUES.clone();
            }
        }

        public final String OLrzqt(@NotNull String str, @NotNull List<FromToken> list) throws Throwable {
            Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            try {
                Result.Application application = Result.Companion;
                JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(str);
                if (jsonObjectOLrzqt != null) {
                    jsonObjectOLrzqt.add("fromToken", C33490mxT.copydefault(list));
                }
                Intrinsics.copydefault(jsonObjectOLrzqt);
                objM7377constructorimpl = Result.m7377constructorimpl(C33490mxT.OLrzqt(jsonObjectOLrzqt));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (!Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                return str;
            }
            C56391yDq.AEQbTJ(objM7377constructorimpl);
            return (String) objM7377constructorimpl;
        }

        public final List<FromToken> AEQbTJ(@NotNull String str) {
            Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(str, "");
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "fromToken", false, 2, (Object) null)) {
                try {
                    Result.Application application = Result.Companion;
                    List listAhwBna = (List) new Gson().fromJson(new JSONObject(str).getString("fromToken"), new Application().getType());
                    if (listAhwBna == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    C56391yDq.AEQbTJ(objM7377constructorimpl);
                    return (List) objM7377constructorimpl;
                }
                return yDY.AhwBna();
            }
            return yDY.AhwBna();
        }
    }
}
