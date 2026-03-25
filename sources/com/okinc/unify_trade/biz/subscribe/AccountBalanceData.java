package com.okinc.unify_trade.biz.subscribe;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
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
import o.xVJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AccountBalanceData {
    private String adjEq;
    private String availEq;
    private String borrowFroz;
    private String delta;
    private String deltaLever;
    private String deltaNeutralStatus;
    private ArrayList<AccountDetailData> details;
    private String imr;
    private String isoEq;
    private String mgnRatio;
    private String mmr;
    private String notionalUsd;
    private String notionalUsdForBorrow;
    private String notionalUsdForFutures;
    private String notionalUsdForOption;
    private String notionalUsdForSwap;
    private String ordFroz;
    private int topSize;
    private String totalEq;
    private String uTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(AccountDetailData$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountBalanceData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1048575, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AccountDetailData> component10() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.topSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.borrowFroz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.notionalUsdForSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.notionalUsdForFutures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.notionalUsdForOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.notionalUsdForBorrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.availEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.delta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.deltaLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.deltaNeutralStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.isoEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.adjEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.imr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.ordFroz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountBalanceData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, ArrayList<AccountDetailData> arrayList, int i, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        return new AccountBalanceData(str, str2, str3, str4, str5, str6, str7, str8, str9, arrayList, i, str10, str11, str12, str13, str14, str15, str16, str17, str18);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountBalanceData)) {
            return false;
        }
        AccountBalanceData accountBalanceData = (AccountBalanceData) obj;
        return Intrinsics.EZpvd((Object) this.uTime, (Object) accountBalanceData.uTime) && Intrinsics.EZpvd((Object) this.totalEq, (Object) accountBalanceData.totalEq) && Intrinsics.EZpvd((Object) this.isoEq, (Object) accountBalanceData.isoEq) && Intrinsics.EZpvd((Object) this.adjEq, (Object) accountBalanceData.adjEq) && Intrinsics.EZpvd((Object) this.imr, (Object) accountBalanceData.imr) && Intrinsics.EZpvd((Object) this.mmr, (Object) accountBalanceData.mmr) && Intrinsics.EZpvd((Object) this.mgnRatio, (Object) accountBalanceData.mgnRatio) && Intrinsics.EZpvd((Object) this.notionalUsd, (Object) accountBalanceData.notionalUsd) && Intrinsics.EZpvd((Object) this.ordFroz, (Object) accountBalanceData.ordFroz) && Intrinsics.EZpvd(this.details, accountBalanceData.details) && this.topSize == accountBalanceData.topSize && Intrinsics.EZpvd((Object) this.borrowFroz, (Object) accountBalanceData.borrowFroz) && Intrinsics.EZpvd((Object) this.notionalUsdForSwap, (Object) accountBalanceData.notionalUsdForSwap) && Intrinsics.EZpvd((Object) this.notionalUsdForFutures, (Object) accountBalanceData.notionalUsdForFutures) && Intrinsics.EZpvd((Object) this.notionalUsdForOption, (Object) accountBalanceData.notionalUsdForOption) && Intrinsics.EZpvd((Object) this.notionalUsdForBorrow, (Object) accountBalanceData.notionalUsdForBorrow) && Intrinsics.EZpvd((Object) this.availEq, (Object) accountBalanceData.availEq) && Intrinsics.EZpvd((Object) this.delta, (Object) accountBalanceData.delta) && Intrinsics.EZpvd((Object) this.deltaLever, (Object) accountBalanceData.deltaLever) && Intrinsics.EZpvd((Object) this.deltaNeutralStatus, (Object) accountBalanceData.deltaNeutralStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdjEq() {
        return this.adjEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailEq() {
        return this.availEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBorrowFroz() {
        return this.borrowFroz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDelta() {
        return this.delta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeltaLever() {
        return this.deltaLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeltaNeutralStatus() {
        return this.deltaNeutralStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AccountDetailData> getDetails() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImr() {
        return this.imr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIsoEq() {
        return this.isoEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnRatio() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMmr() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsd() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsdForBorrow() {
        return this.notionalUsdForBorrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsdForFutures() {
        return this.notionalUsdForFutures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsdForOption() {
        return this.notionalUsdForOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsdForSwap() {
        return this.notionalUsdForSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdFroz() {
        return this.ordFroz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTopSize() {
        return this.topSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalEq() {
        return this.totalEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.uTime.hashCode();
        int iHashCode2 = this.totalEq.hashCode();
        int iHashCode3 = this.isoEq.hashCode();
        int iHashCode4 = this.adjEq.hashCode();
        int iHashCode5 = this.imr.hashCode();
        int iHashCode6 = this.mmr.hashCode();
        int iHashCode7 = this.mgnRatio.hashCode();
        int iHashCode8 = this.notionalUsd.hashCode();
        int iHashCode9 = this.ordFroz.hashCode();
        ArrayList<AccountDetailData> arrayList = this.details;
        int iHashCode10 = arrayList == null ? 0 : arrayList.hashCode();
        int iHashCode11 = Integer.hashCode(this.topSize);
        int iHashCode12 = this.borrowFroz.hashCode();
        int iHashCode13 = this.notionalUsdForSwap.hashCode();
        int iHashCode14 = this.notionalUsdForFutures.hashCode();
        int iHashCode15 = this.notionalUsdForOption.hashCode();
        int iHashCode16 = this.notionalUsdForBorrow.hashCode();
        String str = this.availEq;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.delta.hashCode()) * 31) + this.deltaLever.hashCode()) * 31) + this.deltaNeutralStatus.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdjEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.adjEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailEq(String str) {
        this.availEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBorrowFroz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.borrowFroz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDelta(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.delta = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeltaLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deltaLever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeltaNeutralStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deltaNeutralStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDetails(ArrayList<AccountDetailData> arrayList) {
        this.details = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsoEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isoEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mgnRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMmr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mmr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.notionalUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsdForBorrow(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.notionalUsdForBorrow = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsdForFutures(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.notionalUsdForFutures = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsdForOption(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.notionalUsdForOption = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsdForSwap(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.notionalUsdForSwap = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdFroz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordFroz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopSize(int i) {
        this.topSize = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountBalanceData(uTime=" + this.uTime + ", totalEq=" + this.totalEq + ", isoEq=" + this.isoEq + ", adjEq=" + this.adjEq + ", imr=" + this.imr + ", mmr=" + this.mmr + ", mgnRatio=" + this.mgnRatio + ", notionalUsd=" + this.notionalUsd + ", ordFroz=" + this.ordFroz + ", details=" + this.details + ", topSize=" + this.topSize + ", borrowFroz=" + this.borrowFroz + ", notionalUsdForSwap=" + this.notionalUsdForSwap + ", notionalUsdForFutures=" + this.notionalUsdForFutures + ", notionalUsdForOption=" + this.notionalUsdForOption + ", notionalUsdForBorrow=" + this.notionalUsdForBorrow + ", availEq=" + this.availEq + ", delta=" + this.delta + ", deltaLever=" + this.deltaLever + ", deltaNeutralStatus=" + this.deltaNeutralStatus + ")";
    }

    public /* synthetic */ AccountBalanceData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ArrayList arrayList, int i2, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.uTime = "";
        } else {
            this.uTime = str;
        }
        if ((i & 2) == 0) {
            this.totalEq = "";
        } else {
            this.totalEq = str2;
        }
        if ((i & 4) == 0) {
            this.isoEq = "";
        } else {
            this.isoEq = str3;
        }
        if ((i & 8) == 0) {
            this.adjEq = "";
        } else {
            this.adjEq = str4;
        }
        if ((i & 16) == 0) {
            this.imr = "";
        } else {
            this.imr = str5;
        }
        if ((i & 32) == 0) {
            this.mmr = "";
        } else {
            this.mmr = str6;
        }
        if ((i & 64) == 0) {
            this.mgnRatio = "";
        } else {
            this.mgnRatio = str7;
        }
        if ((i & 128) == 0) {
            this.notionalUsd = "";
        } else {
            this.notionalUsd = str8;
        }
        if ((i & 256) == 0) {
            this.ordFroz = "";
        } else {
            this.ordFroz = str9;
        }
        this.details = (i & 512) == 0 ? new ArrayList() : arrayList;
        this.topSize = (i & 1024) == 0 ? 0 : i2;
        if ((i & 2048) == 0) {
            this.borrowFroz = "";
        } else {
            this.borrowFroz = str10;
        }
        if ((i & 4096) == 0) {
            this.notionalUsdForSwap = "";
        } else {
            this.notionalUsdForSwap = str11;
        }
        if ((i & 8192) == 0) {
            this.notionalUsdForFutures = "";
        } else {
            this.notionalUsdForFutures = str12;
        }
        if ((i & 16384) == 0) {
            this.notionalUsdForOption = "";
        } else {
            this.notionalUsdForOption = str13;
        }
        if ((32768 & i) == 0) {
            this.notionalUsdForBorrow = "";
        } else {
            this.notionalUsdForBorrow = str14;
        }
        if ((65536 & i) == 0) {
            this.availEq = "";
        } else {
            this.availEq = str15;
        }
        if ((131072 & i) == 0) {
            this.delta = "";
        } else {
            this.delta = str16;
        }
        if ((262144 & i) == 0) {
            this.deltaLever = "";
        } else {
            this.deltaLever = str17;
        }
        if ((i & 524288) == 0) {
            this.deltaNeutralStatus = "";
        } else {
            this.deltaNeutralStatus = str18;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AccountBalanceData accountBalanceData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) accountBalanceData.uTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, accountBalanceData.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) accountBalanceData.totalEq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, accountBalanceData.totalEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) accountBalanceData.isoEq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, accountBalanceData.isoEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) accountBalanceData.adjEq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, accountBalanceData.adjEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) accountBalanceData.imr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, accountBalanceData.imr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) accountBalanceData.mmr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, accountBalanceData.mmr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) accountBalanceData.mgnRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, accountBalanceData.mgnRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) accountBalanceData.notionalUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, accountBalanceData.notionalUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) accountBalanceData.ordFroz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, accountBalanceData.ordFroz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(accountBalanceData.details, new ArrayList())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], accountBalanceData.details);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || accountBalanceData.topSize != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, accountBalanceData.topSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) accountBalanceData.borrowFroz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, accountBalanceData.borrowFroz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) accountBalanceData.notionalUsdForSwap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, accountBalanceData.notionalUsdForSwap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) accountBalanceData.notionalUsdForFutures, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, accountBalanceData.notionalUsdForFutures);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) accountBalanceData.notionalUsdForOption, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, accountBalanceData.notionalUsdForOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) accountBalanceData.notionalUsdForBorrow, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, accountBalanceData.notionalUsdForBorrow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) accountBalanceData.availEq, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, accountBalanceData.availEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) accountBalanceData.delta, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, accountBalanceData.delta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) accountBalanceData.deltaLever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, accountBalanceData.deltaLever);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) && Intrinsics.EZpvd((Object) accountBalanceData.deltaNeutralStatus, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 19, accountBalanceData.deltaNeutralStatus);
    }

    public AccountBalanceData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, ArrayList<AccountDetailData> arrayList, int i, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        this.uTime = str;
        this.totalEq = str2;
        this.isoEq = str3;
        this.adjEq = str4;
        this.imr = str5;
        this.mmr = str6;
        this.mgnRatio = str7;
        this.notionalUsd = str8;
        this.ordFroz = str9;
        this.details = arrayList;
        this.topSize = i;
        this.borrowFroz = str10;
        this.notionalUsdForSwap = str11;
        this.notionalUsdForFutures = str12;
        this.notionalUsdForOption = str13;
        this.notionalUsdForBorrow = str14;
        this.availEq = str15;
        this.delta = str16;
        this.deltaLever = str17;
        this.deltaNeutralStatus = str18;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e5: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r42v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r42v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r42v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r42v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r42v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x004c: ARITH (r42v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0052: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:28) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r31v0 java.util.ArrayList))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0058: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r32v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0060: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r42v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007a: ARITH (r42v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0086: ARITH (r42v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0091: ARITH (r42v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009c: ARITH (r42v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a7: ARITH (r42v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b2: ARITH (r42v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.subscribe.AccountDetailData>, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:18) call: com.okinc.unify_trade.biz.subscribe.AccountBalanceData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AccountBalanceData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ArrayList arrayList, int i, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? new ArrayList() : arrayList, (i2 & 1024) != 0 ? 0 : i, (i2 & 2048) != 0 ? "" : str10, (i2 & 4096) != 0 ? "" : str11, (i2 & 8192) != 0 ? "" : str12, (i2 & 16384) != 0 ? "" : str13, (i2 & 32768) != 0 ? "" : str14, (i2 & 65536) != 0 ? "" : str15, (i2 & 131072) != 0 ? "" : str16, (i2 & 262144) != 0 ? "" : str17, (i2 & 524288) != 0 ? "" : str18);
    }

    public static final class Companion {

        public static final class TaskDescription extends TypeToken<List<? extends AccountBalanceData>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.AccountBalanceData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AccountBalanceData> serializer() {
            return AccountBalanceData$$serializer.INSTANCE;
        }

        public final AccountBalanceData EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            xVJ xvj = xVJ.KWHzl;
            Type type = new TaskDescription().getType();
            Intrinsics.copydefault(type);
            List list = (List) xvj.OLrzqt(str, type, true);
            if (list == null || list.isEmpty()) {
                return null;
            }
            return (AccountBalanceData) list.get(0);
        }
    }

    public final void updateTotal(@NotNull AccountBalanceData accountBalanceData) {
        Intrinsics.checkNotNullParameter(accountBalanceData, "");
        this.uTime = accountBalanceData.uTime;
        this.totalEq = accountBalanceData.totalEq;
        this.isoEq = accountBalanceData.isoEq;
        this.adjEq = accountBalanceData.adjEq;
        this.imr = accountBalanceData.imr;
        this.mmr = accountBalanceData.mmr;
        this.mgnRatio = accountBalanceData.mgnRatio;
        this.borrowFroz = accountBalanceData.borrowFroz;
        this.notionalUsd = accountBalanceData.notionalUsd;
        this.notionalUsdForSwap = accountBalanceData.notionalUsdForSwap;
        this.notionalUsdForFutures = accountBalanceData.notionalUsdForFutures;
        this.notionalUsdForOption = accountBalanceData.notionalUsdForOption;
        this.notionalUsdForBorrow = accountBalanceData.notionalUsdForBorrow;
        this.delta = accountBalanceData.delta;
        this.deltaLever = accountBalanceData.deltaLever;
        this.deltaNeutralStatus = accountBalanceData.deltaNeutralStatus;
    }
}
