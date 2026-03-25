package com.okinc.business.defi.biz.core.ws.channel;

import com.okinc.business.defi.biz.core.ws.channel.WalletPnlSubManager;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.TokenAsset;
import com.okinc.wallet.api.bean.AddressType;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.AbstractC12782ctV;
import o.C10525bqB;
import o.C10541bqR;
import o.C10856bwO;
import o.C11205cFp;
import o.C33129mqd;
import o.C54862xYb;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class WalletCeDefiCoinAssetSubManager extends xZF<SubResponse> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xZF
    public boolean OLrzqt(@NotNull List<SubResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return true;
    }

    public WalletCeDefiCoinAssetSubManager() {
        super("wallet-asset-v2", true, false, 0L, SubResponse.Companion.serializer(), C11205cFp.EZpvd.QOLQEE());
    }

    @Override // o.xZF
    public void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        super.OLrzqt(str);
    }

    @Override // o.xZF
    public void AEQbTJ(@NotNull xZF.TaskDescription<SubResponse> taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        super.AEQbTJ(taskDescription);
    }

    @Serializable
    public static final class SubResponse extends xZF.ActionBar {
        private final String address;
        private final String availableBalance;
        private final Long chainId;
        private final String coinAmount;
        private final String coinAmountDec;
        private final String coinAmountOriginalDec;
        private final Long coinId;
        private String currencyAmountNew;
        private final Boolean isAptosMainCoinAssetChanged;
        private final Boolean isBaseCoin;
        private final String tokenAddress;
        private final String transferableBalance;
        private final Boolean voucherToken;
        private String walletDefaultAddress;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SubResponse() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }

        @SerialName("addr")
        public static /* synthetic */ void getAddress$annotations() {
        }

        @SerialName("ab")
        public static /* synthetic */ void getAvailableBalance$annotations() {
        }

        @SerialName("chId")
        public static /* synthetic */ void getChainId$annotations() {
        }

        @SerialName("amt")
        public static /* synthetic */ void getCoinAmount$annotations() {
        }

        @SerialName("amtD")
        public static /* synthetic */ void getCoinAmountDec$annotations() {
        }

        @SerialName("amtO")
        public static /* synthetic */ void getCoinAmountOriginalDec$annotations() {
        }

        @SerialName("cId")
        public static /* synthetic */ void getCoinId$annotations() {
        }

        @SerialName("cAmtN")
        public static /* synthetic */ void getCurrencyAmountNew$annotations() {
        }

        @SerialName("tAd")
        public static /* synthetic */ void getTokenAddress$annotations() {
        }

        @SerialName("tab")
        public static /* synthetic */ void getTransferableBalance$annotations() {
        }

        @SerialName("vtk")
        public static /* synthetic */ void getVoucherToken$annotations() {
        }

        @SerialName("aptMCAC")
        public static /* synthetic */ void isAptosMainCoinAssetChanged$annotations() {
        }

        @SerialName("bc")
        public static /* synthetic */ void isBaseCoin$annotations() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component10() {
            return this.voucherToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component11() {
            return this.transferableBalance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component12() {
            return this.availableBalance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component13() {
            return this.isAptosMainCoinAssetChanged;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component3() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component4() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.coinAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.coinAmountDec;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.coinAmountOriginalDec;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.currencyAmountNew;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component9() {
            return this.isBaseCoin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponse copy(String str, String str2, Long l, Long l2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, Boolean bool3) {
            return new SubResponse(str, str2, l, l2, str3, str4, str5, str6, bool, bool2, str7, str8, bool3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubResponse)) {
                return false;
            }
            SubResponse subResponse = (SubResponse) obj;
            return Intrinsics.EZpvd((Object) this.address, (Object) subResponse.address) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) subResponse.tokenAddress) && Intrinsics.EZpvd(this.coinId, subResponse.coinId) && Intrinsics.EZpvd(this.chainId, subResponse.chainId) && Intrinsics.EZpvd((Object) this.coinAmount, (Object) subResponse.coinAmount) && Intrinsics.EZpvd((Object) this.coinAmountDec, (Object) subResponse.coinAmountDec) && Intrinsics.EZpvd((Object) this.coinAmountOriginalDec, (Object) subResponse.coinAmountOriginalDec) && Intrinsics.EZpvd((Object) this.currencyAmountNew, (Object) subResponse.currencyAmountNew) && Intrinsics.EZpvd(this.isBaseCoin, subResponse.isBaseCoin) && Intrinsics.EZpvd(this.voucherToken, subResponse.voucherToken) && Intrinsics.EZpvd((Object) this.transferableBalance, (Object) subResponse.transferableBalance) && Intrinsics.EZpvd((Object) this.availableBalance, (Object) subResponse.availableBalance) && Intrinsics.EZpvd(this.isAptosMainCoinAssetChanged, subResponse.isAptosMainCoinAssetChanged);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAvailableBalance() {
            return this.availableBalance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCoinAmount() {
            return this.coinAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCoinAmountDec() {
            return this.coinAmountDec;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCoinAmountOriginalDec() {
            return this.coinAmountOriginalDec;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getCoinId() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCurrencyAmountNew() {
            return this.currencyAmountNew;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.xZF.ActionBar
        public String getMAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenAddress() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTransferableBalance() {
            return this.transferableBalance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getVoucherToken() {
            return this.voucherToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getWalletDefaultAddress() {
            return this.walletDefaultAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.address;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.tokenAddress;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            Long l = this.coinId;
            int iHashCode3 = l == null ? 0 : l.hashCode();
            Long l2 = this.chainId;
            int iHashCode4 = l2 == null ? 0 : l2.hashCode();
            String str3 = this.coinAmount;
            int iHashCode5 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.coinAmountDec;
            int iHashCode6 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.coinAmountOriginalDec;
            int iHashCode7 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.currencyAmountNew;
            int iHashCode8 = str6 == null ? 0 : str6.hashCode();
            Boolean bool = this.isBaseCoin;
            int iHashCode9 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.voucherToken;
            int iHashCode10 = bool2 == null ? 0 : bool2.hashCode();
            String str7 = this.transferableBalance;
            int iHashCode11 = str7 == null ? 0 : str7.hashCode();
            String str8 = this.availableBalance;
            int iHashCode12 = str8 == null ? 0 : str8.hashCode();
            Boolean bool3 = this.isAptosMainCoinAssetChanged;
            return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (bool3 != null ? bool3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean isAptosMainCoinAssetChanged() {
            return this.isAptosMainCoinAssetChanged;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean isBaseCoin() {
            return this.isBaseCoin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCurrencyAmountNew(String str) {
            this.currencyAmountNew = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setWalletDefaultAddress(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.walletDefaultAddress = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubResponse(address=" + this.address + ", tokenAddress=" + this.tokenAddress + ", coinId=" + this.coinId + ", chainId=" + this.chainId + ", coinAmount=" + this.coinAmount + ", coinAmountDec=" + this.coinAmountDec + ", coinAmountOriginalDec=" + this.coinAmountOriginalDec + ", currencyAmountNew=" + this.currencyAmountNew + ", isBaseCoin=" + this.isBaseCoin + ", voucherToken=" + this.voucherToken + ", transferableBalance=" + this.transferableBalance + ", availableBalance=" + this.availableBalance + ", isAptosMainCoinAssetChanged=" + this.isAptosMainCoinAssetChanged + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.WalletCeDefiCoinAssetSubManager.SubResponse.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SubResponse> serializer() {
                return WalletCeDefiCoinAssetSubManager$SubResponse$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SubResponse(int i, String str, String str2, Long l, Long l2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, Boolean bool3, String str9, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.address = null;
            } else {
                this.address = str;
            }
            if ((i & 2) == 0) {
                this.tokenAddress = null;
            } else {
                this.tokenAddress = str2;
            }
            if ((i & 4) == 0) {
                this.coinId = null;
            } else {
                this.coinId = l;
            }
            if ((i & 8) == 0) {
                this.chainId = null;
            } else {
                this.chainId = l2;
            }
            if ((i & 16) == 0) {
                this.coinAmount = null;
            } else {
                this.coinAmount = str3;
            }
            if ((i & 32) == 0) {
                this.coinAmountDec = null;
            } else {
                this.coinAmountDec = str4;
            }
            if ((i & 64) == 0) {
                this.coinAmountOriginalDec = null;
            } else {
                this.coinAmountOriginalDec = str5;
            }
            if ((i & 128) == 0) {
                this.currencyAmountNew = null;
            } else {
                this.currencyAmountNew = str6;
            }
            if ((i & 256) == 0) {
                this.isBaseCoin = null;
            } else {
                this.isBaseCoin = bool;
            }
            if ((i & 512) == 0) {
                this.voucherToken = null;
            } else {
                this.voucherToken = bool2;
            }
            if ((i & 1024) == 0) {
                this.transferableBalance = null;
            } else {
                this.transferableBalance = str7;
            }
            if ((i & 2048) == 0) {
                this.availableBalance = null;
            } else {
                this.availableBalance = str8;
            }
            if ((i & 4096) == 0) {
                this.isAptosMainCoinAssetChanged = null;
            } else {
                this.isAptosMainCoinAssetChanged = bool3;
            }
            this.walletDefaultAddress = (i & 8192) == 0 ? "" : str9;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SubResponse subResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subResponse.address != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, subResponse.address);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || subResponse.tokenAddress != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, subResponse.tokenAddress);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || subResponse.coinId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, subResponse.coinId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || subResponse.chainId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, subResponse.chainId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || subResponse.coinAmount != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, subResponse.coinAmount);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || subResponse.coinAmountDec != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, subResponse.coinAmountDec);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || subResponse.coinAmountOriginalDec != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, subResponse.coinAmountOriginalDec);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || subResponse.currencyAmountNew != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, subResponse.currencyAmountNew);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || subResponse.isBaseCoin != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, subResponse.isBaseCoin);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || subResponse.voucherToken != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, subResponse.voucherToken);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || subResponse.transferableBalance != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, subResponse.transferableBalance);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || subResponse.availableBalance != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, subResponse.availableBalance);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || subResponse.isAptosMainCoinAssetChanged != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, subResponse.isAptosMainCoinAssetChanged);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) subResponse.walletDefaultAddress, (Object) "")) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 13, subResponse.walletDefaultAddress);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0084: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0012: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r17v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x001a: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r18v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0042: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0062: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:72) call: com.okinc.business.defi.biz.core.ws.channel.WalletCeDefiCoinAssetSubManager.SubResponse.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
        public /* synthetic */ SubResponse(String str, String str2, Long l, Long l2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) == 0 ? bool3 : null);
        }

        public SubResponse(String str, String str2, Long l, Long l2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, Boolean bool3) {
            this.address = str;
            this.tokenAddress = str2;
            this.coinId = l;
            this.chainId = l2;
            this.coinAmount = str3;
            this.coinAmountDec = str4;
            this.coinAmountOriginalDec = str5;
            this.currencyAmountNew = str6;
            this.isBaseCoin = bool;
            this.voucherToken = bool2;
            this.transferableBalance = str7;
            this.availableBalance = str8;
            this.isAptosMainCoinAssetChanged = bool3;
            this.walletDefaultAddress = "";
        }

        @Override // o.xZF.ActionBar
        public String getMUniqueId() {
            Object obj = this.coinId;
            if (obj == null) {
                obj = "";
            }
            return String.valueOf(obj);
        }

        public final boolean isDefaultAddress() {
            return Intrinsics.EZpvd((Object) this.walletDefaultAddress, (Object) this.address);
        }

        public final TokenAsset convertToTokenAsset(@NotNull AbstractC12782ctV abstractC12782ctV) {
            String holdAvgPrice;
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            C10856bwO.copydefault("wskwsk", 0, "convertToTokenAsset: " + this.coinId + ", " + this.coinAmountDec);
            C10856bwO.copydefault("wskwsk", 0, "convertToTokenAsset: " + this.address + ", " + this.tokenAddress);
            Long l = this.coinId;
            long jLongValue = l != null ? l.longValue() : 0L;
            String str = this.address;
            String str2 = str == null ? "" : str;
            if (str == null) {
                str = "";
            }
            ChainAddress chainAddressAddressFromAddress$default = AbstractC12782ctV.addressFromAddress$default(abstractC12782ctV, str, null, 2, null);
            int addressType = chainAddressAddressFromAddress$default != null ? chainAddressAddressFromAddress$default.getAddressType() : AddressType.Legacy.getValue();
            String str3 = this.coinAmount;
            String str4 = str3 == null ? "" : str3;
            String str5 = this.coinAmountDec;
            String str6 = str5 == null ? "" : str5;
            String str7 = this.currencyAmountNew;
            String str8 = str7 == null ? "" : str7;
            Boolean bool = this.voucherToken;
            TokenAsset tokenAsset = new TokenAsset(jLongValue, str2, addressType, str4, str6, str8, bool != null ? bool.booleanValue() : false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8064, (DefaultConstructorMarker) null);
            C10525bqB c10525bqBEZpvd = abstractC12782ctV.EZpvd(tokenAsset.getCoinId(), tokenAsset.getAddress());
            if (c10525bqBEZpvd != null) {
                C10856bwO.copydefault("wskwsk", 0, "convertToTokenAsset: " + c10525bqBEZpvd.OLrzqt() + ", " + c10525bqBEZpvd.valueOf());
                WalletPnlSubManager.SubResponse.PnlPushData pnlPushDataKWHzl = C11205cFp.EZpvd.sSMYrx().KWHzl(tokenAsset.getAddress(), c10525bqBEZpvd.gEmmrt(), this.tokenAddress);
                String spotBalance = pnlPushDataKWHzl != null ? pnlPushDataKWHzl.getSpotBalance() : null;
                if (spotBalance != null && spotBalance.length() != 0 && (holdAvgPrice = pnlPushDataKWHzl.getHoldAvgPrice()) != null && holdAvgPrice.length() != 0) {
                    C10856bwO.copydefault("wskwsk", 0, "spotBalance: " + pnlPushDataKWHzl.getSpotBalance() + ", holdAvgPrice:" + pnlPushDataKWHzl.getHoldAvgPrice());
                    BigDecimal bigDecimalDivB$default = C54862xYb.divB$default(this.currencyAmountNew, this.coinAmountDec, 0, null, 6, null);
                    if (C33129mqd.AEQbTJ(bigDecimalDivB$default, "0")) {
                        C10856bwO.copydefault("wskwsk", 0, "coinPrice: " + C54862xYb.convertToString$default(bigDecimalDivB$default, false, null, null, 7, null));
                        Pair<String, String> pairCopydefault = C10541bqR.OLrzqt.copydefault("subAsset", tokenAsset.getCoinAmountDec(), pnlPushDataKWHzl.getSpotBalance(), C54862xYb.convertToString$default(bigDecimalDivB$default, false, null, null, 7, null), pnlPushDataKWHzl.getHoldAvgPrice());
                        tokenAsset.setUnPnl(pairCopydefault.getFirst());
                        tokenAsset.setUnPnlYield(pairCopydefault.getSecond());
                    } else {
                        C10856bwO.copydefault("wskwsk", 0, "original pnl111: " + c10525bqBEZpvd.sSMYrx() + "," + c10525bqBEZpvd.gHZMYf());
                        tokenAsset.setUnPnl(c10525bqBEZpvd.sSMYrx());
                        tokenAsset.setUnPnlYield(c10525bqBEZpvd.gHZMYf());
                    }
                } else {
                    C10856bwO.copydefault("wskwsk", 0, "original pnl222: " + c10525bqBEZpvd.sSMYrx() + "," + c10525bqBEZpvd.gHZMYf());
                    tokenAsset.setUnPnl(c10525bqBEZpvd.sSMYrx());
                    tokenAsset.setUnPnlYield(c10525bqBEZpvd.gHZMYf());
                }
            }
            return tokenAsset;
        }
    }
}
