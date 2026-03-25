package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.unify_trade.biz.bot.TpSLTriggerItem;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AIData implements Parcelable {
    private String annualizedRate;
    private boolean basePos;
    private String baseSz;
    private Boolean cbAutoReserve;
    private String direction;
    private final String displayName;
    private String extraMarginSz;
    private String gridNum;
    private String instId;
    private String investmentType;
    private boolean isToManual;
    private String lever;
    private String maxPx;
    private String maxSafetyOrds;
    private String minInvestment;
    private String minPx;
    private String nmpUnderlyingId;
    private String perGridProfitRatio;
    private String perMaxProfitRate;
    private String perMinProfitRate;
    private String profitSharingRatio;
    private String pxSteps;
    private String quoteSz;
    private Boolean reserveFunds;
    private String runType;
    private ArrayList<AdvancedTriggerSign> signParams;
    private String slPx;
    private String slRatio;
    private String systemSource;
    private String tpPx;
    private String tpRatio;
    private TpSlTriggerParam tpslTriggerParam;
    private TrailingConfig trailingDownConfig;
    private TrailingConfig trailingUpConfig;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AIData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(AdvancedTriggerSign$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<AIData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AIData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AdvancedTriggerSign.CREATOR.createFromParcel(parcel));
            }
            return new AIData(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : TrailingConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TrailingConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readString(), TpSlTriggerParam.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AIData[] newArray(int i) {
            return new AIData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AIData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (Boolean) null, (TrailingConfig) null, (TrailingConfig) null, false, (String) null, (String) null, (TpSlTriggerParam) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, -1, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AdvancedTriggerSign> component12() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig component14() {
        return this.trailingUpConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig component15() {
        return this.trailingDownConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.basePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.tpPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.slPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParam component19() {
        return this.tpslTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.perGridProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.minInvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component23() {
        return this.isToManual;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.systemSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.nmpUnderlyingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.baseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.investmentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component33() {
        return this.cbAutoReserve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.perMaxProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.perMinProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.annualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AIData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, String str10, @NotNull String str11, @NotNull ArrayList<AdvancedTriggerSign> arrayList, Boolean bool, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, boolean z, String str12, String str13, @NotNull TpSlTriggerParam tpSlTriggerParam, String str14, @NotNull String str15, @NotNull String str16, boolean z2, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Boolean bool2, String str26) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(tpSlTriggerParam, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        return new AIData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, arrayList, bool, trailingConfig, trailingConfig2, z, str12, str13, tpSlTriggerParam, str14, str15, str16, z2, str17, str18, str19, str20, str21, str22, str23, str24, str25, bool2, str26);
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
        if (!(obj instanceof AIData)) {
            return false;
        }
        AIData aIData = (AIData) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) aIData.instId) && Intrinsics.EZpvd((Object) this.gridNum, (Object) aIData.gridNum) && Intrinsics.EZpvd((Object) this.maxPx, (Object) aIData.maxPx) && Intrinsics.EZpvd((Object) this.minPx, (Object) aIData.minPx) && Intrinsics.EZpvd((Object) this.perMaxProfitRate, (Object) aIData.perMaxProfitRate) && Intrinsics.EZpvd((Object) this.perMinProfitRate, (Object) aIData.perMinProfitRate) && Intrinsics.EZpvd((Object) this.annualizedRate, (Object) aIData.annualizedRate) && Intrinsics.EZpvd((Object) this.runType, (Object) aIData.runType) && Intrinsics.EZpvd((Object) this.direction, (Object) aIData.direction) && Intrinsics.EZpvd((Object) this.displayName, (Object) aIData.displayName) && Intrinsics.EZpvd((Object) this.lever, (Object) aIData.lever) && Intrinsics.EZpvd(this.signParams, aIData.signParams) && Intrinsics.EZpvd(this.reserveFunds, aIData.reserveFunds) && Intrinsics.EZpvd(this.trailingUpConfig, aIData.trailingUpConfig) && Intrinsics.EZpvd(this.trailingDownConfig, aIData.trailingDownConfig) && this.basePos == aIData.basePos && Intrinsics.EZpvd((Object) this.tpPx, (Object) aIData.tpPx) && Intrinsics.EZpvd((Object) this.slPx, (Object) aIData.slPx) && Intrinsics.EZpvd(this.tpslTriggerParam, aIData.tpslTriggerParam) && Intrinsics.EZpvd((Object) this.perGridProfitRatio, (Object) aIData.perGridProfitRatio) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) aIData.profitSharingRatio) && Intrinsics.EZpvd((Object) this.minInvestment, (Object) aIData.minInvestment) && this.isToManual == aIData.isToManual && Intrinsics.EZpvd((Object) this.tpRatio, (Object) aIData.tpRatio) && Intrinsics.EZpvd((Object) this.slRatio, (Object) aIData.slRatio) && Intrinsics.EZpvd((Object) this.pxSteps, (Object) aIData.pxSteps) && Intrinsics.EZpvd((Object) this.maxSafetyOrds, (Object) aIData.maxSafetyOrds) && Intrinsics.EZpvd((Object) this.quoteSz, (Object) aIData.quoteSz) && Intrinsics.EZpvd((Object) this.systemSource, (Object) aIData.systemSource) && Intrinsics.EZpvd((Object) this.nmpUnderlyingId, (Object) aIData.nmpUnderlyingId) && Intrinsics.EZpvd((Object) this.baseSz, (Object) aIData.baseSz) && Intrinsics.EZpvd((Object) this.investmentType, (Object) aIData.investmentType) && Intrinsics.EZpvd(this.cbAutoReserve, aIData.cbAutoReserve) && Intrinsics.EZpvd((Object) this.extraMarginSz, (Object) aIData.extraMarginSz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnnualizedRate() {
        return this.annualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBasePos() {
        return this.basePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseSz() {
        return this.baseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCbAutoReserve() {
        return this.cbAutoReserve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtraMarginSz() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridNum() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentType() {
        return this.investmentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPx() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSafetyOrds() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinInvestment() {
        return this.minInvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPx() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNmpUnderlyingId() {
        return this.nmpUnderlyingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerGridProfitRatio() {
        return this.perGridProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerMaxProfitRate() {
        return this.perMaxProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerMinProfitRate() {
        return this.perMinProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingRatio() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxSteps() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSz() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getReserveFunds() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRunType() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AdvancedTriggerSign> getSignParams() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlPx() {
        return this.slPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlRatio() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSystemSource() {
        return this.systemSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpPx() {
        return this.tpPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpRatio() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParam getTpslTriggerParam() {
        return this.tpslTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig getTrailingDownConfig() {
        return this.trailingDownConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingConfig getTrailingUpConfig() {
        return this.trailingUpConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        int iHashCode2 = this.gridNum.hashCode();
        int iHashCode3 = this.maxPx.hashCode();
        int iHashCode4 = this.minPx.hashCode();
        int iHashCode5 = this.perMaxProfitRate.hashCode();
        int iHashCode6 = this.perMinProfitRate.hashCode();
        int iHashCode7 = this.annualizedRate.hashCode();
        int iHashCode8 = this.runType.hashCode();
        int iHashCode9 = this.direction.hashCode();
        String str = this.displayName;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        int iHashCode11 = this.lever.hashCode();
        int iHashCode12 = this.signParams.hashCode();
        Boolean bool = this.reserveFunds;
        int iHashCode13 = bool == null ? 0 : bool.hashCode();
        TrailingConfig trailingConfig = this.trailingUpConfig;
        int iHashCode14 = trailingConfig == null ? 0 : trailingConfig.hashCode();
        TrailingConfig trailingConfig2 = this.trailingDownConfig;
        int iHashCode15 = trailingConfig2 == null ? 0 : trailingConfig2.hashCode();
        int iHashCode16 = Boolean.hashCode(this.basePos);
        String str2 = this.tpPx;
        int iHashCode17 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.slPx;
        int iHashCode18 = str3 == null ? 0 : str3.hashCode();
        int iHashCode19 = this.tpslTriggerParam.hashCode();
        String str4 = this.perGridProfitRatio;
        int iHashCode20 = str4 == null ? 0 : str4.hashCode();
        int iHashCode21 = this.profitSharingRatio.hashCode();
        int iHashCode22 = this.minInvestment.hashCode();
        int iHashCode23 = Boolean.hashCode(this.isToManual);
        String str5 = this.tpRatio;
        int iHashCode24 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.slRatio;
        int iHashCode25 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.pxSteps;
        int iHashCode26 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.maxSafetyOrds;
        int iHashCode27 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.quoteSz;
        int iHashCode28 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.systemSource;
        int iHashCode29 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.nmpUnderlyingId;
        int iHashCode30 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.baseSz;
        int iHashCode31 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.investmentType;
        int iHashCode32 = str13 == null ? 0 : str13.hashCode();
        Boolean bool2 = this.cbAutoReserve;
        int iHashCode33 = bool2 == null ? 0 : bool2.hashCode();
        String str14 = this.extraMarginSz;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + (str14 == null ? 0 : str14.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isToManual() {
        return this.isToManual;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAnnualizedRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.annualizedRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBasePos(boolean z) {
        this.basePos = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseSz(String str) {
        this.baseSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCbAutoReserve(Boolean bool) {
        this.cbAutoReserve = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtraMarginSz(String str) {
        this.extraMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGridNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gridNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestmentType(String str) {
        this.investmentType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSafetyOrds(String str) {
        this.maxSafetyOrds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinInvestment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minInvestment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNmpUnderlyingId(String str) {
        this.nmpUnderlyingId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerGridProfitRatio(String str) {
        this.perGridProfitRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerMaxProfitRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.perMaxProfitRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerMinProfitRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.perMinProfitRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSharingRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.profitSharingRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxSteps(String str) {
        this.pxSteps = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteSz(String str) {
        this.quoteSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReserveFunds(Boolean bool) {
        this.reserveFunds = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRunType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.runType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignParams(@NotNull ArrayList<AdvancedTriggerSign> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.signParams = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlPx(String str) {
        this.slPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlRatio(String str) {
        this.slRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSystemSource(String str) {
        this.systemSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToManual(boolean z) {
        this.isToManual = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpPx(String str) {
        this.tpPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpRatio(String str) {
        this.tpRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpslTriggerParam(@NotNull TpSlTriggerParam tpSlTriggerParam) {
        Intrinsics.checkNotNullParameter(tpSlTriggerParam, "");
        this.tpslTriggerParam = tpSlTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrailingDownConfig(TrailingConfig trailingConfig) {
        this.trailingDownConfig = trailingConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrailingUpConfig(TrailingConfig trailingConfig) {
        this.trailingUpConfig = trailingConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AIData(instId=" + this.instId + ", gridNum=" + this.gridNum + ", maxPx=" + this.maxPx + ", minPx=" + this.minPx + ", perMaxProfitRate=" + this.perMaxProfitRate + ", perMinProfitRate=" + this.perMinProfitRate + ", annualizedRate=" + this.annualizedRate + ", runType=" + this.runType + ", direction=" + this.direction + ", displayName=" + this.displayName + ", lever=" + this.lever + ", signParams=" + this.signParams + ", reserveFunds=" + this.reserveFunds + ", trailingUpConfig=" + this.trailingUpConfig + ", trailingDownConfig=" + this.trailingDownConfig + ", basePos=" + this.basePos + ", tpPx=" + this.tpPx + ", slPx=" + this.slPx + ", tpslTriggerParam=" + this.tpslTriggerParam + ", perGridProfitRatio=" + this.perGridProfitRatio + ", profitSharingRatio=" + this.profitSharingRatio + ", minInvestment=" + this.minInvestment + ", isToManual=" + this.isToManual + ", tpRatio=" + this.tpRatio + ", slRatio=" + this.slRatio + ", pxSteps=" + this.pxSteps + ", maxSafetyOrds=" + this.maxSafetyOrds + ", quoteSz=" + this.quoteSz + ", systemSource=" + this.systemSource + ", nmpUnderlyingId=" + this.nmpUnderlyingId + ", baseSz=" + this.baseSz + ", investmentType=" + this.investmentType + ", cbAutoReserve=" + this.cbAutoReserve + ", extraMarginSz=" + this.extraMarginSz + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.gridNum);
        parcel.writeString(this.maxPx);
        parcel.writeString(this.minPx);
        parcel.writeString(this.perMaxProfitRate);
        parcel.writeString(this.perMinProfitRate);
        parcel.writeString(this.annualizedRate);
        parcel.writeString(this.runType);
        parcel.writeString(this.direction);
        parcel.writeString(this.displayName);
        parcel.writeString(this.lever);
        ArrayList<AdvancedTriggerSign> arrayList = this.signParams;
        parcel.writeInt(arrayList.size());
        Iterator<AdvancedTriggerSign> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        Boolean bool = this.reserveFunds;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        TrailingConfig trailingConfig = this.trailingUpConfig;
        if (trailingConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            trailingConfig.writeToParcel(parcel, i);
        }
        TrailingConfig trailingConfig2 = this.trailingDownConfig;
        if (trailingConfig2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            trailingConfig2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.basePos ? 1 : 0);
        parcel.writeString(this.tpPx);
        parcel.writeString(this.slPx);
        this.tpslTriggerParam.writeToParcel(parcel, i);
        parcel.writeString(this.perGridProfitRatio);
        parcel.writeString(this.profitSharingRatio);
        parcel.writeString(this.minInvestment);
        parcel.writeInt(this.isToManual ? 1 : 0);
        parcel.writeString(this.tpRatio);
        parcel.writeString(this.slRatio);
        parcel.writeString(this.pxSteps);
        parcel.writeString(this.maxSafetyOrds);
        parcel.writeString(this.quoteSz);
        parcel.writeString(this.systemSource);
        parcel.writeString(this.nmpUnderlyingId);
        parcel.writeString(this.baseSz);
        parcel.writeString(this.investmentType);
        Boolean bool2 = this.cbAutoReserve;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.extraMarginSz);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AIData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AIData> serializer() {
            return AIData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AIData(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, ArrayList arrayList, Boolean bool, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, boolean z, String str12, String str13, TpSlTriggerParam tpSlTriggerParam, String str14, String str15, String str16, boolean z2, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Boolean bool2, String str26, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.gridNum = "";
        } else {
            this.gridNum = str2;
        }
        if ((i & 4) == 0) {
            this.maxPx = "";
        } else {
            this.maxPx = str3;
        }
        if ((i & 8) == 0) {
            this.minPx = "";
        } else {
            this.minPx = str4;
        }
        if ((i & 16) == 0) {
            this.perMaxProfitRate = "";
        } else {
            this.perMaxProfitRate = str5;
        }
        if ((i & 32) == 0) {
            this.perMinProfitRate = "";
        } else {
            this.perMinProfitRate = str6;
        }
        if ((i & 64) == 0) {
            this.annualizedRate = "";
        } else {
            this.annualizedRate = str7;
        }
        if ((i & 128) == 0) {
            this.runType = "";
        } else {
            this.runType = str8;
        }
        if ((i & 256) == 0) {
            this.direction = "";
        } else {
            this.direction = str9;
        }
        if ((i & 512) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str10;
        }
        if ((i & 1024) == 0) {
            this.lever = "";
        } else {
            this.lever = str11;
        }
        this.signParams = (i & 2048) == 0 ? new ArrayList() : arrayList;
        if ((i & 4096) == 0) {
            this.reserveFunds = null;
        } else {
            this.reserveFunds = bool;
        }
        if ((i & 8192) == 0) {
            this.trailingUpConfig = null;
        } else {
            this.trailingUpConfig = trailingConfig;
        }
        if ((i & 16384) == 0) {
            this.trailingDownConfig = null;
        } else {
            this.trailingDownConfig = trailingConfig2;
        }
        if ((32768 & i) == 0) {
            this.basePos = false;
        } else {
            this.basePos = z;
        }
        if ((65536 & i) == 0) {
            this.tpPx = null;
        } else {
            this.tpPx = str12;
        }
        if ((131072 & i) == 0) {
            this.slPx = null;
        } else {
            this.slPx = str13;
        }
        this.tpslTriggerParam = (262144 & i) == 0 ? new TpSlTriggerParam((String) null, (String) null, (TpSLTriggerItem) null, (TpSLTriggerItem) null, 15, (DefaultConstructorMarker) null) : tpSlTriggerParam;
        if ((524288 & i) == 0) {
            this.perGridProfitRatio = null;
        } else {
            this.perGridProfitRatio = str14;
        }
        if ((1048576 & i) == 0) {
            this.profitSharingRatio = "";
        } else {
            this.profitSharingRatio = str15;
        }
        if ((2097152 & i) == 0) {
            this.minInvestment = "";
        } else {
            this.minInvestment = str16;
        }
        this.isToManual = (4194304 & i) != 0 ? z2 : false;
        if ((8388608 & i) == 0) {
            this.tpRatio = null;
        } else {
            this.tpRatio = str17;
        }
        if ((16777216 & i) == 0) {
            this.slRatio = null;
        } else {
            this.slRatio = str18;
        }
        if ((33554432 & i) == 0) {
            this.pxSteps = null;
        } else {
            this.pxSteps = str19;
        }
        if ((67108864 & i) == 0) {
            this.maxSafetyOrds = null;
        } else {
            this.maxSafetyOrds = str20;
        }
        if ((134217728 & i) == 0) {
            this.quoteSz = null;
        } else {
            this.quoteSz = str21;
        }
        if ((268435456 & i) == 0) {
            this.systemSource = null;
        } else {
            this.systemSource = str22;
        }
        if ((536870912 & i) == 0) {
            this.nmpUnderlyingId = null;
        } else {
            this.nmpUnderlyingId = str23;
        }
        if ((1073741824 & i) == 0) {
            this.baseSz = null;
        } else {
            this.baseSz = str24;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.investmentType = null;
        } else {
            this.investmentType = str25;
        }
        this.cbAutoReserve = (i2 & 1) == 0 ? Boolean.FALSE : bool2;
        if ((i2 & 2) == 0) {
            this.extraMarginSz = null;
        } else {
            this.extraMarginSz = str26;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AIData aIData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) aIData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, aIData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) aIData.gridNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, aIData.gridNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) aIData.maxPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, aIData.maxPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) aIData.minPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, aIData.minPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) aIData.perMaxProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, aIData.perMaxProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) aIData.perMinProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, aIData.perMinProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) aIData.annualizedRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, aIData.annualizedRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) aIData.runType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, aIData.runType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) aIData.direction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, aIData.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || aIData.displayName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, aIData.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) aIData.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, aIData.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(aIData.signParams, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], aIData.signParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || aIData.reserveFunds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, aIData.reserveFunds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || aIData.trailingUpConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, TrailingConfig$$serializer.INSTANCE, aIData.trailingUpConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || aIData.trailingDownConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, TrailingConfig$$serializer.INSTANCE, aIData.trailingDownConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || aIData.basePos) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, aIData.basePos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || aIData.tpPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, aIData.tpPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || aIData.slPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, aIData.slPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd(aIData.tpslTriggerParam, new TpSlTriggerParam((String) null, (String) null, (TpSLTriggerItem) null, (TpSLTriggerItem) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 18, TpSlTriggerParam$$serializer.INSTANCE, aIData.tpslTriggerParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || aIData.perGridProfitRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, aIData.perGridProfitRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) aIData.profitSharingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, aIData.profitSharingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) aIData.minInvestment, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, aIData.minInvestment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || aIData.isToManual) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 22, aIData.isToManual);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || aIData.tpRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, aIData.tpRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || aIData.slRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, aIData.slRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || aIData.pxSteps != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, aIData.pxSteps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || aIData.maxSafetyOrds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, aIData.maxSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || aIData.quoteSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, aIData.quoteSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || aIData.systemSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, aIData.systemSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || aIData.nmpUnderlyingId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, aIData.nmpUnderlyingId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || aIData.baseSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, aIData.baseSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || aIData.investmentType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, aIData.investmentType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd(aIData.cbAutoReserve, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, BooleanSerializer.INSTANCE, aIData.cbAutoReserve);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) && aIData.extraMarginSz == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, StringSerializer.INSTANCE, aIData.extraMarginSz);
    }

    public AIData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, String str10, @NotNull String str11, @NotNull ArrayList<AdvancedTriggerSign> arrayList, Boolean bool, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, boolean z, String str12, String str13, @NotNull TpSlTriggerParam tpSlTriggerParam, String str14, @NotNull String str15, @NotNull String str16, boolean z2, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Boolean bool2, String str26) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(tpSlTriggerParam, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        this.instId = str;
        this.gridNum = str2;
        this.maxPx = str3;
        this.minPx = str4;
        this.perMaxProfitRate = str5;
        this.perMinProfitRate = str6;
        this.annualizedRate = str7;
        this.runType = str8;
        this.direction = str9;
        this.displayName = str10;
        this.lever = str11;
        this.signParams = arrayList;
        this.reserveFunds = bool;
        this.trailingUpConfig = trailingConfig;
        this.trailingDownConfig = trailingConfig2;
        this.basePos = z;
        this.tpPx = str12;
        this.slPx = str13;
        this.tpslTriggerParam = tpSlTriggerParam;
        this.perGridProfitRatio = str14;
        this.profitSharingRatio = str15;
        this.minInvestment = str16;
        this.isToManual = z2;
        this.tpRatio = str17;
        this.slRatio = str18;
        this.pxSteps = str19;
        this.maxSafetyOrds = str20;
        this.quoteSz = str21;
        this.systemSource = str22;
        this.nmpUnderlyingId = str23;
        this.baseSz = str24;
        this.investmentType = str25;
        this.cbAutoReserve = bool2;
        this.extraMarginSz = str26;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01b2: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r69v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r69v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r69v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r69v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r69v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r69v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r69v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r69v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r69v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r69v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r69v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x005c: ARITH (r69v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0062: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:2262) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r46v0 java.util.ArrayList))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0068: ARITH (r69v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r47v0 java.lang.Boolean))
  (wrap:com.okinc.unify_trade.biz.TrailingConfig:?: TERNARY null = ((wrap:int:0x0070: ARITH (r69v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TrailingConfig) : (r48v0 com.okinc.unify_trade.biz.TrailingConfig))
  (wrap:com.okinc.unify_trade.biz.TrailingConfig:?: TERNARY null = ((wrap:int:0x007a: ARITH (r69v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TrailingConfig) : (r49v0 com.okinc.unify_trade.biz.TrailingConfig))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0085: ARITH (r69v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r50v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r69v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009d: ARITH (r69v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.bot.TpSlTriggerParam:?: TERNARY null = ((wrap:int:0x00a8: ARITH (r69v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c8: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.unify_trade.biz.bot.TpSLTriggerItem:?: CAST (com.okinc.unify_trade.biz.bot.TpSLTriggerItem) (null com.okinc.unify_trade.biz.bot.TpSLTriggerItem))
  (wrap:com.okinc.unify_trade.biz.bot.TpSLTriggerItem:?: CAST (com.okinc.unify_trade.biz.bot.TpSLTriggerItem) (null com.okinc.unify_trade.biz.bot.TpSLTriggerItem))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.TpSLTriggerItem, com.okinc.unify_trade.biz.bot.TpSLTriggerItem, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:2269) call: com.okinc.unify_trade.biz.bot.TpSlTriggerParam.<init>(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.TpSLTriggerItem, com.okinc.unify_trade.biz.bot.TpSLTriggerItem, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r53v0 com.okinc.unify_trade.biz.bot.TpSlTriggerParam))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d0: ARITH (r69v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00db: ARITH (r69v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e6: ARITH (r69v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00f1: ARITH (r69v0 int) & (4194304 int) A[WRAPPED]) == (0 int)) ? (r57v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fa: ARITH (r69v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0105: ARITH (r69v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0110: ARITH (r69v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011b: ARITH (r69v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0126: ARITH (r69v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0131: ARITH (r69v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013c: ARITH (r69v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0147: ARITH (r69v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0152: ARITH (r69v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x015a: ARITH (r70v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x015e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r67v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0163: ARITH (r70v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r68v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.AdvancedTriggerSign>, java.lang.Boolean, com.okinc.unify_trade.biz.TrailingConfig, com.okinc.unify_trade.biz.TrailingConfig, boolean, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.TpSlTriggerParam, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:2250) call: com.okinc.unify_trade.biz.AIData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.Boolean, com.okinc.unify_trade.biz.TrailingConfig, com.okinc.unify_trade.biz.TrailingConfig, boolean, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.TpSlTriggerParam, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ AIData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, ArrayList arrayList, Boolean bool, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, boolean z, String str12, String str13, TpSlTriggerParam tpSlTriggerParam, String str14, String str15, String str16, boolean z2, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Boolean bool2, String str26, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? new ArrayList() : arrayList, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : trailingConfig, (i & 16384) != 0 ? null : trailingConfig2, (i & 32768) != 0 ? false : z, (i & 65536) != 0 ? null : str12, (i & 131072) != 0 ? null : str13, (i & 262144) != 0 ? new TpSlTriggerParam((String) null, (String) null, (TpSLTriggerItem) null, (TpSLTriggerItem) null, 15, (DefaultConstructorMarker) null) : tpSlTriggerParam, (i & 524288) != 0 ? null : str14, (i & 1048576) != 0 ? "" : str15, (i & 2097152) != 0 ? "" : str16, (i & 4194304) == 0 ? z2 : false, (i & 8388608) != 0 ? null : str17, (i & 16777216) != 0 ? null : str18, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str19, (i & 67108864) != 0 ? null : str20, (i & 134217728) != 0 ? null : str21, (i & 268435456) != 0 ? null : str22, (i & 536870912) != 0 ? null : str23, (i & 1073741824) != 0 ? null : str24, (i & Integer.MIN_VALUE) != 0 ? null : str25, (i2 & 1) != 0 ? Boolean.FALSE : bool2, (i2 & 2) != 0 ? null : str26);
    }
}
