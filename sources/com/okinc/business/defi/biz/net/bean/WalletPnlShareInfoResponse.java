package com.okinc.business.defi.biz.net.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletPnlShareInfoResponse {
    private final String averageCost;
    private final String averageSell;
    private final String balance;
    private final String boughtVolume;
    private final String chainLogoUrl;
    private final String currencyName;
    private final String currentCurrencyProfit;
    private final String currentPrice;
    private final String currentProfit;
    private final String currentProfitPercentage;
    private final List<JsonObject> kLinesData;
    private final String soldVolume;
    private final String tokenLogoUrl;
    private final String tokenSymbol;
    private final String twitterAvatar;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(JsonObjectSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletPnlShareInfoResponse() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.boughtVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.currentProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.currentProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.currentCurrencyProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.twitterAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.averageCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.soldVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.averageSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<JsonObject> component5() {
        return this.kLinesData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletPnlShareInfoResponse copy(String str, String str2, String str3, String str4, List<JsonObject> list, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        return new WalletPnlShareInfoResponse(str, str2, str3, str4, list, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletPnlShareInfoResponse)) {
            return false;
        }
        WalletPnlShareInfoResponse walletPnlShareInfoResponse = (WalletPnlShareInfoResponse) obj;
        return Intrinsics.EZpvd((Object) this.boughtVolume, (Object) walletPnlShareInfoResponse.boughtVolume) && Intrinsics.EZpvd((Object) this.averageCost, (Object) walletPnlShareInfoResponse.averageCost) && Intrinsics.EZpvd((Object) this.soldVolume, (Object) walletPnlShareInfoResponse.soldVolume) && Intrinsics.EZpvd((Object) this.averageSell, (Object) walletPnlShareInfoResponse.averageSell) && Intrinsics.EZpvd(this.kLinesData, walletPnlShareInfoResponse.kLinesData) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) walletPnlShareInfoResponse.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) walletPnlShareInfoResponse.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) walletPnlShareInfoResponse.chainLogoUrl) && Intrinsics.EZpvd((Object) this.currencyName, (Object) walletPnlShareInfoResponse.currencyName) && Intrinsics.EZpvd((Object) this.currentProfitPercentage, (Object) walletPnlShareInfoResponse.currentProfitPercentage) && Intrinsics.EZpvd((Object) this.currentProfit, (Object) walletPnlShareInfoResponse.currentProfit) && Intrinsics.EZpvd((Object) this.currentCurrencyProfit, (Object) walletPnlShareInfoResponse.currentCurrencyProfit) && Intrinsics.EZpvd((Object) this.balance, (Object) walletPnlShareInfoResponse.balance) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) walletPnlShareInfoResponse.currentPrice) && Intrinsics.EZpvd((Object) this.twitterAvatar, (Object) walletPnlShareInfoResponse.twitterAvatar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAverageCost() {
        return this.averageCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAverageSell() {
        return this.averageSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoughtVolume() {
        return this.boughtVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentCurrencyProfit() {
        return this.currentCurrencyProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentProfit() {
        return this.currentProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentProfitPercentage() {
        return this.currentProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<JsonObject> getKLinesData() {
        return this.kLinesData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSoldVolume() {
        return this.soldVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTwitterAvatar() {
        return this.twitterAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.boughtVolume;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.averageCost;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.soldVolume;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.averageSell;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        List<JsonObject> list = this.kLinesData;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        String str5 = this.tokenSymbol;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tokenLogoUrl;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.chainLogoUrl;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.currencyName;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.currentProfitPercentage;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.currentProfit;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.currentCurrencyProfit;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.balance;
        int iHashCode13 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.currentPrice;
        int iHashCode14 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.twitterAvatar;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str14 == null ? 0 : str14.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletPnlShareInfoResponse(boughtVolume=" + this.boughtVolume + ", averageCost=" + this.averageCost + ", soldVolume=" + this.soldVolume + ", averageSell=" + this.averageSell + ", kLinesData=" + this.kLinesData + ", tokenSymbol=" + this.tokenSymbol + ", tokenLogoUrl=" + this.tokenLogoUrl + ", chainLogoUrl=" + this.chainLogoUrl + ", currencyName=" + this.currencyName + ", currentProfitPercentage=" + this.currentProfitPercentage + ", currentProfit=" + this.currentProfit + ", currentCurrencyProfit=" + this.currentCurrencyProfit + ", balance=" + this.balance + ", currentPrice=" + this.currentPrice + ", twitterAvatar=" + this.twitterAvatar + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletPnlShareInfoResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletPnlShareInfoResponse> serializer() {
            return WalletPnlShareInfoResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletPnlShareInfoResponse(int i, String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.boughtVolume = null;
        } else {
            this.boughtVolume = str;
        }
        if ((i & 2) == 0) {
            this.averageCost = null;
        } else {
            this.averageCost = str2;
        }
        if ((i & 4) == 0) {
            this.soldVolume = null;
        } else {
            this.soldVolume = str3;
        }
        if ((i & 8) == 0) {
            this.averageSell = null;
        } else {
            this.averageSell = str4;
        }
        if ((i & 16) == 0) {
            this.kLinesData = null;
        } else {
            this.kLinesData = list;
        }
        if ((i & 32) == 0) {
            this.tokenSymbol = null;
        } else {
            this.tokenSymbol = str5;
        }
        if ((i & 64) == 0) {
            this.tokenLogoUrl = null;
        } else {
            this.tokenLogoUrl = str6;
        }
        if ((i & 128) == 0) {
            this.chainLogoUrl = null;
        } else {
            this.chainLogoUrl = str7;
        }
        if ((i & 256) == 0) {
            this.currencyName = null;
        } else {
            this.currencyName = str8;
        }
        if ((i & 512) == 0) {
            this.currentProfitPercentage = null;
        } else {
            this.currentProfitPercentage = str9;
        }
        if ((i & 1024) == 0) {
            this.currentProfit = null;
        } else {
            this.currentProfit = str10;
        }
        if ((i & 2048) == 0) {
            this.currentCurrencyProfit = null;
        } else {
            this.currentCurrencyProfit = str11;
        }
        if ((i & 4096) == 0) {
            this.balance = null;
        } else {
            this.balance = str12;
        }
        if ((i & 8192) == 0) {
            this.currentPrice = null;
        } else {
            this.currentPrice = str13;
        }
        if ((i & 16384) == 0) {
            this.twitterAvatar = null;
        } else {
            this.twitterAvatar = str14;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletPnlShareInfoResponse walletPnlShareInfoResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || walletPnlShareInfoResponse.boughtVolume != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, walletPnlShareInfoResponse.boughtVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || walletPnlShareInfoResponse.averageCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, walletPnlShareInfoResponse.averageCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || walletPnlShareInfoResponse.soldVolume != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, walletPnlShareInfoResponse.soldVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || walletPnlShareInfoResponse.averageSell != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, walletPnlShareInfoResponse.averageSell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || walletPnlShareInfoResponse.kLinesData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], walletPnlShareInfoResponse.kLinesData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || walletPnlShareInfoResponse.tokenSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, walletPnlShareInfoResponse.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || walletPnlShareInfoResponse.tokenLogoUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, walletPnlShareInfoResponse.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || walletPnlShareInfoResponse.chainLogoUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, walletPnlShareInfoResponse.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || walletPnlShareInfoResponse.currencyName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, walletPnlShareInfoResponse.currencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || walletPnlShareInfoResponse.currentProfitPercentage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, walletPnlShareInfoResponse.currentProfitPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || walletPnlShareInfoResponse.currentProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, walletPnlShareInfoResponse.currentProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || walletPnlShareInfoResponse.currentCurrencyProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, walletPnlShareInfoResponse.currentCurrencyProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || walletPnlShareInfoResponse.balance != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, walletPnlShareInfoResponse.balance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || walletPnlShareInfoResponse.currentPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, walletPnlShareInfoResponse.currentPrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && walletPnlShareInfoResponse.twitterAvatar == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, walletPnlShareInfoResponse.twitterAvatar);
    }

    public WalletPnlShareInfoResponse(String str, String str2, String str3, String str4, List<JsonObject> list, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.boughtVolume = str;
        this.averageCost = str2;
        this.soldVolume = str3;
        this.averageSell = str4;
        this.kLinesData = list;
        this.tokenSymbol = str5;
        this.tokenLogoUrl = str6;
        this.chainLogoUrl = str7;
        this.currencyName = str8;
        this.currentProfitPercentage = str9;
        this.currentProfit = str10;
        this.currentCurrencyProfit = str11;
        this.balance = str12;
        this.currentPrice = str13;
        this.twitterAvatar = str14;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0023: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r21v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0073: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<kotlinx.serialization.json.JsonObject>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:94) call: com.okinc.business.defi.biz.net.bean.WalletPnlShareInfoResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WalletPnlShareInfoResponse(String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) == 0 ? str14 : null);
    }
}
