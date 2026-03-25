package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
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
import o.InterfaceC55792xqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ContractGridReq implements Parcelable, InterfaceC55792xqd {
    private String actualMarginSz;
    private String algoId;
    private String annualizedRate;
    private Boolean autoReserve;
    private String autoTransfer;
    private Boolean basePos;
    private String batchNo;
    private String contractGridVersion;
    private String direction;
    private String displayName;
    private String extraMarginSz;
    private String gridNum;
    private String instId;
    private String instType;
    private String investType;
    private String lever;
    private String maxPx;
    private String minPx;
    private String nmpUnderlyingId;
    private String openPosSlippage;
    private Boolean openPosSlippageDefault;
    private String ordType;
    private String ordVariant;
    private String profitSharingRatio;
    private String runType;
    private ArrayList<AdvancedTriggerSign> signParams;
    private String slOrdPx;
    private String slRatio;
    private String slTriggerPx;
    private String systemSource;
    private String sz;
    private String topupActualMarginSz;
    private String tpOrdPx;
    private String tpRatio;
    private String tpTriggerPx;
    private String voucherId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ContractGridReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(AdvancedTriggerSign$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<ContractGridReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractGridReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AdvancedTriggerSign.CREATOR.createFromParcel(parcel));
            }
            return new ContractGridReq(string, string2, boolValueOf, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractGridReq[] newArray(int i) {
            return new ContractGridReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContractGridReq() {
        this((String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, -1, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AdvancedTriggerSign> component19() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.annualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.autoTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.systemSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.nmpUnderlyingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.batchNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.voucherId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component28() {
        return this.autoReserve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.basePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.contractGridVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.openPosSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component33() {
        return this.openPosSlippageDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.ordVariant;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.topupActualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractGridReq copy(@NotNull String str, @NotNull String str2, Boolean bool, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, @NotNull String str17, @NotNull ArrayList<AdvancedTriggerSign> arrayList, @NotNull String str18, @NotNull String str19, String str20, String str21, String str22, String str23, String str24, String str25, Boolean bool2, String str26, String str27, String str28, String str29, Boolean bool3, String str30, String str31, String str32) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        return new ContractGridReq(str, str2, bool, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, arrayList, str18, str19, str20, str21, str22, str23, str24, str25, bool2, str26, str27, str28, str29, bool3, str30, str31, str32);
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
        if (!(obj instanceof ContractGridReq)) {
            return false;
        }
        ContractGridReq contractGridReq = (ContractGridReq) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) contractGridReq.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) contractGridReq.instType) && Intrinsics.EZpvd(this.basePos, contractGridReq.basePos) && Intrinsics.EZpvd((Object) this.gridNum, (Object) contractGridReq.gridNum) && Intrinsics.EZpvd((Object) this.investType, (Object) contractGridReq.investType) && Intrinsics.EZpvd((Object) this.maxPx, (Object) contractGridReq.maxPx) && Intrinsics.EZpvd((Object) this.minPx, (Object) contractGridReq.minPx) && Intrinsics.EZpvd((Object) this.sz, (Object) contractGridReq.sz) && Intrinsics.EZpvd((Object) this.runType, (Object) contractGridReq.runType) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) contractGridReq.slTriggerPx) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) contractGridReq.tpTriggerPx) && Intrinsics.EZpvd((Object) this.tpRatio, (Object) contractGridReq.tpRatio) && Intrinsics.EZpvd((Object) this.slRatio, (Object) contractGridReq.slRatio) && Intrinsics.EZpvd((Object) this.tpOrdPx, (Object) contractGridReq.tpOrdPx) && Intrinsics.EZpvd((Object) this.slOrdPx, (Object) contractGridReq.slOrdPx) && Intrinsics.EZpvd((Object) this.direction, (Object) contractGridReq.direction) && Intrinsics.EZpvd((Object) this.displayName, (Object) contractGridReq.displayName) && Intrinsics.EZpvd((Object) this.lever, (Object) contractGridReq.lever) && Intrinsics.EZpvd(this.signParams, contractGridReq.signParams) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) contractGridReq.profitSharingRatio) && Intrinsics.EZpvd((Object) this.ordType, (Object) contractGridReq.ordType) && Intrinsics.EZpvd((Object) this.annualizedRate, (Object) contractGridReq.annualizedRate) && Intrinsics.EZpvd((Object) this.autoTransfer, (Object) contractGridReq.autoTransfer) && Intrinsics.EZpvd((Object) this.systemSource, (Object) contractGridReq.systemSource) && Intrinsics.EZpvd((Object) this.nmpUnderlyingId, (Object) contractGridReq.nmpUnderlyingId) && Intrinsics.EZpvd((Object) this.batchNo, (Object) contractGridReq.batchNo) && Intrinsics.EZpvd((Object) this.voucherId, (Object) contractGridReq.voucherId) && Intrinsics.EZpvd(this.autoReserve, contractGridReq.autoReserve) && Intrinsics.EZpvd((Object) this.actualMarginSz, (Object) contractGridReq.actualMarginSz) && Intrinsics.EZpvd((Object) this.extraMarginSz, (Object) contractGridReq.extraMarginSz) && Intrinsics.EZpvd((Object) this.contractGridVersion, (Object) contractGridReq.contractGridVersion) && Intrinsics.EZpvd((Object) this.openPosSlippage, (Object) contractGridReq.openPosSlippage) && Intrinsics.EZpvd(this.openPosSlippageDefault, contractGridReq.openPosSlippageDefault) && Intrinsics.EZpvd((Object) this.ordVariant, (Object) contractGridReq.ordVariant) && Intrinsics.EZpvd((Object) this.algoId, (Object) contractGridReq.algoId) && Intrinsics.EZpvd((Object) this.topupActualMarginSz, (Object) contractGridReq.topupActualMarginSz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualMarginSz() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnnualizedRate() {
        return this.annualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAutoReserve() {
        return this.autoReserve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoTransfer() {
        return this.autoTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getBasePos() {
        return this.basePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBatchNo() {
        return this.batchNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractGridVersion() {
        return this.contractGridVersion;
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
    @Override // o.InterfaceC55792xqd
    public String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55792xqd
    public String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestType() {
        return this.investType;
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
    public final String getMinPx() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNmpUnderlyingId() {
        return this.nmpUnderlyingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenPosSlippage() {
        return this.openPosSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getOpenPosSlippageDefault() {
        return this.openPosSlippageDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdVariant() {
        return this.ordVariant;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingRatio() {
        return this.profitSharingRatio;
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
    public final String getSlOrdPx() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlRatio() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSystemSource() {
        return this.systemSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopupActualMarginSz() {
        return this.topupActualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrdPx() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpRatio() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVoucherId() {
        return this.voucherId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        int iHashCode2 = this.instType.hashCode();
        Boolean bool = this.basePos;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        int iHashCode4 = this.gridNum.hashCode();
        String str = this.investType;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.maxPx.hashCode();
        int iHashCode7 = this.minPx.hashCode();
        int iHashCode8 = this.sz.hashCode();
        String str2 = this.runType;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.slTriggerPx;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tpTriggerPx;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tpRatio;
        int iHashCode12 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.slRatio;
        int iHashCode13 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tpOrdPx;
        int iHashCode14 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.slOrdPx;
        int iHashCode15 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.direction;
        int iHashCode16 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.displayName;
        int iHashCode17 = str10 == null ? 0 : str10.hashCode();
        int iHashCode18 = this.lever.hashCode();
        int iHashCode19 = this.signParams.hashCode();
        int iHashCode20 = this.profitSharingRatio.hashCode();
        int iHashCode21 = this.ordType.hashCode();
        String str11 = this.annualizedRate;
        int iHashCode22 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.autoTransfer;
        int iHashCode23 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.systemSource;
        int iHashCode24 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.nmpUnderlyingId;
        int iHashCode25 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.batchNo;
        int iHashCode26 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.voucherId;
        int iHashCode27 = str16 == null ? 0 : str16.hashCode();
        Boolean bool2 = this.autoReserve;
        int iHashCode28 = bool2 == null ? 0 : bool2.hashCode();
        String str17 = this.actualMarginSz;
        int iHashCode29 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.extraMarginSz;
        int iHashCode30 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.contractGridVersion;
        int iHashCode31 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.openPosSlippage;
        int iHashCode32 = str20 == null ? 0 : str20.hashCode();
        Boolean bool3 = this.openPosSlippageDefault;
        int iHashCode33 = bool3 == null ? 0 : bool3.hashCode();
        String str21 = this.ordVariant;
        int iHashCode34 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.algoId;
        int iHashCode35 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.topupActualMarginSz;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + (str23 == null ? 0 : str23.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualMarginSz(String str) {
        this.actualMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(String str) {
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAnnualizedRate(String str) {
        this.annualizedRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoReserve(Boolean bool) {
        this.autoReserve = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoTransfer(String str) {
        this.autoTransfer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBasePos(Boolean bool) {
        this.basePos = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBatchNo(String str) {
        this.batchNo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractGridVersion(String str) {
        this.contractGridVersion = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(String str) {
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayName(String str) {
        this.displayName = str;
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
    public void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestType(String str) {
        this.investType = str;
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
    public final void setMinPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNmpUnderlyingId(String str) {
        this.nmpUnderlyingId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenPosSlippage(String str) {
        this.openPosSlippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenPosSlippageDefault(Boolean bool) {
        this.openPosSlippageDefault = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdVariant(String str) {
        this.ordVariant = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSharingRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.profitSharingRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRunType(String str) {
        this.runType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignParams(@NotNull ArrayList<AdvancedTriggerSign> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.signParams = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlOrdPx(String str) {
        this.slOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlRatio(String str) {
        this.slRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPx(String str) {
        this.slTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSystemSource(String str) {
        this.systemSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopupActualMarginSz(String str) {
        this.topupActualMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrdPx(String str) {
        this.tpOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpRatio(String str) {
        this.tpRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPx(String str) {
        this.tpTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVoucherId(String str) {
        this.voucherId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContractGridReq(instId=" + this.instId + ", instType=" + this.instType + ", basePos=" + this.basePos + ", gridNum=" + this.gridNum + ", investType=" + this.investType + ", maxPx=" + this.maxPx + ", minPx=" + this.minPx + ", sz=" + this.sz + ", runType=" + this.runType + ", slTriggerPx=" + this.slTriggerPx + ", tpTriggerPx=" + this.tpTriggerPx + ", tpRatio=" + this.tpRatio + ", slRatio=" + this.slRatio + ", tpOrdPx=" + this.tpOrdPx + ", slOrdPx=" + this.slOrdPx + ", direction=" + this.direction + ", displayName=" + this.displayName + ", lever=" + this.lever + ", signParams=" + this.signParams + ", profitSharingRatio=" + this.profitSharingRatio + ", ordType=" + this.ordType + ", annualizedRate=" + this.annualizedRate + ", autoTransfer=" + this.autoTransfer + ", systemSource=" + this.systemSource + ", nmpUnderlyingId=" + this.nmpUnderlyingId + ", batchNo=" + this.batchNo + ", voucherId=" + this.voucherId + ", autoReserve=" + this.autoReserve + ", actualMarginSz=" + this.actualMarginSz + ", extraMarginSz=" + this.extraMarginSz + ", contractGridVersion=" + this.contractGridVersion + ", openPosSlippage=" + this.openPosSlippage + ", openPosSlippageDefault=" + this.openPosSlippageDefault + ", ordVariant=" + this.ordVariant + ", algoId=" + this.algoId + ", topupActualMarginSz=" + this.topupActualMarginSz + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        Boolean bool = this.basePos;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.gridNum);
        parcel.writeString(this.investType);
        parcel.writeString(this.maxPx);
        parcel.writeString(this.minPx);
        parcel.writeString(this.sz);
        parcel.writeString(this.runType);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.tpRatio);
        parcel.writeString(this.slRatio);
        parcel.writeString(this.tpOrdPx);
        parcel.writeString(this.slOrdPx);
        parcel.writeString(this.direction);
        parcel.writeString(this.displayName);
        parcel.writeString(this.lever);
        ArrayList<AdvancedTriggerSign> arrayList = this.signParams;
        parcel.writeInt(arrayList.size());
        Iterator<AdvancedTriggerSign> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.profitSharingRatio);
        parcel.writeString(this.ordType);
        parcel.writeString(this.annualizedRate);
        parcel.writeString(this.autoTransfer);
        parcel.writeString(this.systemSource);
        parcel.writeString(this.nmpUnderlyingId);
        parcel.writeString(this.batchNo);
        parcel.writeString(this.voucherId);
        Boolean bool2 = this.autoReserve;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.actualMarginSz);
        parcel.writeString(this.extraMarginSz);
        parcel.writeString(this.contractGridVersion);
        parcel.writeString(this.openPosSlippage);
        Boolean bool3 = this.openPosSlippageDefault;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.ordVariant);
        parcel.writeString(this.algoId);
        parcel.writeString(this.topupActualMarginSz);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ContractGridReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContractGridReq> serializer() {
            return ContractGridReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContractGridReq(int i, int i2, String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ArrayList arrayList, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Boolean bool2, String str26, String str27, String str28, String str29, Boolean bool3, String str30, String str31, String str32, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.instType = "";
        } else {
            this.instType = str2;
        }
        if ((i & 4) == 0) {
            this.basePos = null;
        } else {
            this.basePos = bool;
        }
        if ((i & 8) == 0) {
            this.gridNum = "";
        } else {
            this.gridNum = str3;
        }
        if ((i & 16) == 0) {
            this.investType = null;
        } else {
            this.investType = str4;
        }
        if ((i & 32) == 0) {
            this.maxPx = "";
        } else {
            this.maxPx = str5;
        }
        if ((i & 64) == 0) {
            this.minPx = "";
        } else {
            this.minPx = str6;
        }
        if ((i & 128) == 0) {
            this.sz = "";
        } else {
            this.sz = str7;
        }
        if ((i & 256) == 0) {
            this.runType = null;
        } else {
            this.runType = str8;
        }
        if ((i & 512) == 0) {
            this.slTriggerPx = null;
        } else {
            this.slTriggerPx = str9;
        }
        if ((i & 1024) == 0) {
            this.tpTriggerPx = null;
        } else {
            this.tpTriggerPx = str10;
        }
        if ((i & 2048) == 0) {
            this.tpRatio = null;
        } else {
            this.tpRatio = str11;
        }
        if ((i & 4096) == 0) {
            this.slRatio = null;
        } else {
            this.slRatio = str12;
        }
        if ((i & 8192) == 0) {
            this.tpOrdPx = null;
        } else {
            this.tpOrdPx = str13;
        }
        if ((i & 16384) == 0) {
            this.slOrdPx = null;
        } else {
            this.slOrdPx = str14;
        }
        if ((32768 & i) == 0) {
            this.direction = null;
        } else {
            this.direction = str15;
        }
        if ((65536 & i) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str16;
        }
        if ((131072 & i) == 0) {
            this.lever = "";
        } else {
            this.lever = str17;
        }
        this.signParams = (262144 & i) == 0 ? new ArrayList() : arrayList;
        if ((524288 & i) == 0) {
            this.profitSharingRatio = "";
        } else {
            this.profitSharingRatio = str18;
        }
        if ((1048576 & i) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str19;
        }
        if ((2097152 & i) == 0) {
            this.annualizedRate = null;
        } else {
            this.annualizedRate = str20;
        }
        if ((4194304 & i) == 0) {
            this.autoTransfer = null;
        } else {
            this.autoTransfer = str21;
        }
        if ((8388608 & i) == 0) {
            this.systemSource = null;
        } else {
            this.systemSource = str22;
        }
        if ((16777216 & i) == 0) {
            this.nmpUnderlyingId = null;
        } else {
            this.nmpUnderlyingId = str23;
        }
        if ((33554432 & i) == 0) {
            this.batchNo = null;
        } else {
            this.batchNo = str24;
        }
        if ((67108864 & i) == 0) {
            this.voucherId = null;
        } else {
            this.voucherId = str25;
        }
        this.autoReserve = (134217728 & i) == 0 ? Boolean.TRUE : bool2;
        if ((268435456 & i) == 0) {
            this.actualMarginSz = null;
        } else {
            this.actualMarginSz = str26;
        }
        if ((536870912 & i) == 0) {
            this.extraMarginSz = null;
        } else {
            this.extraMarginSz = str27;
        }
        if ((1073741824 & i) == 0) {
            this.contractGridVersion = null;
        } else {
            this.contractGridVersion = str28;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.openPosSlippage = null;
        } else {
            this.openPosSlippage = str29;
        }
        this.openPosSlippageDefault = (i2 & 1) == 0 ? Boolean.TRUE : bool3;
        if ((i2 & 2) == 0) {
            this.ordVariant = null;
        } else {
            this.ordVariant = str30;
        }
        if ((i2 & 4) == 0) {
            this.algoId = null;
        } else {
            this.algoId = str31;
        }
        if ((i2 & 8) == 0) {
            this.topupActualMarginSz = null;
        } else {
            this.topupActualMarginSz = str32;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ContractGridReq contractGridReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) contractGridReq.getInstId(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, contractGridReq.getInstId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) contractGridReq.getInstType(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, contractGridReq.getInstType());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || contractGridReq.basePos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, contractGridReq.basePos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) contractGridReq.gridNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, contractGridReq.gridNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || contractGridReq.investType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, contractGridReq.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) contractGridReq.maxPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, contractGridReq.maxPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) contractGridReq.minPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, contractGridReq.minPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) contractGridReq.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, contractGridReq.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || contractGridReq.runType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, contractGridReq.runType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || contractGridReq.slTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, contractGridReq.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || contractGridReq.tpTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, contractGridReq.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || contractGridReq.tpRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, contractGridReq.tpRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || contractGridReq.slRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, contractGridReq.slRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || contractGridReq.tpOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, contractGridReq.tpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || contractGridReq.slOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, contractGridReq.slOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || contractGridReq.direction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, contractGridReq.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || contractGridReq.displayName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, contractGridReq.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) contractGridReq.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, contractGridReq.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd(contractGridReq.signParams, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], contractGridReq.signParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) contractGridReq.profitSharingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, contractGridReq.profitSharingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) contractGridReq.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, contractGridReq.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || contractGridReq.annualizedRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, contractGridReq.annualizedRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || contractGridReq.autoTransfer != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, contractGridReq.autoTransfer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || contractGridReq.systemSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, contractGridReq.systemSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || contractGridReq.nmpUnderlyingId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, contractGridReq.nmpUnderlyingId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || contractGridReq.batchNo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, contractGridReq.batchNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || contractGridReq.voucherId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, contractGridReq.voucherId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd(contractGridReq.autoReserve, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, BooleanSerializer.INSTANCE, contractGridReq.autoReserve);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || contractGridReq.actualMarginSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, contractGridReq.actualMarginSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || contractGridReq.extraMarginSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, contractGridReq.extraMarginSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || contractGridReq.contractGridVersion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, contractGridReq.contractGridVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || contractGridReq.openPosSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, contractGridReq.openPosSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd(contractGridReq.openPosSlippageDefault, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, BooleanSerializer.INSTANCE, contractGridReq.openPosSlippageDefault);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || contractGridReq.ordVariant != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, StringSerializer.INSTANCE, contractGridReq.ordVariant);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || contractGridReq.algoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, StringSerializer.INSTANCE, contractGridReq.algoId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) && contractGridReq.topupActualMarginSz == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, contractGridReq.topupActualMarginSz);
    }

    public ContractGridReq(@NotNull String str, @NotNull String str2, Boolean bool, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, @NotNull String str17, @NotNull ArrayList<AdvancedTriggerSign> arrayList, @NotNull String str18, @NotNull String str19, String str20, String str21, String str22, String str23, String str24, String str25, Boolean bool2, String str26, String str27, String str28, String str29, Boolean bool3, String str30, String str31, String str32) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        this.instId = str;
        this.instType = str2;
        this.basePos = bool;
        this.gridNum = str3;
        this.investType = str4;
        this.maxPx = str5;
        this.minPx = str6;
        this.sz = str7;
        this.runType = str8;
        this.slTriggerPx = str9;
        this.tpTriggerPx = str10;
        this.tpRatio = str11;
        this.slRatio = str12;
        this.tpOrdPx = str13;
        this.slOrdPx = str14;
        this.direction = str15;
        this.displayName = str16;
        this.lever = str17;
        this.signParams = arrayList;
        this.profitSharingRatio = str18;
        this.ordType = str19;
        this.annualizedRate = str20;
        this.autoTransfer = str21;
        this.systemSource = str22;
        this.nmpUnderlyingId = str23;
        this.batchNo = str24;
        this.voucherId = str25;
        this.autoReserve = bool2;
        this.actualMarginSz = str26;
        this.extraMarginSz = str27;
        this.contractGridVersion = str28;
        this.openPosSlippage = str29;
        this.openPosSlippageDefault = bool3;
        this.ordVariant = str30;
        this.algoId = str31;
        this.topupActualMarginSz = str32;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01aa: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r73v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r73v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r73v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r39v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r73v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r73v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r73v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r73v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r73v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r73v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r73v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r73v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r73v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r73v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r73v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r73v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0081: ARITH (r73v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008c: ARITH (r73v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0097: ARITH (r73v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x00a2: ARITH (r73v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a8: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:426) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r55v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b0: ARITH (r73v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r73v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r73v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r73v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dc: ARITH (r73v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r73v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r73v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fd: ARITH (r73v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0108: ARITH (r73v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x010c: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r64v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0113: ARITH (r73v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011e: ARITH (r73v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0129: ARITH (r73v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0134: ARITH (r73v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r68v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x013c: ARITH (r74v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0140: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r69v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0145: ARITH (r74v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014e: ARITH (r74v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0157: ARITH (r74v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r72v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.AdvancedTriggerSign>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:407) call: com.okinc.unify_trade.biz.ContractGridReq.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ContractGridReq(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ArrayList arrayList, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Boolean bool2, String str26, String str27, String str28, String str29, Boolean bool3, String str30, String str31, String str32, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? "" : str17, (i & 262144) != 0 ? new ArrayList() : arrayList, (i & 524288) != 0 ? "" : str18, (i & 1048576) != 0 ? "" : str19, (i & 2097152) != 0 ? null : str20, (i & 4194304) != 0 ? null : str21, (i & 8388608) != 0 ? null : str22, (i & 16777216) != 0 ? null : str23, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str24, (i & 67108864) != 0 ? null : str25, (i & 134217728) != 0 ? Boolean.TRUE : bool2, (i & 268435456) != 0 ? null : str26, (i & 536870912) != 0 ? null : str27, (i & 1073741824) != 0 ? null : str28, (i & Integer.MIN_VALUE) != 0 ? null : str29, (i2 & 1) != 0 ? Boolean.TRUE : bool3, (i2 & 2) != 0 ? null : str30, (i2 & 4) != 0 ? null : str31, (i2 & 8) != 0 ? null : str32);
    }
}
