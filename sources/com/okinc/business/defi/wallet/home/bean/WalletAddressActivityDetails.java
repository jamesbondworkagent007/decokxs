package com.okinc.business.defi.wallet.home.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class WalletAddressActivityDetails {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String amount;
    public final Long blockHeight;
    public final Long blockTime;
    public final String chainLogo;
    public final String globalIndex;
    public final String innerGotoUrl;
    public final String mcap;
    public final String nativeTokenPrice;
    public final String openLink;
    public final String price;
    public final String riskControlLevel;
    public final String singleRealizedProfit;
    public final String tokenContractAddress;
    public final String tokenLogo;
    public final String tokenSymbol;
    public final String turnover;
    public final String txHash;
    public final Integer type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAddressActivityDetails AEQbTJ(String str, String str2, String str3, String str4, String str5, Long l, Long l2, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        return new WalletAddressActivityDetails(str, str2, str3, str4, str5, l, l2, str6, num, str7, str8, str9, str10, str11, str12, str13, str14, str15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long AEQbTJ() {
        return this.blockHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.innerGotoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.openLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.globalIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long OLrzqt() {
        return this.blockTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.nativeTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.turnover;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletAddressActivityDetails)) {
            return false;
        }
        WalletAddressActivityDetails walletAddressActivityDetails = (WalletAddressActivityDetails) obj;
        return Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) walletAddressActivityDetails.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) walletAddressActivityDetails.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) walletAddressActivityDetails.tokenSymbol) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) walletAddressActivityDetails.chainLogo) && Intrinsics.EZpvd((Object) this.txHash, (Object) walletAddressActivityDetails.txHash) && Intrinsics.EZpvd(this.blockHeight, walletAddressActivityDetails.blockHeight) && Intrinsics.EZpvd(this.blockTime, walletAddressActivityDetails.blockTime) && Intrinsics.EZpvd((Object) this.globalIndex, (Object) walletAddressActivityDetails.globalIndex) && Intrinsics.EZpvd(this.type, walletAddressActivityDetails.type) && Intrinsics.EZpvd((Object) this.amount, (Object) walletAddressActivityDetails.amount) && Intrinsics.EZpvd((Object) this.price, (Object) walletAddressActivityDetails.price) && Intrinsics.EZpvd((Object) this.turnover, (Object) walletAddressActivityDetails.turnover) && Intrinsics.EZpvd((Object) this.singleRealizedProfit, (Object) walletAddressActivityDetails.singleRealizedProfit) && Intrinsics.EZpvd((Object) this.nativeTokenPrice, (Object) walletAddressActivityDetails.nativeTokenPrice) && Intrinsics.EZpvd((Object) this.mcap, (Object) walletAddressActivityDetails.mcap) && Intrinsics.EZpvd((Object) this.innerGotoUrl, (Object) walletAddressActivityDetails.innerGotoUrl) && Intrinsics.EZpvd((Object) this.openLink, (Object) walletAddressActivityDetails.openLink) && Intrinsics.EZpvd((Object) this.riskControlLevel, (Object) walletAddressActivityDetails.riskControlLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer fJNWhG() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tokenContractAddress;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tokenLogo;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tokenSymbol;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.chainLogo;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.txHash;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        Long l = this.blockHeight;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        Long l2 = this.blockTime;
        int iHashCode7 = l2 == null ? 0 : l2.hashCode();
        String str6 = this.globalIndex;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        Integer num = this.type;
        int iHashCode9 = num == null ? 0 : num.hashCode();
        String str7 = this.amount;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.price;
        int iHashCode11 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.turnover;
        int iHashCode12 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.singleRealizedProfit;
        int iHashCode13 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.nativeTokenPrice;
        int iHashCode14 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.mcap;
        int iHashCode15 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.innerGotoUrl;
        int iHashCode16 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.openLink;
        int iHashCode17 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.riskControlLevel;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (str15 == null ? 0 : str15.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletAddressActivityDetails(tokenContractAddress=" + this.tokenContractAddress + ", tokenLogo=" + this.tokenLogo + ", tokenSymbol=" + this.tokenSymbol + ", chainLogo=" + this.chainLogo + ", txHash=" + this.txHash + ", blockHeight=" + this.blockHeight + ", blockTime=" + this.blockTime + ", globalIndex=" + this.globalIndex + ", type=" + this.type + ", amount=" + this.amount + ", price=" + this.price + ", turnover=" + this.turnover + ", singleRealizedProfit=" + this.singleRealizedProfit + ", nativeTokenPrice=" + this.nativeTokenPrice + ", mcap=" + this.mcap + ", innerGotoUrl=" + this.innerGotoUrl + ", openLink=" + this.openLink + ", riskControlLevel=" + this.riskControlLevel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.mcap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.singleRealizedProfit;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.bean.WalletAddressActivityDetails.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletAddressActivityDetails> serializer() {
            return WalletAddressActivityDetails$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletAddressActivityDetails(int i, String str, String str2, String str3, String str4, String str5, Long l, Long l2, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, SerializationConstructorMarker serializationConstructorMarker) {
        if (131071 != (i & 131071)) {
            PluginExceptionsKt.throwMissingFieldException(i, 131071, WalletAddressActivityDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenContractAddress = str;
        this.tokenLogo = str2;
        this.tokenSymbol = str3;
        this.chainLogo = str4;
        this.txHash = str5;
        this.blockHeight = l;
        this.blockTime = l2;
        this.globalIndex = str6;
        this.type = num;
        this.amount = str7;
        this.price = str8;
        this.turnover = str9;
        this.singleRealizedProfit = str10;
        this.nativeTokenPrice = str11;
        this.mcap = str12;
        this.innerGotoUrl = str13;
        this.openLink = str14;
        this.riskControlLevel = (i & 131072) == 0 ? "" : str15;
    }

    public static final /* synthetic */ void EZpvd(WalletAddressActivityDetails walletAddressActivityDetails, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, walletAddressActivityDetails.tokenContractAddress);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, walletAddressActivityDetails.tokenLogo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, walletAddressActivityDetails.tokenSymbol);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, walletAddressActivityDetails.chainLogo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, walletAddressActivityDetails.txHash);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, longSerializer, walletAddressActivityDetails.blockHeight);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, longSerializer, walletAddressActivityDetails.blockTime);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, walletAddressActivityDetails.globalIndex);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, walletAddressActivityDetails.type);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, walletAddressActivityDetails.amount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, walletAddressActivityDetails.price);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, walletAddressActivityDetails.turnover);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, walletAddressActivityDetails.singleRealizedProfit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, walletAddressActivityDetails.nativeTokenPrice);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, walletAddressActivityDetails.mcap);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, walletAddressActivityDetails.innerGotoUrl);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, walletAddressActivityDetails.openLink);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && Intrinsics.EZpvd((Object) walletAddressActivityDetails.riskControlLevel, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, walletAddressActivityDetails.riskControlLevel);
    }

    public WalletAddressActivityDetails(String str, String str2, String str3, String str4, String str5, Long l, Long l2, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.tokenContractAddress = str;
        this.tokenLogo = str2;
        this.tokenSymbol = str3;
        this.chainLogo = str4;
        this.txHash = str5;
        this.blockHeight = l;
        this.blockTime = l2;
        this.globalIndex = str6;
        this.type = num;
        this.amount = str7;
        this.price = str8;
        this.turnover = str9;
        this.singleRealizedProfit = str10;
        this.nativeTokenPrice = str11;
        this.mcap = str12;
        this.innerGotoUrl = str13;
        this.openLink = str14;
        this.riskControlLevel = str15;
    }
}
