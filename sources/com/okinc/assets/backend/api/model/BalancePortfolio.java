package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56391yDq;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class BalancePortfolio {
    private final List<Account> accounts;
    private final int assetStatus;
    private final List<AssetBanner> banners;
    private final Integer cedefiAccountStatus;
    private final AssetBalance crypto;
    private final AssetBalance fiat;
    private final boolean overviewSpotCostEnabled;
    private final Boolean pendingCedefiOrderExist;
    private final long period;
    private final String pnl;
    private final Long pnlLastUpdate;
    private final Long pnlPeriodStartTime;
    private final String pnlRate;
    private final Boolean recentlyMigrated;
    private final Long todayPnlStartTime;
    private final String totalValuation;
    private final String unitToUSDRate;
    private final List<String> valuationList;
    private final String valuationUnit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(BalancePortfolio$Account$$serializer.INSTANCE), null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), new ArrayListSerializer(BalancePortfolio$AssetBanner$$serializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BalancePortfolio() {
        this(0, (String) null, (String) null, (String) null, 0L, (String) null, (String) null, (Long) null, (Long) null, (List) null, (AssetBalance) null, (AssetBalance) null, (Long) null, false, (List) null, (List) null, (Boolean) null, (Integer) null, (Boolean) null, 524287, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.assetStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Account> component10() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetBalance component11() {
        return this.crypto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetBalance component12() {
        return this.fiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component13() {
        return this.todayPnlStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.overviewSpotCostEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component15() {
        return this.valuationList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AssetBanner> component16() {
        return this.banners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component17() {
        return this.recentlyMigrated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component18() {
        return this.cedefiAccountStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component19() {
        return this.pendingCedefiOrderExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.unitToUSDRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.pnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.pnlPeriodStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.pnlLastUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BalancePortfolio copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, @NotNull String str5, Long l, Long l2, @NotNull List<Account> list, AssetBalance assetBalance, AssetBalance assetBalance2, Long l3, boolean z, List<String> list2, List<AssetBanner> list3, Boolean bool, Integer num, Boolean bool2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new BalancePortfolio(i, str, str2, str3, j, str4, str5, l, l2, list, assetBalance, assetBalance2, l3, z, list2, list3, bool, num, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalancePortfolio)) {
            return false;
        }
        BalancePortfolio balancePortfolio = (BalancePortfolio) obj;
        return this.assetStatus == balancePortfolio.assetStatus && Intrinsics.EZpvd((Object) this.valuationUnit, (Object) balancePortfolio.valuationUnit) && Intrinsics.EZpvd((Object) this.unitToUSDRate, (Object) balancePortfolio.unitToUSDRate) && Intrinsics.EZpvd((Object) this.totalValuation, (Object) balancePortfolio.totalValuation) && this.period == balancePortfolio.period && Intrinsics.EZpvd((Object) this.pnl, (Object) balancePortfolio.pnl) && Intrinsics.EZpvd((Object) this.pnlRate, (Object) balancePortfolio.pnlRate) && Intrinsics.EZpvd(this.pnlPeriodStartTime, balancePortfolio.pnlPeriodStartTime) && Intrinsics.EZpvd(this.pnlLastUpdate, balancePortfolio.pnlLastUpdate) && Intrinsics.EZpvd(this.accounts, balancePortfolio.accounts) && Intrinsics.EZpvd(this.crypto, balancePortfolio.crypto) && Intrinsics.EZpvd(this.fiat, balancePortfolio.fiat) && Intrinsics.EZpvd(this.todayPnlStartTime, balancePortfolio.todayPnlStartTime) && this.overviewSpotCostEnabled == balancePortfolio.overviewSpotCostEnabled && Intrinsics.EZpvd(this.valuationList, balancePortfolio.valuationList) && Intrinsics.EZpvd(this.banners, balancePortfolio.banners) && Intrinsics.EZpvd(this.recentlyMigrated, balancePortfolio.recentlyMigrated) && Intrinsics.EZpvd(this.cedefiAccountStatus, balancePortfolio.cedefiAccountStatus) && Intrinsics.EZpvd(this.pendingCedefiOrderExist, balancePortfolio.pendingCedefiOrderExist);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Account> getAccounts() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAssetStatus() {
        return this.assetStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AssetBanner> getBanners() {
        return this.banners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCedefiAccountStatus() {
        return this.cedefiAccountStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetBalance getCrypto() {
        return this.crypto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetBalance getFiat() {
        return this.fiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOverviewSpotCostEnabled() {
        return this.overviewSpotCostEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPendingCedefiOrderExist() {
        return this.pendingCedefiOrderExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getPnlLastUpdate() {
        return this.pnlLastUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getPnlPeriodStartTime() {
        return this.pnlPeriodStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRate() {
        return this.pnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getRecentlyMigrated() {
        return this.recentlyMigrated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTodayPnlStartTime() {
        return this.todayPnlStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalValuation() {
        return this.totalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnitToUSDRate() {
        return this.unitToUSDRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getValuationList() {
        return this.valuationList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuationUnit() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.assetStatus);
        int iHashCode2 = this.valuationUnit.hashCode();
        int iHashCode3 = this.unitToUSDRate.hashCode();
        int iHashCode4 = this.totalValuation.hashCode();
        int iHashCode5 = Long.hashCode(this.period);
        int iHashCode6 = this.pnl.hashCode();
        int iHashCode7 = this.pnlRate.hashCode();
        Long l = this.pnlPeriodStartTime;
        int iHashCode8 = l == null ? 0 : l.hashCode();
        Long l2 = this.pnlLastUpdate;
        int iHashCode9 = l2 == null ? 0 : l2.hashCode();
        int iHashCode10 = this.accounts.hashCode();
        AssetBalance assetBalance = this.crypto;
        int iHashCode11 = assetBalance == null ? 0 : assetBalance.hashCode();
        AssetBalance assetBalance2 = this.fiat;
        int iHashCode12 = assetBalance2 == null ? 0 : assetBalance2.hashCode();
        Long l3 = this.todayPnlStartTime;
        int iHashCode13 = l3 == null ? 0 : l3.hashCode();
        int iHashCode14 = Boolean.hashCode(this.overviewSpotCostEnabled);
        List<String> list = this.valuationList;
        int iHashCode15 = list == null ? 0 : list.hashCode();
        List<AssetBanner> list2 = this.banners;
        int iHashCode16 = list2 == null ? 0 : list2.hashCode();
        Boolean bool = this.recentlyMigrated;
        int iHashCode17 = bool == null ? 0 : bool.hashCode();
        Integer num = this.cedefiAccountStatus;
        int iHashCode18 = num == null ? 0 : num.hashCode();
        Boolean bool2 = this.pendingCedefiOrderExist;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (bool2 == null ? 0 : bool2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BalancePortfolio(assetStatus=" + this.assetStatus + ", valuationUnit=" + this.valuationUnit + ", unitToUSDRate=" + this.unitToUSDRate + ", totalValuation=" + this.totalValuation + ", period=" + this.period + ", pnl=" + this.pnl + ", pnlRate=" + this.pnlRate + ", pnlPeriodStartTime=" + this.pnlPeriodStartTime + ", pnlLastUpdate=" + this.pnlLastUpdate + ", accounts=" + this.accounts + ", crypto=" + this.crypto + ", fiat=" + this.fiat + ", todayPnlStartTime=" + this.todayPnlStartTime + ", overviewSpotCostEnabled=" + this.overviewSpotCostEnabled + ", valuationList=" + this.valuationList + ", banners=" + this.banners + ", recentlyMigrated=" + this.recentlyMigrated + ", cedefiAccountStatus=" + this.cedefiAccountStatus + ", pendingCedefiOrderExist=" + this.pendingCedefiOrderExist + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.BalancePortfolio.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BalancePortfolio> serializer() {
            return BalancePortfolio$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BalancePortfolio(int i, int i2, String str, String str2, String str3, long j, String str4, String str5, Long l, Long l2, List list, AssetBalance assetBalance, AssetBalance assetBalance2, Long l3, boolean z, List list2, List list3, Boolean bool, Integer num, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.assetStatus = 0;
        } else {
            this.assetStatus = i2;
        }
        if ((i & 2) == 0) {
            this.valuationUnit = "";
        } else {
            this.valuationUnit = str;
        }
        if ((i & 4) == 0) {
            this.unitToUSDRate = "";
        } else {
            this.unitToUSDRate = str2;
        }
        if ((i & 8) == 0) {
            this.totalValuation = "";
        } else {
            this.totalValuation = str3;
        }
        this.period = (i & 16) == 0 ? 0L : j;
        if ((i & 32) == 0) {
            this.pnl = "";
        } else {
            this.pnl = str4;
        }
        if ((i & 64) == 0) {
            this.pnlRate = "";
        } else {
            this.pnlRate = str5;
        }
        if ((i & 128) == 0) {
            this.pnlPeriodStartTime = null;
        } else {
            this.pnlPeriodStartTime = l;
        }
        if ((i & 256) == 0) {
            this.pnlLastUpdate = null;
        } else {
            this.pnlLastUpdate = l2;
        }
        this.accounts = (i & 512) == 0 ? yDY.AhwBna() : list;
        if ((i & 1024) == 0) {
            this.crypto = null;
        } else {
            this.crypto = assetBalance;
        }
        if ((i & 2048) == 0) {
            this.fiat = null;
        } else {
            this.fiat = assetBalance2;
        }
        if ((i & 4096) == 0) {
            this.todayPnlStartTime = null;
        } else {
            this.todayPnlStartTime = l3;
        }
        if ((i & 8192) == 0) {
            this.overviewSpotCostEnabled = false;
        } else {
            this.overviewSpotCostEnabled = z;
        }
        if ((i & 16384) == 0) {
            this.valuationList = null;
        } else {
            this.valuationList = list2;
        }
        if ((32768 & i) == 0) {
            this.banners = null;
        } else {
            this.banners = list3;
        }
        if ((65536 & i) == 0) {
            this.recentlyMigrated = null;
        } else {
            this.recentlyMigrated = bool;
        }
        this.cedefiAccountStatus = (131072 & i) == 0 ? -1 : num;
        this.pendingCedefiOrderExist = (i & 262144) == 0 ? Boolean.FALSE : bool2;
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(BalancePortfolio balancePortfolio, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || balancePortfolio.assetStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, balancePortfolio.assetStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) balancePortfolio.valuationUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, balancePortfolio.valuationUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) balancePortfolio.unitToUSDRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, balancePortfolio.unitToUSDRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) balancePortfolio.totalValuation, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, balancePortfolio.totalValuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || balancePortfolio.period != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 4, balancePortfolio.period);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) balancePortfolio.pnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, balancePortfolio.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) balancePortfolio.pnlRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, balancePortfolio.pnlRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || balancePortfolio.pnlPeriodStartTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, balancePortfolio.pnlPeriodStartTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || balancePortfolio.pnlLastUpdate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, balancePortfolio.pnlLastUpdate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(balancePortfolio.accounts, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], balancePortfolio.accounts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || balancePortfolio.crypto != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BalancePortfolio$AssetBalance$$serializer.INSTANCE, balancePortfolio.crypto);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || balancePortfolio.fiat != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BalancePortfolio$AssetBalance$$serializer.INSTANCE, balancePortfolio.fiat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || balancePortfolio.todayPnlStartTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, LongSerializer.INSTANCE, balancePortfolio.todayPnlStartTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || balancePortfolio.overviewSpotCostEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, balancePortfolio.overviewSpotCostEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || balancePortfolio.valuationList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr[14], balancePortfolio.valuationList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || balancePortfolio.banners != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, kSerializerArr[15], balancePortfolio.banners);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || balancePortfolio.recentlyMigrated != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, balancePortfolio.recentlyMigrated);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || (num = balancePortfolio.cedefiAccountStatus) == null || num.intValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, balancePortfolio.cedefiAccountStatus);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && Intrinsics.EZpvd(balancePortfolio.pendingCedefiOrderExist, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, balancePortfolio.pendingCedefiOrderExist);
    }

    public BalancePortfolio(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, @NotNull String str5, Long l, Long l2, @NotNull List<Account> list, AssetBalance assetBalance, AssetBalance assetBalance2, Long l3, boolean z, List<String> list2, List<AssetBanner> list3, Boolean bool, Integer num, Boolean bool2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.assetStatus = i;
        this.valuationUnit = str;
        this.unitToUSDRate = str2;
        this.totalValuation = str3;
        this.period = j;
        this.pnl = str4;
        this.pnlRate = str5;
        this.pnlPeriodStartTime = l;
        this.pnlLastUpdate = l2;
        this.accounts = list;
        this.crypto = assetBalance;
        this.fiat = assetBalance2;
        this.todayPnlStartTime = l3;
        this.overviewSpotCostEnabled = z;
        this.valuationList = list2;
        this.banners = list3;
        this.recentlyMigrated = bool;
        this.cedefiAccountStatus = num;
        this.pendingCedefiOrderExist = bool2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00da: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r41v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r21v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r41v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r41v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r41v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r41v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r25v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r41v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r41v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r28v0 java.lang.String) : (""))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x003c: ARITH (r41v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r29v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0044: ARITH (r41v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r30v0 java.lang.Long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004c: ARITH (r41v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0050: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:20)) : (r31v0 java.util.List))
  (wrap:com.okinc.assets.backend.api.model.BalancePortfolio$AssetBalance:?: TERNARY null = ((wrap:int:0x0057: ARITH (r41v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.BalancePortfolio$AssetBalance) : (r32v0 com.okinc.assets.backend.api.model.BalancePortfolio$AssetBalance))
  (wrap:com.okinc.assets.backend.api.model.BalancePortfolio$AssetBalance:?: TERNARY null = ((wrap:int:0x005f: ARITH (r41v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.BalancePortfolio$AssetBalance) : (r33v0 com.okinc.assets.backend.api.model.BalancePortfolio$AssetBalance))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0067: ARITH (r41v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r34v0 java.lang.Long))
  (wrap:boolean:0x0077: TERNARY null = ((wrap:int:0x006f: ARITH (r41v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0079: ARITH (r41v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r36v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0084: ARITH (r41v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r37v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x008f: ARITH (r41v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r38v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x009a: ARITH (r41v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r39v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r41v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ad: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r40v0 java.lang.Boolean))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.util.List<com.okinc.assets.backend.api.model.BalancePortfolio$Account>, com.okinc.assets.backend.api.model.BalancePortfolio$AssetBalance, com.okinc.assets.backend.api.model.BalancePortfolio$AssetBalance, java.lang.Long, boolean, java.util.List<java.lang.String>, java.util.List<com.okinc.assets.backend.api.model.BalancePortfolio$AssetBanner>, java.lang.Boolean, java.lang.Integer, java.lang.Boolean):void (m)] (LINE:10) call: com.okinc.assets.backend.api.model.BalancePortfolio.<init>(int, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.util.List, com.okinc.assets.backend.api.model.BalancePortfolio$AssetBalance, com.okinc.assets.backend.api.model.BalancePortfolio$AssetBalance, java.lang.Long, boolean, java.util.List, java.util.List, java.lang.Boolean, java.lang.Integer, java.lang.Boolean):void type: THIS */
    public /* synthetic */ BalancePortfolio(int i, String str, String str2, String str3, long j, String str4, String str5, Long l, Long l2, List list, AssetBalance assetBalance, AssetBalance assetBalance2, Long l3, boolean z, List list2, List list3, Boolean bool, Integer num, Boolean bool2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 0L : j, (i2 & 32) != 0 ? "" : str4, (i2 & 64) == 0 ? str5 : "", (i2 & 128) != 0 ? null : l, (i2 & 256) != 0 ? null : l2, (i2 & 512) != 0 ? yDY.AhwBna() : list, (i2 & 1024) != 0 ? null : assetBalance, (i2 & 2048) != 0 ? null : assetBalance2, (i2 & 4096) != 0 ? null : l3, (i2 & 8192) != 0 ? false : z, (i2 & 16384) != 0 ? null : list2, (i2 & 32768) != 0 ? null : list3, (i2 & 65536) != 0 ? null : bool, (i2 & 131072) != 0 ? -1 : num, (i2 & 262144) != 0 ? Boolean.FALSE : bool2);
    }

    public final AssetStatus getAssetStatusEnum() {
        return AssetStatus.Companion.EZpvd(this.assetStatus);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AssetStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ AssetStatus[] $VALUES;
        public static final TaskDescription Companion;
        public static final AssetStatus NeverDeposited = new AssetStatus("NeverDeposited", 0);
        public static final AssetStatus ZeroBalance = new AssetStatus("ZeroBalance", 1);
        public static final AssetStatus HasAssets = new AssetStatus("HasAssets", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ AssetStatus[] $values() {
            return new AssetStatus[]{NeverDeposited, ZeroBalance, HasAssets};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<AssetStatus> getEntries() {
            return $ENTRIES;
        }

        private AssetStatus(String str, int i) {
        }

        static {
            AssetStatus[] assetStatusArr$values = $values();
            $VALUES = assetStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(assetStatusArr$values);
            Companion = new TaskDescription(null);
        }

        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.BalancePortfolio.AssetStatus.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }

            public final AssetStatus EZpvd(int i) {
                Object objM7377constructorimpl;
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(AssetStatus.values()[i]);
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    objM7377constructorimpl = AssetStatus.NeverDeposited;
                }
                return (AssetStatus) objM7377constructorimpl;
            }
        }

        public static AssetStatus valueOf(String str) {
            return (AssetStatus) Enum.valueOf(AssetStatus.class, str);
        }

        public static AssetStatus[] values() {
            return (AssetStatus[]) $VALUES.clone();
        }
    }

    @Serializable
    public static final class Account {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final Boolean canBuy;
        private final Boolean canDeposit;
        private final Boolean canEarn;
        private final Boolean canLoan;
        private final Boolean canReserve;
        private final Boolean canTrade;
        private final Boolean canTransfer;
        private final Boolean canWithdraw;
        private final String icon;
        private final String rate;
        private final int sortOrder;
        private final int target;
        private final String valuation;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.target;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component10() {
            return this.canLoan;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component11() {
            return this.canReserve;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component12() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component13() {
            return this.sortOrder;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.valuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.rate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component4() {
            return this.canDeposit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component5() {
            return this.canWithdraw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component6() {
            return this.canTransfer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component7() {
            return this.canBuy;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component8() {
            return this.canTrade;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component9() {
            return this.canEarn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Account copy(int i, @NotNull String str, @NotNull String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str3, int i2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Account(i, str, str2, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, str3, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Account)) {
                return false;
            }
            Account account = (Account) obj;
            return this.target == account.target && Intrinsics.EZpvd((Object) this.valuation, (Object) account.valuation) && Intrinsics.EZpvd((Object) this.rate, (Object) account.rate) && Intrinsics.EZpvd(this.canDeposit, account.canDeposit) && Intrinsics.EZpvd(this.canWithdraw, account.canWithdraw) && Intrinsics.EZpvd(this.canTransfer, account.canTransfer) && Intrinsics.EZpvd(this.canBuy, account.canBuy) && Intrinsics.EZpvd(this.canTrade, account.canTrade) && Intrinsics.EZpvd(this.canEarn, account.canEarn) && Intrinsics.EZpvd(this.canLoan, account.canLoan) && Intrinsics.EZpvd(this.canReserve, account.canReserve) && Intrinsics.EZpvd((Object) this.icon, (Object) account.icon) && this.sortOrder == account.sortOrder;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getCanBuy() {
            return this.canBuy;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getCanDeposit() {
            return this.canDeposit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getCanEarn() {
            return this.canEarn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getCanLoan() {
            return this.canLoan;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getCanReserve() {
            return this.canReserve;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getCanTrade() {
            return this.canTrade;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getCanTransfer() {
            return this.canTransfer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getCanWithdraw() {
            return this.canWithdraw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRate() {
            return this.rate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getSortOrder() {
            return this.sortOrder;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTarget() {
            return this.target;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValuation() {
            return this.valuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.target);
            int iHashCode2 = this.valuation.hashCode();
            int iHashCode3 = this.rate.hashCode();
            Boolean bool = this.canDeposit;
            int iHashCode4 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.canWithdraw;
            int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
            Boolean bool3 = this.canTransfer;
            int iHashCode6 = bool3 == null ? 0 : bool3.hashCode();
            Boolean bool4 = this.canBuy;
            int iHashCode7 = bool4 == null ? 0 : bool4.hashCode();
            Boolean bool5 = this.canTrade;
            int iHashCode8 = bool5 == null ? 0 : bool5.hashCode();
            Boolean bool6 = this.canEarn;
            int iHashCode9 = bool6 == null ? 0 : bool6.hashCode();
            Boolean bool7 = this.canLoan;
            int iHashCode10 = bool7 == null ? 0 : bool7.hashCode();
            Boolean bool8 = this.canReserve;
            int iHashCode11 = bool8 == null ? 0 : bool8.hashCode();
            String str = this.icon;
            return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.sortOrder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Account(target=" + this.target + ", valuation=" + this.valuation + ", rate=" + this.rate + ", canDeposit=" + this.canDeposit + ", canWithdraw=" + this.canWithdraw + ", canTransfer=" + this.canTransfer + ", canBuy=" + this.canBuy + ", canTrade=" + this.canTrade + ", canEarn=" + this.canEarn + ", canLoan=" + this.canLoan + ", canReserve=" + this.canReserve + ", icon=" + this.icon + ", sortOrder=" + this.sortOrder + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.BalancePortfolio.Account.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Account> serializer() {
                return BalancePortfolio$Account$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Account(int i, int i2, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str3, int i3, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, BalancePortfolio$Account$$serializer.INSTANCE.getDescriptor());
            }
            this.target = i2;
            this.valuation = str;
            this.rate = str2;
            if ((i & 8) == 0) {
                this.canDeposit = null;
            } else {
                this.canDeposit = bool;
            }
            if ((i & 16) == 0) {
                this.canWithdraw = null;
            } else {
                this.canWithdraw = bool2;
            }
            if ((i & 32) == 0) {
                this.canTransfer = null;
            } else {
                this.canTransfer = bool3;
            }
            if ((i & 64) == 0) {
                this.canBuy = null;
            } else {
                this.canBuy = bool4;
            }
            if ((i & 128) == 0) {
                this.canTrade = null;
            } else {
                this.canTrade = bool5;
            }
            if ((i & 256) == 0) {
                this.canEarn = null;
            } else {
                this.canEarn = bool6;
            }
            if ((i & 512) == 0) {
                this.canLoan = null;
            } else {
                this.canLoan = bool7;
            }
            if ((i & 1024) == 0) {
                this.canReserve = null;
            } else {
                this.canReserve = bool8;
            }
            if ((i & 2048) == 0) {
                this.icon = null;
            } else {
                this.icon = str3;
            }
            this.sortOrder = (i & 4096) == 0 ? 0 : i3;
        }

        public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(Account account, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, account.target);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, account.valuation);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, account.rate);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || account.canDeposit != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, account.canDeposit);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || account.canWithdraw != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, account.canWithdraw);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || account.canTransfer != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, account.canTransfer);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || account.canBuy != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, account.canBuy);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || account.canTrade != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, account.canTrade);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || account.canEarn != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, account.canEarn);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || account.canLoan != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, account.canLoan);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || account.canReserve != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, account.canReserve);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || account.icon != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, account.icon);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && account.sortOrder == 0) {
                return;
            }
            compositeEncoder.encodeIntElement(serialDescriptor, 12, account.sortOrder);
        }

        public Account(int i, @NotNull String str, @NotNull String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str3, int i2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.target = i;
            this.valuation = str;
            this.rate = str2;
            this.canDeposit = bool;
            this.canWithdraw = bool2;
            this.canTransfer = bool3;
            this.canBuy = bool4;
            this.canTrade = bool5;
            this.canEarn = bool6;
            this.canLoan = bool7;
            this.canReserve = bool8;
            this.icon = str3;
            this.sortOrder = i2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005d: CONSTRUCTOR 
  (r18v0 int)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r22v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002b: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r26v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0033: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003b: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r28v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004b: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r30v0 int))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, int):void (m)] (LINE:53) call: com.okinc.assets.backend.api.model.BalancePortfolio.Account.<init>(int, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, int):void type: THIS */
        public /* synthetic */ Account(int i, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2, (i3 & 8) != 0 ? null : bool, (i3 & 16) != 0 ? null : bool2, (i3 & 32) != 0 ? null : bool3, (i3 & 64) != 0 ? null : bool4, (i3 & 128) != 0 ? null : bool5, (i3 & 256) != 0 ? null : bool6, (i3 & 512) != 0 ? null : bool7, (i3 & 1024) != 0 ? null : bool8, (i3 & 2048) != 0 ? null : str3, (i3 & 4096) != 0 ? 0 : i2);
        }
    }

    @Serializable
    public static final class AssetBalance {
        private final List<Asset> balances;
        private final String totalValuation;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(BalancePortfolio$Asset$$serializer.INSTANCE)};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssetBalance() {
            this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.BalancePortfolio$AssetBalance */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AssetBalance copy$default(AssetBalance assetBalance, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = assetBalance.totalValuation;
            }
            if ((i & 2) != 0) {
                list = assetBalance.balances;
            }
            return assetBalance.copy(str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.totalValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Asset> component2() {
            return this.balances;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssetBalance copy(@NotNull String str, @NotNull List<Asset> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new AssetBalance(str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssetBalance)) {
                return false;
            }
            AssetBalance assetBalance = (AssetBalance) obj;
            return Intrinsics.EZpvd((Object) this.totalValuation, (Object) assetBalance.totalValuation) && Intrinsics.EZpvd(this.balances, assetBalance.balances);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Asset> getBalances() {
            return this.balances;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTotalValuation() {
            return this.totalValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.totalValuation.hashCode() * 31) + this.balances.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AssetBalance(totalValuation=" + this.totalValuation + ", balances=" + this.balances + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.BalancePortfolio.AssetBalance.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<AssetBalance> serializer() {
                return BalancePortfolio$AssetBalance$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ AssetBalance(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
            this.totalValuation = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.balances = yDY.AhwBna();
            } else {
                this.balances = list;
            }
        }

        public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(AssetBalance assetBalance, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) assetBalance.totalValuation, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, assetBalance.totalValuation);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(assetBalance.balances, yDY.AhwBna())) {
                return;
            }
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], assetBalance.balances);
        }

        public AssetBalance(@NotNull String str, @NotNull List<Asset> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.totalValuation = str;
            this.balances = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:75)) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.assets.backend.api.model.BalancePortfolio$Asset>):void (m)] (LINE:73) call: com.okinc.assets.backend.api.model.BalancePortfolio.AssetBalance.<init>(java.lang.String, java.util.List):void type: THIS */
        public /* synthetic */ AssetBalance(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list);
        }
    }

    @Serializable
    public static final class AssetBanner {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final Integer businessType;
        private final String darkIcon;
        private final String deepLink;
        private final String icon;
        private final String maxAprStr;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssetBanner() {
            this((Integer) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AssetBanner copy$default(AssetBanner assetBanner, Integer num, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                num = assetBanner.businessType;
            }
            if ((i & 2) != 0) {
                str = assetBanner.deepLink;
            }
            String str5 = str;
            if ((i & 4) != 0) {
                str2 = assetBanner.icon;
            }
            String str6 = str2;
            if ((i & 8) != 0) {
                str3 = assetBanner.darkIcon;
            }
            String str7 = str3;
            if ((i & 16) != 0) {
                str4 = assetBanner.maxAprStr;
            }
            return assetBanner.copy(num, str5, str6, str7, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component1() {
            return this.businessType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.deepLink;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.darkIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.maxAprStr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssetBanner copy(Integer num, String str, String str2, String str3, String str4) {
            return new AssetBanner(num, str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssetBanner)) {
                return false;
            }
            AssetBanner assetBanner = (AssetBanner) obj;
            return Intrinsics.EZpvd(this.businessType, assetBanner.businessType) && Intrinsics.EZpvd((Object) this.deepLink, (Object) assetBanner.deepLink) && Intrinsics.EZpvd((Object) this.icon, (Object) assetBanner.icon) && Intrinsics.EZpvd((Object) this.darkIcon, (Object) assetBanner.darkIcon) && Intrinsics.EZpvd((Object) this.maxAprStr, (Object) assetBanner.maxAprStr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getBusinessType() {
            return this.businessType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDarkIcon() {
            return this.darkIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDeepLink() {
            return this.deepLink;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMaxAprStr() {
            return this.maxAprStr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.businessType;
            int iHashCode = num == null ? 0 : num.hashCode();
            String str = this.deepLink;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.icon;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.darkIcon;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.maxAprStr;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AssetBanner(businessType=" + this.businessType + ", deepLink=" + this.deepLink + ", icon=" + this.icon + ", darkIcon=" + this.darkIcon + ", maxAprStr=" + this.maxAprStr + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.BalancePortfolio.AssetBanner.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<AssetBanner> serializer() {
                return BalancePortfolio$AssetBanner$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ AssetBanner(int i, Integer num, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            this.businessType = (i & 1) == 0 ? 0 : num;
            if ((i & 2) == 0) {
                this.deepLink = "";
            } else {
                this.deepLink = str;
            }
            if ((i & 4) == 0) {
                this.icon = "";
            } else {
                this.icon = str2;
            }
            if ((i & 8) == 0) {
                this.darkIcon = "";
            } else {
                this.darkIcon = str3;
            }
            if ((i & 16) == 0) {
                this.maxAprStr = "";
            } else {
                this.maxAprStr = str4;
            }
        }

        public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(AssetBanner assetBanner, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            Integer num;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num = assetBanner.businessType) == null || num.intValue() != 0) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, assetBanner.businessType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) assetBanner.deepLink, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, assetBanner.deepLink);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) assetBanner.icon, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, assetBanner.icon);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) assetBanner.darkIcon, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, assetBanner.darkIcon);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) assetBanner.maxAprStr, (Object) "")) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, assetBanner.maxAprStr);
        }

        public AssetBanner(Integer num, String str, String str2, String str3, String str4) {
            this.businessType = num;
            this.deepLink = str;
            this.icon = str2;
            this.darkIcon = str3;
            this.maxAprStr = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:80) call: com.okinc.assets.backend.api.model.BalancePortfolio.AssetBanner.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ AssetBanner(Integer num, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "");
        }
    }

    @Serializable
    public static final class Asset {
        private final String accAvgPx;
        private final String balance;
        private final List<BalanceDistribution> balanceDistribution;
        private final boolean canRecharge;
        private final boolean canTransfer;
        private final boolean canWithdraw;
        private final Boolean cedefi;
        private final String cedefiPnl;
        private final String cedefiPnlRate;
        private final String chainIcon;
        private final String chainIndex;
        private final String chainName;
        private final String currency;
        private final int currencyId;
        private final String earnMaxAprStr;
        private final Boolean fiatCategory;
        private final String fullName;
        private final String fundingBalance;
        private final String growBalance;
        private final Boolean hideOverviewPnl;
        private final String icon;
        private final boolean isEntitySupported;
        private String openAvgPx;
        private final String overviewOpenAvgPxValuation;
        private final String overviewSpotBal;
        private final String overviewSpotUplRatio;
        private final String overviewSpotUplValuation;
        private final String pnlPercentage;
        private final String pnlValue;
        private final RedeemInfo redeemInfo;
        private final Integer riskLevel;
        private final String sign;
        private String spotBal;
        private String spotUpl;
        private String spotUplRatio;
        private final boolean stable;
        private final String tokenAddress;
        private String totalPnl;
        private String totalPnlRatio;
        private final boolean tradable;
        private final String tradingBalance;
        private final String unitCost;
        private final String unitPrice;
        private final String unitPriceValuation;
        private final String usdValuation;
        private final String valuation;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(BalancePortfolio$BalanceDistribution$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Asset() {
            this((String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (RedeemInfo) null, (Boolean) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, -1, 16383, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.accAvgPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.sign;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component11() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component12() {
            return this.tradable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component13() {
            return this.usdValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component14() {
            return this.chainName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component15() {
            return this.unitCost;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component16() {
            return this.unitPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component17() {
            return this.pnlValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component18() {
            return this.pnlPercentage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component19() {
            return this.isEntitySupported;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.balance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component20() {
            return this.canRecharge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component21() {
            return this.canTransfer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component22() {
            return this.canWithdraw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component23() {
            return this.spotBal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component24() {
            return this.openAvgPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component25() {
            return this.spotUpl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component26() {
            return this.spotUplRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component27() {
            return this.totalPnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component28() {
            return this.totalPnlRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component29() {
            return this.stable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.currency;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<BalanceDistribution> component30() {
            return this.balanceDistribution;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component31() {
            return this.overviewOpenAvgPxValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component32() {
            return this.overviewSpotUplValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component33() {
            return this.overviewSpotUplRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component34() {
            return this.unitPriceValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component35() {
            return this.overviewSpotBal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component36() {
            return this.earnMaxAprStr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component37() {
            return this.fiatCategory;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RedeemInfo component38() {
            return this.redeemInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component39() {
            return this.hideOverviewPnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component4() {
            return this.currencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component40() {
            return this.chainIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component41() {
            return this.cedefi;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component42() {
            return this.cedefiPnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component43() {
            return this.cedefiPnlRate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component44() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component45() {
            return this.chainIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component46() {
            return this.riskLevel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.valuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.tradingBalance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.fundingBalance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.growBalance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.fullName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Asset copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, String str10, boolean z, String str11, String str12, String str13, String str14, String str15, String str16, boolean z2, boolean z3, boolean z4, boolean z5, String str17, String str18, String str19, String str20, String str21, String str22, boolean z6, List<BalanceDistribution> list, String str23, String str24, String str25, String str26, String str27, String str28, Boolean bool, RedeemInfo redeemInfo, Boolean bool2, String str29, Boolean bool3, String str30, String str31, String str32, String str33, Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            return new Asset(str, str2, str3, i, str4, str5, str6, str7, str8, str9, str10, z, str11, str12, str13, str14, str15, str16, z2, z3, z4, z5, str17, str18, str19, str20, str21, str22, z6, list, str23, str24, str25, str26, str27, str28, bool, redeemInfo, bool2, str29, bool3, str30, str31, str32, str33, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Asset)) {
                return false;
            }
            Asset asset = (Asset) obj;
            return Intrinsics.EZpvd((Object) this.accAvgPx, (Object) asset.accAvgPx) && Intrinsics.EZpvd((Object) this.balance, (Object) asset.balance) && Intrinsics.EZpvd((Object) this.currency, (Object) asset.currency) && this.currencyId == asset.currencyId && Intrinsics.EZpvd((Object) this.valuation, (Object) asset.valuation) && Intrinsics.EZpvd((Object) this.tradingBalance, (Object) asset.tradingBalance) && Intrinsics.EZpvd((Object) this.fundingBalance, (Object) asset.fundingBalance) && Intrinsics.EZpvd((Object) this.growBalance, (Object) asset.growBalance) && Intrinsics.EZpvd((Object) this.fullName, (Object) asset.fullName) && Intrinsics.EZpvd((Object) this.sign, (Object) asset.sign) && Intrinsics.EZpvd((Object) this.icon, (Object) asset.icon) && this.tradable == asset.tradable && Intrinsics.EZpvd((Object) this.usdValuation, (Object) asset.usdValuation) && Intrinsics.EZpvd((Object) this.chainName, (Object) asset.chainName) && Intrinsics.EZpvd((Object) this.unitCost, (Object) asset.unitCost) && Intrinsics.EZpvd((Object) this.unitPrice, (Object) asset.unitPrice) && Intrinsics.EZpvd((Object) this.pnlValue, (Object) asset.pnlValue) && Intrinsics.EZpvd((Object) this.pnlPercentage, (Object) asset.pnlPercentage) && this.isEntitySupported == asset.isEntitySupported && this.canRecharge == asset.canRecharge && this.canTransfer == asset.canTransfer && this.canWithdraw == asset.canWithdraw && Intrinsics.EZpvd((Object) this.spotBal, (Object) asset.spotBal) && Intrinsics.EZpvd((Object) this.openAvgPx, (Object) asset.openAvgPx) && Intrinsics.EZpvd((Object) this.spotUpl, (Object) asset.spotUpl) && Intrinsics.EZpvd((Object) this.spotUplRatio, (Object) asset.spotUplRatio) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) asset.totalPnl) && Intrinsics.EZpvd((Object) this.totalPnlRatio, (Object) asset.totalPnlRatio) && this.stable == asset.stable && Intrinsics.EZpvd(this.balanceDistribution, asset.balanceDistribution) && Intrinsics.EZpvd((Object) this.overviewOpenAvgPxValuation, (Object) asset.overviewOpenAvgPxValuation) && Intrinsics.EZpvd((Object) this.overviewSpotUplValuation, (Object) asset.overviewSpotUplValuation) && Intrinsics.EZpvd((Object) this.overviewSpotUplRatio, (Object) asset.overviewSpotUplRatio) && Intrinsics.EZpvd((Object) this.unitPriceValuation, (Object) asset.unitPriceValuation) && Intrinsics.EZpvd((Object) this.overviewSpotBal, (Object) asset.overviewSpotBal) && Intrinsics.EZpvd((Object) this.earnMaxAprStr, (Object) asset.earnMaxAprStr) && Intrinsics.EZpvd(this.fiatCategory, asset.fiatCategory) && Intrinsics.EZpvd(this.redeemInfo, asset.redeemInfo) && Intrinsics.EZpvd(this.hideOverviewPnl, asset.hideOverviewPnl) && Intrinsics.EZpvd((Object) this.chainIcon, (Object) asset.chainIcon) && Intrinsics.EZpvd(this.cedefi, asset.cedefi) && Intrinsics.EZpvd((Object) this.cedefiPnl, (Object) asset.cedefiPnl) && Intrinsics.EZpvd((Object) this.cedefiPnlRate, (Object) asset.cedefiPnlRate) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) asset.tokenAddress) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) asset.chainIndex) && Intrinsics.EZpvd(this.riskLevel, asset.riskLevel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAccAvgPx() {
            return this.accAvgPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBalance() {
            return this.balance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<BalanceDistribution> getBalanceDistribution() {
            return this.balanceDistribution;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getCanRecharge() {
            return this.canRecharge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getCanTransfer() {
            return this.canTransfer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getCanWithdraw() {
            return this.canWithdraw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getCedefi() {
            return this.cedefi;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCedefiPnl() {
            return this.cedefiPnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCedefiPnlRate() {
            return this.cedefiPnlRate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainIcon() {
            return this.chainIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainIndex() {
            return this.chainIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainName() {
            return this.chainName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getCurrencyId() {
            return this.currencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getEarnMaxAprStr() {
            return this.earnMaxAprStr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getFiatCategory() {
            return this.fiatCategory;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFullName() {
            return this.fullName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFundingBalance() {
            return this.fundingBalance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getGrowBalance() {
            return this.growBalance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getHideOverviewPnl() {
            return this.hideOverviewPnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOpenAvgPx() {
            return this.openAvgPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOverviewOpenAvgPxValuation() {
            return this.overviewOpenAvgPxValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOverviewSpotBal() {
            return this.overviewSpotBal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOverviewSpotUplRatio() {
            return this.overviewSpotUplRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOverviewSpotUplValuation() {
            return this.overviewSpotUplValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPnlPercentage() {
            return this.pnlPercentage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPnlValue() {
            return this.pnlValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RedeemInfo getRedeemInfo() {
            return this.redeemInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getRiskLevel() {
            return this.riskLevel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSign() {
            return this.sign;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSpotBal() {
            return this.spotBal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSpotUpl() {
            return this.spotUpl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSpotUplRatio() {
            return this.spotUplRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getStable() {
            return this.stable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenAddress() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTotalPnl() {
            return this.totalPnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTotalPnlRatio() {
            return this.totalPnlRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getTradable() {
            return this.tradable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTradingBalance() {
            return this.tradingBalance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUnitCost() {
            return this.unitCost;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUnitPrice() {
            return this.unitPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUnitPriceValuation() {
            return this.unitPriceValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUsdValuation() {
            return this.usdValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValuation() {
            return this.valuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.accAvgPx.hashCode();
            int iHashCode2 = this.balance.hashCode();
            int iHashCode3 = this.currency.hashCode();
            int iHashCode4 = Integer.hashCode(this.currencyId);
            int iHashCode5 = this.valuation.hashCode();
            int iHashCode6 = this.tradingBalance.hashCode();
            int iHashCode7 = this.fundingBalance.hashCode();
            int iHashCode8 = this.growBalance.hashCode();
            int iHashCode9 = this.fullName.hashCode();
            int iHashCode10 = this.sign.hashCode();
            String str = this.icon;
            int iHashCode11 = str == null ? 0 : str.hashCode();
            int iHashCode12 = Boolean.hashCode(this.tradable);
            String str2 = this.usdValuation;
            int iHashCode13 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.chainName;
            int iHashCode14 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.unitCost;
            int iHashCode15 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.unitPrice;
            int iHashCode16 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.pnlValue;
            int iHashCode17 = str6 == null ? 0 : str6.hashCode();
            String str7 = this.pnlPercentage;
            int iHashCode18 = str7 == null ? 0 : str7.hashCode();
            int iHashCode19 = Boolean.hashCode(this.isEntitySupported);
            int iHashCode20 = Boolean.hashCode(this.canRecharge);
            int iHashCode21 = Boolean.hashCode(this.canTransfer);
            int iHashCode22 = Boolean.hashCode(this.canWithdraw);
            String str8 = this.spotBal;
            int iHashCode23 = str8 == null ? 0 : str8.hashCode();
            String str9 = this.openAvgPx;
            int iHashCode24 = str9 == null ? 0 : str9.hashCode();
            String str10 = this.spotUpl;
            int iHashCode25 = str10 == null ? 0 : str10.hashCode();
            String str11 = this.spotUplRatio;
            int iHashCode26 = str11 == null ? 0 : str11.hashCode();
            String str12 = this.totalPnl;
            int iHashCode27 = str12 == null ? 0 : str12.hashCode();
            String str13 = this.totalPnlRatio;
            int iHashCode28 = str13 == null ? 0 : str13.hashCode();
            int iHashCode29 = Boolean.hashCode(this.stable);
            List<BalanceDistribution> list = this.balanceDistribution;
            int iHashCode30 = list == null ? 0 : list.hashCode();
            String str14 = this.overviewOpenAvgPxValuation;
            int iHashCode31 = str14 == null ? 0 : str14.hashCode();
            String str15 = this.overviewSpotUplValuation;
            int iHashCode32 = str15 == null ? 0 : str15.hashCode();
            String str16 = this.overviewSpotUplRatio;
            int iHashCode33 = str16 == null ? 0 : str16.hashCode();
            String str17 = this.unitPriceValuation;
            int iHashCode34 = str17 == null ? 0 : str17.hashCode();
            String str18 = this.overviewSpotBal;
            int iHashCode35 = str18 == null ? 0 : str18.hashCode();
            String str19 = this.earnMaxAprStr;
            int iHashCode36 = str19 == null ? 0 : str19.hashCode();
            Boolean bool = this.fiatCategory;
            int iHashCode37 = bool == null ? 0 : bool.hashCode();
            RedeemInfo redeemInfo = this.redeemInfo;
            int iHashCode38 = redeemInfo == null ? 0 : redeemInfo.hashCode();
            Boolean bool2 = this.hideOverviewPnl;
            int iHashCode39 = bool2 == null ? 0 : bool2.hashCode();
            String str20 = this.chainIcon;
            int iHashCode40 = str20 == null ? 0 : str20.hashCode();
            Boolean bool3 = this.cedefi;
            int iHashCode41 = bool3 == null ? 0 : bool3.hashCode();
            String str21 = this.cedefiPnl;
            int iHashCode42 = str21 == null ? 0 : str21.hashCode();
            String str22 = this.cedefiPnlRate;
            int iHashCode43 = str22 == null ? 0 : str22.hashCode();
            String str23 = this.tokenAddress;
            int iHashCode44 = str23 == null ? 0 : str23.hashCode();
            String str24 = this.chainIndex;
            int iHashCode45 = str24 == null ? 0 : str24.hashCode();
            Integer num = this.riskLevel;
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + (num == null ? 0 : num.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isEntitySupported() {
            return this.isEntitySupported;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOpenAvgPx(String str) {
            this.openAvgPx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSpotBal(String str) {
            this.spotBal = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSpotUpl(String str) {
            this.spotUpl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSpotUplRatio(String str) {
            this.spotUplRatio = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTotalPnl(String str) {
            this.totalPnl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTotalPnlRatio(String str) {
            this.totalPnlRatio = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Asset(accAvgPx=" + this.accAvgPx + ", balance=" + this.balance + ", currency=" + this.currency + ", currencyId=" + this.currencyId + ", valuation=" + this.valuation + ", tradingBalance=" + this.tradingBalance + ", fundingBalance=" + this.fundingBalance + ", growBalance=" + this.growBalance + ", fullName=" + this.fullName + ", sign=" + this.sign + ", icon=" + this.icon + ", tradable=" + this.tradable + ", usdValuation=" + this.usdValuation + ", chainName=" + this.chainName + ", unitCost=" + this.unitCost + ", unitPrice=" + this.unitPrice + ", pnlValue=" + this.pnlValue + ", pnlPercentage=" + this.pnlPercentage + ", isEntitySupported=" + this.isEntitySupported + ", canRecharge=" + this.canRecharge + ", canTransfer=" + this.canTransfer + ", canWithdraw=" + this.canWithdraw + ", spotBal=" + this.spotBal + ", openAvgPx=" + this.openAvgPx + ", spotUpl=" + this.spotUpl + ", spotUplRatio=" + this.spotUplRatio + ", totalPnl=" + this.totalPnl + ", totalPnlRatio=" + this.totalPnlRatio + ", stable=" + this.stable + ", balanceDistribution=" + this.balanceDistribution + ", overviewOpenAvgPxValuation=" + this.overviewOpenAvgPxValuation + ", overviewSpotUplValuation=" + this.overviewSpotUplValuation + ", overviewSpotUplRatio=" + this.overviewSpotUplRatio + ", unitPriceValuation=" + this.unitPriceValuation + ", overviewSpotBal=" + this.overviewSpotBal + ", earnMaxAprStr=" + this.earnMaxAprStr + ", fiatCategory=" + this.fiatCategory + ", redeemInfo=" + this.redeemInfo + ", hideOverviewPnl=" + this.hideOverviewPnl + ", chainIcon=" + this.chainIcon + ", cedefi=" + this.cedefi + ", cedefiPnl=" + this.cedefiPnl + ", cedefiPnlRate=" + this.cedefiPnlRate + ", tokenAddress=" + this.tokenAddress + ", chainIndex=" + this.chainIndex + ", riskLevel=" + this.riskLevel + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.BalancePortfolio.Asset.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Asset> serializer() {
                return BalancePortfolio$Asset$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Asset(int i, int i2, String str, String str2, String str3, int i3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, String str12, String str13, String str14, String str15, String str16, boolean z2, boolean z3, boolean z4, boolean z5, String str17, String str18, String str19, String str20, String str21, String str22, boolean z6, List list, String str23, String str24, String str25, String str26, String str27, String str28, Boolean bool, RedeemInfo redeemInfo, Boolean bool2, String str29, Boolean bool3, String str30, String str31, String str32, String str33, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.accAvgPx = "";
            } else {
                this.accAvgPx = str;
            }
            if ((i & 2) == 0) {
                this.balance = "";
            } else {
                this.balance = str2;
            }
            if ((i & 4) == 0) {
                this.currency = "";
            } else {
                this.currency = str3;
            }
            if ((i & 8) == 0) {
                this.currencyId = 0;
            } else {
                this.currencyId = i3;
            }
            if ((i & 16) == 0) {
                this.valuation = "";
            } else {
                this.valuation = str4;
            }
            if ((i & 32) == 0) {
                this.tradingBalance = "";
            } else {
                this.tradingBalance = str5;
            }
            if ((i & 64) == 0) {
                this.fundingBalance = "";
            } else {
                this.fundingBalance = str6;
            }
            if ((i & 128) == 0) {
                this.growBalance = "";
            } else {
                this.growBalance = str7;
            }
            if ((i & 256) == 0) {
                this.fullName = "";
            } else {
                this.fullName = str8;
            }
            if ((i & 512) == 0) {
                this.sign = "";
            } else {
                this.sign = str9;
            }
            if ((i & 1024) == 0) {
                this.icon = null;
            } else {
                this.icon = str10;
            }
            if ((i & 2048) == 0) {
                this.tradable = true;
            } else {
                this.tradable = z;
            }
            if ((i & 4096) == 0) {
                this.usdValuation = null;
            } else {
                this.usdValuation = str11;
            }
            if ((i & 8192) == 0) {
                this.chainName = null;
            } else {
                this.chainName = str12;
            }
            if ((i & 16384) == 0) {
                this.unitCost = null;
            } else {
                this.unitCost = str13;
            }
            if ((32768 & i) == 0) {
                this.unitPrice = null;
            } else {
                this.unitPrice = str14;
            }
            if ((65536 & i) == 0) {
                this.pnlValue = null;
            } else {
                this.pnlValue = str15;
            }
            if ((131072 & i) == 0) {
                this.pnlPercentage = null;
            } else {
                this.pnlPercentage = str16;
            }
            if ((262144 & i) == 0) {
                this.isEntitySupported = true;
            } else {
                this.isEntitySupported = z2;
            }
            if ((524288 & i) == 0) {
                this.canRecharge = false;
            } else {
                this.canRecharge = z3;
            }
            if ((1048576 & i) == 0) {
                this.canTransfer = false;
            } else {
                this.canTransfer = z4;
            }
            if ((2097152 & i) == 0) {
                this.canWithdraw = false;
            } else {
                this.canWithdraw = z5;
            }
            if ((4194304 & i) == 0) {
                this.spotBal = null;
            } else {
                this.spotBal = str17;
            }
            if ((8388608 & i) == 0) {
                this.openAvgPx = null;
            } else {
                this.openAvgPx = str18;
            }
            if ((16777216 & i) == 0) {
                this.spotUpl = null;
            } else {
                this.spotUpl = str19;
            }
            if ((33554432 & i) == 0) {
                this.spotUplRatio = null;
            } else {
                this.spotUplRatio = str20;
            }
            if ((67108864 & i) == 0) {
                this.totalPnl = null;
            } else {
                this.totalPnl = str21;
            }
            if ((134217728 & i) == 0) {
                this.totalPnlRatio = null;
            } else {
                this.totalPnlRatio = str22;
            }
            if ((268435456 & i) == 0) {
                this.stable = false;
            } else {
                this.stable = z6;
            }
            if ((536870912 & i) == 0) {
                this.balanceDistribution = null;
            } else {
                this.balanceDistribution = list;
            }
            if ((1073741824 & i) == 0) {
                this.overviewOpenAvgPxValuation = null;
            } else {
                this.overviewOpenAvgPxValuation = str23;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.overviewSpotUplValuation = null;
            } else {
                this.overviewSpotUplValuation = str24;
            }
            if ((i2 & 1) == 0) {
                this.overviewSpotUplRatio = null;
            } else {
                this.overviewSpotUplRatio = str25;
            }
            if ((i2 & 2) == 0) {
                this.unitPriceValuation = null;
            } else {
                this.unitPriceValuation = str26;
            }
            if ((i2 & 4) == 0) {
                this.overviewSpotBal = null;
            } else {
                this.overviewSpotBal = str27;
            }
            if ((i2 & 8) == 0) {
                this.earnMaxAprStr = null;
            } else {
                this.earnMaxAprStr = str28;
            }
            this.fiatCategory = (i2 & 16) == 0 ? Boolean.FALSE : bool;
            if ((i2 & 32) == 0) {
                this.redeemInfo = null;
            } else {
                this.redeemInfo = redeemInfo;
            }
            this.hideOverviewPnl = (i2 & 64) == 0 ? Boolean.FALSE : bool2;
            if ((i2 & 128) == 0) {
                this.chainIcon = "";
            } else {
                this.chainIcon = str29;
            }
            this.cedefi = (i2 & 256) == 0 ? Boolean.FALSE : bool3;
            if ((i2 & 512) == 0) {
                this.cedefiPnl = "";
            } else {
                this.cedefiPnl = str30;
            }
            if ((i2 & 1024) == 0) {
                this.cedefiPnlRate = "";
            } else {
                this.cedefiPnlRate = str31;
            }
            if ((i2 & 2048) == 0) {
                this.tokenAddress = "";
            } else {
                this.tokenAddress = str32;
            }
            if ((i2 & 4096) == 0) {
                this.chainIndex = "";
            } else {
                this.chainIndex = str33;
            }
            this.riskLevel = (i2 & 8192) == 0 ? 0 : num;
        }

        public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(Asset asset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            Integer num;
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) asset.accAvgPx, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, asset.accAvgPx);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) asset.balance, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 1, asset.balance);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) asset.currency, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 2, asset.currency);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || asset.currencyId != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 3, asset.currencyId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) asset.valuation, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 4, asset.valuation);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) asset.tradingBalance, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 5, asset.tradingBalance);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) asset.fundingBalance, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 6, asset.fundingBalance);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) asset.growBalance, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 7, asset.growBalance);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) asset.fullName, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 8, asset.fullName);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) asset.sign, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 9, asset.sign);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || asset.icon != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, asset.icon);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !asset.tradable) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 11, asset.tradable);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || asset.usdValuation != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, asset.usdValuation);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || asset.chainName != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, asset.chainName);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || asset.unitCost != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, asset.unitCost);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || asset.unitPrice != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, asset.unitPrice);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || asset.pnlValue != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, asset.pnlValue);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || asset.pnlPercentage != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, asset.pnlPercentage);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !asset.isEntitySupported) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 18, asset.isEntitySupported);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || asset.canRecharge) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 19, asset.canRecharge);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || asset.canTransfer) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 20, asset.canTransfer);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || asset.canWithdraw) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 21, asset.canWithdraw);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || asset.spotBal != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, asset.spotBal);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || asset.openAvgPx != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, asset.openAvgPx);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || asset.spotUpl != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, asset.spotUpl);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || asset.spotUplRatio != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, asset.spotUplRatio);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || asset.totalPnl != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, asset.totalPnl);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || asset.totalPnlRatio != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, asset.totalPnlRatio);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || asset.stable) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 28, asset.stable);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || asset.balanceDistribution != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, kSerializerArr[29], asset.balanceDistribution);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || asset.overviewOpenAvgPxValuation != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, asset.overviewOpenAvgPxValuation);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || asset.overviewSpotUplValuation != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, asset.overviewSpotUplValuation);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || asset.overviewSpotUplRatio != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, asset.overviewSpotUplRatio);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || asset.unitPriceValuation != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, StringSerializer.INSTANCE, asset.unitPriceValuation);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || asset.overviewSpotBal != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, StringSerializer.INSTANCE, asset.overviewSpotBal);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || asset.earnMaxAprStr != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, asset.earnMaxAprStr);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd(asset.fiatCategory, Boolean.FALSE)) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, BooleanSerializer.INSTANCE, asset.fiatCategory);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || asset.redeemInfo != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, BalancePortfolio$RedeemInfo$$serializer.INSTANCE, asset.redeemInfo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd(asset.hideOverviewPnl, Boolean.FALSE)) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, BooleanSerializer.INSTANCE, asset.hideOverviewPnl);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) asset.chainIcon, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, StringSerializer.INSTANCE, asset.chainIcon);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd(asset.cedefi, Boolean.FALSE)) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 40, BooleanSerializer.INSTANCE, asset.cedefi);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) asset.cedefiPnl, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 41, StringSerializer.INSTANCE, asset.cedefiPnl);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) asset.cedefiPnlRate, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, StringSerializer.INSTANCE, asset.cedefiPnlRate);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) asset.tokenAddress, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, StringSerializer.INSTANCE, asset.tokenAddress);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) asset.chainIndex, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, StringSerializer.INSTANCE, asset.chainIndex);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || (num = asset.riskLevel) == null || num.intValue() != 0) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 45, IntSerializer.INSTANCE, asset.riskLevel);
            }
        }

        public Asset(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, String str10, boolean z, String str11, String str12, String str13, String str14, String str15, String str16, boolean z2, boolean z3, boolean z4, boolean z5, String str17, String str18, String str19, String str20, String str21, String str22, boolean z6, List<BalanceDistribution> list, String str23, String str24, String str25, String str26, String str27, String str28, Boolean bool, RedeemInfo redeemInfo, Boolean bool2, String str29, Boolean bool3, String str30, String str31, String str32, String str33, Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            this.accAvgPx = str;
            this.balance = str2;
            this.currency = str3;
            this.currencyId = i;
            this.valuation = str4;
            this.tradingBalance = str5;
            this.fundingBalance = str6;
            this.growBalance = str7;
            this.fullName = str8;
            this.sign = str9;
            this.icon = str10;
            this.tradable = z;
            this.usdValuation = str11;
            this.chainName = str12;
            this.unitCost = str13;
            this.unitPrice = str14;
            this.pnlValue = str15;
            this.pnlPercentage = str16;
            this.isEntitySupported = z2;
            this.canRecharge = z3;
            this.canTransfer = z4;
            this.canWithdraw = z5;
            this.spotBal = str17;
            this.openAvgPx = str18;
            this.spotUpl = str19;
            this.spotUplRatio = str20;
            this.totalPnl = str21;
            this.totalPnlRatio = str22;
            this.stable = z6;
            this.balanceDistribution = list;
            this.overviewOpenAvgPxValuation = str23;
            this.overviewSpotUplValuation = str24;
            this.overviewSpotUplRatio = str25;
            this.unitPriceValuation = str26;
            this.overviewSpotBal = str27;
            this.earnMaxAprStr = str28;
            this.fiatCategory = bool;
            this.redeemInfo = redeemInfo;
            this.hideOverviewPnl = bool2;
            this.chainIcon = str29;
            this.cedefi = bool3;
            this.cedefiPnl = str30;
            this.cedefiPnlRate = str31;
            this.tokenAddress = str32;
            this.chainIndex = str33;
            this.riskLevel = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0229: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r92v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r92v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r92v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001e: ARITH (r92v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r49v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r92v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r92v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r92v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r92v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r92v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r92v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r92v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005e: ARITH (r92v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? true : (r57v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0069: ARITH (r92v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.lang.String:0x007b: TERNARY null = ((wrap:int:0x0073: ARITH (r92v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r92v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r92v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r92v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r92v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r92v0 int) & (262144 int) A[WRAPPED]) == (0 int)) ? (r64v0 boolean) : true)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00b2: ARITH (r92v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? false : (r65v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00bd: ARITH (r92v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? false : (r66v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00c8: ARITH (r92v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? false : (r67v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d3: ARITH (r92v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00de: ARITH (r92v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e9: ARITH (r92v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f4: ARITH (r92v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ff: ARITH (r92v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010a: ARITH (r92v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r73v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0115: ARITH (r92v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? false : (r74v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0120: ARITH (r92v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r75v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012b: ARITH (r92v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0136: ARITH (r92v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013e: ARITH (r93v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0147: ARITH (r93v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0150: ARITH (r93v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0159: ARITH (r93v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r81v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0162: ARITH (r93v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0166: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r82v0 java.lang.Boolean))
  (wrap:com.okinc.assets.backend.api.model.BalancePortfolio$RedeemInfo:?: TERNARY null = ((wrap:int:0x016b: ARITH (r93v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.BalancePortfolio$RedeemInfo) : (r83v0 com.okinc.assets.backend.api.model.BalancePortfolio$RedeemInfo))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0174: ARITH (r93v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0178: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r84v0 java.lang.Boolean))
  (wrap:java.lang.String:0x0188: TERNARY null = ((wrap:int:0x017f: ARITH (r93v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r85v0 java.lang.String))
  (wrap:java.lang.Boolean:0x0193: TERNARY null = ((wrap:int:0x018a: ARITH (r93v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x018e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r86v0 java.lang.Boolean))
  (wrap:java.lang.String:0x019e: TERNARY null = ((wrap:int:0x0195: ARITH (r93v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r87v0 java.lang.String))
  (wrap:java.lang.String:0x01a9: TERNARY null = ((wrap:int:0x01a0: ARITH (r93v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r88v0 java.lang.String))
  (wrap:java.lang.String:0x01b4: TERNARY null = ((wrap:int:0x01ab: ARITH (r93v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01b6: ARITH (r93v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r90v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x01bf: ARITH (r93v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r91v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.assets.backend.api.model.BalancePortfolio$BalanceDistribution>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.assets.backend.api.model.BalancePortfolio$RedeemInfo, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:90) call: com.okinc.assets.backend.api.model.BalancePortfolio.Asset.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.assets.backend.api.model.BalancePortfolio$RedeemInfo, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
        public /* synthetic */ Asset(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, String str12, String str13, String str14, String str15, String str16, boolean z2, boolean z3, boolean z4, boolean z5, String str17, String str18, String str19, String str20, String str21, String str22, boolean z6, List list, String str23, String str24, String str25, String str26, String str27, String str28, Boolean bool, RedeemInfo redeemInfo, Boolean bool2, String str29, Boolean bool3, String str30, String str31, String str32, String str33, Integer num, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? "" : str9, (i2 & 1024) != 0 ? null : str10, (i2 & 2048) != 0 ? true : z, (i2 & 4096) != 0 ? null : str11, (i2 & 8192) != 0 ? null : str12, (i2 & 16384) != 0 ? null : str13, (i2 & 32768) != 0 ? null : str14, (i2 & 65536) != 0 ? null : str15, (i2 & 131072) != 0 ? null : str16, (i2 & 262144) == 0 ? z2 : true, (i2 & 524288) != 0 ? false : z3, (i2 & 1048576) != 0 ? false : z4, (i2 & 2097152) != 0 ? false : z5, (i2 & 4194304) != 0 ? null : str17, (i2 & 8388608) != 0 ? null : str18, (i2 & 16777216) != 0 ? null : str19, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str20, (i2 & 67108864) != 0 ? null : str21, (i2 & 134217728) != 0 ? null : str22, (i2 & 268435456) != 0 ? false : z6, (i2 & 536870912) != 0 ? null : list, (i2 & 1073741824) != 0 ? null : str23, (i2 & Integer.MIN_VALUE) != 0 ? null : str24, (i3 & 1) != 0 ? null : str25, (i3 & 2) != 0 ? null : str26, (i3 & 4) != 0 ? null : str27, (i3 & 8) != 0 ? null : str28, (i3 & 16) != 0 ? Boolean.FALSE : bool, (i3 & 32) != 0 ? null : redeemInfo, (i3 & 64) != 0 ? Boolean.FALSE : bool2, (i3 & 128) != 0 ? "" : str29, (i3 & 256) != 0 ? Boolean.FALSE : bool3, (i3 & 512) != 0 ? "" : str30, (i3 & 1024) != 0 ? "" : str31, (i3 & 2048) != 0 ? "" : str32, (i3 & 4096) != 0 ? "" : str33, (i3 & 8192) != 0 ? 0 : num);
        }
    }

    @Serializable
    public static final class BalanceDistribution {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String balance;
        private final String percentage;
        private final Integer sortOrder;
        private final Integer target;
        private final String valuation;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ BalanceDistribution copy$default(BalanceDistribution balanceDistribution, Integer num, String str, String str2, String str3, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                num = balanceDistribution.target;
            }
            if ((i & 2) != 0) {
                str = balanceDistribution.balance;
            }
            String str4 = str;
            if ((i & 4) != 0) {
                str2 = balanceDistribution.valuation;
            }
            String str5 = str2;
            if ((i & 8) != 0) {
                str3 = balanceDistribution.percentage;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                num2 = balanceDistribution.sortOrder;
            }
            return balanceDistribution.copy(num, str4, str5, str6, num2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component1() {
            return this.target;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.balance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.valuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.percentage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component5() {
            return this.sortOrder;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BalanceDistribution copy(Integer num, String str, String str2, String str3, Integer num2) {
            return new BalanceDistribution(num, str, str2, str3, num2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BalanceDistribution)) {
                return false;
            }
            BalanceDistribution balanceDistribution = (BalanceDistribution) obj;
            return Intrinsics.EZpvd(this.target, balanceDistribution.target) && Intrinsics.EZpvd((Object) this.balance, (Object) balanceDistribution.balance) && Intrinsics.EZpvd((Object) this.valuation, (Object) balanceDistribution.valuation) && Intrinsics.EZpvd((Object) this.percentage, (Object) balanceDistribution.percentage) && Intrinsics.EZpvd(this.sortOrder, balanceDistribution.sortOrder);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBalance() {
            return this.balance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPercentage() {
            return this.percentage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getSortOrder() {
            return this.sortOrder;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getTarget() {
            return this.target;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValuation() {
            return this.valuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.target;
            int iHashCode = num == null ? 0 : num.hashCode();
            String str = this.balance;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.valuation;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.percentage;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            Integer num2 = this.sortOrder;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "BalanceDistribution(target=" + this.target + ", balance=" + this.balance + ", valuation=" + this.valuation + ", percentage=" + this.percentage + ", sortOrder=" + this.sortOrder + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.BalancePortfolio.BalanceDistribution.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<BalanceDistribution> serializer() {
                return BalancePortfolio$BalanceDistribution$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ BalanceDistribution(int i, Integer num, String str, String str2, String str3, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, BalancePortfolio$BalanceDistribution$$serializer.INSTANCE.getDescriptor());
            }
            this.target = num;
            this.balance = str;
            this.valuation = str2;
            this.percentage = str3;
            if ((i & 16) == 0) {
                this.sortOrder = 0;
            } else {
                this.sortOrder = num2;
            }
        }

        public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(BalanceDistribution balanceDistribution, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            Integer num;
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, intSerializer, balanceDistribution.target);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, balanceDistribution.balance);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, balanceDistribution.valuation);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, balanceDistribution.percentage);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || (num = balanceDistribution.sortOrder) == null || num.intValue() != 0) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, intSerializer, balanceDistribution.sortOrder);
            }
        }

        public BalanceDistribution(Integer num, String str, String str2, String str3, Integer num2) {
            this.target = num;
            this.balance = str;
            this.valuation = str2;
            this.percentage = str3;
            this.sortOrder = num2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (r7v0 java.lang.Integer)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 java.lang.Integer))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:147) call: com.okinc.assets.backend.api.model.BalancePortfolio.BalanceDistribution.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
        public /* synthetic */ BalanceDistribution(Integer num, String str, String str2, String str3, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str, str2, str3, (i & 16) != 0 ? 0 : num2);
        }
    }

    @Serializable
    public static final class RedeemInfo implements Parcelable {
        public static final int $stable = 0;
        private final Integer currencyId;
        private final Boolean enable;
        private final Integer productsType;
        private final Integer savingType;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<RedeemInfo> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<RedeemInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RedeemInfo createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "");
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new RedeemInfo(numValueOf, numValueOf2, boolValueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RedeemInfo[] newArray(int i) {
                return new RedeemInfo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RedeemInfo copy$default(RedeemInfo redeemInfo, Integer num, Integer num2, Boolean bool, Integer num3, int i, Object obj) {
            if ((i & 1) != 0) {
                num = redeemInfo.productsType;
            }
            if ((i & 2) != 0) {
                num2 = redeemInfo.savingType;
            }
            if ((i & 4) != 0) {
                bool = redeemInfo.enable;
            }
            if ((i & 8) != 0) {
                num3 = redeemInfo.currencyId;
            }
            return redeemInfo.copy(num, num2, bool, num3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component1() {
            return this.productsType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component2() {
            return this.savingType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component3() {
            return this.enable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component4() {
            return this.currencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RedeemInfo copy(Integer num, Integer num2, Boolean bool, Integer num3) {
            return new RedeemInfo(num, num2, bool, num3);
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
            if (!(obj instanceof RedeemInfo)) {
                return false;
            }
            RedeemInfo redeemInfo = (RedeemInfo) obj;
            return Intrinsics.EZpvd(this.productsType, redeemInfo.productsType) && Intrinsics.EZpvd(this.savingType, redeemInfo.savingType) && Intrinsics.EZpvd(this.enable, redeemInfo.enable) && Intrinsics.EZpvd(this.currencyId, redeemInfo.currencyId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getCurrencyId() {
            return this.currencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getEnable() {
            return this.enable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getProductsType() {
            return this.productsType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getSavingType() {
            return this.savingType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.productsType;
            int iHashCode = num == null ? 0 : num.hashCode();
            Integer num2 = this.savingType;
            int iHashCode2 = num2 == null ? 0 : num2.hashCode();
            Boolean bool = this.enable;
            int iHashCode3 = bool == null ? 0 : bool.hashCode();
            Integer num3 = this.currencyId;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num3 != null ? num3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RedeemInfo(productsType=" + this.productsType + ", savingType=" + this.savingType + ", enable=" + this.enable + ", currencyId=" + this.currencyId + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer num = this.productsType;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            Integer num2 = this.savingType;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            Boolean bool = this.enable;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Integer num3 = this.currencyId;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num3.intValue());
            }
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.BalancePortfolio.RedeemInfo.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<RedeemInfo> serializer() {
                return BalancePortfolio$RedeemInfo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ RedeemInfo(int i, Integer num, Integer num2, Boolean bool, Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, BalancePortfolio$RedeemInfo$$serializer.INSTANCE.getDescriptor());
            }
            this.productsType = num;
            this.savingType = num2;
            this.enable = bool;
            this.currencyId = num3;
        }

        public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(RedeemInfo redeemInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, intSerializer, redeemInfo.productsType);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, intSerializer, redeemInfo.savingType);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, redeemInfo.enable);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, intSerializer, redeemInfo.currencyId);
        }

        public RedeemInfo(Integer num, Integer num2, Boolean bool, Integer num3) {
            this.productsType = num;
            this.savingType = num2;
            this.enable = bool;
            this.currencyId = num3;
        }
    }
}
