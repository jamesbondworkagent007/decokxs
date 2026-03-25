package com.okinc.assets.backend.api.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class HomePageAssetTrend {
    private final String beginningTime;
    private final String depositValuation;
    private final String endAssetValuation;
    private final String endingTime;
    private final String netTransferValuation;
    private final String otherNetTransferValuation;
    private final String startAssetValuation;
    private final String todayPnlEndTime;
    private final String todayPnlStartTime;
    private final String totalPnl;
    private final String totalPnlRate;
    private final String totalValuation;
    private final List<HomePageAssetTrendPoint> trendList;
    private final String usdtRate;
    private final Boolean v2UpgradeEnabled;
    private final String withdrawValuation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(HomePageAssetTrendPoint$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomePageAssetTrend() {
        this((String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.netTransferValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.depositValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.withdrawValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.otherNetTransferValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.totalPnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component16() {
        return this.v2UpgradeEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.usdtRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HomePageAssetTrendPoint> component3() {
        return this.trendList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.beginningTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.endingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.todayPnlStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.todayPnlEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.startAssetValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.endAssetValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomePageAssetTrend copy(String str, String str2, @NotNull List<HomePageAssetTrendPoint> list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "");
        return new HomePageAssetTrend(str, str2, list, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomePageAssetTrend)) {
            return false;
        }
        HomePageAssetTrend homePageAssetTrend = (HomePageAssetTrend) obj;
        return Intrinsics.EZpvd((Object) this.totalValuation, (Object) homePageAssetTrend.totalValuation) && Intrinsics.EZpvd((Object) this.usdtRate, (Object) homePageAssetTrend.usdtRate) && Intrinsics.EZpvd(this.trendList, homePageAssetTrend.trendList) && Intrinsics.EZpvd((Object) this.beginningTime, (Object) homePageAssetTrend.beginningTime) && Intrinsics.EZpvd((Object) this.endingTime, (Object) homePageAssetTrend.endingTime) && Intrinsics.EZpvd((Object) this.todayPnlStartTime, (Object) homePageAssetTrend.todayPnlStartTime) && Intrinsics.EZpvd((Object) this.todayPnlEndTime, (Object) homePageAssetTrend.todayPnlEndTime) && Intrinsics.EZpvd((Object) this.startAssetValuation, (Object) homePageAssetTrend.startAssetValuation) && Intrinsics.EZpvd((Object) this.endAssetValuation, (Object) homePageAssetTrend.endAssetValuation) && Intrinsics.EZpvd((Object) this.netTransferValuation, (Object) homePageAssetTrend.netTransferValuation) && Intrinsics.EZpvd((Object) this.depositValuation, (Object) homePageAssetTrend.depositValuation) && Intrinsics.EZpvd((Object) this.withdrawValuation, (Object) homePageAssetTrend.withdrawValuation) && Intrinsics.EZpvd((Object) this.otherNetTransferValuation, (Object) homePageAssetTrend.otherNetTransferValuation) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) homePageAssetTrend.totalPnl) && Intrinsics.EZpvd((Object) this.totalPnlRate, (Object) homePageAssetTrend.totalPnlRate) && Intrinsics.EZpvd(this.v2UpgradeEnabled, homePageAssetTrend.v2UpgradeEnabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBeginningTime() {
        return this.beginningTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositValuation() {
        return this.depositValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndAssetValuation() {
        return this.endAssetValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndingTime() {
        return this.endingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetTransferValuation() {
        return this.netTransferValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOtherNetTransferValuation() {
        return this.otherNetTransferValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartAssetValuation() {
        return this.startAssetValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTodayPnlEndTime() {
        return this.todayPnlEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTodayPnlStartTime() {
        return this.todayPnlStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnlRate() {
        return this.totalPnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalValuation() {
        return this.totalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HomePageAssetTrendPoint> getTrendList() {
        return this.trendList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdtRate() {
        return this.usdtRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getV2UpgradeEnabled() {
        return this.v2UpgradeEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWithdrawValuation() {
        return this.withdrawValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.totalValuation;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.usdtRate;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = this.trendList.hashCode();
        String str3 = this.beginningTime;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.endingTime;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.todayPnlStartTime;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.todayPnlEndTime;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.startAssetValuation;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.endAssetValuation;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.netTransferValuation;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.depositValuation;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.withdrawValuation;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.otherNetTransferValuation;
        int iHashCode13 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.totalPnl;
        int iHashCode14 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.totalPnlRate;
        int iHashCode15 = str14 == null ? 0 : str14.hashCode();
        Boolean bool = this.v2UpgradeEnabled;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomePageAssetTrend(totalValuation=" + this.totalValuation + ", usdtRate=" + this.usdtRate + ", trendList=" + this.trendList + ", beginningTime=" + this.beginningTime + ", endingTime=" + this.endingTime + ", todayPnlStartTime=" + this.todayPnlStartTime + ", todayPnlEndTime=" + this.todayPnlEndTime + ", startAssetValuation=" + this.startAssetValuation + ", endAssetValuation=" + this.endAssetValuation + ", netTransferValuation=" + this.netTransferValuation + ", depositValuation=" + this.depositValuation + ", withdrawValuation=" + this.withdrawValuation + ", otherNetTransferValuation=" + this.otherNetTransferValuation + ", totalPnl=" + this.totalPnl + ", totalPnlRate=" + this.totalPnlRate + ", v2UpgradeEnabled=" + this.v2UpgradeEnabled + ")";
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.HomePageAssetTrend.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomePageAssetTrend> serializer() {
            return HomePageAssetTrend$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HomePageAssetTrend(int i, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalValuation = "";
        } else {
            this.totalValuation = str;
        }
        if ((i & 2) == 0) {
            this.usdtRate = "";
        } else {
            this.usdtRate = str2;
        }
        this.trendList = (i & 4) == 0 ? yDY.AhwBna() : list;
        if ((i & 8) == 0) {
            this.beginningTime = "";
        } else {
            this.beginningTime = str3;
        }
        if ((i & 16) == 0) {
            this.endingTime = "";
        } else {
            this.endingTime = str4;
        }
        if ((i & 32) == 0) {
            this.todayPnlStartTime = "";
        } else {
            this.todayPnlStartTime = str5;
        }
        if ((i & 64) == 0) {
            this.todayPnlEndTime = "";
        } else {
            this.todayPnlEndTime = str6;
        }
        if ((i & 128) == 0) {
            this.startAssetValuation = "";
        } else {
            this.startAssetValuation = str7;
        }
        if ((i & 256) == 0) {
            this.endAssetValuation = "";
        } else {
            this.endAssetValuation = str8;
        }
        if ((i & 512) == 0) {
            this.netTransferValuation = "";
        } else {
            this.netTransferValuation = str9;
        }
        if ((i & 1024) == 0) {
            this.depositValuation = "";
        } else {
            this.depositValuation = str10;
        }
        if ((i & 2048) == 0) {
            this.withdrawValuation = "";
        } else {
            this.withdrawValuation = str11;
        }
        if ((i & 4096) == 0) {
            this.otherNetTransferValuation = "";
        } else {
            this.otherNetTransferValuation = str12;
        }
        if ((i & 8192) == 0) {
            this.totalPnl = "";
        } else {
            this.totalPnl = str13;
        }
        if ((i & 16384) == 0) {
            this.totalPnlRate = "";
        } else {
            this.totalPnlRate = str14;
        }
        this.v2UpgradeEnabled = (i & 32768) == 0 ? Boolean.FALSE : bool;
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(HomePageAssetTrend homePageAssetTrend, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) homePageAssetTrend.totalValuation, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, homePageAssetTrend.totalValuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) homePageAssetTrend.usdtRate, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, homePageAssetTrend.usdtRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(homePageAssetTrend.trendList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], homePageAssetTrend.trendList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) homePageAssetTrend.beginningTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, homePageAssetTrend.beginningTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) homePageAssetTrend.endingTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, homePageAssetTrend.endingTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) homePageAssetTrend.todayPnlStartTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, homePageAssetTrend.todayPnlStartTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) homePageAssetTrend.todayPnlEndTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, homePageAssetTrend.todayPnlEndTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) homePageAssetTrend.startAssetValuation, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, homePageAssetTrend.startAssetValuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) homePageAssetTrend.endAssetValuation, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, homePageAssetTrend.endAssetValuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) homePageAssetTrend.netTransferValuation, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, homePageAssetTrend.netTransferValuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) homePageAssetTrend.depositValuation, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, homePageAssetTrend.depositValuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) homePageAssetTrend.withdrawValuation, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, homePageAssetTrend.withdrawValuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) homePageAssetTrend.otherNetTransferValuation, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, homePageAssetTrend.otherNetTransferValuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) homePageAssetTrend.totalPnl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, homePageAssetTrend.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) homePageAssetTrend.totalPnlRate, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, homePageAssetTrend.totalPnlRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && Intrinsics.EZpvd(homePageAssetTrend.v2UpgradeEnabled, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, homePageAssetTrend.v2UpgradeEnabled);
    }

    public HomePageAssetTrend(String str, String str2, @NotNull List<HomePageAssetTrendPoint> list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "");
        this.totalValuation = str;
        this.usdtRate = str2;
        this.trendList = list;
        this.beginningTime = str3;
        this.endingTime = str4;
        this.todayPnlStartTime = str5;
        this.todayPnlEndTime = str6;
        this.startAssetValuation = str7;
        this.endAssetValuation = str8;
        this.netTransferValuation = str9;
        this.depositValuation = str10;
        this.withdrawValuation = str11;
        this.otherNetTransferValuation = str12;
        this.totalPnl = str13;
        this.totalPnlRate = str14;
        this.v2UpgradeEnabled = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b0: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r20v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005f: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006f: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0079: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0085: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0089: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r33v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.assets.backend.api.model.HomePageAssetTrendPoint>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:8) call: com.okinc.assets.backend.api.model.HomePageAssetTrend.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ HomePageAssetTrend(String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? Boolean.FALSE : bool);
    }
}
